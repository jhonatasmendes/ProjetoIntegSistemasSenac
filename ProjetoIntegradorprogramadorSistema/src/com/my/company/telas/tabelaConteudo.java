/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.my.company.telas;

import com.mycompany.dao.daoConteudo;
import com.mycompany.utilidades.Formularios;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liberalino.1980
 */
public class tabelaConteudo extends javax.swing.JFrame {

    /**
     * Creates new form tabelaConteudo
     */
    public tabelaConteudo() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);
        listarConteudo();
        
        if(jcbFiltro.getSelectedIndex() == 0){
            jtfFiltro.setEnabled(false);
            jbtnFiltrar.setEnabled(false);
        }
    }
    
    public void listarConteudo(){
        try{
            DefaultTableModel defaulttablemodel = (DefaultTableModel) jTableConteudo.getModel();
            
            jTableConteudo.setModel(defaulttablemodel);
            
            daoConteudo daoCont = new daoConteudo();
            
            ResultSet resultSet = daoCont.SelecionarTodos();
            
            defaulttablemodel.setRowCount(0);
            
            while(resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String categoria = resultSet.getString(3);
                String genero = resultSet.getString(4);
                
                defaulttablemodel.addRow(new Object[]{id, nome, categoria, genero});
            }  
        }
        catch(Exception e){
            
        }
    }
    
    public void listarConteudoId(int conteudoId){
        try{
            DefaultTableModel defaulttablemodel =  (DefaultTableModel) jTableConteudo.getModel();
            
            jTableConteudo.setModel(defaulttablemodel);
            
            daoConteudo daoCont = new daoConteudo();
            
            ResultSet resultset = daoCont.SelecionarPorId(conteudoId);
            
            defaulttablemodel.setRowCount(0);
            while(resultset.next()){
                String id = resultset.getString(1);
                String nome = resultset.getString(2);
                String id_categoria = resultset.getString(3);
                String id_genero = resultset.getString(4);
                
                defaulttablemodel.addRow(new Object[]{id, nome, id_categoria, id_genero});
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarConteudoNome(String conteudoNome){
        try{
            DefaultTableModel defaulttablemodel =  (DefaultTableModel) jTableConteudo.getModel();
            
            jTableConteudo.setModel(defaulttablemodel);
            
            daoConteudo daoCont = new daoConteudo();
            
            ResultSet resultset = daoCont.SelecionarPorConteudo(conteudoNome);
            
            defaulttablemodel.setRowCount(0);
            while(resultset.next()){
                String id = resultset.getString(1);
                String nome = resultset.getString(2);
                String id_categoria = resultset.getString(3);
                String id_genero = resultset.getString(4);
                
                defaulttablemodel.addRow(new Object[]{id, nome, id_categoria, id_genero});
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
        public void listarCategoriaNome(String categoriaNome){
        try{
            DefaultTableModel defaulttablemodel =  (DefaultTableModel) jTableConteudo.getModel();
            
            jTableConteudo.setModel(defaulttablemodel);
            
            daoConteudo daoCont = new daoConteudo();
            
            ResultSet resultset = daoCont.SelecionarPorCategoria(categoriaNome);
            
            defaulttablemodel.setRowCount(0);
            while(resultset.next()){
                String id = resultset.getString(1);
                String nome = resultset.getString(2);
                String id_categoria = resultset.getString(3);
                String id_genero = resultset.getString(4);
                
                defaulttablemodel.addRow(new Object[]{id, nome, id_categoria, id_genero});
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

        public void listarGeneroNome(String generoNome){
        try{
            DefaultTableModel defaulttablemodel =  (DefaultTableModel) jTableConteudo.getModel();
            
            jTableConteudo.setModel(defaulttablemodel);
            
            daoConteudo daoCont = new daoConteudo();
            
            ResultSet resultset = daoCont.SelecionarPorGenero(generoNome);
            
            defaulttablemodel.setRowCount(0);
            while(resultset.next()){
                String id = resultset.getString(1);
                String nome = resultset.getString(2);
                 String id_categoria = resultset.getString(3);
                String id_genero = resultset.getString(4);
                
                defaulttablemodel.addRow(new Object[]{id, nome, id_categoria, id_genero});
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

        jPanel1 = new javax.swing.JPanel();
        jcbFiltro = new javax.swing.JComboBox<>();
        jtfFiltro = new javax.swing.JTextField();
        jbtnFiltrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConteudo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jcbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "NOME", "CATEGORIA", "GENERO" }));
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

        jTableConteudo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableConteudo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CATEGORIA", "GENERO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConteudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConteudoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConteudo);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Para editar ou remover algum conteúdo: ");

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
        Formularios.tabelaConteudo = null;
    }//GEN-LAST:event_formWindowClosed

    private void jcbFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbFiltroItemStateChanged
        if(jcbFiltro.getSelectedIndex() != 0){
            jtfFiltro.setEnabled(true);
            jbtnFiltrar.setEnabled(true);
            jtfFiltro.setText("");
        }
        else{
            jtfFiltro.setEnabled(false);
            jbtnFiltrar.setEnabled(false);
            jtfFiltro.setText("");
        }
    }//GEN-LAST:event_jcbFiltroItemStateChanged

    private void jbtnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFiltrarActionPerformed
        if(jcbFiltro.getSelectedIndex() == 1){
            listarConteudoId(Integer.parseInt(jtfFiltro.getText()));
        }
        else if(jcbFiltro.getSelectedIndex() == 2){
            listarConteudoNome(jtfFiltro.getText());
    }
        else if(jcbFiltro.getSelectedIndex() == 3){
            listarCategoriaNome(jtfFiltro.getText());
    }
        else if(jcbFiltro.getSelectedIndex() == 4){
            listarGeneroNome(jtfFiltro.getText());
    }
    }//GEN-LAST:event_jbtnFiltrarActionPerformed

    private void jTableConteudoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConteudoMouseClicked
        if(evt.getClickCount() == 2){
            JOptionPane.showMessageDialog(null, "Para editar ou remover algum conteúdo, acesse a tabela de edição");
        }
    }//GEN-LAST:event_jTableConteudoMouseClicked

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
            java.util.logging.Logger.getLogger(tabelaConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabelaConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabelaConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabelaConteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabelaConteudo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConteudo;
    private javax.swing.JButton jbtnFiltrar;
    private javax.swing.JComboBox<String> jcbFiltro;
    private javax.swing.JTextField jtfFiltro;
    // End of variables declaration//GEN-END:variables
}
