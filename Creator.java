import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Write a description of class Creator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Creator
{
    private String firstName;
    private String lastName;
    private Set<CREATION_TYPE> types;
    private List<Creation> creations;
    /**
     * Constructor for objects of class Creator
     */
    public Creator()
    {
        this("No First Name");
    }

    public Creator(String firstName)
    {
        this(firstName, "No Last Name");
    }

    // Designated Constructor
    public Creator(String firstName, String lastName)
    {
        setFirstName(firstName);
        setLastName(lastName);
        types = new HashSet<CREATION_TYPE>();
        creations = new ArrayList<Creation>();
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void addCreationType(CREATION_TYPE type)
    {
        types.add(type);
    }

    public boolean addCreation(Creation creation)
    {
        if(types.contains(creation.getType() ))
        {
            return creations.add(creation);
        }
        else
        {
            return false;
        }
    }

    public List<CREATION_TYPE> getTypes()
    {
        return (ArrayList<CREATION_TYPE>)((ArrayList<CREATION_TYPE>) types).clone();
    }

    public List<Creation> getCreations()
    {
        return (ArrayList<Creation>)((ArrayList<Creation>) creations).clone();
    }

}
