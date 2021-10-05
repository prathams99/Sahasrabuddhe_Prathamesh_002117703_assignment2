/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
public class SearchCars extends javax.swing.JFrame {

    private CarManager carManager;
    private List<CarProperties> carList;
    private List<CarProperties> tempCars;
    private List<String> getBrand = new ArrayList<String>();
    
    /**
     * Creates new form ViewCar
     */
    public SearchCars(List<CarProperties> carList) {
        this.carManager = getCarList();
        this.carList = carList;
        initComponents();
        initImage();
        fillData();
//        for(int index = 0; index < carList.size(); index++){
//                getBrand.add(carList.get(index).getBrandName());
//        }
//        Set<String> set = new HashSet<>(getBrand);
//        getBrand.clear();
//        getBrand.addAll(set);
//        System.out.println(set);
//        String joined = String.join(",", set.toString());
//        List.of(joined);
//        String hueheu = String.valueOf(List.of(joined));
//        System.out.println(hueheu + "HUEHEU");
//        modelSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { hueheu }));
    }
    
    /**
     * Creates new form SearchCars
     */
    public SearchCars() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        yearSearch = new javax.swing.JComboBox<>();
        modelSearch = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        searchMaster = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        citySearch = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Cars");

        searchTable.setBackground(new java.awt.Color(0, 153, 153));
        searchTable.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));
        searchTable.setForeground(new java.awt.Color(255, 255, 255));
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Brand", "Model", "Serial No", "Max Seats", "Min Seats", "Location", "Year", "Available", "Certificate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchTable.setShowGrid(true);
        jScrollPane1.setViewportView(searchTable);
        if (searchTable.getColumnModel().getColumnCount() > 0) {
            searchTable.getColumnModel().getColumn(0).setResizable(false);
            searchTable.getColumnModel().getColumn(1).setResizable(false);
            searchTable.getColumnModel().getColumn(2).setResizable(false);
            searchTable.getColumnModel().getColumn(3).setResizable(false);
            searchTable.getColumnModel().getColumn(4).setResizable(false);
            searchTable.getColumnModel().getColumn(5).setResizable(false);
            searchTable.getColumnModel().getColumn(6).setResizable(false);
            searchTable.getColumnModel().getColumn(7).setResizable(false);
            searchTable.getColumnModel().getColumn(8).setResizable(false);
        }

        yearSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "2016", "2017", "2018", "2019", "2020", "2021" }));
        yearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearSearchActionPerformed(evt);
            }
        });

        modelSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Hyundai", "Honda", "Toyota", "Tesla", "Chevrolet", "BMW" }));
        modelSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Year");

        searchMaster.setText("Advanced Search");
        searchMaster.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMasterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Brand");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("City");

        citySearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "Boston", "New York", "New Jersey", "California" }));
        citySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citySearchActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(153, 204, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(citySearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(647, 1000, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(modelSearch, javax.swing.GroupLayout.Alignment.LEADING, 0, 107, Short.MAX_VALUE)
                                        .addComponent(yearSearch, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(searchMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(citySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(searchMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMasterActionPerformed
        super.dispose();
        AdvancedSearch advancedSearch = new AdvancedSearch(carList);
        advancedSearch.setVisible(true);
    }//GEN-LAST:event_searchMasterActionPerformed

    private void modelSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelSearchActionPerformed
        List<CarProperties> modelList = new ArrayList<CarProperties>();
        modelList = searchModel(carList);
    }//GEN-LAST:event_modelSearchActionPerformed

    private void yearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearSearchActionPerformed
        List<CarProperties> yearList = new ArrayList<CarProperties>();
        yearList = searchYear(carList);
    }//GEN-LAST:event_yearSearchActionPerformed

    private void citySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citySearchActionPerformed
        List<CarProperties> cityList = new ArrayList<CarProperties>();
        cityList = searchCity(carList);
    }//GEN-LAST:event_citySearchActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        super.dispose();
        DashboardPanel dashboardPanel = new DashboardPanel(carList);
        dashboardPanel.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SearchCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchCars().setVisible(true);
            }
        });
    }
    
    private void initImage() {
        ImagePanel jPanel1 = new ImagePanel("src/assets/advanced-search.jpeg");
        
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
    }
    

    
    private void fillData() {
        DefaultTableModel dtm = (DefaultTableModel) searchTable.getModel();
        dtm.setRowCount(0);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( SwingConstants.CENTER );
        searchTable.setDefaultRenderer(String.class, centerRenderer);
        
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) searchTable.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);
        
        for(int x=0; x < searchTable.getColumnCount(); x++){
         searchTable.getColumnModel().getColumn(x).setCellRenderer( centerRenderer );
        }
        
        for(CarProperties car : carList){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = car.getBrandName();
            row[1] = car.getModelName();
            row[2] = car.getCarSerialNumber();
            row[3] = car.getCarMaxSeats();
            row[4] = car.getCarMinSeats();
            row[5] = car.getCarCity();
            row[6] = car.getCarYear();
            row[7] = "Available";//setAvailable();
            row[8] = "Certified";//setCertificate();
            dtm.addRow(row);
        }
    }
    
    private List<CarProperties> searchYear(List<CarProperties> carList) {
        List<CarProperties> yearList = new ArrayList<CarProperties>();
        String yearString = "";
        String searchString = "";
        yearString = String.valueOf(yearSearch.getItemAt(yearSearch.getSelectedIndex()));
        searchString = yearSearch.getItemAt(yearSearch.getSelectedIndex());
        for(CarProperties car: carList){
            if(!yearString.equals("All")){
            if (car.getCarYear() == Integer.parseInt(yearString)){
                if (car.getBrandName().equals(searchString)){
                    yearList.add(car);
                }else{
                    yearList.add(car);
                }
            }
            }
        }
         for(CarProperties car: carList){
        if(yearString.equals("All")){
            yearList.add(car);
         }
         }
        DefaultTableModel dtm = (DefaultTableModel) searchTable.getModel();
        dtm.setRowCount(0);
        for(CarProperties car : yearList){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = car.getBrandName();
            row[1] = car.getModelName();
            row[2] = car.getCarSerialNumber();
            row[3] = car.getCarMaxSeats();
            row[4] = car.getCarMinSeats();
            row[5] = car.getCarCity();
            row[6] = car.getCarYear();

            
            dtm.addRow(row);
        }
        return yearList;
    }
    
    private List<CarProperties> searchModel(List<CarProperties> carList) {
        List<CarProperties> modelFound = new ArrayList<CarProperties>();
        String modelString = "";
        String searchString = "";
        modelString = String.valueOf(modelSearch.getItemAt(modelSearch.getSelectedIndex()));
        searchString = modelSearch.getItemAt(modelSearch.getSelectedIndex());
        for(CarProperties car: carList){
            if(!modelString.equals("All")){
            if (car.getBrandName() == String.valueOf(modelString)){
                if (car.getBrandName().equals(searchString)){
                    modelFound.add(car);
                }else{
                    modelFound.add(car);
                }
            }
            }
        }
         for(CarProperties car: carList){
        if(modelString.equals("All")){
            modelFound.add(car);
         }
         }
        DefaultTableModel dtm = (DefaultTableModel) searchTable.getModel();
        dtm.setRowCount(0);
        for(CarProperties car : modelFound){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = car.getBrandName();
            row[1] = car.getModelName();
            row[2] = car.getCarSerialNumber();
            row[3] = car.getCarMaxSeats();
            row[4] = car.getCarMinSeats();
            row[5] = car.getCarCity();
            row[6] = car.getCarYear();

            
            dtm.addRow(row);
        }
        return modelFound;
    }
    
    private List<CarProperties> searchCity(List<CarProperties> carList) {
        List<CarProperties> cityFound = new ArrayList<CarProperties>();
        String cityName = "";
        String searchString = "";
        cityName = String.valueOf(citySearch.getItemAt(citySearch.getSelectedIndex()));
        searchString = citySearch.getItemAt(citySearch.getSelectedIndex());
        for(CarProperties car: carList){
            if(!cityName.equals("All")){
            if (car.getCarCity() == String.valueOf(cityName)){
                if (car.getCarCity().equals(searchString)){
                    cityFound.add(car);
                }else{
                    cityFound.add(car);
                }
            }
            }
        }
        for(CarProperties car: carList){
            if(cityName.equals("All")){
                cityFound.add(car);
            }
         }
        DefaultTableModel dtm = (DefaultTableModel) searchTable.getModel();
        dtm.setRowCount(0);
        for(CarProperties car : cityFound){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = car.getBrandName();
            row[1] = car.getModelName();
            row[2] = car.getCarSerialNumber();
            row[3] = car.getCarMaxSeats();
            row[4] = car.getCarMinSeats();
            row[5] = car.getCarCity();
            row[6] = car.getCarYear();

            
            dtm.addRow(row);
        }
        return cityFound;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> citySearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> modelSearch;
    private javax.swing.JButton searchMaster;
    private javax.swing.JTable searchTable;
    private javax.swing.JComboBox<String> yearSearch;
    // End of variables declaration//GEN-END:variables
}
