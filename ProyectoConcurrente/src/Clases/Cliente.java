/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.Pedido.ListaPedidos;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ROY78
 */
public class Cliente extends Persona {

    private int NumeroTelefono;
    //Constructores
    public Cliente(int ID, String Nombre, String FechaNacimiento, int NumeroTelefono) {
        super(ID, Nombre, FechaNacimiento);
        this.NumeroTelefono = NumeroTelefono;
    }

    public Cliente() {
        super();
    }

    public int getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(int NumeroTelefono) {
        this.NumeroTelefono = NumeroTelefono;
    }

    @Override
    public String toString() {
        return "Cliente " + super.toString() + " NumeroTelefono= " + NumeroTelefono;
    }

    public void PagarPedido(JTextField txt_nOrden, JTextField txt_id) {
        //Recorre la lista de pedidos
        for (Iterator<Pedido> iterator = Pedido.ListaPedidos.iterator(); iterator.hasNext();) {
            Pedido pedidos = iterator.next();
            //Si el pedido que buscamos lo encontramos, se elimina
            if (pedidos.toString().contains(txt_nOrden.getText())) {
                iterator.remove();
            }
        }
        //Recorre la lista reservas
        for (Iterator<Reservacion> iterator = Reservacion.Reservas.iterator(); iterator.hasNext();) {
            Reservacion reservas = iterator.next();
            //Si alguna reserva contiene el ID, se elimina
            if (reservas.toString().contains(txt_id.getText())) {
                iterator.remove();
            }
        }
        
        //vaciar una reserva
        Reservacion.mesas[Reservacion.i-1]=null;
        Reservacion.i++;

        //Muestra confirmación de que el pedido ya se eliminó
        System.out.println(Reservacion.Reservas);
        JOptionPane.showMessageDialog(null, "Gracias por venir!");

    }

}
