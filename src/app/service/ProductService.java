package app.service;

import app.dao.*;
import app.db.ConnectionDB;
import app.model.Product;

import java.sql.Connection;
import java.util.List;

public class ProductService {

    private ProductDao dao;

    public ProductService() throws Exception {
        Connection conn = ConnectionDB.getConnection();
        dao = new MySQLProductDao(conn);
    }

    public void add(Product p) throws Exception {
        dao.insert(p);
    }

    public List<Product> getAll() throws Exception {
        return dao.getAll();
    }
    public Product getById(Long id) throws Exception {
    return dao.getById(id);
    }

    public void update(Product p) throws Exception {
    dao.update(p);
    }

    public void delete(Long id) throws Exception {
    dao.delete(id);
    }
}
