package com.ejercicios2302.ejercicios2302.models;

public class Perro {
    // los atributos de los objetos pueden ser privados o públicos
    // esto depende de la sensibilidad del dato
    // por ej, el chip de un perro podría ser un dato private
    public String nombre;
    public String raza;
    public String color;
    public Double tamanio;
    public char sexo; // 'F'
    private Integer chip;

    // constructores

    public Perro() {
    }
    
    public Perro(String nombre, String raza, String color, Double tamanio, char sexo, Integer chip) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
        this.sexo = sexo;
        this.chip = chip;
    }

    // getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Integer getChip() {
        return chip;
    }

    public void setChip(Integer chip) {
        this.chip = chip;
    }

    // funciones - métodos

    public void ladrar(){
        System.out.println("guau!");
    }

    public String romperCosas(boolean meRetaron){
        if(meRetaron==true){
            return "Destrozo";
        } else {
            return "No destrozo";
        }
    }

    public String cavar(){
        return "El perro cavó un hoyo en el patio";
    }

    //toString
    @Override
    public String toString() {
        return "Datos de " + nombre + ", raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + ", sexo=" + sexo + ", chip=" + chip + "]\n";
    }
}
