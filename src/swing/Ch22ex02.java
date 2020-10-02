package swing;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Ch22ex02 {
    public static HelloLabel hl;
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                hl = new HelloLabel();
            }
        });
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                for(int i = 0; i < hl.labels.length; i++) {
                    hl.labels[i].setText("Changed#" + i);
                }
            }
        });
    }
}