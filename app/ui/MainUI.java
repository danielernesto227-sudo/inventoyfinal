package app.ui;

import app.service.ProductService;
import app.model.Product;

import javax.swing.*;
import java.awt.BorderLayout;
import java.util.List;

public class MainUI extends JFrame {

    private ProductService service;
    private JTextArea area;

    public MainUI() throws Exception {
        service = new ProductService();

        setTitle("Sistema Inventario");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        area = new JTextArea();
        add(new JScrollPane(area), BorderLayout.CENTER);

       JButton btnAdd = new JButton("Agregar");
        JButton btnList = new JButton("Listar");
        JButton btnBuscar = new JButton("Buscar ID");
        JButton btnUpdate = new JButton("Actualizar");
        JButton btnDelete = new JButton("Eliminar");

    btnAdd.addActionListener(e -> agregar());
    btnList.addActionListener(e -> listar());
    btnBuscar.addActionListener(e -> buscar());
    btnUpdate.addActionListener(e -> actualizar());
    btnDelete.addActionListener(e -> eliminar());

    JPanel panel = new JPanel();
    panel.add(btnAdd);
    panel.add(btnList);
    panel.add(btnBuscar);
    panel.add(btnUpdate);
    panel.add(btnDelete);
    add(panel, BorderLayout.NORTH);
    add(new JScrollPane(area), BorderLayout.CENTER);
    }

    private void agregar() {
        try {
            service.add(new Product(null, "Producto UI", 10.0, 5, "General"));
            JOptionPane.showMessageDialog(this, "Producto agregado");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void listar() {
        try {
            List<Product> lista = service.getAll();
            area.setText("");
            for (Product p : lista) {
                area.append(p.getName() + " - $" + p.getPrice() + "\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void buscar() {
    try {
        String input = JOptionPane.showInputDialog("ID:");
        Long id = Long.parseLong(input);

        Product p = service.getById(id);

        if (p != null) {
            area.setText(p.getName() + " - $" + p.getPrice());
        } else {
            area.setText("No encontrado");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
   }
   private void actualizar() {
    try {
        String input = JOptionPane.showInputDialog("ID a actualizar:");
        Long id = Long.parseLong(input);        

        service.update(new Product(id, "Actualizado", 99.9, 10, "Edit"));

        JOptionPane.showMessageDialog(this, "Actualizado");

    } catch (Exception e) {
        e.printStackTrace();
    }
  }
  private void eliminar() {
    try {
        String input = JOptionPane.showInputDialog("ID a eliminar:");
        Long id = Long.parseLong(input);

        service.delete(id);

        JOptionPane.showMessageDialog(this, "Eliminado");

    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
