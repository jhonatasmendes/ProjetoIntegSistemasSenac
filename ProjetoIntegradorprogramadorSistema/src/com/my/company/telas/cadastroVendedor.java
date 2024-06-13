/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.my.company.telas;

import com.mycompany.dao.daoConteudo;
import com.mycompany.dao.daoVendedor;
import com.mycompany.modelo.modeloConteudo;
import com.mycompany.modelo.modeloVendedor;
import com.mycompany.utilidades.Formularios;
import com.mycompany.utilidades.Temporarios;
import javax.swing.JOptionPane;

/**
 *
 * @author liberalino.1980
 */
public class cadastroVendedor extends javax.swing.JFrame {

    /**
     * Creates new form cadastroVendedor
     */
    public cadastroVendedor() {
       initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        jtfIdVendedor.setEditable(false);
        jtfIdVendedor.setEnabled(false);
        
            if(!verificarDadosTemporarios()){
                daoVendedor daoVend = new daoVendedor();
            
            int id = daoVend.ProximoIdVendedor();
            if(id >= 0)
                jtfIdVendedor.setText(String.valueOf(id));
                
                jbtSalvarOrAdd1.setText("Cadastrar Vendedor");
                jbtnDelete1.setVisible(false);
        }
            else{
                jbtSalvarOrAdd1.setText("Salvar Alterações");
                jbtnDelete1.setVisible(true);
            }
    }
    
    private Boolean verificarDadosTemporarios(){
        if(Temporarios.TempObject2 instanceof modeloVendedor){
            int id = ((modeloVendedor) Temporarios.TempObject2).getId();
            String nome = ((modeloVendedor) Temporarios.TempObject2).getNome();
            String usuario = ((modeloVendedor) Temporarios.TempObject2).getUsuario();
            String senha = ((modeloVendedor) Temporarios.TempObject2).getSenha();
            
            jtfIdVendedor.setText(String.valueOf(id));
            jtfNomeVendedor.setText(String.valueOf(nome));
            jtfUsuarioVendedor.setText(String.valueOf(usuario));
            jtfSenhaVendedor.setText(String.valueOf(senha));
            
            Temporarios.TempObject2 = null;
            
            return true;
        }
        else{
            return false;
        }
    }

    private void addVendedor(){
        daoVendedor daoVend = new daoVendedor();
        
        if(daoVend.inserir(Integer.parseInt(jtfIdVendedor.getText()), String.valueOf(jtfNomeVendedor.getText()), jtfUsuarioVendedor.getText(), jtfSenhaVendedor.getText())){
            jtfIdVendedor.setText(String.valueOf(daoVend.ProximoIdVendedor()));
            jtfNomeVendedor.setText("");
            jtfUsuarioVendedor.setText("");
            jtfSenhaVendedor.setText("");
            
            JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso");
        }
        else{
            jtfIdVendedor.setText(String.valueOf(daoVend.ProximoIdVendedor()));
            jtfIdVendedor.setText(String.valueOf(daoVend.ProximoIdVendedor()));
            jtfNomeVendedor.setText("");
            jtfUsuarioVendedor.setText("");
            jtfSenhaVendedor.setText("");
            
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar um novo vendedor");
        }
    }
    
    private void alterarVendedor(){
        daoVendedor daoVend = new daoVendedor();
        
        if(daoVend.alterar(Integer.parseInt(jtfIdVendedor.getText()), String.valueOf(jtfNomeVendedor.getText()), jtfUsuarioVendedor.getText(), jtfSenhaVendedor.getText())){
            jtfIdVendedor.setText(String.valueOf(daoVend.ProximoIdVendedor()));
            jtfNomeVendedor.setText("");
            jtfUsuarioVendedor.setText("");
            jtfSenhaVendedor.setText("");
            
            JOptionPane.showMessageDialog(null, "Informações do vendedor alteradas com sucesso");
        }
        else{
            jtfIdVendedor.setText(String.valueOf(daoVend.ProximoIdVendedor()));
            jtfIdVendedor.setText(String.valueOf(daoVend.ProximoIdVendedor()));
            jtfNomeVendedor.setText("");
            jtfUsuarioVendedor.setText("");
            jtfSenhaVendedor.setText("");
            
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar as informações do vendedor");
        }
        
        dispose();
        ((tabelaVendedorEditRemove)Formularios.tabelaVendedorEditRemove).listarVendedor();
    }
    
