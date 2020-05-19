/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JTextField;

public class Chef extends Empleado {

    private String Especialidad;

    //Constructores
    public Chef(int ID, String Nombre, String FechaNacimiento, double Salario, int horaTrabajo, String Especialidad) {
        super(ID, Nombre, FechaNacimiento, Salario, horaTrabajo);
        this.Especialidad = Especialidad;
    }

    public Chef() {
        super();
    }

    public void AgregarDatos(JTextField idChef, JTextField nombreChef, JTextField nacimientoChef, JTextField EspecialidadChef) {
        //Se agregan los datos que previamente se digitaron en las areas de texto en el frame
        super.setID(Integer.parseInt(idChef.getText()));
        super.setNombre(nombreChef.getText());
        super.setFechaNacimiento(nacimientoChef.getText());
        super.setHoraTrabajo(5);
        this.setEspecialidad(EspecialidadChef.getText());
        super.calcularSalario();
    }


    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    @Override
    public String toString() {
        return "Chef{:" + super.toString() + "Especialidad=" + Especialidad + '}';
    }


}
