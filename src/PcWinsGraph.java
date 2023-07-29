

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

//παραθυρο που ενημερωνει το χρηστη οτι ο υπολογιστης κερδισε το duidoku
public class PcWinsGraph extends JFrame {

    // δημιουργει το παραθυρο που ενημερωνει το χρηστη οτι ο υπολογιστης κερδισε το duidoku
    public PcWinsGraph() {
        FlowLayout layout = new FlowLayout();
        layout.setHgap(20);
        layout.setVgap(10);
        layout.setAlignment(FlowLayout.LEADING);
        JLabel label = new JLabel("PC Wins!");
        setLayout(layout);
        add(label);
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLocationRelativeTo(null);
        setVisible(true);


    }
}
