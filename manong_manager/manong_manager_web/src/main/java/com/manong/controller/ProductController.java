package com.manong.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @RequestMapping("product_list")
    public String listProduct(){
        return "product_list";
    }
}
