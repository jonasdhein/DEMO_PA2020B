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
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnAcessar = new javax.swing.JButton();
        txtConta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(33, 150, 243));
        setForeground(new java.awt.Color(33, 150, 243));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 90, 70, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Senha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 93, 47, -1));

        btnAcessar.setText("ACESSAR");
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 118, 123, -1));

        txtConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContaActionPerformed(evt);
            }
        });
        getContentPane().add(txtConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 60, 70, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Conta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 63, 47, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/password.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setBackground(new java.awt.Color(33, 150, 243));
        jLabel3.setForeground(new java.awt.Color(33, 150, 243));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContaActionPerformed

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
        //validar usuário no banco de dados
        try{
            String conta = txtConta.getText().toString();
            String senha = txtSenha.getText().toString();
            
            if(!conta.equals("") && !senha.equals("")){
            
                ContaController controller = new ContaController();
                Conta objeto = controller.validarLogin(conta, senha);
                if(objeto != null){
                    dispose();//fechar a janela atual
                    
                    InterfaceBanco tela = new InterfaceBanco();
                    tela.conta1 = objeto;
                    tela.setVisible(true);//abrir a tela InterfaceBanco
                }else{
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Dados inválidos", 'i');
                }
            
            }else{
                CaixaDeDialogo.obterinstancia().exibirMensagem("Informe conta e senha", 'i');
            }
            
        }catch(Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_btnAcessarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtConta;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
