package biblioteca.tela;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Tabela_Emprestimos;
import model.dao.DevolverDAO;
import model.dao.EmprestimoDAO;
import model.dao.LeitorDAO;
import model.dao.ReservasDAO;

public class Devolver extends javax.swing.JFrame {

    public Devolver() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        atualiza_tabela();
    }
    
    public void atualiza_tabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaEmprestimos.getModel();
        modelo.setNumRows(0);
        DevolverDAO devolverDAO = new DevolverDAO();
        
        for(Tabela_Emprestimos emp: devolverDAO.leitura_devolver()){
            modelo.addRow(new Object[]{
                emp.getId_emprestimo(),
                emp.getTitulo_livro(),
                emp.getAutor_livro(),
                emp.getGenero_livro(),
                emp.getLeitor()
            });
        }
    }
    
    public void busca_tabela(String cpf){
        DefaultTableModel modelo = (DefaultTableModel) tabelaEmprestimos.getModel();
        modelo.setNumRows(0);
        DevolverDAO devolverDAO = new DevolverDAO();
        
        for(Tabela_Emprestimos emp: devolverDAO.leitura_devolver(cpf)){
            modelo.addRow(new Object[]{
                emp.getId_emprestimo(),
                emp.getTitulo_livro(),
                emp.getAutor_livro(),
                emp.getGenero_livro(),
                emp.getLeitor()
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        campoCPF = new javax.swing.JFormattedTextField();
        buttonBuscar = new javax.swing.JButton();
        buttonDevolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEmprestimos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
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
        jMenu_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Devolver - Biblioteca");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconLivros.png")).getImage());
        setMinimumSize(new java.awt.Dimension(766, 460));

        jPanel2.setBackground(new java.awt.Color(200, 218, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Devolver", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(54, 70, 83));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leitor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF:");

        campoCPF.setBackground(new java.awt.Color(200, 218, 230));
        try {
            campoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        buttonBuscar.setBackground(new java.awt.Color(0, 0, 0));
        buttonBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        buttonDevolver.setBackground(new java.awt.Color(0, 0, 0));
        buttonDevolver.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonDevolver.setForeground(new java.awt.Color(255, 255, 255));
        buttonDevolver.setText("Devolver");
        buttonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDevolverActionPerformed(evt);
            }
        });

        tabelaEmprestimos.setBackground(new java.awt.Color(200, 218, 230));
        tabelaEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título do livro", "Autor do livro", "Gênero do livro", "Leitor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonBuscar)
                        .addGap(37, 37, 37)
                        .addComponent(buttonDevolver)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBuscar)
                    .addComponent(buttonDevolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
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
            .addGap(0, 750, Short.MAX_VALUE)
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

        setSize(new java.awt.Dimension(766, 492));
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

    private void jMenu_sairMenuSair(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_sairMenuSair
        JFrame login = new Login();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jMenu_sairMenuSair

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JFrame reservas = new Reservas();
        reservas.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        ReservasDAO reservasDao = new ReservasDAO();
        
        if(campoCPF.getText().equals("   .   .   -  ")){
            JOptionPane.showMessageDialog(null, "Digite um CPF!");
            atualiza_tabela();
        }else if(reservasDao.buscarReserva(campoCPF.getText()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum emprestimo encontrado");
        }else
        busca_tabela(campoCPF.getText());
        campoCPF.setValue(null);
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDevolverActionPerformed
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        DevolverDAO devolverDAO = new DevolverDAO();
        LeitorDAO leitorDAO = new LeitorDAO();
        Date data_hoje = new Date();
        
        int id_emp = (int) tabelaEmprestimos.getValueAt(tabelaEmprestimos.getSelectedRow(), 0);
        int id_leitor = leitorDAO.buscarId(id_emp);
        int id_livro = emprestimoDAO.id_livro(id_emp);
        
        try{
            int atraso = devolverDAO.verificar_atraso(id_emp, id_leitor, data_hoje)-1;
            
            String data_formatada;
            data_formatada = new SimpleDateFormat("dd/MM/yyyy").format(devolverDAO.data_disponivel(atraso+1, data_hoje));
            
            if(atraso>0){
                JOptionPane.showMessageDialog(null, "O leitor recebeu "+atraso
                        +" dias de multa. Data prevista para emprestimos: "+data_formatada);
            }
            devolverDAO.devolver(id_emp, id_leitor, id_livro);
            atualiza_tabela();
            JOptionPane.showMessageDialog(null, "Devolvido com sucesso!");
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "Selecione um emprestimo para devolver!");
        }
    }//GEN-LAST:event_buttonDevolverActionPerformed

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
            java.util.logging.Logger.getLogger(Devolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Devolver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonDevolver;
    private javax.swing.JFormattedTextField campoCPF;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
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
    private javax.swing.JTable tabelaEmprestimos;
    // End of variables declaration//GEN-END:variables
}
