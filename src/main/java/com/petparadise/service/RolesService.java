package com.petparadise.service;



import com.petparadise.dto.RolesDTO;
import com.petparadise.entities.Roles;

import javax.management.relation.Role;
import java.util.List;

public interface RolesService {

    List<Roles> displayAllRoles();

    String deleteRoles(Long rid);

    Roles addRoles(RolesDTO role);

    Roles updateRoles(Roles role);

}
