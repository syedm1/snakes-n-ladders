package src;

import org.jetbrains.annotations.NotNull;
import src.Enums.SnakeSizes;
import src.Models.Snake;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public final class Utils {
    private static Utils uniqueInstance;

    private Utils() {
    }

    public static Utils getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Utils();
        }
        return uniqueInstance;
    }

    public static boolean StringIsNullOrEmpty(@NotNull String input) {
        if (input.isEmpty() || input == null) {
            return true;
        }
        return false;
    }
    public static void PrintToConsole(String display) {
        System.out.println(display);
    }
    public static int RandomIntGeneratorInGivenRange(int min, int max){
        return new Random().nextInt(min, max);
    }

    public static boolean ContainsObjectInListWithHash(List<Snake> list, Snake object){
            return list.stream().anyMatch(o -> o.equals(object));
    }

    public static SnakeSizes GetRandomSnakeSize(){
        List<SnakeSizes> diffSize = new ArrayList<SnakeSizes>(Arrays.asList(SnakeSizes.values()));
        Random rand = new Random();
        return diffSize.get(rand.nextInt(diffSize.size()));
    }

    public static void writeTOFile(String input, String path) {
        try (FileWriter file = new FileWriter(path)) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(input);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


