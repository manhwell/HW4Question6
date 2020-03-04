// Code by: C2C Riolo
// Doc: Talked with Cadet Thacker about problem solving approaches to this problem.
public class MaxValSubsequence {

    public static void main(String[] args) {
        int[] myArray = algorithm(new int[]{14, 3, -18, 12, 6, -2, 8, 13, 21, -52, 4, 9, 21, 5});
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static int[] algorithm(int[] myArray){
        int[] returnArray = new int[3];
        int currStreak = 0;
        int maxStreak = 0;
        int maxStreakStart = 0;
        int maxStreakEnd = 0;

        for (int i = 0; i < myArray.length; i++) {
            currStreak = currStreak +  myArray[i];

            if(currStreak > maxStreak){
                maxStreakEnd = i;
                maxStreak = currStreak;
            }
            // Your current sequence is now detrimental
            if(currStreak < 0){
                maxStreakStart = i;
                maxStreakEnd = i;
                currStreak = 0;
            }
        }
        returnArray[0] = maxStreak;
        returnArray[1] = maxStreakStart;
        returnArray[2] = maxStreakEnd;
        return  returnArray;
    }
}
