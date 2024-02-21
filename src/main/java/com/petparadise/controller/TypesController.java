package com.petparadise.controller;

import com.petparadise.dto.TypesDTO;
import com.petparadise.entities.Types;
import com.petparadise.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/type")
@CrossOrigin(origins = "http://localhost:3000")
public class TypesController {

    @Autowired
    private TypesService typesservice;

    @GetMapping("/display")
    public List<Types> displayAllTypes(){
        return typesservice.displayAllTypes();
    }

    @DeleteMapping("/delete/{tid}")
    public String deleteTypes(@PathVariable Long tid){
        return typesservice.deleteTypes(tid);
    }

    @PostMapping("/add")
    public Types addTypes(@RequestBody TypesDTO typ){
        return typesservice.addTypes(typ);
    }

    @PutMapping("/update")
    public Types updateTypes(@RequestBody Types typ){
        return typesservice.updateTypes(typ);
    }

}
