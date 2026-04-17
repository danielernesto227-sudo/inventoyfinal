package app.dao;

import java.util.List;
import app.model.Product;

public interface ProductDao {
    void insert(Product p) throws Exception;
    List<Product> getAll() throws Exception;
    Product getById(Long id) throws Exception;
    void update(Product p) throws Exception;
    void delete(Long id) throws Exception;
}
