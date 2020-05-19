import java.util.ArrayList;

public interface DAOGroupe<T> {
	
	ArrayList<T> getAll();
    
    void add(T t);
    
    void deplacer(int x, int y);
     
    void delete(T t);

}
