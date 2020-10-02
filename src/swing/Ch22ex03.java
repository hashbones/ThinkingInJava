package swing;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Ch22ex03 extends JFrame {
    JLabel label;
    public Ch22ex03() {
        label = new JLabel("A label");
        add(label);
    }
    static Ch22ex03 ssp;

    public static void main(String[] args) throws Exception {
        SwingConsole.run(ssp = new Ch22ex03(), 300, 100);
        TimeUnit.SECONDS.sleep(3);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp.label.setText("It's a different text");
            }
        });
    }
}
