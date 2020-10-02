package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button2 extends JFrame {
    private JButton
    b1 = new JButton("Button1"),
    b2 = new JButton("Button2");
    private JTextField txt = new JTextField(10);
    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = ((JButton)e.getSource()).getText();
            txt.setText(s);
        }
    }
    private ButtonListener buttonListener = new ButtonListener();
    public Button2() {
        b1.addActionListener(buttonListener);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("Anonymous class");
            }
        });
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(txt);
    }

    public static void main(String[] args) {
        SwingConsole.run(new Button2(), 300, 200);
    }
}
