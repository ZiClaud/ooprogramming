package oop.swing;

import javax.swing.*;
import java.awt.*;

public class CelsiusConverterLayout extends JFrame {
    private final JButton CFButton;
    private final JButton FCButton;
    private final JTextField fahrenheitTF;
    private final JTextField celsiusTF;

    public CelsiusConverterLayout() {
        super();
        celsiusTF = new JTextField("0");
        fahrenheitTF = new JTextField("32");
        CFButton = new JButton("°C->°F");
        FCButton = new JButton("°F->°C");

        JPanel p1 = new JPanel(new GridLayout(2, 2));
        p1.add(celsiusTF);
        p1.add(new JLabel("°C"));
        p1.add(fahrenheitTF);
        p1.add(new JLabel("°F"));

        JPanel p2 = new JPanel(new GridLayout(1, 2));
        p2.add(CFButton);
        p2.add(FCButton);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(p1, BorderLayout.CENTER);
        mainPanel.add(p2, BorderLayout.PAGE_END);

        /* JFrame methods called */
        setContentPane(mainPanel);
        setTitle("Celsius Converter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(200, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CelsiusConverterLayout::new);
    }
}


