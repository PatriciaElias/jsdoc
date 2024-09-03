
package datos;


import dominio.Docente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class DocenteDaoImpl implements DocenteDAO {
    @PersistenceContext(unitName="docentePU")

    
    EntityManager em;

    @Override
    public List<Docente> findAllDocentes() {
        return em.createNamedQuery("Docente.findAll").getResultList();
    }

    @Override
    public Docente findDocenteById(Docente docente) {
        return em.find(Docente.class,docente.getIdo());
    }

    @Override
    public Docente findDocenteByApellido(Docente docente) {
        Query query =em.createQuery("from Docente e where e.apellido_docente=:apellido");
        query.setParameter("apellido", docente.getApellido());
        return (Docente) query.getSingleResult();
    }

    @Override
    public void insertarDocente(Docente docente) {
       em.persist(docente);
    }

    @Override
    public void updateDocente(Docente docente) {
        System.out.println("Entra a actualizar DocenteDAoImpl");
        em.merge(docente);
    }
    

    @Override
    public void deleteDocente(Docente docente) {
        em.remove(em.merge(docente));
    }
    
    
}
