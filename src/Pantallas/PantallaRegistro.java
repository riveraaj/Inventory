package Pantallas;

import Controlador.Conexion;
import entidades.Articulo;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Jonathan Rivera
 */

public class PantallaRegistro extends javax.swing.JInternalFrame {
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextID = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextCosto = new javax.swing.JTextField();
        jTextCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jBttRegistrar = new javax.swing.JButton();
        jBttEliminar = new javax.swing.JButton();
        jBttActualizar = new javax.swing.JButton();
        jBttModificar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextMarca = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1065, 605));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMinimumSize(new java.awt.Dimension(1063, 583));
        jPanel1.setPreferredSize(new java.awt.Dimension(1063, 602));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextID.setBackground(new java.awt.Color(255, 255, 255));
        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });
        jPanel1.add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 140, 30));

        jTextNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextNombre.setForeground(new java.awt.Color(0, 0, 0));
        jTextNombre.setBorder(null);
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 290, 30));

        jTextCosto.setBackground(new java.awt.Color(255, 255, 255));
        jTextCosto.setForeground(new java.awt.Color(0, 0, 0));
        jTextCosto.setBorder(null);
        jPanel1.add(jTextCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 290, 30));

        jTextCantidad.setBackground(new java.awt.Color(255, 255, 255));
        jTextCantidad.setForeground(new java.awt.Color(0, 0, 0));
        jTextCantidad.setBorder(null);
        jTextCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(jTextCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 290, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ARTICULO: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 70, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("COSTO: ");
        jLabel3.setMaximumSize(new java.awt.Dimension(65, 15));
        jLabel3.setMinimumSize(new java.awt.Dimension(65, 15));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 60, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CANTIDAD: ");
        jLabel4.setMaximumSize(new java.awt.Dimension(65, 15));
        jLabel4.setMinimumSize(new java.awt.Dimension(65, 15));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 90, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CATEGORIA: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("REGISTRO ARTICULOS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 290, -1));

        jTable.setBackground(new java.awt.Color(255, 255, 255));
        jTable.setFont(new java.awt.Font("Roboto Light", 2, 14)); // NOI18N
        jTable.setForeground(new java.awt.Color(0, 0, 0));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Costo", "Marca", "Categoria", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 660, 380));

        jBttRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        jBttRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jBttRegistrar.setText("Registrar");
        jBttRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBttRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jBttRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, -1, -1));

        jBttEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jBttEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBttEliminar.setText("Eliminar");
        jBttEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBttEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jBttEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, -1, -1));

        jBttActualizar.setBackground(new java.awt.Color(0, 0, 0));
        jBttActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jBttActualizar.setText("Actualizar");
        jBttActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBttActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jBttActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, -1, -1));

        jBttModificar.setBackground(new java.awt.Color(0, 0, 0));
        jBttModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBttModificar.setText("Modificar");
        jBttModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBttModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jBttModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 290, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 290, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 290, 30));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hogar", "Entretenimiento", "Ferreteria" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 290, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("MARCA: ");
        jLabel7.setMaximumSize(new java.awt.Dimension(65, 15));
        jLabel7.setMinimumSize(new java.awt.Dimension(65, 15));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 60, 30));

        jTextMarca.setBackground(new java.awt.Color(255, 255, 255));
        jTextMarca.setForeground(new java.awt.Color(0, 0, 0));
        jTextMarca.setBorder(null);
        jPanel1.add(jTextMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 290, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 290, 30));

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
    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed

    }//GEN-LAST:event_jTextIDActionPerformed

    private void jBttRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttRegistrarActionPerformed
        jBttRegistrar.setBackground(Color.black);
        RegistrarArticulos();
        LimpiarEspacios();
    }//GEN-LAST:event_jBttRegistrarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        ClickTabla();
    }//GEN-LAST:event_jTableMouseClicked

    private void jBttModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttModificarActionPerformed
        jBttModificar.setBackground(Color.black);
        ModificarArticulos();
        LimpiarEspacios();
    }//GEN-LAST:event_jBttModificarActionPerformed

    private void jBttEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttEliminarActionPerformed
        jBttEliminar.setBackground(Color.black);
        EliminarArticulos();
        LimpiarEspacios();
    }//GEN-LAST:event_jBttEliminarActionPerformed

    private void jBttActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttActualizarActionPerformed
        jBttActualizar.setBackground(Color.black);
        MostrarLista();
        LimpiarEspacios();
    }//GEN-LAST:event_jBttActualizarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidadActionPerformed
//</editor-fold>
       
//<editor-fold defaultstate="collapsed" desc="Controls Genereted">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttActualizar;
    private javax.swing.JButton jBttEliminar;
    private javax.swing.JButton jBttModificar;
    private javax.swing.JButton jBttRegistrar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextCosto;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextMarca;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables

//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Variables Globales">
    
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
//</editor-fold>   
    
