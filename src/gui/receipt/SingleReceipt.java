package gui.receipt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SingleReceipt extends JPanel {

    private JLabel idLabel;
    private JLabel fnameLabel;
    private JLabel lnameLabel;
    private JLabel emailLabel;
    private JLabel ageLabel;
    private JLabel priceLabel;
    private JLabel receiptLabel;
    private JLabel sourceLabel;
    private JLabel destinationLabel;

    public SingleReceipt(int id, String fname, String lname, String phone, String email, int age, int price,
            String receipt, String source, String destination) {

        receiptLabel = new JLabel("-------Ticket Receipt------\t\t\t");
        idLabel = new JLabel("ID :\n\n " + id);
        fnameLabel = new JLabel("First name :\n\n " + fname);
        lnameLabel = new JLabel("\nLast name  : " + lname);
        emailLabel = new JLabel("\nEmail      : " + email);
        ageLabel = new JLabel("\nAge        : " + age);
        priceLabel = new JLabel("\nPrice      : " + price);
        sourceLabel = new JLabel("\nSource : " + source);
        destinationLabel = new JLabel("\nDestination : " + destination);

        add(receiptLabel);
        add(idLabel);
        add(fnameLabel);
        add(lnameLabel);
        add(emailLabel);
        add(ageLabel);
        add(priceLabel);
        add(sourceLabel);
        add(destinationLabel);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.green);
    }
}
