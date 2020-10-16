
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class FormMapa extends javax.swing.JFrame {

    List<Senha>listaSenha;

    int numero;
    
    public FormMapa() {
        initComponents();
        numero = 0;
        listaSenha = new ArrayList<Senha>();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        senhaCliente = new javax.swing.JTextField();
        botaoComum = new javax.swing.JButton();
        botaoRapido = new javax.swing.JButton();
        botaoPrioritario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        caixaUm = new javax.swing.JButton();
        caixaDois = new javax.swing.JButton();
        caixaTres = new javax.swing.JButton();
        caixaQuatro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        senhaPainel = new javax.swing.JLabel();
        caixaPainel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Escolha seu tipo de Atendimento");

        senhaCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        senhaCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senhaCliente.setToolTipText("");
        senhaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaClienteActionPerformed(evt);
            }
        });

        botaoComum.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoComum.setText("Comum");
        botaoComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComumActionPerformed(evt);
            }
        });

        botaoRapido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoRapido.setText("Rápido");
        botaoRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRapidoActionPerformed(evt);
            }
        });

        botaoPrioritario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoPrioritario.setText("Prioritário");
        botaoPrioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrioritarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Sua senha é:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(botaoComum)
                        .addGap(83, 83, 83)
                        .addComponent(botaoRapido)
                        .addGap(73, 73, 73)
                        .addComponent(botaoPrioritario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(senhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoComum)
                    .addComponent(botaoRapido)
                    .addComponent(botaoPrioritario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        caixaUm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        caixaUm.setText("Caixa 1");
        caixaUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaUmActionPerformed(evt);
            }
        });

        caixaDois.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        caixaDois.setText("Caixa 2");
        caixaDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaDoisActionPerformed(evt);
            }
        });

        caixaTres.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        caixaTres.setText("Caixa 3");
        caixaTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTresActionPerformed(evt);
            }
        });

        caixaQuatro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        caixaQuatro.setText("Caixa 4");
        caixaQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaQuatroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(caixaTres, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(caixaQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(caixaUm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(caixaDois, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Para Clientes:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Para Caixas:");

        senhaPainel.setFont(new java.awt.Font("Arial", 0, 60)); // NOI18N
        senhaPainel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        caixaPainel.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        caixaPainel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(senhaPainel)
                        .addGap(372, 372, 372))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(caixaPainel)
                .addGap(350, 350, 350))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(senhaPainel)
                .addGap(69, 69, 69)
                .addComponent(caixaPainel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaClienteActionPerformed

    private void botaoComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComumActionPerformed
        numero++;
        
        Senha senha = new Senha("C", numero);
        listaSenha.add(senha);
        senhaCliente.setText(String.valueOf(senha.getTipo() + "-" + String.valueOf(senha.getNumero())));
    }//GEN-LAST:event_botaoComumActionPerformed

    private void botaoRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRapidoActionPerformed
        numero++;
        
        Senha senha = new Senha("R", numero);
        listaSenha.add(senha);
        senhaCliente.setText(String.valueOf(senha.getTipo() + "-" + String.valueOf(senha.getNumero())));
    }//GEN-LAST:event_botaoRapidoActionPerformed

    private void botaoPrioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrioritarioActionPerformed
        numero++;
        
        Senha senha = new Senha("P", numero);
        listaSenha.add(senha);
        senhaCliente.setText(String.valueOf(senha.getTipo() + "-" + String.valueOf(senha.getNumero())));
    }//GEN-LAST:event_botaoPrioritarioActionPerformed

    private void caixaUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaUmActionPerformed
        Iterator<Senha> itr = listaSenha.iterator();

        while(itr.hasNext()){       
            
            for (int i = 0; i < listaSenha.size(); i++) {
                if(listaSenha.get(i).getTipo().equals("P")){
                    Collections.swap(listaSenha, 0, i);
                }
            }
            
            senhaPainel.setText(String.valueOf(listaSenha.get(0).getTipo())+ "-"+String.valueOf(listaSenha.get(0).getNumero()));
            caixaPainel.setText("Caixa 1");

            itr.next();
            itr.remove();
            
            break;
        }       
    }//GEN-LAST:event_caixaUmActionPerformed

    private void caixaDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaDoisActionPerformed
        Iterator<Senha> itr = listaSenha.iterator();

        while(itr.hasNext()){       
            
            for (int i = 0; i < listaSenha.size(); i++) {
                if(listaSenha.get(i).getTipo().equals("R")){
                    Collections.swap(listaSenha, 0, i);
                }
            }
            
            senhaPainel.setText(String.valueOf(listaSenha.get(0).getTipo())+ "-"+String.valueOf(listaSenha.get(0).getNumero()));
            caixaPainel.setText("Caixa 1");

            itr.next();
            itr.remove();
            
            break;
        }
    }//GEN-LAST:event_caixaDoisActionPerformed

    private void caixaTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTresActionPerformed
        Iterator<Senha> itr = listaSenha.iterator();

        while(itr.hasNext()){       
            
            for (int i = 0; i < listaSenha.size(); i++) {
                if(listaSenha.get(i).getTipo().equals("R")){
                    Collections.swap(listaSenha, 0, i);
                }
            }
            
            senhaPainel.setText(String.valueOf(listaSenha.get(0).getTipo())+ "-"+String.valueOf(listaSenha.get(0).getNumero()));
            caixaPainel.setText("Caixa 1");

            itr.next();
            itr.remove();
            
            break;
        }
    }//GEN-LAST:event_caixaTresActionPerformed

    private void caixaQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaQuatroActionPerformed
        Iterator<Senha> itr = listaSenha.iterator();

        while(itr.hasNext()){       
            
            for (int i = 0; i < listaSenha.size(); i++) {
                if(listaSenha.get(i).getTipo().equals("C")){
                    Collections.swap(listaSenha, 0, i);
                }
            }
            
            senhaPainel.setText(String.valueOf(listaSenha.get(0).getTipo())+ "-"+String.valueOf(listaSenha.get(0).getNumero()));
            caixaPainel.setText("Caixa 1");

            itr.next();
            itr.remove();
            
            break;
        }
    }//GEN-LAST:event_caixaQuatroActionPerformed

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
            java.util.logging.Logger.getLogger(FormMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoComum;
    private javax.swing.JButton botaoPrioritario;
    private javax.swing.JButton botaoRapido;
    private javax.swing.JButton caixaDois;
    private javax.swing.JLabel caixaPainel;
    private javax.swing.JButton caixaQuatro;
    private javax.swing.JButton caixaTres;
    private javax.swing.JButton caixaUm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField senhaCliente;
    private javax.swing.JLabel senhaPainel;
    // End of variables declaration//GEN-END:variables
}
