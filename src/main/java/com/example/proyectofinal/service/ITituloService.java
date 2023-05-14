/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Titulo;
import java.util.List;

/**
 *
 * @author Samsung
 */
public interface ITituloService {
        
    public List<Titulo> getTitulos();
    
    public void saveTitulo (Titulo titu);
    
    public void deleteTitulo (Long id);
    
    public Titulo findTitulo (Long id);
    
    
}
