package vsegraf;

import gui.MainWin;
import java.awt.EventQueue;

/**
 * Main Class for VSEGRAF project.
 * 
 * @author Alois Seckar [ ellrohir@seznam.cz ]
 * @version 0.1
 * @since 2015-03-07 11:51 GMT
 */
public class VSEGraf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // open client gui window
        EventQueue.invokeLater(() -> {
            // show main window
            MainWin gui = MainWin.getInstance();
            gui.setVisible(true);
        });
    }
    
}
