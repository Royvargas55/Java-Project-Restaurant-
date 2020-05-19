/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class producto {

    //Se crea una lista de tipo Producto para poder almacenar los productos que posee el restaurante
    public static List<producto> productosLista = new ArrayList<producto>();
    //Se crea una lista auxiliar a la anterior, como un backup
    public static List<producto> productosListaAux = new ArrayList<producto>();

    //Variables
    private String nombre;
    private int codigo;
    private double precio;

    //Constructor
    public producto() {

    }

    @Override
    public String toString() {
        return " Código: " + codigo + " Producto: " + nombre + " Precio: " + precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public producto(int codigo, String nombre, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;

    }

    public void Productos() {
        //Se cargan varios productos "quemados"
        producto burrito = new producto(1, "Burrito", 2000);
        productosLista.add(burrito);
        producto pizza = new producto(2, " Pizza ", 1800);
        productosLista.add(pizza);
        producto tacos = new producto(3, " Tacos ", 1500);
        productosLista.add(tacos);
        producto hamburquesa = new producto(4, " Hamburguesa ", 3000);
        productosLista.add(hamburquesa);
        producto refresco = new producto(5, " Refresco ", 1000);
        productosLista.add(refresco);
    }

    public void AdminAgrega(JTextField CodigoPro, JTextField nombreProducto, JTextField PrecioPro, JLabel Status) {
        //Método donde se agregan nuevos productos
        String Nombre = nombreProducto.getText();
        int codigo = Integer.parseInt(CodigoPro.getText());
        int precio = Integer.parseInt(PrecioPro.getText());
        producto product = new producto(codigo, Nombre, precio);
        productosListaAux.add(product);
        Status.setText("Producto Agregado!");
    }

    public void AdminBorra(JTextField codigopro, JLabel Status) {
        //Método donde se puede eliminar los productos
        for (Iterator<producto> iterator = productosListaAux.iterator(); iterator.hasNext();) {
            producto productos = iterator.next();
            if (productos.toString().contains(codigopro.getText())) {
                iterator.remove();
                Status.setText("Producto Eliminado!");
            }
        }
        
    }
    
    public void ActualizarProductos(){
        //Método para actualizar los productos en caso de que se haya hecho alguna modificación
        for (Iterator<producto> iterator = producto.productosListaAux.iterator(); iterator.hasNext();) {
            producto productos = iterator.next();
            if (!productos.toString().isEmpty()) {
                int cod= productos.getCodigo();
                String nom= productos.getNombre();
                double pre= productos.getPrecio();
                producto prod = new producto(cod, nom, pre);
                productosLista.add(prod);
            }
        }
        
    }
    
    public void CargarProductos(JList ListProductos) {
        //Método para cargar los productos en una JList y así, poder tomar el pedido
        int tamano = producto.productosLista.size();
        final String[] vector = new String[tamano];
        for (int conta = 0; conta < tamano; conta++) {
            vector[conta] = producto.productosLista.get(conta).getCodigo() + " - " + producto.productosLista.get(conta).getNombre()
                    + " - " + producto.productosLista.get(conta).getPrecio();
        }
        ListProductos.setModel(new javax.swing.AbstractListModel() {
            String[] vect = vector;

            @Override
            public int getSize() {
                return vect.length;
            }

            @Override
            public Object getElementAt(int i) {
                return vect[i];
            }

        });

    }

}
