package Question_10; //Строка X состоит из нескольких предложений, каждое из которых кончается . или ! или ? знаком. Определить количество предложений в строке X.
import java.util.*;

public class question_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = scanner.nextLine();
        int sentence = str.split("[!?.:]+").length;
        System.out.println("Number of sentences: " + sentence);
    }
}