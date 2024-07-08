package Basic.lab;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

@SuppressWarnings("removal")
public class MyCalci extends Applet implements ActionListener {

    int num1, num2, res;
    TextField T1;
    Button NumButton[] = new Button[10];
    Button Add, Sub, Mul, Div, clear, EQ;
    char op;
    Panel NPanel, CPanel, Spanel;

    public void init() {
        NPanel = new Panel();
        T1 = new TextField(30);
        NPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        NPanel.add(T1);

        CPanel = new Panel();
        CPanel.setBackground(Color.WHITE);
        CPanel.setLayout(new GridLayout(5, 5, 3, 3));

        for (int i = 0; i < 10; i++) {
            NumButton[i] = new Button(" " + i);
        }

        Add = new Button("+");
        Sub = new Button("-");
        Mul = new Button("*");
        Div = new Button("/");
        clear = new Button("clear");
        EQ = new Button("=");

        T1.addActionListener(this);

        for (int i = 0; i < 10; i++) {
            CPanel.add(NumButton[i]);
        }

        CPanel.add(Add);
        CPanel.add(Sub);
        CPanel.add(Mul);
        CPanel.add(Div);
        CPanel.add(EQ);

        Spanel = new Panel();
        Spanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        Spanel.setBackground(Color.YELLOW);
        Spanel.add(clear);

        for (int i = 0; i < 10; i++) {
            NumButton[i].addActionListener(this);
        }

        Add.addActionListener(this);
        Sub.addActionListener(this);
        Div.addActionListener(this);
        Mul.addActionListener(this);
        Div.addActionListener(this);
        clear.addActionListener(this);
        EQ.addActionListener(this);

        this.setLayout(new BorderLayout());
        add(NPanel, BorderLayout.NORTH);
        add(CPanel, BorderLayout.CENTER);
        add(Spanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String str = ae.getActionCommand();
        char ch = str.charAt(0);
        if (Character.isDigit(ch)) {
            T1.setText(T1.getText() + str);
        } else {
            if (str.equals("+")) {
                num1 = Integer.parseInt(T1.getText());
                op = '+';
                T1.setText("");
            }
            if (str.equals("-")) {
                num1 = Integer.parseInt(T1.getText());
                op = '-';
                T1.setText("");
            }
            if (str.equals("*")) {
                num1 = Integer.parseInt(T1.getText());
                op = '*';
                T1.setText("");
            }
            if (str.equals("/")) {
                num1 = Integer.parseInt(T1.getText());
                op = '/';
                T1.setText("");
            }

            if (str.equals("=")) {
                num2 = Integer.parseInt(T1.getText());
                switch (op) {
                    case '+' ->
                        res = num1 + num2;
                    case '-' ->
                        res = num1 - num2;
                    case '*' ->
                        res = num1 * num2;
                    case '/' -> {
                        try {

                            res = num1 / num2;
                        } catch (ArithmeticException e) {
                            res = num2;
                            JOptionPane.showMessageDialog(this, "Division by zero");
                        }
                    }

                }
            }

        }

        // doubt
        T1.setText("" + str);
        if (str.equals("clear")) {
            T1.setText("");
        }

    }

}
