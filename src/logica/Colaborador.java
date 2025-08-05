/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.LocalDate;


public class Colaborador {
    private int cedula;
    private String nombre;
    private LocalDate fechaNac;
    private LocalDate fachaIngreso;
    private LocalDate fechaDespido;
    private String direccion;
    private int telefono;
    private String email;
    private Puestos puesto;
    private int cedJEfe;

    public Colaborador(int cedula, String nombre, LocalDate fechaNac, LocalDate fachaIngreso, LocalDate fechaDespido, String direccion, int telefono, String email, Puestos puesto, int cedJEfe) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.fachaIngreso = fachaIngreso;
        this.fechaDespido = fechaDespido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.puesto = puesto;
        this.cedJEfe = cedJEfe;
    }
    
    public Colaborador() {
        this.cedula = 0;
        this.nombre = "";
        this.fechaNac = null;
        this.fachaIngreso = null;
        this.fechaDespido = null;
        this.direccion = "";
        this.telefono = 0;
        this.email = "";
        this.puesto = null;
        this.cedJEfe = 0;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public LocalDate getFachaIngreso() {
        return fachaIngreso;
    }

    public LocalDate getFechaDespido() {
        return fechaDespido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Puestos getPuesto() {
        return puesto;
    }

    public int getCedJEfe() {
        return cedJEfe;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setFachaIngreso(LocalDate fachaIngreso) {
        this.fachaIngreso = fachaIngreso;
    }

    public void setFechaDespido(LocalDate fechaDespido) {
        this.fechaDespido = fechaDespido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPuesto(Puestos puesto) {
        this.puesto = puesto;
    }

    public void setCedJEfe(int cedJEfe) {
        this.cedJEfe = cedJEfe;
    }
    
    
}
