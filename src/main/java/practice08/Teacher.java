package practice08;

import practice07.Klass;
import practice07.Student;

public class Teacher extends Person{
    protected practice07.Klass klass;

    public Teacher(int id , String name, int age, practice07.Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }
    public Teacher(int id ,String name, int age) {
        super(id,name, age);

    }


    @Override
    public String introduce() {
        if(this.klass != null && this.getKlass().getNumber() != 0)
            return super.introduce() + "I am a Teacher. I teach Class +"+this.getKlass().getNumber()+".";
        else
            return super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public Klass getKlass() {
        return klass;
    }

    public  String introduceWith(Student student){
        if(this.klass != null && this.klass.getNumber() == student.getKlass().getNumber())
            return super.introduce() + " I am a Teacher. I teach "+student.getName()+".";
        else
            return super.introduce() + " I am a Teacher. I don't teach "+student.getName()+".";
    }
}
