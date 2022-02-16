import java.util.ArrayList;
import java.util.Random;
/**
 * PuzzleJava
 */
public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        Random randMachine = new Random();
        int maxNum = 20;
        int minNum = 1;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            arr.add(randMachine.nextInt(maxNum-minNum)+minNum);
        }
        return arr;
    }
    public String getRandomLetter() {
        Random randomMachine = new Random();
        int maxNum = 26;
        int minNum = 1;

        String[] letters = {"a","e","i","o","u","b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        
        String letter = letters[randomMachine.nextInt(maxNum-minNum)+minNum];

        return letter;
    }

    public String generatePassword() {
        String password = "";
        for (int i = 0; i < 8; i++) {
            password += getRandomLetter();            
        }
        return password;
    }

    public String[] getNewPasswordSet(int lenght) {
        String[] passwords = new String[lenght];
        for (int i = 0; i < passwords.length; i++) {
            passwords[i]=generatePassword();
        }
        return passwords;
    }

    public String[] shuffleArray( String[] array) {
        Random randomMachine = new Random();

        for (int i = 0; i < array.length; i++) {
            int randNum = randomMachine.nextInt(i+1);
            String value = array[i];
            array[i] = array[randNum];
            array[randNum] = value;
        }
        return array;
    }
}