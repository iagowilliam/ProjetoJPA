/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionariocaixa.view;
import br.com.ifba.vp.funcionariocaixa.model.dao.FuncionarioCaixaDAO;
import br.com.ifba.vp.telagerente.view.TelaGerente;
import br.com.ifba.vp.funcionariocaixa.model.bean.FuncionarioCaixa;
import br.com.ifba.vp.infraestructure.support.StringUtil;
import br.com.ifba.vp.infrastructure.service.Facede;
import br.com.ifba.vp.infrastructure.service.IFacede;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author lab02
 */
public class TelaCadastroFuncionario extends javax.swing.JFrame {

    
    
    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroFuncionario() {
        initComponents();
    }
    
    private boolean validaCampos(){
        StringUtil util = StringUtil.getInstance();
        
        //se todos os campos não estiverem preenchidos
        if(this.txtNomeFuncionario.getText().equals("") && this.txtSenhaFuncionario.getText().equals("")){
            if(this.txtEmailFuncionario.getText().equals("") && this.jComboBoxSexoFuncionario.getSelectedItem().equals("(  )-     -    ")){
                if(this.txtRGFuncionario.getText().equals("  .   .   -  ") && this.txtCPFFuncionario.getText().equals("   .   .   -  ")){
                    if(this.txtEspecializacaoFuncionario.getText().equals("  /  /    ") && this.txtTelefoneFuncionario.getText().equals("(  )    .    ")){
                        if(this.txtRuaFuncionario.getText().equals("") && this.txtNumeroCasaFuncionario.getText().equals("")){
                            if(this.txtCidadeFuncionario.getText().equals("") && this.txtBairroFuncionario.getText().equals("")){
                                if(this.jComboBoxEstado.getSelectedItem().equals("") && this.txtCEPFuncionario.getText().equals("")){
                                    
                                    JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.");
                                    return false;
                                }
                            }
                        }      
                    }
                }               
            }
        }
        
        //checando cada campo invidivualmente
        if(util.isNullOrEmpty(this.txtNomeFuncionario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome de Funcionário.");
            return false;
        }
        
        if(util.isNullOrEmpty(this.txtSenhaFuncionario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Senha.");
            return false;
        }
        
        if(util.isNullOrEmpty(this.txtEmailFuncionario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Email.");
            return false;
        }
        
        if(util.isNullOrEmpty((String) this.jComboBoxSexoFuncionario.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Sexo.");
            return false;
        }
        
        
        if(util.isNullOrEmpty(this.txtRGFuncionario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo RG do Funcionário.");
            return false;
        }
        
        if(util.isNullOrEmpty(this.txtCPFFuncionario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo CPF do Funcionário.");
            return false;
        }
        
        if(util.isNullOrEmpty(this.txtEspecializacaoFuncionario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Especialização.");
            return false;
        }
        
        if(util.isNullOrEmpty(this.txtTelefoneFuncionario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Telefone.");
            return false;
        }
        
        if(util.isNullOrEmpty(this.txtRuaFuncionario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Rua.");
            return false;
        }
        
        if(util.isNullOrEmpty(this.txtNumeroCasaFuncionario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Número.");
            return false;
        }
        
        if(util.isNullOrEmpty(this.txtCidadeFuncionario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Cidade.");
            return false;
        }
        
        if(util.isNullOrEmpty(this.txtBairroFuncionario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Bairro.");
            return false;
        }
        
        if(util.isNullOrEmpty((String) this.jComboBoxEstado.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Estado.");
            return false;
        }
        
        if(util.isNullOrEmpty(this.txtCEPFuncionario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo CEP.");
            return false;
        }
        
        return true;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtEmailFuncionario = new javax.swing.JTextField();
        txtEspecializacaoFuncionario = new javax.swing.JTextField();
        txtCidadeFuncionario = new javax.swing.JTextField();
        txtBairroFuncionario = new javax.swing.JTextField();
        txtRuaFuncionario = new javax.swing.JTextField();
        txtNumeroCasaFuncionario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<String>();
        jLabel15 = new javax.swing.JLabel();
        txtSenhaFuncionario = new javax.swing.JPasswordField();
        jComboBoxSexoFuncionario = new javax.swing.JComboBox<String>();
        txtRGFuncionario = new javax.swing.JFormattedTextField();
        txtCPFFuncionario = new javax.swing.JFormattedTextField();
        txtTelefoneFuncionario = new javax.swing.JFormattedTextField();
        txtCEPFuncionario = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("Nome Completo");

        jLabel2.setText("Senha");

        jLabel3.setText("E-mail");

        jLabel4.setText("CPF");

        jLabel5.setText("RG");

        jLabel6.setText("Especialização");

        jLabel7.setText("Cidade");

        jLabel8.setText("Bairro");

        jLabel9.setText("Rua");

        jLabel10.setText("Nº");

        jLabel12.setText("Telefone");

        txtNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFuncionarioActionPerformed(evt);
            }
        });

        txtEmailFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailFuncionarioActionPerformed(evt);
            }
        });

        txtEspecializacaoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecializacaoFuncionarioActionPerformed(evt);
            }
        });

        txtNumeroCasaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCasaFuncionarioActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Novo Funcionário ");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FichaCadastral.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(87, 29));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(87, 29));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(87, 29));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabel13.setText("Sexo");

        jLabel14.setText("Estado");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        jComboBoxEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel15.setText("CEP");

        jComboBoxSexoFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));

        try {
            txtRGFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCPFFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFFuncionarioActionPerformed(evt);
            }
        });

        try {
            txtTelefoneFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCEPFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel3))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1))
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRGFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSexoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSalvar)
                                .addGap(83, 83, 83)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEspecializacaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCidadeFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtRuaFuncionario, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroCasaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCEPFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(7, Short.MAX_VALUE))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSexoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(txtRGFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecializacaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtRuaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtNumeroCasaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtCEPFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        new TelaGerente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void txtEspecializacaoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecializacaoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecializacaoFuncionarioActionPerformed

    private void txtNumeroCasaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCasaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCasaFuncionarioActionPerformed

    private void txtNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFuncionarioActionPerformed

    private void txtEmailFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFuncionarioActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        
        FuncionarioCaixa funcionarioCaixa = new FuncionarioCaixa();
        IFacede facede = new Facede();
        
        
        //Verifica de o funcion[ario [e válido
        /*if(validaCampos() == true){
            
            funcionarioCaixa.setNome(this.txtNomeFuncionario.getText());
            funcionarioCaixa.setSenha(Integer.parseInt(this.txtSenhaFuncionario.getText()));
            funcionarioCaixa.setEmail(this.txtEmailFuncionario.getText());
            funcionarioCaixa.setSexo((String) this.jComboBoxSexoFuncionario.getSelectedItem());
            funcionarioCaixa.setRG(Integer.parseInt(this.txtRGFuncionario.getText()));
            funcionarioCaixa.setCPF(Long.parseLong(this.txtCPFFuncionario.getText()));
            funcionarioCaixa.setEspecialização(this.txtEspecializacaoFuncionario.getText());
            funcionarioCaixa.setTelefone(Long.parseLong(this.txtTelefoneFuncionario.getText()));
            funcionarioCaixa.setRua(this.txtRuaFuncionario.getText());
            funcionarioCaixa.setNumero(Integer.parseInt(this.txtNumeroCasaFuncionario.getText()));
            funcionarioCaixa.setCidade(this.txtCidadeFuncionario.getText());
            funcionarioCaixa.setBairro(this.txtBairroFuncionario.getText());
            funcionarioCaixa.setEstado((String) this.jComboBoxEstado.getSelectedItem());
            funcionarioCaixa.setCEP(Integer.parseInt(this.txtCEPFuncionario.getText()));
            
            //salvando funcioniario na base de dados
            if(facede.saveFuncionario(funcionarioCaixa) == funcionarioCaixa){
                
                JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
                
                //Fecha a tela de cadastro de funcionario
                this.dispose();

            }else{
                JOptionPane.showMessageDialog(null, "Erro ao salvar");
            }
            
        }*/
        
        /*List <FuncionarioCaixa> FC = new ArrayList();
        FuncionarioCaixa F = new FuncionarioCaixa();
        FuncionarioCaixaDAO FCD = new FuncionarioCaixaDAO();
        int i = 0;
        
        try{
            
            F.setNome(jTextField1.getText());
            F.setSenha(Integer.parseInt(jPasswordField1.getText()));
            F.setEmail(jTextField3.getText());
            F.setSexo((String)jComboBox2.getSelectedItem());
            F.setRG(Integer.parseInt (jTextField5.getText()));
            F.setCPF(Long.parseLong (jTextField4.getText()));
            F.setEspecialização(jTextField6.getText());
            F.setTelefone(Long.parseLong (jTextField11.getText()));
            F.setRua(jTextField9.getText());
            F.setNumero(Integer.parseInt (jTextField10.getText()));
            F.setCidade(jTextField7.getText());
            F.setBairro(jTextField8.getText());
            F.setEstado((String)jComboBox1.getSelectedItem());
            F.setCEP(Integer.parseInt (jTextField13.getText()));
            
            FCD.create(F);
            i++;
            
            jTextField1.setText("");
            jTextField3.setText("");
            jTextField5.setText("");
            jTextField4.setText("");
            jTextField6.setText("");
            jTextField11.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField13.setText("");
        
        }catch(java.lang.NumberFormatException ex){
            
            JOptionPane.showMessageDialog(null, "Um ou mais campos númericos foram preenchidos com pontos, espaços ou caracteres!");
        
        }
        
        if(i != 0){
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
        }*/
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void txtCPFFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxSexoFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtBairroFuncionario;
    private javax.swing.JFormattedTextField txtCEPFuncionario;
    private javax.swing.JFormattedTextField txtCPFFuncionario;
    private javax.swing.JTextField txtCidadeFuncionario;
    private javax.swing.JTextField txtEmailFuncionario;
    private javax.swing.JTextField txtEspecializacaoFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtNumeroCasaFuncionario;
    private javax.swing.JFormattedTextField txtRGFuncionario;
    private javax.swing.JTextField txtRuaFuncionario;
    private javax.swing.JPasswordField txtSenhaFuncionario;
    private javax.swing.JFormattedTextField txtTelefoneFuncionario;
    // End of variables declaration//GEN-END:variables
}
