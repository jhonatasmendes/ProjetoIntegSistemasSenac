/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.my.company.telas;

import com.mycompany.dao.daoCliente;
import com.mycompany.dao.daoConteudo;
import com.mycompany.dao.daoVendedor;
import com.mycompany.modelo.modeloCliente;
import com.mycompany.modelo.modeloConteudo;
import com.mycompany.modelo.modeloVendedor;
import com.mycompany.utilidades.Formularios;
import com.mycompany.utilidades.Temporarios;
import javax.swing.JOptionPane;

/**
 *
 * @author liberalino.1980
 */
public class cadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form cadastroVendedor
     */
    public cadastroCliente() {
       initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        jtfIdCliente.setEditable(false);
        jtfIdCliente.setEnabled(false);
        jtfIdClienteVendedor.setEditable(false);
        jtfIdClienteVendedor.setEnabled(false);
        
            if(!verificarDadosTemporarios()){
                daoCliente daoClie = new daoCliente();
            
            int id = daoClie.ProximoIdCliente();
            if(id >= 0)
                jtfIdCliente.setText(String.valueOf(id));
                
                jbtSalvarOrAdd2.setText("Cadastrar Cliente");
                jbtnDelete2.setVisible(false);
        }
            else{
                jbtSalvarOrAdd2.setText("Salvar Alterações");
                jbtnDelete2.setVisible(true);
            }
    }
    
    private Boolean verificarDadosTemporarios(){
        if(Temporarios.TempObject3 instanceof modeloCliente){
            int id = ((modeloCliente) Temporarios.TempObject3).getId();
            String nome = ((modeloCliente) Temporarios.TempObject3).getNome();
            String usuario = ((modeloCliente) Temporarios.TempObject3).getUsuario();
            String senha = ((modeloCliente) Temporarios.TempObject3).getSenha();
            int id_vendedor = ((modeloCliente) Temporarios.TempObject3).getId_vendedor();
            
            jtfIdCliente.setText(String.valueOf(id));
            jtfIdClienteVendedor.setText(String.valueOf(id_vendedor));
            jtfNomeCliente.setText(String.valueOf(nome));
            jtfUsuarioCliente.setText(String.valueOf(usuario));
            jtfSenhaCliente.setText(String.valueOf(senha));
            
            Temporarios.TempObject3 = null;
            
            return true;
        }
        else{
            return false;
        }
    }

    private void addCliente(){
        daoCliente daoClie = new daoCliente();
        
        if(daoClie.inserir(Integer.parseInt(jtfIdCliente.getText()), String.valueOf(jtfNomeCliente.getText()), jtfUsuarioCliente.getText(), jtfSenhaCliente.getText(), Integer.parseInt(jtfIdClienteVendedor.getText()))){
            jtfIdCliente.setText(String.valueOf(daoClie.ProximoIdCliente()));
            jtfNomeCliente.setText("");
            jtfUsuarioCliente.setText("");
            jtfSenhaCliente.setText("");
            
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
        }
        else{
            jtfIdCliente.setText(String.valueOf(daoClie.ProximoIdCliente()));
            jtfNomeCliente.setText("");
            jtfUsuarioCliente.setText("");
            jtfSenhaCliente.setText("");
            
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar um novo cliente");
        }
    }
    
    private void alterarCliente(){
        daoCliente daoClie = new daoCliente();
        
        if(daoClie.inserir(Integer.parseInt(jtfIdCliente.getText()), String.valueOf(jtfNomeCliente.getText()), jtfUsuarioCliente.getText(), jtfSenhaCliente.getText(), Integer.parseInt(jtfIdClienteVendedor.getText()))){
            jtfIdCliente.setText(String.valueOf(daoClie.ProximoIdCliente()));
            jtfNomeCliente.setText("");
            jtfUsuarioCliente.setText("");
            jtfSenhaCliente.setText("");
            
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
        }
        else{
            jtfIdCliente.setText(String.valueOf(daoClie.ProximoIdCliente()));
            jtfNomeCliente.setText("");
            jtfUsuarioCliente.setText("");
            jtfSenhaCliente.setText("");
            
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar dados do cliente");
        }
        
        dispose();
        ((tabelaClienteEditRemove)Formularios.tabelaClienteEditRemove).listarCliente();
    }
    
      private void deletarCliente(){
        daoCliente daoClie = new daoCliente();
        
        if (daoClie.excluir(Integer.parseInt(jtfIdCliente.getText()))){
        JOptionPane.showMessageDialog(null, "Cliente: " + " '" + jtfNomeCliente.getText() + "', " + " Excluído Com Sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Não Foi possivel Excluir o Cliente Selecionado");
        }
        
        dispose();
        ((tabelaClienteEditRemove)Formularios.tabelaClienteEditRemove).listarCliente();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfIdConteudo1 = new javax.swing.JTextField();
        jbtSalvarOrAdd = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfIdCliente = new javax.swing.JTextField();
        jtfSenhaCliente = new javax.swing.JTextField();
        jtfNomeCliente = new javax.swing.JTextField();
        jtfUsuarioCliente = new javax.swing.JTextField();
        jbtSalvarOrAdd2 = new javax.swing.JButton();
        jbtnDelete2 = new javax.swing.JButton();
        jbtnCancelar2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtfIdClienteVendedor = new javax.swing.JTextField();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("ID");

        jTextField4.setText("jTextField2");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("ID");

        jtfIdConteudo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jbtSalvarOrAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtSalvarOrAdd.setText("Salvar alterações");
        jbtSalvarOrAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtSalvarOrAddMouseClicked(evt);
            }
        });
        jbtSalvarOrAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarOrAddActionPerformed(evt);
            }
        });

        jbtnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnDelete.setText("Excluir");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Nome");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("ID");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Usuário de acesso");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Senha de acesso");

        jtfIdCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdClienteActionPerformed(evt);
            }
        });

        jtfSenhaCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfSenhaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSenhaClienteActionPerformed(evt);
            }
        });

        jtfNomeCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeClienteActionPerformed(evt);
            }
        });

        jtfUsuarioCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfUsuarioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioClienteActionPerformed(evt);
            }
        });

        jbtSalvarOrAdd2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtSalvarOrAdd2.setText("Salvar alterações");
        jbtSalvarOrAdd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtSalvarOrAdd2MouseClicked(evt);
            }
        });
        jbtSalvarOrAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarOrAdd2ActionPerformed(evt);
            }
        });

        jbtnDelete2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnDelete2.setText("Excluir");
        jbtnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDelete2ActionPerformed(evt);
            }
        });

        jbtnCancelar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnCancelar2.setText("Cancelar");
        jbtnCancelar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCancelar2MouseClicked(evt);
            }
        });
        jbtnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelar2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("ID do Vendedor");

        jtfIdClienteVendedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfIdClienteVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdClienteVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfSenhaCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtSalvarOrAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jbtnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfUsuarioCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfIdClienteVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jtfNomeCliente)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfIdClienteVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfUsuarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfSenhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSalvarOrAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(jtfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(241, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdClienteActionPerformed

    private void jtfSenhaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSenhaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSenhaClienteActionPerformed

    private void jtfNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeClienteActionPerformed

    private void jtfUsuarioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioClienteActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Formularios.cadastroCliente = null;
    }//GEN-LAST:event_formWindowClosed

    private void jbtSalvarOrAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtSalvarOrAddMouseClicked
        if(jbtSalvarOrAdd2.getText().equals("Cadastrar Cliente")){
            addCliente();
        }
        else{
            alterarCliente();
        }
    }//GEN-LAST:event_jbtSalvarOrAddMouseClicked

    private void jbtSalvarOrAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarOrAddActionPerformed

    }//GEN-LAST:event_jbtSalvarOrAddActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        deletarCliente();
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Formularios.cadastroConteudo.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtSalvarOrAdd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtSalvarOrAdd2MouseClicked
        if(jbtSalvarOrAdd2.getText().equals("Cadastrar Vendedor")){
            if("".equals(jtfNomeCliente.getText())){
                JOptionPane.showMessageDialog(null, "Insira um nome para o vendedor.");
            }
            else if("".equals(jtfUsuarioCliente.getText())){
                JOptionPane.showMessageDialog(null, "Insira um usuário de login para o vendedor.");
            }
            else if("".equals(jtfSenhaCliente.getText())){
                JOptionPane.showMessageDialog(null, "Insira uma senha de login para o vendedor.");
            }
            else{
                addCliente();
            }
        }
        else{
            alterarCliente();
        }
    }//GEN-LAST:event_jbtSalvarOrAdd2MouseClicked

    private void jbtSalvarOrAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarOrAdd2ActionPerformed

    }//GEN-LAST:event_jbtSalvarOrAdd2ActionPerformed

    private void jbtnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDelete2ActionPerformed
        deletarCliente();
    }//GEN-LAST:event_jbtnDelete2ActionPerformed

    private void jbtnCancelar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelar2MouseClicked
        Formularios.cadastroConteudo.dispose();
    }//GEN-LAST:event_jbtnCancelar2MouseClicked

    private void jbtnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelar2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnCancelar2ActionPerformed

    private void jtfIdClienteVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdClienteVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdClienteVendedorActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbtSalvarOrAdd;
    private javax.swing.JButton jbtSalvarOrAdd2;
    private javax.swing.JButton jbtnCancelar2;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnDelete2;
    private javax.swing.JTextField jtfIdCliente;
    private javax.swing.JTextField jtfIdClienteVendedor;
    private javax.swing.JTextField jtfIdConteudo1;
    private javax.swing.JTextField jtfNomeCliente;
    private javax.swing.JTextField jtfSenhaCliente;
    private javax.swing.JTextField jtfUsuarioCliente;
    // End of variables declaration//GEN-END:variables
}
