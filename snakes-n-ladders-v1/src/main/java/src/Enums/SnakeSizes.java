package src.Enums;

public enum SnakeSizes {
    SMALL(5),
    MEDIUM(10),
    LARGE(20);

    private int size;
    public int getSize() {
        return size;
    }
    SnakeSizes(int length) {
        size = length;
    }

}