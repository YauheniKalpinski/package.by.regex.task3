import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        scanner.close();
        System.out.println(getLastLetters(text));
    }

    public static String getLastLetters(String text) {
        String[] newText = text.split("[\\s\\p{Punct}]+");
        if (!text.isEmpty() && newText.length > 0) {
            System.out.println("Количество слов в тексте равно " + newText.length);
            StringBuilder stringBuilder = new StringBuilder();
            for (String word : newText) {
                stringBuilder.append(word.charAt(word.length() - 1));
            }
            return stringBuilder.toString();
        } else {
            return "Строка пустая, текст не введен";
        }
    }
}