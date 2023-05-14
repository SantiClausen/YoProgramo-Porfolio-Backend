/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectofinal.controller;
import com.example.proyectofinal.model.Educacion;
import com.example.proyectofinal.service.IEducacionService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 *
 * @author Samsung
 */
@RestController
public class EducacionController {
    @Autowired
    private IEducacionService interEducacion;
    
    @GetMapping ("/educacion/traer")
    public List<Educacion> getEducaciones(){
        return interEducacion.getEducaciones();
    }
    
    @PostMapping ("/educacion/crear")
    public String createEducacion(@RequestBody Educacion edu) {
        interEducacion.saveEducacion(edu);
        return "La educacion fue creada correctamente";
    }
    
    @DeleteMapping ("/educacion/borrar/{id}")
    public String deleteEducacion (@PathVariable Long id) {
        interEducacion.deleteEducacion(id);
        return "La educacion fue eliminada correctamente";
    }
    
    @PutMapping ("/educacion/editar/{id}")
    public Educacion editEducacion (@PathVariable Long id, 
                                @RequestParam ("nombre_educacion") String nuevoNombre_educacion, 
                                @RequestParam ("lugar_educacion") String nuevoLugar_educacion, 
                                @RequestParam ("ultima_fecha") Date nuevaUltima_fecha,
                                @RequestParam ("estado") String nuevoEstado){
        
        Educacion edu = interEducacion.findEducacion(id);
        edu.setNombre_educacion(nuevoNombre_educacion);
        edu.setLugar_educacion(nuevoLugar_educacion);
        edu.setUltima_fecha(nuevaUltima_fecha);
        edu.setEstado(nuevoEstado);
        interEducacion.saveEducacion(edu);
        return edu;
    }
}
