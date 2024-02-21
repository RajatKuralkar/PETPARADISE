package com.petparadise.dao;

import com.petparadise.entities.Types;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypesDao extends JpaRepository<Types, Long> {
}
