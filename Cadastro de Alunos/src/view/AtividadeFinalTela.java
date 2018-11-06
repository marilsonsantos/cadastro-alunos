package view;

import controller.ControllerAluno;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import utilitarios.AlunoBean;

public class AtividadeFinalTela extends javax.swing.JFrame {

    AlunoBean ab = new AlunoBean();
    ControllerAluno ca = new ControllerAluno();
    
    public AtividadeFinalTela() {
        initComponents();
        
        listaAluno();
    }
    
    public void listaAluno(){
    
         ResultSet rs = ca.controllerLista(ab);
         
         DefaultTableModel dtm = (DefaultTableModel) tbl_alunos.getModel();
         
         
         try{
             while(rs.next()){
                 
                 String nome = rs.getString("nome");
                 String sobrenome = rs.getString("sobrenome");
             
                 dtm.addRow(new String [] {String.valueOf(rs.getInt("codigo_aluno")), 
                     nome + " " + sobrenome, rs.getString("email"), rs.getString("rg"), rs.getString("cpf"), 
                     rs.getString("telefone"), rs.getString("celular")});
             
             }
         
         }catch(SQLException e){
         
             System.out.println("Erro: " + e.getMessage());
         
         }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_cod = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_sobrenome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_rg = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter formato = new javax.swing.text.MaskFormatter("##.###.###-#");  
            txt_rg = new javax.swing.JFormattedTextField(formato);  
        }  
        catch (Exception e){  
        }
        jLabel7 = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter formato = new javax.swing.text.MaskFormatter("###.###.###-##");  
            txt_cpf = new javax.swing.JFormattedTextField(formato);  
        }  
        catch (Exception e){  
        }
        jLabel8 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter formato = new javax.swing.text.MaskFormatter("(##)####-####");  
            txt_telefone = new javax.swing.JFormattedTextField(formato);  
        }  
        catch (Exception e){  
        }
        txt_celular = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter formato = new javax.swing.text.MaskFormatter("(##)#####-####");  
            txt_celular = new javax.swing.JFormattedTextField(formato);  
        }  
        catch (Exception e){  
        }

        btn_cadastrar = new javax.swing.JButton();
        btn_pesquisar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_alunos = new javax.swing.JTable();
        btn_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRO E MANUTENÇÃO DE ALUNOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("CÓDIGO:");

        lbl_cod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_cod.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("NOME:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("SOBRENOIME:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("RG:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("CPF:");

        txt_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cpfActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("E-MAIL:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("TELEFONE:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("CELULAR:");

        btn_cadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cadastrar.setText("CADASTRAR");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_pesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_pesquisar.setText("PESQUISAR");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        btn_alterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_alterar.setText("ALTERAR");
        btn_alterar.setEnabled(false);
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_excluir.setText("EXCLUIR");
        btn_excluir.setEnabled(false);
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_limpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_limpar.setText("LIMPAR");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        tbl_alunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Nome", "E-mail", "RG", "CPF", "TELEFONE", "CELULAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_alunos);
        if (tbl_alunos.getColumnModel().getColumnCount() > 0) {
            tbl_alunos.getColumnModel().getColumn(0).setMinWidth(60);
            tbl_alunos.getColumnModel().getColumn(0).setMaxWidth(60);
            tbl_alunos.getColumnModel().getColumn(5).setResizable(false);
        }

        btn_sair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_sair.setText("SAIR");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(45, 45, 45))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))
                                .addGap(22, 22, 22)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_rg, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_nome)
                            .addComponent(txt_telefone))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_email, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_sobrenome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_cod))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_pesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_limpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_sair)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_cod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar)
                    .addComponent(btn_pesquisar)
                    .addComponent(btn_alterar)
                    .addComponent(btn_excluir)
                    .addComponent(btn_limpar)
                    .addComponent(btn_sair))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cpfActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
       
        ab.setNome(txt_nome.getText());
        ab.setSobrenome(txt_sobrenome.getText());
        ab.setEmail(txt_email.getText());
        ab.setTelefone(txt_telefone.getText());
        ab.setCelular(txt_celular.getText());
        ab.setRg(txt_rg.getText());
        ab.setCpf(txt_cpf.getText());
        
        ca.controllerCadastro(ab);
        
        txt_nome.setText("");
        txt_sobrenome.setText("");
        txt_email.setText("");
        txt_telefone.setText("");
        txt_celular.setText("");
        txt_rg.setText("");
        txt_cpf.setText("");
        
        DefaultTableModel dtm = (DefaultTableModel) tbl_alunos.getModel();
        dtm.setNumRows(0);
        listaAluno();
        
        btn_cadastrar.setEnabled(true);
        btn_pesquisar.setEnabled(true);
        btn_alterar.setEnabled(false);
        btn_excluir.setEnabled(false);
              
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
     
        ca.controllerExibe(ab);
        txt_nome.setText(ab.getNome());
        txt_email.setText(ab.getEmail());
        txt_telefone.setText(ab.getTelefone());
        txt_celular.setText(ab.getCelular());
        txt_cpf.setText(ab.getCpf());
        txt_sobrenome.setText(ab.getSobrenome());
        txt_rg.setText(ab.getRg());
        lbl_cod.setText(String.valueOf(ab.getCod()));
        
        btn_cadastrar.setEnabled(false);
        btn_pesquisar.setEnabled(true);
        btn_alterar.setEnabled(true);
        btn_excluir.setEnabled(true);
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
       
        ab.setNome(txt_nome.getText());
        ab.setSobrenome(txt_sobrenome.getText());
        ab.setEmail(txt_email.getText());
        ab.setTelefone(txt_telefone.getText());
        ab.setCelular(txt_celular.getText());
        ab.setRg(txt_rg.getText());
        ab.setCpf(txt_cpf.getText());
        ab.setCod(Integer.parseInt(lbl_cod.getText()));
        
        ca.controllerAlterar(ab);
        
        txt_nome.setText("");
        txt_sobrenome.setText("");
        txt_email.setText("");
        txt_telefone.setText("");
        txt_celular.setText("");
        txt_rg.setText("");
        txt_cpf.setText("");
        lbl_cod.setText("");
        
        DefaultTableModel dtm = (DefaultTableModel) tbl_alunos.getModel();
        dtm.setNumRows(0);
        listaAluno();
        
        btn_cadastrar.setEnabled(true);
        btn_pesquisar.setEnabled(true);
        btn_alterar.setEnabled(false);
        btn_excluir.setEnabled(false);
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
      
        txt_nome.setText("");
        txt_sobrenome.setText("");
        txt_email.setText("");
        txt_telefone.setText("");
        txt_celular.setText("");
        txt_rg.setText("");
        txt_cpf.setText("");
        lbl_cod.setText("");
        btn_cadastrar.setEnabled(true);
        btn_pesquisar.setEnabled(true);
        btn_alterar.setEnabled(false);
        btn_excluir.setEnabled(false);
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
      
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
       
        ab.setCod(Integer.parseInt(lbl_cod.getText()));
       
        ca.controllerExcluir(ab);
        
        txt_nome.setText("");
        txt_sobrenome.setText("");
        txt_email.setText("");
        txt_telefone.setText("");
        txt_celular.setText("");
        txt_rg.setText("");
        txt_cpf.setText("");
        lbl_cod.setText("");
        
        DefaultTableModel dtm = (DefaultTableModel) tbl_alunos.getModel();
        dtm.setNumRows(0);
        listaAluno();
        
        btn_cadastrar.setEnabled(true);
        btn_pesquisar.setEnabled(true);
        btn_alterar.setEnabled(false);
        btn_excluir.setEnabled(false);
        
    }//GEN-LAST:event_btn_excluirActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtividadeFinalTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cod;
    private javax.swing.JTable tbl_alunos;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_rg;
    private javax.swing.JTextField txt_sobrenome;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}
