/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.CarManager;
import static utils.CarManager.getCarList;
import utils.CarProperties;

/**
 *
 * @author prath
 */
public class ManageCar extends javax.swing.JFrame {

    private CarManager carManager;
    private List<CarProperties> carList;
    List<CarProperties> addCar = new ArrayList<CarProperties>();
    private int indexGlobal = -1;
    
    /**
     * Creates new form ViewCar
     */
    public ManageCar(List<CarProperties> carList) {
        this.carManager = getCarList();
        this.carList = carList;
        initComponents();
        initImage();
    }
    
    /**
     * Creates new form ManageCar
     */
    public ManageCar() {
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

        panelUpdateCar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        newBrand = new javax.swing.JTextField();
        newModel = new javax.swing.JTextField();
        newYear = new javax.swing.JTextField();
        newSerial = new javax.swing.JTextField();
        newMin = new javax.swing.JTextField();
        newCity = new javax.swing.JTextField();
        newMax = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        updateNewCar = new javax.swing.JButton();
        availableYes = new javax.swing.JCheckBox();
        availableNo = new javax.swing.JCheckBox();
        maintenanceYes = new javax.swing.JCheckBox();
        maintenanceNo = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        carSelect = new javax.swing.JComboBox<>();
        updateCar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelUpdateCar.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Update");

        newBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBrandActionPerformed(evt);
            }
        });

        newModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newModelActionPerformed(evt);
            }
        });

        newMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMinActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Brand");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Model");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Serial Number");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Year");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Minimum Seats");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Maximum Seats");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("City");

        updateNewCar.setText("Update");
        updateNewCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNewCarActionPerformed(evt);
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

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Available");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Maintenance");

        javax.swing.GroupLayout panelUpdateCarLayout = new javax.swing.GroupLayout(panelUpdateCar);
        panelUpdateCar.setLayout(panelUpdateCarLayout);
        panelUpdateCarLayout.setHorizontalGroup(
            panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUpdateCarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelUpdateCarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(100, 100, 100)
                        .addGroup(panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelUpdateCarLayout.createSequentialGroup()
                                .addComponent(maintenanceYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(maintenanceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpdateCarLayout.createSequentialGroup()
                                .addComponent(availableYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(availableNo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(newMin, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(newMax)
                            .addComponent(newCity)
                            .addComponent(newBrand)
                            .addComponent(newModel)
                            .addComponent(newYear)
                            .addComponent(newSerial))
                        .addGap(0, 112, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpdateCarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateNewCar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelUpdateCarLayout.setVerticalGroup(
            panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUpdateCarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelUpdateCarLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newModel))
                .addGap(18, 18, 18)
                .addGroup(panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newYear))
                .addGap(18, 18, 18)
                .addGroup(panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newSerial))
                .addGap(18, 18, 18)
                .addGroup(panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newMin))
                .addGap(18, 18, 18)
                .addGroup(panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newMax))
                .addGap(18, 18, 18)
                .addGroup(panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUpdateCarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateNewCar)
                        .addContainerGap())
                    .addGroup(panelUpdateCarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availableYes)
                            .addComponent(availableNo)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelUpdateCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maintenanceYes)
                            .addComponent(maintenanceNo)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addContainerGap(186, Short.MAX_VALUE))))
        );

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Cars");

        backButton.setBackground(new java.awt.Color(51, 51, 51));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<-- Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Car");

        carSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elantra", "Tucson", "Jetta", "City", "Civic", "CR-V", "Camry", "Corolla", "Model 3", "Model S", "Spark", "Impala", "i8" }));

        updateCar.setText("Update");
        updateCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(carSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(updateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelUpdateCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(updateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(panelUpdateCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        super.dispose();
        DashboardPanel dashboardPanel = new DashboardPanel(carList);
        dashboardPanel.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCarActionPerformed
        List<CarProperties> modelNamesTemp = new ArrayList<CarProperties>();
        String modelName = "";
        String searchString = "";
        modelName = String.valueOf(carSelect.getItemAt(carSelect.getSelectedIndex()));
        searchString = carSelect.getItemAt(carSelect.getSelectedIndex());
        for (CarProperties car : carList) {
            if (car.getModelName().equals(modelName)) {
                if (car.getBrandName().equals(searchString)) {
                    modelNamesTemp.add(car);
                } else {
                    modelNamesTemp.add(car);
                }
            }
        }
        indexGlobal = carList.indexOf(modelNamesTemp.get(0));
        System.out.println(modelName);
        System.out.println(indexGlobal + "INDEX");
        panelUpdateCar.setVisible(true);
        
        addCar = CarManager.searchModel(modelName);
        newModel.setText(modelName);
        newBrand.setText(addCar.get(0).getBrandName());
        newCity.setText(addCar.get(0).getCarCity());
        newYear.setText(String.valueOf(addCar.get(0).getCarYear()));
        newMin.setText(String.valueOf(addCar.get(0).getCarMinSeats()));
        newMax.setText(String.valueOf(addCar.get(0).getCarMaxSeats()));
        newSerial.setText(String.valueOf(addCar.get(0).getCarSerialNumber()));
        if (addCar.get(0).isAvailable()) {
            availableYes.setSelected(true);
            availableNo.setSelected(false);
        } else {
            availableYes.setSelected(false);
            availableNo.setSelected(true);
        }
        if (addCar.get(0).isCarMaintenanceCertificate()) {
            maintenanceYes.setSelected(true);
            maintenanceNo.setSelected(false);
        } else {
            maintenanceYes.setSelected(false);
            maintenanceNo.setSelected(true);
        }
    }//GEN-LAST:event_updateCarActionPerformed

    private void newMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newMinActionPerformed

    private void newModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newModelActionPerformed

    private void updateNewCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNewCarActionPerformed
        carList.get(indexGlobal).setBrandName(newBrand.getText());
        carList.get(indexGlobal).setModelName(newModel.getText());
        carList.get(indexGlobal).setCarYear(Integer.parseInt(newYear.getText()));
        carList.get(indexGlobal).setCarSerialNumber(Integer.parseInt(newSerial.getText()));
        carList.get(indexGlobal).setCarMinSeats(Integer.parseInt(newMin.getText()));
        carList.get(indexGlobal).setCarMaxSeats(Integer.parseInt(newMax.getText()));
        carList.get(indexGlobal).setCarCity(newCity.getText());
        carList.get(indexGlobal).setIsAvailable(availableYes.isSelected());
        carList.get(indexGlobal).setCarMaintenanceCertificate(maintenanceYes.isSelected());
        
        JOptionPane.showMessageDialog(this,"Car Details Successfully updated!");
        super.dispose();
        DashboardPanel dashboardPanel = new DashboardPanel(carList);
        dashboardPanel.setVisible(true);
    }//GEN-LAST:event_updateNewCarActionPerformed

    private void newBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newBrandActionPerformed

    private void availableYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableYesActionPerformed
        availableNo.setSelected(false);
    }//GEN-LAST:event_availableYesActionPerformed

    private void availableNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableNoActionPerformed
        availableYes.setSelected(false);
    }//GEN-LAST:event_availableNoActionPerformed

    private void maintenanceYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceYesActionPerformed
        maintenanceNo.setSelected(false);
    }//GEN-LAST:event_maintenanceYesActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCar().setVisible(true);
            }
        });
    }
    
    private void initImage() {
        ImagePanel jPanel1 = new ImagePanel("src/assets/gear.jpg");
        
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
        panelUpdateCar.setVisible(false);  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox availableNo;
    private javax.swing.JCheckBox availableYes;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> carSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField newBrand;
    private javax.swing.JTextField newCity;
    private javax.swing.JTextField newMax;
    private javax.swing.JTextField newMin;
    private javax.swing.JTextField newModel;
    private javax.swing.JTextField newSerial;
    private javax.swing.JTextField newYear;
    private javax.swing.JPanel panelUpdateCar;
    private javax.swing.JButton updateCar;
    private javax.swing.JButton updateNewCar;
    // End of variables declaration//GEN-END:variables
}
