public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        System.out.println("3 - " + numJewelsInStones("Aa", "aAAbbbb"));


    }
    public static int numJewelsInStones(String jewels, String stones) {

        // create a count variable and set to 0
        // loop through the chars in jewels
        // for each char in jewels, loop through stones
        // each time the jewel char is same as stone char, add 1 to count
        // return count
        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);

            for (int j = 0; j < stones.length(); j++) {
                char st = stones.charAt(j);

                if (ch == st) {
                    count++;

                }

            }

        }

        return count;
    }
}