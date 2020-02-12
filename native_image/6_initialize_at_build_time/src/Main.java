import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.stream.Collectors;

public final class Main {

    public static Map<String, Country> COUNTRIES;

    static {
        try (InputStream resource = Main.class.getResourceAsStream("countries.txt")) {
            COUNTRIES = new BufferedReader(new InputStreamReader(resource, StandardCharsets.UTF_8))
                    .lines()
                    .map(line -> line.split(";"))
                    .collect(Collectors.toMap(array -> array[0], array -> new Country(array[1])));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(COUNTRIES.get(args[0].toUpperCase()).getName());
    }
}
