/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Trabajo;
import java.util.List;

/**
 *
 * @author Samsung
 */
public interface ITrabajoService {
    
    public List<Trabajo> getTrabajos();
    
    public void saveTrabajo (Trabajo trab);
    
    public void deleteTrabajo (Long id);
    
    public Trabajo findTrabajo (Long id);
    
}
