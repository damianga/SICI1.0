package sici.modelo;
// Generated 18/10/2017 21:00:20 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Marca generated by hbm2java
 */
public class Marca  implements java.io.Serializable {


     private Integer idMarca;
     private String nombre;
     private Set articulos = new HashSet(0);

    public Marca() {
    }

    public Marca(String nombre, Set articulos) {
       this.nombre = nombre;
       this.articulos = articulos;
    }
   
    public Integer getIdMarca() {
        return this.idMarca;
    }
    
    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getArticulos() {
        return this.articulos;
    }
    
    public void setArticulos(Set articulos) {
        this.articulos = articulos;
    }




}


