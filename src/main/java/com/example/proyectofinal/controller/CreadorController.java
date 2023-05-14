/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectofinal.controller;

import java.util.List;
import com.example.proyectofinal.model.Creador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.proyectofinal.service.ICreadorService;


/**
 *
 * @author Samsung
 */

@RestController
public class CreadorController {
    
    @Autowired
    private ICreadorService interPersona;
    
    @GetMapping ("/personas/traer")
    public List<Creador> getPersonas(){
        return interPersona.getPersonas();
    }
    
    @PostMapping ("/personas/crear")
    public String createPersona(@RequestBody Creador perso) {
        interPersona.savePersona(perso);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona (@PathVariable Long id) {
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping ("/personas/editar/{id}")
    public Creador editPersona (@PathVariable Long id, 
                                @RequestParam ("nombre") String nuevoNombre, 
                                @RequestParam ("apellido") String nuevoApellido, 
                                @RequestParam ("correo") String nuevoCorreo,
                                @RequestParam ("telefono") int nuevoTelefono){
        
        Creador perso = interPersona.findPersona(id);
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setCorreo(nuevoCorreo);
        perso.setTelefono(nuevoTelefono);
        interPersona.savePersona(perso);
        return perso;
    }
    
}
