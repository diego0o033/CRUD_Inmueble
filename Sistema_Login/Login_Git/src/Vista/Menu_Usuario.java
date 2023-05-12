
package Vista;

/**
 *
 * @author diego vargas
 */
public class Menu_Usuario extends javax.swing.JFrame {

    public Menu_Usuario() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mrol_lbl = new javax.swing.JLabel();
        musua_fecha_lbl = new javax.swing.JLabel();
        musua_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cliente = new javax.swing.JMenu();
        alta_cliente = new javax.swing.JMenuItem();
        modificar_cliente = new javax.swing.JMenuItem();
        eliminar_cliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(380, 352));

        jPanel1.setPreferredSize(new java.awt.Dimension(380, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mrol_lbl.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        mrol_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mrol_lbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(mrol_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 130, 35));

        musua_fecha_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        musua_fecha_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/schedule_32.png"))); // NOI18N
        musua_fecha_lbl.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(musua_fecha_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 140, 31));

        musua_lbl.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        musua_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        musua_lbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(musua_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, 35));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/man_32.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 50, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/man_32.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 50, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Componentes/fondo user_400.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 350));

        jMenuBar1.setInheritsPopupMenu(true);

        menu_cliente.setText("Clientes");

        alta_cliente.setText("Alta Cliente");
        menu_cliente.add(alta_cliente);

        modificar_cliente.setLabel("Modificar Cliente");
        menu_cliente.add(modificar_cliente);
        modificar_cliente.getAccessibleContext().setAccessibleName("Modificar_Cliente");

        eliminar_cliente.setText("Eliminar Cliente");
        menu_cliente.add(eliminar_cliente);

        jMenuBar1.add(menu_cliente);

        jMenu2.setText("Articulos");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Reportes");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Facturas");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

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
                new Menu_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem alta_cliente;
    public javax.swing.JMenuItem eliminar_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menu_cliente;
    public javax.swing.JMenuItem modificar_cliente;
    public javax.swing.JLabel mrol_lbl;
    public javax.swing.JLabel musua_fecha_lbl;
    public javax.swing.JLabel musua_lbl;
    // End of variables declaration//GEN-END:variables
}
