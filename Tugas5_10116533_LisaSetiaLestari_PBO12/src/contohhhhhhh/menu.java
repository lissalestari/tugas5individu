/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohhhhhhh;

import java.awt.PopupMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author Lisa Setia Lestari
 */
public class menu extends javax.swing.JFrame {

    private PopupMenu Choie;

    /**
     * Creates new form menu
     */
    public menu() {
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

        body = new javax.swing.JPanel();
        pilian = new javax.swing.JPanel();
        outbt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        kanan = new javax.swing.JPanel();
        homeePanel = new javax.swing.JPanel();
        proopanel = new javax.swing.JPanel();
        mnubutton = new javax.swing.JButton();
        homebbutton = new javax.swing.JButton();
        promobutton = new javax.swing.JButton();
        aboutbbutton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        menupan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(204, 0, 0));

        pilian.setBackground(new java.awt.Color(204, 0, 0));

        outbt.setText("out");
        outbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outbtActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\1_KULIAHKU\\SMTER 3\\PBO\\tugas2 YT\\image\\logo.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Menu");

        jScrollPane1.setToolTipText("");

        jList1.setBackground(new java.awt.Color(204, 0, 0));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 153, 0));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { ">> Hemat Setiap Hari", ">> Menu Andalan", ">> Minuman", ">> Happy Meal", ">> Mc Cafe", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout pilianLayout = new javax.swing.GroupLayout(pilian);
        pilian.setLayout(pilianLayout);
        pilianLayout.setHorizontalGroup(
            pilianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pilianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pilianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(outbt)
                    .addGroup(pilianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pilianLayout.setVerticalGroup(
            pilianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pilianLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outbt)
                .addGap(73, 73, 73))
        );

        kanan.setLayout(new java.awt.CardLayout());

        homeePanel.setBackground(new java.awt.Color(153, 102, 255));

        proopanel.setBackground(new java.awt.Color(255, 153, 0));

        mnubutton.setText("menu");
        mnubutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnubuttonActionPerformed(evt);
            }
        });

        homebbutton.setText("home");
        homebbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebbuttonActionPerformed(evt);
            }
        });

        promobutton.setText("promo");
        promobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promobuttonActionPerformed(evt);
            }
        });

        aboutbbutton.setText("about");
        aboutbbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutbbuttonActionPerformed(evt);
            }
        });

        jLabel15.setText("Promo Setiap Hari  ");

        jLabel16.setText("Nikmati momen berharga  mulai dari Rp 5ribuan. ");

        javax.swing.GroupLayout proopanelLayout = new javax.swing.GroupLayout(proopanel);
        proopanel.setLayout(proopanelLayout);
        proopanelLayout.setHorizontalGroup(
            proopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proopanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(proopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proopanelLayout.createSequentialGroup()
                        .addComponent(homebbutton)
                        .addGap(31, 31, 31)
                        .addComponent(mnubutton)
                        .addGap(32, 32, 32)
                        .addComponent(promobutton)
                        .addGap(29, 29, 29)
                        .addComponent(aboutbbutton))
                    .addGroup(proopanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(proopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        proopanelLayout.setVerticalGroup(
            proopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proopanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(proopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mnubutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(proopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(homebbutton)
                        .addComponent(promobutton)
                        .addComponent(aboutbbutton)))
                .addGap(44, 44, 44)
                .addGroup(proopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(proopanelLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)))
                .addGap(252, 252, 252))
        );

        javax.swing.GroupLayout homeePanelLayout = new javax.swing.GroupLayout(homeePanel);
        homeePanel.setLayout(homeePanelLayout);
        homeePanelLayout.setHorizontalGroup(
            homeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(proopanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homeePanelLayout.setVerticalGroup(
            homeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(proopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kanan.add(homeePanel, "card2");

        menupan.setBackground(new java.awt.Color(255, 153, 0));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MENU");

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\1_KULIAHKU\\SMTER 3\\PBO\\tugas2 YT\\image\\6.jpg")); // NOI18N

        jCheckBox1.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Rp 27000");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\1_KULIAHKU\\SMTER 3\\PBO\\tugas2 YT\\image\\8.jpg")); // NOI18N

        jCheckBox2.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Rp 31000");

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\1_KULIAHKU\\SMTER 3\\PBO\\tugas2 YT\\image\\9.jpg")); // NOI18N

        jCheckBox3.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Rp 19000");

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\1_KULIAHKU\\SMTER 3\\PBO\\tugas2 YT\\image\\10.jpg")); // NOI18N

        jCheckBox4.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Rp 17000");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\1_KULIAHKU\\SMTER 3\\PBO\\tugas2 YT\\image\\3.jpg")); // NOI18N

        jCheckBox5.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Rp 17000");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\1_KULIAHKU\\SMTER 3\\PBO\\tugas2 YT\\image\\5s.jpg")); // NOI18N

        jCheckBox6.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Rp 65000");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\1_KULIAHKU\\SMTER 3\\PBO\\tugas2 YT\\image\\13.jpg")); // NOI18N

        jCheckBox7.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("Rp 14000");

        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\1_KULIAHKU\\SMTER 3\\PBO\\tugas2 YT\\image\\7.jpg")); // NOI18N

        jCheckBox8.setBackground(new java.awt.Color(255, 153, 0));
        jCheckBox8.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Rp 16000");

        jButton1.setText("Choise");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menupanLayout = new javax.swing.GroupLayout(menupan);
        menupan.setLayout(menupanLayout);
        menupanLayout.setHorizontalGroup(
            menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menupanLayout.createSequentialGroup()
                        .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(menupanLayout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(148, 148, 148))
                            .addGroup(menupanLayout.createSequentialGroup()
                                .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(menupanLayout.createSequentialGroup()
                                        .addComponent(jCheckBox5)
                                        .addGap(27, 27, 27)
                                        .addComponent(jCheckBox8))
                                    .addGroup(menupanLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13))
                                    .addGroup(menupanLayout.createSequentialGroup()
                                        .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jCheckBox2)
                                            .addGroup(menupanLayout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel6)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)))
                                .addGap(45, 45, 45)))
                        .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jCheckBox3)
                            .addComponent(jLabel12)
                            .addComponent(jCheckBox7))
                        .addGap(38, 38, 38)
                        .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(menupanLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jButton1)))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        menupanLayout.setVerticalGroup(
            menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menupanLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(menupanLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)))
                .addGap(1, 1, 1)
                .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menupanLayout.createSequentialGroup()
                        .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4))
                        .addGap(29, 29, 29)
                        .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)))
                    .addGroup(menupanLayout.createSequentialGroup()
                        .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2))
                        .addGap(35, 35, 35)
                        .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))))
                .addGap(6, 6, 6)
                .addGroup(menupanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        kanan.add(menupan, "card3");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home >>    Menu >>   Hemat Setiap Hari >>");

        jTextField1.setText("Pencarian");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pilian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pilian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kanan, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebbuttonActionPerformed
        // TODO add your handling code here:
        
        //remove
            kanan.removeAll();
            kanan.repaint();
            kanan.revalidate();
        //add
            kanan.add(homeePanel);
            kanan.repaint();
            kanan.revalidate();
    }//GEN-LAST:event_homebbuttonActionPerformed

    private void mnubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnubuttonActionPerformed
        // TODO add your handling code here:
        
        //remove
            kanan.removeAll();
            kanan.repaint();
            kanan.revalidate();
        //add
            kanan.add(menupan);
            kanan.repaint();
            kanan.revalidate();
    }//GEN-LAST:event_mnubuttonActionPerformed

    private void promobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promobuttonActionPerformed

        // TODO add your handling code here:
        
        //remove
            kanan.removeAll();
            kanan.repaint();
            kanan.revalidate();
        //add
            kanan.add(proopanel);
            kanan.repaint();
            kanan.revalidate();
    }//GEN-LAST:event_promobuttonActionPerformed

    private void aboutbbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutbbuttonActionPerformed
        // TODO add your handling code here:
        aout n = new aout();
        n.setVisible(true);
    }//GEN-LAST:event_aboutbbuttonActionPerformed

    private void outbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outbtActionPerformed
        // TODO add your handling code here:
        int keluar = JOptionPane.YES_NO_OPTION;
        int maka = JOptionPane.showConfirmDialog(this, "kau mau keluar dari sini beneran ?", "pergi kau", keluar);
        
        if (maka==0) {
            login n =  new login();
            n.setVisible(true);
        } else {
        }
    }//GEN-LAST:event_outbtActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
        //remove
            kanan.removeAll();
            kanan.repaint();
            kanan.revalidate();
        //add
            kanan.add (Choie);
            kanan.repaint();
            kanan.revalidate();
            
             menu n = new menu();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutbbutton;
    private javax.swing.JPanel body;
    private javax.swing.JButton homebbutton;
    private javax.swing.JPanel homeePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
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
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel kanan;
    private javax.swing.JPanel menupan;
    private javax.swing.JButton mnubutton;
    private javax.swing.JButton outbt;
    private javax.swing.JPanel pilian;
    private javax.swing.JButton promobutton;
    private javax.swing.JPanel proopanel;
    // End of variables declaration//GEN-END:variables
}