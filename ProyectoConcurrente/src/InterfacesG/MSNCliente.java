/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesG;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ROY78
 */
public class MSNCliente extends javax.swing.JFrame {

    //Variables
    String iD, clienteID = "";//iD selecciona usuario en especifico para enviar mensaje, clienteID para enviar msn global
    DataInputStream din;//Leer datos
    DataOutputStream dout;//Escribir datos
    DefaultListModel dlm;//Modificar Jlist

    public MSNCliente() {
        initComponents();
    }
    
    //Constructor
    MSNCliente(String i, Socket s) {
        iD = i;
        try {
            initComponents();
            dlm = new DefaultListModel(); //Se crea una default list
            UL.setModel(dlm);
            labelusuario.setText(i); //Se digita el nombre de usuario al frame
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            //Se inicializa el hilo de la clase "Read"
            new Read().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Clase para leer clientes
    class Read extends Thread {

        public void run() {
            while (true) {
                try {
                    //Se asignan los datos leidos a la cadena M
                    String m = din.readUTF();
                    //Se verifica si "m" contiene alguno de estos caracteres,
                    //Ya que en el servidor se agrega el socket con la key del HashMap, y estos caracteres de primero
                    if (m.contains(":;.,/=")) {
                        //Se extrae parte de la cadena, hasta el indice 6
                        m = m.substring(6);
                        dlm.clear();//Se limpia el jlist
                        //Crea nuevo objeto con la clase StringTokenizer 
                        //Le agrega el valor del atributo M, y la "," como delimitador
                        StringTokenizer st = new StringTokenizer(m, ",");
                        //Recorre el objeto "st", mientras existe un Token siguiente al actual  
                        while (st.hasMoreTokens()) {
                            //"u" almacena cadatoken 
                            String u = st.nextToken();
                            //Si el id es diferente de u, se agrega un nuevo elemento al Jlist
                            if (!iD.equals(u)) {
                                dlm.addElement(u);
                            }
                        }
                        //Sino contiene los caracteres, el usuario ya existe, y si lo envia el mensaje
                    } else {
                        mensajes.append("" + m + "\n");//Se muestra el mensaje
                    }
                } catch (Exception e) {
                    break;
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelusuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensajes = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        btnEnviar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        UL = new javax.swing.JList<>();
        Salirbtn = new javax.swing.JButton();
        mensajeTxt = new LIB.FSTexFieldMD();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelRound1 = new LIB.JPanelRound();
        SeleTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 133, 17));
        jLabel1.setText("Bienvenido: ");

        labelusuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelusuario.setForeground(new java.awt.Color(243, 133, 17));
        labelusuario.setText("usuario");

        mensajes.setColumns(20);
        mensajes.setForeground(new java.awt.Color(38, 38, 38));
        mensajes.setRows(5);
        jScrollPane1.setViewportView(mensajes);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/SEND.png"))); // NOI18N
        btnEnviar.setBorderPainted(false);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setDefaultCapable(false);
        btnEnviar.setFocusPainted(false);
        btnEnviar.setFocusable(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        UL.setForeground(new java.awt.Color(38, 38, 38));
        jScrollPane3.setViewportView(UL);

        Salirbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Leave.png"))); // NOI18N
        Salirbtn.setBorderPainted(false);
        Salirbtn.setContentAreaFilled(false);
        Salirbtn.setDefaultCapable(false);
        Salirbtn.setRequestFocusEnabled(false);
        Salirbtn.setRolloverEnabled(false);
        Salirbtn.setVerifyInputWhenFocusTarget(false);
        Salirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirbtnActionPerformed(evt);
            }
        });

        mensajeTxt.setForeground(new java.awt.Color(184, 42, 53));
        mensajeTxt.setPlaceholder("Escribe un mensaje");
        mensajeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajeTxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 133, 17));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enviar Mensaje");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 0, 7));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Salir");

        jPanelRound1.setBackground(new java.awt.Color(184, 42, 53));
        jPanelRound1.setForeground(new java.awt.Color(184, 42, 53));
        jPanelRound1.setArch(10);
        jPanelRound1.setArcw(10);
        jPanelRound1.setColorPrimario(new java.awt.Color(184, 42, 53));
        jPanelRound1.setColorSecundario(new java.awt.Color(184, 42, 53));

        SeleTodos.setBackground(new java.awt.Color(184, 42, 53));
        SeleTodos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SeleTodos.setForeground(new java.awt.Color(255, 255, 255));
        SeleTodos.setText("Seleccionar Todos");
        SeleTodos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SeleTodos.setBorderPainted(false);
        SeleTodos.setContentAreaFilled(false);
        SeleTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SeleTodos.setDefaultCapable(false);
        SeleTodos.setFocusPainted(false);
        SeleTodos.setFocusable(false);
        SeleTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRound1Layout = new javax.swing.GroupLayout(jPanelRound1);
        jPanelRound1.setLayout(jPanelRound1Layout);
        jPanelRound1Layout.setHorizontalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SeleTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRound1Layout.setVerticalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SeleTodos, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(mensajeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(labelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Salirbtn)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(labelusuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEnviar)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(mensajeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Salirbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
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

    private void SeleTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleTodosActionPerformed
        // TODO add your handling code here:
        //Sirve para vacear la variable clienteID 
        clienteID = "";
    }//GEN-LAST:event_SeleTodosActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        //Enviar mensaje
        try {
            //'m' obtiene el mensaje del textfield
            String m = mensajeTxt.getText(), mm = m;
            //"CI" es el cliente seleccionado del Jlist
            String CI = clienteID;
            if (!UL.isSelectionEmpty()) { //Si en el user list se selecciona algun usuario se realiza lo siquiente
                CI = (String) UL.getSelectedValue();//CI Obtiene el valor del Jlist 
                //"m" se le adjunta la clave, como se define en el servidor, el usuario seleccionado, y por ultimo el mensaje
                m = "#4344554@@@@@67667@@" + CI + ":" + mm;
                dout.writeUTF(m);//Se escribe el mensaje que usuario desea enviar
                mensajeTxt.setText(""); //Se limpia el TextField
                mensajes.append("< De usted para " + CI + " > " + mm + "\n"); //Se muestra la informacion en el text area de lo anteriormente escrito
                UL.clearSelection(); //Se vacia la selección del Jlist
            } else if (UL.isSelectionEmpty()) { //Si no se realiza nunguna seleccion en la lista
                dout.writeUTF(m); //Se escribe el mensaje que el usuario desea enviar
                mensajeTxt.setText(""); //Se limpia el TextField
                mensajes.append("< De usted para todos >" + mm + "\n"); //Se muestra la información en el text area excrita anteriormente
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El usuario no existe"); //Si el usuario no se ha registrado no podrá enviar mensajes
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void SalirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirbtnActionPerformed
        // TODO add your handling code here:
        //Para salir
        //Se declara 'i', con la clave puesta en servidor
        String i = "mkoihgteazdcvgyhujb096785542AXTY";
        try {
            //Se escribe en el socket la clave 'i' y se sale el usuario
            dout.writeUTF(i);
            this.dispose();//Cierra ventana actual
        } catch (IOException e) {
            Logger.getLogger(MSNCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_SalirbtnActionPerformed

    private void mensajeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mensajeTxtActionPerformed

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
            java.util.logging.Logger.getLogger(MSNCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MSNCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MSNCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MSNCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MSNCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salirbtn;
    private javax.swing.JButton SeleTodos;
    private javax.swing.JList<String> UL;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private LIB.JPanelRound jPanelRound1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelusuario;
    private LIB.FSTexFieldMD mensajeTxt;
    private javax.swing.JTextArea mensajes;
    // End of variables declaration//GEN-END:variables
}
