package ru.tsvetkov.homeworke.hw20.base;

import ru.tsvetkov.homeworke.hw20.BinHandler;
import ru.tsvetkov.homeworke.hw20.units.King;

import java.io.Serializable;
import java.util.Objects;


public class Kingdom implements Serializable {
    // свойства
    private King king;

    transient private BinHandler<Kingdom> kingdomHandler;

    public Kingdom(King king){
        if (king ==null){
            System.out.println("Король не задан");
        }
        this.king = king;
        this.kingdomHandler = new BinHandler<>();
    }



    public void saveKingdom(){
        kingdomHandler.writeToFile(this);
    }

    public Kingdom loadKingdom(){
      return kingdomHandler.readFromFile();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kingdom kingdom = (Kingdom) o;

        if (!Objects.equals(king, kingdom.king)) return false;
        return Objects.equals(kingdomHandler, kingdom.kingdomHandler);
    }

    @Override
    public int hashCode() {
        int result = king != null ? king.hashCode() : 0;
        result = 31 * result + (kingdomHandler != null ? kingdomHandler.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Kingdom{" +
                "king=" + king +
                '}';
    }
}
