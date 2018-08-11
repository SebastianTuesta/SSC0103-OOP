/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingWorkerPack;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Sebastián
 */
public class ButtonWorker extends SwingWorker<Integer, Void> {

    private final int sleepTime;

    public ButtonWorker(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    protected Integer doInBackground() throws Exception {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException ex) {
        }
        return sleepTime;
    }

    @Override
    protected void done() {
        int result;
        try {
            result = this.get();
            JOptionPane.showMessageDialog(null,
                    "Finished.Sleep time: " + result,
                    "Swing Worker Example",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } catch (InterruptedException | ExecutionException ex) {
        }
    }
}
