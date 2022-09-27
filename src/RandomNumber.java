import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RandomNumber {

    public List<Player> randomListGenerator(List<Player> sortedPlayers) {
        Random rand = new Random();
        int upperbound = sortedPlayers.size();
        int intRandom = 0;

        int selectedNumber;
        List<Integer> randomNumbers;
        randomNumbers = new ArrayList<>();
        selectedNumber = intRandom;
        randomNumbers.add(selectedNumber);

        while (randomNumbers.size() != sortedPlayers.size()) {
            intRandom = rand.nextInt(upperbound);
            selectedNumber = intRandom;
            if (!randomNumbers.contains(selectedNumber)) {
                selectedNumber = intRandom;
                randomNumbers.add(selectedNumber);
            }
        }

        List<Player> selectedNames;
        selectedNames = new ArrayList<>();


        for (int i = 0; i < sortedPlayers.size(); i++) {
            int a = randomNumbers.get(i);
            sortedPlayers.get(a).teams = new ArrayList<>();
            selectedNames.add(sortedPlayers.get(a));
            System.out.println(selectedNames);
        }
        System.out.println("The selected order will be: ");
        return selectedNames;
    }
}