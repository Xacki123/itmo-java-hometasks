package ru.tsvetkov.homeworke.hw7.base;

abstract public class TeachHumen extends Humen{
    protected String nameStudySubject;
    protected int level;
    public TeachHumen(String name, int age, String nameStudySubject, int level){
        super(name,age);
        if (nameStudySubject.length() < 4){
            throw new IllegalArgumentException("Назавние предмета должно содержать больше 4 символов");
        }
        this.nameStudySubject = nameStudySubject;
        if (level < 1){
            throw new IllegalArgumentException("Уровень не может быть меньше 1");
        }
        this.level = level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getNameStudySubject() {
        return nameStudySubject;
    }

    abstract public void teach(TeachHumen teachHumen);
}
