import java.util.List;

/**
 * Write a description of interface CreationContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface CreationContainer
{
    boolean add(Creation creation);
    Creation remove(Creation creation);
    int count();
    boolean isEmpty();
    boolean contains(Creation creation);
    int countByCreator(Creator creator);
    int countByType(CREATION_TYPE type);
    List<Creation> creationsByCreator(Creator creator);
    List<Creation> creationsByType(CREATION_TYPE type);
}
