/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mfernandez
 */
public class Persona {
    private long id;
    private String dni;
    private int edad;
    private float salario;
    private boolean borrado;
    private String nombre;
    
    public Persona() {
        
    }

    public Persona(long id, String dni, int edad, float salario, boolean borrado, String nombre) {
        this.id = id;
        this.dni = dni;
        this.edad = edad;
        this.salario = salario;
        this.borrado = borrado;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", dni=" + dni + ", edad=" + edad + ", salario=" + salario + ", borrado="+borrado+", nombre= " + nombre + "}";
    }

    
  
    
    
}
