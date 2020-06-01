public class P2 {
    public static void main(String[] args) {
        //输出一个空心的菱形
        //化繁为简，先死后活，先设定一个7层的菱形
        //1-4层为金字塔，5-7层为倒金字塔
        /*         *
                 *   *
                *     *
               *       *
                *     *
                 *   *
                   *

         */
        //先打印1-4层，在打印5-7层
        int num = 30;
        for (int i = 1; i <= (num/2 + 1) ; i++) {
            for (int k = 1; k <= (num/2 + 1) - i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i -1) ; j++) {
                if(j == 1 || j == (2 * i -1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        for (int i = num/2; i > 0 ; i--) {

            for (int k = 1; k <= num/2 - i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i -1) ; j++) {
                if(j == 1){
                    System.out.print(" *");
                }else if(j == (2 * i -1)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
