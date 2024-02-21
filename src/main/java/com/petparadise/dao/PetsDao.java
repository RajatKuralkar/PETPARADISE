package com.petparadise.dao;

import com.petparadise.entities.Pets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PetsDao extends JpaRepository<Pets, Long> {
    @Query("select p from Pets p where p.petType is not null")
    List<Pets> findAllProductsNonValues();
}
