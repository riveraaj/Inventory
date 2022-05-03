package Pantallas;

import Controlador.Conexion;
import Principal.JMDIPrincipal;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan Rivera
 */

public class Pantalla_Login extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabeSesion = new javax.swing.JLabel();
        jLabelUsu = new javax.swing.JLabel();
        jLableContra = new javax.swing.JLabel();
        jTextUserName = new javax.swing.JTextField();
        jTextPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabelIngresar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JJH Inventory");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5ec7b8837a49399fc8b5887eaaaef434.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 176, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 420));

        jLabeSesion.setBackground(new java.awt.Color(0, 0, 0));
        jLabeSesion.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabeSesion.setForeground(new java.awt.Color(0, 0, 0));
        jLabeSesion.setText("INICIAR SESION");
        jPanel1.add(jLabeSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, 30));

        jLabelUsu.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabelUsu.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUsu.setText("USUARIO");
        jPanel1.add(jLabelUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 68, 30));

        jLableContra.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLableContra.setForeground(new java.awt.Color(0, 0, 0));
        jLableContra.setText("CONTRASEÑA");
        jPanel1.add(jLableContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, 33));

        jTextUserName.setBackground(new java.awt.Color(255, 255, 255));
        jTextUserName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextUserName.setForeground(new java.awt.Color(204, 204, 204));
        jTextUserName.setText("Ingrese su nombre de usuario");
        jTextUserName.setActionCommand("<Not Set>");
        jTextUserName.setBorder(null);
        jTextUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextUserNameMousePressed(evt);
            }
        });
        jTextUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUserNameActionPerformed(evt);
            }
        });
        jTextUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextUserNameKeyPressed(evt);
            }
        });
        jPanel1.add(jTextUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 410, 40));

        jTextPassword.setBackground(new java.awt.Color(255, 255, 255));
        jTextPassword.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextPassword.setForeground(new java.awt.Color(204, 204, 204));
        jTextPassword.setText("************");
        jTextPassword.setBorder(null);
        jTextPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextPasswordMousePressed(evt);
            }
        });
        jTextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPasswordActionPerformed(evt);
            }
        });
        jTextPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(jTextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 400, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 400, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 400, 50));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabelIngresar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelIngresar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabelIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIngresar.setText("INGRESAR");
        jLabelIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelIngresar)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 90, 30));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AYUDA");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//<editor-fold defaultstate="collapsed" desc="Eventos">
    private void jTextUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUserNameActionPerformed
        
    }//GEN-LAST:event_jTextUserNameActionPerformed

    private void jTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPasswordActionPerformed
        
    }//GEN-LAST:event_jTextPasswordActionPerformed

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jLabelIngresar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jLabelIngresar.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jTextUserNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextUserNameMousePressed
        if (jTextUserName.getText().equals("Ingrese su nombre de usuario")){
            jTextUserName.setText("");
            jTextUserName.setForeground(Color.black);
        }
        if (String.valueOf(jTextPassword.getPassword()).isEmpty()){
            jTextPassword.setText("************");
            jTextPassword.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_jTextUserNameMousePressed

    private void jTextPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextPasswordMousePressed
        if (String.valueOf(jTextPassword.getPassword()).equals("************")){
            jTextPassword.setText("");
            jTextPassword.setForeground(Color.black);
        }
        if (jTextUserName.getText().isEmpty()){
           jTextUserName.setText("Ingrese su nombre de usuario");
           jTextUserName.setForeground(Color.gray); 
        }

    }//GEN-LAST:event_jTextPasswordMousePressed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        iniIngresar();
        iniLimpiar();    
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
       JOptionPane.showMessageDialog(null, "Usuario predeterminado: admin\nContraseña predeterminada: admin\n");
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jTextPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPasswordKeyPressed
       if (String.valueOf(jTextPassword.getPassword()).equals("************")){
            jTextPassword.setText("");
            jTextPassword.setForeground(Color.black);
        }
        if (jTextUserName.getText().isEmpty()){
           jTextUserName.setText("Ingrese su nombre de usuario");
           jTextUserName.setForeground(Color.gray); 
        }
    }//GEN-LAST:event_jTextPasswordKeyPressed

    private void jTextUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextUserNameKeyPressed
        if (jTextUserName.getText().equals("Ingrese su nombre de usuario")){
            jTextUserName.setText("");
            jTextUserName.setForeground(Color.black);
        }
        if (String.valueOf(jTextPassword.getPassword()).isEmpty()){
            jTextPassword.setText("************");
            jTextPassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextUserNameKeyPressed
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Controls Generated">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabeSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIngresar;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelUsu;
    private javax.swing.JLabel jLableContra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jTextPassword;
    private javax.swing.JTextField jTextUserName;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Variables Globales">
int xMouse, yMouse, cant=1;
//</editor-fold>   
    
//<editor-fold defaultstate="collapsed" desc="Constructores">
    public Pantalla_Login() {       
        initComponents();
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
            java.util.logging.Logger.getLogger(Pantalla_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pantalla_Login().setVisible(true);
        });
    }
    
    /**Este metodo hace la conexion con el servidor 
       para verificar identidad de usuario de ser validada 
       muestra el jFrm Principal**/
    
    public void iniIngresar(){
        
            String user = jTextUserName.getText();
            String pass = jTextPassword.getText();
            String url = "select username, password from Usuarios where username='"+user+"'";

        try {
            Conexion oConexion = new Conexion();           
            oConexion.getConexion();
            PreparedStatement ps = oConexion.con.prepareStatement(url);
            ResultSet rs = ps.executeQuery();   

            if (rs.next()){            
                String u = rs.getString("username");
                String p = rs.getString("password");   

            
                if (pass.equals(p)){                     
                    JMDIPrincipal oJMDIPrincipal = new JMDIPrincipal();
                    oJMDIPrincipal.setVisible(true);
                    dispose();  
            
                }else {
                    JOptionPane.showMessageDialog(null, "LA CONTRASEÑA ES INCORRECTA");
                }
                }
            else{
                JOptionPane.showMessageDialog(null, "EL USUARIO NO EXISTE");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }      
    }
    
    //Este metodo limpia los espacios de datos solicitados
    public void iniLimpiar(){
        jTextUserName.setText(null);
        jTextPassword.setText(null);
    }
}
    
//</editor-fold>