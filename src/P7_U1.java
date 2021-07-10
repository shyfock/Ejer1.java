import java.util.Scanner;

public class P7_U1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean seguir = true;
        do {
            primo();
            System.out.println("Ha terminado, ¿desea ingresar otro número? (S/N)");
            Character sigue = sc.nextLine().charAt(0);
            if (sigue == 'S' | sigue == 's') {
                seguir = true;
            } else if (sigue == 'N' | sigue == 'n') {
                seguir = false;
                System.out.println("Ha finalizado correctamente.");
            }
        } while (seguir);
        sc.close();
    }
    public static void primo() {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número entero:");
        int num1 = sc.nextInt();
        if (num1 == 1 | num1 == 2) {
            System.out.println("El número " + num1 + " es primo.");
        }
        for (int i = 2; i < num1; i++) {
            int residuo = num1 % i;
            if (residuo == 0) {
                System.out.println("El número " + num1 + " no es primo, " + i + " es uno de sus divisores.");
                break;
            } else if (residuo != 0 & i == num1-1) {
                System.out.println("El número " + num1 + " es primo.");
                break;
            }
        }
    }
}
