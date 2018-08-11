/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingWorkerPack;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sebastián
 */
public class FirstFrame extends JFrame {

    public FirstFrame() {
        this.setTitle("FirstFrame");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.add(new MyWorkPanel());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FirstFrame().setVisible(true);
            }
        });
    }
}
