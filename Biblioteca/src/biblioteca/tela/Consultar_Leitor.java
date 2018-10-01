package biblioteca.tela;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.bean.Leitor;
import model.dao.LeitorDAO;

public class Consultar_Leitor extends javax.swing.JFrame {
    
    public Consultar_Leitor() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Color corFrame = new Color(200, 218, 230);
        getContentPane().setBackground(corFrame);
        atualiza_tabela();
    }
    
    public void atualiza_tabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaLeitores.getModel();
        modelo.setNumRows(0);
        LeitorDAO leitorDao = new LeitorDAO();
               
        for(Leitor l : leitorDao.leitura()){
            modelo.addRow(new Object[]{
                l.getNome(),
                l.getCpf(),
                l.getEndereco(),
                l.getTelefone()
            });
        }
        busca_tabela(campoNomeBusca.getText());
    }
    
    public void busca_tabela(String busca_leitor){
        DefaultTableModel modelo = (DefaultTableModel) tabelaLeitores.getModel();
        modelo.setNumRows(0);
        LeitorDAO leitorDao = new LeitorDAO();
               
        for(Leitor l : leitorDao.buscar_nome(busca_leitor)){
            modelo.addRow(new Object[]{
                l.getNome(),
                l.getCpf(),
                l.getEndereco(),
                l.getTelefone()
            });
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoNomeBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLeitores = new javax.swing.JTable();
        Button_Buscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_leitor = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu_livro = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu_Acervo = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leitores - Biblioteca");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconLivros.png")).getImage());
        setMinimumSize(new java.awt.Dimension(760, 450));

        jPanel2.setBackground(new java.awt.Color(200, 218, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leitores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(54, 70, 83));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");

        campoNomeBusca.setBackground(new java.awt.Color(200, 218, 230));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeBusca)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tabelaLeitores.setBackground(new java.awt.Color(200, 218, 230));
        tabelaLeitores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Endereço", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaLeitores.setGridColor(new java.awt.Color(153, 153, 153));
        tabelaLeitores.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabelaLeitores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaLeitores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaLeitores);
        if (tabelaLeitores.getColumnModel().getColumnCount() > 0) {
            tabelaLeitores.getColumnModel().getColumn(0).setMinWidth(300);
            tabelaLeitores.getColumnModel().getColumn(0).setPreferredWidth(500);
            tabelaLeitores.getColumnModel().getColumn(0).setMaxWidth(700);
            tabelaLeitores.getColumnModel().getColumn(1).setMinWidth(150);
            tabelaLeitores.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelaLeitores.getColumnModel().getColumn(1).setMaxWidth(150);
            tabelaLeitores.getColumnModel().getColumn(2).setMinWidth(150);
            tabelaLeitores.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabelaLeitores.getColumnModel().getColumn(2).setMaxWidth(400);
            tabelaLeitores.getColumnModel().getColumn(3).setMinWidth(150);
            tabelaLeitores.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        Button_Buscar.setBackground(new java.awt.Color(0, 0, 0));
        Button_Buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Button_Buscar.setText("Buscar");
        Button_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Button_Buscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_Buscar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(200, 218, 230));
        jPanel3.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

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

        setSize(new java.awt.Dimension(767, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jMenu_AcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_AcervoActionPerformed
        JFrame acervo = new Consultar_Acervo();
        acervo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu_AcervoActionPerformed

    private void jMenu_sairMenuSair(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_sairMenuSair
        JFrame login = new Login();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jMenu_sairMenuSair

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Cadastrar_Leitor leitor = new Cadastrar_Leitor(this, rootPaneCheckingEnabled);
        leitor.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Cadastrar_Livro livro = new Cadastrar_Livro(this, rootPaneCheckingEnabled);
        livro.setVisible(true);
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

    private void Button_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BuscarActionPerformed
        busca_tabela(campoNomeBusca.getText());
    }//GEN-LAST:event_Button_BuscarActionPerformed

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

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JFrame reservas = new Reservas();
        reservas.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Consultar_Leitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar_Leitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar_Leitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar_Leitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_Leitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Buscar;
    private javax.swing.JTextField campoNomeBusca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenu_Acervo;
    private javax.swing.JMenu jMenu_leitor;
    private javax.swing.JMenu jMenu_livro;
    private javax.swing.JMenu jMenu_sair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable tabelaLeitores;
    // End of variables declaration//GEN-END:variables
}
