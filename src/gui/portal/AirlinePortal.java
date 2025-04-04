package gui.portal;
import javax.swing.*;
import gui.receipt.Receipt;
import reservation.customer.RailwayCustomers;
import reservation.transport.Transport;

import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Color;

public class AirlinePortal extends JFrame {
    // Panel
    private JPanel mainPanel;
    // Label
    private JLabel fnameLabel;
    private JLabel lnameLabel;
    private JLabel phoneLabel;
    private JLabel emailLabel;
    private JLabel priceLabel;
    private JLabel ageLabel;
    private JLabel genderLabel;
    private JLabel addressLabel;
    private JLabel sourceLabel;
    private JLabel destinLabel;
    private JLabel classLabel;
    // Textfield
    private JTextField fnameField;
    private JTextField lnameField;
    private JTextField phoneField;
    private JTextField emailField;
    private JTextField priceField;
    private JTextField ageField;
    private JTextField addressField;
    // Radio button
    JRadioButton male, female;
    // Combo box
    JComboBox<String> sources, destinations,classes;
    // Button
    private JButton submit, generateReceipt;
    // Check box
    private JCheckBox term;

    private RailwayCustomers railwayCustomers;

    public AirlinePortal() {
        // it is for the title
        super("Airline Portal");
        railwayCustomers = new RailwayCustomers();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // It manage size of window
        setSize(700, 500);
        setLocationRelativeTo(null);
        // It is for Creating panel in frame
        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        fnameLabel = new JLabel("First Name:");
        fnameLabel.setBounds(20, 50, 100, 20);
        fnameLabel.setForeground(Color.WHITE);
        mainPanel.add(fnameLabel);
        fnameField = new JTextField();
        fnameField.setBounds(130, 50, 100, 20);
        mainPanel.add(fnameField);

        lnameLabel = new JLabel("Last Name:");
        lnameLabel.setBounds(20, 100, 100, 20);
        lnameLabel.setForeground(Color.WHITE);
        mainPanel.add(lnameLabel);
        lnameField = new JTextField();
        lnameField.setBounds(130, 100, 100, 20);
        mainPanel.add(lnameField);

        sourceLabel = new JLabel("Source");
        sourceLabel.setBounds(350, 200, 100, 20);
        sourceLabel.setForeground(Color.WHITE);
        mainPanel.add(sourceLabel);
        String[] source = { "Karachi", "Faislabad", "Hyderabad", "Sukkur", "Islamabad", "Multan", "Rawalpindi",
                "Peshawar", "Quetta", "Zhob" };
        sources = new JComboBox<>(source);
        sources.setBounds(400, 200, 100, 20);
        mainPanel.add(sources);

        destinLabel = new JLabel("Destination");
        destinLabel.setBounds(330, 250, 100, 20);
        destinLabel.setForeground(Color.WHITE);
        mainPanel.add(destinLabel);
        String[] destination = { "Hyderabad", "Karachi", "Faislabad,", "Islamabad", "Multan", "Rawalpindi", "Peshawar",
                "Quetta", "Zhob" };
        destinations = new JComboBox<>(destination);
        destinations.setBounds(400, 250, 100, 20);
        mainPanel.add(destinations);

     ///
         classLabel = new JLabel(" Train Class");
        classLabel.setBounds(320, 300, 100, 20);
        classLabel.setForeground(Color.WHITE);
        mainPanel.add(classLabel);
        String[] Class = { "Economy","Buisness","Standard" };
        classes = new JComboBox<>(Class);
        classes.setBounds(400, 300, 100, 20);
        mainPanel.add(classes);

        phoneLabel = new JLabel("Phone No:");
        phoneLabel.setBounds(20, 150, 100, 20);
        phoneLabel.setForeground(Color.WHITE);
        mainPanel.add(phoneLabel);
        phoneField = new JTextField();
        phoneField.setBounds(130, 150, 150, 20);
        mainPanel.add(phoneField);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 200, 100, 20);
        emailLabel.setForeground(Color.WHITE);
        mainPanel.add(emailLabel);
        emailField = new JTextField();
        emailField.setBounds(130, 200, 170, 20);
        mainPanel.add(emailField);

        priceLabel = new JLabel("Price:");
        priceLabel.setBounds(20, 250, 100, 20);
        priceLabel.setForeground(Color.WHITE);
        mainPanel.add(priceLabel);
        priceField = new JTextField();
        priceField.setBounds(130, 250, 100, 20);
        mainPanel.add(priceField);

        ageLabel = new JLabel("Age:");
        ageLabel.setBounds(20, 300, 100, 20);
        ageLabel.setForeground(Color.WHITE);
        mainPanel.add(ageLabel);
        ageField = new JTextField();
        ageField.setBounds(130, 300, 100, 20);
        mainPanel.add(ageField);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 350, 100, 20);
        genderLabel.setForeground(Color.WHITE);
        mainPanel.add(genderLabel);
        // It is for creationg radio buttons
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(130, 350, 80, 20);
        female.setBounds(220, 350, 80, 20);
        mainPanel.add(male);
        mainPanel.add(female);
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 400, 100, 20);
        addressLabel.setForeground(Color.WHITE);
        mainPanel.add(addressLabel);
        addressField = new JTextField();
        addressField.setBounds(120, 400, 250, 60);
        mainPanel.add(addressField);

        term = new JCheckBox("Please accept terms and conditions.!");
        term.setBounds(380, 440, 300, 20);
        term.setForeground(Color.black);
        term.setBackground(Color.CYAN);
        mainPanel.add(term);

        submit = new JButton("Submit");
        submit.setBounds(400, 400, 100, 20);
        mainPanel.add(submit);

        generateReceipt = new JButton("Generate Receipt");
        generateReceipt.setBounds(520, 400, 150, 20);
        mainPanel.add(generateReceipt);
        
        mainPanel.setLayout(new FlowLayout());

        generateReceipt.addActionListener(new ActionListener() {
            private Transport railway;

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Receipt(railwayCustomers,railway);
            }
        });

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                railwayCustomers.addToList(fnameField.getText(), lnameField.getText(), phoneField.getText(),
                        emailField.getText(), Integer.parseInt(ageField.getText()),
                        Integer.parseInt(priceField.getText()));

                fnameField.setText("");
                lnameField.setText("");
                emailField.setText("");
                phoneField.setText("");
                ageField.setText("");
                priceField.setText("");
                addressField.setText("");
            }
        });

        setContentPane(mainPanel);
        ImageIcon imageIcon = new ImageIcon(
                "C:\\Users\\Msaif\\OneDrive\\Desktop\\merakam\\merakam (2)\\merakam\\merakam\\saifProject\\src\\image\\newairline.jpg"); // Replace with the
                                                                          // actual path to your
                                                                          // image file

        JLabel img = new JLabel(imageIcon);
        img.setBounds(0, 20, 5, 5);
        mainPanel.add(img);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(img, BorderLayout.NORTH);

        setSize(800, 575);
        mainPanel.setBackground(Color.blue);


        setVisible(true);
        setFocusable(true);
        setLocationRelativeTo(null);

    }

    

}
