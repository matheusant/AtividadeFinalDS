package PacoteJava;

import javax.swing.table.DefaultTableModel;

import java.sql.*;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

public class JFCad_Empresa extends javax.swing.JFrame {

    /**
     * Creates new form JFCad_Empresa
     */
    public JFCad_Empresa() {
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

        btnIserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnFinal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblCodigo1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblCnpj = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblRazao = new javax.swing.JLabel();
        txtRazao = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        lblCnpj1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClinicas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnIserir.setBackground(new java.awt.Color(153, 255, 255));
        btnIserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJava/newF.png"))); // NOI18N
        btnIserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIserirActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(153, 255, 255));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJava/save.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJava/delete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(153, 255, 255));
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJava/refresh.png"))); // NOI18N
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnPesquisa.setBackground(new java.awt.Color(153, 255, 255));
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJava/lupa.png"))); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(153, 255, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJava/inicio.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(153, 255, 255));
        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJava/ant.png"))); // NOI18N
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setBackground(new java.awt.Color(153, 255, 255));
        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJava/prox.png"))); // NOI18N
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnFinal.setBackground(new java.awt.Color(153, 255, 255));
        btnFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJava/fim.png"))); // NOI18N
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCodigo1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCodigo1.setText("Código Empresa");

        txtCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCodigo1)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(txtCodigo))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblCodigo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNome.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblNome.setText("Nome da Empresa");

        txtNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNome))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCnpj.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCnpj.setText("CNPJ");

        txtCnpj.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCnpj)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCnpj))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblCnpj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblRazao.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblRazao.setText("Razão Social");

        txtRazao.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblRazao)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addComponent(txtRazao))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblRazao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRazao))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCnpj1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCnpj1.setText("Clínicas");

        tblClinicas.setBackground(new java.awt.Color(204, 204, 204));
        tblClinicas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblClinicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do Dependente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClinicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClinicasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClinicas);
        if (tblClinicas.getColumnModel().getColumnCount() > 0) {
            tblClinicas.getColumnModel().getColumn(0).setResizable(false);
            tblClinicas.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCnpj1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblCnpj1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIserir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinal)
                    .addComponent(btnProximo)
                    .addComponent(btnAnterior)
                    .addComponent(btnInicio)
                    .addComponent(btnPesquisa)
                    .addComponent(btnAtualizar)
                    .addComponent(btnDelete)
                    .addComponent(btnAlterar)
                    .addComponent(btnIserir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limpaCampos(){
        txtCodigo.setText("");
        txtNome.setText("");
        txtCnpj.setText("");
        txtRazao.setText("");
        txtNome.grabFocus();
    }
    
    private void btnIserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIserirActionPerformed
        Connection con = Conexao.abrirConexao();
        EmpresaDAO ed = new EmpresaDAO(con);
        EmpresaBean eb = new EmpresaBean();
        
        eb.setNome(txtNome.getText());
        eb.setCnpj(txtCnpj.getText());
        eb.setRazaoSocial(txtRazao.getText());
        
        JOptionPane.showMessageDialog(null, ed.inserirEmpresa(eb));
        
        Conexao.fecharConexao(con);
        
        limpaCampos();
        
    }//GEN-LAST:event_btnIserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Connection con = Conexao.abrirConexao();
        EmpresaDAO ed = new EmpresaDAO(con);
        EmpresaBean eb = new EmpresaBean();
        
        eb.setNome(txtNome.getText());
        eb.setCnpj(txtCnpj.getText());
        eb.setRazaoSocial(txtRazao.getText());
        eb.setCodigo(Integer.parseInt(txtCodigo.getText()));
        
        JOptionPane.showMessageDialog(null, ed.alterarEmpresa(eb));
        
        Conexao.fecharConexao(con);
        
        limpaCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Connection con = Conexao.abrirConexao();
        EmpresaDAO ed = new EmpresaDAO(con);
        EmpresaBean eb = new EmpresaBean();
        
        eb.setCodigo(Integer.parseInt(txtCodigo.getText()));
        
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null, "Deseja realmente excluir essa empresa?\n"
                + "Código: " + txtCodigo.getText()
                + "\nNome da Empresa: " + txtNome.getText()
                + "\nCNPJ: " + txtCnpj.getText(),
                 "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                 null, opcoes, opcoes[0]);
        if (i == JOptionPane.YES_NO_OPTION) {
            JOptionPane.showMessageDialog(null, ed.deletarEmpresa(eb));
        }
        
        
        Conexao.fecharConexao(con);
        
        limpaCampos();
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        txtCodigo.setText("");
        txtNome.setText("");
        txtCnpj.setText("");
        txtRazao.setText("");
        
        /*DefaultTableModel tbm = (DefaultTableModel) tblClinicas.getModel();
        
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }*/
        
        this.btnPesquisaActionPerformed(evt);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        Connection con = Conexao.abrirConexao();
        
        EmpresaDAO ed = new EmpresaDAO(con);
        
        List<EmpresaBean> listaEmpresa = new ArrayList<EmpresaBean>();
        
        listaEmpresa = ed.listaTodos();
        
        DefaultTableModel tbm = (DefaultTableModel) tblClinicas.getModel();
        
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }
        
        int i = 0;
        
        for (EmpresaBean eb : listaEmpresa) {
            tbm.addRow(new String[1]);
            
            tblClinicas.setValueAt(eb.getCodigo(), i, 0);
            tblClinicas.setValueAt(eb.getNome(), i, 1);
            
            
            i++;
        }
        
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
         Connection con = Conexao.abrirConexao();
         String sql = "select * from tbempresas";
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.first();
            
            txtCodigo.setText(String.valueOf(rs.getInt("codigo")));
            txtNome.setText(rs.getString("nomeEmpresa"));
            txtCnpj.setText(rs.getString("cnpj"));
            txtRazao.setText(rs.getString("razaoSocial"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados");
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        Connection con = Conexao.abrirConexao();
        String sql = "select * from tbempresas";
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.last();
            
            txtCodigo.setText(String.valueOf(rs.getInt("codigo")));
            txtNome.setText(rs.getString("nomeEmpresa"));
            txtCnpj.setText(rs.getString("cnpj"));
            txtRazao.setText(rs.getString("razaoSocial"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados");
        }
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_btnFinalActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        Connection con = Conexao.abrirConexao();
        String sql = "select * from tbempresas";
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.previous();
            
            txtCodigo.setText(String.valueOf(rs.getInt("codigo")));
            txtNome.setText(rs.getString("nomeEmpresa"));
            txtCnpj.setText(rs.getString("cnpj"));
            txtRazao.setText(rs.getString("razaoSocial"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados");
        }
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        Connection con = Conexao.abrirConexao();
         String sql = "select * from tbempresas";
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            txtCodigo.setText(String.valueOf(rs.getInt("codigo")));
            txtNome.setText(rs.getString("nomeEmpresa"));
            txtCnpj.setText(rs.getString("cnpj"));
            txtRazao.setText(rs.getString("razaoSocial"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados");
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void tblClinicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClinicasMouseClicked
        Connection con = Conexao.abrirConexao();
        String sql = "select * from tbempresas where codigo = ?";
        
        Integer linha = tblClinicas.getSelectedRow();
        int codigo = (int) tblClinicas.getValueAt(linha, 0);
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            txtCodigo.setText(String.valueOf(rs.getInt("codigo")));
            txtNome.setText(rs.getString("nomeEmpresa"));
            txtCnpj.setText(rs.getString("cnpj"));
            txtRazao.setText(rs.getString("razaoSocial"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados");
        }
    }//GEN-LAST:event_tblClinicasMouseClicked

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
            java.util.logging.Logger.getLogger(JFCad_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCad_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCad_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCad_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCad_Empresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnIserir;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnProximo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblCnpj1;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCodigo3;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRazao;
    private javax.swing.JTable tblClinicas;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo3;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRazao;
    // End of variables declaration//GEN-END:variables
}
