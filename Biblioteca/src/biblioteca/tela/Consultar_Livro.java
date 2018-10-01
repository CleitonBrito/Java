package biblioteca.tela;

import java.awt.Color;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Livro;
import model.dao.DevolverDAO;
import model.dao.EmprestimoDAO;
import model.dao.LeitorDAO;
import model.dao.LivroDAO;

public class Consultar_Livro extends javax.swing.JFrame {
    
    public static int linha=0;
    
    public Consultar_Livro() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Color corFrame = new Color(200, 218, 230);
        getContentPane().setBackground(corFrame);
    }
    
    public void atualizaTabela(){
        busca_tabela(campoTitulo.getText(), campoAutor.getText());
    }
    
    public void busca_tabela(String titulo, String autor){
        DefaultTableModel modelo = (DefaultTableModel) tabelaLivros.getModel();
        modelo.setNumRows(0);
        LivroDAO livroDao = new LivroDAO();
               
        for(Livro l : livroDao.buscar(titulo, autor)){
            modelo.addRow(new Object[]{
                l.getId(),
                l.getTitulo(),
                l.getAutor(),
                l.getISBN(),
                l.getEdicao(),
                l.getGenero(),
                l.getSituacao()
            });
        }
    }
    
    public int id_Livro_Linha(){
        this.linha = (int) tabelaLivros.getValueAt(tabelaLivros.getSelectedRow(), 0);
        return this.linha;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoAutor = new javax.swing.JTextField();
        ButtonBuscar = new javax.swing.JButton();
        ButtonEmprestar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLivros = new javax.swing.JTable();
        ButtonReservar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_leitor = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu_livro = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu_Acervo = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Livros - Biblioteca");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconLivros.png")).getImage());

        jPanel2.setBackground(new java.awt.Color(200, 218, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Livros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(54, 70, 83));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Título:");

        campoTitulo.setBackground(new java.awt.Color(200, 218, 230));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Autor:");

        campoAutor.setBackground(new java.awt.Color(200, 218, 230));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoTitulo)
                    .addComponent(campoAutor)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        ButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonBuscar.setText("Buscar");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        ButtonEmprestar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonEmprestar.setText("Emprestar");
        ButtonEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEmprestarActionPerformed(evt);
            }
        });

        tabelaLivros.setBackground(new java.awt.Color(200, 218, 230));
        tabelaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Autor", "ISBN", "Edição", "Gênero", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaLivros.setGridColor(new java.awt.Color(153, 153, 153));
        tabelaLivros.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabelaLivros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaLivros.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaLivros);
        if (tabelaLivros.getColumnModel().getColumnCount() > 0) {
            tabelaLivros.getColumnModel().getColumn(0).setMinWidth(50);
            tabelaLivros.getColumnModel().getColumn(0).setMaxWidth(50);
            tabelaLivros.getColumnModel().getColumn(1).setMinWidth(200);
            tabelaLivros.getColumnModel().getColumn(2).setMinWidth(250);
            tabelaLivros.getColumnModel().getColumn(2).setMaxWidth(250);
            tabelaLivros.getColumnModel().getColumn(3).setMinWidth(200);
            tabelaLivros.getColumnModel().getColumn(3).setMaxWidth(200);
            tabelaLivros.getColumnModel().getColumn(4).setMinWidth(100);
            tabelaLivros.getColumnModel().getColumn(4).setMaxWidth(100);
            tabelaLivros.getColumnModel().getColumn(5).setMinWidth(150);
            tabelaLivros.getColumnModel().getColumn(5).setMaxWidth(150);
            tabelaLivros.getColumnModel().getColumn(6).setMinWidth(100);
            tabelaLivros.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        ButtonReservar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonReservar.setText("Reservar");
        ButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonBuscar)
                .addGap(34, 34, 34)
                .addComponent(ButtonEmprestar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonReservar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBuscar)
                    .addComponent(ButtonEmprestar)
                    .addComponent(ButtonReservar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(200, 218, 230));
        jPanel3.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

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
                jMenu_sairMenuSair(evt);
            }
        });
        jMenuBar1.add(jMenu_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jMenu_sairMenuSair(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_sairMenuSair
        JFrame login = new Login();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jMenu_sairMenuSair

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Cadastrar_Leitor leitor = new Cadastrar_Leitor(this, rootPaneCheckingEnabled);
        leitor.setVisible(true);
        //dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFrame consulta_Leitor = new Consultar_Leitor();
        consulta_Leitor.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ButtonEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEmprestarActionPerformed
        LeitorDAO leitorDAO = new LeitorDAO();
        LivroDAO livroDAO = new LivroDAO();
        DevolverDAO devolverDAO = new DevolverDAO();
        Date data = new Date();
        
        try{
            int linha = id_Livro_Linha();
            if(livroDAO.verificarSaldo_livro(linha) > 1 && livroDAO.verificar_situacao(linha).equals("Disponível")){
                Emprestar emprestar = new Emprestar(this, rootPaneCheckingEnabled);
                emprestar.setVisible(true);
            }else if(livroDAO.verificar_situacao(linha).equals("Indisponível")){
                JOptionPane.showMessageDialog(null, "Exemplar indisponível. Faça uma reserva!");
            }else if(livroDAO.verificar_situacao(linha).equals("Reservado")){
                JOptionPane.showMessageDialog(null, "Exemplar reservado. Aguarde!");
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "Selecione um livro para emprestar!");
        }
    }//GEN-LAST:event_ButtonEmprestarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Cadastrar_Livro livro = new Cadastrar_Livro(this, rootPaneCheckingEnabled);
        livro.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu_AcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_AcervoActionPerformed
        JFrame acervo = new Consultar_Acervo();
        acervo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu_AcervoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JFrame consulta_emprestimos = new Consultar_Emprestimos();
        consulta_emprestimos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        if(campoTitulo.getText().isEmpty() && campoAutor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos vazios. Preencha pelo menos um campo!");
            campoTitulo.requestFocus();
        }else
            busca_tabela(campoTitulo.getText(), campoAutor.getText());
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReservarActionPerformed
        LivroDAO livroDAO = new LivroDAO();
        
        try{
            int linha = id_Livro_Linha();
            if(livroDAO.verificar_situacao(linha).equals("Indisponível")){
                Reservar reservar = new Reservar(this, rootPaneCheckingEnabled);
                reservar.setVisible(true);
            }else if(livroDAO.verificar_situacao(linha).equals("Disponível")){
                JOptionPane.showMessageDialog(null, "Exemplar disponível. Faça um emprestimo!");
            }else if(livroDAO.verificar_situacao(linha).equals("Reservado")){
                JOptionPane.showMessageDialog(null, "Exemplar reservado. Aguarde!");
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "Selecione um livro para reservar!");
        }
    }//GEN-LAST:event_ButtonReservarActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JFrame reservas = new Reservas();
        reservas.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(Consultar_Livro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar_Livro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar_Livro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar_Livro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_Livro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonEmprestar;
    private javax.swing.JButton ButtonReservar;
    private javax.swing.JTextField campoAutor;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
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
    private javax.swing.JTable tabelaLivros;
    // End of variables declaration//GEN-END:variables
}
