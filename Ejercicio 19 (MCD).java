public class Excercise {
    /**
     * Calcula el máximo común divisor de dos números
     * @return el mcd de a y b
     */
    public static int mcd(int a, int b) {
        int higher = Math.max(a, b); // Se obtiene el valor mayor del par (a, b)
        int lower = Math.min(a, b);  // Se obtiene el valor menor del par (a, b)
        int remainder=1;

        while (lower != 0) {
            remainder = higher % lower; // El resto es el valor del mayor entre el menor
            higher = lower; // Una vez hecha la división, el valor mayor toma el del menor
            lower = remainder; // El valor menor es ahora el resto
        }

        return higher; // Puesto que ahora el valor menor es 0, el mayor es el mcd. 
    }
}