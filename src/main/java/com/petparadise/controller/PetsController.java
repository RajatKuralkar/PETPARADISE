package com.petparadise.controller;

import com.petparadise.dto.PetsDTO;
import com.petparadise.entities.Pets;
import com.petparadise.service.PetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Default Controller for Products
@RestController
@RequestMapping(path = "/pets")
@CrossOrigin(origins = "http://localhost:3000")
public class PetsController {

    @Autowired
    private PetsService productsservice;


    @GetMapping("/display")
    public List<Pets> displayAllProducts(){
        return productsservice.displayAllProducts();
    }


    @DeleteMapping("/delete/petid/{pid}")
    public String deleteProducts(@PathVariable Long pid){
       return productsservice.deleteProducts(pid);
    }

    @PostMapping("/add")
    public Pets addProducts(@RequestBody PetsDTO prdt){
        return productsservice.addProducts(prdt);
    }

    @PutMapping("/update")
    public Pets updateProducts(@RequestBody Pets prdt){
        return productsservice.updateProducts(prdt);
    }

    @GetMapping("/display/{pid}")
    public Pets displayById(@PathVariable Long pid){
        return productsservice.displayById(pid);
    }
}
