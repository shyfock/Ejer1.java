import java.util.Scanner;

public class P1_U1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer número:");
        float num1 = sc.nextFloat();
        System.out.println("Digite el segundo número:");
        float num2 = sc.nextFloat();
        System.out.println(operaciones(num1, num2));
        sc.close();

        
    }
    public static String operaciones(float num1, float num2) {
        float suma = num1 + num2;
        float resta = num1 - num2;
        float mult = num1 * num2;
        float div = num1 / num2;
        var res1 = "La suma de " + num1 + " y " + num2 + " es igual a " + suma;
        var res2 = "La resta de " + num1 + " y " + num2 + " es igual a " + resta;
        var res3 = "La multiplicación de " + num1 + " y " + num2 + " es igual a " + mult;
        var res4 = "La división de " + num1 + " y " + num2 + " es igual a " + div;
        return res1 + res2 + res3 + res4;

    }
}
