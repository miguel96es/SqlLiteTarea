package com.example.miguel.sqliteejemplo;

public class Car {
    private int ID;
    private String nombre;
    private String color;

    public Car(int ID, String nombre, String color) {
        this.ID = ID;
        this.nombre = nombre;
        this.color = color;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getID() {
        return ID;
    }
    public String getNombre() {
        return nombre;
    }
    public String getColor() {
        return color;
    }
}
