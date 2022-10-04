package ru.tsvetkov.homeworke.hw6.task1.rocks;

import java.util.Arrays;

public class Group {
    private Boolean setGroup;
    private Mountaineer[] arrMount = new Mountaineer[3];
    private Rock rock;

    public void setSetGroup(Boolean setGroup) {
        this.setGroup = setGroup;
    }

    public void setRock (Rock rock)
    {
        this.rock = rock;
    }
    public void addMountaineer(Mountaineer mount){
        for (int i = 0; i < arrMount.length; i++) {
            if (arrMount[i] == null) {
                arrMount[i] = mount;
                return;
            }
        }
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
