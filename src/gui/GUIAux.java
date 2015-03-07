package gui;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Generic methods for GUI handling for VSEGRAF project.
 * 
 * @author Alois Seckar [ ellrohir@seznam.cz ]
 * @version 0.1
 * @since 2015-03-07 10:55 GMT
 */
public class GUIAux {

    // ************************** \\
    // *        CONSTANTS       * \\
    // ************************** \\

    // ************************** \\
    // *       PROPERTIES       * \\
    // ************************** \\

    // ************************** \\
    // *      CONSTRUCTORS      * \\
    // ************************** \\

    // ************************** \\
    // *     ACCESS METHODS     * \\
    // ************************** \\

    // ************************** \\
    // *     PUBLIC METHODS     * \\
    // ************************** \\
    
    /**
     * Generic question dialog.
     * 
     * @param parent parent GUI component
     * @param question displayed question
     * 
     * @return yes/no choice
     */
    public static int showQuestionDialog(Component parent, String question) {
        String ObjButtons[] = {"Yes", "No"};
        return JOptionPane.showOptionDialog(parent, question, "VSEGraf",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, ObjButtons, ObjButtons[1]);
    }
    
    /**
     * Generic "feature not implemented" message.
     * 
     * @param parent parent GUI component
     */
    public static void throwNotImplemetedMessage(Component parent) {
        JOptionPane.showMessageDialog(parent, "Not implemented yet...",
                "VSEGraf", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Generic "you are not logged in" message.
     * 
     * @param parent parent GUI component
     */
    public static void throwNotLoggedInMessage(Component parent) {
        JOptionPane.showMessageDialog(parent, "You are not logged in!",
                "VSEGraf - editing", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Generic "you dont have permission" message.
     * 
     * @param parent parent GUI component
     */
    public static void throwNoPermissionMessage(Component parent) {
        JOptionPane.showMessageDialog(parent, "You don't have rights to do so!",
                "VSEGraf - editing", JOptionPane.INFORMATION_MESSAGE);
    }

    // ************************** \\
    // *    PRIVATE METHODS     * \\
    // ************************** \\
}
