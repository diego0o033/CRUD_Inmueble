
package Vista;


/**
 *
 * @author diego vargas
 */
public class Registro_Nuevo extends javax.swing.JFrame {

    
    public Registro_Nuevo() 
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btb_guardar_registro = new javax.swing.JButton();
        caja_nombre = new javax.swing.JTextField();
        caja_ape = new javax.swing.JTextField();
        caja_usu = new javax.swing.JTextField();
        caja_email = new javax.swing.JTextField();
        caja_pass = new javax.swing.JPasswordField();
        caja_conf_pass = new javax.swing.JPasswordField();
        jdc_fecha_alta = new com.toedter.calendar.JDateChooser();
        combo_roles = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btb_guardar_registro.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btb_guardar_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/draw_32.png"))); // NOI18N
        btb_guardar_registro.setText("Guardar Registro");
        btb_guardar_registro.setBorder(null);
        btb_guardar_registro.setBorderPainted(false);
        btb_guardar_registro.setContentAreaFilled(false);
        btb_guardar_registro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btb_guardar_registro.setDefaultCapable(false);
        btb_guardar_registro.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btb_guardar_registro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btb_guardar_registro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/draw_40.png"))); // NOI18N
        btb_guardar_registro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/edit_32.png"))); // NOI18N
        btb_guardar_registro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btb_guardar_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 130, -1));

        caja_nombre.setFont(new java.awt.Font("Stencil", 2, 14)); // NOI18N
        caja_nombre.setBorder(null);
        jPanel1.add(caja_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 150, 30));

        caja_ape.setFont(new java.awt.Font("Stencil", 2, 14)); // NOI18N
        caja_ape.setBorder(null);
        jPanel1.add(caja_ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 150, 30));

        caja_usu.setFont(new java.awt.Font("Stencil", 2, 14)); // NOI18N
        caja_usu.setBorder(null);
        jPanel1.add(caja_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 150, 30));

        caja_email.setFont(new java.awt.Font("Stencil", 2, 14)); // NOI18N
        caja_email.setBorder(null);
        jPanel1.add(caja_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 150, 30));

        caja_pass.setFont(new java.awt.Font("Stencil", 2, 14)); // NOI18N
        caja_pass.setBorder(null);
        jPanel1.add(caja_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 150, 30));

        caja_conf_pass.setFont(new java.awt.Font("Stencil", 2, 14)); // NOI18N
        caja_conf_pass.setBorder(null);
        jPanel1.add(caja_conf_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 150, 30));

        jdc_fecha_alta.setBackground(new java.awt.Color(51, 153, 255));
        jdc_fecha_alta.setForeground(new java.awt.Color(204, 204, 204));
        jdc_fecha_alta.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(jdc_fecha_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 150, 30));

        combo_roles.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        combo_roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Admin", "Usuario inv." }));
        combo_roles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel1.add(combo_roles, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 150, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel5.setText("Confirmar Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 255, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel6.setText("Correo eléctronico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 305, 140, 20));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel8.setText("Fecha de registro");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 355, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel7.setText("Rol usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 405, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/fondo registro_nuevo_mod.jpg"))); // NOI18N
        jLabel9.setFocusable(false);
        jLabel9.setRequestFocusEnabled(false);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Nuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btb_guardar_registro;
    public javax.swing.JTextField caja_ape;
    public javax.swing.JPasswordField caja_conf_pass;
    public javax.swing.JTextField caja_email;
    public javax.swing.JTextField caja_nombre;
    public javax.swing.JPasswordField caja_pass;
    public javax.swing.JTextField caja_usu;
    public javax.swing.JComboBox<String> combo_roles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public com.toedter.calendar.JDateChooser jdc_fecha_alta;
    // End of variables declaration//GEN-END:variables
}
