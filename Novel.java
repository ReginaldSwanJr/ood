
/**
 * Write a description of class Novel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Novel implements Creation
{
    private Creator creator;
    private String title;
    private int numberOfPages;

    /**
     * Constructor for objects of class Novel
     */
    public Novel()
    {
       this(null); 
    }
    
    public Novel(Creator creator)
    {
        this(creator, "No Title");
    }
    
    public Novel(Creator creator, String title)
    {
        this(creator, title, 1);
    }
    
    // Designated Constructor
    public Novel(Creator creator, String title, int numberOfPages)
    {
        setCreator(creator);
        setTitle(title);
        setNumberOfPages(numberOfPages);
    }
    
    public void setCreator(Creator creator)
    {
        this.creator = creator;
    }

    public Creator getCreator()
    {
        return creator;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }
    
    public int getNumberOfPages()
    {
        return numberOfPages;
    }
    
    public CREATION_TYPE getType()
    {
        return CREATION_TYPE.NOVEL;
    }
        
}
