package db;

/**
 * KBEntry - Represents one "page" in knowledge base.
 * 
 * @author Alois Seckar [ ellrohir@seznam.cz ]
 * @version 0.1
 * @since 2015-02-13 14:48 GMT
 */
public class KBEntry {

    // ************************** \\
    // *        CONSTANTS       * \\
    // ************************** \\

    // ************************** \\
    // *       PROPERTIES       * \\
    // ************************** \\
    
    /**
     * Internal DB ID.
     */
    private int kbID;
    
    /**
     * Order of entry among all original entries in DB.
     * For every "New" entry this number raises +1. For new versions of the
     * same entry created by "Edit" the number remains the same.
     * Current number of original entries is stored in "orig_entries" in 
     * "DBStats" table.
     */
    private int kbOrigID;
    
    /**
     * Page title to be displayed.
     */
    private String entryTitle;
    
    /**
     * Page category for listing.
     */
    private int entryCat;
    
    /**
     * Page contents.
     * Text with possibilty to use supported tags for formatting and linking.
     */
    private String entryBody;
    
    /**
     * DB ID of entry author.
     */
    private int entryAuthor;
    
    /**
     * Validity indicator.
     * 1 - current version of entrz.
     */
    private int entryValid;
            
            

    // ************************** \\
    // *      CONSTRUCTORS      * \\
    // ************************** \\
    
    // empty constructor required by Hibernate
    
    public KBEntry() {
    }
    
    // standard constructor
    
    public KBEntry(int origID, String eTitle, int eCat, String eBody, 
            int eAuthor, int eValid) {
        this.kbOrigID = origID;
        this.entryTitle = eTitle;
        this.entryCat = eCat;
        this.entryBody = eBody;
        this.entryAuthor = eAuthor;
        this.entryValid = eValid;
    }

    // ************************** \\
    // *     ACCESS METHODS     * \\
    // ************************** \\
    
    // getters and setters required for Hibernate

    public int getKbID() {
        return kbID;
    }

    public void setKbID(int kbID) {
        this.kbID = kbID;
    }

    public int getKbOrigID() {
        return kbOrigID;
    }

    public void setKbOrigID(int kbOrigID) {
        this.kbOrigID = kbOrigID;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public void setEntryTitle(String entryTitle) {
        this.entryTitle = entryTitle;
    }

    public int getEntryCat() {
        return entryCat;
    }

    public void setEntryCat(int entryCat) {
        this.entryCat = entryCat;
    }

    public String getEntryBody() {
        return entryBody;
    }

    public void setEntryBody(String entryBody) {
        this.entryBody = entryBody;
    }

    public int getEntryAuthor() {
        return entryAuthor;
    }

    public void setEntryAuthor(int entryAuthor) {
        this.entryAuthor = entryAuthor;
    }

    public int getEntryValid() {
        return entryValid;
    }

    public void setEntryValid(int entryValid) {
        this.entryValid = entryValid;
    }
    
    // ************************** \\
    // *     PUBLIC METHODS     * \\
    // ************************** \\
    
    // overrides required for Hibernate
    
    @Override
    public int hashCode() {
        final int prime = 2108; // coded at "21:08"
        int result = 1;
        result = prime * result + Integer.valueOf(kbID).hashCode();
        result = prime * result + Integer.valueOf(entryTitle).hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof KBEntry)) {
            return false;
        }
        return this == obj;
    }

    @Override
    public String toString() {
        return entryTitle;
    }

    // ************************** \\
    // *    PRIVATE METHODS     * \\
    // ************************** \\

}
