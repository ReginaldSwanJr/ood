import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

/**
 * 
 *
 * @author (Reginald Swan Jr)
 * @version (4)
 */
public class Gallery implements CreationContainer
{
    private ArrayList<Creation> creationList;
    private HashMap <Creator,List<Creation>> myCreations;
    private HashMap <CREATION_TYPE,List<Creation>> myTypes;
    //private HashSet<CREATION_TYPE> typeList;

    /**
     * Constructor for objects of class Gallery
     */
    public Gallery()
    {
        creationList = new ArrayList<Creation>();
        myCreations = new HashMap<>();
        //typeList = new HashSet<CREATION_TYPE>();
    }

    public boolean add(Creation creation)
    {
        //return creationList.add(creation);
        Creator jim = creation.getCreator();
        ArrayList<Creation> pam = new ArrayList<Creation>();
        ArrayList<Creation> dwight = new ArrayList<Creation>();
        if(myCreations.containsKey(jim))
        {   
            myTypes.get(creation.getType()).add(creation); // adds creation to type list
            return myCreations.get(jim).add(creation); // pulls array list from hash table and adds creation
        }
        else
        {   
            dwight.add(creation);
            myTypes.put(creation.getType(),dwight);
            
            pam.add(creation);
            myCreations.put(jim,pam);
            return false;
        }
    }
    

    public Creation remove(Creation creation)
    {
        //boolean result = creationList.remove(creation);
        //return result ? creation : null;
        if(myCreations.containsKey(creation.getCreator()))
        {
            myCreations.remove(creation.getCreator());
            return creation;
        }
        else
        {
            return null;
        }
    }

    public int count()
    {
        return myCreations.size();
    }

    public boolean isEmpty()
    {
        return myCreations.isEmpty();
    }

    public boolean contains(Creation creation)
    {
        return myCreations.containsValue(creation);
    }

    public int countByCreator(Creator creator)
    {
        return myCreations.size();
    }

    public int countByType(CREATION_TYPE type)
    {
        return creationsByType(type).size();
    }

    public List<Creation> creationsByCreator(Creator creator)
    {
        /* list to be returned
        List<Creation> creatorList = new ArrayList<Creation>();
        for(Creation creation : creationList)
        {
            if(creation.getCreator() == creator)
            {
                creatorList.add(creation);
            }
        }
        return creatorList;
        */
       
        return myCreations.get(creator);
    }

    public List<Creation> creationsByType(CREATION_TYPE type)
    {   
        /*
        List<Creation> typeList = new ArrayList<Creation>();
        for(Creation creation : creationList)
        {
            if(creation.getType() == type)
            {
                typeList.add(creation);
            }
        }
        return typeList;
        */
        return myTypes.get(type);
    }
}
