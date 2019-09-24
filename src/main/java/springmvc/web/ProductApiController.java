package springmvc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springmvc.model.Product;
import springmvc.model.dao.ProductDao;

@RestController
public class ProductApiController {

    @Autowired
    private ProductDao productDao;

    @GetMapping("/products")
    public List<Product> products(ModelMap models) {
        return productDao.getProducts();
    }
}
