/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectofinal.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author Samsung
 */
@Getter @Setter
@Entity
public class Trabajo {
        @Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE)
        private Long id;
        private String nombre_trabajo;
        private String descripcion_trabajo;
        private Date fecha_trabajo;
        private String nombre_empleador;
        private int telefono_empleador;
}
