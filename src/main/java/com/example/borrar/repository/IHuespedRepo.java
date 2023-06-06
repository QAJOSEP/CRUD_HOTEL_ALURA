package com.example.borrar.repository;

import com.example.borrar.model.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHuespedRepo extends JpaRepository<Huesped,Integer> {
}
