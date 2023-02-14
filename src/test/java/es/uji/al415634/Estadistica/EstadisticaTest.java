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
    int[][] vectores = {v1,v2,v3,v4,v5};

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
        System.out.println("\n-----------\nPruebas media:");
        double[] soluciones = {5,0,3,3};
        for(int i=0; i< vectores.length; i++){
            System.out.print("\nconj" + (i+1) +": ");
            printv(vectores[i]);
            if(vectores[i].length == 0){
                System.out.println("\nSe espera una excepcion");
                try {
                    p1.media(vectores[i]);
                } catch(NoSuchElementException e){
                    System.out.println("Se ha lanzado la excepcion");
                }
            }
            else
                System.out.println("\nSe espera: " +soluciones[i] + "\nSe ha obtenido: "+ p1.media(vectores[i]));
        }

    }

    @Test
    void varianza() {
        System.out.println("\n-----------\nPruebas varianza:");
        double[] soluciones = {0,0.8,0,0.8};
        for(int i=0; i< vectores.length; i++){
            System.out.print("\nconj" + (i+1) +": ");
            printv(vectores[i]);
            if(vectores[i].length == 0){
                System.out.println("\nSe espera una excepcion");
                try {
                    p1.varianza(vectores[i]);
                } catch(NoSuchElementException e){
                    System.out.println("Se ha lanzado la excepcion");
                }
            }
            else
                System.out.println("\nSe espera: " +soluciones[i] + "\nSe ha obtenido: "+ p1.varianza(vectores[i]));
        }
    }

    @Test
    void desviacion() {
        System.out.println("\n-----------\nPruebas desviacion tipica:");
        double[] soluciones = {0,0.8944271909999159,0,0.8944271909999159};
        for(int i=0; i< vectores.length; i++){
            System.out.print("\nconj" + (i+1) +": ");
            printv(vectores[i]);
            if(vectores[i].length == 0){
                System.out.println("\nSe espera una excepcion");
                try {
                    p1.desviacion(vectores[i]);
                } catch(NoSuchElementException e){
                    System.out.println("Se ha lanzado la excepcion");
                }
            }
            else
                System.out.println("\nSe espera: " +soluciones[i] + "\nSe ha obtenido: "+ p1.desviacion(vectores[i]));
        }
    }
}