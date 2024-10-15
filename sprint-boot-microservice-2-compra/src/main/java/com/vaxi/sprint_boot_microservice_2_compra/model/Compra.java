package com.vaxi.sprint_boot_microservice_2_compra.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="compra")
public class Compra {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name="inmueble_id", nullable = false)
    private Long inmuebleId;

    @Column(name="titulo", nullable = false)
    private String titulo;

    @Column(name= "precio", nullable = false)
    private Double precio;

    @Column(name="fecha_compra", nullable = false)
    private LocalDateTime fechaCompra;

    
}
