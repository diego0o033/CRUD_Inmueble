
package Vista;

/**
 *
 * @author diego vargas
 */
public class Crud_Inmueble extends javax.swing.JFrame {

    
    public Crud_Inmueble() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_cabecera = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        caja_direccion = new javax.swing.JTextField();
        caja_metros2 = new javax.swing.JTextField();
        caja_localidad = new javax.swing.JTextField();
        caja_valor = new javax.swing.JTextField();
        caja_altura = new javax.swing.JTextField();
        caja_cod_inm = new javax.swing.JTextField();
        cbx_inmueble = new javax.swing.JComboBox<>();
        cbx_moneda = new javax.swing.JComboBox<>();
        caja_cant_amb = new javax.swing.JTextField();
        lbl_formulario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbx_filtro_busqueda = new javax.swing.JComboBox<>();
        btn_limpiar_busqueda = new javax.swing.JButton();
        caja_buscar = new javax.swing.JTextField();
        btb_delete = new javax.swing.JButton();
        btb_buscar = new javax.swing.JButton();
        btb_update = new javax.swing.JButton();
        btb_insert = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btb_cargar_tabla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btb_cerrar = new javax.swing.JButton();
        btb_minimizar = new javax.swing.JButton();
        label2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo final,inm norte,lbl_1.png"))); // NOI18N
        jPanel1.add(lbl_cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 880, 110));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 2, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caja_direccion.setBackground(new java.awt.Color(204, 204, 204));
        caja_direccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        caja_direccion.setText("Ingrese una direccion ");
        caja_direccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT", 0, 16))); // NOI18N
        caja_direccion.setSelectedTextColor(new java.awt.Color(0, 153, 255));
        jPanel2.add(caja_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 160, 40));

        caja_metros2.setBackground(new java.awt.Color(204, 204, 204));
        caja_metros2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        caja_metros2.setText("Ingrese la cantidad total");
        caja_metros2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "M2(metros cuadrados)", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT", 0, 16))); // NOI18N
        caja_metros2.setSelectedTextColor(new java.awt.Color(0, 153, 255));
        jPanel2.add(caja_metros2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 160, 40));

        caja_localidad.setBackground(new java.awt.Color(204, 204, 204));
        caja_localidad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        caja_localidad.setText("Ingrese una localidad ");
        caja_localidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Localidad", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT", 0, 16))); // NOI18N
        caja_localidad.setSelectedTextColor(new java.awt.Color(0, 153, 255));
        jPanel2.add(caja_localidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 160, 40));

        caja_valor.setBackground(new java.awt.Color(204, 204, 204));
        caja_valor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        caja_valor.setText("Ingrese un precio ");
        caja_valor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT", 0, 16))); // NOI18N
        caja_valor.setSelectedTextColor(new java.awt.Color(0, 153, 255));
        jPanel2.add(caja_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 160, 40));

        caja_altura.setBackground(new java.awt.Color(204, 204, 204));
        caja_altura.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        caja_altura.setText("Ingrese una altura ");
        caja_altura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Altura", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT", 0, 16))); // NOI18N
        caja_altura.setSelectedTextColor(new java.awt.Color(0, 153, 255));
        jPanel2.add(caja_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 160, 40));

        caja_cod_inm.setBackground(new java.awt.Color(204, 204, 204));
        caja_cod_inm.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        caja_cod_inm.setText("Ingrese un codigo válido");
        caja_cod_inm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Codigo inmueble", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT", 0, 16))); // NOI18N
        caja_cod_inm.setSelectedTextColor(new java.awt.Color(0, 153, 255));
        jPanel2.add(caja_cod_inm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 40));

        cbx_inmueble.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        cbx_inmueble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de inmueble", "Casa", "Departamento" }));
        cbx_inmueble.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        cbx_inmueble.setName(""); // NOI18N
        jPanel2.add(cbx_inmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, 40));

        cbx_moneda.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        cbx_moneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de moneda", "Pesos Argentinos", "Dolares Americanos" }));
        cbx_moneda.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cbx_moneda.setName(""); // NOI18N
        jPanel2.add(cbx_moneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 160, 40));

        caja_cant_amb.setBackground(new java.awt.Color(204, 204, 204));
        caja_cant_amb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        caja_cant_amb.setText("Ingrese los ambientes ");
        caja_cant_amb.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad ambientes", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT", 0, 16))); // NOI18N
        caja_cant_amb.setSelectedTextColor(new java.awt.Color(0, 153, 255));
        jPanel2.add(caja_cant_amb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 160, 40));

        lbl_formulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lbl_2_inm_1.png"))); // NOI18N
        lbl_formulario.setText("jLabel2");
        lbl_formulario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(lbl_formulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 10, 250, 205));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Datos del inmueble");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 880, 220));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comandos Formulario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 2, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbx_filtro_busqueda.setFont(new java.awt.Font("Trebuchet MS", 2, 12)); // NOI18N
        cbx_filtro_busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo inmueble", "Localidad", "Valor", "Cantidad ", "Casa" }));
        cbx_filtro_busqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel3.add(cbx_filtro_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 35));

        btn_limpiar_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        btn_limpiar_busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar_busqueda_18.png"))); // NOI18N
        btn_limpiar_busqueda.setBorder(null);
        jPanel3.add(btn_limpiar_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 20, 20));

        caja_buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(caja_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 180, 35));

        btb_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/trash_32.png"))); // NOI18N
        btb_delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(btb_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, 35));

        btb_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/search_32.png"))); // NOI18N
        btb_buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btb_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(btb_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 40, 35));

        btb_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/update_32.png"))); // NOI18N
        btb_update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btb_update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(btb_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, 35));

        btb_insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/insert_32.png"))); // NOI18N
        btb_insert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btb_insert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(btb_insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 40, 35));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 880, 70));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Visualizacion de datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 2, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btb_cargar_tabla.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        btb_cargar_tabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/sync_32.png"))); // NOI18N
        btb_cargar_tabla.setText("Cargar datos");
        btb_cargar_tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(btb_cargar_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        tabla_datos = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return false;
            }
        };
        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod. Inmueble", "Inmueble", "Moneda", "Valor", "Localidad", "Direccion", "Altura", "M2", "Cantidad Amb."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_datos.setPreferredSize(new java.awt.Dimension(690, 64));
        tabla_datos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_datos);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 860, 90));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 880, 200));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btb_cerrar.setBackground(new java.awt.Color(51, 51, 51));
        btb_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/close_32.png"))); // NOI18N
        btb_cerrar.setBorder(null);
        btb_cerrar.setBorderPainted(false);
        jPanel5.add(btb_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 0, 40, 30));

        btb_minimizar.setBackground(new java.awt.Color(51, 51, 51));
        btb_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/minimize_28.png"))); // NOI18N
        btb_minimizar.setBorder(null);
        btb_minimizar.setBorderPainted(false);
        jPanel5.add(btb_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 0, 40, 30));

        label2.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Crud Inmueble");
        jPanel5.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 3, 130, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo ventana_sin_fond_32.png"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 30));

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
            java.util.logging.Logger.getLogger(Crud_Inmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Inmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Inmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Inmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btb_buscar;
    public javax.swing.JButton btb_cargar_tabla;
    public javax.swing.JButton btb_cerrar;
    public javax.swing.JButton btb_delete;
    public javax.swing.JButton btb_insert;
    public javax.swing.JButton btb_minimizar;
    public javax.swing.JButton btb_update;
    public javax.swing.JButton btn_limpiar_busqueda;
    public javax.swing.JTextField caja_altura;
    public javax.swing.JTextField caja_buscar;
    public javax.swing.JTextField caja_cant_amb;
    public javax.swing.JTextField caja_cod_inm;
    public javax.swing.JTextField caja_direccion;
    public javax.swing.JTextField caja_localidad;
    public javax.swing.JTextField caja_metros2;
    public javax.swing.JTextField caja_valor;
    public javax.swing.JComboBox<String> cbx_filtro_busqueda;
    public javax.swing.JComboBox<String> cbx_inmueble;
    public javax.swing.JComboBox<String> cbx_moneda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label2;
    public javax.swing.JLabel lbl_cabecera;
    public javax.swing.JLabel lbl_formulario;
    public javax.swing.JTable tabla_datos;
    // End of variables declaration//GEN-END:variables

    
}
