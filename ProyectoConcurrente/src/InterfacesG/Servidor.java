/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesG;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author ROY78
 */
public class Servidor extends javax.swing.JFrame {

    /**
     * Creates new form Servidor
     */
    ServerSocket ss;
    //Se crea HasMap para crear un objeto de clave valor
    HashMap clientColl = new HashMap();

    public Servidor() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);//para centrar la pantalla
            this.setTitle("SERVIDOR");
            ss = new ServerSocket(2089);
            this.sStatus.setText("Server Iniciado...");
            //Se inicia la clase "ClienteAcepta"
            new ClienteAcepta().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class ClienteAcepta extends Thread {

        public void run() {
            while (true) {
                try {
                    //Se abre el socket
                    Socket s = ss.accept();
                    //Variable "i", obtiene todos los datos leidos del socket
                    String i = new DataInputStream(s.getInputStream()).readUTF();
                    //Si el hashmap contiene la llave de la variable "i"
                    if (clientColl.containsKey(i)) {
                        //Se crea objeto "dout", para escribir la informacion del socket
                        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                        //Si el hashmap lo contiene, notifica al usuario que ya esta registrado
                        dout.writeUTF("Te has registrado!");
                    } else {
                        //Sino, se le pone al usuario la clave i y el valor s
                        clientColl.put(i, s);
                        //Muestra que se unio nuevo usuario
                        mensajes.append(i + " Se ha Unido!\n");
                        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                        dout.writeUTF("");
                        //Se inicializa las clases de "LeerMSN", pasandole los atributos clave- valor
                        //y la clase de "ListaClientes"
                        new LeerMsn(s, i).start();
                        new ListaClientes().start();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

    class LeerMsn extends Thread {

        //La variable Socket y el String ID
        Socket s;
        String ID;

        //Se crea constructor
        public LeerMsn(Socket s, String ID) {
            this.s = s;
            this.ID = ID;
        }

        public void run() {
            //Mientra la estructura HashMap no este vacia, hara lo siguiente
            while (!clientColl.isEmpty()) {
                try {
                    //Variable 'i' con los datos del socket
                    String i = new DataInputStream(s.getInputStream()).readUTF();
                    //Si contiene la siguiente clave, que es declarada en "MSNCliente"
                    if (i.equals("mkoihgteazdcvgyhujb096785542AXTY")) {
                        //El cliente es removido a traves de su "ID"
                        clientColl.remove(ID);
                        //Se pone mensaje en pantalla del servidor
                        mensajes.append(ID + ":Ha salido!\n");
                        //Se actualiza ListaClientes
                        new ListaClientes().start();
                        //variable k, con el conjunto de las claves que hay en el HashMap
                        Set k = clientColl.keySet();
                        //Se recorre HashMap
                        Iterator itr = k.iterator();
                        while (itr.hasNext()) {
                            String key = (String) itr.next();
                            //If para comparar ID, sin ignorar Mayusculas y minusculas
                            if (!key.equalsIgnoreCase(ID)) {
                                try {
                                    //Si era igual se muestra mensaje de que salio del chat
                                    new DataOutputStream(((Socket) clientColl.get(key)).getOutputStream()).writeUTF(ID + ": Ha salido del chat!");
                                } catch (Exception e) {
                                    //Remueve el Key del HashMap
                                    clientColl.remove(key);
                                    mensajes.append(key + ": Ha salido!\n");
                                    //Se actualiza lista de clientes
                                    new ListaClientes().start();
                                }
                            }
                        }
                        //Si contiene la siguiente clave, que es declarada en "MSNCliente"
                    } else if (i.contains("#4344554@@@@@67667@@")) {
                        //i sera igual a la cadena de subtring desde el indice 0 hasta al final
                        i = i.substring(20);
                        //Se decalara objeto StringTokenizer, pasandole  la variable "i" junto con ":"
                        StringTokenizer st = new StringTokenizer(i, ":");
                        //id e i sera igual al siguiente token de la cadena
                        String id = st.nextToken();
                        i = st.nextToken();
                        //Se envia mensaje donde, "ID" es la persona que lo envia, "id" el receptor del mensaje e "i" es el mensaje
                        try {
                            new DataOutputStream(((Socket) clientColl.get(id)).getOutputStream()).writeUTF("< " + ID + " para " + id + " > " + i);
                        } catch (Exception e) {
                            //Si el cliente sale, se remueva el id, se adjunta mensaje, y se reinicia la lista
                            clientColl.remove(id);
                            mensajes.append(id + ": Ha salido!");
                            new ListaClientes().start();
                        }
                    } else {
                        //Sino el mensaje es global para todos los usuarios
                        //variable k, con el conjunto de las claves que hay en el HashMap
                        Set k = clientColl.keySet();
                        //recorre K
                        Iterator itr = k.iterator();
                        while (itr.hasNext()) {
                            String key = (String) itr.next();
                            //If para comparar ID, sin ignorar Mayusculas y minusculas
                            if (!key.equalsIgnoreCase(ID)) {
                                try {
                                    //Se envia mensaje global para todos los usuarios
                                    new DataOutputStream(((Socket) clientColl.get(key)).getOutputStream()).writeUTF("< " + ID + " para todos > " + i);
                                } catch (Exception e) {
                                    clientColl.remove(key);
                                    mensajes.append(key + ": Ha salido!");
                                    new ListaClientes().start();
                                }
                            }
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class ListaClientes extends Thread {

        public void run() {
            try {
                //Variable String ids
                String ids = "";
                //variable k, con el conjunto de las claves que hay en el HashMap
                Set k = clientColl.keySet();
                //Recorrer el conjunto de claves
                Iterator itr = k.iterator();
                //Mientras haya un objeto siguiente
                while (itr.hasNext()) {
                    //String Key, guarda cada clave
                    String key = (String) itr.next();
                    //Variable ID, almacena clave y seguido una ",", que luego servira como delimitador
                    ids += key + ",";
                }
                //Si el tamaño del string "ids" es diferente de 0
                if (ids.length() != 0) {
                    //ids, ahora sera la subcadena del string "ids", empezando en el indice 0 hasta el ultimo,
                    //que sera el tamaño -1
                    ids = ids.substring(0, ids.length() - 1);
                }
                //Recorrer conjunto de claves
                itr = k.iterator();
                while (itr.hasNext()) {
                    //Key recibe cada clave
                    String key = (String) itr.next();
                    try {
                        //Nuevo objeto Output, castenado a socket cada clave del HashMap, se le adjunta a "ids", los caracteres ":;.,/="
                        //para luego poder leer los mensajes.
                        new DataOutputStream(((Socket) clientColl.get(key)).getOutputStream()).writeUTF(":;.,/=" + ids);
                    } catch (Exception e) {
                        //Cuando un cliente sale, se remueva la Key del hashmap
                        clientColl.remove(key);
                        mensajes.append(key + ": Ha salido!");
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensajes = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        sStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        mensajes.setColumns(20);
        mensajes.setForeground(new java.awt.Color(38, 38, 38));
        mensajes.setRows(5);
        mensajes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 40, 57), 1, true));
        mensajes.setCaretColor(new java.awt.Color(214, 40, 57));
        jScrollPane1.setViewportView(mensajes);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 133, 17));
        jLabel1.setText("Administrador");

        sStatus.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        sStatus.setForeground(new java.awt.Color(243, 133, 17));
        sStatus.setText(".......................................................................");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(sStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mensajes;
    private javax.swing.JLabel sStatus;
    // End of variables declaration//GEN-END:variables
}
