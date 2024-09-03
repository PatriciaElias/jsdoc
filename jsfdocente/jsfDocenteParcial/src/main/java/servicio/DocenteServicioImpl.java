
package servicio;
import datos.DocenteDAO;
import dominio.Docente;
import java.util.List;
import javax.inject.Inject;

public class DocenteServicioImpl implements DocenteServicio{
    @Inject
    private DocenteDAO docentedao;

    @Override
    public List<Docente> listarDocente() {
        return docentedao.findAllDocentes();
    }

    @Override
    public Docente encontrarDocentePorId(Docente docente) {
        return docentedao.findDocenteById(docente);
    }

    @Override
    public Docente encontrarDocentePorApellido(Docente docente) {
        return docentedao.findDocenteByApellido(docente);
    }

    @Override
    public void registrarDocente(Docente docente) {
        docentedao.insertarDocente(docente);
    }

    @Override
    public void modificarDocente(Docente docente) {
        docentedao.updateDocente(docente);
    }

    @Override
    public void eliminarDocente(Docente docente) {
        docentedao.deleteDocente(docente);
    }
}
