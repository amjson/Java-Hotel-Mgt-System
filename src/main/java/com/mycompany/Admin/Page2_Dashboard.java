/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Admin;

import com.mycompany.Database.AdminCredentials;
import com.mycompany.Database.AdminPageLogout;
import com.mycompany.Database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoeAlpha
 */
public class Page2_Dashboard extends javax.swing.JFrame implements Runnable {
    SimpleDateFormat timeFormat;// setting variable for time Format
    SimpleDateFormat dayFormat;// setting variable for day Format
    SimpleDateFormat dateFormat;// setting variable for date Format
    String time; // setting variable for current time
    String day; // setting variable for day
    String date; // setting variable for date
    
    
    /**
     * Creates new form Page2_Dashboard
     */
    public Page2_Dashboard() {
        initComponents();
        managers_count();
        totalRoom_count();
        roomBoocked_count();


        // center the form
        this.setLocationRelativeTo(this);
        
        Thread t = new Thread(this);
        t.start();
        
        // displaying users info
        sideBarFname.setText(AdminCredentials.fullname);
        sideBarOperator.setText(AdminCredentials.operator_id); 
        topBarRegNo.setText(AdminCredentials.serial_no);
        bodyOperatorId.setText(AdminCredentials.operator_id);
        bodyRegNo.setText(AdminCredentials.serial_no);
        bodyFname.setText("0"+AdminCredentials.fullname);
        bodyPhone.setText(AdminCredentials.phone);
        bodyEmail.setText(AdminCredentials.email);        
    }
    
    
    PreparedStatement sqlQueryCheck;
    PreparedStatement sqlQueryLogout;
    ResultSet res;
    Connection conn;
    
