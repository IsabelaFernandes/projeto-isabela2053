/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

/**
 *
 * @author Aluno
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        pessoa = new javax.swing.JMenu();
        gerenciarpessoa = new javax.swing.JMenuItem();
        listarpessoa = new javax.swing.JMenuItem();
        cidade = new javax.swing.JMenu();
        listarcidade = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pessoa.setText("Pessoa");

        gerenciarpessoa.setText("Gerenciar");
        gerenciarpessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarpessoaActionPerformed(evt);
            }
        });
        pessoa.add(gerenciarpessoa);

        listarpessoa.setText("Listar");
        listarpessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarpessoaActionPerformed(evt);
            }
        });
        pessoa.add(listarpessoa);

        jMenuBar2.add(pessoa);

        cidade.setText("Cidade");

        listarcidade.setText("Gerenciar");
        listarcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarcidadeActionPerformed(evt);
            }
        });
        cidade.add(listarcidade);

        jMenuItem5.setText("Listar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        cidade.add(jMenuItem5);

        jMenuBar2.add(cidade);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerenciarpessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarpessoaActionPerformed
        pessoaManter pm = new pessoaManter();
        // fechar apenas a janela
        pm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pm.setVisible(true);
    }//GEN-LAST:event_gerenciarpessoaActionPerformed

    private void listarpessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarpessoaActionPerformed
        pessoaListagem pl = new pessoaListagem();
        //fechar apenas a janela
        pl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pl.setVisible(true);

    }//GEN-LAST:event_listarpessoaActionPerformed

    private void listarcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarcidadeActionPerformed
        CidadeTela ct = new CidadeTela();
        //fechar apenas a janela
        ct.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ct.setVisible(true);

    }//GEN-LAST:event_listarcidadeActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        cidadeListagem cl = new cidadeListagem();

        //fechar apenas a janela
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cl.setVisible(true);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cidade;
    private javax.swing.JMenuItem gerenciarpessoa;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem listarcidade;
    private javax.swing.JMenuItem listarpessoa;
    private javax.swing.JMenu pessoa;
    // End of variables declaration//GEN-END:variables
}