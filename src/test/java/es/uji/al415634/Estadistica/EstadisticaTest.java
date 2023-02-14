package es.uji.al415634.Estadistica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {
    Estadistica p1 = new Estadistica();
    int[] v1 = {5,5,5,5,5};
    int[] v2 = {-1,-2,0,1,2};
    int[] v3 = {3};
    int[] v4 = {1,2,3,4,5};
    //int[] v5 = {};

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void media() {
        assertEquals(5, p1.media(v1));
        assertEquals(0, p1.media(v2));
        assertEquals(3, p1.media(v3));
        assertEquals(3, p1.media(v4));
       // assertEquals(0, p1.media(v2));
    }

    @Test
    void varianza() {
        assertEquals(0, p1.varianza(v1));
        assertEquals(0.8, p1.varianza(v2));
        assertEquals(0, p1.varianza(v3));
        assertEquals(0.8, p1.varianza(v4));
        // assertEquals(0, p1.media(v2));
    }

    @Test
    void desviacion() {
        assertEquals(0, p1.desviacion(v1));
        assertEquals(0.89, p1.desviacion(v2));
        assertEquals(0, p1.desviacion(v3));
        assertEquals(1.41, p1.desviacion(v4));
        // assertEquals(0, p1.media(v2));
    }
}