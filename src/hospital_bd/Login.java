package hospital_bd;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel1.setBackground(new Color(123, 14, 123, 64));
        this.setSize(800, 600);
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        Dimension tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension tamFrame = this.getSize();
        if (tamFrame.height > tamPantalla.height) {
            tamFrame.height = tamPantalla.height;
        }
        if (tamFrame.width > tamPantalla.width) {
            tamFrame.width = tamPantalla.width;
        }
        this.setLocation((tamPantalla.width - tamFrame.width) / 2, (tamPantalla.height - tamFrame.height) / 2);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        user_1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pass_1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del usuario");

        user_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña");

        pass_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_1ActionPerformed(evt);
            }
        });

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(user_1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(pass_1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(user_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(pass_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(90, 100, 320, 410);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pro_segu_infor_03 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-320, -10, 1120, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Consulta a base de datos
        //String user = user_1.getText();
        //String pass = pass_1.getText();
        //consult(user, pass);

        //Entrada Directa
        this.dispose();
        MainMenu n = new MainMenu();
        n.setVisible(true);
        n.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void user_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_1ActionPerformed

    private void pass_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_1ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pass_1;
    private javax.swing.JTextField user_1;
    // End of variables declaration//GEN-END:variables

    private void connect_and_catch(String sql, String mensaje) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String cadena = "jdbc:mysql://127.0.0.1/Hospital?user=richi&password=12345";
            Connection con = (Connection) DriverManager.getConnection(cadena);
            PreparedStatement stmt = null;
            stmt = con.prepareStatement(sql);
            int sw = stmt.executeUpdate();
            if (sw != 0) {
                JOptionPane.showMessageDialog(null, mensaje);
                this.dispose();
            }
        } catch (ClassNotFoundException e1) {
            JOptionPane.showMessageDialog(null, e1);
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null, e2);
        } catch (Exception e3) {
            JOptionPane.showMessageDialog(null, e3);
        }
    }

    private void consult(String acc, String pass) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String cadena = "jdbc:mysql://192.168.43.245/hospital";
            Connection con = (Connection) DriverManager.getConnection(cadena, "richi", "123456");
            PreparedStatement stmt = null;
            ResultSet table;
            String sql = "select * from usuarios";
            stmt = con.prepareStatement(sql);
            table = stmt.executeQuery();

            boolean coun = false;
            while (table.next()) {
                String c_acc = table.getString(2);
                String c_pass = table.getString(8);
                if (c_acc.equals(acc)) {
                    System.out.println("Usuarios encontrado");
                    if (c_pass.equals(pass)) {
                        System.out.println("Conseder loggin");
                        MainMenu n = new MainMenu();
                        n.setVisible(true);
                        break;
                    } else {
                        System.out.println("Contraseña incorrecta");
                        break;
                    }

                } else {
                    coun = true;
                }
            }
            if (coun) {
                System.out.println("Usuario no valido");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
