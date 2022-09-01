import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandom {
    public static void main(String args[]) {

        List<String> names = new ArrayList<>();
        names.add("Castro");
        names.add("Poshoo");
        names.add("Orlando");
        names.add("PoshoPato");

        String ss = "";

        System.out.println(names);

        List<String> slctdNames = new ArrayList<>();

        Random rand = new Random();
        int upperbound = names.size();
        int intRandom;
        int u = 0;
        //intRandom = rand.nextInt(upperbound);
        //System.out.println("Random integer from 0 to 4: " + intRandom);

        List<String> randomNumbers;
        randomNumbers = new ArrayList<>();
        do {
            intRandom = rand.nextInt(upperbound);
            ss = Integer.toString(intRandom);
            randomNumbers.add(ss);
            System.out.println("The selected order will be: " + randomNumbers);
            u++;
        }

        //ss = Integer.toString(intRandom);

        while (randomNumbers.size() < 4);
        intRandom = rand.nextInt(upperbound);
        ss = Integer.toString(intRandom);
            if (randomNumbers.contains(ss)) {
                //System.out.println(intRandom);
                intRandom = rand.nextInt(upperbound);
                ss = Integer.toString(intRandom);
                //System.out.println(ss);
                randomNumbers.add(ss);
                u++;
            }
            else {
                randomNumbers.add(ss);
                u++;
            }

            //System.out.println(u);

        System.out.println("The selected order will be: " + randomNumbers);

        /*for (int i = 0; i < upperbound; i++) {
            ss = randomNumbers(i);
            slctdName = randomNumbers.set(i);
            slctdNames.add(slctdName);
            names.remove(intRandom);
            upperbound--;
            System.out.println(names);
            //System.out.println("The selection order is: " + slctdNames);
            //upperbound = names.size();
        }
*/
        //slctdName = names.get(0);
        //slctdNames.add(slctdName);
        //System.out.println("The selection order is: " + slctdNames);
    }
}
