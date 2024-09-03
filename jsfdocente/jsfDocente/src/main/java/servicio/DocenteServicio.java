
package servicio;

import dominio.Docente;
import java.util.List;
import javax.ejb.Local;

@Local 
public interface DocenteServicio {
    public List<Docente> listarDocente();
    
    public Docente encontrarDocentePorId(Docente docente);
    
    public Docente encontrarDocentePorApellido(Docente docente);
    
    public void registrarDocente(Docente docente);
    
    public void modificarDocente(Docente docente);
    
    public void eliminarDocente(Docente docente);
}
