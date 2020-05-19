/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author ROY78
 */
public class Administrador extends Empleado{

    //constructores
    public Administrador(int ID, String Nombre, String FechaNacimiento,double Salario, int horaTrabajo) {
        super(ID,Nombre, FechaNacimiento, Salario, horaTrabajo);
    }

    public Administrador() {
        super();
    }
    
    public void AgregarDatos( JTextField idAdmi, JTextField nombreAdmi, JTextField nacimientoAdmi){
       //Se agregan los datos que previamente fueron escritos en las areas de texto en el frame
        super.setID(Integer.parseInt(idAdmi.getText()));
        super.setNombre(nombreAdmi.getText());
        super.setFechaNacimiento(nacimientoAdmi.getText());
        super.setHoraTrabajo(10);
        super.calcularSalario();
        
    }
    
    public void mostrarEmpleados(JTable jTable1) {
        Empleado e = new Empleado();
        String matriz[][] = new String[e.arrayEmpleado.size()][3];

        int i = 0;
        //Se recorre la lista de empleados
        for (Empleado em : e.arrayEmpleado) {
            //Se añaden a al tabla por medio de una matriz
            matriz[i][0] = String.valueOf(em.getID());
            matriz[i][1] = em.getNombre();
            matriz[i][2] = String.valueOf(em.getSalario());
            i++;
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Nombre", "Salario"
                }
        ));
    }

    @Override
    public String toString() {
        return "Administrador{: " + super.toString();
    }
    
    
    
    
    
}
