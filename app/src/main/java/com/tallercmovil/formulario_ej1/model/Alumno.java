package com.tallercmovil.formulario_ej1.model;

import java.io.Serializable;

public class Alumno implements Serializable {


    /*
    *
    * Realizar una aplicación con Android Studio que presente un
    * formulario para alumnos de la Facultad de Ingeniería de la
    *  UNAM con los siguientes datos a ingresar:

Nombre y Apellidos
Número de cuenta (9 dígitos)
Fecha de nacimiento (opcionalmente pueden usar un DatePicker)
Carrera (las 15 de licenciatura que ofrece la Facultad con un Spinner)
A partir de los datos ingresados, se deberá implementar un botón para
*  “enviar” el formulario y abrir otra Activity donde se mostrará
* la información del alumno ingresada.
    *
    *
    * */

    String nombre;
    String apellidos;
    String numCuenta;
    int diaNac;
    int mesNac;
    int anioNac;

    String carrera;

    public Alumno(String nombre, String apellidos, String numCuenta, int diaNac, int mesNac, int anioNac, String carrera) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numCuenta = numCuenta;
        this.diaNac = diaNac;
        this.mesNac = mesNac;
        this.anioNac = anioNac;
        this.carrera = carrera;
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

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getDiaNac() {
        return diaNac;
    }

    public void setDiaNac(int diaNac) {
        this.diaNac = diaNac;
    }

    public int getMesNac() {
        return mesNac;
    }

    public void setMesNac(int mesNac) {
        this.mesNac = mesNac;
    }

    public int getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
