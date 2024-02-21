package com.petparadise.service;

import com.petparadise.dao.RolesDao;
import com.petparadise.dto.RolesDTO;
import com.petparadise.entities.Roles;
import com.petparadise.dto.RolesDTO;
import com.petparadise.entities.Roles;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RolesServiceImpl implements RolesService{

    @Autowired
    private RolesDao rolesdao;

    @Autowired
    ModelMapper modelmapper;

    @Override
    public List<Roles> displayAllRoles() {
        return rolesdao.findAll();
    }

    @Override
    public String deleteRoles(Long rid) {
        if(rolesdao.existsById(rid)){
            rolesdao.deleteById(rid);
            return "User Role deleted of id  : "+rid;
        }
        return "Enter valid Role Id.";
    }

//    @Override
//    public Roles addRoles(RolesDTO role) {
//        return null;
//    }

    @Override
    public Roles addRoles(RolesDTO role) {
        Roles r=modelmapper.map(role, Roles.class);
        return rolesdao.save(r);
    }

    @Override
    public Roles updateRoles(Roles role) {
        return rolesdao.save(role);
    }

}
