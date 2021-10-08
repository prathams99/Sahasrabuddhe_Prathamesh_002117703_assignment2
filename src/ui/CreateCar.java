/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import utils.CarConfiguration;
import static utils.CarConfiguration.getCarList;
import utils.CarProperties;

/**
 *
 * @author prath
 */
public class CreateCar extends javax.swing.JFrame {

    private CarConfiguration carManager;
    private CarProperties cp = new CarProperties();
    private List<CarProperties> carList;
    
    /**
     * Creates new form CreateCar
     */
    public CreateCar(List<CarProperties> carList) {
        this.carManager = getCarList();
        this.carList = carList;
        initComponents();
        initImage();
    }
    
    /**
     * Creates new form CreateCar
     */
    public CreateCar() {
        initComponents();
        initImage();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        brandNameInput = new javax.swing.JTextField();
        modelNameInput = new javax.swing.JTextField();
        carYearInput = new javax.swing.JTextField();
        serialNumberInput = new javax.swing.JTextField();
        minSeatsInput = new javax.swing.JTextField();
        maxSeatsInput = new javax.swing.JTextField();
        availableYes = new javax.swing.JCheckBox();
        availableNo = new javax.swing.JCheckBox();
        maintenanceYes = new javax.swing.JCheckBox();
        maintenanceNo = new javax.swing.JCheckBox();
        cityInput = new javax.swing.JComboBox<>();
        submitCar = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 0, 133));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add a Uber Car");

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Brand");

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Model Name");

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Model Year");

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Serial Number");

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Available");

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("City");

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Minimum Seats");

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Maximum Seats");

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Maintenance Certificate");

        brandNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandNameInputActionPerformed(evt);
            }
        });

        availableYes.setForeground(new java.awt.Color(255, 255, 255));
        availableYes.setText("Yes");
        availableYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableYesActionPerformed(evt);
            }
        });

        availableNo.setForeground(new java.awt.Color(255, 255, 255));
        availableNo.setText("No");
        availableNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableNoActionPerformed(evt);
            }
        });

        maintenanceYes.setForeground(new java.awt.Color(255, 255, 255));
        maintenanceYes.setText("Yes");
        maintenanceYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceYesActionPerformed(evt);
            }
        });

        maintenanceNo.setForeground(new java.awt.Color(255, 255, 255));
        maintenanceNo.setText("No");
        maintenanceNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceNoActionPerformed(evt);
            }
        });

        cityInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "New York", "New Jersey", "California" }));
        cityInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityInputActionPerformed(evt);
            }
        });

        submitCar.setText("Submit");
        submitCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitCarActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(51, 51, 51));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<-- Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(availableYes))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cityInput, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(availableNo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(brandNameInput, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(modelNameInput, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(carYearInput, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(serialNumberInput, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(minSeatsInput, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(maxSeatsInput, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(maintenanceYes)
                            .addGap(18, 38, Short.MAX_VALUE)
                            .addComponent(maintenanceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(437, 437, 437)
                .addComponent(submitCar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 681, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(brandNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modelNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(carYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(serialNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(availableYes)
                    .addComponent(availableNo))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(minSeatsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(maxSeatsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(maintenanceYes)
                    .addComponent(maintenanceNo))
                .addGap(28, 28, 28)
                .addComponent(submitCar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void availableYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableYesActionPerformed
        availableNo.setSelected(false);
    }//GEN-LAST:event_availableYesActionPerformed

    private void maintenanceYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceYesActionPerformed
        maintenanceNo.setSelected(false);
    }//GEN-LAST:event_maintenanceYesActionPerformed

    private void cityInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityInputActionPerformed

    private void brandNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandNameInputActionPerformed

    private void submitCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitCarActionPerformed
        validateFields();
    }//GEN-LAST:event_submitCarActionPerformed
    
    private void validateFields() {
        if (!cp.validateName(brandNameInput.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter a valid brand name.");
            return;
        }
        if (!cp.validateNameNumber(modelNameInput.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter a valid model name.");
            return;
        }
        if (!cp.validateNumber(carYearInput.getText()) || carYearInput.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid year.");
            return;
        }
        if (!cp.validateNumber(serialNumberInput.getText()) || serialNumberInput.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid serial number.");
            return;
        }
        if (!(availableYes.isSelected() | availableNo.isSelected())) {
            JOptionPane.showMessageDialog(this, "Please select the validity of the car.");
            return;
        }
        if (!cp.validateNumber(minSeatsInput.getText()) || minSeatsInput.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number of minimum seats.");
            return;
        }
        if (!cp.validateNumber(maxSeatsInput.getText()) || maxSeatsInput.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number of maximum seats.");
            return;
        }
        if (!(maintenanceYes.isSelected() | maintenanceNo.isSelected())) {
            JOptionPane.showMessageDialog(this, "Please select the certification of the car.");
            return;
        }
        storeFields();
        openNextPanel();
    }

    private void storeFields() {
        String brandName = brandNameInput.getText();
        String modelName = modelNameInput.getText();
        int carYear = Integer.parseInt(carYearInput.getText());
        String carCity = cityInput.getItemAt(cityInput.getSelectedIndex());
        int carSerialNumber = Integer.parseInt(serialNumberInput.getText());
        int carMinSeats = Integer.parseInt(minSeatsInput.getText());
        int carMaxSeats = Integer.parseInt(maxSeatsInput.getText());
        boolean isAvailable = availableYes.isSelected();
        boolean carMaintenanceCertificate = maintenanceYes.isSelected();
        
        LocalDateTime now = LocalDateTime.now();
        Date currentTime = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
        CarProperties carProperties = new CarProperties(brandName, modelName, carCity, carSerialNumber, carMaxSeats, carMinSeats, carMaintenanceCertificate, carYear, isAvailable, currentTime);
        carList.add(carProperties);
    }
    
    private void openNextPanel() {
        JOptionPane.showMessageDialog(this,"Car Successfully added!");
        super.dispose();
        DashboardPanel dashboardPanel = new DashboardPanel(carList);
        dashboardPanel.setVisible(true);
    }
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        super.dispose();
        DashboardPanel dashboardPanel = new DashboardPanel(carList);
        dashboardPanel.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void availableNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableNoActionPerformed
        availableYes.setSelected(false);
    }//GEN-LAST:event_availableNoActionPerformed

    private void maintenanceNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceNoActionPerformed
        maintenanceYes.setSelected(false);
    }//GEN-LAST:event_maintenanceNoActionPerformed

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
            java.util.logging.Logger.getLogger(CreateCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateCar().setVisible(true);
            }
        });
    }
    
    private void initImage() {
        ImagePanel jPanel1 = new ImagePanel("src/assets/black-car.jpeg");
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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
        
        carYearInput.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (carYearInput.getText().length() >= 4) // limit textfield to 4 characters
                {
                    e.consume();
                }
            }
        });
        
        // Dropdown list
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox availableNo;
    private javax.swing.JCheckBox availableYes;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField brandNameInput;
    private javax.swing.JTextField carYearInput;
    private javax.swing.JComboBox<String> cityInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox maintenanceNo;
    private javax.swing.JCheckBox maintenanceYes;
    private javax.swing.JTextField maxSeatsInput;
    private javax.swing.JTextField minSeatsInput;
    private javax.swing.JTextField modelNameInput;
    private javax.swing.JTextField serialNumberInput;
    private javax.swing.JButton submitCar;
    // End of variables declaration//GEN-END:variables
}
