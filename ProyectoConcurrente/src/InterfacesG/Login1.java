/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesG;

import Clases.usuariosAdm;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ROY78
 */
public class Login1 extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
    usuariosAdm adm[] = new usuariosAdm[1];
    usuariosAdm cliente[] = new usuariosAdm[1];
    usuariosAdm empledo[] = new usuariosAdm[1];

    public Login1() {
        initComponents();
        agregar(); //una vez que incie el programa, cargamos los adm en un vector (son los unicos que tienen el acceso)
        this.setLocationRelativeTo(null);//para centrar la pantalla
        this.getRootPane().setDefaultButton(btn_login);
        this.setTitle("LOGIN");//Poner titulo a la pestaña
    }

    private void bloquearAdm() {
        if (!Admin.isSelected()) {
            Empleado.setEnabled(true);
            Cliente.setEnabled(true);
        } else {
            Empleado.setEnabled(false);
            Cliente.setEnabled(false);
        }

    }

    private void bloquearEmpleado() {

        if (!Empleado.isSelected()) {

            Cliente.setEnabled(true);
            Admin.setEnabled(true);

        } else {
            Cliente.setEnabled(false);
            Admin.setEnabled(false);
        }

    }

    private void bloquearCliente() {

        if (!Cliente.isSelected()) {
            Admin.setEnabled(true);
            Empleado.setEnabled(true);
        } else {
            Admin.setEnabled(false);
            Empleado.setEnabled(false);
        }

    }

    public void agregar() { //agregamos los usuarios adm al vector
        usuariosAdm adms = new usuariosAdm("adm", "adm");
        adm[0] = adms;
        usuariosAdm cli = new usuariosAdm("cliente", "cliente");
        cliente[0] = cli;
        usuariosAdm emp = new usuariosAdm("empleado", "empleado");
        empledo[0] = emp;

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
        jEImagePanel1 = new LIB.JEImagePanel();
        jLabel1 = new javax.swing.JLabel();
        nombreUsuario = new LIB.FSTexFieldMD();
        jPanelRound1 = new LIB.JPanelRound();
        btn_login = new LIB.FSButtonMD();
        contrasena = new LIB.FSPasswordFieldMD();
        jEImagePanel3 = new LIB.JEImagePanel();
        jEImagePanel4 = new LIB.JEImagePanel();
        Cliente = new javax.swing.JCheckBox();
        Admin = new javax.swing.JCheckBox();
        Empleado = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BurguerMenu.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 133, 17));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO J-P-R");

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jPanel1.add(jEImagePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 0, -1, -1));

        nombreUsuario.setForeground(new java.awt.Color(214, 40, 57));
        nombreUsuario.setPlaceholder("Usuario");
        jPanel1.add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jPanelRound1.setBackground(new java.awt.Color(243, 133, 17));
        jPanelRound1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelRound1.setForeground(new java.awt.Color(255, 255, 255));
        jPanelRound1.setArch(35);
        jPanelRound1.setArcw(35);
        jPanelRound1.setAutoscrolls(true);
        jPanelRound1.setColorPrimario(new java.awt.Color(243, 133, 17));
        jPanelRound1.setColorSecundario(new java.awt.Color(243, 133, 17));
        jPanelRound1.setFocusCycleRoot(true);
        jPanelRound1.setFocusTraversalPolicyProvider(true);
        jPanelRound1.setInheritsPopupMenu(true);
        jPanelRound1.setOpaque(true);

        btn_login.setBackground(new java.awt.Color(243, 133, 17));
        btn_login.setText("INGRESAR");
        btn_login.setColorHover(new java.awt.Color(243, 133, 17));
        btn_login.setColorNormal(new java.awt.Color(243, 133, 17));
        btn_login.setColorPressed(new java.awt.Color(243, 133, 17));
        btn_login.setColorTextHover(new java.awt.Color(255, 255, 255));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRound1Layout = new javax.swing.GroupLayout(jPanelRound1);
        jPanelRound1.setLayout(jPanelRound1Layout);
        jPanelRound1Layout.setHorizontalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRound1Layout.setVerticalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 250, 60));

        contrasena.setForeground(new java.awt.Color(214, 40, 57));
        contrasena.setPlaceholder("Contraseña");
        contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 250, -1));

        jEImagePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel3Layout = new javax.swing.GroupLayout(jEImagePanel3);
        jEImagePanel3.setLayout(jEImagePanel3Layout);
        jEImagePanel3Layout.setHorizontalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jEImagePanel3Layout.setVerticalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jEImagePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 20, 20));

        jEImagePanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/locker.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel4Layout = new javax.swing.GroupLayout(jEImagePanel4);
        jEImagePanel4.setLayout(jEImagePanel4Layout);
        jEImagePanel4Layout.setHorizontalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jEImagePanel4Layout.setVerticalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jEImagePanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 20, 20));

        Cliente.setBackground(new java.awt.Color(255, 255, 255));
        Cliente.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        jPanel1.add(Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        Admin.setBackground(new java.awt.Color(255, 255, 255));
        Admin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Admin.setText("Administrador");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        jPanel1.add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        Empleado.setBackground(new java.awt.Color(255, 255, 255));
        Empleado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Empleado.setText("Empleado");
        Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione el tipo de usuario antes de ingresar.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 410, -1));

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

    usuariosAdm admx;
    usuariosAdm clix;
    usuariosAdm chx;

    boolean validacion = false;
    boolean mensaje = false;
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        String nombreUsua = nombreUsuario.getText(); // obtenemos el nombre usuario
        String contra = new String(contrasena.getPassword()); // obtenemos la contrasena del usuario

        //por medio de este if evaluamos si el usuario completo los espacios de los contrario le mostrara un mensaje de que tiene llenarlos
        if (Admin.isSelected()) {
            if (nombreUsua.equals("") || contra.equals("")) {
                JOptionPane.showMessageDialog(null, "DEBE DE COMPLETAR LOS ESPACIOS");
            } else {
                for (int i = 0; i < adm.length; i++) { // recorremos el vector
                    if (adm[i].getNombre().equals(nombreUsua)) { // comparamos el nombre usuario digitado con la del usuario registrado
                        if (adm[i].getContrasena().equals(contra)) {//en caso de que consida con el nombre usuario, comparamos la contrasena digitada con la contrasena del usuario
                            //admx = adm[i];
                            validacion = true; //le decimos que la valicacion es true ya que cumple con todas la comparaciones
                        } else {
                            mensaje = true; // en caso de cumpla con el nombre de usuario pero no con la contrasena le enviaremos un mensaje de que la contrasena no coinciden
                        }
                    } else {

                    }
                }

                if (validacion == true) { // al ser la valicacion ser true, le damos el permiso al usuario de iniciar con el progrma
                    MenuAdmin1 menuadm = new MenuAdmin1();
                    menuadm.setVisible(true);
                    setText();
                    validacion = false;
                } else {
                    if (mensaje == true) { // al cumplir con el nombre de usuario pero no con la contraena, le mostramos un mensaje de que la contrasena esta incorrecta
                        JOptionPane.showMessageDialog(null, "CONTRASEÑA NO COINCIDE CON EL DE USUARIO REGISTRADO", "VALIDACION", JOptionPane.ERROR_MESSAGE);
                        mensaje = false;
                        contra = "";
                    } else { // de no cumplir con el usuario, se le mostrara un mensaje de que el usuario que digito no esta registrado
                        JOptionPane.showMessageDialog(null, "NO SE ENCONTRO USUARIO", "VALIDACIÓN", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        }

        if (Cliente.isSelected()) {
            if (nombreUsuario.equals("") || contrasena.equals("")) {
                JOptionPane.showMessageDialog(null, "DEBE DE LLENAR LOS ESPACIOS DE VALIDACION", "VALIDACION", JOptionPane.ERROR_MESSAGE);

            }
            if (nombreUsua.equals("") || contra.equals("")) {
                JOptionPane.showMessageDialog(null, "DEBE DE COMPLETAR LOS ESPACIOS");
            } else {
                for (int i = 0; i < cliente.length; i++) { // recorremos el vector
                    if (cliente[i].getNombre().equals(nombreUsua)) { // comparamos el nombre usuario digitado con la del usuario registrado
                        if (cliente[i].getContrasena().equals(contra)) {//en caso de que consida con el nombre usuario, comparamos la contrasena digitada con la contrasena del usuario
//                            clix = cliente[i];
                            validacion = true; //le decimos que la valicacion es true ya que cumple con todas la comparaciones
                        } else {
                            mensaje = true; // en caso de cumpla con el nombre de usuario pero no con la contrasena le enviaremos un mensaje de que la contrasena no coinciden
                        }
                    } else {

                    }
                }

                if (validacion == true) { // al ser la valicacion ser true, le damos el permiso al usuario de iniciar con el progrma
                    MenuCliente1 menucli;
                    try {
                        menucli = new MenuCliente1();
                        menucli.setVisible(true);
                    } catch (Exception ex) {
                        Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    setText();
                    validacion = false;
                } else {
                    if (mensaje == true) { // al cumplir con el nombre de usuario pero no con la contraena, le mostramos un mensaje de que la contrasena esta incorrecta
                        JOptionPane.showMessageDialog(null, "CONTRASEÑA NO COINCIDE CON EL DE USUARIO REGISTRADO", "VALIDACION", JOptionPane.ERROR_MESSAGE);
                        mensaje = false;
                        contra = "";
                    } else { // de no cumplir con el usuario, se le mostrara un mensaje de que el usuario que digito no esta registrado
                        JOptionPane.showMessageDialog(null, "NO SE ENCONTRO USUARIO", "VALIDACIÓN", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        }

        if (Empleado.isSelected()) {
            if (nombreUsuario.equals("") || contrasena.equals("")) {
                JOptionPane.showMessageDialog(null, "DEBE DE LLENAR LOS ESPACIOS DE VALIDACION", "VALIDACION", JOptionPane.ERROR_MESSAGE);

            }
            if (nombreUsua.equals("") || contra.equals("")) {
                JOptionPane.showMessageDialog(null, "DEBE DE COMPLETAR LOS ESPACIOS");
            } else {
                for (int i = 0; i < cliente.length; i++) { // recorremos el vector
                    if (empledo[i].getNombre().equals(nombreUsua)) { // comparamos el nombre usuario digitado con la del usuario registrado
                        if (empledo[i].getContrasena().equals(contra)) {//en caso de que consida con el nombre usuario, comparamos la contrasena digitada con la contrasena del usuario
//                            chx = empledo[i];
                            validacion = true; //le decimos que la valicacion es true ya que cumple con todas la comparaciones
                        } else {
                            mensaje = true; // en caso de cumpla con el nombre de usuario pero no con la contrasena le enviaremos un mensaje de que la contrasena no coinciden
                        }
                    } else {

                    }
                }

                if (validacion == true) { // al ser la valicacion ser true, le damos el permiso al usuario de iniciar con el progrma
                    Menu1 menu = new Menu1();
                    menu.setVisible(true);
                    setText();
                    validacion = false;
                } else {
                    if (mensaje == true) { // al cumplir con el nombre de usuario pero no con la contraena, le mostramos un mensaje de que la contrasena esta incorrecta
                        JOptionPane.showMessageDialog(null, "CONTRASEÑA NO COINCIDE CON EL DE USUARIO REGISTRADO", "VALIDACION", JOptionPane.ERROR_MESSAGE);
                        mensaje = false;
                        contra = "";
                    } else { // de no cumplir con el usuario, se le mostrara un mensaje de que el usuario que digito no esta registrado
                        JOptionPane.showMessageDialog(null, "NO SE ENCONTRO USUARIO", "VALIDACIÓN", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
        bloquearCliente();
    }//GEN-LAST:event_ClienteActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        // TODO add your handling code here:
        bloquearAdm();
    }//GEN-LAST:event_AdminActionPerformed

    private void EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoActionPerformed
        // TODO add your handling code here:
        bloquearEmpleado();
    }//GEN-LAST:event_EmpleadoActionPerformed

    private void contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaActionPerformed

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Admin;
    private javax.swing.JCheckBox Cliente;
    private javax.swing.JCheckBox Empleado;
    private LIB.FSButtonMD btn_login;
    private LIB.FSPasswordFieldMD contrasena;
    private LIB.JEImagePanel jEImagePanel1;
    private LIB.JEImagePanel jEImagePanel3;
    private LIB.JEImagePanel jEImagePanel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private LIB.JPanelRound jPanelRound1;
    private LIB.FSTexFieldMD nombreUsuario;
    // End of variables declaration//GEN-END:variables
    //Metodo para vaciar textfields
    private void setText() {
        nombreUsuario.setText("");
        contrasena.setText("");
    }
}
