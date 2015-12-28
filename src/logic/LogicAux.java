package logic;

import db.DBHandler;
import db.DBUser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Generic methods for various logical tasks for VSEGRAF project.
 * 
 * @author Alois Seckar [ ellrohir@seznam.cz ]
 * @version 0.1
 * @since 2015-04-02 22:54 GMT+1
 */
public class LogicAux {

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
     * Gets current date and time in DB-compatible format.
     * yyyy-MM-dd HH:mm:ss
     * 
     * @return current date and time
     */
    public static String getNow() {
        // code inspired by:
        // http://www.mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date); //2014/08/06 15:59:48
    }

    /**
     * Gets user name from DB by given userID.
     * 
     * @param userID ID of user
     * 
     * @return name of given user
     */
    public static String getUserName(int userID) {
        // get DB entry with given ID
        DBUser user = (DBUser) DBHandler.getSingleObject(
                        "FROM DBUser WHERE id='" + userID + "'");
        if (user!=null) {
            return user.getUserName();
        } else {
            return "_null_"; // if something gets wrong...
        }
    }

    // ************************** \\
    // *    PRIVATE METHODS     * \\
    // ************************** \\

}
