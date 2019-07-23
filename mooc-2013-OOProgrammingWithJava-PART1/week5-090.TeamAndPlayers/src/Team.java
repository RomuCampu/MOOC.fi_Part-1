
import java.util.ArrayList;

public class Team {

    private ArrayList<Player> team = new ArrayList();
    private String name;
    private int maxSize = 16;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (team.size() < this.maxSize) {
            team.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : team) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        int numberOfPlayers = 0;
        for (Player player : team) {
            System.out.println(player);
            numberOfPlayers++;
        }
        return numberOfPlayers;
    }

    public int goals() {
        int goals = 0;
        for (Player players : team) {
            goals += players.goals();
        }
        return goals;
    }
}
