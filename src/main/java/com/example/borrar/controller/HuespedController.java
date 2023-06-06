package com.example.borrar.controller;

import com.example.borrar.model.Huesped;
import com.example.borrar.service.HuespedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/huespedes")
public class HuespedController {

    @Autowired
    private HuespedServiceImpl service;

    @GetMapping
    public List<Huesped> listarTodos(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Huesped listarPorId(@PathVariable Integer id){
        return service.findById(id);
    }


    @PostMapping
    public Huesped guardar(@RequestBody Huesped huesped){
        return service.save(huesped);
    }

    @PutMapping("/{id}")
    public Huesped actualizar(@RequestBody Huesped huesped, @PathVariable Integer id){
        huesped.setId(id);
        return service.save(huesped);
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Integer id){
        service.delete(id);
    }
}
