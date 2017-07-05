package hospital_bd;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class paciente1 extends javax.swing.JInternalFrame {

    public paciente1() {
        initComponents();
    }





    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();
        tf_edad = new javax.swing.JTextField();
        tf_direccion = new javax.swing.JTextField();
        tf_sexo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        txtnomimagen = new javax.swing.JTextField();
        lblfoto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Teléfono:");

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Edad:");

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Dirección:");

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Sexo:");

        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });

        tf_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_telefonoActionPerformed(evt);
            }
        });

        tf_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_edadActionPerformed(evt);
            }
        });

        tf_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_direccionActionPerformed(evt);
            }
        });

        tf_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_edad)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 480, 250));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn3)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 370, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jToggleButton1.setText("Añadir nueva foto");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        jPanel4.add(txtnomimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 230, 30));

        lblfoto.setBackground(new java.awt.Color(153, 153, 153));
        lblfoto.setForeground(new java.awt.Color(153, 153, 153));
        jPanel4.add(lblfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 208));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 240, 340));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blank.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed

        String nulo=" ";
        if (tf_nombre.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El código autor es requerido ***");
        }else{

            tf_telefono.requestFocusInWindow();

        }
    }//GEN-LAST:event_tf_nombreActionPerformed

    private void tf_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telefonoActionPerformed

        String nulo=" ";
        if (tf_telefono.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El código autor es requerido ***");
        }else{

            tf_edad.requestFocusInWindow();

        }
    }//GEN-LAST:event_tf_telefonoActionPerformed

    private void tf_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_edadActionPerformed

        String nulo=" ";
        if (tf_edad.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El código autor es requerido ***");
        }else{

            tf_direccion.requestFocusInWindow();

        }
    }//GEN-LAST:event_tf_edadActionPerformed

    private void tf_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_direccionActionPerformed

        String nulo=" ";
        if (tf_direccion.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El código autor es requerido ***");
        }else{

            tf_sexo.requestFocusInWindow();

        }

    }//GEN-LAST:event_tf_direccionActionPerformed

    private void tf_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sexoActionPerformed

        String nulo=" ";
        if (tf_sexo.getText().equals(nulo)) {
            JOptionPane.showMessageDialog(null,"*** El código autor es requerido ***");
        }else{

            btn1.requestFocusInWindow();

        }
    }//GEN-LAST:event_tf_sexoActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        nuevo();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        grabar();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        modificar();
    }//GEN-LAST:event_btn3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        FileNameExtensionFilter filtro=new FileNameExtensionFilter("Formatos de archivos JPEG(*.JPG;*.JPEG)","jpg","jpeg");
        JFileChooser archivo=new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Abrir archivo");
        File ruta=new File("C:\\IMAGENESDEBDD");
        archivo.setCurrentDirectory(ruta);
        int ventana=archivo.showOpenDialog(null);
        if (ventana== JFileChooser.APPROVE_OPTION) {
            File file=archivo.getSelectedFile();
            txtnomimagen.setText(String.valueOf(file));
            Image foto=getToolkit().getImage(txtnomimagen.getText());
            foto=foto.getScaledInstance(110,110, Image.SCALE_DEFAULT);
            lblfoto.setIcon(new ImageIcon(foto));
            
            
        }
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed
public void nuevo(){
    
   
    tf_nombre.setText("");
    tf_telefono.setText("");
    tf_edad.setText("");
    tf_direccion.setText("");
    tf_sexo.setText("");
    tf_nombre.requestFocusInWindow();
     }
     
     
    public void grabar(){
              try  {    
        
       Class.forName("com.mysql.jdbc.Driver");
       String cadena ="jdbc:mysql://localhost/hospital?user=root&password=12345678";
       Connection con= DriverManager.getConnection(cadena);
      PreparedStatement stmt=null;
      
      
   
      String nombre=tf_nombre.getText();
      String telefono=tf_telefono.getText();
      String  edad=tf_edad.getText();
      String direccion=tf_nombre.getText();
      String sexo=tf_telefono.getText();
    
      
      String sql="  insert into paciente values( ";
      sql +=  "\"" + nombre + "\""+",";
      sql += telefono +"," +  edad +",";
      sql += "\""+direccion +"\""+ "," + "\"" + sexo + "\""+")";
      
      
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
         
         
    
      String nombre=tf_nombre.getText();
      String telefono=tf_telefono.getText();
      String  edad=tf_edad.getText();
      String direccion=tf_nombre.getText();
      String sexo=tf_telefono.getText();
      
      String sql="update paciente set ";
      
           sql += "nombre= "+"\"" + nombre + "\""+",";
           sql += "telefono= "+ telefono +",";
           sql += "edad= "+ edad +",";
           sql += "direccion= "+"\"" + direccion + "\""+",";
           sql += "sexo= " +"\""+ sexo + "\"" + " where nombre =" + tf_nombre + " ; ";
         
           
           
           
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
         
         String  nombre=tf_nombre.getText();  
         String sql="delete from paciente where nombre="+nombre  ;
         sql+="\""+tf_nombre.getText()+"\";";
         
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_sexo;
    private javax.swing.JTextField tf_telefono;
    private javax.swing.JTextField txtnomimagen;
    // End of variables declaration//GEN-END:variables
}
