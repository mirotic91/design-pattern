package me.mirotic.designpattern.structure.composite.example;

import javax.swing.*;

public class SwingEx {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        JTextField textField = new JTextField();
        textField.setBounds(200, 200, 100, 50);
        frame.add(textField);

        JButton button = new JButton("Click");
        button.setBounds(200, 100, 50, 50);
        button.addActionListener(x -> textField.setText("Hello World!"));
        frame.add(button);
    }


}
