import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class RentHouseDetails extends javax.swing.JFrame {

    private final Connection connection;
    public ResultSet resultSet;
    public PreparedStatement statement;

    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> jComboBoxFloor;
    private javax.swing.JLabel jLabelHouseNumber;
    private javax.swing.JLabel jLabelFloor;
    private javax.swing.JLabel jLabelTentant;
    private javax.swing.JLabel jLabelHouseNumber2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldHouseNumber1;
    private javax.swing.JTextField jTextFieldTentant;
    private javax.swing.JTextField jTextFieldHouseNumber2;
    private javax.swing.JButton searchSpecific;
    private javax.swing.JButton showButton;

    public RentHouseDetails() {
        super("Пошук Оренда");
        initComponents();
        connection = ConnectionManager.getConnection();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentHouseDetails().setVisible(true);
            }
        });
    }

    public void jTable1() {
        try {
            String sql = "select house_number, floor, apartment_number, tentant_name, contact, rent_price from house_rent where house_number=? AND status= true";
            statement = connection.prepareStatement(sql);
            statement.setString(1, jTextFieldHouseNumber2.getText());
            resultSet = statement.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {

        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelHouseNumber = new javax.swing.JLabel();
        jLabelTentant = new javax.swing.JLabel();
        jTextFieldTentant = new javax.swing.JTextField();
        jTextFieldHouseNumber1 = new javax.swing.JTextField();
        searchSpecific = new javax.swing.JButton();
        jComboBoxFloor = new javax.swing.JComboBox<>();
        jLabelFloor = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jTextFieldHouseNumber2 = new javax.swing.JTextField();
        showButton = new javax.swing.JButton();
        jLabelHouseNumber2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 250, 240));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Заголовок 1", "Заголовок 2", "Заголовок 3", "Заголовок 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelHouseNumber.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelHouseNumber.setText("Номер будинку");


        jLabelTentant.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelTentant.setText("Орендар");

        jTextFieldTentant.setEditable(false);
        jTextFieldTentant.setFont(new java.awt.Font("Tahoma", 1, 11));

        jTextFieldHouseNumber1.setFont(new java.awt.Font("Tahoma", 1, 11));

        searchSpecific.setFont(new java.awt.Font("Tahoma", 1, 11));
        searchSpecific.setText("Шукати");
        searchSpecific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });

        jComboBoxFloor.setFont(new java.awt.Font("Tahoma", 1, 11));
        jComboBoxFloor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th"}));

        jLabelFloor.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelFloor.setText("Поверх");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabelTentant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextFieldTentant, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(searchSpecific))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFieldHouseNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelFloor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBoxFloor, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelHouseNumber)
                                        .addComponent(jTextFieldHouseNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabelFloor)
                                                .addComponent(jComboBoxFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelTentant)
                                        .addComponent(jTextFieldTentant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchSpecific))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addContainerGap())
        );

        backButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        backButton.setText("Назад");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jTextFieldHouseNumber2.setFont(new java.awt.Font("Tahoma", 1, 11));

        showButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        showButton.setText("Показати");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show1ActionPerformed(evt);
            }
        });

        jLabelHouseNumber2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelHouseNumber2.setText("Номер будинку");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabelHouseNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTextFieldHouseNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(showButton)
                                                                .addGap(0, 1, Short.MAX_VALUE)))))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelHouseNumber2)
                                                        .addComponent(jTextFieldHouseNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(showButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String sql = "SELECT tentant_name FROM house_rent WHERE house_number=? AND floor=? AND status = TRUE";
            statement = connection.prepareStatement(sql);
            statement.setString(1, jTextFieldHouseNumber1.getText());
            statement.setString(2, (String) jComboBoxFloor.getSelectedItem());
            resultSet = statement.executeQuery();
            System.out.println(statement);
            System.out.println(resultSet.toString());
            if (resultSet.next()) {

                String add2 = resultSet.getString("tentant_name");
                jTextFieldTentant.setText(add2);

            } else {
                JOptionPane.showMessageDialog(null, "Не знайдено...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        SecondHome ob = new SecondHome();
        ob.setVisible(true);
    }


    private void show1ActionPerformed(java.awt.event.ActionEvent evt) {
        jTable1();
    }
}
