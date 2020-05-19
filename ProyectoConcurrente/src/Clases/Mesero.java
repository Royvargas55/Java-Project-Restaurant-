/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JTextField;

/**
 *
 * @author ROY78
 */
public class Mesero extends Empleado{
    private String Turno;

    //Constructores
    public Mesero( int ID, String Nombre, String FechaNacimiento, double Salario, int horaTrabajo,String Turno) {
        super( ID, Nombre, FechaNacimiento,Salario, horaTrabajo);
        this.Turno = Turno;
    }

    public Mesero() {
        super();
    }
    
    public void AgregarDatos(JTextField idMesero, JTextField nombreMesero, JTextField nacimientoMesero, String turno){
       //Se agregan datos del nuevo mesero previamente escritos en el frame a la lista de empleados
        super.setID(Integer.parseInt(idMesero.getText()));
        super.setNombre(nombreMesero.getText());
        super.setFechaNacimiento(nacimientoMesero.getText());
        super.setHoraTrabajo(8);
        this.setTurno(turno);
        super.calcularSalario();
        
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    @Override
    public String toString() {
        return "Mesero{" +super.toString()+ "Turno=" + Turno + '}';
    }
    
    
    
    
    
    
}
