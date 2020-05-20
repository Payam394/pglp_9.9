package systeme;
import java.util.ArrayList;

public interface DAOGroupe<T> {
	
	ArrayList<T> getAll();
    
    void add(T t);
     
    void delete(T t);

}
