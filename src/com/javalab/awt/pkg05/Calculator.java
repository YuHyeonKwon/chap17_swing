package com.javalab.awt.pkg05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

  private JPanel panel;
  private JTextField textField;
  private JButton[] buttons;
  private String[] buttonLabels = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", ".", "0", "=", "/"};

  private double value1 = 0.0;
  private double value2 = 0.0;
  private String operator = "";

  public Calculator() {
    super("Calculator");

    panel = new JPanel();
    panel.setLayout(new GridLayout(4, 4));

    textField = new JTextField();
    textField.setHorizontalAlignment(JTextField.RIGHT);
    textField.setEditable(false);

    buttons = new JButton[16];

    for (int i = 0; i < 16; i++) {
      buttons[i] = new JButton(buttonLabels[i]);
      buttons[i].addActionListener(this);
      panel.add(buttons[i]);
    }

    add(textField, BorderLayout.NORTH);
    add(panel, BorderLayout.CENTER);
  }

  private void calculate() {
    double result = 0.0;
    if (operator.equals("+")) {
      result = value1 + value2;
    } else if (operator.equals("-")) {
      result = value1 - value2;
    } else if (operator.equals("*")) {
      result = value1 * value2;
    } else if (operator.equals("/")) {
      result = value1 / value2;
    }
    textField.setText(String.valueOf(result));
  }

  public void actionPerformed(ActionEvent e) {
    String actionCommand = e.getActionCommand();

    if (actionCommand.equals("+")) {
      value1 = Double.parseDouble(textField.getText());
      operator = "+";
      textField.setText("");
    } else if (actionCommand.equals("-")) {
      value1 = Double.parseDouble(textField.getText());
      operator = "-";
      textField.setText("");
    } else if (actionCommand.equals("*")) {
      value1 = Double.parseDouble(textField.getText());
      operator = "*";
      textField.setText("");
    } else if (actionCommand.equals("/")) {
      value1 = Double.parseDouble(textField.getText());
      operator = "/";
      textField.setText("");
    } else if (actionCommand.equals("=")) {
      value2 = Double.parseDouble(textField.getText());
      calculate();
      operator = "";
    } else {
      textField.setText(textField.getText() + actionCommand);
    }
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.setSize(300, 300);
    calculator.setLocationRelativeTo(null);
    calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    calculator.setVisible(true);
  }
}
