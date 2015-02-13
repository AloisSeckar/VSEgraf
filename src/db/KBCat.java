package db;

/**
 * KBCat - Represents one "category" in knowledge base.
 * 
 * @author Alois Seckar [ ellrohir@seznam.cz ]
 * @version 0.1
 * @since 2015-02-13 15:48 GMT
 */
public class KBCat {

    // ************************** \\
    // *        CONSTANTS       * \\
    // ************************** \\

    // ************************** \\
    // *       PROPERTIES       * \\
    // ************************** \\
    
    /**
     * Category DB ID.
     */
    private int catID;
    
    /**
     * Category order for listing.
     */
    private int catOrd;
    
    /**
     * Category name.
     */
    private String catName;
            
            

    // ************************** \\
    // *      CONSTRUCTORS      * \\
    // ************************** \\
    
    // empty constructor required by Hibernate
    
    public KBCat() {
    }
    
    // standard constructor
    
    public KBCat(int ord, String name) {
        this.catOrd = ord;
        this.catName = name;
    }

    // ************************** \\
    // *     ACCESS METHODS     * \\
    // ************************** \\
    
    // getters and setters required for Hibernate

    public int getCatID() {
        return catID;
    }

    public void setCatID(int catID) {
        this.catID = catID;
    }

    public int getCatOrd() {
        return catOrd;
    }

    public void setCatOrd(int catOrd) {
        this.catOrd = catOrd;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
    
    // ************************** \\
    // *     PUBLIC METHODS     * \\
    // ************************** \\
    
    // overrides required for Hibernate
    
    @Override
    public int hashCode() {
        final int prime = 1547; // coded at "15:47"
        int result = 1;
        result = prime * result + Integer.valueOf(catID).hashCode();
        result = prime * result + Integer.valueOf(catOrd).hashCode();
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
        return catName;
    }

    // ************************** \\
    // *    PRIVATE METHODS     * \\
    // ************************** \\

}
