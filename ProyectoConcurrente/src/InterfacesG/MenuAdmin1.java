/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesG;

import Clases.Administrador;
import Clases.producto;
import javax.swing.JOptionPane;

/**
 *
 * @author ROY78
 */
public class MenuAdmin1 extends javax.swing.JFrame {

    producto pro = new producto();

    /**
     * Creates new form MenuAdmin1
     */
    public MenuAdmin1() {
        initComponents();
        this.setLocationRelativeTo(null);//para centrar la pantalla
        this.setTitle("MENU ADMINISTRADOR");//Poner titulo a la pestaña
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuAdmin = new javax.swing.JTabbedPane();
        AgregarEmpleado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_chef = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_mesero = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_admi1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        EliminarEmpleado = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_chef1 = new javax.swing.JButton();
        btn_mesero1 = new javax.swing.JButton();
        btn_admi2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        AgregarProducto = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jEImagePanel2 = new LIB.JEImagePanel();
        jEImagePanel1 = new LIB.JEImagePanel();
        Campos = new javax.swing.JLabel();
        nombreProducto = new LIB.FSTexFieldMD();
        PrecioPro = new LIB.FSTexFieldMD();
        CodigoPro = new LIB.FSTexFieldMD();
        btnagregarprodu = new javax.swing.JButton();
        jEImagePanel4 = new LIB.JEImagePanel();
        jButton3 = new javax.swing.JButton();
        ChatSugerencias = new javax.swing.JPanel();
        Registro = new javax.swing.JButton();
        Servidor = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Campos2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Planilla = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MostrarEmpleados = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        EliminarProducto = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jEImagePanel3 = new LIB.JEImagePanel();
        codigopro = new LIB.FSTexFieldMD();
        Campos1 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuAdmin.setBackground(new java.awt.Color(255, 255, 255));
        MenuAdmin.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        MenuAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        AgregarEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        AgregarEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AgregarEmpleado.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 133, 17));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR EMPLEADO");
        AgregarEmpleado.add(jLabel1);
        jLabel1.setBounds(0, 89, 720, 55);

        btn_chef.setBackground(new java.awt.Color(255, 255, 255));
        btn_chef.setForeground(new java.awt.Color(255, 255, 255));
        btn_chef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CHEF.png"))); // NOI18N
        btn_chef.setBorderPainted(false);
        btn_chef.setContentAreaFilled(false);
        btn_chef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chefActionPerformed(evt);
            }
        });
        AgregarEmpleado.add(btn_chef);
        btn_chef.setBounds(80, 190, 162, 127);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(184, 42, 53));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CHEF");
        AgregarEmpleado.add(jLabel2);
        jLabel2.setBounds(80, 340, 161, 24);

        btn_mesero.setBackground(new java.awt.Color(255, 255, 255));
        btn_mesero.setForeground(new java.awt.Color(255, 255, 255));
        btn_mesero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mesero.png"))); // NOI18N
        btn_mesero.setBorderPainted(false);
        btn_mesero.setContentAreaFilled(false);
        btn_mesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_meseroActionPerformed(evt);
            }
        });
        AgregarEmpleado.add(btn_mesero);
        btn_mesero.setBounds(280, 180, 162, 155);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(184, 42, 53));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MESERO");
        AgregarEmpleado.add(jLabel3);
        jLabel3.setBounds(280, 340, 161, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(184, 42, 53));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADMINISTRADOR");
        AgregarEmpleado.add(jLabel4);
        jLabel4.setBounds(490, 340, 161, 24);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SELECCIONE EL TIPO DE EMPLEADO");
        AgregarEmpleado.add(jLabel5);
        jLabel5.setBounds(0, 436, 720, 36);

        btn_admi1.setBackground(new java.awt.Color(255, 255, 255));
        btn_admi1.setForeground(new java.awt.Color(255, 255, 255));
        btn_admi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ADMIN.png"))); // NOI18N
        btn_admi1.setBorderPainted(false);
        btn_admi1.setContentAreaFilled(false);
        btn_admi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admi1ActionPerformed(evt);
            }
        });
        AgregarEmpleado.add(btn_admi1);
        btn_admi1.setBounds(490, 190, 162, 127);

        jButton5.setBackground(new java.awt.Color(243, 133, 17));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/backprueba2.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setDefaultCapable(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        AgregarEmpleado.add(jButton5);
        jButton5.setBounds(10, 11, 64, 29);

        MenuAdmin.addTab("Agregar Empleado", AgregarEmpleado);

        EliminarEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        EliminarEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EliminarEmpleado.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(243, 133, 17));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ELIMINAR EMPLEADO");
        EliminarEmpleado.add(jLabel6);
        jLabel6.setBounds(0, 83, 720, 55);

        btn_chef1.setBackground(new java.awt.Color(255, 255, 255));
        btn_chef1.setForeground(new java.awt.Color(255, 255, 255));
        btn_chef1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CHEF.png"))); // NOI18N
        btn_chef1.setBorderPainted(false);
        btn_chef1.setContentAreaFilled(false);
        btn_chef1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chef1ActionPerformed(evt);
            }
        });
        EliminarEmpleado.add(btn_chef1);
        btn_chef1.setBounds(70, 180, 162, 129);

        btn_mesero1.setBackground(new java.awt.Color(255, 255, 255));
        btn_mesero1.setForeground(new java.awt.Color(255, 255, 255));
        btn_mesero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mesero.png"))); // NOI18N
        btn_mesero1.setBorderPainted(false);
        btn_mesero1.setContentAreaFilled(false);
        btn_mesero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mesero1ActionPerformed(evt);
            }
        });
        EliminarEmpleado.add(btn_mesero1);
        btn_mesero1.setBounds(270, 170, 176, 155);

        btn_admi2.setBackground(new java.awt.Color(255, 255, 255));
        btn_admi2.setForeground(new java.awt.Color(255, 255, 255));
        btn_admi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ADMIN.png"))); // NOI18N
        btn_admi2.setBorderPainted(false);
        btn_admi2.setContentAreaFilled(false);
        btn_admi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admi2ActionPerformed(evt);
            }
        });
        EliminarEmpleado.add(btn_admi2);
        btn_admi2.setBounds(490, 170, 162, 156);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SELECCIONE EL TIPO DE EMPLEADO");
        EliminarEmpleado.add(jLabel7);
        jLabel7.setBounds(0, 439, 710, 36);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(184, 42, 53));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ADMINISTRADOR");
        EliminarEmpleado.add(jLabel8);
        jLabel8.setBounds(490, 330, 161, 24);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(184, 42, 53));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MESERO");
        EliminarEmpleado.add(jLabel9);
        jLabel9.setBounds(270, 330, 176, 25);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(184, 42, 53));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CHEF");
        EliminarEmpleado.add(jLabel10);
        jLabel10.setBounds(70, 330, 161, 24);

        jButton4.setBackground(new java.awt.Color(243, 133, 17));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/backprueba2.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setDefaultCapable(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        EliminarEmpleado.add(jButton4);
        jButton4.setBounds(10, 11, 60, 30);

        MenuAdmin.addTab("Eliminar Empleado", EliminarEmpleado);

        AgregarProducto.setBackground(new java.awt.Color(255, 255, 255));
        AgregarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AgregarProducto.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(243, 133, 17));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("AGREGAR PRODUCTO");
        AgregarProducto.add(jLabel11);
        jLabel11.setBounds(0, 76, 710, 55);

        jEImagePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nombreproducto.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel2Layout = new javax.swing.GroupLayout(jEImagePanel2);
        jEImagePanel2.setLayout(jEImagePanel2Layout);
        jEImagePanel2Layout.setHorizontalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jEImagePanel2Layout.setVerticalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        AgregarProducto.add(jEImagePanel2);
        jEImagePanel2.setBounds(210, 170, 32, 32);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/codigo.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        AgregarProducto.add(jEImagePanel1);
        jEImagePanel1.setBounds(210, 250, 32, 32);

        Campos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Campos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Campos.setText("Recuerde llenar todos los campos");
        AgregarProducto.add(Campos);
        Campos.setBounds(0, 480, 710, 28);

        nombreProducto.setForeground(new java.awt.Color(184, 42, 53));
        nombreProducto.setPlaceholder("Nombre del producto");
        AgregarProducto.add(nombreProducto);
        nombreProducto.setBounds(250, 160, 241, 42);

        PrecioPro.setForeground(new java.awt.Color(184, 42, 53));
        PrecioPro.setPlaceholder("Precio del producto");
        AgregarProducto.add(PrecioPro);
        PrecioPro.setBounds(250, 320, 241, 42);

        CodigoPro.setForeground(new java.awt.Color(184, 42, 53));
        CodigoPro.setPlaceholder("Código del producto");
        AgregarProducto.add(CodigoPro);
        CodigoPro.setBounds(250, 240, 241, 42);

        btnagregarprodu.setBackground(new java.awt.Color(255, 255, 255));
        btnagregarprodu.setForeground(new java.awt.Color(255, 255, 255));
        btnagregarprodu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        btnagregarprodu.setToolTipText("");
        btnagregarprodu.setBorderPainted(false);
        btnagregarprodu.setContentAreaFilled(false);
        btnagregarprodu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarproduActionPerformed(evt);
            }
        });
        AgregarProducto.add(btnagregarprodu);
        btnagregarprodu.setBounds(0, 390, 710, 74);

        jEImagePanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/precio.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel4Layout = new javax.swing.GroupLayout(jEImagePanel4);
        jEImagePanel4.setLayout(jEImagePanel4Layout);
        jEImagePanel4Layout.setHorizontalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jEImagePanel4Layout.setVerticalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        AgregarProducto.add(jEImagePanel4);
        jEImagePanel4.setBounds(210, 330, 32, 32);

        jButton3.setBackground(new java.awt.Color(243, 133, 17));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/backprueba2.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setDefaultCapable(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        AgregarProducto.add(jButton3);
        jButton3.setBounds(10, 11, 60, 30);

        MenuAdmin.addTab("Agregar Producto", AgregarProducto);

        ChatSugerencias.setBackground(new java.awt.Color(255, 255, 255));
        ChatSugerencias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ChatSugerencias.setLayout(null);

        Registro.setBackground(new java.awt.Color(255, 255, 255));
        Registro.setForeground(new java.awt.Color(255, 255, 255));
        Registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CHAT.png"))); // NOI18N
        Registro.setBorderPainted(false);
        Registro.setContentAreaFilled(false);
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });
        ChatSugerencias.add(Registro);
        Registro.setBounds(360, 170, 162, 129);

        Servidor.setBackground(new java.awt.Color(255, 255, 255));
        Servidor.setForeground(new java.awt.Color(255, 255, 255));
        Servidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/SERVER.png"))); // NOI18N
        Servidor.setBorderPainted(false);
        Servidor.setContentAreaFilled(false);
        Servidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServidorActionPerformed(evt);
            }
        });
        ChatSugerencias.add(Servidor);
        Servidor.setBounds(180, 170, 162, 129);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(243, 133, 17));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CHAT DE SUGERENCIAS");
        ChatSugerencias.add(jLabel13);
        jLabel13.setBounds(0, 87, 710, 55);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(184, 42, 53));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("INICIAR SERVIDOR");
        ChatSugerencias.add(jLabel14);
        jLabel14.setBounds(180, 330, 161, 24);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(184, 42, 53));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("UNIRSE AL CHAT");
        ChatSugerencias.add(jLabel15);
        jLabel15.setBounds(360, 330, 161, 24);

        Campos2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Campos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Campos2.setText("Debe iniciar el servidor primero");
        ChatSugerencias.add(Campos2);
        Campos2.setBounds(0, 415, 710, 28);

        jButton1.setBackground(new java.awt.Color(243, 133, 17));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/backprueba2.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ChatSugerencias.add(jButton1);
        jButton1.setBounds(10, 11, 65, 30);

        MenuAdmin.addTab("Chat Sugerencias", ChatSugerencias);

        Planilla.setBackground(new java.awt.Color(255, 255, 255));
        Planilla.setLayout(null);

        jButton6.setBackground(new java.awt.Color(243, 133, 17));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/backprueba2.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setDefaultCapable(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Planilla.add(jButton6);
        jButton6.setBounds(10, 11, 60, 30);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(243, 133, 17));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Planilla Salarios");
        Planilla.add(jLabel16);
        jLabel16.setBounds(0, 52, 710, 55);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(214, 40, 57));
        jScrollPane1.setViewportView(jTable1);

        Planilla.add(jScrollPane1);
        jScrollPane1.setBounds(10, 113, 690, 280);

        MostrarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Planilla.png"))); // NOI18N
        MostrarEmpleados.setBorderPainted(false);
        MostrarEmpleados.setContentAreaFilled(false);
        MostrarEmpleados.setFocusPainted(false);
        MostrarEmpleados.setFocusable(false);
        MostrarEmpleados.setRequestFocusEnabled(false);
        MostrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarEmpleadosActionPerformed(evt);
            }
        });
        Planilla.add(MostrarEmpleados);
        MostrarEmpleados.setBounds(10, 400, 690, 70);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(243, 133, 17));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Mostrar Planilla");
        Planilla.add(jLabel17);
        jLabel17.setBounds(0, 480, 710, 20);

        MenuAdmin.addTab("Planilla", Planilla);

        EliminarProducto.setBackground(new java.awt.Color(255, 255, 255));
        EliminarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EliminarProducto.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(243, 133, 17));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ElIMINAR PRODUCTO");
        EliminarProducto.add(jLabel12);
        jLabel12.setBounds(0, 89, 710, 55);

        jEImagePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/codigo.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel3Layout = new javax.swing.GroupLayout(jEImagePanel3);
        jEImagePanel3.setLayout(jEImagePanel3Layout);
        jEImagePanel3Layout.setHorizontalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jEImagePanel3Layout.setVerticalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        EliminarProducto.add(jEImagePanel3);
        jEImagePanel3.setBounds(208, 220, 32, 32);

        codigopro.setForeground(new java.awt.Color(184, 42, 53));
        codigopro.setPlaceholder("Código del producto");
        codigopro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoproActionPerformed(evt);
            }
        });
        EliminarProducto.add(codigopro);
        codigopro.setBounds(246, 210, 250, 42);

        Campos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Campos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Campos1.setText("Recuerde llenar todos los campos");
        EliminarProducto.add(Campos1);
        Campos1.setBounds(0, 444, 710, 28);

        btn_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete.png"))); // NOI18N
        btn_eliminar.setBorderPainted(false);
        btn_eliminar.setContentAreaFilled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        EliminarProducto.add(btn_eliminar);
        btn_eliminar.setBounds(0, 331, 710, 74);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/backprueba2.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setDefaultCapable(false);
        jButton2.setFocusPainted(false);
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        EliminarProducto.add(jButton2);
        jButton2.setBounds(10, 11, 63, 29);

        MenuAdmin.addTab("Eliminar Producto", EliminarProducto);

        getContentPane().add(MenuAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarproduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarproduActionPerformed
        //Se recolectan los datos
        String id = CodigoPro.getText();
        String nombre = nombreProducto.getText();
        String precio = PrecioPro.getText();
        //Se verifica que todos los campos esten completos para poder agregar el producto
        if (id.equals("") || nombre.equals("") || precio.equals("")) {
            Campos.setText("DEBE DE COMPLETAR LOS ESPACIOS");
        } else {
            pro.AdminAgrega(CodigoPro, nombreProducto, PrecioPro, Campos);
            setText();
        }
    }//GEN-LAST:event_btnagregarproduActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        if (codigopro.getText().equals("")) {
            Campos1.setText("Digite un código");
        } else {
            // Llama al metodo de eliminar producto
            pro.AdminBorra(codigopro, Campos1);
            codigopro.setText("");
        }

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void codigoproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoproActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        //Se hace visible el frame del registro del cliente
        RegistroCliente rc = new RegistroCliente();
        rc.setVisible(true);
    }//GEN-LAST:event_RegistroActionPerformed

    private void ServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServidorActionPerformed
        //Llama al frame servidor
        Servidor s = new Servidor();
        s.setVisible(true);
    }//GEN-LAST:event_ServidorActionPerformed

    private void btn_admi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admi2ActionPerformed
        //Llama al método para eliminar el admi
        EliminarAdministrador1 admin = new EliminarAdministrador1();
        admin.setVisible(true);
    }//GEN-LAST:event_btn_admi2ActionPerformed

    private void btn_mesero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mesero1ActionPerformed
        //Llama al metodo para eliminsr al mesero
        EliminarMesero1 mesero = new EliminarMesero1();
        mesero.setVisible(true);
    }//GEN-LAST:event_btn_mesero1ActionPerformed

    private void btn_chef1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chef1ActionPerformed
        //Llama al metodo de eliminar al chef
        EliminarChef1 chef = new EliminarChef1();
        chef.setVisible(true);
    }//GEN-LAST:event_btn_chef1ActionPerformed

    private void btn_admi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admi1ActionPerformed
        //Llama al metodo de agregar admi
        AgregarAdministrador1 admin = new AgregarAdministrador1();
        admin.setVisible(true);
    }//GEN-LAST:event_btn_admi1ActionPerformed

    private void btn_meseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_meseroActionPerformed
        //Llama al metodo de agregar mesero
        AgregarMesero1 mesero = new AgregarMesero1();
        mesero.setVisible(true);
    }//GEN-LAST:event_btn_meseroActionPerformed

    private void btn_chefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chefActionPerformed
        //Llama la metodo de agregar chef
        AgregarChef1 chef = new AgregarChef1();
        chef.setVisible(true);
    }//GEN-LAST:event_btn_chefActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Cierra la ventana actual
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Cierra la ventana actual
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Cierra la ventana actual
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Cierra la ventana actual
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Cierra la ventana actual
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Cierra la ventana actual
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void MostrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarEmpleadosActionPerformed
        //Llama al metodo para mostrar a los empleados
        Administrador ad = new Administrador();
        ad.mostrarEmpleados(jTable1);
    }//GEN-LAST:event_MostrarEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarEmpleado;
    private javax.swing.JPanel AgregarProducto;
    private javax.swing.JLabel Campos;
    private javax.swing.JLabel Campos1;
    private javax.swing.JLabel Campos2;
    private javax.swing.JPanel ChatSugerencias;
    private LIB.FSTexFieldMD CodigoPro;
    private javax.swing.JPanel EliminarEmpleado;
    private javax.swing.JPanel EliminarProducto;
    private javax.swing.JTabbedPane MenuAdmin;
    private javax.swing.JButton MostrarEmpleados;
    private javax.swing.JPanel Planilla;
    private LIB.FSTexFieldMD PrecioPro;
    private javax.swing.JButton Registro;
    private javax.swing.JButton Servidor;
    private javax.swing.JButton btn_admi1;
    private javax.swing.JButton btn_admi2;
    private javax.swing.JButton btn_chef;
    private javax.swing.JButton btn_chef1;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_mesero;
    private javax.swing.JButton btn_mesero1;
    private javax.swing.JButton btnagregarprodu;
    private LIB.FSTexFieldMD codigopro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private LIB.JEImagePanel jEImagePanel1;
    private LIB.JEImagePanel jEImagePanel2;
    private LIB.JEImagePanel jEImagePanel3;
    private LIB.JEImagePanel jEImagePanel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private LIB.FSTexFieldMD nombreProducto;
    // End of variables declaration//GEN-END:variables
    private void setText() {
        CodigoPro.setText("");
        PrecioPro.setText("");
        nombreProducto.setText("");
    }
}
