import java.util.Scanner;

public class papap {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("请书入要求金字塔的层数：");
        int num1 = Sc.nextInt();
        for (int i = 1; i <= num1; i++) {
            for (int k = 1; k <= num1 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i -1) ; j++) {
                if(j >= 1 && j <= (2 * i -1)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
