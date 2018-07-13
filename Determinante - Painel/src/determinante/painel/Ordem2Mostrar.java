package determinante.painel;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class Ordem2Mostrar extends javax.swing.JFrame {

    Home home = new Home();
    
    public Ordem2Mostrar() {
        initComponents();
        setIcon();
        lblPos00.setText("null");
        lblPos01.setText("null");
        lblPos10.setText("null");
        lblPos11.setText("null");
    }
    
     public void Matriz(MaTOrdem2 valor){
        lblPos00.setText(valor.getValor00());
        lblPos01.setText(valor.getValor01());
        lblPos10.setText(valor.getValor10());
        lblPos11.setText(valor.getValor11());
        lblDiagP.setText(""+valor.getPDiagPrin());
        lblDiagS.setText(""+valor.getPDiagSec());
        lblDeter.setText(""+valor.getDet());
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo_2 = new javax.swing.JLabel();
        jSeparator_2 = new javax.swing.JSeparator();
        lblSubTitulo_2 = new javax.swing.JLabel();
        jSeparator2_2 = new javax.swing.JSeparator();
        lblSubTitulo1_2 = new javax.swing.JLabel();
        jSeparator3_2 = new javax.swing.JSeparator();
        lblSubTitulo2_2 = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPos00 = new javax.swing.JLabel();
        lblPos01 = new javax.swing.JLabel();
        lblPos10 = new javax.swing.JLabel();
        lblPos11 = new javax.swing.JLabel();
        lblDiagP = new javax.swing.JLabel();
        lblDiagS = new javax.swing.JLabel();
        lblDeter = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo_2.setText("Matriz Ordem 2");
        getContentPane().add(lblTitulo_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));
        getContentPane().add(jSeparator_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, 10));

        lblSubTitulo_2.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        lblSubTitulo_2.setText("Matriz");
        getContentPane().add(lblSubTitulo_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        getContentPane().add(jSeparator2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 80, 10));

        lblSubTitulo1_2.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        lblSubTitulo1_2.setText("MatrizX");
        getContentPane().add(lblSubTitulo1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));
        getContentPane().add(jSeparator3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 80, 10));

        lblSubTitulo2_2.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        lblSubTitulo2_2.setText("MatrizY");
        getContentPane().add(lblSubTitulo2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        BotaoVoltar.setText("Voltar");
        BotaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });
        BotaoVoltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoVoltarKeyPressed(evt);
            }
        });
        getContentPane().add(BotaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Diagonal Principal: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel2.setText("Diagonal Secundária:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel3.setText("Determinante:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lblPos00.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(lblPos00, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        lblPos01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(lblPos01, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        lblPos10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(lblPos10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lblPos11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(lblPos11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        lblDiagP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblDiagP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 40, -1));

        lblDiagS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblDiagS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 40, -1));

        lblDeter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblDeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, 210));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 180, 210));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 180, 210));

        setSize(new java.awt.Dimension(639, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        Ordem2Mostrar.this.dispose();
        this.home.setVisible(true);
        home.setLogin(1);
        home.Login();
              
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoVoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoVoltarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Ordem2Mostrar.this.dispose();
            this.home.setVisible(true);
            home.setLogin(1);
            home.Login();
            
        }
    }//GEN-LAST:event_BotaoVoltarKeyPressed

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
            java.util.logging.Logger.getLogger(Ordem2Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordem2Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordem2Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordem2Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordem2Mostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2_2;
    private javax.swing.JSeparator jSeparator3_2;
    private javax.swing.JSeparator jSeparator_2;
    private javax.swing.JLabel lblDeter;
    private javax.swing.JLabel lblDiagP;
    private javax.swing.JLabel lblDiagS;
    private javax.swing.JLabel lblPos00;
    private javax.swing.JLabel lblPos01;
    private javax.swing.JLabel lblPos10;
    private javax.swing.JLabel lblPos11;
    private javax.swing.JLabel lblSubTitulo1_2;
    private javax.swing.JLabel lblSubTitulo2_2;
    private javax.swing.JLabel lblSubTitulo_2;
    private javax.swing.JLabel lblTitulo_2;
    // End of variables declaration//GEN-END:variables
    
    public javax.swing.JLabel getLblPos00() {
        return lblPos00;
    }
    public void setLblPos00(javax.swing.JLabel lblPos00) {
        this.lblPos00 = lblPos00;
    }
    public javax.swing.JLabel getLblPos01() {
        return lblPos01;
    }
    public void setLblPos01(javax.swing.JLabel lblPos01) {
        this.lblPos01 = lblPos01;
    }
    public javax.swing.JLabel getLblPos10() {
        return lblPos10;
    }
    public void setLblPos10(javax.swing.JLabel lblPos10) {
        this.lblPos10 = lblPos10;
    }
    public javax.swing.JLabel getLblPos11() {
        return lblPos11;
    }
    public void setLblPos11(javax.swing.JLabel lblPos11) {
        this.lblPos11 = lblPos11;
    }

    public javax.swing.JLabel getLblDeter() {
        return lblDeter;
    }

    public void setLblDeter(javax.swing.JLabel lblDeter) {
        this.lblDeter = lblDeter;
    }

    public javax.swing.JLabel getLblDiagP() {
        return lblDiagP;
    }

    public void setLblDiagP(javax.swing.JLabel lblDiagP) {
        this.lblDiagP = lblDiagP;
    }

    public javax.swing.JLabel getLblDiagS() {
        return lblDiagS;
    }

    public void setLblDiagS(javax.swing.JLabel lblDiagS) {
        this.lblDiagS = lblDiagS;
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IconLogo/icon.png")));
    }
    
}
