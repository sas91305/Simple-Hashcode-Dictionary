/*
 * Main class to use the methods found in dictionary class
 */
package project_4;
/**
 * @author sas91305
 */
public class Project_4 
{
    public static void main(String[] args) 
    {
        Dictionary d = new Dictionary();
        //add methods
        d.add("Java", "Java is a general-"
                + "purpose computer-programming language "
                + "that is concurrent, class-based, object-oriented,"
                + " and specifically designed to have as few implementation"
                + " dependencies as possible");
        d.add("Database", "A database is a structured set of data held in a "
                + "computer, especially one that is accessible in various "
                + "ways.");
        d.add("C", "C is a high-level and general-purpose programming language"
                + " that is ideal for developing firmware or portable "
                + "applications. Originally intended for writing system "
                + "software, C was developed at Bell Labs by Dennis Ritchie "
                + "for the Unix Operating System in the early 1970s.");
                
        //print dictionary d
        System.out.println(d);
        System.out.println("");
        
        //lookFor method
        System.out.println(d.lookFor("Java"));
        System.out.println("");
        System.out.println(d.lookFor("Database"));
        System.out.println("");
        System.out.println(d.lookFor("C"));
    }
    
}
