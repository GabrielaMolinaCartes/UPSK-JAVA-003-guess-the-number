import java.util.Random;
class ComputerPlayer extends Player {
    Random random;

    public ComputerPlayer(String name) {
        this.name = name;
        guesses = new StringBuilder();
        random = new Random();
    }

    @Override
    public int makeGuess() {
        int guess = random.nextInt(100) + 1;
        guesses.append(guess).append(" ");
        return guess;
    }
}

