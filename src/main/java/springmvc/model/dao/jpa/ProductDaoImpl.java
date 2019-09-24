package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Product;
import springmvc.model.dao.ProductDao;

@Repository
public class ProductDaoImpl implements ProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Product getProduct(Integer id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public List<Product> getProducts() {
        return entityManager.createQuery("from Product", Product.class)
                .getResultList();
    }

    @Override
    @Transactional
    public Product saveProduct(Product product) {
        return entityManager.merge(product);
    }
}
