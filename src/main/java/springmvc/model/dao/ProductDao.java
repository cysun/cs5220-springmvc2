package springmvc.model.dao;

import java.util.List;

import springmvc.model.Product;

public interface ProductDao {

    Product getProduct(Integer id);

    List<Product> getProducts();

    Product saveProduct(Product product);
}
