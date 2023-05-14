/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectofinal.controller;
import com.example.proyectofinal.model.Habilidades;
import com.example.proyectofinal.service.IHabilidadesService;
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
public class HabilidadesController {
    @Autowired
    private IHabilidadesService interHabilidades;
    
    @GetMapping ("/habilidades/traer")
    public List<Habilidades> getHabilidades(){
        return interHabilidades.getHabilidades();
    }
    
    @PostMapping ("/habilidades/crear")
    public String createHabilidad(@RequestBody Habilidades hab) {
        interHabilidades.saveHabilidad(hab);
        return "La habilidad fue creada correctamente";
    }
    
    @DeleteMapping ("/habilidades/borrar/{id}")
    public String deleteHabilidad (@PathVariable Long id) {
        interHabilidades.deleteHabilidad(id);
        return "La habilidad fue eliminada correctamente";
    }
    
    @PutMapping ("/habilidades/editar/{id}")
    public Habilidades editHabilidad (@PathVariable Long id, 
                                @RequestParam ("nombre_habilidad") String nuevoNombre_habilidad, 
                                @RequestParam ("grado_conocimiento") String nuevoGrado_conocimiento){
        
        Habilidades hab = interHabilidades.findHabilidad(id);
        hab.setNombre_habilidad(nuevoNombre_habilidad);
        hab.setGrado_conocimiento(nuevoGrado_conocimiento);
        interHabilidades.saveHabilidad(hab);
        return hab;
    }
}
