package SwitchStatemants;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        number++;
        System.out.println(number);
    }
}
