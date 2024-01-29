abstract class Player {
    protected String name;
    protected StringBuilder guesses;

    public abstract int makeGuess();

    public String getName() {
        return name;
    }

    public String getGuesses() {
        return guesses.toString();
    }
}


