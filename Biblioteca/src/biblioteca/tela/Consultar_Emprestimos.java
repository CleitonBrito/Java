package biblioteca.tela;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.bean.Tabela_Emprestimos;
import model.dao.EmprestimoDAO;

public class Consultar_Emprestimos extends javax.swing.JFrame {

    public Consultar_Emprestimos() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Color corFrame = new Color(200, 218, 230);
        getContentPane().setBackground(corFrame);
        tabela();
    }
    
    public void tabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaEmprestimos.getModel();
        modelo.setNumRows(0);
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        
        for(Tabela_Emprestimos emp: emprestimoDAO.leitura()){
            modelo.addRow(new Object[]{
                emp.getId_emprestimo(),
                emp.getTitulo_livro(),
                emp.getAutor_livro(),
                emp.getGenero_livro(),
                emp.getLeitor(),
                emp.getN_renovacao(),
                emp.getData_emprestimo(),
                emp.getSituacao()
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEmprestimos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_leitor = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu_livro = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu_Acervo = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empréstimos - Biblioteca");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconLivros.png")).getImage());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Emprestimos");

        tabelaEmprestimos.setBackground(new java.awt.Color(200, 218, 230));
        tabelaEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título do livro", "Autor do livro", "Gênero do livro", "Leitor", "Renovação", "Data", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEmprestimos.setGridColor(new java.awt.Color(153, 153, 153));
        tabelaEmprestimos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabelaEmprestimos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaEmprestimos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaEmprestimos);
        if (tabelaEmprestimos.getColumnModel().getColumnCount() > 0) {
            tabelaEmprestimos.getColumnModel().getColumn(0).setMinWidth(50);
            tabelaEmprestimos.getColumnModel().getColumn(0).setMaxWidth(50);
            tabelaEmprestimos.getColumnModel().getColumn(1).setResizable(false);
            tabelaEmprestimos.getColumnModel().getColumn(2).setMinWidth(200);
            tabelaEmprestimos.getColumnModel().getColumn(2).setMaxWidth(200);
            tabelaEmprestimos.getColumnModel().getColumn(3).setMinWidth(100);
            tabelaEmprestimos.getColumnModel().getColumn(3).setMaxWidth(100);
            tabelaEmprestimos.getColumnModel().getColumn(4).setMinWidth(250);
            tabelaEmprestimos.getColumnModel().getColumn(4).setMaxWidth(250);
            tabelaEmprestimos.getColumnModel().getColumn(5).setMinWidth(70);
            tabelaEmprestimos.getColumnModel().getColumn(5).setMaxWidth(70);
            tabelaEmprestimos.getColumnModel().getColumn(6).setMinWidth(100);
            tabelaEmprestimos.getColumnModel().getColumn(6).setMaxWidth(100);
            tabelaEmprestimos.getColumnModel().getColumn(7).setMinWidth(100);
            tabelaEmprestimos.getColumnModel().getColumn(7).setMaxWidth(100);
        }

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

        jMenuItem7.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem7.setText("Reservas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu_livro.add(jMenuItem7);

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
                jMenu_sairMenuSair(evt);
            }
        });
        jMenuBar1.add(jMenu_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jMenu_AcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_AcervoActionPerformed
        JFrame acervo = new Consultar_Acervo();
        acervo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu_AcervoActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JFrame renovar = new Renovar();
        renovar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        JFrame devolver = new Devolver();
        devolver.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenu_sairMenuSair(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_sairMenuSair
        JFrame login = new Login();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jMenu_sairMenuSair

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JFrame reservas = new Reservas();
        reservas.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(Consultar_Emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar_Emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar_Emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar_Emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_Emprestimos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenu_Acervo;
    private javax.swing.JMenu jMenu_leitor;
    private javax.swing.JMenu jMenu_livro;
    private javax.swing.JMenu jMenu_sair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable tabelaEmprestimos;
    // End of variables declaration//GEN-END:variables
}
