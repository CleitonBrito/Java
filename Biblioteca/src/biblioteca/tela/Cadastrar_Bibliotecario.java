package biblioteca.tela;

import javax.swing.JOptionPane;
import model.bean.Bibliotecario;
import model.dao.BibliotecarioDAO;

public class Cadastrar_Bibliotecario extends javax.swing.JDialog {
    
    public Cadastrar_Bibliotecario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        buttonOk = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        campoCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel_Login.setBackground(new java.awt.Color(54, 70, 83));
        jPanel_Login.setToolTipText("");
        jPanel_Login.setName("A"); // NOI18N
        jPanel_Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastrar Bibliotecário");
        jPanel_Login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 280, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuário: ");
        jPanel_Login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Senha:");
        jPanel_Login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        campoUsuario.setBackground(new java.awt.Color(200, 218, 230));
        jPanel_Login.add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 180, -1));

        campoSenha.setBackground(new java.awt.Color(200, 218, 230));
        jPanel_Login.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 180, -1));

        buttonOk.setBackground(new java.awt.Color(255, 255, 255));
        buttonOk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonOk.setText("Ok");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });
        jPanel_Login.add(buttonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF:");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 50, -1));

        campoCPF.setBackground(new java.awt.Color(200, 218, 230));
        try {
            campoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel_Login.add(campoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
        if(campoUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Usuario!");
            campoUsuario.requestFocus();
        }else if(campoUsuario.getText().length() > 20 || campoUsuario.getText().length() < 3 ){
            JOptionPane.showMessageDialog(null, "Usuário de 3 até 20 caractere!");
            campoUsuario.requestFocus();
        }else if(campoCPF.getText().equals("   .   .   -  ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo CPF!");
            campoCPF.requestFocus();
        }else if(campoSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Senha!");
            campoSenha.requestFocus();
        }else if(campoSenha.getText().length() > 8 || campoSenha.getText().length() < 3){
            JOptionPane.showMessageDialog(null, "Informe uma senha de 3 até 8 dígitos!");
            campoSenha.setText(null);
            campoSenha.setText("");
        }else{
            Bibliotecario biblio = new Bibliotecario();
            BibliotecarioDAO biblioDAO = new BibliotecarioDAO();
            
            biblio.setUsuario(campoUsuario.getText());
            biblio.setCPF(campoCPF.getText());
            biblio.setSenha(campoSenha.getText());
            biblioDAO.criar(biblio);
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            
            campoUsuario.setText("");
            campoCPF.setText("");
            campoSenha.setText("");
        }
    }//GEN-LAST:event_buttonOkActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar_Bibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Bibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Bibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Bibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cadastrar_Bibliotecario dialog = new Cadastrar_Bibliotecario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOk;
    private javax.swing.JFormattedTextField campoCPF;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel_Login;
    // End of variables declaration//GEN-END:variables
}
