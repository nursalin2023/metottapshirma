import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int[] a ={1,2,3,4,5,6,7,8,9};
         zvezdi(a);
        // Scanner scanner =new Scanner(System.in);
        //int a = scanner.nextInt();
        //int b = scanner.nextInt();
        //int s = scanner.nextInt();
        // sartirovka(a,b,s);
        //  int san = scanner.nextInt();
        // arifmetika(5,4);
        // zvezdi(san);
    }






        public static void arifmetika ( int a, int b ){
            double sum = (double) (a + b) / 2;
            System.out.println(sum);
        }

        public static void zvezdi ( int[] a){
            for (int b : a) {
                System.out.print(b);
            }
        }
        public static void sartirovka ( int a, int b, int s ){
            if (a > b && a > s) {
                System.out.println(a);
            } else if (b > a && b > s) {
                System.out.println(b);
            } else
                System.out.println(s);
        }



    }