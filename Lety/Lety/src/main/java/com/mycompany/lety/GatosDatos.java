/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lety;//nombre del paquete

/**
 *
 * @author CORTES
 */
public class GatosDatos {//comienza la clase modelo
    
    //Atributos
    private String nombre;
    private String color;
    private String Sexo;
    private String Raza;
    private int edad;

    //constructor vacío
    public GatosDatos() {
    }

    //método para obrener el nombre y enviarlo a la clase principal
    public String getNombre() {
        return nombre;
    }

    //método para establecer el nombre 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //método para obrener el color del gato y enviarlo a la clase principal
    public String getColor() {
        return color;
    }

    //método para establecer el color del gato
    public void setColor(String color) {
        this.color = color;
    }

    //método para obener el sexo del gato  y enviarlo a la clase principal
    public String getSexo() {
        return Sexo;
    }

    //método para establecer el sexo del gato
    public void setSexo(String sexo) {
        this.Sexo = sexo;
    }

    //método para obener la raza del gato y enviarlo a la clase principal
    public String getRaza() {
        return Raza;
    }

    //método para establecer la raza del gato
    public void setRaza(String Raza) {
        this.Raza = Raza;
    }
    
    //método para obener la edad del gato y enviarlo a la clase principal
    public int getEdad() {
        return edad;
    }

    //método para establecer la edad del gato
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
