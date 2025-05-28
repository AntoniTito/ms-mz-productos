package com.lite.ms_mz_productos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


  @GetMapping("/products")
  public Product getProducts(){

    return new Product("1", "Product 1", "Description 1");
  }


}
