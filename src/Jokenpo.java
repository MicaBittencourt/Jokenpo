import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

    public static void main(String[] args) {

        System.out.println("Digite sua jogada: ");
        System.out.println("1 - Pedra\n" + "2 - Papel\n" + "3 - Tesoura");

        int jogador;

        Scanner jogadaDoUsuario = new Scanner(System.in);
        Random jogadaDoComputador = new Random();

        jogador = jogadaDoUsuario.nextInt();
        int jogo2 = jogadaDoComputador.nextInt(3) + 1;

        switch (jogador){
            case 1:
                System.out.println("Você escolheu: Pedra");
                break;
            case 2:
                System.out.println("Você escolheu: Papel");
                break;
            case 3:
                System.out.println("Você escolheu: Tesoura");
                break;
        }

        System.out.println("Jogada do Computador: " + jogo2);

        switch (jogo2){
            case 1:
                System.out.println("Computador escolheu: Pedra");
                break;
            case 2:
                System.out.println("Computador escolheu: Papel");
                break;
            case 3:
                System.out.println("Computador escolheu: Tesoura");
                break;
        }

        if (jogador == jogo2) {
            System.out.println("Houve um empate!!");

        } else if ((jogador == 1 && jogo2 == 3) || (jogador == 3 && jogo2 == 2) || (jogador == 2 && jogo2 == 1)) {
            System.out.println("Você venceu!!");

        } else if (jogador >= 4) {
            System.out.println("Você fez uma jogada Inválida!!");

        } else { System.out.println("Computador venceu!!");

        }

    }

}
