package Principal;

import Pantallas.PantallaInventarios;
import Pantallas.PantallaListas;
import Pantallas.PantallaManual;
import Pantallas.PantallaRegistro;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 * @author Jonathan Rivera
 */
public class JMDIPrincipal extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuManual = new javax.swing.JMenuItem();
        jMenuRegistros = new javax.swing.JMenu();
        jMenuRegistroArticulos = new javax.swing.JMenuItem();
        jMenuInventario = new javax.swing.JMenu();
        jMenuIAsignacion = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JJH Inventory");
        setBackground(new java.awt.Color(0, 0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1072, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenuUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        jMenuUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jMenuUsuarios.setText("Usuarios");

        jMenuManual.setBackground(new java.awt.Color(0, 0, 0));
        jMenuManual.setForeground(new java.awt.Color(255, 255, 255));
        jMenuManual.setText("Manual Usuarios");
        jMenuManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuManualActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuManual);

        jMenuBar1.add(jMenuUsuarios);

        jMenuRegistros.setBackground(new java.awt.Color(0, 0, 0));
        jMenuRegistros.setForeground(new java.awt.Color(255, 255, 255));
        jMenuRegistros.setText("Registros");

        jMenuRegistroArticulos.setBackground(new java.awt.Color(0, 0, 0));
        jMenuRegistroArticulos.setForeground(new java.awt.Color(255, 255, 255));
        jMenuRegistroArticulos.setText("Registro Articulos");
        jMenuRegistroArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegistroArticulosActionPerformed(evt);
            }
        });
        jMenuRegistros.add(jMenuRegistroArticulos);

        jMenuBar1.add(jMenuRegistros);

        jMenuInventario.setBackground(new java.awt.Color(0, 0, 0));
        jMenuInventario.setForeground(new java.awt.Color(255, 255, 255));
        jMenuInventario.setText("Inventario");

        jMenuIAsignacion.setBackground(new java.awt.Color(0, 0, 0));
        jMenuIAsignacion.setForeground(new java.awt.Color(255, 255, 255));
        jMenuIAsignacion.setText("Asignacion Inventario");
        jMenuIAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIAsignacionActionPerformed(evt);
            }
        });
        jMenuInventario.add(jMenuIAsignacion);

        jMenuItem2.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setText("Lista de Inventario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuInventario.add(jMenuItem2);

        jMenuBar1.add(jMenuInventario);

        setJMenuBar(jMenuBar1);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//<editor-fold defaultstate="collapsed" desc="Eventos">
    private void jMenuManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuManualActionPerformed
        iniManual();
    }//GEN-LAST:event_jMenuManualActionPerformed

    private void jMenuRegistroArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegistroArticulosActionPerformed
        iniRegistro();
    }//GEN-LAST:event_jMenuRegistroArticulosActionPerformed

    private void jMenuIAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIAsignacionActionPerformed
        iniAsignacion();
    }//GEN-LAST:event_jMenuIAsignacionActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        iniUbicacionArticulos();
    }//GEN-LAST:event_jMenuItem2ActionPerformed
//</editor-fold>   
    
//<editor-fold defaultstate="collapsed" desc="Controls Genereted">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuIAsignacion;
    private javax.swing.JMenu jMenuInventario;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuManual;
    private javax.swing.JMenuItem jMenuRegistroArticulos;
    private javax.swing.JMenu jMenuRegistros;
    private javax.swing.JMenu jMenuUsuarios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
 
//<editor-fold defaultstate="collapsed" desc="Variables Globales">
private PantallaRegistro oPantallaRegistro;
private PantallaInventarios oPantallaInventarios;
private PantallaListas oPantallasListas;
private PantallaManual oPantallaManual;
ImagenPanel fondo = new ImagenPanel();
//</editor-fold>  

//<editor-fold defaultstate="collapsed" desc="Constructores">
    public JMDIPrincipal() {
        initComponents();
        this.setContentPane(fondo);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Dimensiones personalizadas 64x64 px.png")));
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Metodos">
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JMDIPrincipal().setVisible(true);
        });
    }
    
    //Todos estos metodos llaman a los otros jFrm   
    public void iniRegistro(){
        if (oPantallaRegistro == null || oPantallaRegistro.isClosed()) {
        oPantallaRegistro = new PantallaRegistro();
        this.add(oPantallaRegistro);
        oPantallaRegistro.setVisible(true);
        }
    } 
    public void iniAsignacion(){      
         if (oPantallaInventarios == null || oPantallaInventarios.isClosed()) {
         oPantallaInventarios = new PantallaInventarios();
         this.add(oPantallaInventarios);
         oPantallaInventarios.setVisible(true);
        }  
    }
         
    public void iniUbicacionArticulos(){
        if (oPantallasListas == null || oPantallasListas.isClosed()) {
         oPantallasListas= new PantallaListas();
         this.add(oPantallasListas);
         oPantallasListas.setVisible(true);
        }      
    }
    
    public void iniManual(){
        if (oPantallaManual == null || oPantallaManual.isClosed()) {
         oPantallaManual= new PantallaManual();
         this.add(oPantallaManual);
         oPantallaManual.setVisible(true);
        }     
    }
        
    //Esto agrega una imagen al FRM 
    class ImagenPanel extends JPanel {
        
        private Image imagen;
        
        @Override
        public void  paint (Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/Dimensiones personalizadas 1080x580 px.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }  
    }
}    
 //</editor-fold>   

