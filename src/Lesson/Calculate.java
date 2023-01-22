package Lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculate extends JFrame {
    Obrabotchik obr = new Obrabotchik();
    JPanel windows;
    JPanel panelButton;
    JTextField display;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton ravno;
    JButton plus;
    JButton minus;
    JButton mul;
    JButton delenie;
    JButton clean;
    JButton buttonEmpty;
    JButton buttonEmpty1;
    JButton buttonEmpty2;

    JButton point;
    double a = 0;
    double b = 0;
    double res = 0;
    int operator = 0;

    public Calculate() {
        super("Калькулятор");
        windows = new JPanel();
        obr = new Obrabotchik();


        windows.setLayout(new BorderLayout());
        display = new JTextField(30);
        windows.add("North", display);
        Font BigFontTR = new Font("TimesRoman", Font.BOLD, 30);
        display.setFont(BigFontTR);

        buttonEmpty = new JButton("");
        buttonEmpty1 = new JButton("");
        buttonEmpty2 = new JButton("");

        button0 = new JButton("0");
        button0.setFont(BigFontTR);
        button0.addActionListener(obr);
        button1 = new JButton("1");
        button1.setFont(BigFontTR);
        button1.addActionListener(obr);
        button2 = new JButton("2");
        button2.setFont(BigFontTR);
        button2.addActionListener(obr);
        button3 = new JButton("3");
        button3.setFont(BigFontTR);
        button3.addActionListener(obr);
        button4 = new JButton("4");
        button4.setFont(BigFontTR);
        button4.addActionListener(obr);
        button5 = new JButton("5");
        button5.setFont(BigFontTR);
        button5.addActionListener(obr);
        button6 = new JButton("6");
        button6.setFont(BigFontTR);
        button6.addActionListener(obr);
        button7 = new JButton("7");
        button7.setFont(BigFontTR);
        button7.addActionListener(obr);
        button8 = new JButton("8");
        button8.setFont(BigFontTR);
        button8.addActionListener(obr);
        button9 = new JButton("9");
        button9.setFont(BigFontTR);
        button9.addActionListener(obr);
        ravno = new JButton("=");
        ravno.setFont(BigFontTR);
        ravno.addActionListener(obr);

        plus = new JButton("+");
        plus.setFont(BigFontTR);
        plus.addActionListener(obr);

        minus = new JButton("-");
        minus.setFont(BigFontTR);
        minus.addActionListener(obr);
        mul = new JButton("*");
        mul.setFont(BigFontTR);
        mul.addActionListener(obr);
        delenie = new JButton("/");
        delenie.setFont(BigFontTR);
        delenie.addActionListener(obr);
        clean = new JButton("C");
        clean.setFont(BigFontTR);
        clean.setForeground(Color.RED);
        clean.addActionListener(obr);
        point = new JButton(".");
        point.setFont(BigFontTR);
        point.addActionListener(obr);

        panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(5, 4));
        panelButton.add(button7);
        panelButton.add(button8);
        panelButton.add(button9);
        panelButton.add(mul);

        panelButton.add(button4);
        panelButton.add(button5);
        panelButton.add(button6);
        panelButton.add(minus);

        panelButton.add(button3);
        panelButton.add(button2);
        panelButton.add(button1);
        panelButton.add(plus);

        panelButton.add(point);
        panelButton.add(button0);
        panelButton.add(delenie);
        panelButton.add(ravno);

        panelButton.add(buttonEmpty);
        panelButton.add(buttonEmpty1);
        panelButton.add(buttonEmpty2);
        panelButton.add(clean);


        windows.add(panelButton);

        setContentPane(windows);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }


    private class Obrabotchik implements ActionListener {


        StringBuffer s = new StringBuffer("");


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button0) {
                display.setText((display.getText().concat("0")));
            }
            if (e.getSource() == button1) {
                display.setText((display.getText().concat("1")));
            }
            if (e.getSource() == button2) {
                display.setText((display.getText().concat("2")));
            }
            if (e.getSource() == button3) {
                display.setText((display.getText().concat("3")));
            }
            if (e.getSource() == button4) {
                display.setText((display.getText().concat("4")));
            }
            if (e.getSource() == button5) {
                display.setText((display.getText().concat("5")));
            }
            if (e.getSource() == button6) {
                display.setText((display.getText().concat("6")));
            }
            if (e.getSource() == button7) {
                display.setText((display.getText().concat("7")));
            }
            if (e.getSource() == button8) {
                display.setText((display.getText().concat("8")));
            }
            if (e.getSource() == button9) {
                display.setText((display.getText().concat("9")));
            }
            if (e.getSource() == point) {
                display.setText((display.getText().concat(".")));
            }

            if (e.getSource() == plus) {
                a = Double.parseDouble(display.getText());
                operator = 1;
                display.setText("");
            }
            if (e.getSource() == minus) {
                a = Double.parseDouble(display.getText());
                operator = 2;
                display.setText("");
            }
            if (e.getSource() == mul) {
                a = Double.parseDouble(display.getText());
                operator = 3;
                display.setText("");
            }
            if (e.getSource() == delenie) {
                a = Double.parseDouble(display.getText());
                operator = 4;
                display.setText("");
            }

            if (e.getSource() == ravno) {
                b = Double.parseDouble(display.getText());
                switch (operator) {
                    case 1:
                        res = a + b;
                        break;
                    case 2:
                        res = a - b;
                        break;
                    case 3:
                        res = a * b;
                        break;
                    case 4:
                        res = a / b;
                        break;
                    default: res = 0;
                }
                display.setText("" + res);
            }
            if (e.getSource() == clean) {
                display.setText("");

            }


//            if (e.getSource() instanceof JButton) {
//
//                //равно выводит сумму
//                //С должен очистить
//                s.append(((JButton) e.getSource()).getText());//выводит в конце
//                display.setText(s.toString());
//            }
        }

    }
}
