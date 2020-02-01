import java.util.Arrays;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Colors[] code = new Colors[4];

        for (int i = 0; i < 4; i++) {
            code [i] = Colors.getRandomColor();
        }

        System.out.println(Arrays.toString(code));

        Scanner nameInput = new Scanner(System.in);
        System.out.println("Enter your name: ");
        Player player = new Player(nameInput.nextLine());
    }

    public void guess() {
        Scanner guessInput = new Scanner(System.in);


        Colors[] guessArray = new Colors[4];
        guessArray [0] = guessInput.nextLine();
    }

}
