import java.util.Scanner;

public class P4_U1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número entero positivo cualquiera:");
        int num = sc.nextInt();
        sc.close();
        System.out.println("La tabla del " + num + " es:");
        for (int i = 0; i < 11; i++) {
            System.out.println(num + "*"+ i + " = " + num * i );
            
        }
    }
}
