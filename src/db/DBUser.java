package db;

/**
 * DBUser - Represents one "user" in knowledge base.
 * 
 * @author Alois Seckar [ ellrohir@seznam.cz ]
 * @version 0.1
 * @since 2015-03-15 19:13 GMT
 */
public class DBUser {

    // ************************** \\
    // *        CONSTANTS       * \\
    // ************************** \\

    // ************************** \\
    // *       PROPERTIES       * \\
    // ************************** \\
    
    /**
     * Internal DB ID.
     */
    private int userID;
    
    /**
     * DBUser login.
     * VSE 7-chars "xname" used.
     */
    private String userLogin;
    
    /**
     * DBUser password.
     * Password sha1() hash is kept in database.
     */
    private String userPass;
    
    /**
     * DBUser level.
     * The bigger level, the more privileges user has.
     */
    private int userLevel;
    
    /**
     * DBUser display name.
     * Name to be displayed within program.
     */
    private String userName;
            
            

    // ************************** \\
    // *      CONSTRUCTORS      * \\
    // ************************** \\
    
    // empty constructor required by Hibernate
    
    public DBUser() {
    }
    
    // standard constructor
    
    public DBUser(String uLogin, String uPass, int uLevel, String uName) {
        this.userLogin = uLogin;
        this.userPass = uPass;
        this.userLevel = uLevel;
        this.userName = uName;
    }

    // ************************** \\
    // *     ACCESS METHODS     * \\
    // ************************** \\
    
    // getters and setters required for Hibernate

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    // ************************** \\
    // *     PUBLIC METHODS     * \\
    // ************************** \\
    
    // overrides required for Hibernate
    
    @Override
    public int hashCode() {
        final int prime = 1618; // coded at "16:18"
        int result = 1;
        result = prime * result + Integer.valueOf(userID).hashCode();
        result = prime * result + Integer.valueOf(userLogin).hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DBUser)) {
            return false;
        }
        return this == obj;
    }

    @Override
    public String toString() {
        return userName;
    }

    // ************************** \\
    // *    PRIVATE METHODS     * \\
    // ************************** \\

}
