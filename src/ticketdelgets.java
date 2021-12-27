
import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.net.*;
import java.io.*;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.io.Serializable;


public class ticketdelgets extends javax.swing.JFrame implements MouseListener {

    public ticketdelgets() throws SQLException {
        initComponents();
        lbl1.addMouseListener(this);
        lbl2.addMouseListener(this);
        lbl3.addMouseListener(this);
        lbl4.addMouseListener(this);
        lbl5.addMouseListener(this);
        lbl6.addMouseListener(this);
        lbl7.addMouseListener(this);
        lbl8.addMouseListener(this);
        lbl9.addMouseListener(this);
        lbl10.addMouseListener(this);
        lbl11.addMouseListener(this);
        lbl12.addMouseListener(this);
        lbl13.addMouseListener(this);
        connect();
    }

    int seatno = 0;

    Connection con;
    PreparedStatement pst;

    ResultSet rs;

    public void connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Tickets", "yesu", "adminadmin");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ticketdelgets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moviename = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textprice = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textbill = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JCalendar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        moviename.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select movie", "Spider Man Matrix 4", "Adtai jaaluud" }));
        moviename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movienameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Mogul PopularScript", 0, 24)); // NOI18N
        jLabel2.setText("Movie:");

        lbl1.setFont(new java.awt.Font("Mogul Taurus Heavy", 0, 14)); // NOI18N
        lbl1.setText("1");

        lbl2.setFont(new java.awt.Font("Mogul Taurus Heavy", 0, 14)); // NOI18N
        lbl2.setText("2");

        lbl3.setFont(new java.awt.Font("Mogul Taurus Heavy", 0, 14)); // NOI18N
        lbl3.setText("3");

        lbl4.setFont(new java.awt.Font("Mogul Taurus Heavy", 0, 14)); // NOI18N
        lbl4.setText("4");

        lbl5.setFont(new java.awt.Font("Mogul Taurus Heavy", 0, 14)); // NOI18N
        lbl5.setText("5");

        lbl6.setFont(new java.awt.Font("Mogul Taurus Heavy", 0, 14)); // NOI18N
        lbl6.setText("6");

        lbl7.setFont(new java.awt.Font("Mogul Taurus Heavy", 0, 14)); // NOI18N
        lbl7.setText("7");

        lbl8.setFont(new java.awt.Font("Mogul Taurus Heavy", 0, 14)); // NOI18N
        lbl8.setText("8");

        lbl9.setFont(new java.awt.Font("Mogul Taurus Heavy", 0, 14)); // NOI18N
        lbl9.setText("9");

        lbl10.setFont(new java.awt.Font("Mogul Taurus Heavy", 0, 14)); // NOI18N
        lbl10.setText("10");

        lbl11.setFont(new java.awt.Font("Mogul Taurus Heavy", 0, 14)); // NOI18N
        lbl11.setText("11");

        lbl12.setFont(new java.awt.Font("Mogul Taurus Heavy", 0, 14)); // NOI18N
        lbl12.setText("12");

        lbl13.setFont(new java.awt.Font("Mogul Taurus Heavy", 0, 14)); // NOI18N
        lbl13.setText("13");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl1)
                        .addGap(5, 5, 5)
                        .addComponent(lbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lbl12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl11)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(lbl3)
                    .addComponent(lbl2)
                    .addComponent(lbl4)
                    .addComponent(lbl5)
                    .addComponent(lbl6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl7)
                    .addComponent(lbl8)
                    .addComponent(lbl9)
                    .addComponent(lbl10)
                    .addComponent(lbl11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl12)
                    .addComponent(lbl13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Mogul PopularScript", 0, 24)); // NOI18N
        jLabel16.setText("Price:");

        textprice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "15000", "25000", "45000" }));
        textprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpriceActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Mogul Chicago", 0, 18)); // NOI18N
        jButton1.setText("BED PILLOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textbill.setColumns(20);
        textbill.setRows(5);
        jScrollPane1.setViewportView(textbill);

        jLabel1.setFont(new java.awt.Font("Mogul EdgeLineBook", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seat");

        jLabel3.setFont(new java.awt.Font("Mogul Start", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("306MAX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(50, 50, 50)
                                .addComponent(textprice, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(moviename, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moviename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movienameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movienameActionPerformed

    }//GEN-LAST:event_movienameActionPerformed

    private void textpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpriceActionPerformed

    }//GEN-LAST:event_textpriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object movie = moviename.getSelectedItem();
        Integer seat = seatno; 
        Object price = textprice.getSelectedItem();
        SimpleDateFormat date_form = new SimpleDateFormat("yyyy-MM-dd");
        String date = date_form.format(txtdate.getDate());
        try {
            Socket s = new Socket("localhost", 4999);
            ObjectOutputStream oop = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            
            Tickets t = new Tickets();
            t.setMovie(movie);
            t.setDate(date);
            t.setPrice(price);
            t.setSeat(seat);
            oop.writeObject(t);
            oop.flush();
            oop.close();
            s.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ticketdelgets.class.getName()).log(Level.SEVERE, null, ex);
        }
        try { 
            pst = con.prepareStatement("select * from Booking where huvaari = ? and suudal = ?");
            pst.setString(1, date);
            pst.setInt(2, seat);
            rs = pst.executeQuery();
            if (rs.next() == true) {
                JOptionPane.showMessageDialog(this, "This Ticked Number Already Booked");
            } else {
                pst = con.prepareStatement("Insert into Booking(movieName, suudal, price, huvaari) values(?,?,?,?)");
                pst.setObject(1, movie);
                pst.setInt(2, seat);
                pst.setObject(3, price);
                pst.setString(4, date);
                int k = pst.executeUpdate();
                if (k == 1) {
                    JOptionPane.showMessageDialog(this, "Ticket Booked.");
                } else {
                    JOptionPane.showMessageDialog(this, "Some this wrong.");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ticketdelgets.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) throws IOException  {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ticketdelgets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticketdelgets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticketdelgets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticketdelgets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ticketdelgets().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ticketdelgets.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JComboBox<String> moviename;
    private javax.swing.JTextArea textbill;
    private javax.swing.JComboBox<String> textprice;
    private com.toedter.calendar.JCalendar txtdate;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == lbl1) {
            seatno = 1;
        } else if (e.getSource() == lbl2) {
            seatno = 2;
        } else if (e.getSource() == lbl3) {
            seatno = 3;
        } else if (e.getSource() == lbl4) {
            seatno = 4;
        } else if (e.getSource() == lbl5) {
            seatno = 5;
        } else if (e.getSource() == lbl6) {
            seatno = 6;
        } else if (e.getSource() == lbl7) {
            seatno = 7;
        } else if (e.getSource() == lbl8) {
            seatno = 8;
        } else if (e.getSource() == lbl9) {
            seatno = 9;
        } else if (e.getSource() == lbl10) {
            seatno = 10;
        } else if (e.getSource() == lbl11) {
            seatno = 11;
        } else if (e.getSource() == lbl12) {
            seatno = 12;
        } else if (e.getSource() == lbl13) {
            seatno = 13;
        }

        JOptionPane.showMessageDialog(this, seatno + " suudal sul baina");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void database(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver hevin chaajiin");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
