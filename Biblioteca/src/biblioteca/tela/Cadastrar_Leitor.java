package biblioteca.tela;

import model.bean.Leitor;
import model.dao.LeitorDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cadastrar_Leitor extends javax.swing.JDialog {
    public JFrame anterior = null;

    public Cadastrar_Leitor(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.anterior = parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonOk = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JFormattedTextField();
        campoSenha = new javax.swing.JPasswordField();
        campoCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel_Login.setBackground(new java.awt.Color(54, 70, 83));
        jPanel_Login.setToolTipText("");
        jPanel_Login.setName("A"); // NOI18N
        jPanel_Login.setPreferredSize(new java.awt.Dimension(333, 248));
        jPanel_Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastrar Leitor");
        jPanel_Login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        jPanel_Login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Senha:");
        jPanel_Login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        buttonOk.setBackground(new java.awt.Color(255, 255, 255));
        buttonOk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonOk.setText("Ok");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });
        jPanel_Login.add(buttonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF:");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 50, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Endereço:");
        jPanel_Login.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        campoEndereco.setBackground(new java.awt.Color(200, 218, 230));
        jPanel_Login.add(campoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 180, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefone:");
        jPanel_Login.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        campoNome.setBackground(new java.awt.Color(200, 218, 230));
        jPanel_Login.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 180, -1));

        campoTelefone.setBackground(new java.awt.Color(200, 218, 230));
        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel_Login.add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 180, -1));

        campoSenha.setBackground(new java.awt.Color(200, 218, 230));
        jPanel_Login.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 180, -1));

        campoCPF.setBackground(new java.awt.Color(200, 218, 230));
        try {
            campoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel_Login.add(campoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
        
        if(campoNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome!");
            campoNome.requestFocus();
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
            campoSenha.requestFocus();
        }else if(campoEndereco.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Endereço!");
            campoEndereco.requestFocus();
        }else if(campoTelefone.getText().equals("(  )     -    ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Telefone!");
            campoTelefone.requestFocus();
        }else{
            Leitor leitor = new Leitor();
            LeitorDAO leitorDao = new LeitorDAO();
            
            leitor.setNome(campoNome.getText());
            leitor.setCpf(campoCPF.getText());
            leitor.setSenha(campoSenha.getText());
            leitor.setEndereco(campoEndereco.getText());
            leitor.setTelefone(campoTelefone.getText());
            leitorDao.criar(leitor);
            
            try{
                Consultar_Leitor tela_leitor =  (Consultar_Leitor) anterior;
                tela_leitor.atualiza_tabela();
            }catch(ClassCastException ex){
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            }finally{
                campoNome.setText("");
                campoCPF.setText(null);
                campoCPF.setText(" ");
                campoSenha.setText("");
                campoEndereco.setText("");
                campoTelefone.setText("");
            }
            
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
            java.util.logging.Logger.getLogger(Cadastrar_Leitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Leitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Leitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Leitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cadastrar_Leitor dialog = new Cadastrar_Leitor(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel_Login;
    // End of variables declaration//GEN-END:variables
}
