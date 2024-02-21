package com.petparadise.service;

import com.petparadise.dao.PetsDao;
import com.petparadise.dao.TypesDao;
import com.petparadise.dto.PetsDTO;
import com.petparadise.entities.Pets;
import com.petparadise.entities.Types;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PetsServiceImpl implements PetsService {

    @Autowired
    private PetsDao productsdao;

    @Autowired
    private TypesDao typesdao;

    @Autowired
    ModelMapper modelmapper;

    @Override
    public List<Pets> displayAllProducts() {
        return productsdao.findAllProductsNonValues();
    }

    @Override
    public String deleteProducts(Long pid) {
        Pets pets=new Pets();
        pets.setPetId(pid);
        productsdao.delete(pets);
        return "Product deleted with id : "+pid;
    }

    @Override
    public Pets addProducts(PetsDTO prdt) {
        Types t=typesdao.findById(prdt.getPetId()).orElseThrow();
        Pets p=modelmapper.map(prdt,Pets.class);
        if(t!=null){
            t.addProducts(p);
            p.setTypes(t);
        }
        return productsdao.save(p);
    }

    @Override
    public Pets updateProducts(Pets prdt) {
        return productsdao.save(prdt);
    }


    @Override
    public Pets displayById(Long pid) {
        Pets p=productsdao.findById(pid).orElseThrow();
        return p;
    }



}
