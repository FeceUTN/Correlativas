package domain.correlativas;
import java.util.Set;

public class Inscripcion {
    private final Alumno alumno; //No veo la necesidad de modificar los datos de una inscripcion
    private final Set<Materia> materias;

    public Inscripcion(Alumno estudiante, Set<Materia> materiasAInscribir) {
        this.alumno = estudiante;
        this.materias = materiasAInscribir;
    }

    public boolean aprobada() {
        return materias.stream().allMatch(materia -> materia.condicionCorrelativas(alumno));
    }
    /* HIPÓTESIS DE TRABAJO:
           Aca cabe la duda de que ocurriría si se quiere inscribir a una materia que ya cursó,
        pero al ser este un sistema validador de correlativas, opino que no está dentro del
        alcance de este sistema rechazar inscripciones en base a si ya aprobó la materia, solo
        basándonos en la condición de las correlativas.
     */
}