/*
 * Content class for dictionary entries. Contains the word and the descrption.
 */
package project_4;

public class Content 
{
    private String word; //word in dictionary
    private String description; //definition of word
    
    Content()
    {
        word = " ";
        description = " ";
    }
    
    Content(String w, String d)
    {
        this.word=w;
        this.description=d;
    }
    
    /**Gets word and returns it
     *
     * @return word
     */
    public String getWord()
    {
        return word;
    }
    
    /**Gets description and returns it
     *
     * @return description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**Sets word
     *
     * @param word
     */
    public void setWord(String word)
    {
        word=this.word;
    }
    
    /**Sets description of word
     *
     * @param description
     */
    public void setDescription(String description)
    {
        description=this.description;
    }
    
    public String toString()
    {
        return "Word: "+word+" Description: "+description;
    }
}
