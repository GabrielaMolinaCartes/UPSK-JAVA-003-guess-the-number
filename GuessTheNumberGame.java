import java.util.Random;

public class GuessTheNumberGame {
    private final int targetNumber;
    private Player currentPlayer;
    private final Player humanPlayer;
    private final Player computerPlayer;

    public GuessTheNumberGame() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;
        humanPlayer = new HumanPlayer("Jugadora");
        computerPlayer = new ComputerPlayer("Ordenador");
        currentPlayer = humanPlayer;
    }

    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.play();
    }

    private void play() {
        System.out.println("Bienvenido al juego de adivinar el número!");
        while (true) {
            int guess = currentPlayer.makeGuess();
            System.out.println(currentPlayer.getName() + " supuso: " + guess);
            if (checkGuess(currentPlayer, guess)) {
                System.out.println(currentPlayer.getName() + " adivinó el número " + targetNumber + "!");
                System.out.println("Historial de suposiciones: " + currentPlayer.getGuesses());
                break;
            }
            switchPlayer();
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == humanPlayer) ? computerPlayer : humanPlayer;
    }

    private boolean checkGuess(Player player, int guess) {
        if (guess == targetNumber) {
            return true;
        } else {
            System.out.println("Intento " + player.getName() + ": " + guess);
            System.out.println("¡Incorrecto! El número objetivo es " + ((guess < targetNumber) ? "mayor" : "menor") + ".\n");
            return false;
        }
    }
}
