package Pantallas;

import Controlador.Conexion;
import entidades.Articulo;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jonathan Rivera
 */

public class PantallaInventarios extends javax.swing.JInternalFrame {
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboUbicacion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInventario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextCantidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextID = new javax.swing.JTextField();
        jTextArticulo = new javax.swing.JTextField();
        jTextCosto = new javax.swing.JTextField();
        jTextCategoria = new javax.swing.JTextField();
        jTextMarca = new javax.swing.JTextField();
        jTextAux = new javax.swing.JTextField();
        jBttnEnviar = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1065, 605));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1040, 542));
        jPanel2.setPreferredSize(new java.awt.Dimension(1063, 602));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CANTIDAD:");
        jLabel1.setMaximumSize(new java.awt.Dimension(65, 15));
        jLabel1.setMinimumSize(new java.awt.Dimension(65, 15));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 71, 30));

        jComboUbicacion.setBackground(new java.awt.Color(255, 255, 255));
        jComboUbicacion.setForeground(new java.awt.Color(0, 0, 0));
        jComboUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puntarenas", "Heredia", "Guanacaste" }));
        jComboUbicacion.setBorder(null);
        jComboUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboUbicacionActionPerformed(evt);
            }
        });
        jPanel2.add(jComboUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 210, -1));

        jTableInventario.setBackground(new java.awt.Color(255, 255, 255));
        jTableInventario.setFont(new java.awt.Font("Roboto Light", 2, 14)); // NOI18N
        jTableInventario.setForeground(new java.awt.Color(0, 0, 0));
        jTableInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Articulo", "Costo", "Marca", "Categoria", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableInventario.setGridColor(new java.awt.Color(0, 0, 0));
        jTableInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInventario);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 720, 440));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("UBICACION INVENTARIO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("UBICACION:");
        jLabel3.setMaximumSize(new java.awt.Dimension(65, 15));
        jLabel3.setMinimumSize(new java.awt.Dimension(65, 15));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 71, 30));

        jTextCantidad.setBackground(new java.awt.Color(255, 255, 255));
        jTextCantidad.setForeground(new java.awt.Color(0, 0, 0));
        jTextCantidad.setBorder(null);
        jTextCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadActionPerformed(evt);
            }
        });
        jPanel2.add(jTextCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 210, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 210, 20));

        jTextID.setEditable(false);
        jTextID.setBackground(new java.awt.Color(255, 255, 255));
        jTextID.setForeground(new java.awt.Color(255, 255, 255));
        jTextID.setBorder(null);
        jPanel2.add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 220, 40));

        jTextArticulo.setEditable(false);
        jTextArticulo.setBackground(new java.awt.Color(255, 255, 255));
        jTextArticulo.setForeground(new java.awt.Color(255, 255, 255));
        jTextArticulo.setBorder(null);
        jPanel2.add(jTextArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 220, 40));

        jTextCosto.setEditable(false);
        jTextCosto.setBackground(new java.awt.Color(255, 255, 255));
        jTextCosto.setForeground(new java.awt.Color(255, 255, 255));
        jTextCosto.setBorder(null);
        jTextCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCostoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 220, 40));

        jTextCategoria.setEditable(false);
        jTextCategoria.setBackground(new java.awt.Color(255, 255, 255));
        jTextCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jTextCategoria.setBorder(null);
        jPanel2.add(jTextCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 220, 40));

        jTextMarca.setEditable(false);
        jTextMarca.setBackground(new java.awt.Color(255, 255, 255));
        jTextMarca.setForeground(new java.awt.Color(255, 255, 255));
        jTextMarca.setBorder(null);
        jTextMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(jTextMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 220, 40));

        jTextAux.setEditable(false);
        jTextAux.setBackground(new java.awt.Color(255, 255, 255));
        jTextAux.setForeground(new java.awt.Color(255, 255, 255));
        jTextAux.setBorder(null);
        jPanel2.add(jTextAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 220, 40));

        jBttnEnviar.setBackground(new java.awt.Color(0, 0, 0));
        jBttnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        jBttnEnviar.setText("Enviar");
        jBttnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnEnviarActionPerformed(evt);
            }
        });
        jPanel2.add(jBttnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//<editor-fold defaultstate="collapsed" desc="Eventos">
    private void jComboUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboUbicacionActionPerformed
       
    }//GEN-LAST:event_jComboUbicacionActionPerformed

    private void jTextCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidadActionPerformed
       
    }//GEN-LAST:event_jTextCantidadActionPerformed

    private void jTextCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCostoActionPerformed
    
    }//GEN-LAST:event_jTextCostoActionPerformed

    private void jTableInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInventarioMouseClicked
        Click();
    }//GEN-LAST:event_jTableInventarioMouseClicked

    private void jBttnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnEnviarActionPerformed
       jBttnEnviar.setBackground(Color.black);
       EnviarDatos();
       MostrarLista();
       LimpiarEspacios();  
    }//GEN-LAST:event_jBttnEnviarActionPerformed

    private void jTextMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMarcaActionPerformed
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Controls Genereted">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttnEnviar;
    private javax.swing.JComboBox<String> jComboUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableInventario;
    private javax.swing.JTextField jTextArticulo;
    private javax.swing.JTextField jTextAux;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextCategoria;
    private javax.swing.JTextField jTextCosto;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextMarca;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Variables Globales">
    
