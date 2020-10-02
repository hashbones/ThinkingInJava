package swing;

import javax.swing.*;
import java.awt.FlowLayout;
import java.util.*;
import java.util.concurrent.TimeUnit;

class HelloLabel extends JFrame {
    private static Random rand = new Random();
    JLabel[] labels;
    HelloLabel() {
        super("Hello Swing");
        setLayout(new FlowLayout());
        int size = rand.nextInt(7) + 1;
        labels = new JLabel[size];
        for(int i = 0; i < size; i++) {
            labels[i] = new JLabel("Label#" + i);
            add(labels[i]);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }
}
