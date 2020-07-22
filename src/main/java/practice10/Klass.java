package practice10;
;

public class Klass {
    protected int number;
    protected Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class "+this.getNumber();
    }


    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student){
        if(student.getKlass().getNumber() != this.number)
            System.out.println("It is not one of us.");
        else
            this.leader = student;
    }

    public void appendMember(Student student) {
        student.getKlass().setNumber(this.getNumber());
    }
}