    // count all registered managers accounts
    private void managers_count() {
        try {
            conn = DBConnection.setConnection();
            sqlQueryCheck = conn.prepareStatement("select count(*) as managerCount from tbl_managers");
            res = sqlQueryCheck.executeQuery();
            
            while(res.next()) {
                int count = res.getInt("managerCount");
                
                managerCount.setText(String.valueOf(count));
            }
        } catch (Exception ex) {
            Logger.getLogger(Page2_Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // count all Rooms in the hotel
    private void totalRoom_count() {
        try {
            conn = DBConnection.setConnection();
            sqlQueryCheck = conn.prepareStatement("select count(*) as roomCount from tbl_rooms");
            res = sqlQueryCheck.executeQuery();
            
            while(res.next()) {
                int count = res.getInt("roomCount");
                
                roomCount.setText(String.valueOf(count));
            }
        } catch (Exception ex) {
            Logger.getLogger(Page2_Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // count all boocked rooms
    private void roomBoocked_count() {
        try {
            conn = DBConnection.setConnection();
            sqlQueryCheck = conn.prepareStatement("select count(*) as customerCount from tbl_customers");
            res = sqlQueryCheck.executeQuery();
            
            while(res.next()) {
                int count = res.getInt("customerCount");
                
                customerCount.setText(String.valueOf(count));
            }
        } catch (Exception ex) {
            Logger.getLogger(Page2_Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        topBarRegNo = new javax.swing.JLabel();
        txtDay = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        bodyRegNo = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        bodyFname = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        bodyEmail = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        bodyPhone = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bodyOperatorId = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        customerCount = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        managerCount = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        roomCount = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        sideBarFname = new javax.swing.JLabel();
        sideBarOperator = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        GoToLogout = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        goToDashbord = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        goToManagers = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        goToSettings = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        goToRooms = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        goToCustomers = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        goToReport = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(java.awt.Color.white);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLabel17.setText("The Dashboard");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 30));

        topBarRegNo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jPanel10.add(topBarRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 60, 120, 17));

        txtDay.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txtDay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel10.add(txtDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 30, 100, 17));

        jLabel24.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel24.setForeground(java.awt.SystemColor.windowBorder);
        jLabel24.setText("Serial No:");
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtTime.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jPanel10.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 90, 17));

        txtDate.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel10.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 100, 17));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1, 648, 90));

        jPanel11.setBackground(java.awt.Color.white);
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setOpaque(false);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(java.awt.SystemColor.windowBorder);
        jLabel18.setText("Serial No:");

        bodyRegNo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(java.awt.SystemColor.windowBorder);
        jLabel20.setText("Full Name:");

        bodyFname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(java.awt.SystemColor.windowBorder);
        jLabel21.setText("Email Address:");

        bodyEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(java.awt.SystemColor.windowBorder);
        jLabel22.setText("Phone No:");

        bodyPhone.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bodyRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bodyFname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bodyPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bodyEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bodyRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bodyFname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bodyPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bodyEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 8, 370, 190));

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoBig.png"))); // NOI18N
        jPanel13.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 130, 130));

        bodyOperatorId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        bodyOperatorId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(bodyOperatorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 150, 152, 20));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(java.awt.SystemColor.windowBorder);
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Operator ID :");
        jPanel13.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 130, 150, 20));

        jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 8, 155, 190));

        jLabel3.setBackground(java.awt.Color.lightGray);
        jLabel3.setText("jLabel3");
        jLabel3.setOpaque(true);
        jPanel11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 13, 1, 180));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 590, 210));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setText("General  Overview");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, 30));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customerCount.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        customerCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel20.add(customerCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, 55, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setForeground(java.awt.SystemColor.windowBorder);
        jLabel28.setText("Booked");
        jPanel20.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 80, 20));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel31.setText("Rooms");
        jPanel20.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 80, 16));

        jPanel1.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 160, 60));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        managerCount.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        managerCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel21.add(managerCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, 55, 30));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setForeground(java.awt.SystemColor.windowBorder);
        jLabel32.setText("Manager");
        jPanel21.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 80, 20));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel33.setText("Accounts");
        jPanel21.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 80, 16));

        jPanel1.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 160, 60));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roomCount.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        roomCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel23.add(roomCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, 55, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(java.awt.SystemColor.windowBorder);
        jLabel36.setText("Total");
        jPanel23.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 80, 20));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel37.setText("Rooms");
        jPanel23.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 80, 16));

        jPanel1.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 160, 60));

        jPanel2.setBackground(java.awt.SystemColor.textHighlight);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Greens");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 0, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Milimani");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 170, -1));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBarFname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sideBarFname.setForeground(java.awt.Color.white);
        jPanel4.add(sideBarFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1, 130, 20));

        sideBarOperator.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sideBarOperator.setForeground(java.awt.Color.white);
        jPanel4.add(sideBarOperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 21, 130, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/holder1.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 40, 40));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setOpaque(true);
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 50, 170, 1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 60));

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout.png"))); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 30, 25));

        GoToLogout.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        GoToLogout.setForeground(java.awt.Color.white);
        GoToLogout.setText("Logout");
        GoToLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        GoToLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GoToLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToLogoutMouseClicked(evt);
            }
        });
        jPanel5.add(GoToLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 2, -1, 25));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 150, 30));

        jPanel6.setBackground(java.awt.Color.white);
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Manager.png"))); // NOI18N
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 30, 25));

        goToDashbord.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        goToDashbord.setForeground(new java.awt.Color(255, 255, 255));
        goToDashbord.setText("Dashboard");
        goToDashbord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToDashbord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToDashbordMouseClicked(evt);
            }
        });
        jPanel6.add(goToDashbord, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, 30));

        jPanel7.setBackground(java.awt.Color.white);
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lecturer.png"))); // NOI18N
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 30, 25));

        goToManagers.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        goToManagers.setForeground(new java.awt.Color(255, 255, 255));
        goToManagers.setText("Managers");
        goToManagers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToManagers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToManagersMouseClicked(evt);
            }
        });
        jPanel7.add(goToManagers, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, -1, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, 30));

        jPanel16.setBackground(java.awt.Color.white);
        jPanel16.setOpaque(false);
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings.png"))); // NOI18N
        jPanel16.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 30, 25));

        goToSettings.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        goToSettings.setForeground(new java.awt.Color(255, 255, 255));
        goToSettings.setText("Settings");
        goToSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToSettingsMouseClicked(evt);
            }
        });
        jPanel16.add(goToSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, -1, -1));

        jPanel2.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 150, 30));

        jPanel17.setBackground(java.awt.Color.white);
        jPanel17.setOpaque(false);
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        jPanel17.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 30, 25));

        goToRooms.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        goToRooms.setForeground(new java.awt.Color(255, 255, 255));
        goToRooms.setText("Rooms");
        goToRooms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToRoomsMouseClicked(evt);
            }
        });
        jPanel17.add(goToRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, -1, -1));

        jPanel2.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, 30));

        jPanel18.setBackground(java.awt.Color.white);
        jPanel18.setOpaque(false);
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Student.png"))); // NOI18N
        jPanel18.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 30, 25));

        goToCustomers.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        goToCustomers.setForeground(new java.awt.Color(255, 255, 255));
        goToCustomers.setText("Customers");
        goToCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToCustomersMouseClicked(evt);
            }
        });
        jPanel18.add(goToCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, -1, -1));

        jPanel2.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 150, 30));

        jPanel19.setBackground(java.awt.Color.white);
        jPanel19.setOpaque(false);
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile.png"))); // NOI18N
        jPanel19.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 30, 25));

        goToReport.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        goToReport.setForeground(new java.awt.Color(255, 255, 255));
        goToReport.setText("Report");
        goToReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToReportMouseClicked(evt);
            }
        });
        jPanel19.add(goToReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, -1, -1));

        jPanel2.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 150, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 550));

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
    }// </editor-fold>//GEN-END:initComponents

    private void GoToLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToLogoutMouseClicked
        // operation for login out
        String SerialNo = topBarRegNo.getText();

        try {
            conn = DBConnection.setConnection();
            sqlQueryLogout = conn.prepareStatement("update tbl_admin SET status='Offline' WHERE serial_no=? ");
            sqlQueryLogout.setString(1, SerialNo);

            //if the logout is successfully the state of executeUpdate() will be 1
            if (sqlQueryLogout.executeUpdate() != 0) {
                // redirect to login
                Page1_AdminLogin login = new Page1_AdminLogin();

                // logout function
                AdminPageLogout.logMeOut(this, login);
            }
        } catch (Exception ex) {
            Logger.getLogger(Page2_Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GoToLogoutMouseClicked

    private void goToDashbordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToDashbordMouseClicked
        // Go to dashboard
        Page2_Dashboard dash = new Page2_Dashboard();
        this.dispose();
        dash.setVisible(true);
    }//GEN-LAST:event_goToDashbordMouseClicked

    private void goToManagersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToManagersMouseClicked
        // Go to manager
        Page3_Manager manager = new Page3_Manager();
        this.dispose();
        manager.setVisible(true);
    }//GEN-LAST:event_goToManagersMouseClicked

    private void goToSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToSettingsMouseClicked
        // Go to settings
        Page7_Settings settings = new Page7_Settings();
        this.dispose();
        settings.setVisible(true);
    }//GEN-LAST:event_goToSettingsMouseClicked

    private void goToRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToRoomsMouseClicked
        // Go to rooms
        Page4_Rooms rooms = new Page4_Rooms();
        this.dispose();
        rooms.setVisible(true);
    }//GEN-LAST:event_goToRoomsMouseClicked

    private void goToCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToCustomersMouseClicked
        // Go to customers
        Page5_Customer customers = new Page5_Customer();
        this.dispose();
        customers.setVisible(true);
    }//GEN-LAST:event_goToCustomersMouseClicked

    private void goToReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToReportMouseClicked
        // Go to report
        Page6_Report report = new Page6_Report();
        this.dispose();
        report.setVisible(true);
    }//GEN-LAST:event_goToReportMouseClicked

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
            java.util.logging.Logger.getLogger(Page2_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page2_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page2_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page2_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page2_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GoToLogout;
    private javax.swing.JLabel bodyEmail;
    private javax.swing.JLabel bodyFname;
    private javax.swing.JLabel bodyOperatorId;
    private javax.swing.JLabel bodyPhone;
    private javax.swing.JLabel bodyRegNo;
    private javax.swing.JLabel customerCount;
    private javax.swing.JLabel goToCustomers;
    private javax.swing.JLabel goToDashbord;
    private javax.swing.JLabel goToManagers;
    private javax.swing.JLabel goToReport;
    private javax.swing.JLabel goToRooms;
    private javax.swing.JLabel goToSettings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel managerCount;
    private javax.swing.JLabel roomCount;
    private javax.swing.JLabel sideBarFname;
    private javax.swing.JLabel sideBarOperator;
    private javax.swing.JLabel topBarRegNo;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtDay;
    private javax.swing.JLabel txtTime;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while(true) {
            try {
                timeFormat = new SimpleDateFormat("hh:mm:ss a");
                time = timeFormat.format(Calendar.getInstance().getTime());
                txtTime.setText(time);

                dayFormat = new SimpleDateFormat("EEEE");
                day = dayFormat.format(Calendar.getInstance().getTime());
                txtDay.setText(day);

                dateFormat = new SimpleDateFormat("dd MMM yyyy"); // setting the time
                date = dateFormat.format(Calendar.getInstance().getTime());// getting current date
                txtDate.setText(date);// displaying the date to the user
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
