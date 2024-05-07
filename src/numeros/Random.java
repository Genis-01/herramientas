package numeros;

public class Random {
    public static Integer numeroInteger(Integer numeroMin, Integer numeroMax){
        int diferencia = numeroMax - numeroMin;
        return (int) (Math.random() * diferencia + numeroMin);
    }

    public static Double numeroDouble(Double numeroMin, Double numeroMax, int numeroDecimales){
        double diferencia = numeroMax - numeroMin;
        return (double) Math.round((Math.random() * diferencia + numeroMin) * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);

    }
}
