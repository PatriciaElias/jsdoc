
package web;

import dominio.Docente;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;
import servicio.DocenteServicio;

@Named("docenteBean")
@RequestScoped
public class DocenteBean {
    
    @Inject
    private DocenteServicio docenteServicio;
    
    private Docente docenteSeleccionado;
    
    List<Docente> docentes;

    public DocenteBean() {
    }
    
    
    
    @PostConstruct
    public void inicializar(){
        
        docentes = docenteServicio.listarDocente();
        docenteSeleccionado= new Docente();
        
    }
    
    public void editListener(RowEditEvent event){
        Docente docente= (Docente) event.getObject();
    }

    public DocenteServicio getDocenteServicio() {
        return docenteServicio;
    }

    public void setDocenteServicio(DocenteServicio docenteServicio) {
        this.docenteServicio = docenteServicio;
    }

    public Docente getDocenteSeleccionado() {
        return docenteSeleccionado;
    }

    public void setDocenteSeleccionado(Docente docenteSeleccionado) {
        this.docenteSeleccionado = docenteSeleccionado;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes;
    }

    
    
}
