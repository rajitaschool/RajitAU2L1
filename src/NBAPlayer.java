public class NBAPlayer {
    //Declaring Variables
    private String name;
    private String team;
    private int number;

    public NBAPlayer(String playerName, String teamName, int jerseyNumber) {
        name = playerName;
        team = teamName;
        number = jerseyNumber;
    }

    public void aboutme() {
        System.out.println("Hi I'm " + name +", I play for the " + team + " and my jersey number is " + number);
    }
}
