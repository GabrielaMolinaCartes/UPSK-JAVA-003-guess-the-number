import java.util.Scanner;

class HumanPlayer extends Player {
    Scanner scanner;

    public HumanPlayer(String name) {
        this.name = name;
        guesses = new StringBuilder();
        scanner = new Scanner(System.in);
    }

    @Override
    public int makeGuess() {
        System.out.print("Ingrese su suposición: ");
        int guess = scanner.nextInt();
        guesses.append(guess).append(" ");
        return guess;
    }
}