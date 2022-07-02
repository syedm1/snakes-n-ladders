package src.Core;

import src.Interfaces.BoardBuilderInterface;

public class BoardGenerator implements BoardBuilderInterface {
    @Override
    public String[][] generateBoard(int total, int width) {
        int rows = total / width;
        int cols = width;
        return new String[rows][cols];
    }
}
