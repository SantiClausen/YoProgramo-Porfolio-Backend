/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectofinal.service;

import java.util.List;
import com.example.proyectofinal.model.Creador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.proyectofinal.repository.CreadorRepository;

/**
 *
 * @author Samsung
 */
@Service
public class CreadorService implements ICreadorService{
    
    @Autowired
    private CreadorRepository persoRepository;
    
    @Override
    public List<Creador> getPersonas(){
        List<Creador> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }
    
    @Override
    public void savePersona(Creador perso){
        persoRepository.save(perso);
    }
    
    @Override
    public void deletePersona(Long id){
        persoRepository.deleteById(id);
    }
    
    @Override
    public Creador findPersona(Long id) {
        Creador perso = persoRepository.findById(id).orElse(null);
        return perso;
    }
}
