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
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liberalino.1980
 */
public class tabelaClienteEditRemove extends javax.swing.JFrame {

    /**
     * Creates new form tabelaConteudo
     */
    public tabelaClienteEditRemove() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);
        listarCliente();
        
        if(jcbFiltro.getSelectedIndex() == 0){
            jtfFiltro.setEnabled(false);
        }
    }
    
    public void listarCliente(){
        try{
            DefaultTableModel defaulttablemodel = (DefaultTableModel) jTableCliente.getModel();
            
            jTableCliente.setModel(defaulttablemodel);
            
            daoCliente daoClie = new daoCliente();
            
            ResultSet resultset = daoClie.SelecionarTodos();
            
            defaulttablemodel.setRowCount(0);
            
            while(resultset.next()){
                String id = resultset.getString(1);
                String nome = resultset.getString(2);
                String usuario = resultset.getString(3);
                String senha = resultset.getString(4);
                String id_vendedor = resultset.getString(5);
                
                
                defaulttablemodel.addRow(new Object[]{id, nome, usuario, senha, id_vendedor});
            }  
        }
        catch(Exception e){
            
        }
    }
    
    public void listarClienteId(int clienteId){
        try{
            DefaultTableModel defaulttablemodel =  (DefaultTableModel) jTableCliente.getModel();
            
            jTableCliente.setModel(defaulttablemodel);
            
            daoCliente daoClie = new daoCliente();
            
            ResultSet resultset = daoClie.SelecionarPorId(clienteId);
            
            defaulttablemodel.setRowCount(0);
            
            while(resultset.next()){
                String id = resultset.getString(1);
                String nome = resultset.getString(2);
                String usuario = resultset.getString(3);
                String senha = resultset.getString(4);
                String id_vendedor = resultset.getString(5);
                
                
                defaulttablemodel.addRow(new Object[]{id, nome, usuario, senha, id_vendedor});
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorIdDoVendedor(int id_vendedorCliente){
        try{
            DefaultTableModel defaulttablemodel =  (DefaultTableModel) jTableCliente.getModel();
            
            jTableCliente.setModel(defaulttablemodel);
            
            daoCliente daoClie = new daoCliente();
            
            ResultSet resultset = daoClie.SelecionarPorIdVendedor(id_vendedorCliente);
            
            defaulttablemodel.setRowCount(0);
            
            while(resultset.next()){
                String id = resultset.getString(1);
                String nome = resultset.getString(2);
                String usuario = resultset.getString(3);
                String senha = resultset.getString(4);
                String id_vendedor = resultset.getString(5);
                
                
                defaulttablemodel.addRow(new Object[]{id, nome, usuario, senha, id_vendedor});
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarClienteNome(String clienteNome){
        try{
            DefaultTableModel defaulttablemodel =  (DefaultTableModel) jTableCliente.getModel();
            
            jTableCliente.setModel(defaulttablemodel);
            
            daoCliente daoClie = new daoCliente();
            
            ResultSet resultset = daoClie.SelecionarPorCliente(clienteNome);
            
            defaulttablemodel.setRowCount(0);
            
            while(resultset.next()){
                String id = resultset.getString(1);
                String nome = resultset.getString(2);
                String usuario = resultset.getString(3);
                String senha = resultset.getString(4);
                String id_vendedor = resultset.getString(5);
                
                
                defaulttablemodel.addRow(new Object[]{id, nome, usuario, senha, id_vendedor});
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jcbFiltro = new javax.swing.JComboBox<>();
        jtfFiltro = new javax.swing.JTextField();
        jbtnFiltrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jcbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "NOME" }));
        jcbFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbFiltroItemStateChanged(evt);
            }
        });
        jcbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFiltroActionPerformed(evt);
            }
        });

        jtfFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFiltroActionPerformed(evt);
            }
        });

        jbtnFiltrar.setText("Filtrar");
        jbtnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFiltrarActionPerformed(evt);
            }
        });

        jTableCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "USUARIO", "SENHA", "ID DO VENDEDOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Para editar ou remover algum cliente: ");

        jLabel3.setText("Clique duas vezes sobre o mesmo.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
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

    private void jcbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFiltroActionPerformed

    private void jtfFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFiltroActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Formularios.tabelaClienteEditRemove = null;
    }//GEN-LAST:event_formWindowClosed

    private void jcbFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbFiltroItemStateChanged
        if(jcbFiltro.getSelectedIndex() != 0){
            jtfFiltro.setEnabled(true);
            jtfFiltro.setText("");
        }
        else{
            jtfFiltro.setEnabled(false);
            jtfFiltro.setText("");
            listarCliente();
        }
    }//GEN-LAST:event_jcbFiltroItemStateChanged

    private void jbtnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFiltrarActionPerformed
        if(jcbFiltro.getSelectedIndex() == 1){
            listarClienteId(Integer.parseInt(jtfFiltro.getText()));
        }
        else if(jcbFiltro.getSelectedIndex() == 2){
            listarClienteNome(jtfFiltro.getText());
        }
        else if(jcbFiltro.getSelectedIndex() == 3){
            listarPorIdDoVendedor(Integer.parseInt(jtfFiltro.getText()));
        }
    }//GEN-LAST:event_jbtnFiltrarActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        if (evt.getClickCount() == 2){
            
            modeloCliente modClie = new modeloCliente();
            
            modClie.setId(Integer.parseInt(String.valueOf(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 0))));
            modClie.setNome(String.valueOf(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 1)));
            modClie.setUsuario(String.valueOf(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 2)));
            modClie.setSenha(String.valueOf(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 3)));
            modClie.setId_vendedor(Integer.parseInt(String.valueOf(jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 4))));
            

            
            Temporarios.TempObject3 = (modeloCliente) modClie;
            
            cadastroCliente cadastrocliente = new cadastroCliente();
            cadastrocliente.setVisible(true);
        }
    }//GEN-LAST:event_jTableClienteMouseClicked

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
            java.util.logging.Logger.getLogger(tabelaClienteEditRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabelaClienteEditRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabelaClienteEditRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabelaClienteEditRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new tabelaClienteEditRemove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JButton jbtnFiltrar;
    private javax.swing.JComboBox<String> jcbFiltro;
    private javax.swing.JTextField jtfFiltro;
    // End of variables declaration//GEN-END:variables
}
