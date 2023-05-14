/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Educacion;
import com.example.proyectofinal.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Samsung
 */
@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    private EducacionRepository eduRepository;
    
    @Override
    public List<Educacion> getEducaciones(){
        List<Educacion> listaEducaciones = eduRepository.findAll();
        return listaEducaciones;
    }
    
    @Override
    public void saveEducacion(Educacion edu){
        eduRepository.save(edu);
    }
    
    @Override
    public void deleteEducacion(Long id){
        eduRepository.deleteById(id);
    }
    
    @Override
    public Educacion findEducacion(Long id) {
        Educacion edu = eduRepository.findById(id).orElse(null);
        return edu;
    }
    
}
