import java.util.Scanner;

public class P3_U1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el número de horas trabajadas:");
        float horas = sc.nextFloat();
        float salario = horas * 30000;
        System.out.println("El salario a devengar por " + horas + " horas trabajadas es de $" + salario);
        sc.close();

    }
}
