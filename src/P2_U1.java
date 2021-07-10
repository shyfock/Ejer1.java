import java.util.Scanner;

public class P2_U1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre completo del alumno:");
        String nomAlum = sc.next();
        System.out.println("Digite la nota de la evaluacion #1:");
        float nota1 = sc.nextFloat();
        System.out.println("Digite la nota de la evaluacion #2:");
        float nota2 = sc.nextFloat();
        System.out.println("Digite la nota de la evaluacion #3:");
        float nota3 = sc.nextFloat();
        sc.close();
        var prom = (nota1 + nota2 + nota3)/3;
        if (prom >= 3.0) {
            System.out.println(nomAlum + " - Aprobado");
            //System.out.println("La nota final es: " + prom);
        }
        else {
            System.out.println(nomAlum + " Reprobado");
            //System.out.println("La nota final es: " + prom);
        }
        System.out.println("La nota final es: " + prom);
    }
    
}
