/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesG;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import Clases.Chef;
import Clases.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author ROY78
 */
public class AgregarChef1 extends javax.swing.JFrame {

    /**
     * Creates new form AgregarChef1
     */
    public AgregarChef1() {
        initComponents();
        this.setLocationRelativeTo(null);//para centrar la pantalla
        this.setTitle("Agregar Chef");
        this.getRootPane().setDefaultButton(btn_agregarChef);
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
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        nombreChef = new LIB.FSTexFieldMD();
        idChef = new LIB.FSTexFieldMD();
        nacimientoChef = new LIB.FSTexFieldMD();
        EspecialidadChef = new LIB.FSTexFieldMD();
        jLabel14 = new javax.swing.JLabel();
        jEImagePanel1 = new LIB.JEImagePanel();
        jEImagePanel2 = new LIB.JEImagePanel();
        jEImagePanel3 = new LIB.JEImagePanel();
        status = new javax.swing.JLabel();
        btn_agregarChef = new javax.swing.JButton();
        jEImagePanel4 = new LIB.JEImagePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 133, 17));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR CHEF");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 587, 55));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/backprueba2.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setDefaultCapable(false);
        btnRegresar.setFocusPainted(false);
        btnRegresar.setFocusable(false);
        btnRegresar.setRequestFocusEnabled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 60, 29));

        nombreChef.setForeground(new java.awt.Color(184, 42, 53));
        nombreChef.setPlaceholder("Ingrese Nombre");
        nombreChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreChefActionPerformed(evt);
            }
        });
        jPanel1.add(nombreChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 230, -1));

        idChef.setForeground(new java.awt.Color(184, 42, 53));
        idChef.setPlaceholder("Ingrese ID");
        idChef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idChefKeyTyped(evt);
            }
        });
        jPanel1.add(idChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 230, -1));

        nacimientoChef.setForeground(new java.awt.Color(184, 42, 53));
        nacimientoChef.setPlaceholder("Ingrese Fecha de nacimiento");
        jPanel1.add(nacimientoChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 262, 230, 40));

        EspecialidadChef.setForeground(new java.awt.Color(184, 42, 53));
        EspecialidadChef.setPlaceholder("Ingrese Especialidad");
        jPanel1.add(EspecialidadChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 230, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(243, 133, 17));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Agregar Chef");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 587, -1));

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ID.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanel1.add(jEImagePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 30, -1));

        jEImagePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PERSON.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel2Layout = new javax.swing.GroupLayout(jEImagePanel2);
        jEImagePanel2.setLayout(jEImagePanel2Layout);
        jEImagePanel2Layout.setHorizontalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jEImagePanel2Layout.setVerticalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanel1.add(jEImagePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 30, -1));

        jEImagePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calendar1.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel3Layout = new javax.swing.GroupLayout(jEImagePanel3);
        jEImagePanel3.setLayout(jEImagePanel3Layout);
        jEImagePanel3Layout.setHorizontalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jEImagePanel3Layout.setVerticalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jEImagePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 30, 30));

        status.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setText("Recuerde llenar todos los campos");
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 590, 27));

        btn_agregarChef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        btn_agregarChef.setBorderPainted(false);
        btn_agregarChef.setContentAreaFilled(false);
        btn_agregarChef.setDefaultCapable(false);
        btn_agregarChef.setFocusPainted(false);
        btn_agregarChef.setFocusable(false);
        btn_agregarChef.setRequestFocusEnabled(false);
        btn_agregarChef.setVerifyInputWhenFocusTarget(false);
        btn_agregarChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarChefActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregarChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 587, -1));

        jEImagePanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/especialidad.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel4Layout = new javax.swing.GroupLayout(jEImagePanel4);
        jEImagePanel4.setLayout(jEImagePanel4Layout);
        jEImagePanel4Layout.setHorizontalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jEImagePanel4Layout.setVerticalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jEImagePanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void nombreChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreChefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreChefActionPerformed

    private void btn_agregarChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarChefActionPerformed
        // TODO add your handling code here:
        //Se agregan los datos a variables
        String id = idChef.getText();
        String nombre = nombreChef.getText();
        String nacimiento = nacimientoChef.getText();
        String espe = EspecialidadChef.getText();
        //Se verifica que todos los campos esten completos para poder agregar al chef
        if (id.equals("") || nombre.equals("") || nacimiento.equals("") || espe.equals("")) {
            JOptionPane.showMessageDialog(null, "DEBE DE COMPLETAR LOS ESPACIOS");
        } else {
            Empleado e = new Empleado();
            Chef chefcito = new Chef();

            chefcito.AgregarDatos(idChef, nombreChef, nacimientoChef, EspecialidadChef);
            e.agregarChef(chefcito);
            //Se verifica que se agregó bien
            e.desplegarEmpleado();
            status.setText("Chef Agregado!");
            SetText();
        }
    }//GEN-LAST:event_btn_agregarChefActionPerformed

    private void idChefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idChefKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_idChefKeyTyped

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
            java.util.logging.Logger.getLogger(AgregarChef1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarChef1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarChef1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarChef1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarChef1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSTexFieldMD EspecialidadChef;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btn_agregarChef;
    private LIB.FSTexFieldMD idChef;
    private LIB.JEImagePanel jEImagePanel1;
    private LIB.JEImagePanel jEImagePanel2;
    private LIB.JEImagePanel jEImagePanel3;
    private LIB.JEImagePanel jEImagePanel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private LIB.FSTexFieldMD nacimientoChef;
    private LIB.FSTexFieldMD nombreChef;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
     //Metodo para vaciar los textfields
    private void SetText() {
        idChef.setText("");
        EspecialidadChef.setText("");
        nacimientoChef.setText("");
        nombreChef.setText("");
    }
}
