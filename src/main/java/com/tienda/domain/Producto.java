
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Crea los set y get automaticamente, ahorra codigo
@Entity
@Table(name="producto")

public class Producto implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencia;
    private String rutaImagen; 
    private boolean activo;
    private Long idCategoria;

    public Producto(String descripcion, String detalle, double precio, int existencia, String rutaImagen, boolean activo, Long idCategoria) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencia = existencia;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
        this.idCategoria = idCategoria;
    }
}
