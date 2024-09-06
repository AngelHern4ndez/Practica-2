package Practica_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operaciones {
    private JPanel panel1;
    private JLabel jLabNum1;
    private JLabel jLabNum2;
    private JTextField textField1;
    private JTextField textField2;
    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    int num1;
    int num2;

    public Operaciones() {

        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(textField1.getText());
                num2 = Integer.parseInt(textField2.getText());
                JOptionPane.showMessageDialog(null, "La suma es: " + (num1 + num2));
            }
        });
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(textField1.getText());
                num2 = Integer.parseInt(textField2.getText());
                JOptionPane.showMessageDialog(null, "La suma es: " + (num1 - num2));
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(textField1.getText());
                num2 = Integer.parseInt(textField2.getText());
                JOptionPane.showMessageDialog(null, "La multiplicacion es: " + (num1 * num2));
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(textField1.getText());
                num2 = Integer.parseInt(textField2.getText());
                JOptionPane.showMessageDialog(null, "La division es: " + (num1 / num2));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de dos numeros enteros.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setContentPane(new Operaciones().panel1);

        frame.pack();
        frame.setVisible(true);
    }
}
