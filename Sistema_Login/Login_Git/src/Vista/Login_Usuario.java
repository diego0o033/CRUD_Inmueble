package Vista;



public class Login_Usuario extends javax.swing.JFrame {

    public Login_Usuario() {
        initComponents();
        
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btb_cerrar_log = new javax.swing.JButton();
        btb_registro_nuevo = new javax.swing.JButton();
        btb_login = new javax.swing.JButton();
        caja_passw = new javax.swing.JPasswordField();
        caja_usuario = new javax.swing.JTextField();
        lbl_inicio_sesion = new javax.swing.JLabel();
        lbl_img_inicio_ses = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        lbl_encabezado_login = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_user_ing = new javax.swing.JLabel();
        lbl_pass_ing = new javax.swing.JLabel();
        lbl_img_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(650, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btb_cerrar_log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/cerrar_login.png"))); // NOI18N
        btb_cerrar_log.setBorder(null);
        btb_cerrar_log.setBorderPainted(false);
        btb_cerrar_log.setContentAreaFilled(false);
        btb_cerrar_log.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/Close_pressed_28.png"))); // NOI18N
        btb_cerrar_log.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/Close_roll.png"))); // NOI18N
        jPanel2.add(btb_cerrar_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 0, 50, 35));

        btb_registro_nuevo.setBackground(new java.awt.Color(204, 204, 204));
        btb_registro_nuevo.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        btb_registro_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/register_32.png"))); // NOI18N
        btb_registro_nuevo.setText("Registro Nuevo");
        btb_registro_nuevo.setBorder(null);
        btb_registro_nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btb_registro_nuevo.setPreferredSize(new java.awt.Dimension(120, 49));
        btb_registro_nuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/registry_32.png"))); // NOI18N
        btb_registro_nuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/register_40.png"))); // NOI18N
        btb_registro_nuevo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btb_registro_nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(btb_registro_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 120, 60));

        btb_login.setBackground(new java.awt.Color(204, 204, 204));
        btb_login.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btb_login.setForeground(new java.awt.Color(255, 255, 255));
        btb_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/login_32.png"))); // NOI18N
        btb_login.setBorder(null);
        btb_login.setBorderPainted(false);
        btb_login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btb_login.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/log-in_40.png"))); // NOI18N
        btb_login.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/login_40.png"))); // NOI18N
        jPanel2.add(btb_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 120, 60));

        caja_passw.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        caja_passw.setText("Ingrese password");
        caja_passw.setBorder(null);
        caja_passw.setEchoChar('\u0000');
        jPanel2.add(caja_passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 280, 40));

        caja_usuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        caja_usuario.setText("Ingrese usuario");
        caja_usuario.setBorder(null);
        jPanel2.add(caja_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 280, 40));

        lbl_inicio_sesion.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lbl_inicio_sesion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_inicio_sesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lbl_inicio_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 30, 30));

        lbl_img_inicio_ses.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lbl_img_inicio_ses.setForeground(new java.awt.Color(255, 255, 255));
        lbl_img_inicio_ses.setText("INICIO DE SESION");
        jPanel2.add(lbl_img_inicio_ses, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 0, 120, 30));

        lbl_pass.setMaximumSize(new java.awt.Dimension(100, 48));
        lbl_pass.setPreferredSize(new java.awt.Dimension(50, 100));
        jPanel2.add(lbl_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, 40));

        lbl_encabezado_login.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_encabezado_login.setForeground(new java.awt.Color(255, 255, 255));
        lbl_encabezado_login.setText("LOGIN");
        jPanel2.add(lbl_encabezado_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 160, 60));

        lbl_user.setBackground(new java.awt.Color(0, 153, 255));
        lbl_user.setForeground(new java.awt.Color(0, 204, 255));
        lbl_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_user.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_user.setPreferredSize(new java.awt.Dimension(50, 100));
        jPanel2.add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 50, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/principal_250.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 270, 220));

        lbl_user_ing.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lbl_user_ing.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user_ing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_user_ing.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbl_user_ing, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 180, 20));

        lbl_pass_ing.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lbl_pass_ing.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pass_ing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pass_ing.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbl_pass_ing, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 180, 20));

        lbl_img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/fondo.png"))); // NOI18N
        lbl_img_fondo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_img_fondo.setPreferredSize(new java.awt.Dimension(510, 590));
        jPanel2.add(lbl_img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 610));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void caja_passwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void caja_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    public static void main(String args[]) 
    {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btb_cerrar_log;
    public javax.swing.JButton btb_login;
    public javax.swing.JButton btb_registro_nuevo;
    public javax.swing.JPasswordField caja_passw;
    public javax.swing.JTextField caja_usuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_encabezado_login;
    public javax.swing.JLabel lbl_img_fondo;
    private javax.swing.JLabel lbl_img_inicio_ses;
    public javax.swing.JLabel lbl_inicio_sesion;
    public javax.swing.JLabel lbl_pass;
    public javax.swing.JLabel lbl_pass_ing;
    public javax.swing.JLabel lbl_user;
    public javax.swing.JLabel lbl_user_ing;
    // End of variables declaration//GEN-END:variables
}
