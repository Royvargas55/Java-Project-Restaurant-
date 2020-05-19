/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;


/**
 *
 * @author ROY78
 */
public class Mensajes {

    //Se crea una lista de tipo String para guardar las sugerencias
    public static List<String> realizarSugerencia = new ArrayList<String>();

    public void GuardarSugerencia(String mensaje) {
       //Se guardan las sugerencias hechas en la lista
        realizarSugerencia.add(mensaje);
    }

    public void MostrarSugerencias(JTextArea txtTexto) {
        //Se muestran las sugerencias previamente hechas por el cliente
        txtTexto.setText(realizarSugerencia.toString());
    }

    public void GuardarMensajes(String mensaje) {
        //Se guardan los mensajes a la lista
        realizarSugerencia.add(mensaje);
    }

    public void MostrarMensajes(JTextArea txtTexto) {
        //Se muestran los mensajes previamente hechos
        txtTexto.setText(realizarSugerencia.toString());
    }

}
