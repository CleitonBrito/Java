package biblioteca.tela;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Sistema extends javax.swing.JFrame {
    
    public Sistema() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Color corFrame = new Color(203, 219, 223);
        getContentPane().setBackground(corFrame);
        redimensionarImg();
    }
    
    public void boas_vindas(String nome){
        txt_boasVindas.setText("Olá, "+nome+"!");
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_boasVindas = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_leitor = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu_livro = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu_Acervo = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu_sair = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Início - Biblioteca");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconLivros.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_boasVindas.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txt_boasVindas.setText("Hi, Fulano!");
        getContentPane().add(txt_boasVindas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        img.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cleiton Brito\\Desktop\\livros.png")); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1370, 770));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu_leitor.setBackground(new java.awt.Color(0, 0, 0));
        jMenu_leitor.setForeground(new java.awt.Color(255, 255, 255));
        jMenu_leitor.setText("Leitor");
        jMenu_leitor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_leitor.setHideActionText(true);

        jMenuItem1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Cadastrar Leitor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu_leitor.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setText("Consultar Leitor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu_leitor.add(jMenuItem2);

        jMenuBar1.add(jMenu_leitor);

        jMenu_livro.setForeground(new java.awt.Color(255, 255, 255));
        jMenu_livro.setText("Livro");
        jMenu_livro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu_livro.add(jSeparator2);

        jMenuItem3.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setText("Cadastrar Livro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu_livro.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setText("Consultar Livro");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu_livro.add(jMenuItem4);

        jMenu_Acervo.setBackground(new java.awt.Color(0, 0, 0));
        jMenu_Acervo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_Acervo.setForeground(new java.awt.Color(255, 255, 255));
        jMenu_Acervo.setText("Acessar o Acervo");
        jMenu_Acervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_AcervoActionPerformed(evt);
            }
        });
        jMenu_livro.add(jMenu_Acervo);

        jMenuItem5.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setText("Empréstimos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu_livro.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setText("Reservas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu_livro.add(jMenuItem6);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu_livro.add(jSeparator1);

        jMenuItem9.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem9.setText("Renovar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu_livro.add(jMenuItem9);

        jMenuItem8.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setText("Devolver");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu_livro.add(jMenuItem8);

        jMenuBar1.add(jMenu_livro);

        jMenu_sair.setBackground(new java.awt.Color(255, 255, 255));
        jMenu_sair.setForeground(new java.awt.Color(255, 255, 255));
        jMenu_sair.setText("Sair");
        jMenu_sair.setEnabled(false);
        jMenu_sair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSair(evt);
            }
        });
        jMenuBar1.add(jMenu_sair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1382, 827));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void redimensionarImg(){
        ImageIcon imagem = new ImageIcon(getClass().getResource("/imagens/livros.png"));
        Image imag = imagem.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        img.setIcon(new ImageIcon(imag));
    }
    
    private void jMenu_AcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_AcervoActionPerformed
        JFrame acervo = new Consultar_Acervo();
        acervo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu_AcervoActionPerformed

    private void MenuSair(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSair
        JFrame login = new Login();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_MenuSair

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Cadastrar_Leitor leitor = new Cadastrar_Leitor(this, rootPaneCheckingEnabled);
        leitor.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       JFrame consulta_leitor = new Consultar_Leitor();
       JFrame sistema = new Sistema();
       consulta_leitor.setVisible(true);
       dispose();
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Cadastrar_Livro livros = new Cadastrar_Livro(this, rootPaneCheckingEnabled);
        livros.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JFrame consulta_livro = new Consultar_Livro();
        consulta_livro.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JFrame consulta_emprestimos = new Consultar_Emprestimos();
        consulta_emprestimos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       JFrame devolver = new Devolver();
       devolver.setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JFrame renovar = new Renovar();
        renovar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JFrame reservas = new Reservas();
        reservas.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenu_Acervo;
    private javax.swing.JMenu jMenu_leitor;
    private javax.swing.JMenu jMenu_livro;
    private javax.swing.JMenu jMenu_sair;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel txt_boasVindas;
    // End of variables declaration//GEN-END:variables
    
}
