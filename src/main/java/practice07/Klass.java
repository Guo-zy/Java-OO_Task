package practice07;

public class Klass {
    protected int number;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class "+this.getNumber();
    }
}
