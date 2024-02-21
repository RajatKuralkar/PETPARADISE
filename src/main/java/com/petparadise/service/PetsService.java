package com.petparadise.service;


import com.petparadise.dto.PetsDTO;
import com.petparadise.entities.Pets;

import java.util.List;

public interface PetsService {

    List<Pets> displayAllProducts();

    String deleteProducts(Long pid);

    Pets addProducts(PetsDTO prdt);

    Pets updateProducts(Pets prdt);

    Pets displayById(Long pid);

}
