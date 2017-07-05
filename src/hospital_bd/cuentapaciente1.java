package hospital_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class cuentapaciente1 extends javax.swing.JInternalFrame {

    public cuentapaciente1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(856, 444));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Id cuentapaciente");

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Id_registro");

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Costo total");

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(txt1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, 160));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btn1.setText("Nuevo");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grabar.png"))); // NOI18N
        btn2.setText("Grabar");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btn3.setText("Modificar");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/elimina.png"))); // NOI18N
        btn4.setText("Eliminar");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        btn5.setText("Salir");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn1)
                .addGap(33, 33, 33)
                .addComponent(btn2)
                .addGap(28, 28, 28)
                .addComponent(btn3)
                .addGap(18, 18, 18)
                .addComponent(btn4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btn5)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btn4)
                    .addComponent(btn5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 630, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blank.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        String nulo=" ";
        if (txt1.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El código autor es requerido ***");
        }else{

            txt2.requestFocusInWindow();

        }

    }//GEN-LAST:event_txt1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        String nulo=" ";
        if (txt2.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El código autor es requerido ***");
        }else{

            txt3.requestFocusInWindow();

        }
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed

        String nulo=" ";
        if (txt3.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El código autor es requerido ***");
        }else{

            btn1.requestFocusInWindow();

        }
    }//GEN-LAST:event_txt3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        nuevo();

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        grabar();

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        modificar();

    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        borrar();

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        
        dispose();

    }//GEN-LAST:event_btn5ActionPerformed

     public void nuevo(){
    
    txt1.setText("");
    txt2.setText("");
    txt3.setText("");
 
    txt1.requestFocusInWindow();
     }
     
     
    public void grabar(){
              try  {    
      
      Class.forName("com.mysql.jdbc.Driver");
      String cadena ="jdbc:mysql://localhost/hospital?user=root&password=12345678";
      Connection con= DriverManager.getConnection(cadena);
      PreparedStatement stmt=null;
      
      
      String  idCuentaPaciente=txt1.getText();
      String idRegistro=txt2.getText();
      String costoTotal=txt3.getText();
    
    
      
      String sql="  insert into paciente values( ";
      sql += idCuentaPaciente + "," +  idRegistro +",";
      sql +=  costoTotal + ")";
     
      
      JOptionPane.showMessageDialog(null,sql);
     
      
      
      stmt=con.prepareStatement(sql);
      int sw=stmt.executeUpdate();
       if (sw!=0) {
  JOptionPane.showMessageDialog(null,"Registrado de alta con éxito");
  nuevo();      
  }
       
   }catch (ClassNotFoundException e1){ 
       JOptionPane.showMessageDialog(null,e1);
   
   }
   catch (SQLException e2){
    JOptionPane.showMessageDialog(null,e2);
   } 
   catch (Exception e3){
   
   }
   }
   
   
    
     public void modificar(){
        
    try{
        
        
         Class.forName("com.mysql.jdbc.Driver");
         String cadena="jdbc:mysql://localhost/hospital?user=root&password=12345678";
         Connection con;
         PreparedStatement stmt;
         con= DriverManager.getConnection(cadena);
         
         
       String  idCuentaPaciente=txt1.getText();
      String idRegistro=txt2.getText();
      String costoTotal=txt3.getText();
    
      
      String sql="update cuentapaciente set ";
      
           sql += "idRegistro= "+ idRegistro  + ",";
           sql += "costoTotal= " + costoTotal  + " where idCuentaPaciente =" + idCuentaPaciente + " ; ";
         
           
           
           
           JOptionPane.showMessageDialog(null, sql);
           
      
           stmt=con.prepareStatement(sql);
           int sw= stmt.executeUpdate();
           
           
           
          if(sw!=0){
          JOptionPane.showMessageDialog(null, "Registro Modificado");
          
               nuevo();
          }
          }catch(ClassNotFoundException e){
          JOptionPane.showMessageDialog(null, e);
          }
         catch(SQLException e1){
         JOptionPane.showMessageDialog(null, e1);
          }
         catch(Exception e2){
         JOptionPane.showMessageDialog(null, e2);
         }
     }
     
     
         public void borrar(){
     try{
        
        
         Class.forName("com.mysql.jdbc.Driver");
         String cadena="jdbc:mysql://localhost/biblioteca?user=root&password=12345678";
         Connection con;
         PreparedStatement stmt;
         con= DriverManager.getConnection(cadena);
         //ResultSet autores;
         
         String  idCuentaPaciente=txt1.getText();  
         String sql="delete from cuentapaciente where idCuentaPaciente="+idCuentaPaciente  ;
         sql+="\""+txt1.getText()+"\";";
         
         JOptionPane.showMessageDialog(null, sql);
          stmt=con.prepareStatement(sql);
          int sw= stmt.executeUpdate();
           
           
           
          if(sw!=0){
          JOptionPane.showMessageDialog(null, "Registro borrado");
               nuevo();
          }
          }catch(ClassNotFoundException e){
          JOptionPane.showMessageDialog(null, e);
          }
         catch(SQLException e1){
         JOptionPane.showMessageDialog(null, e1);
          }
         catch(Exception e2){
         JOptionPane.showMessageDialog(null, e2);
         }
         
    
    
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
