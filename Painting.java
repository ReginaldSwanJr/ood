
/**
 * Write a description of class Painting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Painting implements Creation
{
    private Creator creator;
    private String title;
    private float width;
    private float height;
    /**
     * Constructor for objects of class Painting
     */
    public Painting()
    {
        this(null);
    }
    
    public Painting(Creator creator)
    {
        this(creator, "No Title");
    }
    
    public Painting(Creator creator, String title)
    {
        this(creator, title, 1f, 1f);
    }
    
    public Painting(Creator creator, String title, float width, float height)
    {
        setCreator(creator);
        setTitle(title);
        setWidth(width);
        setHeight(height);
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
    
    public void setWidth(float width)
    {
        this.width = width;
    }
    
    public float getWidth()
    {
        return width;
    }
    
    public void setHeight(float height)
    {
        this.height = height;
    }
    
    public float getHeight()
    {
        return height;
    }
    
    public CREATION_TYPE getType()
    {
        return CREATION_TYPE.PAINTING;
    }
        
}
