
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kjsce_comp318
 */
   
public class Miniproject_UI extends javax.swing.JFrame {

    /**
     * Creates new form Miniproject_UI
     */
    class times implements Runnable
    {
        public void run()
        {
                while(true)
        {
            Calendar cal = Calendar.getInstance(); 
cal.getTime(); 
SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); 
time.setText(sdf.format(cal.getTime()));
        }
    }
    }
    public Miniproject_UI() {
        initComponents();
        delete.setVisible(false);
        jTable1.setVisible(false);
        times a=new times();
        Thread b=new Thread(a);
        b.start();
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_details","root","");
        java.sql.ResultSet rs;
        String sql="select * from menu";
            java.sql.Statement stmt=(java.sql.Statement)con.createStatement();
                rs=stmt.executeQuery(sql);
                while(rs.next())
                {
                    jComboBox2.addItem(rs.getString("item"));
                    jComboBox3.addItem(rs.getString("Id"));
                }
                
                    
        }
        catch(Exception e)
        {
            System.out.println("Failed to connect");
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

        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        Add_new = new javax.swing.JButton();
        Today_sales = new javax.swing.JButton();
        Current_sales = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        Today_bills = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOTEL MANAGER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 330, 34));

        jButton4.setBackground(new java.awt.Color(255, 255, 204));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jButton4.setText("Log out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 204));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jButton5.setText("ADD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 70, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 90, 73, -1));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 90, 73, -1));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 204));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 90, 70, -1));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 204));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 46, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 46, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Item");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 70, 53, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Qty");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 70, 73, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 70, 73, -1));

        time.setBackground(new java.awt.Color(255, 153, 153));
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 103, 19));

        Add_new.setBackground(new java.awt.Color(255, 255, 204));
        Add_new.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Add_new.setText("Add new");
        Add_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_newActionPerformed(evt);
            }
        });
        getContentPane().add(Add_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, -1));

        Today_sales.setBackground(new java.awt.Color(255, 255, 204));
        Today_sales.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Today_sales.setText("Today's sales");
        Today_sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Today_salesActionPerformed(evt);
            }
        });
        getContentPane().add(Today_sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 120, -1));

        Current_sales.setBackground(new java.awt.Color(255, 255, 204));
        Current_sales.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Current_sales.setText("Current orders");
        Current_sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Current_salesActionPerformed(evt);
            }
        });
        getContentPane().add(Current_sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, -1));

        Menu.setBackground(new java.awt.Color(255, 255, 204));
        Menu.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Menu.setText("Menu");
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 120, -1));

        Today_bills.setBackground(new java.awt.Color(255, 255, 204));
        Today_bills.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Today_bills.setText("Today's bills");
        getContentPane().add(Today_bills, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sno", "Id", "Item", "Qty", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 328, 131));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jButton1.setText("Place order");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, 34));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel8.setText("Total:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 60, 28));

        jTextField3.setEditable(false);
        jTextField3.setText("0");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 60, 28));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jButton2.setText("Edit order");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 100, 34));

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jButton3.setText("Generate bill");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 152, 34));

        delete.setBackground(new java.awt.Color(255, 255, 204));
        delete.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background5.jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int ind=jTable1.getSelectedRow();
        if(ind>=0)
        {
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.removeRow(ind);
        }
        int i,sum=0;
        for(i=0;i<jTable1.getRowCount();i++)
        {
            sum=sum+ Integer.parseInt((jTable1.getValueAt(i,4)).toString())*Integer.parseInt((jTable1.getValueAt(i,3)).toString());
        }
        jTextField3.setText(Integer.toString(sum));

    }//GEN-LAST:event_deleteActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void Today_salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Today_salesActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Todays_sales obj1=new Todays_sales();
        obj1.setVisible(true);
        
    }//GEN-LAST:event_Today_salesActionPerformed

    private void Add_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_newActionPerformed
        // TODO add your handling code here:
        
        Miniproject_UI obj=new Miniproject_UI();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Add_newActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        Connection con=null;
        try{jTextField1.setText("1");

            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_details","root","");
            java.sql.ResultSet rs;
            String b=jComboBox3.getSelectedItem().toString();
            String sql="select * from menu where Id="+b;
            java.sql.Statement stmt=(java.sql.Statement)con.createStatement();
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                jComboBox2.setSelectedItem(rs.getString("item"));
                jTextField2.setText(rs.getString("price"));
            }

        }
        catch(Exception e)
        {
            System.out.println("Failed to connect");
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        Connection con=null;
        try{jTextField1.setText("1");

            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_details","root","");
            java.sql.ResultSet rs;
            String b=jComboBox2.getSelectedItem().toString();
            String sql="select * from menu where item='"+b+"'";
            java.sql.Statement stmt=(java.sql.Statement)con.createStatement();
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                jComboBox3.setSelectedItem(rs.getString("Id"));
                jTextField2.setText(rs.getString("price"));
            }

        }
        catch(Exception e)
        {
            System.out.println("Failed to connect");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTable1.setVisible(true);
        delete.setVisible(true);
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{((jTable1.getRowCount())+1),jComboBox3.getSelectedItem().toString(), jComboBox2.getSelectedItem().toString(), jTextField1.getText(),jTextField2.getText()});
        int i,sum=0;
        for(i=0;i<jTable1.getRowCount();i++)
        {
            sum=sum+ Integer.parseInt((jTable1.getValueAt(i,4)).toString())*Integer.parseInt((jTable1.getValueAt(i,3)).toString());
        }
        jTextField3.setText(Integer.toString(sum));

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login obj=new Login();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Current_salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Current_salesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Current_salesActionPerformed

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
            java.util.logging.Logger.getLogger(Miniproject_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Miniproject_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Miniproject_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Miniproject_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Miniproject_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_new;
    private javax.swing.JButton Current_sales;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Today_bills;
    private javax.swing.JButton Today_sales;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
