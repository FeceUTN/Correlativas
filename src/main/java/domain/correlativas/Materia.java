package domain.correlativas;
import java.util.Set;

public class Materia{
    private String nombre;
    private Set<Materia> correlativas;

    public Materia(String name, Set<Materia> materiasCorrelativas){
        this.nombre = name;
        this.correlativas = materiasCorrelativas;
    }

    public boolean condicionCorrelativas(Alumno alumno){
        return correlativas.stream().allMatch(alumno::aprobada);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }
    public void setCorrelativas(Set<Materia> correlativas) {
        this.correlativas = correlativas;
    }
}
