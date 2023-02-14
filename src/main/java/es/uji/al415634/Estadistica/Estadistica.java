package es.uji.al415634.Estadistica;

public class Estadistica {
    private static int[] vector;
    public Estadistica(int[] vector){
        this.vector = vector;
    }
    public double media(){
        int suma=0;
        for(int i=0; i< vector.length; i++){
            suma += vector[i];
        }
        return suma/ vector.length;
    }
    public double varianza(){
        double media=media();
        double sumatorio=0;
        for(int i=0; i< vector.length; i++){
            sumatorio = Math.pow((vector[i] - media),2);
        }
        return sumatorio/ vector.length;
    }
    public double desviación(){
        double varianza=varianza();
        return Math.sqrt(varianza);
    }
}
