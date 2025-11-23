package lesson8;

import java.io.Serializable;

public class Ferma implements Serializable {
        //имя, количество свиней

    private String name;
    private int pigCount;

    public Ferma(String name, int pigCount) {
        this.name = name;
        this.pigCount = pigCount;
    }

    @Override
    public String toString() {
        return "Ferma{" +
                "name='" + name + '\'' +
                ", pigCount=" + pigCount +
                '}';
    }
}
