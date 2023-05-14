/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectofinal.service;

import java.util.List;
import com.example.proyectofinal.model.Titulo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.proyectofinal.repository.TituloRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Samsung
 */
@Service
public class TituloService implements ITituloService{
    
    @Autowired
    private TituloRepository tituloRepository;
    
    @Override
    public List<Titulo> getTitulos(){
        List<Titulo> listaTitulos = tituloRepository.findAll();
        return listaTitulos;
    }
    
    @Override
    public void saveTitulo(Titulo titu){
        tituloRepository.save(titu);
    }
    
    @Override
    public void deleteTitulo(Long id){
        tituloRepository.deleteById(id);
    }
    
    @Override
    public Titulo findTitulo(Long id) {
        Titulo titu = tituloRepository.findById(id).orElse(null);
        return titu;
    }
    
}
