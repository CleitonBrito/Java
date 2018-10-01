package biblioteca.tela;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import model.bean.Livro;
import model.dao.LivroDAO;

public class Cadastrar_Livro extends javax.swing.JDialog {
    public JFrame anterior =  null;
    
    public Cadastrar_Livro(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        this.anterior=parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        buttonOk = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoGenero = new javax.swing.JTextField();
        campoAutor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoISBN = new javax.swing.JFormattedTextField();
        campoEdicao = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel_Login.setBackground(new java.awt.Color(54, 70, 83));
        jPanel_Login.setToolTipText("");
        jPanel_Login.setName("A"); // NOI18N
        jPanel_Login.setPreferredSize(new java.awt.Dimension(333, 248));
        jPanel_Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastrar Livro");
        jPanel_Login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 200, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Título:");
        jPanel_Login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ISBN:");
        jPanel_Login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        campoTitulo.setBackground(new java.awt.Color(200, 218, 230));
        jPanel_Login.add(campoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 180, -1));

        buttonOk.setBackground(new java.awt.Color(255, 255, 255));
        buttonOk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonOk.setText("Ok");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });
        jPanel_Login.add(buttonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Autor:");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gênero:");
        jPanel_Login.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        campoGenero.setBackground(new java.awt.Color(200, 218, 230));
        jPanel_Login.add(campoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 180, -1));

        campoAutor.setBackground(new java.awt.Color(200, 218, 230));
        jPanel_Login.add(campoAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 180, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edição:");
        jPanel_Login.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        campoISBN.setBackground(new java.awt.Color(200, 218, 230));
        try {
            campoISBN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-##-###-####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel_Login.add(campoISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 180, -1));

        campoEdicao.setBackground(new java.awt.Color(200, 218, 230));
        campoEdicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
        jPanel_Login.add(campoEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 180, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantidade:");
        jPanel_Login.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        campoQuantidade.setBackground(new java.awt.Color(200, 218, 230));
        campoQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
        jPanel_Login.add(campoQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(416, 379));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
        Livro livro = new Livro();
        
        if(campoTitulo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Título!");
            campoTitulo.requestFocus();
        }else if(campoAutor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Autor!");
            campoAutor.requestFocus();
        }else if(campoISBN.getText().equals("   -  -   -    - ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo ISBN!");
            campoISBN.requestFocus();
        }else if(campoGenero.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Gênero!");
            campoGenero.requestFocus();
        }else{
            if(campoEdicao.getText().isEmpty()){
                livro.setEdicao(1);
                campoEdicao.setText("1");
            }
            if(campoQuantidade.getText().isEmpty()){
                livro.setQuantidade(1);
                campoQuantidade.setText("1");
            }
            LivroDAO livroDao = new LivroDAO();

            livro.setTitulo(campoTitulo.getText());
            livro.setAutor(campoAutor.getText());
            livro.setISBN(campoISBN.getText());
            livro.setGenero(campoGenero.getText());
            livro.setEdicao(Integer.parseInt(campoEdicao.getText()));
            livro.setQuantidade(Integer.parseInt(campoQuantidade.getText()));

            livroDao.criar(livro);

            Consultar_Acervo tela_acervo = new Consultar_Acervo();
            tela_acervo.tabela();
            campoTitulo.setText("");
            campoAutor.setText("");
            campoISBN.setValue(null);
            campoGenero.setText("");
            campoEdicao.setValue(null);
            campoQuantidade.setText("");
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
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
            java.util.logging.Logger.getLogger(Cadastrar_Livro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Livro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Livro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Livro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cadastrar_Livro dialog = new Cadastrar_Livro(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField campoAutor;
    private javax.swing.JFormattedTextField campoEdicao;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JFormattedTextField campoISBN;
    private javax.swing.JFormattedTextField campoQuantidade;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel_Login;
    // End of variables declaration//GEN-END:variables
}
