import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        System.out.println("How many players?: ");
        Scanner playerNumberScanner = new Scanner(System.in);
        int numPlayers = playerNumberScanner.nextInt();

        System.out.println("How many teams will play in total?: ");
        Scanner teamNumberScanner = new Scanner(System.in);
        int numTeams = teamNumberScanner.nextInt();

        for (int i = 0; i < numPlayers; i++) {

            Scanner playerNameScanner = new Scanner(System.in);
            System.out.println("Input your name: ");
            String playerNameString = playerNameScanner.nextLine();
            Player playerName = new Player();
            playerName.name = playerNameString;
            players.add(playerName);
        }

        RandomNumber randomNumber = new RandomNumber();
        List<Player> randomPlayerList;

        for (int u = 0; u < numTeams/numPlayers; u++) {
            randomPlayerList = randomNumber.randomListGenerator((players));

            for (int i = 0; i < numPlayers; i++) {

                System.out.println(randomPlayerList.get(i).name + " please input a team: ");
                Scanner teamNameScanner = new Scanner(System.in);
                String team = teamNameScanner.nextLine();
                Team teamName = new Team();
                teamName.name = team;
                randomPlayerList.get(i).teams.add(teamName);
            }

        }
        int numGroups = numTeams%numPlayers;

        for (int i = 0; i < 8; i++) {

            Group groupNumber = new Group();
            groupNumber.groupName = "Group " + String.valueOf((char)(i + 'A'));
            System.out.println(groupNumber.groupName);
        }
    }


}

