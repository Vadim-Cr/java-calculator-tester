package Model;

public class Calculator {
        // Metodo per sommare due numeri
        public float add(float num1, float num2) {
            return num1 + num2;
        }

        // Metodo per sottrare due numeri
        public float subtract(float num1, float num2) {
            return num1 - num2;
        }

        // Metodo per moltiplicare due numeri
        public float multiply(float num1, float num2) {
        return num1 * num2;
        }

        // Metodo per dividere due numeri
        public float divide(float num1, float num2) {
            if (num2 == 0){
                throw new IllegalArgumentException("il denominatore non può essere 0");}

            return num1 / num2;
        }
}
