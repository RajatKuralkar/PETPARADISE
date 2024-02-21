package com.petparadise.service;


import com.petparadise.dto.TypesDTO;
import com.petparadise.entities.Types;

import java.util.List;

public interface TypesService {

    List<Types> displayAllTypes();

    String deleteTypes(Long tid);

    Types addTypes(TypesDTO typ);

    Types updateTypes(Types types);
}
