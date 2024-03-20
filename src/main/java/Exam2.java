public class Exam2 {
    public static void main(String[] args) {
        // 높이 : 3

        /*

         *
         ***
         *****

         */
        printstar(3);
        // 높이 : 5

        /*

         *
         ***
         *****
         *******
         *********

         */
        printstar(5);
        // 높이 : 7

        /*

         *
         ***
         *****
         *******
         *********
         ***********
         *************

         */
        printstar(7);
    }

    public static void printstar(int idx) {
        int line = 0;

        for(int i = 1; i <= idx; i++) {
            for(int j = 1; j <= idx * 2; j++) {
                line = idx - i;
                if(line < j && j < (idx * 2) - line) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}