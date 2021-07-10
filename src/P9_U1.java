import java.util.Scanner;

public class P9_U1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad:");
        Integer edad = sc.nextInt();
        System.out.println("Ingrese su salario:");
        Integer salario = sc.nextInt();
        if (edad < 16) {
            System.out.println(nombre + ", no tiene edad para trabajar.");
        } else if (edad >= 16 & edad < 19) {
            System.out.println(nombre + " recibe un salario de $" + (salario * 1.0));
        } else if (edad >= 19 & edad < 51) {
            System.out.println(nombre + " recibe un salario de $" + (salario * 1.05));
        } else if (edad >= 51 & edad <= 60) {
            System.out.println(nombre + ", recibe un salario de $" + (salario * 1.10));
        } else {
            System.out.println(nombre + ", recibe un salario de $" + (salario * 1.15));
        }
        sc.close();
    }
}
