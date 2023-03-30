public class ex001{
    public static void main(String[] args){
        int number = 6;
        ex1(number);
    }
    static void ex1(int number){
        //Вычислить n-ое треугольного число (сумма чисел от 1 до n)
        int one = 1;
        int summ = 0;
        for (int i = one; i < number + 1; i++) {
            summ += i;
        }
        System.out.println("Сумма чисел от " + one +" до " + number + " равна: " + summ);
    }
}