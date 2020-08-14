/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import ferramentas.CaixaDeDialogo;

/**
 *
 * @author Usuario
 */
public class InterfaceBanco extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceBanco
     */
    Conta conta1;
    Conta conta2;
    
    public InterfaceBanco() {
        initComponents();
        
        //Tudo começa por aqui
        conta1 = new Conta();
        conta2 = new Conta();
        
        conta1.setConta(1);
        conta1.setNome("Jonas");
        conta1.setSaldo(200);
        conta1.setCheque(500);
        
        conta2.setConta(2);
        conta2.setNome("Juca");
        conta2.setSaldo(500);
        conta2.setCheque(1000);
        
        atualizarInformacoesTela();
        
    }

    private void atualizarInformacoesTela(){
        lblConta1.setText(conta1.getNome());
        lblSaldoConta1.setText(String.valueOf(conta1.getSaldo()));
        lblChequeEspecialConta1.setText(String.valueOf(conta1.getCheque()));
        lblConta2.setText(conta2.getNome());
        lblSaldoConta2.setText(String.valueOf(conta2.getSaldo()));
        lblChequeEspecialConta2.setText(String.valueOf(conta2.getCheque()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConta1 = new javax.swing.JLabel();
        lblConta2 = new javax.swing.JLabel();
        btnTransferirConta1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtValor2 = new javax.swing.JTextField();
        txtValor1 = new javax.swing.JTextField();
        lblSaldoConta1 = new javax.swing.JLabel();
        lblSaldoConta2 = new javax.swing.JLabel();
        btnSacarConta1 = new javax.swing.JButton();
        btnDepositarConta1 = new javax.swing.JButton();
        btnDepositarConta2 = new javax.swing.JButton();
        btnSacarConta2 = new javax.swing.JButton();
        lblChequeEspecialConta1 = new javax.swing.JLabel();
        lblChequeEspecialConta2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblConta1.setText("CONTA 1");

        lblConta2.setText("CONTA 2");

        btnTransferirConta1.setText("Transferir");
        btnTransferirConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirConta1ActionPerformed(evt);
            }
        });

        jButton2.setText("Transferir");

        lblSaldoConta1.setText("SALDO");

        lblSaldoConta2.setText("SALDO");

        btnSacarConta1.setText("Sacar");
        btnSacarConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarConta1ActionPerformed(evt);
            }
        });

        btnDepositarConta1.setText("Depositar");
        btnDepositarConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarConta1ActionPerformed(evt);
            }
        });

        btnDepositarConta2.setText("Depositar");
        btnDepositarConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarConta2ActionPerformed(evt);
            }
        });

        btnSacarConta2.setText("Sacar");
        btnSacarConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarConta2ActionPerformed(evt);
            }
        });

        lblChequeEspecialConta1.setText("CHEQUE");

        lblChequeEspecialConta2.setText("CHEQUE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDepositarConta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblConta1)
                                .addComponent(lblSaldoConta1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnSacarConta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTransferirConta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtValor1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblConta2)
                                .addComponent(lblSaldoConta2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblChequeEspecialConta2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnDepositarConta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSacarConta2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblChequeEspecialConta1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConta1)
                    .addComponent(lblConta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoConta1)
                    .addComponent(lblSaldoConta2))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChequeEspecialConta1)
                    .addComponent(lblChequeEspecialConta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransferirConta1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSacarConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDepositarConta1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSacarConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDepositarConta2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositarConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarConta1ActionPerformed
        try{
            float valor = Float.parseFloat(txtValor1.getText());
            conta1.debito(valor);
            atualizarInformacoesTela();
            CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
            System.out.println("Operação de débito " + valor);
        }catch(Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_btnDepositarConta1ActionPerformed

    private void btnSacarConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarConta1ActionPerformed
        try{
            
            float valor = Float.parseFloat(txtValor1.getText());
            boolean resultado = conta1.credito(valor);
            if(resultado){
                atualizarInformacoesTela();
                CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
            }else{
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo insuficiente", 'a');
            }
            
        }catch(Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage(), 'e');
        }
        
    }//GEN-LAST:event_btnSacarConta1ActionPerformed

    private void btnDepositarConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarConta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDepositarConta2ActionPerformed

    private void btnSacarConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarConta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSacarConta2ActionPerformed

    private void btnTransferirConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirConta1ActionPerformed
        try{
            
            float valor = Float.parseFloat(txtValor1.getText());
            boolean resultado = conta1.credito(valor);
            if(resultado){
                conta2.debito(valor);
                atualizarInformacoesTela();
                CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
            }else{
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo insuficiente", 'a');
            }
            
        }catch(Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_btnTransferirConta1ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositarConta1;
    private javax.swing.JButton btnDepositarConta2;
    private javax.swing.JButton btnSacarConta1;
    private javax.swing.JButton btnSacarConta2;
    private javax.swing.JButton btnTransferirConta1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblChequeEspecialConta1;
    private javax.swing.JLabel lblChequeEspecialConta2;
    private javax.swing.JLabel lblConta1;
    private javax.swing.JLabel lblConta2;
    private javax.swing.JLabel lblSaldoConta1;
    private javax.swing.JLabel lblSaldoConta2;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}