      private void deletarVendedor(){
        daoVendedor daoVend = new daoVendedor();
        
        if (daoVend.excluir(Integer.parseInt(jtfIdVendedor.getText()))){
        JOptionPane.showMessageDialog(null, "Vendedor: " + " '" + jtfNomeVendedor.getText() + "', " + " Excluído Com Sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Não Foi possivel Excluir o Vendedor Selecionado");
        }
        
        ((tabelaVendedorEditRemove) Formularios.tabelaVendedorEditRemove).listarVendedor();
        
        dispose();

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
        jtfIdVendedor = new javax.swing.JTextField();
        jtfSenhaVendedor = new javax.swing.JTextField();
        jtfNomeVendedor = new javax.swing.JTextField();
        jtfUsuarioVendedor = new javax.swing.JTextField();
        jbtSalvarOrAdd1 = new javax.swing.JButton();
        jbtnDelete1 = new javax.swing.JButton();
        jbtnCancelar1 = new javax.swing.JButton();

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

        jtfIdVendedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfIdVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdVendedorActionPerformed(evt);
            }
        });

        jtfSenhaVendedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfSenhaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSenhaVendedorActionPerformed(evt);
            }
        });

        jtfNomeVendedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfNomeVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeVendedorActionPerformed(evt);
            }
        });

        jtfUsuarioVendedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfUsuarioVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioVendedorActionPerformed(evt);
            }
        });

        jbtSalvarOrAdd1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtSalvarOrAdd1.setText("Salvar alterações");
        jbtSalvarOrAdd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtSalvarOrAdd1MouseClicked(evt);
            }
        });
        jbtSalvarOrAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarOrAdd1ActionPerformed(evt);
            }
        });

        jbtnDelete1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnDelete1.setText("Excluir");
        jbtnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDelete1ActionPerformed(evt);
            }
        });

        jbtnCancelar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnCancelar1.setText("Cancelar");
        jbtnCancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCancelar1MouseClicked(evt);
            }
        });
        jbtnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfIdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 293, Short.MAX_VALUE))
                    .addComponent(jtfSenhaVendedor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtSalvarOrAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jbtnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jtfNomeVendedor)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jtfUsuarioVendedor)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfIdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfSenhaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSalvarOrAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(jtfNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(241, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(211, Short.MAX_VALUE)
                    .addComponent(jtfUsuarioVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(162, 162, 162)))
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

    private void jtfIdVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdVendedorActionPerformed

    private void jtfSenhaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSenhaVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSenhaVendedorActionPerformed

    private void jtfNomeVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeVendedorActionPerformed

    private void jtfUsuarioVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioVendedorActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Formularios.cadastroVendedor = null;
    }//GEN-LAST:event_formWindowClosed

    private void jbtSalvarOrAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtSalvarOrAddMouseClicked
        if(jbtSalvarOrAdd1.getText().equals("Cadastrar Vendedor")){
            addVendedor();
        }
        else{
            alterarVendedor();
        }
    }//GEN-LAST:event_jbtSalvarOrAddMouseClicked

    private void jbtSalvarOrAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarOrAddActionPerformed

    }//GEN-LAST:event_jbtSalvarOrAddActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        deletarVendedor();
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Formularios.cadastroConteudo.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtSalvarOrAdd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtSalvarOrAdd1MouseClicked
        if(jbtSalvarOrAdd1.getText().equals("Cadastrar Vendedor")){
            if("".equals(jtfNomeVendedor.getText())){
                JOptionPane.showMessageDialog(null, "Insira um nome para o vendedor.");
            }
            else if("".equals(jtfUsuarioVendedor.getText())){
                JOptionPane.showMessageDialog(null, "Insira um usuário de login para o vendedor.");
            }
            else if("".equals(jtfSenhaVendedor.getText())){
                JOptionPane.showMessageDialog(null, "Insira uma senha de login para o vendedor.");
            }
            else{
                addVendedor();
            }
        }
        else{
            alterarVendedor();
        }
    }//GEN-LAST:event_jbtSalvarOrAdd1MouseClicked

    private void jbtSalvarOrAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarOrAdd1ActionPerformed

    }//GEN-LAST:event_jbtSalvarOrAdd1ActionPerformed

    private void jbtnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDelete1ActionPerformed
        deletarVendedor();
    }//GEN-LAST:event_jbtnDelete1ActionPerformed

    private void jbtnCancelar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelar1MouseClicked
        Formularios.cadastroConteudo.dispose();
    }//GEN-LAST:event_jbtnCancelar1MouseClicked

    private void jbtnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnCancelar1ActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbtSalvarOrAdd;
    private javax.swing.JButton jbtSalvarOrAdd1;
    private javax.swing.JButton jbtnCancelar1;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnDelete1;
    private javax.swing.JTextField jtfIdConteudo1;
    private javax.swing.JTextField jtfIdVendedor;
    private javax.swing.JTextField jtfNomeVendedor;
    private javax.swing.JTextField jtfSenhaVendedor;
    private javax.swing.JTextField jtfUsuarioVendedor;
    // End of variables declaration//GEN-END:variables
}
