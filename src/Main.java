public class Main {
    public static void main(String[] args) {
        int value = 51966;
        String hexString = intToHexString(value);
        System.out.println("Результат: " + hexString);

        String sentence = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";
        String result = lowercaseWords(sentence);

        System.out.println("Результат: " + result);
    }

    public static String intToHexString(int n) {
        String hexString = Integer.toHexString(n).toUpperCase();

        return hexString;
    }

    public static String lowercaseWords(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Рядок не може бути порожнім або нульовим");
        }

        String[] words = s.split("\\s+"); // Розділити речення на слова

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase(); // Замінити слово малими літерами
        }

        return String.join(" ", words);
    }
}