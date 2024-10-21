import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class EstudianteTest {
    private static Estudiante estudiante;

    @BeforeAll
    public static void init() {
        estudiante = new Estudiante("Juan", 20);
    }

    @AfterAll
    public static void tearDown() {
        estudiante = null;
    }

    @Test
    public void agregarCalificacionTest() {
        estudiante.agregarCalificacion(85);
        assertEquals(85, estudiante.getPromedio());
    }

    @Test
    public void obtenerPromedioTest() {
        estudiante.agregarCalificacion(80);
        estudiante.agregarCalificacion(90);
        assertEquals(85, estudiante.obtenerPromedio());
    }

    @Test
    public void getNumeroCalificacionesTest() {
        estudiante.agregarCalificacion(75);
        assertEquals(3, estudiante.getNumeroCalificaciones());
    }

    @Test
    public void agregarCalificacionExcepcionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estudiante.agregarCalificacion(200);
        });
        assertEquals("La calificación debe estar entre 0 y 100.", exception.getMessage());
    }
}
