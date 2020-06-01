import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        //输出空心金字塔
        Scanner Sc = new Scanner(System.in);
        System.out.println("情书入要求金字塔的层数");
        int num1 = Sc.nextInt();
        for (int i = 1; i <= num1; i++) {
            for (int k = 1; k <= num1 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i -1) ; j++) {
                if(j == 1 || j == (2 * i -1) || i == num1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
