/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Student
 */
public class Puestos {
    private int idPuesto;
    private String nombrePuesto;
    private double salario;

    public Puestos(int idPuesto, String nombrePuesto, double salario) {
        this.idPuesto = idPuesto;
        this.nombrePuesto = nombrePuesto;
        this.salario = salario;
    }
    
    public Puestos() {
        this.idPuesto = 0;
        this.nombrePuesto = "";
        this.salario = 0;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
