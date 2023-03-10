/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AtendimentoController;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.AtendimentoModel;

/**
 *
 * @author jonathandamasiomedeiros
 */
public class PainelSenha extends javax.swing.JFrame {

    DefaultListModel emEsperaModel;

    /**
     * Creates new form PainelSenha
     */
    public PainelSenha() {
        initComponents();
        initComponentsModel();
        atualizarListaProximosClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTopo = new javax.swing.JPanel();
        jLabelTopo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProximosClientes = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelClienteAtendimento = new javax.swing.JLabel();
        jButtonProximo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(762, 306));
        setMinimumSize(new java.awt.Dimension(762, 306));

        jPanelTopo.setBackground(new java.awt.Color(0, 102, 204));
        jPanelTopo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTopo.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabelTopo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTopo.setText("Painel de Senhas - Demonstra????o!");

        javax.swing.GroupLayout jPanelTopoLayout = new javax.swing.GroupLayout(jPanelTopo);
        jPanelTopo.setLayout(jPanelTopoLayout);
        jPanelTopoLayout.setHorizontalGroup(
            jPanelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTopoLayout.setVerticalGroup(
            jPanelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTopo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel1.setText("Informe o nome do cliente:");

        jTextFieldNome.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N

        jButtonCadastrar.setBackground(new java.awt.Color(0, 102, 204));
        jButtonCadastrar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setText("Clique aqui para Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel2.setText("Lista de clientes na fila:");

        jListProximosClientes.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jScrollPane1.setViewportView(jListProximosClientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel3.setText("Cliente em atendimento:");

        jLabelClienteAtendimento.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabelClienteAtendimento.setForeground(new java.awt.Color(51, 51, 255));
        jLabelClienteAtendimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClienteAtendimento.setText("Aguardando pr??ximo cliente");
        jLabelClienteAtendimento.setIgnoreRepaint(true);

        jButtonProximo.setBackground(new java.awt.Color(0, 102, 204));
        jButtonProximo.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jButtonProximo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProximo.setText("Chamar pr??ximo cliente");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelClienteAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonProximo, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(68, 68, 68)
                .addComponent(jLabelClienteAtendimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentsModel() {
        emEsperaModel = new DefaultListModel();
        jListProximosClientes.setModel(emEsperaModel);

    }

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // TODO add your handling code here:
        String nome = jTextFieldNome.getText();

        try {
            AtendimentoController atController = new AtendimentoController();

            AtendimentoModel atendimento = new AtendimentoModel();
            atendimento.setNome(nome);
            atendimento.setData(new Date());
            atendimento.setStatus(0);
            int senha = atController.inserirCliente(atendimento);

            //Informa ao usu??rio que o cliente foi cadastrado             
            JOptionPane.showMessageDialog(this, atendimento.getNome() + " foi cadastrado com a Senha: " + senha);

            //Atualiza o jList das pessoas que est??o em espera
            atualizarListaProximosClientes();

            //Limpa o campo nome para a digita????o do pr??ximo cliente
            jTextFieldNome.setText("");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar pessoa: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // TODO add your handling code here:
        try {

            AtendimentoController atController = new AtendimentoController();

            //Atualiza a(s) senha(s) que estavam em atendimento para senhas j?? chamadas
            atController.atualizarClienteJaAtendido();

            //Busca a pr??xima pessoa a ser atendida
            AtendimentoModel atendimento = atController.obtemProximoCliente();

            if (atendimento != null) {
                //Atualiza a pessoa que estava na espera como status em atendimento
                atendimento.setStatus(1);
                atController.atualizaStatusCliente(atendimento);
                jLabelClienteAtendimento.setText("Senha: " + atendimento.getId() + " - " + atendimento.getNome());
            } else {
                jLabelClienteAtendimento.setText("Sem clientes na fila :D");
            }
            //Atualiza a lista de clientes em espera
            atualizarListaProximosClientes();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao chamar pr??xima pessoa " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void atualizarListaProximosClientes() {
        try {
            //Atualiza Senhas em Espera (status = 0)                        
            AtendimentoController atController = new AtendimentoController();
            List<AtendimentoModel> nextList = atController.obterProximosClientes();

            //Atualiza o painel com as senhas em espera
            emEsperaModel.clear();
            for (AtendimentoModel at : nextList) {
                emEsperaModel.addElement(at);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PainelSenha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(PainelSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelSenha().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelClienteAtendimento;
    private javax.swing.JLabel jLabelTopo;
    private javax.swing.JList<String> jListProximosClientes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelTopo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
