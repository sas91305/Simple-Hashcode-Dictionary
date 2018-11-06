/*
 * Class used to find hashcode of given word, add Content to dictionary, lookFor
 * and toString to return Dictionary as a String
 */
package project_4;

import java.util.LinkedList;

public class Dictionary 
{
    private LinkedList<Content>[] list;
    private int s; //number of objects in the List
    
    public Dictionary()
    {
        list = new LinkedList[50000]; //set arrays capacity
        for (int i = 0; i < list.length; i++) 
            list[i] = new LinkedList(); // create a linked list object at each one
        s = 0;
    }
    
    /**Creates own hashcode from hashcode method of object class
     *
     * @param word
     * @return h
     */
    public int hashcode(String word)
    {
        int h = word.hashCode(); // use the hashcode method from object class
        
        if(h < 0) // negative possibility
            h = -h; // changes the negative to positive 
        h = h % list.length; // mod by size
        return h;
    }
    
    /** Adds given word and description to dictionary
     *
     * @param word
     * @param description
     * @return boolean
     */
    public boolean add(String word, String description)
    {
        Content f = new Content(word, description);
        int n = hashcode(f.getWord());
        
        if(list[n].contains(f))
            return false;
        list[n].add(f);
        s++;
        return true;
    }
    
    /** Looks for given word in dictionary by using hashcode method and returns
     * word and descriptions
     *
     * @param word
     * @return word and description of that word 
     */
    public Content lookFor(String word)
    {
        int n = hashcode(word);
        
        for(int i =0;i<s;i++)
        {
            if(list[n].get(i).getWord().equals(word))
                return list[n].get(i);
        }
        return null;
    }
   
    /**Converts information in array to string and returns
     * 
     * @return String
     */
    @Override
    public String toString()
    {
        String r = "[";
        for (int i = 0; i < list.length; i++) 
        {
            if(list[i].size() > 0)
                r += list[i] + " ";
        }
        r += "]";
        return r;
    }
}
