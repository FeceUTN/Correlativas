package domain.correlativas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class InscripcionTest {
    Materia algoritmos = new Materia("Algoritmos", new HashSet<>());
    Materia discreta = new Materia("Discreta", new HashSet<>());
    Materia sistemas = new Materia("Sistemas", new HashSet<>());
    Materia fisica  = new Materia("Fisica", new HashSet<>());

    Set<Materia> corrAnalisis = Set.of(sistemas, algoritmos);
    Set<Materia> corrParadigmas = Set.of(discreta, algoritmos);

    Materia paradigmas = new Materia("Paradigmas", corrParadigmas);
    Materia analisis = new Materia("Analisis", corrAnalisis);

    Set<Materia> corrDiseno = Set.of(analisis, paradigmas);
    Materia diseno = new Materia("Diseño", corrDiseno);

    Set<Materia> aprobadasPorCarlos = Set.of(algoritmos, sistemas, discreta, analisis);
    Alumno carlos = new Alumno("Carlos", aprobadasPorCarlos);

    Set<Materia> inscripcionA = Set.of(fisica, paradigmas);
    Set<Materia> inscripcionB = Set.of(paradigmas,diseno);

    @Test
    @DisplayName("Testeo de inscripcion aprobada")
    public void testInscripcionAprobada() {
        Inscripcion inscripcionAprobada = new Inscripcion(carlos, inscripcionA);
        Assertions.assertTrue(inscripcionAprobada.aprobada());
    }
    @Test
    @DisplayName("Testeo de inscripcion desaprobada")
    public void testInscripcionDesaprobada() {
        Inscripcion inscripcionDesaprobada = new Inscripcion(carlos, inscripcionB);
        Assertions.assertFalse(inscripcionDesaprobada.aprobada());
    }
}