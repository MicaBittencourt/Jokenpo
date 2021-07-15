import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

    public static void main(String[] args) {

        System.out.println("Digite sua jogada: ");

        int pedra = 1;
        int papel = 2;
        int tesoura = 3;

        Scanner jogadaDoUsuario = new Scanner(System.in);
        Random jogadaDoComputador = new Random();

        int jogo1 = jogadaDoUsuario.nextInt();
        int jogo2 = jogadaDoComputador.nextInt(3) + 1;

        if (jogo1 == jogo2) {
            System.out.println("Houve um empate!!");

        } else if ((jogo1 == pedra && jogo2 == tesoura) || (jogo1 == tesoura && jogo2 == papel) || (jogo1 == papel && jogo2 == pedra)) {
            System.out.println("Você venceu!!");

        } else if (jogo1 >= 4) {
            System.out.println("Jogada Inválida!!");

        } else { System.out.println("Computador venceu!!");

        }

    }

}
