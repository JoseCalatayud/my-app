package com.mycompany.app;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String profesion;

    public Persona(String nombre, String apellidos, int edad, String profesion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.profesion = profesion;
    }
    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
}
