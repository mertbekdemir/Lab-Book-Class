/**
 * Write a description of class car here.
 *
 * @author Monika
 * @version 1.0 September 15, 2018
 * The Book Class
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String  title;
    private String  lastName;
    private int     yearPublished;
    private String  firstName;
    private boolean fiction;
    private double  weightKilograms;

    /**
     * Constructor for objects of class Book
     * 
     * @param theTitle is the title of the book
     * @param theLastName is the last name of the Author
     * @param theYearPublished is the year when the book was published
     * @param theFirstName is the first name of the Author
     * @param theFiction checks if the book is fiction or not
     * @param theWeightKilograms checks the weight of the book
     */
    public Book(String theTitle, String theLastName, int theYearPublished, String theFirstName, boolean theFiction, double theWeightKilograms)
    {
        if(theTitle != null){
            title = theTitle;
        }
        else {
            throw new IllegalArgumentException("Title Cannot Be Null!");
        }

        if(theLastName !=null){
            lastName = theLastName;
        }
        else{
            throw new IllegalArgumentException("The Last Name Cannot Be Null");
        }

        if((theYearPublished>=1455) && (theYearPublished<=2018)){
            yearPublished = theYearPublished;
        }
        else{
            throw new IllegalArgumentException("The Year Published is out of range");
        }
        
        if(theFirstName != null){
            firstName = theFirstName;
        }
        else{
            throw new IllegalArgumentException("The First Name Cannot Be Null");
        }
  
        fiction = theFiction;

        if (!((theWeightKilograms <=0.0) || (theWeightKilograms >10.0))){
            throw new IllegalArgumentException("The Weight of the book is too small or too large");
        }
        else{
            weightKilograms = theWeightKilograms; 
        }
    }

}