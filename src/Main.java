import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        // Para tomar cuantos jugadores
        System.out.println("How many players?: ");
        Scanner scanner = new Scanner(System.in);
        int numPlayer = scanner.nextInt();

        // Para tomar nombres y orden de los jugadores
        for (int i = 0; i < numPlayer; i++) {

            Scanner scanner0 = new Scanner(System.in);
            System.out.println("Input your name: ");
            String player = scanner0.nextLine();
            Player play1 = new Player();
            play1.name = player;
            players.add(play1);
        }
        System.out.println(players.get(0));
        RandomNumber randomNumber = new RandomNumber();
        List<Player> randomPlayerList = randomNumber.randomListGenerator(players);
        // System.out.println(randomPlayerList);

        // Para tomar los equipos de los jugadores

        List<Player> teams = new ArrayList<>();

        for (int i = 0; i < numPlayer; i++) {
            System.out.println(randomPlayerList.get(i).name + " please input a team: ");
            Scanner scanner2 = new Scanner(System.in);
            String team = scanner2.nextLine();
            Team team1 = new Team();
            team1.name = team;
            randomPlayerList.get(i).teams.add(team1);
        }
    }

}

