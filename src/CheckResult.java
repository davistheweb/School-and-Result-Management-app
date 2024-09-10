
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import javax.imageio.ImageIO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author GOI
 */
public class CheckResult extends javax.swing.JFrame {

    /**
     * Creates new form CheckResult
     */
    public CheckResult() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        regNumber = new javax.swing.JTextField();
        checkResultSlip = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sessions = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/imsulogo.png"))); // NOI18N

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        regNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNumberActionPerformed(evt);
            }
        });

        checkResultSlip.setText("CHECK RESULT SLIP");
        checkResultSlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkResultSlipActionPerformed(evt);
            }
        });

        jLabel5.setText("ENTER REG NUMBER");

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("eg: 202110848885eg");

        jLabel7.setText("SELECT YEAR AND SEMESTER");

        sessions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SESSION", "YEAR 1 1ST SEMESTER", "YEAR 1 2ND SEMESTER", "YEAR 2 1ST SEMESTER", "YEAR 2 2ND SEMESTER", "YEAR 3 1ST SEMESTER", "YEAR 3 2ND SEMESTER", "YEAR 4 1ST SEMESTER", "YEAR 4 2ND SEMESTER" }));

        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(135, 135, 135)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sessions, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkResultSlip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(regNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sessions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(checkResultSlip)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regNumberActionPerformed
    public void CheckResultSlip() {
        if ("".equals(regNumber.getText())) {
            JOptionPane.showMessageDialog(this, "Field cannot be empty!", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (regNumber.getText().trim().length() != 14) {
            JOptionPane.showMessageDialog(this, "REG NUMBER MUST BE 14 CHARACTERS", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if ("SELECT SESSION".equals(sessions.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "PLEASE SELECT SESSION", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String selectedSemester = sessions.getSelectedItem().toString();
        String tableName = "";

        switch (selectedSemester) {
            case "YEAR 1 1ST SEMESTER":
                tableName = "level1_semester1";
                break;
            case "YEAR 1 2ND SEMESTER":
                tableName = "level1_semester2";
                break;
            case "YEAR 2 1ST SEMESTER":
                tableName = "level2_semester1";
                break;
            case "YEAR 2 2ND SEMESTER":
                tableName = "level2_semester2";
                break;
            case "YEAR 3 1ST SEMESTER":
                tableName = "level3_semester1";
                break;
            case "YEAR 3 2ND SEMESTER":
                tableName = "level3_semester2";
                break;
            case "YEAR 4 1ST SEMESTER":
                tableName = "level4_semester1";
                break;
            case "YEAR 4 2ND SEMESTER":
                tableName = "level4_semester2";
                break;
            default:
                JOptionPane.showMessageDialog(this, "Invalid semester selected", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit method if invalid semester
        }

        String registrationNumber = regNumber.getText().toUpperCase();
        String url = "jdbc:MySql://sql8.freesqldatabase.com:3306/sql8730305";
        String username = "sql8730305";
        String password = "VGxAU93HkA";

        // Updated to use tableName instead of selectedSemester
        String fetchByRegNumber = "SELECT * FROM " + tableName + " WHERE reg_number = ?";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement pstm = conn.prepareStatement(fetchByRegNumber);

            pstm.setString(1, registrationNumber);
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                String feeStatus = rs.getString("fee");
                String semester = rs.getString("semester");
                String level = String.valueOf(rs.getInt("level"));
                String regNum = rs.getString("reg_number");
                String name = rs.getString("name_of_student");
                String course1 = rs.getString("course1");
                String course2 = rs.getString("course2");
                String course3 = rs.getString("course3");
                String course4 = rs.getString("course4");
                String course5 = rs.getString("course5");
                String course6 = rs.getString("course6");
                String course7 = rs.getString("course7");
                String course8 = rs.getString("course8");
                String score1 = "";
                String grade1 = "";
                String score2 = "";
                String grade2 = "";
                String score3 = "";
                String grade3 = "";
                String score4 = "";
                String grade4 = "";
                String score5 = "";
                String grade5 = "";
                String score6 = "";
                String grade6 = "";
                String score7 = "";
                String grade7 = "";
                String score8 = "";
                String grade8 = "";
                String gpa = "";

                switch (selectedSemester) {
                    case "YEAR 1 1ST SEMESTER":
                        score1 = String.valueOf(rs.getInt("csc101_score"));
                        grade1 = rs.getString("csc101_grade");
                        score2 = String.valueOf(rs.getInt("mat101_score"));
                        grade2 = rs.getString("mat101_grade");
                        score3 = String.valueOf(rs.getInt("phy101_score"));
                        grade3 = rs.getString("phy101_grade");
                        score4 = String.valueOf(rs.getInt("sta111_score"));
                        grade4 = rs.getString("sta111_grade");
                        score5 = String.valueOf(rs.getInt("phy105_score"));
                        grade5 = rs.getString("phy105_grade");
                        score6 = String.valueOf(rs.getInt("bio101_score"));
                        grade6 = rs.getString("bio101_grade");
                        score7 = String.valueOf(rs.getInt("gst105_score"));
                        grade7 = rs.getString("gst105_grade");
                        score8 = String.valueOf(rs.getInt("mgt101_score"));
                        grade8 = rs.getString("mgt101_grade");
                        gpa = String.valueOf(rs.getDouble("gpa"));
                        break;
                    case "YEAR 1 2ND SEMESTER":
                        score1 = String.valueOf(rs.getInt("csc102_score"));
                        grade1 = rs.getString("csc102_grade");
                        score2 = String.valueOf(rs.getInt("mat102_score"));
                        grade2 = rs.getString("mat102_grade");
                        score3 = String.valueOf(rs.getInt("phy102_score"));
                        grade3 = rs.getString("phy102_grade");
                        score4 = String.valueOf(rs.getInt("sta112_score"));
                        grade4 = rs.getString("sta112_grade");
                        score5 = String.valueOf(rs.getInt("phy152_score"));
                        grade5 = rs.getString("phy152_grade");
                        score6 = String.valueOf(rs.getInt("gst108_score"));
                        grade6 = rs.getString("gst108_grade");
                        score7 = String.valueOf(rs.getInt("che102_score"));
                        grade7 = rs.getString("che102_grade");
                        score8 = String.valueOf(rs.getInt("gst104_score"));
                        grade8 = rs.getString("gst104_grade");
                        gpa = String.valueOf(rs.getDouble("gpa"));
                        break;
                    case "YEAR 2 1ST SEMESTER":
                        score1 = String.valueOf(rs.getInt("csc231_score"));
                        grade1 = rs.getString("csc231_grade");

                        score2 = String.valueOf(rs.getInt("mat211_score"));
                        grade2 = rs.getString("mat211_grade");

                        score3 = String.valueOf(rs.getInt("csc241_score"));
                        grade3 = rs.getString("csc241_grade");

                        score4 = String.valueOf(rs.getInt("acc203_score"));
                        grade4 = rs.getString("acc203_grade");

                        score5 = String.valueOf(rs.getInt("gst223_score"));
                        grade5 = rs.getString("gst223_grade");

                        score6 = String.valueOf(rs.getInt("csc205_score"));
                        grade6 = rs.getString("csc205_grade");

                        score7 = String.valueOf(rs.getInt("sta201_score"));
                        grade7 = rs.getString("sta201_grade");

                        score8 = String.valueOf(rs.getInt("csc207_score"));
                        grade8 = rs.getString("csc207_grade");

                        gpa = String.valueOf(rs.getDouble("gpa"));

                        break;
                    case "YEAR 2 2ND SEMESTER":
                        score1 = String.valueOf(rs.getInt("csc206_score"));
                        grade1 = rs.getString("csc206_grade");

                        score2 = String.valueOf(rs.getInt("csc202_score"));
                        grade2 = rs.getString("csc202_grade");

                        score3 = String.valueOf(rs.getInt("csc242_score"));
                        grade3 = rs.getString("csc242_grade");

                        score4 = String.valueOf(rs.getInt("csc262_score"));
                        grade4 = rs.getString("csc262_grade");

                        score5 = String.valueOf(rs.getInt("csc232_score"));
                        grade5 = rs.getString("csc232_grade");

                        score6 = String.valueOf(rs.getInt("mat232_score"));
                        grade6 = rs.getString("mat232_grade");

                        score7 = String.valueOf(rs.getInt("eco202_score"));
                        grade7 = rs.getString("eco202_grade");

                        score8 = String.valueOf(rs.getInt("csc204_score"));
                        grade8 = rs.getString("csc204_grade");

                        gpa = String.valueOf(rs.getDouble("gpa"));

                        break;
                    case "YEAR 3 1ST SEMESTER":
                        score1 = String.valueOf(rs.getInt("csc361_score"));
                        grade1 = rs.getString("csc361_grade");

                        score2 = String.valueOf(rs.getInt("csc341_score"));
                        grade2 = rs.getString("csc341_grade");

                        score3 = String.valueOf(rs.getInt("csc351_score"));
                        grade3 = rs.getString("csc351_grade");

                        score4 = String.valueOf(rs.getInt("csc367_score"));
                        grade4 = rs.getString("csc367_grade");

                        score5 = String.valueOf(rs.getInt("csc371_score"));
                        grade5 = rs.getString("csc371_grade");

                        score6 = String.valueOf(rs.getInt("csc381_score"));
                        grade6 = rs.getString("csc381_grade");

                        score7 = String.valueOf(rs.getInt("csc315_score"));
                        grade7 = rs.getString("csc315_grade");

                        score8 = String.valueOf(rs.getInt("csc323_score"));
                        grade8 = rs.getString("csc323_grade");

                        gpa = String.valueOf(rs.getDouble("gpa"));
                        break;
                    case "YEAR 3 2ND SEMESTER":
                        // Handle scores and grades for this semester
                        break;
                    case "YEAR 4 1ST SEMESTER":
                        score1 = String.valueOf(rs.getInt("csc401_score"));
                        grade1 = rs.getString("csc401_grade");

                        score2 = String.valueOf(rs.getInt("csc421_score"));
                        grade2 = rs.getString("csc421_grade");

                        score3 = String.valueOf(rs.getInt("csc429_score"));
                        grade3 = rs.getString("csc429_grade");

                        score4 = String.valueOf(rs.getInt("csc461_score"));
                        grade4 = rs.getString("csc461_grade");

                        score5 = String.valueOf(rs.getInt("csc467_score"));
                        grade5 = rs.getString("csc467_grade");

                        score6 = String.valueOf(rs.getInt("csc415_score"));
                        grade6 = rs.getString("csc415_grade");

                        score7 = String.valueOf(rs.getInt("csc473_score"));
                        grade7 = rs.getString("csc473_grade");

                        score8 = String.valueOf(rs.getInt("csc411_score"));
                        grade8 = rs.getString("csc411_grade");

                        gpa = String.valueOf(rs.getDouble("gpa"));

                        break;
                    case "YEAR 4 2ND SEMESTER":
                        score1 = String.valueOf(rs.getInt("csc412_score"));
                        grade1 = rs.getString("csc412_grade");

                        score2 = String.valueOf(rs.getInt("csc424_score"));
                        grade2 = rs.getString("csc424_grade");

                        score3 = String.valueOf(rs.getInt("csc442_score"));
                        grade3 = rs.getString("csc442_grade");

                        score4 = String.valueOf(rs.getInt("csc426_score"));
                        grade4 = rs.getString("csc426_grade");

                        score5 = String.valueOf(rs.getInt("csc446_score"));
                        grade5 = rs.getString("csc446_grade");

                        score6 = String.valueOf(rs.getInt("csc482_score"));
                        grade6 = rs.getString("csc482_grade");

                        score7 = String.valueOf(rs.getInt("csc428_score"));
                        grade7 = rs.getString("csc428_grade");

                        score8 = String.valueOf(rs.getInt("csc464_score"));
                        grade8 = rs.getString("csc464_grade");

                        gpa = String.valueOf(rs.getDouble("gpa"));

                        break;
                }

                // Retrieve passport image
                Blob blob = rs.getBlob("passport");
                ImageIcon passportIcon = null;
                if (blob != null) {
                    try (InputStream inputStream = blob.getBinaryStream()) {
                        BufferedImage image = ImageIO.read(inputStream);
                        if (image != null) {
                            passportIcon = new ImageIcon(image);
                        } else {
                            JOptionPane.showMessageDialog(this, "Image could not be read", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "Error reading image: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                // Now you can use each string independently or process them further
                if ("UNPAID".equals(feeStatus)) {
                    JOptionPane.showMessageDialog(this, "You can't check result until you Pay Your fees", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                ResultProcess rp = new ResultProcess();
                rp.student_fname.setText(name);
                rp.reg.setText(regNum);
                rp.lvl.setText(level);
                rp.course1.setText(course1);
                rp.course2.setText(course2);
                rp.course3.setText(course3);
                rp.course4.setText(course4);
                rp.course5.setText(course5);
                rp.course6.setText(course6);
                rp.course7.setText(course7);
                rp.course8.setText(course8);

                // Set course scores
                rp.score1.setText(score1);
                rp.score2.setText(score2);
                rp.score3.setText(score3);
                rp.score4.setText(score4);
                rp.score5.setText(score5);
                rp.score6.setText(score6);
                rp.score7.setText(score7);
                rp.score8.setText(score8);

                // Set course grades
                rp.grade1.setText(grade1);
                rp.grade2.setText(grade2);
                rp.grade3.setText(grade3);
                rp.grade4.setText(grade4);
                rp.grade5.setText(grade5);
                rp.grade6.setText(grade6);
                rp.grade7.setText(grade7);
                rp.grade8.setText(grade8);

                // Set GPA
                rp.gpa.setText(gpa);

                // Set passport image if available
                if (passportIcon != null) {
                    rp.passportLabel.setIcon(passportIcon);
                } else {
                    rp.passportLabel.setIcon(null); // Optionally set a default image or placeholder
                }

                rp.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "It does not exist", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException exceptionMessage) {
            if (exceptionMessage.getSQLState().equals("08S01") || exceptionMessage.getErrorCode() == 0) { // SQLState 08S01 refers to a communication link failure
                JOptionPane.showMessageDialog(this, "Failed to connect to the database. Please check your internet connection and try again.", "Connection Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, exceptionMessage.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    private void checkResultSlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkResultSlipActionPerformed
        CheckResultSlip();
        // TODO add your handling code here:
    }//GEN-LAST:event_checkResultSlipActionPerformed

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
            java.util.logging.Logger.getLogger(CheckResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckResult().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkResultSlip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField regNumber;
    private javax.swing.JComboBox<String> sessions;
    // End of variables declaration//GEN-END:variables
}
