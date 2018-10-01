package biblioteca.tela;

import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.bean.Emprestimo;
import model.dao.DevolverDAO;
import model.dao.EmprestimoDAO;
import model.dao.LeitorDAO;
import model.dao.LivroDAO;
import model.dao.ReservasDAO;

public class Emprestar extends javax.swing.JDialog {
    JFrame anterior = null;
    
    public Emprestar(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.anterior = parent;
    }
    
    public void habilitar_cpf(boolean ativo){
        campoCPF.enable(ativo);
        campoCPF.setOpaque(ativo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(54, 70, 83));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Emprestar");

        jButtonOk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonOk.setText("Ok");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF:");

        campoCPF.setBackground(new java.awt.Color(200, 218, 230));
        try {
            campoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Senha:");

        campoSenha.setBackground(new java.awt.Color(200, 218, 230));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCPF)
                            .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButtonOk)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButtonOk)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        DevolverDAO devolverDAO = new DevolverDAO();
        Emprestimo emprestimo = new Emprestimo();
        LeitorDAO leitorDAO = new LeitorDAO();
        LivroDAO livroDAO = new LivroDAO();
        Date data = new Date();
        
        try{
            Consultar_Livro livro = (Consultar_Livro) anterior;
            int id_leitor = leitorDAO.buscarLeitor(campoCPF.getText(), campoSenha.getText());
            
            System.out.println("MULTA: "+devolverDAO.verificar_atraso(id_leitor, data));
            
            if(id_leitor==0){
                JOptionPane.showMessageDialog(null, "CPF e/ou Senha incorreto(s)");
            }else if(devolverDAO.verificar_atraso(id_leitor, data)<0){
                JOptionPane.showMessageDialog(null, "Leitor com multa. Impossível emprestar!");
            }else if(emprestimoDAO.qtd_emprestimo(id_leitor)==false){
                JOptionPane.showMessageDialog(null, "O leitor já possui 3 emprestimos em aberto");
            }else if(emprestimoDAO.emprestimo_repetido(livro.linha, id_leitor)){
                JOptionPane.showMessageDialog(null, "Impossível emprestar. O leitor já possui este exemplar!");
            }else{
                emprestimoDAO.emprestar(livro.linha, id_leitor);
                livroDAO.diminuir_acervo(livro.linha);
                campoCPF.setText("");
                campoSenha.setText("");

                if(livroDAO.verificarSaldo_livro(livro.linha) == 1){
                    livro.atualizaTabela();
                    dispose();
                }
                JOptionPane.showMessageDialog(null, "Emprestado!");
            }
        }catch(ArrayIndexOutOfBoundsException | ClassCastException ex){
            Reservas reservas = (Reservas) anterior;
            ReservasDAO reservasDAO = new ReservasDAO();
            
            int id_reserva = reservas.id_Livro_Reserva();
            int id_livro = reservasDAO.buscar_livro_reserva(id_reserva);
            int id_leitor = reservasDAO.buscar_leitor_reserva(id_reserva);
            String senha = leitorDAO.senha(id_leitor);
            
            if(!senha.equals(campoSenha.getText())){
                JOptionPane.showMessageDialog(null, "Senha incorreta!");
                campoSenha.setText("");
                campoSenha.requestFocus();
            }
            else if(emprestimoDAO.qtd_emprestimo(id_leitor)==false){
                JOptionPane.showMessageDialog(null, "O leitor já possui 3 emprestimos em aberto");
            }else if(emprestimoDAO.emprestimo_repetido(id_livro, id_leitor)){
                JOptionPane.showMessageDialog(null, "Impossível emprestar. O leitor já possui este exemplar!");
            }else{
                emprestimoDAO.emprestar(id_livro, id_leitor);
                livroDAO.diminuir_acervo(id_livro);
                reservasDAO.fechar_reserva(id_reserva);
                reservas.atualiza_tabela();
                campoCPF.setValue(null);
                campoSenha.setText("");
                dispose();
                JOptionPane.showMessageDialog(null, "Emprestado!");
            }
        }
        
    }//GEN-LAST:event_jButtonOkActionPerformed
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
            java.util.logging.Logger.getLogger(Emprestar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emprestar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emprestar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emprestar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Emprestar dialog = new Emprestar(new javax.swing.JFrame(), true);
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
    private javax.swing.JFormattedTextField campoCPF;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
