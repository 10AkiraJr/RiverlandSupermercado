/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import MODEL.UsuarioModel;
import DATA.UsuarioData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Junior Akira
 */
public class JIFUsuario extends javax.swing.JInternalFrame {
    private UsuarioModel obj;
    private UsuarioData DAO;
    /**
     * Creates new form JIFUsuario
     */
    public JIFUsuario() {
        initComponents();
        obj = new UsuarioModel();
        try {
            DAO = new UsuarioData();
        } catch (Exception ex) {
            Logger.getLogger(JIFUsuario.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jlUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jlID = new javax.swing.JLabel();
        jlCodID = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jtfCPF = new javax.swing.JTextField();
        jlTelefone = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jbEditarUsuario = new javax.swing.JButton();
        jbSalvarUsuario = new javax.swing.JButton();
        jbCancelarUsuario = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Usu??rio");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da conta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jlUsuario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlUsuario.setText("Usu??rio:");

        jtfUsuario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfUsuario.setEnabled(false);

        jlEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlEmail.setText("E-mail:");

        jtfEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfEmail.setEnabled(false);

        jlID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlID.setText("ID");

        jlCodID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlCodID.setText("0");

        jlCPF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlCPF.setText("CPF:");

        jtfCPF.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfCPF.setEnabled(false);

        jlTelefone.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlTelefone.setText("Telefone:");

        jtfTelefone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfTelefone.setEnabled(false);

        jlSenha.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlSenha.setText("Senha:");

        jpfSenha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jpfSenha.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfEmail)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSenha)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlUsuario)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jlID)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jlCodID))
                                        .addComponent(jlCPF)
                                        .addComponent(jlEmail))
                                    .addGap(311, 311, 311)))
                            .addComponent(jlTelefone)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jpfSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlID)
                    .addComponent(jlCodID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlUsuario)
                .addGap(1, 1, 1)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCPF)
                .addGap(1, 1, 1)
                .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jbEditarUsuario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/1editar.png"))); // NOI18N
        jbEditarUsuario.setText("  Editar");
        jbEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarUsuarioActionPerformed(evt);
            }
        });

        jbSalvarUsuario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbSalvarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/1salvar.png"))); // NOI18N
        jbSalvarUsuario.setText("  Salvar");
        jbSalvarUsuario.setEnabled(false);
        jbSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarUsuarioActionPerformed(evt);
            }
        });

        jbCancelarUsuario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbCancelarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/1excluir.png"))); // NOI18N
        jbCancelarUsuario.setText("  Cancelar");
        jbCancelarUsuario.setEnabled(false);
        jbCancelarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCancelarUsuario)
                        .addGap(7, 7, 7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvarUsuario)
                    .addComponent(jbEditarUsuario)
                    .addComponent(jbCancelarUsuario))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarUsuarioActionPerformed
        jtfUsuario.setEnabled(true);
        jtfCPF.setEnabled(true);
        jtfEmail.setEnabled(true);
        jtfTelefone.setEnabled(true);
        jpfSenha.setEnabled(true);
        jbEditarUsuario.setEnabled(false);
        jbSalvarUsuario.setEnabled(true);
        jbCancelarUsuario.setEnabled(true);
    }//GEN-LAST:event_jbEditarUsuarioActionPerformed

    private void jbSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarUsuarioActionPerformed
        try {
            if(preencherObjeto()){
                if(DAO.alterar1(obj)){
                    if(DAO.alterar2(obj)){
                        if(DAO.alterar3(obj)){
                            JOptionPane.showMessageDialog(this, "Salvo com sucesso",
                                  "Meu sistema", JOptionPane.INFORMATION_MESSAGE);
                            //Salva no banco de dados.
                        }
                    }
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar:"+erro.getMessage(),"Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarUsuarioActionPerformed

    private void jbCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarUsuarioActionPerformed
        jtfUsuario.setEnabled(false);
        jtfCPF.setEnabled(false);
        jtfEmail.setEnabled(false);
        jtfTelefone.setEnabled(false);
        jpfSenha.setEnabled(false);
        jbEditarUsuario.setEnabled(true);
        jbSalvarUsuario.setEnabled(false);
        jbCancelarUsuario.setEnabled(false);
    }//GEN-LAST:event_jbCancelarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCancelarUsuario;
    private javax.swing.JButton jbEditarUsuario;
    private javax.swing.JButton jbSalvarUsuario;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCodID;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfTelefone;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

private boolean preencherObjeto() throws Exception{
    obj.setUsuario(jtfUsuario.getText());
    obj.setCpf(jtfCPF.getText());
    obj.setEmail(jtfEmail.getText());
    obj.setTelefone(Integer.parseInt(jtfTelefone.getText()));
    obj.setSenha(jpfSenha.getText());
    return true;
}

}
