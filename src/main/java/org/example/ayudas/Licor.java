package org.example.ayudas;

import java.time.LocalDate;

public class Licor {

    private String marca;
    private String Nombre;
    private String tipo;
    private LocalDate fechaCaducidad;
    private Double porcentajeAlcohol;

    public Licor(String marca, String nombre, String tipo, LocalDate fechaCaducidad, Double porcentajeAlcohol) {
        this.marca = marca;
        Nombre = nombre;
        this.tipo = tipo;
        this.fechaCaducidad = fechaCaducidad;
        this.porcentajeAlcohol = porcentajeAlcohol;
    }

    public Licor() {


    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Double getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(Double porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }
}
