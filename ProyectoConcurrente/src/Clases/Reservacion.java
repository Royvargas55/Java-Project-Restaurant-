package Clases;

import static Clases.producto.productosLista;
import java.awt.Label;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javafx.scene.paint.Stop;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ROY78
 */
public class Reservacion extends Cliente {

    //Variables
    private int Nreserva;
    private int Nacompanantes;
    static int i = 0;
    static int j = 0;
    static Reservacion mesas[] = new Reservacion[10];

    //Se crea una lista de tipo Reservación para guardar las reservas que se realizan
    public static List<Reservacion> Reservas = new ArrayList<Reservacion>();
    //Se crea una lista de tipo Integer para guardar los numeros de reserva
    public static List<Integer> NumReserva = new ArrayList<Integer>();

    //Constructores
    public Reservacion(int ID, String Nombre, String FechaNacimiento, int NumeroTelefono, int Nreserva, int Nacompanantes) {
        super(ID, Nombre, FechaNacimiento, NumeroTelefono);
        this.Nreserva = Nreserva;
        this.Nacompanantes = Nacompanantes;
    }

    public Reservacion() {
        super();
    }
    
    public void VerReservas(){
        //Se recorre la lista de reserva y se almacenas en una variable
        //tipo String para poder ver todas las reservas que hayan
        String msj = "";
        for (Reservacion reserva : Reservas) {
            
            msj+= "\n" + reserva.getNombre() + " - " + reserva.getNreserva();
        }
        System.out.println(msj);

    }

    public void HacerReserva(JTextField ID, JTextField Nombre, JTextField Telefono, JTextField Nacompanantes, JLabel status) {
        try {
            //Se puede realizar reservas de 10 mesa por eso se realiza un ciclo while
            while (mesas.length <= 10) {
                //Se recolectan y se agregan los datos
                int id = Integer.parseInt(ID.getText());
                super.setID(id);
                String nombre = Nombre.getText();
                super.setNombre(nombre);
                String Fnac = "No es necesario con los clientes";
                super.setFechaNacimiento(Fnac);
                int telefono = Integer.parseInt(Telefono.getText());
                super.setNumeroTelefono(telefono);

                //Se le asigna un número random al número de reserva
                Random rnd = new Random();
                int Nreserva = ((int) rnd.nextInt(99 - 10 + 1) + 10);
                //Se añade a la lista de NReserva
                NumReserva.add(Nreserva);
                if (NumReserva.contains(Nreserva)) {
                    Nreserva = ((int) rnd.nextInt(99 - 10 + 1) + 10);
                    NumReserva.add(Nreserva);
                }

                int acompanantes = Integer.parseInt(Nacompanantes.getText());

                //Cada mesa solo puede tener 5 o menos acompañantes por lo que se valida que así sea
                if (acompanantes <= 5 && acompanantes >= 0) {
                    setNacompanantes(acompanantes);
                    //Se añade la nueva reservación a la lista de Reservas
                    Reservacion cliente = new Reservacion(id, nombre, Fnac, telefono, Nreserva, acompanantes);
                    Reservas.add(cliente);
                    mesas[i] = cliente;
                    i++;
                    //Se muestra la informcaión previamente digitada
                    status.setText("La reservacion fue realizada, " + "el número de reserva es=" + Nreserva + " "
                            + "\nViene con: " + acompanantes + " acompañante(s)" + "\n");
                } else {
                    JOptionPane.showMessageDialog(null, "Solo pueden haber 5 acompañantes por persona");
                }

                break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede reservar, se acabaron el número de mesas");
        }
    }

    public void Verficar(JTextField txt_reserva, JButton BtnAgregarPro, JButton btnConfirmarPedi, JList ListProductos, JLabel statusReserva) {
        //Método para verfificar que exista el número de reserva previamente digitado
        if (NumReserva.contains(Integer.parseInt(txt_reserva.getText()))) {
            //Si se encuentra se habilitan las acciones para poder tomar el pedido
            statusReserva.setText("Número de reserva encontrado!");
            BtnAgregarPro.setEnabled(true);
            btnConfirmarPedi.setEnabled(true);
            ListProductos.setEnabled(true);
        } else {
            statusReserva.setText("No se encuentra la reservación!");
        }
    }

    public void FijarDatos(JTextField txtnombre, JTextField txtid, JTextField txttelefono, JTextField txt_reserva) {
        //Método para fijar los datos y así no se pued tomar el pedido in antes verificar si existe el numero de reserva
        String nombre = "", id="", telefono="";
        for (Iterator<Reservacion> iterator = Reservas.iterator(); iterator.hasNext();) {
            Reservacion reserva = iterator.next();
            if (reserva.toString().contains(txt_reserva.getText())) {
                nombre=reserva.getNombre();
                id=  Integer.toString(reserva.getID());
                telefono= Integer.toString(reserva.getNumeroTelefono());
            }
        }
        txtnombre.setText(nombre);
        txtid.setText(id);
        txttelefono.setText(telefono);
        txtnombre.setEditable(false);
        txtid.setEditable(false);
        txttelefono.setEditable(false);
    }

    public int getNreserva() {
        return Nreserva;
    }

    public void setNreserva(int Nreserva) {
        this.Nreserva = Nreserva;
    }

    public int getNacompanantes() {
        return Nacompanantes;
    }

    public void setNacompanantes(int Nacompanantes) {
        this.Nacompanantes = Nacompanantes;
    }

    @Override
    public String toString() {
        return "La reservacion fue realizada, " + "el número de reserva es=" + Nreserva + " \nViene con: " + Nacompanantes + " acompañante(s)" + "\n"
                + "La reserva esta a nombre del: " + super.toString();
    }

}
