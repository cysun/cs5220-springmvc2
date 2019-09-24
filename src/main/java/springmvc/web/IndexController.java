package springmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.model.dao.ProductDao;

@Controller
public class IndexController {

    @Autowired
    private ProductDao productDao;

    @RequestMapping("/index.html")
    public String index(ModelMap models) {
        models.put("products", productDao.getProducts());
        return "index";
    }
}
