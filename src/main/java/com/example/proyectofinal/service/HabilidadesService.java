/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectofinal.service;
import com.example.proyectofinal.model.Habilidades;
import com.example.proyectofinal.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Samsung
 */
@Service
public class HabilidadesService implements IHabilidadesService {
    
    @Autowired
    private HabilidadesRepository habRepository;
    
    @Override
    public List<Habilidades> getHabilidades(){
        List<Habilidades> listaHabilidades = habRepository.findAll();
        return listaHabilidades;
    }
    
    @Override
    public void saveHabilidad(Habilidades hab){
        habRepository.save(hab);
    }
    
    @Override
    public void deleteHabilidad(Long id){
        habRepository.deleteById(id);
    }
    
    @Override
    public Habilidades findHabilidad(Long id) {
        Habilidades hab = habRepository.findById(id).orElse(null);
        return hab;
    }
    
}
