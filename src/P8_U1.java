import java.util.Scanner;

public class P8_U1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("JUGADOR 1:\n---------\nIngrese:\nP = Piedra\nL = Papel\nT = Tijera");
            char jugador1 = sc.nextLine().charAt(0);
            System.out.println("JUGADOR 2:\n---------\nIngrese:\nP = Piedra\nL = Papel\nT = Tijera");
            char jugador2 = sc.nextLine().charAt(0);
            switch (jugador1) {
                case 'P':
                    switch (jugador2) {
                        case 'P':
                            System.out.println("Empate");
                            break;
                        case 'L':
                            System.out.println("Gana Jugador 2");
                            break;
                        case 'T':
                            System.out.println("Gana Jugador 1");
                            break;
                        }
                    break;
                case 'L':
                    switch (jugador2) {
                        case 'P':
                            System.out.println("Gana Jugador 1");
                            break;
                        case 'L':
                            System.out.println("Empate");
                            break;
                        case 'T':
                            System.out.println("Gana Jugador 2");
                            break;
                        }
                    break;
                case 'T':
                    switch (jugador2) {
                        case 'P':
                            System.out.println("Gana Jugador 2");
                            break;
                        case 'L':
                            System.out.println("Gana Jugador 1");
                            break;
                        case 'T':
                            System.out.println("Empate");
                            break;
                        }
                    break;
            }
            System.out.println("¿Jugar otra vez? (S/N)");
            char otra = sc.nextLine().charAt(0);
                if (otra == 'S' | otra == 's') {
                    seguir = true;
                    continue;
                } else if (otra == 'N' | otra == 'n') {
                    seguir = false;
                    break;
                }
        }
        sc.close();
    }
}
