/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.exemploarquivo;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 0022216
 */
public class TelaDesenhosAtividade extends javax.swing.JInternalFrame {
    
    //Thread
    public static class desenha implements Runnable{
        @Override
        public void run(){
            int r,g,b;
            double x,y,raio;
            for (int i = 0; i < 50000; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    System.out.println("Erro");
                }
                
                r = (int) (Math.random()*255);
                g = (int) (Math.random()*255);
                b = (int) (Math.random()*255);
                //x = 0.5;//faz sempre no meio
                //y = 0.5;//faz sempre no meio
                x = (double) (Math.random()*0.9);
                y = (double) (Math.random()*0.9);
                raio = (double) (Math.random()*0.2);
                StdDraw.setPenColor(new Color(r,g,b));
                StdDraw.filledSquare(x, y, raio);
            }
        }
    }
    
    /**
     * Creates new form TelaDesenhos
     */
    public TelaDesenhosAtividade() {
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

        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jButton9.setText("Quadrados");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Quadrados Random");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Brasil");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton1.setText("Arco Íris");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int r,g,b;

        double x,y;

        for (int i = 0; i < 10; i++) {

            r =(int)(Math.random()*255);

            g =(int)(Math.random()*255);

            b =(int)(Math.random()*255);

            x=(i+1)/10.0;

            y=(i+1)/10.0;

            StdDraw.setPenColor(new Color(r,g,b));

            StdDraw.filledSquare(x,y, .2);

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        int r,g,b;

        double x,y,s;

        for (int i = 0; i < 10; i++) {

            r =(int)(Math.random()*255);

            g =(int)(Math.random()*255);

            b =(int)(Math.random()*255);

            x=(double)(Math.random()*.9);

            y=(double)(Math.random()*.9);

            s=(double)(Math.random()*.3);

            StdDraw.setPenColor(new Color(r,g,b));

            StdDraw.filledSquare(x,y,s);

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        StdDraw.setPenColor(new Color(0,153,0));

        double[] x1 = { .1, .1, .9, .9};

        double[] y1 = { .3, .7, .7, .3};

        StdDraw.filledPolygon(x1, y1);


        StdDraw.setPenColor(Color.YELLOW);

        double[] x = { .1, .5, .9, .5};

        double[] y = { .5, .7, .5, .3};

        StdDraw.filledPolygon(x, y);


        StdDraw.setPenColor(Color.BLUE);

        StdDraw.filledCircle(.5, .5, .17);


        StdDraw.setPenRadius(.02);

        StdDraw.setPenColor(Color.WHITE);

        StdDraw.arc(.42, .06, .5, 61, 98);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //vermelho

        StdDraw.setPenColor(StdDraw.RED);

        StdDraw.setPenRadius(.05);

        StdDraw.arc(.5, .3, .37, 0, 180);


        //laranja

        StdDraw.setPenColor(StdDraw.ORANGE);

        StdDraw.setPenRadius(.05);

        StdDraw.arc(.5, .3, .35, 0, 180);


        //amarelo

        StdDraw.setPenColor(StdDraw.YELLOW);

        StdDraw.setPenRadius(.05);

        StdDraw.arc(.5, .3, .33, 0, 180);


        //verde

        StdDraw.setPenColor(StdDraw.GREEN);

        StdDraw.setPenRadius(.05);

        StdDraw.arc(.5, .3, .31, 0, 180);


        //azul

        StdDraw.setPenColor(Color.BLUE);

        StdDraw.setPenRadius(.05);

        StdDraw.arc(.5, .3, .29, 0, 180);


        //anil

        StdDraw.setPenColor(new Color(51,51,255));

        StdDraw.setPenRadius(.05);

        StdDraw.arc(.5, .3, .27, 0, 180);


        //violeta

        StdDraw.setPenColor(new Color(204,51,255));

        StdDraw.setPenRadius(.05);

        StdDraw.arc(.5, .3, .25, 0, 180);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
