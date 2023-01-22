package Lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm2 extends JFrame {
    private JTextField pole1; //поле1
    private JTextField pole2;// поле2
    Obrabotchik obr = new Obrabotchik();

    public MyForm2() { //конструктор для инициализации
        super("Java 4");//новое окно им java4
        setLayout(new FlowLayout());//создание заполненного окна (расположение)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//кнопочка при нажатии будет останавливаться
        pole1 = new JTextField(10);//добавляе поле field, в скобках символы
        pole2 = new JTextField(20);
        add(pole1);
        add(pole2);//добавляем
        pack(); //растянутьпо размеру элементов
        setVisible(true);
        pole1.addActionListener(obr);
        pole2.addActionListener(obr);
    }
    private class Obrabotchik implements ActionListener {//слушатель элементов
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == pole1){// если событие произошло в pole1
                JOptionPane.showMessageDialog(null, "Pole 1 " + e.getActionCommand());
            }
            if (e.getSource() == pole2){// если событие произошло в pole2
                JOptionPane.showMessageDialog(null, "Pole 2 " + e.getActionCommand());
            }

        }

    }

}

