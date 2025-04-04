package gui.ticket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import reservation.customer.AirLineCustomers;
import reservation.customer.BusCustomers;
import reservation.customer.RailwayCustomers;

public class RailwayTicket extends JFrame {

    private RailwayCustomers railwayCustomers;
    private AirLineCustomers airLineCustomers;
    private BusCustomers busCustomers;

    public RailwayTicket(RailwayCustomers railwayCustomers) {
        this.railwayCustomers = railwayCustomers;
    }

    public RailwayTicket(AirLineCustomers airLineCustomers) {
        this.airLineCustomers = airLineCustomers;
    }
    public RailwayTicket(BusCustomers busCustomers) {
        this.busCustomers = busCustomers;
    }
}
