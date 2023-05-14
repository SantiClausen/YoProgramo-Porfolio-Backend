/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Educacion;
import java.util.List;

/**
 *
 * @author Samsung
 */
public interface IEducacionService {
    
    public List<Educacion> getEducaciones();
    
    public void saveEducacion (Educacion edu);
    
    public void deleteEducacion (Long id);
    
    public Educacion findEducacion (Long id);
}
