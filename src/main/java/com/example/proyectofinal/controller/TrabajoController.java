/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectofinal.controller;
import com.example.proyectofinal.model.Trabajo;
import com.example.proyectofinal.service.ITrabajoService;
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
public class TrabajoController {
    
    @Autowired
    private ITrabajoService interTrabajo;
    
    
    @GetMapping ("/trabajos/traer")
    public List<Trabajo> getTrabajos(){
        return interTrabajo.getTrabajos();
    }
    
    @PostMapping ("/trabajos/crear")
    public String createTrabajos(@RequestBody Trabajo trab) {
        interTrabajo.saveTrabajo(trab);
        return "El trabajo fue creado correctamente";
    }
    
    @DeleteMapping ("/trabajos/borrar/{id}")
    public String deleteTrabajo (@PathVariable Long id) {
        interTrabajo.deleteTrabajo(id);
        return "El trabajo fue eliminado correctamente";
    }
    
    @PutMapping ("/trabajos/editar/{id}")
    public Trabajo editTrabajo (@PathVariable Long id, 
                                @RequestParam ("nombre_trabajo") String nuevoNombreTrabajo, 
                                @RequestParam ("descripcion_trabajo") String nuevaDescripcionTrabajo, 
                                @RequestParam ("fecha_trabajo") Date nuevaFecha,
                                @RequestParam ("nombre_empleador") String nuevoNombreEmpleador, 
                                @RequestParam ("telefono_empleador") int nuevoTelefonoEmpleador){
        
        Trabajo trab = interTrabajo.findTrabajo(id);
        trab.setNombre_trabajo(nuevoNombreTrabajo);
        trab.setDescripcion_trabajo(nuevaDescripcionTrabajo);
        trab.setFecha_trabajo(nuevaFecha);
        trab.setNombre_empleador(nuevoNombreEmpleador);
        trab.setTelefono_empleador(nuevoTelefonoEmpleador);
        interTrabajo.saveTrabajo(trab);
        return trab;
    }
}
