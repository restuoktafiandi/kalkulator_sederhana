/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kalkulator;

/**
 *
 * @Restu
 */
public class Kalkulator extends javax.swing.JFrame {
    String angka;
    String pilih;
    double bil1, bil2, jumlah;
           
    public Kalkulator() {
        initComponents();
        angka = "";
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lima = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        tiga = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        nol = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        display_hasil = new javax.swing.JTextField();
        tujuh = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        samadengan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        titik = new javax.swing.JButton();
        minus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        lima.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lima.setText("5");
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });

        enam.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        enam.setText("6");
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });

        kurang.setBackground(new java.awt.Color(204, 0, 0));
        kurang.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kurang.setForeground(new java.awt.Color(255, 255, 255));
        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        empat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        empat.setText("4");
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });

        tambah.setBackground(new java.awt.Color(204, 0, 0));
        tambah.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tambah.setForeground(new java.awt.Color(255, 255, 255));
        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        tiga.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tiga.setText("3");
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });

        satu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        satu.setText("1");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });

        dua.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dua.setText("2");
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });

        nol.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nol.setText("0");
        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(255, 153, 51));
        hapus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("C");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        bagi.setBackground(new java.awt.Color(204, 0, 0));
        bagi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bagi.setForeground(new java.awt.Color(255, 255, 255));
        bagi.setText("/");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });

        display_hasil.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        display_hasil.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display_hasil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        display_hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_hasilActionPerformed(evt);
            }
        });

        tujuh.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tujuh.setText("7");
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });

        delapan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        delapan.setText("8");
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });

        sembilan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sembilan.setText("9");
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });

        kali.setBackground(new java.awt.Color(204, 0, 0));
        kali.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        kali.setForeground(new java.awt.Color(255, 255, 255));
        kali.setText("x");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });

        samadengan.setBackground(new java.awt.Color(255, 153, 51));
        samadengan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        samadengan.setForeground(new java.awt.Color(255, 255, 255));
        samadengan.setText("=");
        samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samadenganActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Restu Oktafiandi");

        titik.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titik.setText(".");
        titik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titikActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(204, 0, 0));
        minus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        minus.setForeground(new java.awt.Color(255, 255, 255));
        minus.setText("-/+");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(delapan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(empat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(dua, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(tiga, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lima, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(enam, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(nol, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(samadengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addComponent(display_hasil, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(display_hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delapan, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empat, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lima, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enam, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dua, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiga, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nol, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
        angka += "2";
        display_hasil.setText(angka);
    }//GEN-LAST:event_duaActionPerformed

    private void nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolActionPerformed
        angka += "0";
        display_hasil.setText(angka);
    }//GEN-LAST:event_nolActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        angka += "1";
        display_hasil.setText(angka);
    }//GEN-LAST:event_satuActionPerformed

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaActionPerformed
        angka += "3";
        display_hasil.setText(angka);
    }//GEN-LAST:event_tigaActionPerformed

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
        angka += "4";
        display_hasil.setText(angka);
    }//GEN-LAST:event_empatActionPerformed

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
        angka += "5";
        display_hasil.setText(angka);
    }//GEN-LAST:event_limaActionPerformed

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamActionPerformed
        angka += "6";
        display_hasil.setText(angka);
    }//GEN-LAST:event_enamActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
        angka += "7";
        display_hasil.setText(angka);
    }//GEN-LAST:event_tujuhActionPerformed

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanActionPerformed
        angka += "8";
        display_hasil.setText(angka);
    }//GEN-LAST:event_delapanActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
        angka += "9";
        display_hasil.setText(angka);
    }//GEN-LAST:event_sembilanActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        bil1 = Double.parseDouble(angka);
        display_hasil.setText("+");
        angka = "";
        pilih = "tambah";
    }//GEN-LAST:event_tambahActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        bil1 = Double.parseDouble(angka);
        display_hasil.setText("-");
        angka = "";
        pilih = "kurang";
    }//GEN-LAST:event_kurangActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        bil1 = Double.parseDouble(angka);
        display_hasil.setText("x");
        angka = "";
        pilih = "kali";
    }//GEN-LAST:event_kaliActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        bil1 = Double.parseDouble(angka);
        display_hasil.setText("/");
        angka = "";
        pilih = "bagi";
    }//GEN-LAST:event_bagiActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        display_hasil.setText("");
        angka = "";
    }//GEN-LAST:event_hapusActionPerformed

    private void samadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samadenganActionPerformed
        switch(pilih){
            case "tambah":
                bil2 = Double.parseDouble(angka);
                jumlah = bil1 + bil2;
                angka = Double.toString(jumlah);
                display_hasil.setText(angka);
                break;
            case "kurang":
                bil2 = Double.parseDouble(angka);            
                jumlah = bil1 - bil2;
                angka = Double.toString(jumlah);
                display_hasil.setText(angka);
                break;
            case "kali":
                bil2 = Double.parseDouble(angka);
                jumlah = bil1 * bil2;
                angka = Double.toString(jumlah);
                display_hasil.setText(angka);
                break;
            case "bagi":
                bil2 = Double.parseDouble(angka);
                jumlah = bil1 / bil2;
                angka = Double.toString(jumlah);
                display_hasil.setText(angka);
                break;    
        }
    }//GEN-LAST:event_samadenganActionPerformed

    private void titikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titikActionPerformed
        angka += ".";
        display_hasil.setText(angka);
    }//GEN-LAST:event_titikActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        angka += "-";
        display_hasil.setText(angka);
    }//GEN-LAST:event_minusActionPerformed

    private void display_hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_hasilActionPerformed
 
    }//GEN-LAST:event_display_hasilActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagi;
    private javax.swing.JButton delapan;
    private javax.swing.JTextField display_hasil;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JButton lima;
    private javax.swing.JButton minus;
    private javax.swing.JButton nol;
    private javax.swing.JButton samadengan;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tiga;
    private javax.swing.JButton titik;
    private javax.swing.JButton tujuh;
    // End of variables declaration//GEN-END:variables
}
