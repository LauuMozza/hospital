package hospital_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class registro1 extends javax.swing.JInternalFrame {
    public registro1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(856, 444));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Id registro:");

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Id paciente:");

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Id traslado:");

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Id estancias:");

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Id lista medicos:");

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Fecha alta:");

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Fecha baja:");

        jLabel8.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Urgencia:");

        txt1.setMinimumSize(new java.awt.Dimension(6, 22));
        txt1.setPreferredSize(new java.awt.Dimension(6, 22));
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        txt2.setMinimumSize(new java.awt.Dimension(6, 22));
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt3.setMinimumSize(new java.awt.Dimension(6, 25));
        txt3.setPreferredSize(new java.awt.Dimension(6, 25));
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        txt4.setPreferredSize(new java.awt.Dimension(6, 25));
        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });

        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });

        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });

        txt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt7ActionPerformed(evt);
            }
        });

        txt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt8ActionPerformed(evt);
            }
        });

        jLabel9.setText("0000/00/00");

        jLabel10.setText("0000/00/00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(450, 450, 450))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel9)
                        .addGap(124, 124, 124)
                        .addComponent(jLabel10)))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 260));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blank.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.setMaximumSize(new java.awt.Dimension(900, 1134));
        jLabel11.setMinimumSize(new java.awt.Dimension(900, 1134));
        jLabel11.setPreferredSize(new java.awt.Dimension(900, 1134));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 410));

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

            txt4.requestFocusInWindow();

        }
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed

        String nulo=" ";
        if (txt4.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El código autor es requerido ***");
        }else{

            txt5.requestFocusInWindow();

        }
    }//GEN-LAST:event_txt4ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed

        String nulo=" ";
        if (txt5.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El código autor es requerido ***");
        }else{

            txt6.requestFocusInWindow();

        }
    }//GEN-LAST:event_txt5ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        String nulo=" ";
        if (txt6.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El código autor es requerido ***");
        }else{

            txt7.requestFocusInWindow();

        }

    }//GEN-LAST:event_txt6ActionPerformed

    private void txt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt7ActionPerformed
        String nulo=" ";
        if (txt7.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El código autor es requerido ***");
        }else{

            txt8.requestFocusInWindow();

        }

    }//GEN-LAST:event_txt7ActionPerformed

    private void txt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt8ActionPerformed
        String nulo=" ";
        if (txt8.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El código autor es requerido ***");
        }else{

            btn1.requestFocusInWindow();

        }

    }//GEN-LAST:event_txt8ActionPerformed

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
    txt4.setText("");
    txt5.setText("");
    txt6.setText("");
    txt7.setText("");
    txt8.setText("");
    txt1.requestFocusInWindow();
     }
     
     
    public void grabar(){
              try  {    
        
       Class.forName("com.mysql.jdbc.Driver");
       String cadena ="jdbc:mysql://localhost/hospital?user=root&password=12345678";
       Connection con= DriverManager.getConnection(cadena);
      PreparedStatement stmt=null;
      
      
      String  idRegistro=txt1.getText();
      String idPaciente=txt2.getText();
      String idTraslado=txt3.getText();
      String  idEstancias=txt4.getText();
      String idListaMedicos=txt5.getText();
      String fechaAlta=txt6.getText();
       String fechaBaja=txt7.getText();
      String urgencias=txt8.getText();
    
      
      String sql="  insert into registro values( ";
      sql += idRegistro + "," +  idPaciente +",";
      sql += idTraslado + "," +  idEstancias +",";
        sql += idListaMedicos + "," +  fechaAlta +",";
      sql += fechaBaja + "," + "\""+ urgencias +"\""+")";
      
      
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
         
         
       String  idRegistro=txt1.getText();
      String idPaciente=txt2.getText();
      String idTraslado=txt3.getText();
      String  idEstancias=txt4.getText();
      String idListaMedicos=txt5.getText();
      String fechaAlta=txt6.getText();
       String fechaBaja=txt7.getText();
      String urgencias=txt8.getText();
    
      
      String sql="update registro set ";
      
           sql += "idListaMedicamentos= "+ idPaciente +",";
           sql += "idListaSintomas= "+ idTraslado +",";
           sql += "idListaVisitas= "+ idEstancias +",";
           sql += "idListaVisitas= "+ idListaMedicos +",";
           sql += "idCuarto= "+ fechaAlta + ",";
           sql += "idCuarto= "+ fechaBaja + ",";
           sql += "idTratamineto= " +"\""+ urgencias+"\""  + " where idEstancias =" + idRegistro + " ; ";
         
           
           
           
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
         
         String  idRegistro=txt1.getText();  
         String sql="delete from registro where idRegistro="+idRegistro  ;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    // End of variables declaration//GEN-END:variables
}
