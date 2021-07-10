import java.util.Random;
import java.util.Scanner;

public class P5_U1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int rnd = random.nextInt(100);
        //System.out.println(rnd);
        int num;
        do {
            System.out.println("Adivine el número entre 1 y 100 que ha generado la máquina:");
            num = sc.nextInt();
            if (num > rnd) {
                System.out.println("El número que busca es menor");
            }
            else if (num < rnd) {
                System.out.println("El número que busca es mayor");
            }
        } while (num != rnd);
        System.out.println("¡Haz adivinado el número!");
        sc.close();
    }
}