public class ex003 {
    public static void main(String[] args) {
        // Вывести все простые числа от 1 до 1000 
        //(числа, которые делятся только на 1 и на себя без остатка)
        int maxNumber = 1000;
        ex3(maxNumber);
    }
    static void ex3(int maxNumber){
        for (int i = 2; i <= maxNumber; i++) {
            
            boolean primeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNumber = false;
                    break;
                }
            }

            if (primeNumber) {
                System.out.println(i);
            }
        }
    }
}