
package hospital_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Perfilpaciente extends javax.swing.JFrame {

    /**
     * Creates new form Perfilpaciente
     */
      ResultSet rs;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;
    public Perfilpaciente() {
      
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

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();
        tf_edad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_sexo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        l1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        l2 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        l4 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Dirección:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 168, -1, -1));

        jLabel6.setText("Sexo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 203, -1, -1));

        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 44, 179, -1));

        tf_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(tf_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 82, 179, -1));

        tf_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_edadActionPerformed(evt);
            }
        });
        getContentPane().add(tf_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 124, 179, -1));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 47, -1, -1));

        tf_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_direccionActionPerformed(evt);
            }
        });
        getContentPane().add(tf_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 162, 179, -1));

        jLabel3.setText("Teléfono:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 85, -1, -1));

        tf_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sexoActionPerformed(evt);
            }
        });
        getContentPane().add(tf_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 200, 179, -1));

        jLabel4.setText("Edad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 127, -1, -1));

        btn1.setText("Agregar visita");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        btn2.setText("Agregar medico");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, -1));

        btn3.setText("Agregar medicamentos");
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, -1, -1));

        btn4.setText("Agregar tratamientos");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        jLabel1.setText("Tratamientos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        l1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id visitas", "nombre"
            }
        ));
        jScrollPane3.setViewportView(l1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 170, 146));

        l2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id medico", "especialidad"
            }
        ));
        jScrollPane5.setViewportView(l2);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 170, 146));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id medicamento", "nombre"
            }
        ));
        jScrollPane6.setViewportView(jTable4);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 170, 146));

        l4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id tratamiento", "descripcion"
            }
        ));
        jScrollPane7.setViewportView(l4);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 160, 146));

        jLabel10.setText("Visitas");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel11.setText("Medicos");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jLabel12.setText("Medicamentos");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed

        String nulo=" ";
        if (tf_nombre.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El id autores es requerido ***");
        }else{

            tf_telefono.requestFocusInWindow();

        }

    }//GEN-LAST:event_tf_nombreActionPerformed

    private void tf_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telefonoActionPerformed

        String nulo=" ";
        if (tf_telefono.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El id autores es requerido ***");
        }else{

            tf_edad.requestFocusInWindow();

        }

    }//GEN-LAST:event_tf_telefonoActionPerformed

    private void tf_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_edadActionPerformed

        String nulo=" ";
        if (tf_edad.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El id autores es requerido ***");
        }else{

            tf_direccion.requestFocusInWindow();

        }

    }//GEN-LAST:event_tf_edadActionPerformed

    private void tf_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_direccionActionPerformed

        String nulo=" ";
        if (tf_direccion.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El id autores es requerido ***");
        }else{

            tf_sexo.requestFocusInWindow();

        }

    }//GEN-LAST:event_tf_direccionActionPerformed

    private void tf_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sexoActionPerformed

        String nulo=" ";
        if (tf_sexo.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El id autores es requerido ***");
        }else{

            btn1.requestFocusInWindow();

        }

    }//GEN-LAST:event_tf_sexoActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
    try {
            
             Class.forName("com.mysql.jdbc.Driver");
       String cadena ="jdbc:mysql://localhost/hospital?user=root&password=12345678";
       Connection con= DriverManager.getConnection(cadena);
      PreparedStatement stmt=null;
      stmt=con.prepareStatement("select idVisitas, nombre from visitas");
      rs=stmt.executeQuery();
      rsm=rs.getMetaData();
      ArrayList<Object[]> data=new ArrayList <>();
      while(rs.next()){
      Object[] rows=new Object[rsm.getColumnCount()];      
      
          for (int i = 0; i < rows.length; i++) {
              rows[i]=rs.getObject(i+1);
          }
          
          data.add(rows);
          
          
      }
      
      dtm=(DefaultTableModel)this.l1.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
    try {
            
             Class.forName("com.mysql.jdbc.Driver");
       String cadena ="jdbc:mysql://localhost/hospital?user=root&password=12345678";
       Connection con= DriverManager.getConnection(cadena);
      PreparedStatement stmt=null;
      stmt=con.prepareStatement("select idMedico, especialidad from medicos");
      rs=stmt.executeQuery();
      rsm=rs.getMetaData();
      ArrayList<Object[]> data=new ArrayList <>();
      while(rs.next()){
      Object[] rows=new Object[rsm.getColumnCount()];      
      
          for (int i = 0; i < rows.length; i++) {
              rows[i]=rs.getObject(i+1);
          }
          
          data.add(rows);
          
          
      }
      
      dtm=(DefaultTableModel)this.l2.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }  
        
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
  try {
            
             Class.forName("com.mysql.jdbc.Driver");
       String cadena ="jdbc:mysql://localhost/hospital?user=root&password=12345678";
       Connection con= DriverManager.getConnection(cadena);
      PreparedStatement stmt=null;
      stmt=con.prepareStatement("select idTratamiento, descripcion from tratamiento");
      rs=stmt.executeQuery();
      rsm=rs.getMetaData();
      ArrayList<Object[]> data=new ArrayList <>();
      while(rs.next()){
      Object[] rows=new Object[rsm.getColumnCount()];      
      
          for (int i = 0; i < rows.length; i++) {
              rows[i]=rs.getObject(i+1);
          }
          
          data.add(rows);
          
          
      }
      
      dtm=(DefaultTableModel)this.l4.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btn4ActionPerformed

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
            java.util.logging.Logger.getLogger(Perfilpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfilpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfilpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfilpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfilpaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable l1;
    private javax.swing.JTable l2;
    private javax.swing.JTable l4;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_sexo;
    private javax.swing.JTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
}
