package Lesson;

import javax.swing.*;
import java.awt.*;

public class MyForm {
    JFrame frame; //окно
    private JTextField pole1; //поле1
    private JTextField pole2;// поле2

    public MyForm() { //конструктор для инициализации
        frame = new JFrame("Java 4");//новое окно им java4
        frame.setLayout(new FlowLayout());//создание заполненного окна (расположение)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//кнопочка при нажатии будет останавливаться
        pole1 = new JTextField(10);//добавляе поле field, в скобках символы
        pole2 = new JTextField(20);
        frame.add(pole1);
        frame.add(pole2);//добавляем
        frame.pack(); //расширяет по размеру элементов
        frame.setVisible(true);
    }


}