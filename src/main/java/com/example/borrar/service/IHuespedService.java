package com.example.borrar.service;

import java.util.List;

public interface IHuespedService<T, ID> {

    List<T> findAll();
    T findById(ID id);

    T save(T t);

    T update(ID id, T t);

    void delete(ID id);
}
