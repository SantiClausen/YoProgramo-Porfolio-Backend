/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectofinal.service;
import java.util.List;
import com.example.proyectofinal.model.Trabajo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.proyectofinal.repository.TrabajoRepository;
import org.springframework.stereotype.Service;
/**
 *
 * @author Samsung
 */
@Service
public class TrabajoService implements ITrabajoService{
    @Autowired
    private TrabajoRepository trabajoRepository;
    
    @Override
    public List<Trabajo> getTrabajos(){
        List<Trabajo> listaTrabajos = trabajoRepository.findAll();
        return listaTrabajos;
    }
    
    @Override
    public void saveTrabajo(Trabajo trab){
        trabajoRepository.save(trab);
    }
    
    @Override
    public void deleteTrabajo(Long id){
        trabajoRepository.deleteById(id);
    }
    
    @Override
    public Trabajo findTrabajo(Long id) {
        Trabajo trab = trabajoRepository.findById(id).orElse(null);
        return trab;
    }
    
}
