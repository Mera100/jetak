package life.majd.jetak.jetak.service;

import life.majd.jetak.jetak.domain.Business;
import life.majd.jetak.jetak.domain.Product;

import java.util.List;

public interface BusinessService {
    Business saveBusiness(Business business);

    Business getBusiness(String name);

    Business addOwner(String businessName, String ownerName);

    List<Business> getBusinesses();

    List<Business> getBusinessesByOwner(String name);

    Product saveProduct(Product product, Business business);

    List<Product> saveProducts(List<Product> products, Business business);

    Product deleteProduct(String productName);

    Product editProduct(Product product);

}
