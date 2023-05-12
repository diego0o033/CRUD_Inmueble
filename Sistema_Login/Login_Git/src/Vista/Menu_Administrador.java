
package Vista;

/**
 *
 * @author diego vargas
 */
public class Menu_Administrador extends javax.swing.JFrame {

    public Menu_Administrador() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbl_fecha = new javax.swing.JLabel();
        rol_lbl = new javax.swing.JLabel();
        usua_lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_usuario1 = new javax.swing.JMenu();
        menu_usuario2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_fecha.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lbl_fecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_fecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/schedule_32.png"))); // NOI18N
        lbl_fecha.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(lbl_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 140, 40));
        lbl_fecha.getAccessibleContext().setAccessibleName("lbl_fecha");

        rol_lbl.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jPanel2.add(rol_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 140, 50));

        usua_lbl.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        usua_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usua_lbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(usua_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/admin_100.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/admin_100.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/fondo adm.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 330));

        jMenuBar1.setBorder(null);

        menu_usuario1.setBorder(null);
        menu_usuario1.setText("Usuario");

        menu_usuario2.setText("Alta Usuario");
        menu_usuario1.add(menu_usuario2);

        jMenuItem4.setText("Modificar Usuario");
        menu_usuario1.add(jMenuItem4);

        jMenuItem5.setText("Eliminar Usuario");
        menu_usuario1.add(jMenuItem5);

        jMenuBar1.add(menu_usuario1);

        jMenu3.setText("Proveedor");
        jMenuBar1.add(jMenu3);

        jMenu6.setText("Articulos");
        jMenuBar1.add(jMenu6);

        jMenu7.setBorder(null);
        jMenu7.setText("Reportes");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lbl_fecha;
    public javax.swing.JMenu menu_usuario1;
    public javax.swing.JMenuItem menu_usuario2;
    public javax.swing.JLabel rol_lbl;
    public javax.swing.JLabel usua_lbl;
    // End of variables declaration//GEN-END:variables
}
