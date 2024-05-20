
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SOAP extends javax.swing.JFrame {
   double combo=0;
   double combo2=0;
   double combo3=0;
   double combo4=0;

    public SOAP() {
        initComponents();
      jComboBox1.addItem("0");
        jComboBox1.addItem("1");
        jComboBox1.addItem("2");
        jComboBox1.addItem("3");
        jComboBox1.addItem("4");
        jComboBox1.addItem("5");
        jComboBox1.addItem("6");
        jComboBox1.addItem("7");
        jComboBox1.addItem("8");
        jComboBox1.addItem("9");
        jComboBox1.addItem("10");
        jComboBox2.addItem("0");
        jComboBox2.addItem("1");
        jComboBox2.addItem("2");
        jComboBox2.addItem("3");
        jComboBox2.addItem("4");
        jComboBox2.addItem("5");
        jComboBox2.addItem("6");
        jComboBox2.addItem("7");
        jComboBox2.addItem("8");
        jComboBox2.addItem("9");
        jComboBox2.addItem("10");
        jComboBox3.addItem("0");
        jComboBox3.addItem("1");
        jComboBox3.addItem("2");
        jComboBox3.addItem("3");
        jComboBox3.addItem("4");
        jComboBox3.addItem("5");
        jComboBox3.addItem("6");
        jComboBox3.addItem("7");
        jComboBox3.addItem("8");
        jComboBox3.addItem("9");
        jComboBox3.addItem("10");
        jComboBox4.addItem("0");
        jComboBox4.addItem("1");
        jComboBox4.addItem("2");
        jComboBox4.addItem("3");
        jComboBox4.addItem("4");
        jComboBox4.addItem("5");
        jComboBox4.addItem("6");
        jComboBox4.addItem("7");
        jComboBox4.addItem("8");
        jComboBox4.addItem("9");
        jComboBox4.addItem("10"); 
  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jLabel1.setText("SOAP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 780, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel2.setText("ACNE SOAP:R40");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acne soap.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 130, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("It treats and prevents problems\nlike Acne.\nIt provides nourishment and\nconditioning to the skin.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, 110));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("ANTI-FUNGAL SOAP:R50");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anti fungal.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 100, 110));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("It kills and prevents the growth of fungus.\nThis relieves the symtoms\ncaused by the infection.");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 250, 110));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setText("Select the number of Ance soap you want:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel7.setText("Select the number of Anti-fungal soap you want:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, 20));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 70, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Amount:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Amount:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 260, 60, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel10.setText("Circulation Soap:R70");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Circulation.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 120, 80));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Great for those suffering from fluid retention\nassociated with age and varicose veins. Leaves\nskin feeling hydrated and smooth.");
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 290, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel12.setText("Select the number of Circulation Soap you want:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Amount:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 70, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel14.setText("Healing Soap:R50");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healing.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 120, 80));

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("It enhances new cell growth\nand wound healing. Specifically\ndesigned to get rid of those \nirritation bumps.");
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 230, 80));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel16.setText("Select the number of Healing Soap you want:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, -1, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Amount:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, -1, 30));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, 70, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("GRAND TOTAL:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, -1));

        jButton7.setBackground(new java.awt.Color(0, 153, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("DONE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 80, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 220, -1, -1));

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GREEN2.jpg"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1020, 530));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 70, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 80, 20));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 80, -1));

        setSize(new java.awt.Dimension(1038, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         dispose();
        Ourproducts soap=new Ourproducts();
      soap.jTextField7.setText(jTextField9.getText());
      soap.jTextField2.setText(jTextField1.getText());
      soap.jTextField6.setText(jTextField2.getText());
      soap.jTextField4.setText(jTextField5.getText());
       soap.jTextField5.setText(jTextField7.getText());
      soap.setVisible(true);
     
      
        soap.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       jTextField3.setText("0");
        jTextField4.setText("0");
         
          jTextField6.setText("0");
          
            jTextField8.setText("0");
             jTextField9.setText("0");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      if(jComboBox1.getSelectedItem().equals("1")){
        jTextField3.setText("40");
        
        combo=40;
    }
    else if(jComboBox1.getSelectedItem().equals("2")){
        jTextField3.setText("80");
     
        combo=80;
    }
    else if(jComboBox1.getSelectedItem().equals("3")){
        jTextField3.setText("120");
      
        combo=120;
    }
    else if(jComboBox1.getSelectedItem().equals("4")){
        jTextField3.setText("160");
      
        combo=160;
    }
     else if(jComboBox1.getSelectedItem().equals("5")){
        jTextField3.setText("200");
       
        combo=200;
    }
     else if(jComboBox1.getSelectedItem().equals("6")){
        jTextField3.setText("240");
      
        combo=240;
    }
     else if(jComboBox1.getSelectedItem().equals("7")){
        jTextField3.setText("280");
      
        combo=280;
    }
     else if(jComboBox1.getSelectedItem().equals("8")){
        jTextField3.setText("320");
       
        combo=320;
    }
     else if(jComboBox1.getSelectedItem().equals("9")){
        jTextField3.setText("360");
       
        combo=360;
    }
     else if(jComboBox1.getSelectedItem().equals("10")){
        jTextField3.setText("400");
     
        combo=400;
    }
       else if(jComboBox1.getSelectedItem().equals("0")){
        jTextField3.setText("0");
     
        combo=0;
    }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    if(jComboBox2.getSelectedItem().equals("1")){
        jTextField4.setText("50");
      
        combo2=50;
    }
  else if(jComboBox2.getSelectedItem().equals("2")){
        jTextField4.setText("100");
        
        combo2=100;
    }
    else if(jComboBox2.getSelectedItem().equals("3")){
        jTextField4.setText("150");
       
        combo2=150;
    }
    else if(jComboBox2.getSelectedItem().equals("4")){
        jTextField4.setText("200");
      
        combo=200;
    }
     else if(jComboBox2.getSelectedItem().equals("5")){
        jTextField4.setText("250");
      
        combo2=250;
    }
     else if(jComboBox2.getSelectedItem().equals("6")){
        jTextField4.setText("300");
        
        combo2=300;
    }
     else if(jComboBox2.getSelectedItem().equals("7")){
        jTextField4.setText("350");
       
        combo2=350;
    }
     else if(jComboBox2.getSelectedItem().equals("8")){
        jTextField4.setText("400");
       
        combo2=400;
    }
     else if(jComboBox2.getSelectedItem().equals("9")){
        jTextField4.setText("450");
       
        combo2=450;
    }
     else if(jComboBox2.getSelectedItem().equals("10")){
        jTextField4.setText("500");
       
        combo2=500;
    }
       else if(jComboBox2.getSelectedItem().equals("0")){
        jTextField4.setText("0");
     
        combo2=0;
    }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
     if(jComboBox3.getSelectedItem().equals("1")){
        jTextField6.setText("70");
       
        combo3=70;
    } 
         else if(jComboBox3.getSelectedItem().equals("2")){
        jTextField6.setText("140");
        
        combo3=140;
    }
    else if(jComboBox3.getSelectedItem().equals("3")){
        jTextField6.setText("210");
       
        combo3=210;
    }
    else if(jComboBox3.getSelectedItem().equals("4")){
        jTextField6.setText("280");
      
        combo3=280;
    }
     else if(jComboBox3.getSelectedItem().equals("5")){
        jTextField6.setText("350");
     
        combo3=350;
    }
     else if(jComboBox3.getSelectedItem().equals("6")){
        jTextField6.setText("420");
       
        combo3=420;
    }
     else if(jComboBox3.getSelectedItem().equals("7")){
        jTextField6.setText("490");
       
        combo3=490;
    }
     else if(jComboBox3.getSelectedItem().equals("8")){
        jTextField6.setText("560");
       
        combo3=560;
    }
     else if(jComboBox3.getSelectedItem().equals("9")){
        jTextField6.setText("630");
       
        combo3=630;
    }
     else if(jComboBox3.getSelectedItem().equals("10")){
        jTextField6.setText("700");
     
        combo3=700;
    }
             else if(jComboBox3.getSelectedItem().equals("0")){
        jTextField6.setText("0");
     
        combo3=0;
    }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        if(jComboBox4.getSelectedItem().equals("1")){
        jTextField8.setText("50");
        
        combo4=50;
    } 
        else if(jComboBox4.getSelectedItem().equals("2")){
        jTextField8.setText("100");
        
        combo4=100;
    }
    else if(jComboBox4.getSelectedItem().equals("3")){
        jTextField8.setText("150");
       
        combo4=150;
    }
    else if(jComboBox4.getSelectedItem().equals("4")){
        jTextField8.setText("200");
      
        combo4=200;
    }
     else if(jComboBox4.getSelectedItem().equals("5")){
        jTextField8.setText("250");
       
        combo4=250;
    }
     else if(jComboBox4.getSelectedItem().equals("6")){
        jTextField8.setText("300");
        
        combo4=300;
    }
     else if(jComboBox4.getSelectedItem().equals("7")){
        jTextField8.setText("350");
       
        combo4=350;
    }
     else if(jComboBox4.getSelectedItem().equals("8")){
        jTextField8.setText("400");
       
        combo4=400;
    }
     else if(jComboBox4.getSelectedItem().equals("9")){
        jTextField8.setText("450");
       
        combo4=450;
    }
     else if(jComboBox4.getSelectedItem().equals("10")){
        jTextField8.setText("500");
       
        combo4=500;
    }
           else if(jComboBox4.getSelectedItem().equals("0")){
        jTextField8.setText("0");
     
        combo4=0;
    }     
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         double total=0;
     total = combo+combo2+combo3+combo4;
   
      jTextField9.setText(Double.toString(total));
    String AcneSoap = jTextField3.getText();
    String Antifungal = jTextField4.getText();
    String Circulationsoap = jTextField6.getText();
    String Healingsoap = jTextField8.getText();
    if(AcneSoap.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Fields cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
 
        else{
            soap( AcneSoap,Antifungal,Circulationsoap,Healingsoap);
        }  
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(SOAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SOAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SOAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SOAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SOAP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void soap(String AcneSoap, String Antifungal, String Circulationsoap, String Healingsoap) {
 Connection dbcon = MyConnection.mycon();
        if(dbcon != null){
        try {
            PreparedStatement st = (PreparedStatement)
                    dbcon.prepareStatement("INSERT INTO `soap` (Asoap, Afungal, Csoap, Hsoap) VALUES (?,?,?,?)");

            st.setString(1, AcneSoap);
            st.setString(2, Antifungal);
            st.setString(3, Circulationsoap);
              st.setString(4,Healingsoap);
          
            int res = st.executeUpdate();
         
         
            
       JOptionPane.showMessageDialog(this, "Products have been saved.", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
         
        catch (SQLException ex) {
          java.util.logging.Logger.getLogger(regist.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
    else{
            System.out.println("The connection is not available");
        }
        
    }
}
