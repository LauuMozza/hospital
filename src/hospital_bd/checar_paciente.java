/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_bd;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author almas
 */
public class checar_paciente extends javax.swing.JFrame {
    /**
     * Creates new form checar_paciente
     */

  String IDPACIENTE ="";
     String NOMBRE ="";
     String TELEFONO ="";
     String  EDAD ="";
     String DIRECCION ="";
     String SEXO ="";
     String REGISTRO_IDREGISTRO="";
     String TRASLADO_IDTRASLADO="";
  
     
     

    public checar_paciente() {
        initComponents();
           jTable1.addMouseListener(new MouseAdapter() {
            
            DefaultTableModel model =new DefaultTableModel();
            
            public void mouseClicked (MouseEvent e){
                int i = jTable1.getSelectedRow();
           IDPACIENTE=(jTable1.getValueAt(i, 0).toString());
               NOMBRE =(jTable1.getValueAt(i,1).toString());
              TELEFONO  =(jTable1.getValueAt(i,2).toString());
                 EDAD=(jTable1.getValueAt(i, 0).toString());
              DIRECCION  =(jTable1.getValueAt(i,1).toString());
              SEXO  =(jTable1.getValueAt(i,2).toString());
               REGISTRO_IDREGISTRO  =(jTable1.getValueAt(i,1).toString());
              TRASLADO_IDTRASLADO =(jTable1.getValueAt(i,2).toString());
            }
            
            
});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 645, 90, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id cuenta paciente", "Id registro", "Costo total", "Registro_id"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 640, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      gastos1 g = new gastos1();
      g.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
     public void consultar(){
    
        int sw=0;
        
        try{
        
         Connection con;//conecta los datos a la base de datos.
         PreparedStatement stmt;//traduce las cadenas para mandarlas a la base de datos
         ResultSet tabla;
         con= DB.getConnection();
         
         
     
      
      String sql=" select * from cuentapaciente " ;
            
      
            
         
            
           stmt=con.prepareStatement(sql);
           System.out.println(sql);
           
           tabla=stmt.executeQuery();
           
          
           while (tabla.next()) // 
           {
               
         
           sw=1;
              
               DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
               model.addRow(new Object [] {  tabla.getString(2), tabla.getString(3), tabla.getString(4)});
               
           }
         
           
           }
           catch(SQLException e1){
           JOptionPane.showMessageDialog(null, e1);
           }
          catch(Exception e2){
          JOptionPane.showMessageDialog(null, e2);
           }
        
        if (sw==0) {
              JOptionPane.showMessageDialog(null, "***no existe el registro*** ");
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
            java.util.logging.Logger.getLogger(checar_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checar_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checar_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checar_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checar_paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
