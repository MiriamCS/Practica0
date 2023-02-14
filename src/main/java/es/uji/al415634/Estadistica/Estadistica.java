package es.uji.al415634.Estadistica;

import java.util.NoSuchElementException;

public class Estadistica {
    public Estadistica(){
        super();
    }

    public double media(int[] vector) throws NoSuchElementException {
        if(vector.length==0){
            throw new NoSuchElementException();
        }
        int suma=0;
        for(int i=0; i< vector.length; i++){
            suma += vector[i];
        }
        return suma/ vector.length;
    }
    public double varianza(int[] vector)throws NoSuchElementException {
        if(vector.length==0){
            throw new NoSuchElementException();
        }
        double media=media(vector);
        double sumatorio=0;
        for(int i=0; i< vector.length; i++){
            sumatorio = Math.pow((vector[i] - media),2);
        }
        return sumatorio/ vector.length;
    }
    public double desviacion(int[] vector)throws NoSuchElementException {
        if(vector.length==0){
            throw new NoSuchElementException();
        }
        double varianza=varianza(vector);
        return Math.sqrt(varianza);
    }
}
