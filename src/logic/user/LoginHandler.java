package logic.user;

import db.DBHandler;
import db.DBUser;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * Login handling code for VSEGRAF project.
 * 
 * @author Alois Seckar [ ellrohir@seznam.cz ]
 * @version 0.1
 * @since 2015-03-07 10:30 GMT
 */
public class LoginHandler {

    // ************************** \\
    // *        CONSTANTS       * \\
    // ************************** \\

    // ************************** \\
    // *       PROPERTIES       * \\
    // ************************** \\
    
    private DBUser user = null;

    // ************************** \\
    // *      CONSTRUCTORS      * \\
    // ************************** \\

    // ************************** \\
    // *     ACCESS METHODS     * \\
    // ************************** \\
    
    public boolean isLoggedIn() {
        return !(user==null);
    }
    
    public int getUserID() {
        if (user==null) {
            return user.getUserID();
        } else {
            return -1;
        }
    }
    
    public String getUserName() {
        if (user==null) {
            return user.getUserName();
        } else {
            return "&nonymous";
        }
    }
    
    public int getUserLevel() {
        if (user==null) {
            return user.getUserLevel();
        } else {
            return 0;
        }
    }

    // ************************** \\
    // *     PUBLIC METHODS     * \\
    // ************************** \\
    
    /**
     * Handles database login with given login and password.
     * 
     * @param userLogin login (username)
     * @param userPass  password (before hash)
     * 
     * @return 0 if logged in, 1 if wrong user or password
     */
    public int login(String userLogin, String userPass) {
        Object obj = DBHandler.getSingleObject("FROM DBUser WHERE xname='" 
                + userLogin + "'");
        // test if user exists
        if (obj instanceof DBUser) {
            // get user data from db
            DBUser dbuser = (DBUser)obj;
            // hash password input
            // http://stackoverflow.com/a/6706816/3204544
            String hPass = DigestUtils.sha1Hex(userPass);
            // compare
            if (dbuser.getUserPass().equals(hPass)) {
                // process login
                this.user = dbuser;
                // return success
                return 0;
            } else {
                // login failed - wrong password
                return 1;
            } 
        } else {
            // login failed - wrong login
            return 1;
        }
    }
    
    /**
     * Logs current user out.
     * Simply set user to null value.
     */
    public void logout() {
        user = null;
    }

    // ************************** \\
    // *    PRIVATE METHODS     * \\
    // ************************** \\

}
