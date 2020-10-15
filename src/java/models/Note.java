package models;

import java.io.Serializable;

public class Note implements Serializable {
    private String title;
    private String contents;    
    
    public Note(){ 
        title="";
        contents="";
    }
    
    public Note (String title, String contents){
        this.title=title;
        this.contents=contents;  
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the contents
     */
    public String getContents() {
        return contents;
    }

    /**
     * @param contents the contents to set
     */
    public void setContents(String contents) {
        this.contents = contents;
    }
    
}
