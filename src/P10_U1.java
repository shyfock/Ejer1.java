import java.util.Scanner;

public class P10_U1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------\nSerie fibonacci\n----------------");
        System.out.println("Ingrese un número entero:");
        int numEnt = sc.nextInt();
        int j = 0;
        do {
            System.out.print("f("+j+") = " + fibonacci(j)+"\n");
            j += 1;
        } while (fibonacci(j) <= numEnt);
        sc.close();
    }

    public static int fibonacci(int n) {
        int fibo = 0;
        if (n == 0) {
            fibo = 0;
        } else if (n == 1) {
            fibo = 1;
        } else if (n > 1) {
            int n1 = 0;
            int n2 = 1;
            int n3 = 1;
            int i = 2;
            do {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                i += 1;
            } while (i <= n);
            fibo = n3;
        }
    return fibo;
    }
}
