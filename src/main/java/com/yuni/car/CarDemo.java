package com.yuni.car;

import javax.swing.*;

public class CarDemo {
    private JPanel main;
    private JTextField north;
    private JButton button1;
    private JTextField textField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new  CarDemo().main);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
