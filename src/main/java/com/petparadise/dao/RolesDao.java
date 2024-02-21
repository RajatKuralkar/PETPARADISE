package com.petparadise.dao;

import com.petparadise.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesDao extends JpaRepository<Roles, Long> {
}
