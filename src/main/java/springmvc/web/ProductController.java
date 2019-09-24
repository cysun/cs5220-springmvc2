package springmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.Product;
import springmvc.model.dao.ProductDao;

@Controller
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @RequestMapping("/view.html")
    public String view1(ModelMap models, @RequestParam Integer id) {
        models.put("product", productDao.getProduct(id));
        return "view";
    }

    @RequestMapping("/products/{id}.html")
    public String view2(ModelMap models, @PathVariable Integer id) {
        models.put("product", productDao.getProduct(id));
        return "view";
    }

    @PostMapping("add.html")
    public String add(Product product) {
        productDao.saveProduct(product);
        return "redirect:index.html";
    }
}
