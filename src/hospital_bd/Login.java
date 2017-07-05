package hospital_bd;

import com.mysql.jdbc.Connection;
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
        this.setOpacity(0.7f);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user_1 = new javax.swing.JTextField();
        pass_1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 140, 156, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 240, 93, 22);

        user_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_1ActionPerformed(evt);
            }
        });
        getContentPane().add(user_1);
        user_1.setBounds(190, 190, 156, 20);

        pass_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_1ActionPerformed(evt);
            }
        });
        getContentPane().add(pass_1);
        pass_1.setBounds(190, 290, 156, 20);

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 370, 80, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pro_segu_infor_03 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-330, 10, 1250, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Consulta a base de datos
        //String user = user_1.getText();
        //String pass = pass_1.getText();
        //consult(user, pass);

        //Entrada Directa
        MenuFinanzas n = new MenuFinanzas();
        n.setVisible(true);

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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

                        Menu n = new Menu();
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
