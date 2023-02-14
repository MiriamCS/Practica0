package es.uji.al415634.Estadistica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {
    Estadistica p1 = new Estadistica();
    int[] v1 = {5,5,5,5,5};
    int[] v2 = {-1,-2,0,1,2};
    int[] v3 = {3};
    int[] v4 = {1,2,3,4,5};
    int[] v5 = {};

    boolean excepcionLanzada=false;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    private void printv(int[] vector){
        for(int i=0; i<vector.length; i++){
            System.out.print(vector[i]+" ");
        }
    }
    @Test
    void media() {
        assertEquals(5, p1.media(v1));
        assertEquals(0, p1.media(v2));
        assertEquals(3, p1.media(v3));
        assertEquals(3, p1.media(v4));
        try {
            p1.media(v5);
        } catch(NoSuchElementException e){
            excepcionLanzada=true;
        }
        assertTrue(excepcionLanzada);
        excepcionLanzada=false;
    }


    @Test
    void varianza() {
        double[] soluciones = {0,0.8,0,0.8};
        assertEquals(0, p1.varianza(v1));
        assertEquals(0.8, p1.varianza(v2));
        assertEquals(0, p1.varianza(v3));
        assertEquals(0.8, p1.varianza(v4));
        try {
            p1.varianza(v5);
        } catch(NoSuchElementException e){
            excepcionLanzada=true;
        }
        assertTrue(excepcionLanzada);
        excepcionLanzada=false;
    }

    @Test
    void desviacion() {
        assertEquals(0, p1.desviacion(v1));
        assertEquals(0.8944271909999159, p1.desviacion(v2));
        assertEquals(0, p1.desviacion(v3));
        assertEquals(0.8944271909999159, p1.desviacion(v4));
        try {
            p1.desviacion(v5);
        } catch(NoSuchElementException e){
            excepcionLanzada=true;
        }
        assertTrue(excepcionLanzada);
        excepcionLanzada=false;
    }
}