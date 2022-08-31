import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandom {
    public static void main(String args[]) {

        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");

        String slctdNumber = "";
        String slctdName = "";
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
        while (u < upperbound-1);
        intRandom = rand.nextInt(upperbound);
        ss = Integer.toString(intRandom);
            if (randomNumbers.contains(ss)) {
                intRandom = rand.nextInt(upperbound);
                ss = Integer.toString(intRandom);
                randomNumbers.add(ss); }
            else {
                randomNumbers.add(ss); }
            u++; 
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
