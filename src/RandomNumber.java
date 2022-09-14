import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RandomNumber {    // This class contains a method that randomizes the player order,
                        // in order to more fairly select teams

    public List<Player> randomListGenerator(List<Player> sortedPlayers) {
        Random rand = new Random();                         // Creates an object of the random class
        int upperbound = sortedPlayers.size();              // Sets the maximum random number to the number of players
        int intRandom = 0;                                  // Initializes a variable to randomize numbers

        int number;                                         // Initializes a variable to store random numbers
        List<Integer> randomNumbers;
        randomNumbers = new ArrayList<>();
        number = intRandom;
        randomNumbers.add(number);

        while (randomNumbers.size() != sortedPlayers.size()) {  // This loop will select a random number and check if
            intRandom = rand.nextInt(upperbound);               // the corresponding player has already been selected
            number = intRandom;
            if (!randomNumbers.contains(number)) {
                number = intRandom;
                randomNumbers.add(number);
            }
        }
        //System.out.println(randomNumbers);
        List<Player> selectedNames;
        selectedNames = new ArrayList<>();


        for (int i = 0; i < sortedPlayers.size(); i++) {
            int a = randomNumbers.get(i);
            selectedNames.add(sortedPlayers.get(a));
            System.out.println(selectedNames);
        }
        System.out.println("The selected order will be: ");
        return selectedNames;
    }
}