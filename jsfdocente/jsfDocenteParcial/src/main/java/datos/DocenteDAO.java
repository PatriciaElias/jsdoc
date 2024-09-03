
package datos;


import dominio.Docente;
import java.util.List;

/**
 *
 * @author rafag
 */
public interface DocenteDAO {
    
    public List<Docente> findAllDocentes();
    
    public Docente findDocenteById(Docente docente);
    
    public Docente findDocenteByApellido(Docente docente);
    
    public void insertarDocente(Docente docente);
    
    public void updateDocente(Docente docente);
    
    public void deleteDocente(Docente docente);
    
}
