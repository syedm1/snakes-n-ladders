package src;

import com.google.gson.Gson;
import src.Core.BoardGenerator;
import src.Enums.SnakeSizes;
import src.Models.Snake;

import java.util.ArrayList;
import java.util.List;


import static src.Utils.*;

public class SnakeCharmer {
    int _snakeCount = 10;
    String file_path = "src/main/java/src/Config";
    String fileName = "/SnakeLairs.json";
    String full_path = file_path + fileName;
    SnakeCharmer(){

    }

    SnakeCharmer(String path){
        full_path = path;
    }

    SnakeCharmer(String path, int snakeCount){
        full_path = path;
        _snakeCount = snakeCount;
    }

    public void generateSnakeConfig() {
        List<Snake> _snakes = generateSnakes();
        String _json = generateSnakesJSON(_snakes);
        writeTOFile(_json, full_path);
    }

    private String generateSnakesJSON(List<Snake> Snakes) {
        Gson gson = new Gson();
        String json = gson.toJson(Snakes);
        return json;
    }

    private List<Snake> generateSnakes() {
        List<Snake> Snakes = new ArrayList<Snake>();
        BoardGenerator boardGenerator = new BoardGenerator();
        String[][] board = boardGenerator.generateBoard(10, 100);
        while (_snakeCount != 0) {
            Snake tempSnake = generateNewSnake();
            if (ContainsObjectInListWithHash(Snakes, tempSnake)) {
                tempSnake = generateNewSnake();
            } else {
                Snakes.add(tempSnake);
            }
            _snakeCount--;
        }
        return Snakes;
    }

    private Snake generateNewSnake() {
        SnakeSizes snakeSize = GetRandomSnakeSize();
        int start = RandomIntGeneratorInGivenRange(1, 100 - snakeSize.getSize());
        int end = start + snakeSize.getSize();
        Snake tempSnake = new Snake(_snakeCount, snakeSize.toString(), start, end);
        return tempSnake;
    }
}
