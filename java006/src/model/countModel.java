package model;

public class countModel {
    private int count;

    public countModel() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int increase() {
        return ++this.count;
    }

    public int decrease() {
        return --this.count;
    }

}