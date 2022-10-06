package ru.tsvetkov.homeworke.hw6.task3.cats;

public class Mouse {
    private double speedMouse;

    public Mouse(double speedMouse) {
        setSpeedMouse(speedMouse);
    }
    public Mouse(){}

    public double getSpeedMouse() {return speedMouse;
    }

    public void setSpeedMouse(double speedMouse) {
        if (speedMouse < 0){
            throw new IllegalArgumentException("Скорость не может быть меньше нуля");
        }
        this.speedMouse = speedMouse;
    }



    @Override
    public String toString() {
        return "Mouse{" +
                "speedMouse=" + speedMouse +
                '}';
    }
}

