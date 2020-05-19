/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.*;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ROY78
 */
public class Pedido extends producto {

    //Variables
    private int Norden;
    private String NombrePersona;
    private int ID;
    private int numeroTelefono;
    private String dia;
    private String hora;
    private double MontoTotal = 0;
    private String product = "";

    //Se crea una lista de tipo String para guardar los productos
    private List<String> productos = new ArrayList<String>();

    //Se crea una lista de pedido para guardar los pedidos que se realizan
    public static List<Pedido> ListaPedidos = new ArrayList<Pedido>();
    //Se crea una lista de tipo Integer para guardar los números de ordenes que se tienen
    public static List<Integer> NumOrdenes = new ArrayList<Integer>();

    //Se instancia la clase producto
    producto pro = new producto();

    //Constructores
    public Pedido(int Norden, String NombrePersona, int ID, int numeroTelefono, List productos, String dia, String hora, double MontoTotal) {
        this.Norden = Norden;
        this.productos = productos;
        this.NombrePersona = NombrePersona;
        this.ID = ID;
        this.numeroTelefono = numeroTelefono;
        this.dia = dia;
        this.hora = hora;
        this.MontoTotal = MontoTotal;
    }

    public Pedido() {
        super();
    }

    public void VerNorden() {
        String msj = "";
        //Se recorre la lista de pedidos para ver las ordenes que se tienen
        //Este método solo es para llevar control
        for (Pedido p : ListaPedidos) {
            msj += "\n" + p.getNorden();
        }
        System.out.println(msj);
    }

    public void VerPedidos(JTextArea ver) {
        //Recorremos la lista de los pedidos para almacenarlos en una variable
        //de tipo String y así poder mostrarlos en un area de texto
        String msj = "";
        for (Pedido p : ListaPedidos) {
            msj += p + "\n";
        }
        ver.append(msj);
    }

    public void BorrarPedido(JTextField txt_nOrden, JLabel status) {
        //Recorre la lista de pedidos
        for (Iterator<Pedido> iterator = ListaPedidos.iterator(); iterator.hasNext();) {
            Pedido pedidos = iterator.next();
            //Si el pedido que buscamos lo encontramos, se elimina
            if (pedidos.toString().contains(txt_nOrden.getText())) {
                iterator.remove();
                //Muestra confirmación de que el pedido ya se eliminó
                status.setText("Pedido Eliminado!");
            } else{
                status.setText("Pedido no encontrado!");
            }
        }
//        for (Pedido p : ListaPedidos) {
//            if (Integer.parseInt(txt_nOrden.getText()) == p.getNorden()) {
//                ListaPedidos.remove(p);
//                //Muestra confirmación de que el pedido ya se eliminó
//                status.setText("Pedido Eliminado!");
//            } else{
//                status.setText("Pedido incorrecto");
//            }
//        }
    }

    public void ConsultarPedido(JTextField txt_nOrden, JTextArea ver) {
        //Se recorre la lista para buscar el pedido que se necesita
        for (Pedido p : ListaPedidos) {
            //Cuando se encuentre aparecerá en una JTeaxtArea
            if (Integer.parseInt(txt_nOrden.getText()) == p.getNorden()) {
                ver.append("");
                ver.append(p.toString());
            }
        }
    }

    public void AgregarPedido(JTextField txtnombre, JTextField txtid, JTextField txttelefono, JTextField txt_dia, JTextField txt_mes, JTextField txt_YEAR, JLabel HORA, JButton BtnAgregarPro, JList ListProductos) {
        //Método para agregar los nuevos pedidos
        Random rnd = new Random();
        int Norden = ((int) rnd.nextInt(99 - 10 + 1) + 10);
        //Se le asigna un número random al número de orden
        NumOrdenes.add(Norden);
        if (NumOrdenes.contains(Norden)) {
            Norden = ((int) rnd.nextInt(99 - 10 + 1) + 10);
            //Se añade la orden a la lista de NumOrdenes
            NumOrdenes.add(Norden);
        }
        setNorden(Norden);

        //Se agregan los datos necesarios para poder realizar el pedido
        String NombrePersona = txtnombre.getText();
        setNombrePersona(NombrePersona);

        int ID = Integer.parseInt(txtid.getText());
        setID(ID);

        int numeroTelefono = Integer.parseInt(txtid.getText());
        setNumeroTelefono(numeroTelefono);

        String dia = txt_dia.getText() + "-" + txt_mes.getText() + "-" + txt_YEAR.getText();
        String hora = HORA.getText();

        setMontoTotal(MontoTotal);
        //Se agrega el nuevo pedido 
        Pedido pedido = new Pedido(Norden, NombrePersona, ID, numeroTelefono, productos, dia, hora, MontoTotal);
        //Se agrega a la lista de pedidos
        ListaPedidos.add(pedido);

        //Se muestra los datos ordenados del pedido
        JOptionPane.showMessageDialog(null, "¡El pedido fue Realizado!\n"
                + "Número de Orden: " + Norden
                + "\nMonto Total: " + MontoTotal);

    }

    public void AgregarProOrden(JList ListProductos) {
        //Método para agregar productos al pedido
        product = producto.productosLista.get(ListProductos.getSelectedIndex()).toString();
        setProduct(product);
        productos.add(product);
        JOptionPane.showMessageDialog(null, "Producto agregado!");
        for (Iterator<producto> iterator = producto.productosLista.iterator(); iterator.hasNext();) {
            producto productos = iterator.next();
            if (productos.toString().contains(product)) {
                double PrecioProducto = productos.getPrecio();
                //Se calcula el monton total del pedido
                MontoTotal = MontoTotal + PrecioProducto;
            }
        }
    }

    public int getNorden() {
        return Norden;
    }

    public void setNorden(int Norden) {
        this.Norden = Norden;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getNombrePersona() {
        return NombrePersona;
    }

    public void setNombrePersona(String NombrePersona) {
        this.NombrePersona = NombrePersona;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(double MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

    public static List<Pedido> getListaPedidos() {
        return ListaPedidos;
    }

    public static void setListaPedidos(List<Pedido> ListaPedidos) {
        Pedido.ListaPedidos = ListaPedidos;
    }

    public static List<producto> getProductosLista() {
        return productosLista;
    }

    public static void setProductosLista(List<producto> productosLista) {
        producto.productosLista = productosLista;
    }

    @Override
    public String toString() {
        return "Número de Orden: " + Norden
                + "\nNombre: " + NombrePersona
                + "\nID: " + ID
                + "\nNúmero de telefono: " + numeroTelefono
                + "\nProductos:\n " + productos
                + "\nFecha: " + dia
                + "\nHora: " + hora
                + "\nMonto Total: " + MontoTotal;
    }

}
