package Pantallas;

import Controlador.Conexion;
import entidades.Articulo;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 * @author Jonathan Rivera
 */

public class PantallaListas extends javax.swing.JInternalFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jCmboxLista = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setName("LIsta de Inventario"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1065, 605));
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTableLista.setBackground(new java.awt.Color(255, 255, 255));
        jTableLista.setFont(new java.awt.Font("Roboto Light", 2, 14)); // NOI18N
        jTableLista.setForeground(new java.awt.Color(0, 0, 0));
        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Costo", "Marca", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLista.setGridColor(new java.awt.Color(0, 0, 0));
        jTableLista.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(jTableLista);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ALMACENES INVENTARIO");

        Buscar.setBackground(new java.awt.Color(0, 0, 0));
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jCmboxLista.setBackground(new java.awt.Color(255, 255, 255));
        jCmboxLista.setForeground(new java.awt.Color(0, 0, 0));
        jCmboxLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puntarenas", "Heredia", "Guanacaste" }));
        jCmboxLista.setBorder(null);
        jCmboxLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmboxListaActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ALMACENES:");
        jLabel2.setMaximumSize(new java.awt.Dimension(65, 15));
        jLabel2.setMinimumSize(new java.awt.Dimension(65, 15));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCmboxLista, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(363, 363, 363))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCmboxLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Buscar)
                        .addContainerGap(340, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
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

//<editor-fold defaultstate="collapsed" desc="Eventos">
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        MostrarLista();
        Buscar.setBackground(Color.black);
    }//GEN-LAST:event_BuscarActionPerformed

    private void jCmboxListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmboxListaActionPerformed

    }//GEN-LAST:event_jCmboxListaActionPerformed
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Controls Genereted">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JComboBox<String> jCmboxLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLista;
    // End of variables declaration//GEN-END:variables
//</editor-fold> 

//<editor-fold defaultstate="collapsed" desc="Variables Globales">
    DefaultTableModel modeloTabla = new DefaultTableModel();
//</editor-fold>    

//<editor-fold defaultstate="collapsed" desc="Constructores">
    public PantallaListas() {
        initComponents();
    }
//</editor-fold>
 
//<editor-fold defaultstate="collapsed" desc="Metodos"> 
    
     /**Este metodo condiciona que tipo de Articulo se va a mostrar en tabla segun su ubicacion y hace la conexion con base de datos y 
        trae el dato solicidato y lo muestra en la tabla segun su posicion, en este caso la Ubicacion del Articulo*/

    void MostrarLista(){      
       modeloTabla = (DefaultTableModel) jTableLista.getModel();
       modeloTabla.setRowCount(0);       
       Articulo oArticulo = new Articulo();
       oArticulo.setUbicacionArticulo((String) jCmboxLista.getSelectedItem());
       if ("Puntarenas".equals(oArticulo.getUbicacionArticulo())){           
            try {          
                Conexion oConexion = new Conexion();           
                oConexion.getConexion();
                PreparedStatement ps = oConexion.con.prepareStatement("SELECT ID, Nombre, Costo, Marca, Cantidad FROM Puntarenas");
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData mdrs = rs.getMetaData();
                int columnas = mdrs.getColumnCount();
                        
                while (rs.next()){
                    Object [] fila = new Object [columnas];
                    for (int i = 0; i < columnas; i++) {
                        fila[i] = rs.getObject(i+1);         
                    }
                    modeloTabla.addRow(fila);                
                }
            } catch (SQLException e) {
                System.out.println(e.toString());
            }     
       }
       if ("Heredia".equals(oArticulo.getUbicacionArticulo())){
           try {          
                Conexion oConexion = new Conexion();           
                oConexion.getConexion();
                PreparedStatement ps = oConexion.con.prepareStatement("SELECT ID, Nombre, Costo, Marca, Cantidad FROM Heredia");
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData mdrs = rs.getMetaData();
                int columnas = mdrs.getColumnCount();
                        
                while (rs.next()){
                    Object [] fila = new Object [columnas];
                    for (int i = 0; i < columnas; i++) {
                        fila[i] = rs.getObject(i+1);         
                    }
                    modeloTabla.addRow(fila);                
                }
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
       }
       if ("Guanacaste".equals(oArticulo.getUbicacionArticulo())){
          try {          
                Conexion oConexion = new Conexion();           
                oConexion.getConexion();
                PreparedStatement ps = oConexion.con.prepareStatement("SELECT ID, Nombre, Costo, Marca, Cantidad FROM Guanacaste");
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData mdrs = rs.getMetaData();
                int columnas = mdrs.getColumnCount();
                        
                while (rs.next()){
                    Object [] fila = new Object [columnas];
                    for (int i = 0; i < columnas; i++) {
                        fila[i] = rs.getObject(i+1);         
                    }
                    modeloTabla.addRow(fila);                
                }
            } catch (SQLException e) {
                System.out.println(e.toString());
            }           
        }
    }  
}
//</editor-fold>