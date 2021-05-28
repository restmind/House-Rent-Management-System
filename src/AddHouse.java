import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class AddHouse extends javax.swing.JFrame {

    private final Connection connection;

    private javax.swing.JButton sellButton;
    private javax.swing.JButton rentButton;
    private javax.swing.JComboBox<String> jComboBoxFloor;
    private javax.swing.JLabel jLabelHouseNumber;
    private javax.swing.JLabel jLabelFloor;
    private javax.swing.JLabel jLabelApartmentNumber;
    private javax.swing.JLabel jLabelTentantName;
    private javax.swing.JLabel jLabelContactNumber;
    private javax.swing.JLabel jLabelRentPrice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldHouseNumber;
    private javax.swing.JTextField jTextFieldTentantName;
    private javax.swing.JTextField jTextFieldContact;
    private javax.swing.JTextField jTextFieldRentPrice;
    private javax.swing.JTextField jTextFieldApartmentNumber;

    public AddHouse() {
        super("Додати нову квартиру");
        initComponents();
        connection = ConnectionManager.getConnection();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddHouse().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBoxFloor = new javax.swing.JComboBox<>();
        sellButton = new javax.swing.JButton();
        jLabelRentPrice = new javax.swing.JLabel();
        rentButton = new javax.swing.JButton();
        jLabelTentantName = new javax.swing.JLabel();
        jLabelFloor = new javax.swing.JLabel();
        jLabelApartmentNumber = new javax.swing.JLabel();
        jTextFieldRentPrice = new javax.swing.JTextField();
        jTextFieldContact = new javax.swing.JTextField();

        jLabelHouseNumber = new javax.swing.JLabel();
        jTextFieldApartmentNumber = new javax.swing.JTextField();
        jTextFieldHouseNumber = new javax.swing.JTextField();
        jTextFieldTentantName = new javax.swing.JTextField();
        jLabelContactNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jComboBoxFloor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxFloor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th"}));

        sellButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sellButton.setText("Продаж");
        sellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabelRentPrice.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelRentPrice.setText("Ціна");


        rentButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        rentButton.setText("Оренда");
        rentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        jLabelTentantName.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelTentantName.setText("Ім'я орендаря");

        jLabelFloor.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelFloor.setText("Поверх");

        jLabelApartmentNumber.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelApartmentNumber.setText("Номер квартири");

        jTextFieldRentPrice.setFont(new java.awt.Font("Tahoma", 1, 11));

        jTextFieldContact.setFont(new java.awt.Font("Tahoma", 1, 11));

        jLabelHouseNumber.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelHouseNumber.setText("Номер будинку");

        jTextFieldApartmentNumber.setFont(new java.awt.Font("Tahoma", 1, 11));

        jTextFieldHouseNumber.setFont(new java.awt.Font("Tahoma", 1, 11));

        jTextFieldTentantName.setFont(new java.awt.Font("Tahoma", 1, 11));

        jLabelContactNumber.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelContactNumber.setText("Номер телефону");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabelHouseNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabelFloor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabelApartmentNumber, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextFieldHouseNumber)
                                                        .addComponent(jComboBoxFloor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldTentantName)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabelRentPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabelContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelTentantName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(sellButton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(rentButton))
                                                        .addComponent(jTextFieldContact)
                                                        .addComponent(jTextFieldRentPrice)
                                                        .addComponent(jTextFieldApartmentNumber))))
                                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelHouseNumber)
                                        .addComponent(jTextFieldHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelFloor)
                                        .addComponent(jComboBoxFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelApartmentNumber)
                                        .addComponent(jTextFieldApartmentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelTentantName)
                                        .addComponent(jTextFieldTentantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelContactNumber)
                                        .addComponent(jTextFieldContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelRentPrice)
                                        .addComponent(jTextFieldRentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rentButton)
                                        .addComponent(sellButton))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String sql = "INSERT INTO `house_sell`(`house_number`, `floor`, `apartment_number`, `tentant_name`, `contact`, `rent_price`, `status`) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, jTextFieldHouseNumber.getText());
            statement.setString(2, (String) jComboBoxFloor.getSelectedItem());
            statement.setString(3, jTextFieldApartmentNumber.getText());
            statement.setString(4, jTextFieldTentantName.getText());
            statement.setString(5, jTextFieldContact.getText());
            statement.setInt(6, Integer.parseInt(jTextFieldRentPrice.getText()));
            statement.setBoolean(7, true);

            statement.execute();
            JOptionPane.showMessageDialog(null, "Квартира успішно додана...");
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        setVisible(false);
        SecondHome ob = new SecondHome();
        ob.setVisible(true);
    }

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String sql = "INSERT INTO `house_rent`(`house_number`, `floor`, `apartment_number`, `tentant_name`, `contact`, `rent_price`, `status`) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, jTextFieldHouseNumber.getText());
            statement.setString(2, (String) jComboBoxFloor.getSelectedItem());
            statement.setString(3, jTextFieldApartmentNumber.getText());
            statement.setString(4, jTextFieldTentantName.getText());
            statement.setString(5, jTextFieldContact.getText());
            statement.setInt(6, Integer.parseInt(jTextFieldRentPrice.getText()));
            statement.setBoolean(7, true);

            statement.execute();
            JOptionPane.showMessageDialog(null, "Квартира успішно додана...");
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        setVisible(false);
        SecondHome ob = new SecondHome();
        ob.setVisible(true);
    }
}
