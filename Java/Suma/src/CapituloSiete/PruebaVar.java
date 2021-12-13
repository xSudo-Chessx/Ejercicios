
package CapituloSiete;

/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaVar {
    public static double promedio(double ... numero){
        double total=0.0;
        for(double d:numero)
            total +=d;
        return total/numero.length;
    }//fin del metodo promedio
    public static void main(String[]args){
        double d1=10.0;
        double d2=20.0;
        double d3=30.0;
        double d4=40.0;
        
        System.out.printf("d1=%.1f\nd2=%.1f\nd3=%.1f\nd4=%.1f\n\n",d1,d2,d3,d4);
        System.out.printf("El promedio de d1 y d2 es=%.1f\n",promedio(d1,d2));
        System.out.printf("El promedio de d1, d2 y d3 es=%.1f\n",promedio(d1,d2,d3));
        System.out.printf("El promedio de d1, d2, d3 y d4 es=%.1f\n",promedio(d1,d2,d3,d4));
        
    }//fin del main
}//fin de la clase pruebavar
