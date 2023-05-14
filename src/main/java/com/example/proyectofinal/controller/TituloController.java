/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectofinal.controller;
import com.example.proyectofinal.model.Titulo;
import com.example.proyectofinal.service.ITituloService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Samsung
 */
@RestController
public class TituloController {
    
    @Autowired
    private ITituloService interTitulo;
    
    
    @GetMapping ("/titulos/traer")
    public List<Titulo> getTitulos(){
        return interTitulo.getTitulos();
    }
    
    @PostMapping ("/titulos/crear")
    public String createTitulos(@RequestBody Titulo titu) {
        interTitulo.saveTitulo(titu);
        return "El titulo fue creado correctamente";
    }
    
    @DeleteMapping ("/titulos/borrar/{id}")
    public String deleteTitulo (@PathVariable Long id) {
        interTitulo.deleteTitulo(id);
        return "El titulo fue eliminado correctamente";
    }
    
    @PutMapping ("/titulos/editar/{id}")
    public Titulo editTitulo (@PathVariable Long id, 
                                @RequestParam ("nombre_titulo") String nuevoNombreTitulo, 
                                @RequestParam ("fecha_acreditacion") Date nuevaFecha, 
                                @RequestParam ("entidad") String nuevaEntidad){
        
        Titulo titu = interTitulo.findTitulo(id);
        titu.setNombre_titulo(nuevoNombreTitulo);
        titu.setFecha_acreditacion(nuevaFecha);
        titu.setEntidad(nuevaEntidad);

        interTitulo.saveTitulo(titu);
        return titu;
    }
    
}
