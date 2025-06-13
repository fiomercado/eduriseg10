package model;

import javax.swing.*;
import java.awt.*;

public class CustomForm extends JPanel {

    public CustomForm() {
        setOpaque(false);  // optional if you're using transparent panels
        initComponents();
    }

    private void initComponents() {
        JLabel titleLabel = new JLabel("Custom Form");
        titleLabel.setFont(new Font("Century Gothic", Font.BOLD, 24));
        titleLabel.setForeground(new Color(79, 79, 79));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        setLayout(new BorderLayout());
        add(titleLabel, BorderLayout.CENTER);
    }
}