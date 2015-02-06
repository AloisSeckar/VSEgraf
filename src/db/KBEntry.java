// edit: 2015-02-06 19:20
// by:   AS

package db;

/**
 * KBEntry - Represents one "page" in knowledge base
 * 
 * @author Alois Seckar [ ellrohir@seznam.cz ]
 * @version 0.1
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
     * Page title to be displayed.
     */
    private String entryTitle;
    
    /**
     * Page category for listing.
     */
    private String entryCat;
    
    /**
     * Page contents.
     * Text with possibilty to use supported tags for formatting and linking.
     */
    private String entryBody;
    
    /**
     * DB ID of entry original author.
     */
    private int entryAuthor;
    
    /**
     * DB ID of entry last editor.
     */
    private int entryLastEdit;
            
            

    // ************************** \\
    // *      CONSTRUCTORS      * \\
    // ************************** \\
    
    // empty constructor required by Hibernate
    
    public KBEntry() {
    }
    
    // standard constructor
    
    public KBEntry(String eTitle, String eCat, String eBody, int eAuthor) {
        this.entryTitle = eTitle;
        this.entryCat = eCat;
        this.entryBody = eBody;
        this.entryAuthor = eAuthor;
        this.entryLastEdit = eAuthor;
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

    public String getEntryTitle() {
        return entryTitle;
    }

    public void setEntryTitle(String entryTitle) {
        this.entryTitle = entryTitle;
    }

    public String getEntryCat() {
        return entryCat;
    }

    public void setEntryCat(String entryCat) {
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

    public int getEntryLastEdit() {
        return entryLastEdit;
    }

    public void setEntryLastEdit(int entryLastEdit) {
        this.entryLastEdit = entryLastEdit;
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
