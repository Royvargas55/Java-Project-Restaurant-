/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ROY78
 */
public class Persona {
    //Variables
    private String Nombre;
    private int ID;
    private String FechaNacimiento;

    //Constructores
    public Persona(int ID, String Nombre, String FechaNacimiento) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
    }

    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    @Override
    public String toString() {
        return " ID= " + ID+ " Nombre= " + Nombre + " FechaNacimiento= " + FechaNacimiento;
    }
    
}
