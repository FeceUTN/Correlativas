package domain.correlativas;
import java.util.Set;

public class Alumno{

    private String nombre;
    private Set<Materia> aprobadas;

    public Alumno(String name, Set<Materia> materias){
        this.nombre = name;
        this.aprobadas = materias;
    }

    public boolean aprobada(Materia materia){
        return aprobadas.contains(materia);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getAprobadas() {
        return aprobadas;
    }
    public void setAprobadas(Set<Materia> aprobadas) {
        this.aprobadas = aprobadas;
    }
}
