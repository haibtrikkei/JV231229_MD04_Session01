package com.rikkeiacademy.demo_springboot.controller;

import com.rikkeiacademy.demo_springboot.model.entity.Category;
import com.rikkeiacademy.demo_springboot.model.entity.Product;
import com.rikkeiacademy.demo_springboot.service.CategoryService;
import com.rikkeiacademy.demo_springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String index(Model model){
        List<Product> list = productService.getProducts();
        model.addAttribute("list",list);
        return "product/index";
    }

    @GetMapping("/add")
    public String addProduct(Model model){
        List<Category> listCate = categoryService.findAll();
        Product p = new Product();
        model.addAttribute("listCate",listCate);
        model.addAttribute("p",p);
        return "product/add";
    }

    @PostMapping("/add")
    public String saveProduct(@ModelAttribute Product product, Model model){
        Product p = productService.insertProduct(product);
        if(p!=null){
            return "redirect:/product";
        }else {
            List<Category> listCate = categoryService.findAll();
            model.addAttribute("listCate", listCate);
            model.addAttribute("p", p);
            return "product/add";
        }
    }
}
