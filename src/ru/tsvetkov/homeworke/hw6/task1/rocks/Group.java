package ru.tsvetkov.homeworke.hw6.task1.rocks;

import java.util.Arrays;

public class Group {
    private Boolean setGroup = true;
    private Mountaineer[] arrMount = new Mountaineer[3];
    private Rock rock;


    public void setRock (Rock rock)
    {
        if (rock == null) {
            throw new IllegalArgumentException("Значение горы не может быть пустым");
        }
        this.rock = rock;
    }
    public void addMountaineer(Mountaineer mount){
        if (setGroup) {
            for (int i = 0; i < arrMount.length; i++) {
                if (arrMount[i] == null) {
                    arrMount[i] = mount;
                    if (i == arrMount.length-1){
                        setGroup = false;
                    }
                    return;
                }
            }
        }
        System.out.println("Набор в группу закрыт по маршруту " + rock.getName() + ":" + rock.getCountry());
    }

    @Override
    public String toString() {
        return "Group{" +
                "setGroup=" + setGroup +
                ", arrMount=" + Arrays.toString(arrMount) +
                ", rock=" + rock +
                '}';
    }
}
