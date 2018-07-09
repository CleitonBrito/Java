package determinante.painel;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Home extends javax.swing.JFrame {
    
    private int login=0;
    
    public Home() {
        initComponents();
        setIcon();
        this.Titulo.setVisible(false);
        this.jSeparator1.setVisible(false);
        this.jSeparator2.setVisible(false);
        this.subTitulo.setVisible(false);
        this.Botao2x2.setVisible(false);
        this.Botao3x3.setVisible(false);
        this.painel.setVisible(true);
        ImageIcon iconLogo = new ImageIcon("src/IconLogo/icon.png");
        iconLogo.setImage(iconLogo.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
        this.imgLogo.setIcon(iconLogo);
    }

    private void Visibilidade(){
        this.Titulo.setVisible(true);
        this.jSeparator1.setVisible(true);
        this.jSeparator2.setVisible(true);
        this.subTitulo.setVisible(true);
        this.Botao2x2.setVisible(true);
        this.Botao3x3.setVisible(true);
        this.painel.setVisible(false);
    }
    
    void Login(){
        if(login==0){
            try{
                for(int i=0; i <2; i++){
                    Loading.setText("< Loading >");
                    Thread.sleep(180);
                    Loading.setText("<< Loading >>");
                    Thread.sleep(180);
                    Loading.setText("<<< Loading >>>");
                    Thread.sleep(180);
                    Loading.setText("<<<< Loading >>>>");
                    Thread.sleep(180);
                    Loading.setText("<<< Loading >>>");
                    Thread.sleep(180);
                    Loading.setText("<< Loading >>");
                    Thread.sleep(180);
                    Loading.setText("< Loading >");
                }
                Visibilidade();
            }
            catch (InterruptedException ex){   
               ex.printStackTrace();
            }
        }
        else{
            Visibilidade();
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        subTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Botao2x2 = new javax.swing.JRadioButton();
        Botao3x3 = new javax.swing.JRadioButton();
        painel = new javax.swing.JPanel();
        Loading = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Titulo.setText("Determinante de Matriz");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 192, 26));

        subTitulo.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        subTitulo.setText("Selecione a ordem da matriz");
        getContentPane().add(subTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 298, 18));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 298, 23));

        Botao2x2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao2x2.setText("2x2");
        Botao2x2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Botao2x2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao2x2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao2x2MouseClicked(evt);
            }
        });
        getContentPane().add(Botao2x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 50, 30));

        Botao3x3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao3x3.setText("3x3");
        Botao3x3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao3x3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(Botao3x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        painel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Loading.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Loading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Loading.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painel.add(Loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 340, 30));

        imgLogo.setMaximumSize(new java.awt.Dimension(320, 320));
        imgLogo.setMinimumSize(new java.awt.Dimension(320, 320));
        imgLogo.setPreferredSize(new java.awt.Dimension(320, 320));
        painel.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 250, 250));

        getContentPane().add(painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Botao2x2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao2x2MouseClicked
        JFrame Ordem2 = new MaTOrdem2();
        Ordem2.setVisible(true);
        Home.this.dispose();

    }//GEN-LAST:event_Botao2x2MouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Botao2x2;
    private javax.swing.JRadioButton Botao3x3;
    private javax.swing.JLabel Loading;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel painel;
    private javax.swing.JLabel subTitulo;
    // End of variables declaration//GEN-END:variables
    
    public javax.swing.JRadioButton getBotao2x2() {
        return Botao2x2;
    }

    
    public void setBotao2x2(javax.swing.JRadioButton Botao2x2) {
        this.Botao2x2 = Botao2x2;
    }

    public javax.swing.JRadioButton getBotao3x3() {
        return Botao3x3;
    }

    public void setBotao3x3(javax.swing.JRadioButton Botao3x3) {
        this.Botao3x3 = Botao3x3;
    }
    
    public void setLogin(int login) {
        this.login = login;
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/IconLogo/icon.png")));
    }
    
}
