/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import MODEL.LancarEntradaModel;
import DATA.LancarEntradaData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Roberto Junior Akira
 */
public class JIFLancarEntrada extends javax.swing.JInternalFrame {
    private LancarEntradaModel obj;
    private LancarEntradaData DAO;
    private ArrayList<LancarEntradaData> listaEntrada;
    /**
     * Creates new form JIFLancarEntrada1
     */
    public JIFLancarEntrada() {
        initComponents();
        obj = new LancarEntradaModel();
        listaEntrada = new ArrayList<>();
        try {
            DAO = new LancarEntradaData();
        } catch (Exception ex) {
            Logger.getLogger(JIFLancarEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jlCodigo = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jlDescricao = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();
        jlUnidadeMedida = new javax.swing.JLabel();
        jtfUnidadeMedida = new javax.swing.JTextField();
        jlQuantidade = new javax.swing.JLabel();
        jtfQuantidade = new javax.swing.JTextField();
        jlPrecoUnitCompra = new javax.swing.JLabel();
        jtfPrecoUnitCompra = new javax.swing.JTextField();
        jlPrecoUnitVenda = new javax.swing.JLabel();
        jtfPrecoUnitVenda = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProdutos = new javax.swing.JTable();
        jlData = new javax.swing.JLabel();
        jtfData = new javax.swing.JTextField();
        jtfPesquisar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jlCodigo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlCodigo.setText("C??digo");

        jtfCodigo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfCodigo.setEnabled(false);

        jlDescricao.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlDescricao.setText("Descri????o");

        jtfDescricao.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfDescricao.setEnabled(false);

        jlUnidadeMedida.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlUnidadeMedida.setText("UN de medida");

        jtfUnidadeMedida.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfUnidadeMedida.setEnabled(false);

        jlQuantidade.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlQuantidade.setText("Quantidade");

        jtfQuantidade.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfQuantidade.setEnabled(false);

        jlPrecoUnitCompra.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlPrecoUnitCompra.setText("Pre??o unit??rio da Compra");

        jtfPrecoUnitCompra.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfPrecoUnitCompra.setEnabled(false);

        jlPrecoUnitVenda.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlPrecoUnitVenda.setText("Pre??o unit??rio da Venda");

        jtfPrecoUnitVenda.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfPrecoUnitVenda.setEnabled(false);

        jbNovo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/novo.png"))); // NOI18N
        jbNovo.setText("  Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbEditar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/editar.png"))); // NOI18N
        jbEditar.setText("  Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/pesquisar.png"))); // NOI18N
        jbPesquisar.setText("  Pesquisar");
        jbPesquisar.setToolTipText("");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbSalvar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/salvar.png"))); // NOI18N
        jbSalvar.setText("  Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbExcluir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/excluir.png"))); // NOI18N
        jbExcluir.setText("  Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jtbProdutos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DATA", "DESCRI????O", "QTD", "VALOR COMPRA", "VALOR VENDA", "FORNECEDOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbProdutos);

        jlData.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlData.setText("Data");

        jtfData.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfData.setEnabled(false);

        jtfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jlDescricao)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfDescricao))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlUnidadeMedida)
                                    .addComponent(jtfUnidadeMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlQuantidade)
                                    .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlPrecoUnitCompra)
                                    .addComponent(jtfPrecoUnitCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jlPrecoUnitVenda)
                                        .addGap(44, 44, 44))
                                    .addComponent(jtfPrecoUnitVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jbNovo)
                                .addGap(41, 41, 41)
                                .addComponent(jbEditar)
                                .addGap(35, 35, 35)
                                .addComponent(jbSalvar)
                                .addGap(41, 41, 41)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbExcluir)
                            .addComponent(jbPesquisar))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescricao)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jlData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jlCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jlPrecoUnitVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPrecoUnitVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jlQuantidade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jlUnidadeMedida)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jlPrecoUnitCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPrecoUnitCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPesquisar)
                    .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbEditar)
                    .addComponent(jbSalvar)
                    .addComponent(jbExcluir))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(15, 15, 15)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
        jtfData.setEnabled(true);
        jtfDescricao.setEnabled(true);
        jtfUnidadeMedida.setEnabled(true);
        jtfQuantidade.setEnabled(true);
        jtfPrecoUnitCompra.setEnabled(true);
        jtfPrecoUnitVenda.setEnabled(true);
        jbNovo.setEnabled(true);
        jbEditar.setEnabled(false);
        jbPesquisar.setEnabled(false);
        jtfPesquisar.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbExcluir.setEnabled(false);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        jtfData.setEnabled(true);
        jtfDescricao.setEnabled(true);
        jtfUnidadeMedida.setEnabled(true);
        jtfQuantidade.setEnabled(true);
        jtfPrecoUnitCompra.setEnabled(true);
        jtfPrecoUnitVenda.setEnabled(true);
        jbNovo.setEnabled(true);
        jbEditar.setEnabled(false);
        jbPesquisar.setEnabled(false);
        jtfPesquisar.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbExcluir.setEnabled(true);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        limparCampos();
        jtfDescricao.setEnabled(true);
        
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try{
            if (validarCampos()){
                if(preencherObjeto()){
                    if(DAO.incluir(obj)){
                          JOptionPane.showMessageDialog(this, "Salvo com sucesso",
                                  "Meu sistema", JOptionPane.INFORMATION_MESSAGE);
                          //Salva no banco de dados.
                          limparCampos(); //Limpa os campos.
                    }
                }
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(this, "Erro ao salvar:"+erro.getMessage(),"Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
//        try {
//            if(JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o registro?")==JOptionPane.YES_OPTION){
//                if(DAO.excluir(Integer.parseInt(jtfCodigo.getText()))){
//                    JOptionPane.showMessageDialog(this, "Excluido!");
//                    jbNovoActionPerformed(evt);
//                }
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Erro ao excluir: " +e.getMessage());
//        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbProdutosMouseClicked
//        int linhaSelecionada = jtbProdutos.getSelectedRow();
//        if (linhaSelecionada>-1){
//            jtfData.setText(listaEntrada.get(linhaSelecionada).getData);
//            jtfCodigo.setText(listaEntrada.get(linhaSelecionada).getCodigo);
//            jtfDescricao.setText(listaEntrada.get(linhaSelecionada).getDescricao);
//            jtfUnidadeMedida.setText(listaEntrada.get(linhaSelecionada).getUnidadeMedida);
//            jtfQuantidade.setText(listaEntrada.get(linhaSelecionada).getQuantidade);
//            jtfPrecoUnitCompra.setText(listaEntrada.get(linhaSelecionada).getPrecoUnitCompra);
//            jtfPrecoUnitVenda.setText(listaEntrada.get(linhaSelecionada).getPrecoUnitVenda);
//            jbEditar.setEnabled(true);
//            jbExcluir.setEnabled(true);
//        } else {
//            jbEditar.setEnabled(false);
//            jbExcluir.setEnabled(false);
//        }
    }//GEN-LAST:event_jtbProdutosMouseClicked

    private void jtfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisarKeyReleased
//        try {
//            listaEntrada = DAO.pesquisar(jtfPesquisar.getText());
//            DefaultTableModel mp = (DefaultTableModel)jtbProdutos.getModel();
//            mp.setNumRows(0);
//            for(LancarEntradaData u: listaEntrada)
//                mp.addRow(new String[]{u.getData(),u.getDescricao(),u.getQuantidade(),
//                    u.getPrecoUnitCompra(),u.getPrecoUnitVenda});
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Erro ao pesquisar: " +e.getMessage());
//        }
    }//GEN-LAST:event_jtfPesquisarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlPrecoUnitCompra;
    private javax.swing.JLabel jlPrecoUnitVenda;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JLabel jlUnidadeMedida;
    private javax.swing.JTable jtbProdutos;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfData;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JTextField jtfPrecoUnitCompra;
    private javax.swing.JTextField jtfPrecoUnitVenda;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JTextField jtfUnidadeMedida;
    // End of variables declaration//GEN-END:variables

private void limparCampos(){
    jtfData.setText("");
    jtfCodigo.setText("");
    jtfDescricao.setText("");
    jtfUnidadeMedida.setText("");
    jtfQuantidade.setText("");
    jtfPrecoUnitCompra.setText("");
    jtfPrecoUnitVenda.setText("");
    jtfPesquisar.setText("");
}

private boolean validarCampos(){
    String msg="";
    if (jtfData.getText().length()<10 || jtfData.getText().length()>10)
        msg+="\nO campo Data n??o condiz com o formato DD/MM/AAAA!";
    if (!jtfData.getText().contains("/"))
        msg+="\nO campo Data falta por /";
    if (jtfDescricao.getText().length()<3 || jtfDescricao.getText().length()>50)
        msg+="\nO campo Descri????o deve conter entre 3 e 50 caracteres!";
    if (jtfUnidadeMedida.getText().length()<2 || jtfUnidadeMedida.getText().length()>10)
        msg+="\nO campo UN de medida deve conter entre 2 e 10 caracteres!";
    if (jtfPrecoUnitCompra.getText().length()<1)
        msg+="\nO campo Pre??o Un da compra deve conter 1 ou mais caracteres!";
    if (jtfPrecoUnitVenda.getText().length()<1)
        msg+="\nO campo Pre??o Un da venda deve conter 1 ou mais caraceres!";
    if (msg.isEmpty()) return true;
    else JOptionPane.showMessageDialog(this, "Os campos abaixo precisam de aten????o:"
            +msg, "Aten????o", JOptionPane.ERROR_MESSAGE);
    return false;
}

private boolean preencherObjeto() throws Exception{
    obj.setData(jtfData.getText());
    obj.setDescricao(jtfDescricao.getText());
    obj.setUnidadeMedida(jtfUnidadeMedida.getText());
    obj.setQuantidade(Integer.parseInt(jtfQuantidade.getText()));
    obj.setPrecoUnitCompra(Integer.parseInt(jtfPrecoUnitCompra.getText()));
    obj.setPrecoUnitVenda(Integer.parseInt(jtfPrecoUnitVenda.getText()));
    return true;
}

}
