import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RNG {
    public static void main(String[] args) {

        int[] random = new int[4]; //this code generates numbers 1–4 inclusive
        int[] array = new int[4]; //another array. numbers will be translated here.
        List<String> names = new ArrayList<>();
        names.add("Castro");
        names.add("Poshoo");
        names.add("Orlando");
        names.add("PoshoPato");
        List<String> slctdNames = new ArrayList<>();

            for(int x = 0; x < random.length; x++)
                random[x] = x; //store the index as the *value*

            int rand; //declaration- later instantiated

            for(int x = 0; x < random.length; x++) {
                rand = (int)(Math.random()*4);
                while(random[rand] == -1)
                    rand = (int)(Math.random()*4); //forces to pick another value if random[rand] is already occupied
                if(random[rand] != -1)
                    array[x] = random[rand]; //this stores a random number from 1–4 in the location of random[x];
                random[rand] = -1; //set to -1 so no future rand that results in this rand can access this index
            }

            for(int x = 0; x < array.length; x++)
                array[x] = array[x] + 1;
            System.out.print("\n" + "Randomized values 1-4 inclusive w/o repeats: " + "\n");
            for(int x = 0; x < array.length; x++)

                System.out.print(array[x] + "\t");
        }
    }

