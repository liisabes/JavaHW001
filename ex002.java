public class ex002 {
    public static void main(String[] args){
        int number = 4;
        ex2(number);

    }
    static void ex2(int number)
    {
        //Вычислить n! (произведение чисел от 1 до n)
        int one = 1;
        int composition = 1;
        for (int i = one; i < number + 1; i++) {
            composition *= i;
        }
        System.out.println("Произведение чисел от " + one +" до " + number + " равно: " + composition);
    }
}