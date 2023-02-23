package com.ejercicios2302.ejercicios2302.models;

public class Perroo {
    public String raza;
    public String color;
    public Double tamanio;
    public String pelaje;
    public char sexo; // 'F'
    private Integer chip;

    // constructores
    public Perroo() {
    }

    public Perroo(String raza, String color, Double tamanio, String pelaje, char sexo, Integer chip) {
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
        this.pelaje = pelaje;
        this.sexo = sexo;
        this.chip = chip;
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

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
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

    @Override
    public String toString() {
        return "Perrito hermoso [raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + ", pelaje=" + pelaje + ", sexo="
                + sexo + ", chip=" + chip + "]";
    }

    
    

}
