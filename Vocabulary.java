import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

// ich hatte einen Fehler, aber ich habe nicht gefunden wieso
public class Vocabulary {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String swedishWord = parts[0];
                    String germanTranslation = parts[1];
                    String permutedTranslation = permutiere(germanTranslation);
                    System.out.println(swedishWord + " " + permutedTranslation);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String permutiere(String wort) {
        Random random = new Random();
        char[] buchstaben = wort.toCharArray();
        for (int i = 0; i < buchstaben.length; i++) {
            int zufallsIndex = random.nextInt(buchstaben.length);
            char temp == buchstaben[i];
            buchstaben[i] = buchstaben[zufallsIndex];
            buchstaben[zufallsIndex] = temp;
        }
        String permutiertesWort = new String(buchstaben);
        if (permutiertesWort.equals(wort)) {
            return permutiere(wort);
        }
        return permutiertesWort;
    }
}
