public class aada {
    //一个球从100米高度自由落下，每次落地后反跳回原高度的一半，再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
    public static void main(String[] args) {


    }

    public  void method(int count) {
        double sum = 0;
        double high = 100;
        for (int i = 1; i < count; i++) {
            high = high / 2;
            sum += high*2;
        }
        System.out.println(sum+100);
        System.out.println(high/2);
    }
}
