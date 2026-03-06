import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        scanner.close();
        System.out.println(getLastLetters(text));
    }

    public static String getLastLetters(String text) {
        if (text == null || text.isEmpty()) {
            return "Строка пустая, текст не введен";
        }

        String[] newText = text.split("[\\s\\p{Punct}]+");
        System.out.println("Количество слов в тексте равно " + newText.length);

        StringBuilder stringBuilder = new StringBuilder();
        for (String word : newText) {
            stringBuilder.append(word.charAt(word.length() - 1));
        }
        return stringBuilder.toString();
    }
}