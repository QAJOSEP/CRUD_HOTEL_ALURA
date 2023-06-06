package com.example.borrar.service;

import com.example.borrar.model.Huesped;
import com.example.borrar.repository.IHuespedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HuespedServiceImpl implements IHuespedService<Huesped,Integer> {

    @Autowired
    private IHuespedRepo repository;

    @Override
    public List<Huesped> findAll() {
        return repository.findAll();
    }

    @Override
    public Huesped findById(Integer id) {
        return repository.findById(id).orElseThrow(null);
    }

    @Override
    public Huesped save(Huesped huesped) {
        return repository.save(huesped);
    }

    @Override
    public Huesped update(Integer id, Huesped huesped) {
        huesped.setId(id);
        return repository.save(huesped);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
