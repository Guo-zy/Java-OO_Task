package practice09;


public class Student extends Person{
    protected Klass klass;

    public Student(int id , String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        practice08.Student leader = this.getKlass().getLeader();
        if(leader != null && leader.getName().equals(this.getName()))
            return super.introduce() + "I am a Student. I am Leader of Class "+this.klass.getNumber()+".";
        else
            return super.introduce() + "I am a Student. I am at Class "+this.klass.getNumber()+".";
    }

    public Klass getKlass() {
        return klass;
    }
}
