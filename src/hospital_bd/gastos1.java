/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author almas
 */
public class gastos1 extends javax.swing.JFrame {

    /**
     * Creates new form gastos1
     */
    public gastos1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfidcuenta = new javax.swing.JTextField();
        tfidregistro = new javax.swing.JTextField();
        tfidcosto = new javax.swing.JTextField();
        tfregistroid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Cuenta Paciente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(273, 38, 100, 30);

        jLabel2.setText("Id cuenta ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(46, 125, 60, 20);

        jLabel3.setText("Id registro");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(46, 182, 80, 16);

        jLabel4.setText("Costo total");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(46, 235, 61, 16);

        jLabel5.setText("Registro_id");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(46, 286, 64, 16);
        getContentPane().add(tfidcuenta);
        tfidcuenta.setBounds(174, 122, 190, 22);
        getContentPane().add(tfidregistro);
        tfidregistro.setBounds(174, 179, 190, 22);
        getContentPane().add(tfidcosto);
        tfidcosto.setBounds(174, 232, 190, 22);
        getContentPane().add(tfregistroid);
        tfregistroid.setBounds(174, 283, 190, 22);

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 370, 67, 25);

        jButton2.setText("Eliminar");
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 370, 79, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       grabar ();
    }//GEN-LAST:event_jButton1ActionPerformed

      public void grabar(){
              try  {    
        
     
       Connection con= DB.getConnection();
      PreparedStatement stmt=null;
      
      
      String  id_paciente = tfidcuenta.getText();
      String nombre=tfidregistro.getText();
      String telefono=tfidcosto.getText();
      String edad=tfregistroid.getText();
     
         
      
      String sql="  insert into paciente values( ";
      sql += id_paciente + ","+ nombre +",";
      sql += telefono +","+edad + ")";
      
      JOptionPane.showMessageDialog(null,sql);
     
      
      
      stmt=con.prepareStatement(sql);
      int sw=stmt.executeUpdate();
       if (sw!=0) {
           JOptionPane.showMessageDialog(null,"Registrado de alta con éxito");
      
       }
       
   }
   catch (SQLException e2){
    JOptionPane.showMessageDialog(null,e2);
   } 
   catch (Exception e3){
   
   } 
   
    }

       public void borrar(){
     try{
        
        
        
         Connection con;
         PreparedStatement stmt;
         con= DB.getConnection();
         //ResultSet autores;
         
 
      
      String sql="delete from cuentapaciente where idCuentaPaciente="  ;
      
        sql+="\""+tfidcuenta.getText()+"\";";
    
         
     
           
           JOptionPane.showMessageDialog(null, sql);
           stmt=con.prepareStatement(sql);
           int sw= stmt.executeUpdate();
           
           
           
          if(sw!=0){
          JOptionPane.showMessageDialog(null, "Registro borrado");
               
          }
          }
         catch(SQLException e1){
         JOptionPane.showMessageDialog(null, e1);
          }
         catch(Exception e2){
         JOptionPane.showMessageDialog(null, e2);
         }
    }
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
            java.util.logging.Logger.getLogger(gastos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gastos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gastos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gastos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gastos1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfidcosto;
    private javax.swing.JTextField tfidcuenta;
    private javax.swing.JTextField tfidregistro;
    private javax.swing.JTextField tfregistroid;
    // End of variables declaration//GEN-END:variables
}
