import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        System.out.println("How many players?: ");
        Scanner playerNumberScanner = new Scanner(System.in);
        int numPlayer = playerNumberScanner.nextInt();

        for (int i = 0; i < numPlayer; i++) {

            Scanner playerNameScanner = new Scanner(System.in);
            System.out.println("Input your name: ");
            String playerNameString = playerNameScanner.nextLine();
            Player playerName = new Player();
            playerName.name = playerNameString;
            players.add(playerName);
        }
        System.out.println(players.get(0));
        RandomNumber randomNumber = new RandomNumber();
        List<Player> randomPlayerList = randomNumber.randomListGenerator(players);

        // List<Player> teams = new ArrayList<>();

        for (int i = 0; i < numPlayer; i++) {
            System.out.println(randomPlayerList.get(i).name + " please input a team: ");
            Scanner teamNameScanner = new Scanner(System.in);
            String team = teamNameScanner.nextLine();
            Team teamName = new Team();
            teamName.name = team;
            randomPlayerList.get(i).teams.add(teamName);
        }
    }

}

