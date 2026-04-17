package app.dao;

import java.sql.*;
import java.util.*;
import app.model.Product;

public class MySQLProductDao implements ProductDao {

    private Connection conn;

    public MySQLProductDao(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Product p) throws Exception {
        String sql = "INSERT INTO products(name,price,quantity,category) VALUES (?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, p.getName());
        stmt.setDouble(2, p.getPrice());
        stmt.setInt(3, p.getQuantity());
        stmt.setString(4, p.getCategory());
        stmt.executeUpdate();
    }

    @Override
    public List<Product> getAll() throws Exception {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            list.add(new Product(
                rs.getLong("Id_PRODUCT"),
                rs.getString("NAME"),
                rs.getDouble("PRICE"),
                rs.getInt("QUANTITY"),
                rs.getString("CATEGORY")
            ));
        }
        return list;
    }
    @Override
public Product getById(Long id) throws Exception {
    String sql = "SELECT * FROM products WHERE id=?";
    PreparedStatement stmt = conn.prepareStatement(sql);
    stmt.setLong(1, id);
    ResultSet rs = stmt.executeQuery();

    if (rs.next()) {
        return new Product(
            rs.getLong("id"),
            rs.getString("name"),
            rs.getDouble("price"),
            rs.getInt("quantity"),
            rs.getString("category")
        );
    }
    return null;
}
@Override
public void update(Product p) throws Exception {
    String sql = "UPDATE products SET name=?, price=?, quantity=?, category=? WHERE id=?";
    PreparedStatement stmt = conn.prepareStatement(sql);
    stmt.setString(1, p.getName());
    stmt.setDouble(2, p.getPrice());
    stmt.setInt(3, p.getQuantity());
    stmt.setString(4, p.getCategory());
    stmt.setLong(5, p.getId());
    stmt.executeUpdate();
}
@Override
public void delete(Long id) throws Exception {
    String sql = "DELETE FROM products WHERE id=?";
    PreparedStatement stmt = conn.prepareStatement(sql);
    stmt.setLong(1, id);
    stmt.executeUpdate();
}
}