//<editor-fold defaultstate="collapsed" desc="Constructores">
    
    public PantallaRegistro() {
        initComponents();
        MostrarLista();
        jTextID.setVisible(false);    
    }

//</editor-fold>   
    
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    
    /**Este metodo hace la conexion con base de datos para enviar 
       los datos solicitados y guardarlos*/
    
    void RegistrarArticulos(){          
       Articulo oArticulo = new Articulo();
       oArticulo.setCostoArticulo(Double.parseDouble(jTextCosto.getText()));
       oArticulo.setNombArticulo(jTextNombre.getText());
       oArticulo.setCategoriaArticulo((String) jComboBox1.getSelectedItem());
       oArticulo.setMarcaArticulo(jTextMarca.getText());
       oArticulo.setCantidadArticulo(Integer.parseInt(jTextCantidad.getText()));
        try {
            Conexion oConexion = new Conexion();           
            oConexion.getConexion();
            PreparedStatement ps = oConexion.con.prepareStatement("Insert Into Inventario (Nombre, Costo, Marca, Categoria, Cantidad) VALUES (?,?,?,?,?)");
            ps.setString(1, oArticulo.getNombArticulo());
            ps.setDouble(2, oArticulo.getCostoArticulo());
            ps.setString(3, oArticulo.getMarcaArticulo());
            ps.setString(4, oArticulo.getCategoriaArticulo());
            ps.setInt(5, oArticulo.getCantidadArticulo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    /**Este metodo hace la conexion con base de datos para modificar y enviar 
       los datos solicitados y modificados para guardar y actualizar la tabla*/
    
    void ModificarArticulos(){
       Articulo oArticulo = new Articulo();
       oArticulo.setIdArticulo(Integer.parseInt(jTextID.getText()));
       oArticulo.setCostoArticulo(Double.parseDouble(jTextCosto.getText()));
       oArticulo.setNombArticulo(jTextNombre.getText());
       oArticulo.setCategoriaArticulo((String) jComboBox1.getSelectedItem());
       oArticulo.setMarcaArticulo(jTextMarca.getText());     
       oArticulo.setCantidadArticulo(Integer.parseInt(jTextCantidad.getText()));
        try {
            Conexion oConexion = new Conexion();           
            oConexion.getConexion();
            PreparedStatement ps = oConexion.con.prepareStatement("Update Inventario Set Nombre=?, Costo=?, Marca=?, Categoria=?, Cantidad=? WHERE ID=?");
            ps.setString(1, oArticulo.getNombArticulo());
            ps.setDouble(2, oArticulo.getCostoArticulo());
            ps.setString(3, oArticulo.getMarcaArticulo());
            ps.setString(4, oArticulo.getCategoriaArticulo());
            ps.setInt(5, oArticulo.getCantidadArticulo());
            ps.setInt(6, oArticulo.getIdArticulo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado");
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    /**Este metodo hace la conexion con base de datos para eliminar
       un registro en la tabla*/
    
    void EliminarArticulos(){       
        Articulo oArticulo = new Articulo();
        oArticulo.setIdArticulo(Integer.parseInt(jTextID.getText()));
        try {
            Conexion oConexion = new Conexion();           
            oConexion.getConexion();
            PreparedStatement ps = oConexion.con.prepareStatement("Delete From Inventario Where ID=?");
            ps.setInt(1, oArticulo.getIdArticulo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    /**Este metodo hace la conexion con base de datos para traer los datos de los   
       registros en tabla y mostrarlos en un jTable*/
    
    final void MostrarLista(){      
       modeloTabla = (DefaultTableModel) jTable.getModel();
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
        jTextCosto.setText(null);
        jTextNombre.setText(null);
        jTextID.setText(null);
        jTextMarca.setText(null);
        jTextCantidad.setText(null);
        jComboBox1.setSelectedItem(null);
    }
    
     /**Este metodo hace la conexion con base de datos y trae el dato solicidato y lo muestra en la tabla 
      * segun su posicion, en este caso la Ubicacion del Articulo*/
    
    void ClickTabla(){        
        try {
            int fila  = jTable.getSelectedRow();
            int id = Integer.parseInt(jTable.getValueAt(fila, 0).toString());
            Conexion oConexion = new Conexion();           
            oConexion.getConexion();
            PreparedStatement ps = oConexion.con.prepareStatement("SELECT Nombre, Costo, Marca, Categoria, Cantidad FROM Inventario WHERE ID=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){            
                jTextID.setText(String.valueOf(id));
                jTextNombre.setText(rs.getString("Nombre"));
                jTextCosto.setText(rs.getString("Costo"));
                jTextCantidad.setText(rs.getString("Cantidad"));
                jTextMarca.setText(rs.getString("Marca"));
                jComboBox1.setSelectedItem(rs.getString("Categoria"));               
            }          
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e.toString());
        }
    }  
}
//</editor-fold>   
    
