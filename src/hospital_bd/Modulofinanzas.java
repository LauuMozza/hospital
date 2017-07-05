package hospital_bd;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Modulofinanzas extends javax.swing.JFrame {

    public Modulofinanzas() {
        
        initComponents();
//setSize(850,650);
        escritorio.setBorder(new fondo());
        Dimension tamPantalla= Toolkit.getDefaultToolkit().getScreenSize(); 
Dimension tamFrame = this.getSize(); 
if (tamFrame .height > tamPantalla.height) 
tamFrame .height = tamPantalla.height; 
if (tamFrame .width > tamPantalla.width) 
tamFrame .width = tamPantalla.width; 
this.setLocation((tamPantalla.width - tamFrame .width) / 2, (tamPantalla.height - tamFrame .height) / 2); 
this.setVisible(true); 
      
       // this.setExtendedState(Modulofinanzas.MAXIMIZED_BOTH);
    }
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        menu = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        menu1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/blank.png")).getImage());
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        menu.setForeground(new java.awt.Color(0, 0, 153));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        menu.setText("Regresar");
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        escritorio.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 880, 440));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 110, 130));

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        menu1.setForeground(new java.awt.Color(0, 0, 153));
        menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/help.png"))); // NOI18N
        menu1.setText("Ayuda");
        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blank.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 560));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setForeground(new java.awt.Color(0, 0, 153));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro.png"))); // NOI18N
        jMenu1.setText("Registro");
        jMenu1.setFont(new java.awt.Font("Kalinga", 1, 14)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ir.png"))); // NOI18N
        jMenuItem2.setText("Agregar nuevo regitro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setForeground(new java.awt.Color(0, 0, 153));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuenta.png"))); // NOI18N
        jMenu2.setText("Cuenta paciente");
        jMenu2.setFont(new java.awt.Font("Kalinga", 1, 14)); // NOI18N

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ir.png"))); // NOI18N
        jMenuItem3.setText("Nuevo registro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(0, 0, 153));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paciente.png"))); // NOI18N
        jMenu3.setText("Paciente");
        jMenu3.setFont(new java.awt.Font("Kalinga", 1, 14)); // NOI18N

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ir.png"))); // NOI18N
        jMenuItem4.setText("Nuevo registro");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
   
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
   registro1 uu=new registro1();
        escritorio.add(uu);
        uu.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        cuentapaciente1 i=new cuentapaciente1();
        escritorio.add(i);
        i.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
paciente1 yy=new paciente1();
escritorio.add(yy);
yy.show();
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Modulofinanzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulofinanzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulofinanzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulofinanzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modulofinanzas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JButton menu;
    private javax.swing.JButton menu1;
    // End of variables declaration//GEN-END:variables
}
