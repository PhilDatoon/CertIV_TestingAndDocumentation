package barnhill;

import java.awt.Color;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 * @author  Datoon, Philip Bryan B.
 * @since   29 October 2013
 */
public class SalaryPay extends javax.swing.JFrame {
    private float hoursWorked;
    private float overtimeHrs;
    private float regularPay;
    private float overtimePay;
    private float totalDeductions;
    private float grossPay;
    private float netPay;
    private float superannuation;
       
    public SalaryPay() {
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

        lbl_companyName = new javax.swing.JLabel();
        panel_inputs = new javax.swing.JPanel();
        lbl_skillLevel = new javax.swing.JLabel();
        lbl_hours = new javax.swing.JLabel();
        lbl_insurance = new javax.swing.JLabel();
        lbl_retirement = new javax.swing.JLabel();
        cmb_skillLevel = new javax.swing.JComboBox();
        txt_hours = new javax.swing.JTextField();
        ckb_medical = new javax.swing.JCheckBox();
        ckb_dental = new javax.swing.JCheckBox();
        ckb_disability = new javax.swing.JCheckBox();
        ckb_retirement = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        panel_buttons = new javax.swing.JPanel();
        btn_calculate = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbl_companyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_companyName.setText("BARNHILL FASTENER COMPANY");

        lbl_skillLevel.setText("Skill level");

        lbl_hours.setText("Number of hours worked");

        lbl_insurance.setText("Insurance");

        lbl_retirement.setText("Retirement plan");

        cmb_skillLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Level 1", "Level 2", "Level 3" }));
        cmb_skillLevel.setSelectedIndex(-1);
        cmb_skillLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_skillLevelActionPerformed(evt);
            }
        });

        txt_hours.setText("0");

        ckb_medical.setText("Medical insurance");
        ckb_medical.setEnabled(false);

        ckb_dental.setText("Dental insurance");
        ckb_dental.setEnabled(false);

        ckb_disability.setText("Long-term disability insurance");
        ckb_disability.setEnabled(false);

        ckb_retirement.setText("Check if applicable");
        ckb_retirement.setEnabled(false);

        javax.swing.GroupLayout panel_inputsLayout = new javax.swing.GroupLayout(panel_inputs);
        panel_inputs.setLayout(panel_inputsLayout);
        panel_inputsLayout.setHorizontalGroup(
            panel_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inputsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_inputsLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lbl_skillLevel))
                    .addComponent(lbl_hours)
                    .addComponent(lbl_insurance, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_retirement, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panel_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckb_medical)
                    .addComponent(ckb_dental)
                    .addComponent(ckb_disability)
                    .addComponent(ckb_retirement)
                    .addGroup(panel_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmb_skillLevel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_hours, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        panel_inputsLayout.setVerticalGroup(
            panel_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inputsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_skillLevel)
                    .addComponent(cmb_skillLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_hours))
                .addGap(7, 7, 7)
                .addGroup(panel_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckb_medical)
                    .addComponent(lbl_insurance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckb_dental)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckb_disability)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_retirement, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_retirement))
                .addGap(24, 24, 24))
        );

        ckb_medical.getAccessibleContext().setAccessibleParent(cmb_skillLevel);
        ckb_dental.getAccessibleContext().setAccessibleParent(cmb_skillLevel);
        ckb_disability.getAccessibleContext().setAccessibleParent(cmb_skillLevel);
        ckb_retirement.getAccessibleContext().setAccessibleParent(lbl_skillLevel);

        btn_calculate.setMnemonic('C');
        btn_calculate.setText("Calculate pay");
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });

        btn_reset.setMnemonic('R');
        btn_reset.setText("Reset form");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_buttonsLayout = new javax.swing.GroupLayout(panel_buttons);
        panel_buttons.setLayout(panel_buttonsLayout);
        panel_buttonsLayout.setHorizontalGroup(
            panel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buttonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_calculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_buttonsLayout.setVerticalGroup(
            panel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_calculate)
                .addComponent(btn_reset))
        );

        displayArea.setEditable(false);
        displayArea.setColumns(20);
        displayArea.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        displayArea.setLineWrap(true);
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_companyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_inputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(panel_buttons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_companyName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_inputs, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(btn_calculate);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_skillLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_skillLevelActionPerformed
        switch (cmb_skillLevel.getSelectedIndex()) {
            case 1:
                // sets state of components if Skill Level selected is Level 2
                ckb_medical.setEnabled(true);
                ckb_dental.setEnabled(true);
                ckb_disability.setEnabled(true);
                ckb_retirement.setEnabled(false);
                ckb_retirement.setSelected(false);
                break;
                
            case 2:
                // sets state of components if Skill Level selected is Level 3
                ckb_medical.setEnabled(true);
                ckb_dental.setEnabled(true);
                ckb_disability.setEnabled(true);
                ckb_retirement.setEnabled(true);
                break;
                
            default:
                // sets state of components if Skill Level selected is Level 1
                ckb_medical.setEnabled(false);
                ckb_dental.setEnabled(false);
                ckb_disability.setEnabled(false);
                ckb_retirement.setEnabled(false);
                ckb_medical.setSelected(false);
                ckb_dental.setSelected(false);
                ckb_disability.setSelected(false);
                ckb_retirement.setSelected(false);
                break;
        }
    }//GEN-LAST:event_cmb_skillLevelActionPerformed

    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed
        try {
            hoursWorked = Float.parseFloat(txt_hours.getText());
            
            if (hoursWorked > 0 && hoursWorked <= 168) {
                calculateGrossPay();
            } else {
                throw (new InputMismatchException("Number of hours should be "
                        + "between 1.00 and 168.00 inclusive."));
            }
        } catch (InputMismatchException e) {
            displayArea.setForeground(Color.red);
            displayArea.setText("ERROR: " + e.getMessage());
        } catch (NumberFormatException e) {
            displayArea.setForeground(Color.red);
            displayArea.setText("ERROR: Please enter appropriate "
                    + "number of hours.");
        }
    }//GEN-LAST:event_btn_calculateActionPerformed

    private void calculateGrossPay() {
        totalDeductions = 0;
        
        // calculates regular and/or overtime pays
        if (hoursWorked > 40) {
            // calculates pay with overtime hour(s)
            overtimeHrs = hoursWorked - 40;
            
            regularPay = 40 * getPayRate();
            overtimePay = overtimeHrs * (getPayRate() * 1.5f);
        } else {
            // calculates regular pay
            regularPay = hoursWorked * getPayRate();
        }
        
        // calculates insurance deductions
        if (ckb_medical.isSelected()) {
            totalDeductions = totalDeductions + 23.5f;
        }
        
        if (ckb_dental.isSelected()) {
            totalDeductions = totalDeductions + 21.0f;
        }
        
        if (ckb_disability.isSelected()) {
            totalDeductions = totalDeductions + 17.0f;
        }
        
        // calculates gross pay
        grossPay = regularPay + overtimePay;
        
        // calculates net pay
        netPay = grossPay - totalDeductions;
        
        // calculates retirement plan or superannuation
        if (ckb_retirement.isSelected()) {
            superannuation = grossPay * 0.03f;
        }
        
        // calls displayPay() method to display breakdown of results
        displayPay();
    }
    
    private float getPayRate() {
        float rate = 0.00f;
        
        switch (cmb_skillLevel.getSelectedIndex()) {
            case 0:
                // Hourly rate for Skill Level 1
                rate = 19.00f;
                break;
            case 1:
                // Hourly rate for Skill Level 2
                rate = 23.00f;
                break;
            case 2:
                // Hourly rate for Skill Level 3
                rate = 27.00f;
                break;
            default:
                throw (new InputMismatchException("Please select a skill level."));
        }
        
        return rate;
    }
    
    private void displayPay() {
        String separator = "——————————————————————————————" +
                "————————————————————————————\n";

        String payBreakdown = String.format("Hours worked\t\t\t\t\t%7d:%02d\n" +
                "Hourly pay rate\t\t\t\t\t$%,9.2f\n" + separator +
                "Regular pay (%02d:%02d hrs)\t\t\t\t$%,9.2f\n" +
                "Overtime pay (" + ((overtimeHrs >= 100) ? "%03d" : "%02d") +
                ":%02d hrs)\t\t\t$%,9.2f\n" + "\t\t\t\t\t\t==========\n" +
                "Gross pay\t\t\t\t\t$%,9.2f\n" +
                "Total deduction\t\t\t\t\t$ (%7.2f)\n" +
                "\t\t\t\t\t\t==========\n" +
                "Net pay\t\t\t\t\t\t$%,9.2f\n" + separator +
                "Superannuation\t\t\t\t\t$%,9.2f", formatToHrs(hoursWorked),
                formatToMinute(hoursWorked), getPayRate(),
                formatToHrs(hoursWorked - overtimeHrs), 
                formatToMinute(hoursWorked - overtimeHrs), regularPay,
                formatToHrs(overtimeHrs), formatToMinute(overtimeHrs),
                overtimePay, grossPay, totalDeductions, netPay, superannuation);
        
        displayArea.setForeground(Color.BLACK);
        displayArea.setText(payBreakdown);
        
        if (totalDeductions > grossPay) {
            JOptionPane.showMessageDialog(null, "Total deduction is " +
                    "larger than gross pay.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        // automaticall resets all values if user tries to calculate pay again without clicking reset button
        resetValues();
    }
    
    private int formatToHrs(float hoursWorked) {
        // converts hoursWorked to time format
        // e.g. "10.50" is equivalent to 10 hrs and 30 mins or "10:30"
        return (int) Math.abs(hoursWorked);
    }
    
    private int formatToMinute(float hoursWorked) {
        // converts hoursWorked to time format
        // e.g. "10.50" is equivalent to 10 hrs and 30 mins or "10:30"
        return (int) Math.abs(((hoursWorked - formatToHrs(hoursWorked)) * 60));
    }
    
    private void resetValues() {
        hoursWorked = 0;
        overtimeHrs = 0;
        regularPay = 0;
        overtimePay = 0;
        totalDeductions = 0;
        grossPay = 0;
        netPay = 0;
        superannuation = 0;
    }
    
    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // resets all components to initial state
        cmb_skillLevel.setSelectedIndex(-1);
        txt_hours.setText("0");
        
        ckb_medical.setEnabled(false);
        ckb_dental.setEnabled(false);
        ckb_disability.setEnabled(false);
        ckb_retirement.setEnabled(false);
        
        ckb_medical.setSelected(false);
        ckb_dental.setSelected(false);
        ckb_disability.setSelected(false);
        ckb_retirement.setSelected(false);
        
        displayArea.setText(null);
        
        // resets all values
        resetValues();
    }//GEN-LAST:event_btn_resetActionPerformed

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
            java.util.logging.Logger.getLogger(SalaryPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalaryPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalaryPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalaryPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalaryPay().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calculate;
    private javax.swing.JButton btn_reset;
    private javax.swing.JCheckBox ckb_dental;
    private javax.swing.JCheckBox ckb_disability;
    private javax.swing.JCheckBox ckb_medical;
    private javax.swing.JCheckBox ckb_retirement;
    private javax.swing.JComboBox cmb_skillLevel;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_companyName;
    private javax.swing.JLabel lbl_hours;
    private javax.swing.JLabel lbl_insurance;
    private javax.swing.JLabel lbl_retirement;
    private javax.swing.JLabel lbl_skillLevel;
    private javax.swing.JPanel panel_buttons;
    private javax.swing.JPanel panel_inputs;
    private javax.swing.JTextField txt_hours;
    // End of variables declaration//GEN-END:variables
}
