import java.util.Scanner;

public class P6_U1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("CALCULE SU PESO IDEAL");
        System.out.println("-----------------------------");
        System.out.println("Digite su sexo, H para masculino o M para femenino:");
        char sexo = sc.nextLine().charAt(0); //Función para leer un caracter por teclado
        System.out.println("Digite su estatura en cm:");
        int estatura = sc.nextInt();
        //int peso_ideal;
        sc.close();
        if (sexo == 'H'){
            //peso_ideal = estatura - 110;
            System.out.println("Su peso ideal es " + (estatura-110) + "kg");
        } else if (sexo == 'M') {
            //peso_ideal = estatura - 120;
            System.out.println("Su peso ideal es " + (estatura-120) + "kg");
        }
    }
}
