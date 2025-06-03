package com.lite.app.ms_mz_productos.infra.rest;

import com.lite.app.ms_mz_productos.domain.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lite.app.ms_mz_productos.domain.Product;

@RestController
public class ProductController {

  private static final Logger log = LoggerFactory.getLogger(ProductController.class);


  @GetMapping("/products")
  public Product getProducts(){

        Product product = new Product("1", "Product 1", "description");
    Log logBean = new Log(product.getId(), product.getName());
    log.info(null, logBean.getValues());

    return product;



  }
}
