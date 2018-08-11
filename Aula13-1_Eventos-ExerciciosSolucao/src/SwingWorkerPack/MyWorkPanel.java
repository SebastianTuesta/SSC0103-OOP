/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingWorkerPack;

import java.awt.Color;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sebastián
 */
public class MyWorkPanel extends JPanel {

    private final JButton edtButton = new JButton("EDT");
    private final JButton swButton = new JButton("SwingWorker");
    private final int sleepTime = 5000;

    public MyWorkPanel() {
        this.add(edtButton);
        this.add(swButton);
        edtButton.addActionListener(new ButtonListener());
        swButton.addActionListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            Object source = evt.getSource();

            if (source == edtButton) {
                setBackground(Color.YELLOW);
                try {
                    Thread.sleep(sleepTime);
                    JOptionPane.showMessageDialog(null,
                            "Finished.Sleep time: " + sleepTime,
                            "Event Dispatch Example",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                } catch (InterruptedException ex) {
                }
            } else if (source == swButton) {
                setBackground(Color.BLUE);
                ButtonWorker bw = new ButtonWorker(sleepTime);
                bw.execute();
            }
        }
    }
}
