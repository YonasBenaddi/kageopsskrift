import fodboldspiller.Fodboldspiller;

public class main {

    public static void main(String[] args) {
        // array på 10 pladser til heltal

        int tal;
        int[] numbers = new int[10];
        numbers[0] = 17;
        numbers[1] = 17;
        numbers[2] = 17;
        numbers[3] = 17;
        numbers[4] = 17;
        numbers[5] = 17;
        numbers[6] = 17;
        numbers[7] = 17;
        numbers[8] = 17;
        numbers[9] = 71;

        int[] numbers2 = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(numbers2[0]);
        System.out.println(numbers2[1]);
        System.out.println(numbers2[2]);
        System.out.println(numbers2[3]);
        System.out.println(numbers2[4]);
        System.out.println(numbers2[5]);
        System.out.println(numbers2[6]);
        System.out.println(numbers2[7]);
        System.out.println(numbers2[8]);
        System.out.println(numbers2[9]);
        //System.out.println(numbers2[10]);


        for (int number : numbers2) {
            System.out.print(number + " ");
            
        }

        System.out.println("Udskriv sidste element " + numbers[numbers.length-1]);


        String[] fodboldspillere = {"Messi", "Ronaldo"};

        Fodboldspiller Messi = new Fodboldspiller("Lionel", "Messi", "Miami", 1.67, 68);
        String[] fodboldspillere2 = {"Messi"};
    }
}
