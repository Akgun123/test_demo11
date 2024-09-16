public class Main {
    public static void main(String[] args) {
        int score = calculateScore("akgun", 200);

        int newScore = calculateScore(300);
        System.out.println(newScore);


    }

    public static int calculateScore(String playername, int score) {
        System.out.println("player" + playername + "score" + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("unnamed player scored " + score);
        return score * 1000;
    }
}