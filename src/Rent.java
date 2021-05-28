import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.TimeUnit;


public class Rent extends javax.swing.JFrame {

    private final Connection conn;
    private ResultSet resultSet;
    private  PreparedStatement statement;

    private javax.swing.JButton countButton;
    private javax.swing.JButton rentButton;
    private javax.swing.JComboBox<String> jComboBoxFloor;
    private com.toedter.calendar.JDateChooser jDateChooserFromRentingDate;
    private javax.swing.JLabel jLabelHouseNumber;
    private javax.swing.JLabel jLabelApartmentNumber;
    private javax.swing.JLabel jLabelFrom;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelDateFrom;
    private javax.swing.JLabel jLabelFloor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldHouseNumber;
    private javax.swing.JTextField jTextFieldApartmentNumber;
    private com.toedter.calendar.JDateChooser jDateChooserToRentingDate;
    private javax.swing.JTextField jTextFieldTotal;

    public Rent() {
        super("Оренда");
        initComponents();
        conn = ConnectionManager.getConnection();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rent().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDateChooserFromRentingDate = new com.toedter.calendar.JDateChooser();
        jDateChooserFromRentingDate.setDateFormatString("yyyy-MM-dd");
        jTextFieldHouseNumber = new javax.swing.JTextField();
        jTextFieldApartmentNumber = new javax.swing.JTextField();
        jLabelDateFrom = new javax.swing.JLabel();
        jLabelHouseNumber = new javax.swing.JLabel();
        jLabelApartmentNumber = new javax.swing.JLabel();
        jLabelFloor = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jComboBoxFloor = new javax.swing.JComboBox<>();
        jDateChooserToRentingDate = new com.toedter.calendar.JDateChooser();
        jDateChooserToRentingDate.setDateFormatString("yyyy-MM-dd");
        countButton = new javax.swing.JButton();
        rentButton = new javax.swing.JButton();
        jLabelFrom = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jTextFieldHouseNumber.setFont(new java.awt.Font("Tahoma", 1, 11));

        jTextFieldApartmentNumber.setFont(new java.awt.Font("Tahoma", 1, 11));

        jLabelDateFrom.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelDateFrom.setText("Від");

        jLabelHouseNumber.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelHouseNumber.setText("Номер Будинку");

        jLabelFloor.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelFloor.setText("Поверх");

        jLabelApartmentNumber.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelApartmentNumber.setText("Номер Квартири");

        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 1, 11));

        jComboBoxFloor.setFont(new java.awt.Font("Tahoma", 1, 11));
        jComboBoxFloor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th"}));

        jDateChooserToRentingDate.setFont(new java.awt.Font("Tahoma", 1, 11));

        countButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        countButton.setText("Вартість");
        countButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });


        rentButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        rentButton.setText("Орендувати");
        rentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        jLabelFrom.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelFrom.setText("До");

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelTotal.setText("Загалом");


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelHouseNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelApartmentNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelDateFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelFloor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelFrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(countButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(rentButton))
                                        .addComponent(jDateChooserToRentingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, Short.MAX_VALUE)
                                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, Short.MAX_VALUE)
                                        .addComponent(jTextFieldHouseNumber)
                                        .addComponent(jTextFieldApartmentNumber)
                                        .addComponent(jComboBoxFloor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDateChooserFromRentingDate, GroupLayout.PREFERRED_SIZE, 143, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addContainerGap(48, Short.MAX_VALUE)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelHouseNumber)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextFieldHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelFloor)
                                                        .addComponent(jComboBoxFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelApartmentNumber)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextFieldApartmentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelDateFrom))
                                        .addComponent(jDateChooserFromRentingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelFrom)
                                        .addComponent(jDateChooserToRentingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelTotal)
                                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rentButton)
                                        .addComponent(countButton))
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
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String sql = "SELECT rent_price FROM house_rent WHERE house_number=? AND floor=? AND status = TRUE";
            statement = conn.prepareStatement(sql);
            statement.setString(1, jTextFieldHouseNumber.getText());
            statement.setString(2, (String) jComboBoxFloor.getSelectedItem());

            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                long month = jDateChooserToRentingDate.getDate().getTime() - jDateChooserFromRentingDate.getDate().getTime();
                TimeUnit time = TimeUnit.DAYS;
                long diffrence = time.convert(month, TimeUnit.MILLISECONDS);
                long result = resultSet.getInt("rent_price") * diffrence / 30;

                jTextFieldTotal.setText(Long.toString(result));
            } else {
                JOptionPane.showMessageDialog(null, "Не знайдено...");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String sql = "INSERT INTO rent(`house_number`, `floor`, `apartment_number`, date_from, `date_to`) VALUES (?,?,?,?,?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, jTextFieldHouseNumber.getText());
            statement.setString(2, (String) jComboBoxFloor.getSelectedItem());
            statement.setString(3, jTextFieldApartmentNumber.getText());
            statement.setString(4, ((JTextField) jDateChooserFromRentingDate.getDateEditor().getUiComponent()).getText());
            statement.setString(5, ((JTextField) jDateChooserToRentingDate.getDateEditor().getUiComponent()).getText());

            statement.execute();
            JOptionPane.showMessageDialog(null, "Успішно орендовано...");
            resultSet.close();
            statement.close();
            houseAreRented();

            setVisible(false);
            SecondHome ob = new SecondHome();
            ob.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void houseAreRented(){
        try {
            String query = "UPDATE house_rent SET status = FALSE WHERE  house_number=? AND apartment_number=?";
            statement = conn.prepareStatement(query);
            statement.setString(1, jTextFieldHouseNumber.getText());
            statement.setString(2, jTextFieldApartmentNumber.getText());
            statement.execute();
            statement.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
