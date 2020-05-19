/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ROY78
 */
public class Empleado extends Persona implements ListenerEmpleado {

    //Variables
    private double Salario;
    private int horaTrabajo;
    public static List<Empleado> arrayEmpleado = new ArrayList<Empleado>();

    //Constructores
    public Empleado(int ID, String Nombre, String FechaNacimiento, double Salario, int horaTrabajo) {
        super(ID, Nombre, FechaNacimiento);
        this.Salario = Salario;
        this.horaTrabajo = horaTrabajo;
    }

    public Empleado() {
        super();
    }

    public void agregarChef(Chef chefcito) {
        //Se añade el nuevo chef al arreglo de empleado
        this.arrayEmpleado.add(chefcito);
    }

    public void agregarMesero(Mesero meserito) {
        //Se añade el nuevo mesero al arreglo de empleado
        this.arrayEmpleado.add(meserito);
    }

    public void agregarAdministrador(Administrador admi) {
        //Se añade el nuevo administrador al arreglo de empleado
        this.arrayEmpleado.add(admi);
    }

    
    public void EliminarChef(JTextField idchef){
        //Se elimina el chef que se indicó previamente en el frame
        Eliminar(idchef);
    }
    
    public void EliminarMesero(JTextField idMesero ){
        //Se elimina el mesero que se indicó previamente en el frame
        Eliminar(idMesero);
    }
    
    public void EliminarAdministrador(JTextField idAdmi){
        //Se elimina el administrador que se indicó previamente en el frame
        Eliminar(idAdmi);
    }
    
    private void Eliminar(JTextField id){
       //Se realiza una busqueda de todos los empleados que hay guardados en la arraylist
       //para luego remover el que se indicó previamente en area de texto para así poder eliminar el correcto
        for (Iterator<Empleado> iterator = arrayEmpleado.iterator(); iterator.hasNext();) {
            Empleado empleados = iterator.next();
            if (empleados.toString().contains(id.getText())) {
                iterator.remove();
            }
        }
    }

    public void desplegarEmpleado() {

        String msj = "";
        //Se realiza un ciclo para recorrer la lista de los empleado y así guardar todos
        //los empleados en una variables String para así, poder desplegar todos los empleados que hayan
        for (Empleado e : arrayEmpleado) {

            msj = msj + "\n " + e.toString();

        }
        System.out.println(msj);

    }

    public int getHoraTrabajo() {
        return horaTrabajo;
    }

    public void setHoraTrabajo(int horaTrabajo) {
        this.horaTrabajo = horaTrabajo;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + ", Salario=" + Salario + ", horaTrabajo=" + horaTrabajo + '}';
    }

    @Override
    public void calcularSalario() {
        //Método abstracto que se implementa de ListenerEmpleado para poder calcular el salario
        //de cada empleado segun las horas de trabajo que este labore
        try {
            switch (this.horaTrabajo) {
                case 5: //Caso para calcular salario chef
                    this.Salario = 4000 * this.horaTrabajo;
                    break;
                case 8: //Caso para calcular salario mesero
                    this.Salario = 2500 * this.horaTrabajo;
                    break;
                case 10://Caso para calcular salario Admnistrador
                    this.Salario = 3500 * this.horaTrabajo;
                    break;
                default:
                    JOptionPane.showInputDialog("No cumple con las horas necesarias");
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

    }

    @Override
    public void llenarDatos() {
        //Método no utilizado por el momento
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
