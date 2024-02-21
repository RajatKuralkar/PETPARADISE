package com.petparadise.controller;

import com.petparadise.dto.RolesDTO;
import com.petparadise.entities.Roles;
import com.petparadise.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
@CrossOrigin(origins = "http://localhost:3000")
public class RolesController {

    @Autowired
    private RolesService rolesservice;

    @GetMapping("/display")
    public List<Roles> displayAllRoles(){
        return rolesservice.displayAllRoles();
    }

    @DeleteMapping("/delete/{rid}")
    public String deleteRoles(@PathVariable Long rid){
        return rolesservice.deleteRoles(rid);
    }

    @PostMapping("/add")
    public Roles addRoles(@RequestBody RolesDTO role){
        return rolesservice.addRoles(role);
    }

    @PutMapping("/update")
    public Roles updateRoles(@RequestBody Roles role){
        return rolesservice.updateRoles(role);
    }

}
