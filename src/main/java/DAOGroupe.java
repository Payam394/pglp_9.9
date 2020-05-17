import java.util.ArrayList;

public interface DAOGroupe<T> {
	
	ArrayList<T> getAll();
    
    void add(T t);
    
    void deplacer(T t, Point dest);
     
    void delete(T t);

}
