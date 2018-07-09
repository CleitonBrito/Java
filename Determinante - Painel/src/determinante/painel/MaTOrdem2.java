package determinante.painel;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class MaTOrdem2 extends javax.swing.JFrame {
    
    private String Valor00;
    private String Valor01;
    private String Valor10;
    private String Valor11;
    
    
    Ordem2Mostrar ordem2Mostrar = new Ordem2Mostrar();
    
    public MaTOrdem2() {
        initComponents();
        setIcon();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Num1 = new javax.swing.JTextField();
        Num2 = new javax.swing.JTextField();
        Pos00 = new javax.swing.JTextField();
        Pos01 = new javax.swing.JTextField();
        Pos10 = new javax.swing.JTextField();
        Pos11 = new javax.swing.JTextField();
        BotaoOk = new javax.swing.JButton();
        igual1 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        y = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        igual2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblSubTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Num1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Num1KeyPressed(evt);
            }
        });

        Num2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Num2KeyPressed(evt);
            }
        });

        Pos00.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Pos00KeyPressed(evt);
            }
        });

        Pos01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos01ActionPerformed(evt);
            }
        });
        Pos01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Pos01KeyPressed(evt);
            }
        });

        Pos10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Pos10KeyPressed(evt);
            }
        });

        Pos11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Pos11KeyPressed(evt);
            }
        });

        BotaoOk.setText("Ok");
        BotaoOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoOk.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BotaoOk.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BotaoOk.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotaoOk.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoOkActionPerformed(evt);
            }
        });
        BotaoOk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoOkKeyPressed(evt);
            }
        });

        igual1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        igual1.setText("=");

        x.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x.setText("X");
        x.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        x.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        y.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        y.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        y.setText("Y");
        y.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Matriz Ordem 2");

        igual2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        igual2.setText("=");

        lblSubTitulo.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        lblSubTitulo.setText("Preenchendo Matriz...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(jLabel1))
                        .addComponent(lblSubTitulo)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addComponent(igual1)
                            .addGap(62, 62, 62)
                            .addComponent(igual2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(264, 264, 264)
                            .addComponent(BotaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Pos00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25)
                                    .addComponent(Pos01, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Pos10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25)
                                    .addComponent(Pos11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(y, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addComponent(x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(66, 66, 66)
                                    .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(62, 62, 62)
                                    .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(0, 43, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(39, 39, 39)
                    .addComponent(lblSubTitulo)
                    .addGap(6, 6, 6)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(x)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Pos00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Pos01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(9, 9, 9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(igual1)
                        .addComponent(igual2))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(y)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Pos10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Pos11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(30, 30, 30)
                    .addComponent(BotaoOk)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Num2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Num2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            BotaoOk.requestFocus();
        }
    }//GEN-LAST:event_Num2KeyPressed

    private void Pos00KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pos00KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            getPos01().requestFocus();
        }
    }//GEN-LAST:event_Pos00KeyPressed

    private void Pos10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pos10KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            getPos11().requestFocus();
        }
    }//GEN-LAST:event_Pos10KeyPressed

    private void Pos01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pos01ActionPerformed

    private void Pos01KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pos01KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            getPos10().requestFocus();
        }
    }//GEN-LAST:event_Pos01KeyPressed

    private void Pos11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pos11KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            getNum1().requestFocus();
        }
    }//GEN-LAST:event_Pos11KeyPressed

    private void BotaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoOkActionPerformed
        Ordem2Mostrar Mostrar = new Ordem2Mostrar();
        if(!Pos00.getText().equals(""))
            setValor00(Pos00.getText());
        else
            setValor00("null");
        if(!Pos01.getText().equals(""))
            setValor01(Pos01.getText());
        else
            setValor01("null");
        if(!Pos10.getText().equals(""))
            setValor10(Pos10.getText());
        else
            setValor10("null");
        if(!Pos11.getText().equals(""))
            setValor11(Pos11.getText());
        else
            setValor11("null");

        Mostrar.Matriz(this);
        Mostrar.setVisible(true);

        MaTOrdem2.this.dispose();
        

    }//GEN-LAST:event_BotaoOkActionPerformed

    private void BotaoOkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoOkKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Ordem2Mostrar Mostrar = new Ordem2Mostrar();
            setValor00(Pos00.getText());
            setValor01(Pos01.getText());
            setValor10(Pos10.getText());
            setValor11(Pos11.getText());
            Mostrar.Matriz(this);
            Mostrar.setVisible(true);

            MaTOrdem2.this.dispose();

        }
    }//GEN-LAST:event_BotaoOkKeyPressed

    private void Num1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Num1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            getNum2().requestFocus();
        }
    }//GEN-LAST:event_Num1KeyPressed

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
            java.util.logging.Logger.getLogger(MaTOrdem2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaTOrdem2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaTOrdem2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaTOrdem2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaTOrdem2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoOk;
    private javax.swing.JTextField Num1;
    private javax.swing.JTextField Num2;
    private javax.swing.JTextField Pos00;
    private javax.swing.JTextField Pos01;
    private javax.swing.JTextField Pos10;
    private javax.swing.JTextField Pos11;
    private javax.swing.JLabel igual1;
    private javax.swing.JLabel igual2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel x;
    private javax.swing.JLabel y;
    // End of variables declaration//GEN-END:variables
    
    public javax.swing.JTextField getPos00() {
        return Pos00;
    }
    public void setPos00(javax.swing.JTextField Pos00) {
        this.Pos00 = Pos00;
    }
    public javax.swing.JTextField getPos01() {
        return Pos01;
    }
    public void setPos01(javax.swing.JTextField Pos01) {
        this.Pos01 = Pos01;
    }
    public javax.swing.JTextField getPos10() {
        return Pos10;
    }
    public void setPos10(javax.swing.JTextField Pos10) {
        this.Pos10 = Pos10;
    }
    public javax.swing.JTextField getPos11() {
        return Pos11;
    }
    public void setPos11(javax.swing.JTextField Pos11) {
        this.Pos11 = Pos11;
    }
    public javax.swing.JTextField getNum1() {
        return Num1;
    }
    public void setNum1(javax.swing.JTextField Num1) {
        this.Num1 = Num1;
    }
    public javax.swing.JTextField getNum2() {
        return Num2;
    }
    public void setNum2(javax.swing.JTextField Num2) {
        this.Num2 = Num2;
    }
    public String getValor00() {
        return Valor00;
    }

    public void setValor00(String Valor00) {
        this.Valor00 = Valor00;
    }

    public String getValor01() {
        return Valor01;
    }

    public void setValor01(String Valor01) {
        this.Valor01 = Valor01;
    }

    public String getValor10() {
        return Valor10;
    }

    public void setValor10(String Valor10) {
        this.Valor10 = Valor10;
    }

    public String getValor11() {
        return Valor11;
    }

    public void setValor11(String Valor11) {
        this.Valor11 = Valor11;
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IconLogo/icon.png")));
    }
}
