package es.uji.al415634.Estadistica;

public class Estadistica {
    private static int[] vector;
    public Estadistica(){
    }
    public double media(int[] vector){
        int suma=0;
        for(int i=0; i< vector.length; i++){
            suma += vector[i];
        }
        return suma/ vector.length;
    }
    public double varianza(int[] vector){
        double media=media(vector);
        double sumatorio=0;
        for(int i=0; i< vector.length; i++){
            sumatorio = Math.pow((vector[i] - media),2);
        }
        return sumatorio/ vector.length;
    }
    public double desviacion(int[] vector){
        double varianza=varianza(vector);
        return (double) Math.sqrt(varianza);
    }
}