DefaultTableModel modeloTabla= new DefaultTableModel();

    
//</editor-fold>    
    
//<editor-fold defaultstate="collapsed" desc="Constructores">    
    public PantallaInventarios() {
        initComponents();
        MostrarLista();
    }
//</editor-fold>  
        
//<editor-fold defaultstate="collapsed" desc="Metodos">  
    //Este metodo envia la cantidad y los datos de los articulo hacia una determinada tabla en la base de datos y actualiza la tabla General
    void EnviarDatos(){
        Articulo oArticulo = new Articulo();    
        oArticulo.setUbicacionArticulo((String)jComboUbicacion.getSelectedItem());
        oArticulo.setNombArticulo(jTextArticulo.getText());
        oArticulo.setCostoArticulo(Double.parseDouble(jTextCosto.getText()));
        oArticulo.setMarcaArticulo(jTextMarca.getText());
        oArticulo.setCategoriaArticulo(jTextCategoria.getText());
        oArticulo.setCantidadArticulo(Integer.parseInt(jTextCantidad.getText()));
        oArticulo.setIdArticulo(Integer.parseInt(jTextID.getText()));
        int cantidad = Integer.parseInt(jTextAux.getText());
        int newCantidad = cantidad - oArticulo.getCantidadArticulo();
        if (oArticulo.getCantidadArticulo() <= cantidad){
            if ("Puntarenas".equals(oArticulo.getUbicacionArticulo())){
                try {
                    Conexion oConexion = new Conexion();
                    oConexion.getConexion();
                    PreparedStatement ps = oConexion.con.prepareStatement("Insert into Puntarenas (ID, Nombre, Costo, Marca, Categoria, Cantidad) VALUES (?,?,?,?,?,?)");
                    ps.setInt(1, oArticulo.getIdArticulo());
                    ps.setString(2, oArticulo.getNombArticulo());
                    ps.setDouble(3, oArticulo.getCostoArticulo());
                    ps.setString(4, oArticulo.getMarcaArticulo());
                    ps.setString(5, oArticulo.getCategoriaArticulo());
                    ps.setInt(6, oArticulo.getCantidadArticulo());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Articulo enviado");
                } catch (HeadlessException | SQLException e) {
                    System.out.println(e.toString());
                }
            }
            if ("Heredia".equals(oArticulo.getUbicacionArticulo())){
                try {
                    Conexion oConexion = new Conexion();
                    oConexion.getConexion();
                    PreparedStatement ps = oConexion.con.prepareStatement("Insert into Heredia (ID, Nombre, Costo, Marca, Categoria, Cantidad) VALUES (?,?,?,?,?,?)");
                    ps.setInt(1, oArticulo.getIdArticulo());
                    ps.setString(2, oArticulo.getNombArticulo());
                    ps.setDouble(3, oArticulo.getCostoArticulo());
                    ps.setString(4, oArticulo.getMarcaArticulo());
                    ps.setString(5, oArticulo.getCategoriaArticulo());
                    ps.setInt(6, oArticulo.getCantidadArticulo());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Articulo enviado");
                } catch (HeadlessException | SQLException e) {
                    System.out.println(e.toString());
                }
            }
            if ("Guanacaste".equals(oArticulo.getUbicacionArticulo())){
                try {
                    Conexion oConexion = new Conexion();
                    oConexion.getConexion();
                    PreparedStatement ps = oConexion.con.prepareStatement("Insert into Guanacaste (ID, Nombre, Costo, Marca, Categoria, Cantidad) VALUES (?,?,?,?,?,?)");
                    ps.setInt(1, oArticulo.getIdArticulo());
                    ps.setString(2, oArticulo.getNombArticulo());
                    ps.setDouble(3, oArticulo.getCostoArticulo());
                    ps.setString(4, oArticulo.getMarcaArticulo());
                    ps.setString(5, oArticulo.getCategoriaArticulo());
                    ps.setInt(6, oArticulo.getCantidadArticulo());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Articulo enviado");
                } catch (HeadlessException | SQLException e) {
                    System.out.println(e.toString());
                }
            }
            try {           
                Conexion oConexion = new Conexion();           
                oConexion.getConexion();
                PreparedStatement ps = oConexion.con.prepareStatement("Update Inventario Set Nombre=?, Costo=?, Marca=?, Categoria=?, Cantidad=? WHERE ID=?");
                ps.setString(1, oArticulo.getNombArticulo());
                ps.setDouble(2, oArticulo.getCostoArticulo());
                ps.setString(3, oArticulo.getMarcaArticulo());
                ps.setString(4, oArticulo.getCategoriaArticulo());
                ps.setInt(5, newCantidad);
                ps.setInt(6, oArticulo.getIdArticulo());
                ps.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.toString());
            } 
        }
        else{
            JOptionPane.showMessageDialog(null, "La cantidad ingresada supera el inventario");
        }
    }
    
    /**Este metodo hace la conexion con base de datos para traer los datos de los   
       registros en tabla y mostrarlos en un jTable*/
    final void MostrarLista(){     
        modeloTabla = (DefaultTableModel) jTableInventario.getModel();
        modeloTabla.setRowCount(0);       
        try {          
            Conexion oConexion = new Conexion();           
            oConexion.getConexion();
            PreparedStatement ps = oConexion.con.prepareStatement("SELECT ID, Nombre, Costo, Marca, Categoria, Cantidad FROM Inventario");
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
    
    //Este metodo limpia los espacios de datos solicitados
    void LimpiarEspacios(){
        jTextCantidad.setText(null);
        jComboUbicacion.setSelectedItem(null);
    }
    
    /**Este metodo hace la conexion con base de datos y trae el dato solicidato y lo muestra en la tabla segun su posicion,
       en este caso la Ubicacion del Articulo*/
    void Click(){
        try {
            int fila  = jTableInventario.getSelectedRow();
            int id = Integer.parseInt(jTableInventario.getValueAt(fila, 0).toString());
            Conexion oConexion = new Conexion();           
            oConexion.getConexion();
            PreparedStatement ps = oConexion.con.prepareStatement("SELECT Nombre, Costo, Marca, Categoria, Cantidad FROM Inventario WHERE ID=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){            
                jTextID.setText(String.valueOf(id));
                jTextArticulo.setText(rs.getString("Nombre"));
                jTextCosto.setText(rs.getString("Costo"));               
                jTextMarca.setText(rs.getString("Marca"));
                jTextCategoria.setText(rs.getString("Categoria")); 
                jTextCantidad.setText(rs.getString("Cantidad"));
                jTextAux.setText(rs.getString("Cantidad"));
            }          
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e.toString());
        }
    }
}
//</editor-fold>
    
