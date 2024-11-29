/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.exemploarquivo;

import static com.mycompany.exemploarquivo.Aula3.troca;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 0022216 
 */
public class TelaAula4_Separa_Conta_Cript extends javax.swing.JInternalFrame {

    /**
     * Creates new form Aula4SeparaConta
     */
    public TelaAula4_Separa_Conta_Cript() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMensagem = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnExiste = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        txtQuantToca = new javax.swing.JTextField();
        lblExiste = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFrase = new javax.swing.JTextField();
        btnContar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMaior = new javax.swing.JTextField();
        lblResposta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Como separar as palavras de uma frase? ");

        jTextField1.setText("Eu vou para Feevale");

        jButton1.setText("separar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Como saber se uma palavra existe? ");

        txtMensagem.setText("BSSPA");

        jButton2.setText("Troca");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnExiste.setText("Existe ?");
        btnExiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExisteActionPerformed(evt);
            }
        });

        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        txtQuantToca.setText("25");

        jLabel3.setText("Como Contar");

        txtFrase.setText("Z DRBNKZ D FQZMCD");

        btnContar.setText("contar e descriptografar");
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setText("Print Exemplo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("BackSpace");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setText("Como achar o maior contador? ");

        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(30);
        jTextArea2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(51, 255, 0));
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(235, 235, 235))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(34, 34, 34)
                                .addComponent(jTextField2))
                            .addComponent(jLabel1)
                            .addComponent(jTextField1)
                            .addComponent(txtMensagem)
                            .addComponent(lblExiste, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(btnExiste))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantToca, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnContar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addComponent(txtMaior, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFrase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(txtQuantToca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExiste)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addComponent(lblExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(jScrollPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String[] ps;
        String texto;
        texto = jTextField1.getText();
        ps = texto.split(" ");
        
        int quant;
        quant = ps.length;
        jTextField2.setText(String.valueOf(quant));
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //letras permitidas
        Character[] associated = new Character[26];
        for (int i = 0; i<26;i++){
            associated[i]=(char)(i+65);
        }
        for (int i = 0; i < 26; i++) {
            System.out.println(associated[i]);
        }
    
        Character charPos;
        int pos=0;
        String result="";
        int key=Integer.parseInt(txtQuantToca.getText());
        String message = txtMensagem.getText();
        for (int i=0;i<message.length();i++){
            charPos=message.charAt(i);
            for (int j=0; j<associated.length;j++){
                //System.out.print(charPos+" ");
                //System.out.println(associated[j]);
                if(charPos.equals(associated[j])){
                    //System.out.print("=================");
                    pos=j+key;
                    if(pos>=26){
                        //System.out.println("k "+key);
                        //System.out.println("j "+j);
                        pos-=26;
                    }
                    result=result+associated[pos];
                }
            }
        }
        txtResultado.setText(result.toLowerCase());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnExisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExisteActionPerformed
        // TODO add your handling code here:
         try {
            String valor;
            FileReader reader = new FileReader("br-utf8.txt");
            BufferedReader leitor = new BufferedReader(reader);
		String busca = txtResultado.getText();
                lblExiste.setText("Não Existe"); 
                lblExiste.setForeground(Color.red);
                valor = leitor.readLine();
                while(valor!=null){
                    if(busca.equalsIgnoreCase(valor)){
                            System.out.println("Achou"); 
                            lblExiste.setText("Existe");
                            lblExiste.setForeground(new Color(0,224,51));
                            break;
                    }
                    valor = leitor.readLine();
                }         
        } catch (IOException ex) {
            System.out.println("Erro :"+ex.getMessage());
        }
    }//GEN-LAST:event_btnExisteActionPerformed

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        // TODO add your handling code here:
        //contadores
        int[] contadores = new int[26];
        String chavex;
        String[] palavras = txtFrase.getText().split(" ");
        
        for (int i = 1; i <= 26; i++) {
            for (int j = 0; j < palavras.length; j++) {
                chavex = troca(palavras[j],i);
                jTextArea1.append(chavex);
                jTextArea1.append(" chave "+i);
                jTextArea2.append(chavex);
                jTextArea1.append(" ");
                contadores[i-1] += conta(chavex);
            }
            jTextArea1.append("->"+contadores[i-1]);
            jTextArea1.append("\n");
            jTextArea2.append("\n");
        }
        //achar o maior
        int maior=0;
        int posicao=0;
        for (int i = 0; i < contadores.length; i++) {
            if(contadores[i]>maior){
                maior=contadores[i];
                posicao = i;
            }
        }
        System.out.println("Maior = "+maior);
        
        //descriptografar
        txtMaior.setText(String.valueOf(maior));
        String resposta="";
        for (int i = 0; i < palavras.length; i++) {
            resposta+=troca(palavras[i],posicao+1);
            resposta+=" ";
        }
        System.out.println(resposta);
        lblResposta.setText(resposta);
    }//GEN-LAST:event_btnContarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.out.print("1");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.out.println("\b");
    }//GEN-LAST:event_jButton4ActionPerformed

    public static int conta(String oque){
        int r=0;
        try {
            String valor;
            FileReader reader = new FileReader("br-utf8.txt");
            BufferedReader leitor = new BufferedReader(reader);
                valor = leitor.readLine();
                while(valor!=null){
                    if(oque.equalsIgnoreCase(valor)){
                        System.out.println("Achou"); 
                        r++;
                        break;
                    }
                    valor = leitor.readLine();
                }         
        } catch (IOException ex) {
            System.out.println("Erro :"+ex.getMessage());
        }
        return r;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContar;
    private javax.swing.JButton btnExiste;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblExiste;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JTextField txtFrase;
    private javax.swing.JTextField txtMaior;
    private javax.swing.JTextField txtMensagem;
    private javax.swing.JTextField txtQuantToca;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
