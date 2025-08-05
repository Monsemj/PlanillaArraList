/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Student
 */
public class Pluses {
    private int idPlus;
    private String titulo;
    private float porcIncremento;

    public Pluses(int idPlus, String titulo, float porcIncremento) {
        this.idPlus = idPlus;
        this.titulo = titulo;
        this.porcIncremento = porcIncremento;
    }
    
    public Pluses() {
        this.idPlus = 0;
        this.titulo = "";
        this.porcIncremento = 0;
    }

    public int getIdPlus() {
        return idPlus;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getPorcIncremento() {
        return porcIncremento;
    }

    public void setIdPlus(int idPlus) {
        this.idPlus = idPlus;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPorcIncremento(float porcIncremento) {
        this.porcIncremento = porcIncremento;
    }
    
    
}
