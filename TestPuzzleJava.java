import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generate = new PuzzleJava();
        System.out.println("----------------Get Ten Rolls--------------");
        ArrayList<Integer> ramdomTen = generate.getTenRolls();        
        System.out.println(ramdomTen);

        System.out.println("----------------Get Letter--------------");
        String letter = generate.getRandomLetter();
        System.out.println(letter);
        
        System.out.println("----------------Get Random Password--------------");
        String password = generate.generatePassword();
        System.out.println(password);
        
        System.out.println("----------------Get Random Passwords--------------");
        String[] passwords = generate.getNewPasswordSet(3);
        System.out.println(Arrays.toString(passwords));
        
        System.out.println("----------------Get Random Shuffle--------------");
        String[] data = {"uno", "dos", "tres", "cuatro", "cinco", "seis","siete","ocho","nueve","diez"};
        String[] randomShuffle = generate.shuffleArray(data);
        System.out.println(Arrays.toString(randomShuffle));
    }
}
