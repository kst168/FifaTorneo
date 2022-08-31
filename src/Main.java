import java.util.*;

public class Main {

    public static void main(String[] args) {
        // int count = 0;
        // int playerCount = 0;
        // int teamCount = 0;
        // String [] playerList = {null, null, null};
        List<Player> playerList = new ArrayList<>();
        // String[] teamList2 = new String[8];
        // String[] teamList3 = new String[8];
        // String[] teamList4 = new String[8];
        // String [] randomList1 = new String[8];

        // Para tomar cuantos jugadores
        System.out.println("How many players?: ");
        Scanner scanner = new Scanner(System.in);
        int players = scanner.nextInt();

        // Para tomar nombres y orden de los jugadores
        for (int i = 0; i < players; i++) {

            Scanner scanner0 = new Scanner(System.in);
            System.out.println("Input your name: ");
            String player = scanner0.nextLine();
            Player play1 = new Player();
            play1.name = player;
            playerList.add(play1);
        }
        System.out.println(playerList);
    }
}
        // Para tomar equipos por orden
        /*switch (players) {
            case 2:
                String[] teamList = new String[8];

                for (int i = 0; i < playerList.length; i++) {
                    System.out.println(playerList[i] + " please input a team: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String team = scanner1.nextLine();
                    teamList[i] = team;
                }
                for (int i = 0; i < playerList.length; i++) {
                    System.out.println(playerList[i] + " please input a team: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String team = scanner1.nextLine();
                    teamList[i + 4] = team;
                }

        }
/*
    /* Switch Case para ingresar equipos
    switch (playerCount) {
        case 0:
                for (int u = 0; u < 2; u++) {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Input your team: ");
                    String team = scanner1.nextLine();
                    count++;
                    teamList1[u] = team;
                }
        case 1:
                for (int y = 0; y < 2; y++) {
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Input your team: ");
                    String team = scanner2.nextLine();
                    count++;
                    teamList2[y] = team;
                }
        case 2:
                for (int t = 0; t < 2; t++) {
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Input your team: ");
                    String team = scanner3.nextLine();
                    count++;
                    teamList3[t] = team;
                }
        case 3:
                for (int r = 0; r < 2; r++) {
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Input your team: ");
                    String team = scanner4.nextLine();
                    count++;
                    teamList4[r] = team;
                }
        }
    }*/

    /* Para ingresar equipos
    for (int i = 0; i < 8; i++) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your team: ");
        String team = scanner.nextLine();
        count++;
        teamList1[i] = team;
    }*/

        /*
        switch (count) {
            case 1:
                teamList1[i] = team;
                break;
            case 2:
                teamList1[i] = team;
                break;
            case 3:
                teamList2[i] = team;
                break;
            case 4:
                teamList2[i] = team;
                break;
            case 5:
                teamList3[i] = team;
                break;
            case 6:
                teamList3[i] = team;
                break;
            case 7:
                teamList4[i] = team;
                break;
            case 8:
                teamList4[i] = team;
                break;
        }
*/
        /*System.out.println(Arrays.asList(playerList));
        System.out.println(Arrays.asList(teamList1));
        System.out.println(Arrays.asList(teamList2));
        System.out.println(Arrays.asList(teamList3));
        System.out.println(Arrays.asList(teamList4));

        //System.out.println(Arrays.asList(randomList1));

    }
*/




