package gui.receipt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import reservation.customer.*;
import reservation.transport.*;

public class Receipt extends JFrame {

    private Customers customers;
    private Transport transport;
    private JPanel mainPanel;
    private JScrollPane scrollPane;

    public Receipt(Customers customers, Transport transport) {
        this.customers = customers;
        this.transport = transport;
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        makeSingleReceipts();
        // getContentPane().add(scrollPane);
        add(mainPanel);

        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void makeSingleReceipts() {
        for (int i = 0; i < customers.getTotalPassenger(); i++) {
            SingleReceipt temp = new SingleReceipt(transport.getIdAt(i), customers.getFnameAt(i),
                    customers.getLnameAt(i),
                    customers.getPhoneNoAt(i), customers.getEmailAt(i), customers.getAgeAt(i),
                    customers.getPriceAt(i), customers.getReceiptAt(i), transport.getSourceAt(i),
                    transport.getDestinationAt(i));
            mainPanel.add(temp);
        }
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    }

}
