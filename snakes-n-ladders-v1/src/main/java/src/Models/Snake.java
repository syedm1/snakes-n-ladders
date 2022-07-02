package src.Models;

import java.util.Objects;

public class Snake {
    public int id;
    public String type;
    public int start;
    public int end;

    public Snake(int id, String type, int start, int end) {
        this.id = id;
        this.type = type;
        this.start = start;
        this.end = end;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snake snake = (Snake) o;
        return this.hashCode()== snake.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, start, end);
    }
}
