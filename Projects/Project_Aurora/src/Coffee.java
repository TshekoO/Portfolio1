
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
public class Coffee extends javax.swing.JFrame {
  double combo=0;
   double combo2=0;
   double combo3=0;
  
    public Coffee() {
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
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setText("COFFEE & TEA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 810, 80));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel2.setText("COFFEE PODS:R120");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pods.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 90, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Helps with weight loss\nas it does not contain\nadded sugars or fats\nthat can cotribute to \nweights.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 240, 120));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel4.setText("ACHILLEA TEA BAGS:R150");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Achillea.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 100, 110));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Can enhance wound healing as well\nas alleviate digestive issues and may\nreduce sympotms of depression\nand anxiety.");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 240, 110));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setText("Select the number of Coffee Pods you want:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel7.setText("Select the number of Achillea Tea you want:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Amount:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, 20));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 70, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 300, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Amount:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel10.setText("COFFEE BEANS:R110");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plant.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 110, 110));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("May lower risk of all-cause \nMorality and also reduce risk\nof Parkinsons and Depression.");
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 230, 110));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel12.setText("Select the amount of Coffee Beans you want:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Amount:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, 30));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, 70, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DONE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 100, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("GRAND TOTAL:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 20));

        jButton6.setBackground(new java.awt.Color(0, 153, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 80, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, -1, -1));

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GREEN2.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 540));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 80, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 80, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 70, 20));

        setSize(new java.awt.Dimension(1018, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     dispose();
   
      
        Ourproducts fit=new Ourproducts();
      fit.jTextField6.setText(jTextField7.getText());
      fit.jTextField7.setText(jTextField1.getText());
      fit.jTextField2.setText(jTextField2.getText());
      fit.jTextField4.setText(jTextField5.getText());
      fit.jTextField5.setText(jTextField8.getText());
      fit.setVisible(true);
        fit.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
     
       jTextField3.setText("0");
        jTextField4.setText("0");
        
          jTextField6.setText("0");
           jTextField7.setText("0");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       double total=0;
     total = combo+combo2+combo3;
      jTextField7.setText(Double.toString(total));
      String Coffeepods = jTextField3.getText();
    String Achillea = jTextField4.getText();
    String Coffeebeans = jTextField6.getText();
    
     if(Achillea.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Fields cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
 
        else{
            coffee( Coffeepods,Achillea,Coffeebeans);
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    if(jComboBox1.getSelectedItem().equals("1")){
        jTextField3.setText("120");
        
        combo=120;
    }
    else if(jComboBox1.getSelectedItem().equals("2")){
        jTextField3.setText("240");
     
        combo=240;
    }
    else if(jComboBox1.getSelectedItem().equals("3")){
        jTextField3.setText("360");
      
        combo=360;
    }
    else if(jComboBox1.getSelectedItem().equals("4")){
        jTextField3.setText("480");
      
        combo=480;
    }
     else if(jComboBox1.getSelectedItem().equals("5")){
        jTextField3.setText("600");
       
        combo=600;
    }
     else if(jComboBox1.getSelectedItem().equals("6")){
        jTextField3.setText("720");
      
        combo=720;
    }
     else if(jComboBox1.getSelectedItem().equals("7")){
        jTextField3.setText("840");
      
        combo=840;
    }
     else if(jComboBox1.getSelectedItem().equals("8")){
        jTextField3.setText("960");
       
        combo=960;
    }
     else if(jComboBox1.getSelectedItem().equals("9")){
        jTextField3.setText("1080");
       
        combo=1080;
    }
     else if(jComboBox1.getSelectedItem().equals("10")){
        jTextField3.setText("1200");
     
        combo=1200;
    }
       else if(jComboBox1.getSelectedItem().equals("0")){
        jTextField3.setText("0");
     
        combo=0;
    }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    if(jComboBox2.getSelectedItem().equals("1")){
        jTextField4.setText("150");
      
        combo2=150;
    }
  else if(jComboBox2.getSelectedItem().equals("2")){
        jTextField4.setText("300");
        
        combo2=300;
    }
    else if(jComboBox2.getSelectedItem().equals("3")){
        jTextField4.setText("450");
       
        combo2=450;
    }
    else if(jComboBox2.getSelectedItem().equals("4")){
        jTextField4.setText("600");
      
        combo=600;
    }
     else if(jComboBox2.getSelectedItem().equals("5")){
        jTextField4.setText("750");
      
        combo2=750;
    }
     else if(jComboBox2.getSelectedItem().equals("6")){
        jTextField4.setText("900");
        
        combo2=900;
    }
     else if(jComboBox2.getSelectedItem().equals("7")){
        jTextField4.setText("1050");
       
        combo2=1050;
    }
     else if(jComboBox2.getSelectedItem().equals("8")){
        jTextField4.setText("1200");
       
        combo2=1200;
    }
     else if(jComboBox2.getSelectedItem().equals("9")){
        jTextField4.setText("1350");
       
        combo2=1350;
    }
     else if(jComboBox2.getSelectedItem().equals("10")){
        jTextField4.setText("1500");
       
        combo2=1500;
    }
       else if(jComboBox2.getSelectedItem().equals("0")){
        jTextField4.setText("0");
     
        combo2=0;
    }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
       if(jComboBox3.getSelectedItem().equals("1")){
        jTextField6.setText("110");
       
        combo3=110;
    } 
         else if(jComboBox3.getSelectedItem().equals("2")){
        jTextField6.setText("220");
        
        combo3=220;
    }
    else if(jComboBox3.getSelectedItem().equals("3")){
        jTextField6.setText("330");
       
        combo3=330;
    }
    else if(jComboBox3.getSelectedItem().equals("4")){
        jTextField6.setText("440");
      
        combo3=440;
    }
     else if(jComboBox3.getSelectedItem().equals("5")){
        jTextField6.setText("550");
     
        combo3=550;
    }
     else if(jComboBox3.getSelectedItem().equals("6")){
        jTextField6.setText("660");
       
        combo3=660;
    }
     else if(jComboBox3.getSelectedItem().equals("7")){
        jTextField6.setText("770");
       
        combo3=770;
    }
     else if(jComboBox3.getSelectedItem().equals("8")){
        jTextField6.setText("880");
       
        combo3=880;
    }
     else if(jComboBox3.getSelectedItem().equals("9")){
        jTextField6.setText("990");
       
        combo3=990;
    }
     else if(jComboBox3.getSelectedItem().equals("10")){
        jTextField6.setText("1100");
     
        combo3=1100;
    }
             else if(jComboBox3.getSelectedItem().equals("0")){
        jTextField6.setText("0");
     
        combo3=0;
    }
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coffee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    private void coffee(String Coffeepods, String Achillea, String Coffeebeans) {
Connection dbcon = MyConnection.mycon();
        if(dbcon != null){
        try {
            PreparedStatement st = (PreparedStatement)
                    dbcon.prepareStatement("INSERT INTO `coffee` (Pods, Achillea, Beans) VALUES (?,?,?)");

            st.setString(1, Coffeepods);
            st.setString(2, Achillea);
            st.setString(3, Coffeebeans);
             
          
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
