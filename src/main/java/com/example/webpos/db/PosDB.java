package com.example.webpos.db;

import com.example.webpos.model.Cart;
import com.example.webpos.model.Product;

import java.util.List;

public interface PosDB {

    public List<Product> getProducts();

    public Product getProduct(String productId);

}
