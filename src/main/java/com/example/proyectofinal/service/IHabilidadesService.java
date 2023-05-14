/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Habilidades;
import java.util.List;

/**
 *
 * @author Samsung
 */
public interface IHabilidadesService {
        
    public List<Habilidades> getHabilidades();
    
    public void saveHabilidad (Habilidades titu);
    
    public void deleteHabilidad (Long id);
    
    public Habilidades findHabilidad (Long id);
    
}
