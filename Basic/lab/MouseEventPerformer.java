package Basic.lab;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
// import java.awt.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
// import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.*;

public class MouseEventPerformer extends JFrame implements MouseListener {
    JLabel label;

    public MouseEventPerformer() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        label = new JLabel();
        Font f = new Font("sans-serif", Font.BOLD, 20);
        label.setFont(f);
        label.setForeground(Color.BLUE);
        add(label);
        addMouseListener(this);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("mouseExited");
    }

}
