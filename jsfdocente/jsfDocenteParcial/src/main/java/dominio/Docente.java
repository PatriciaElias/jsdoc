/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@NamedQueries({    
    @NamedQuery(name="Docente.findAll", query="SELECT d from Docente d ORDER BY d.ido")
})
@Table(name="docente")
public class Docente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idDocente")
    private int ido;
    private String especialidad;
    @Column(name="nombre_docente")
    private String nombre;
    @Column(name="apellido_docente")
    private String apellido;
    @Column(name="fecha_ingreso")
    private Date fecha;

    public Docente() {
    }

    public Docente(String especialidad, String nombre, String apellido, Date fecha) {
        this.especialidad = especialidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
    }

    public int getIdo() {
        return ido;
    }

    public void setIdo(int ido) {
        this.ido = ido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Docente{" + "ido=" + ido + ", especialidad=" + especialidad + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha=" + fecha + '}';
    }

    
    
    
    
    
}
