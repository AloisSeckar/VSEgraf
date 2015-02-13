package db;

/**
 * DBStats - Represents one "stats data" in knowledge base.
 * 
 * @author Alois Seckar [ ellrohir@seznam.cz ]
 * @version 0.1
 * @since 2015-02-13 15:38 GMT
 */
public class DBStats {

    // ************************** \\
    // *        CONSTANTS       * \\
    // ************************** \\

    // ************************** \\
    // *       PROPERTIES       * \\
    // ************************** \\
    
    /**
     * Stats name.
     */
    private String statsKey;
    
    /**
     * Stats numeric value.
     */
    private int statsValue;
            
            

    // ************************** \\
    // *      CONSTRUCTORS      * \\
    // ************************** \\
    
    // empty constructor required by Hibernate
    
    public DBStats() {
    }
    
    // standard constructor
    // not implemented as we dont construct new stats inside program

    // ************************** \\
    // *     ACCESS METHODS     * \\
    // ************************** \\
    
    // getters and setters required for Hibernate

    public String getStatsKey() {
        return statsKey;
    }

    public void setStatsKey(String statsKey) {
        this.statsKey = statsKey;
    }

    public int getStatsValue() {
        return statsValue;
    }

    public void setStatsValue(int statsValue) {
        this.statsValue = statsValue;
    }
    
    // ************************** \\
    // *     PUBLIC METHODS     * \\
    // ************************** \\
    
    // overrides required for Hibernate
    
    @Override
    public int hashCode() {
        final int prime = 1537; // coded at "15:37"
        int result = 1;
        result = prime * result + Integer.valueOf(statsKey).hashCode();
        result = prime * result + Integer.valueOf(statsValue).hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DBStats)) {
            return false;
        }
        return this == obj;
    }

    @Override
    public String toString() {
        return statsKey + "=" + statsValue;
    }

    // ************************** \\
    // *    PRIVATE METHODS     * \\
    // ************************** \\

}
