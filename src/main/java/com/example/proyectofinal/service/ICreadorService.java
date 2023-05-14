/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectofinal.service;

import java.util.List;
import com.example.proyectofinal.model.Creador;

/**
 *
 * @author Samsung
 */

public interface ICreadorService {
    
    public List<Creador> getPersonas();
    
    public void savePersona (Creador perso);
    
    public void deletePersona (Long id);
    
    public Creador findPersona (Long id);
    
}
