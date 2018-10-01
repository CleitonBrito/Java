
package biblioteca.tela;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.dao.BibliotecarioDAO;

public class Login extends javax.swing.JFrame {
    Sistema sistema;
    
    public Login() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        jPanel_Login.setVisible(true);
        Color corFrame = new Color(203, 219, 223);
        getContentPane().setBackground(corFrame);
    }
    
    public void EnviarNome(){
        if(sistema == null){
            sistema = new Sistema();
            sistema.boas_vindas(campoUsuario.getText());
            sistema.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel_Login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        buttonOk = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();

        jLabel4.setText("jLabel4");

        jLabel18.setText("jLabel18");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Biblioteca");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconLivros.png")).getImage());
        setMinimumSize(new java.awt.Dimension(432, 330));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel_Login.setBackground(new java.awt.Color(54, 70, 83));
        jPanel_Login.setToolTipText("");
        jPanel_Login.setName("A"); // NOI18N
        jPanel_Login.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");
        jPanel_Login.add(jLabel2);
        jLabel2.setBounds(130, 10, 90, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuário: ");
        jPanel_Login.add(jLabel3);
        jLabel3.setBounds(20, 60, 90, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Senha:");
        jPanel_Login.add(jLabel5);
        jLabel5.setBounds(30, 100, 70, 25);

        campoUsuario.setBackground(new java.awt.Color(200, 218, 230));
        jPanel_Login.add(campoUsuario);
        campoUsuario.setBounds(110, 60, 180, 30);

        campoSenha.setBackground(new java.awt.Color(200, 218, 230));
        jPanel_Login.add(campoSenha);
        campoSenha.setBounds(110, 100, 180, 30);

        buttonOk.setBackground(new java.awt.Color(255, 255, 255));
        buttonOk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonOk.setText("Ok");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });
        jPanel_Login.add(buttonOk);
        buttonOk.setBounds(140, 140, 60, 30);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 323;
        gridBagConstraints.ipady = 184;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 50, 39, 42);
        getContentPane().add(jPanel_Login, gridBagConstraints);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorderPainted(false);

        menuCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        menuCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        menuCadastrar.setText("Cadastrar");
        menuCadastrar.setContentAreaFilled(false);
        menuCadastrar.setFocusable(false);
        menuCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuCadastrar.setRequestFocusEnabled(false);
        menuCadastrar.setVerifyInputWhenFocusTarget(false);
        menuCadastrar.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuCadastrarMenuSelected(evt);
            }
        });
        jMenuBar1.add(menuCadastrar);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
         BibliotecarioDAO biblioDAO = new BibliotecarioDAO();
        if(campoUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Usuario!");
            campoUsuario.requestFocus();
        }else if(campoSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Senha!");
            campoSenha.requestFocus();
        }else if(biblioDAO.login_admin(campoUsuario.getText(), campoSenha.getText())){
            EnviarNome();
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Usuario e/ou senha incorretos!");
        }
    }//GEN-LAST:event_buttonOkActionPerformed

    private void menuCadastrarMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuCadastrarMenuSelected
        Cadastrar_Bibliotecario bibliotecario = new Cadastrar_Bibliotecario(this, rootPaneCheckingEnabled);
        bibliotecario.setVisible(true);
    }//GEN-LAST:event_menuCadastrarMenuSelected
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOk;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel_Login;
    private javax.swing.JMenu menuCadastrar;
    // End of variables declaration//GEN-END:variables
}
