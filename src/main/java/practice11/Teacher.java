package practice11;


import java.util.LinkedList;

public class Teacher extends Person{
    protected LinkedList<Klass> classes;

    public Teacher(int id , String name, int age, LinkedList<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
    }
    public Teacher(int id ,String name, int age) {
        super(id,name, age);

    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        String teachClasses = "";
        for(int i = 0 ; i < this.classes.size(); i ++){
            if(i < this.classes.size() - 1)
                teachClasses += this.classes.get(i).getNumber() + ", ";
            else
                teachClasses += this.classes.get(i).getNumber() ;
        }
        if(teachClasses != "" && teachClasses != null)
            return super.introduce() + "I am a Teacher. I teach Class +"+teachClasses+".";
        else
            return super.introduce() + " I am a Teacher. I teach No Class.";
    }



    public  String introduceWith(practice10.Student student){
        boolean isTeach = false;
        for(int i = 0 ; i < this.classes.size(); i ++){
            if(this.classes.get(i).getNumber() == student.getKlass().getNumber())
                isTeach = true;
        }
        if(isTeach)
            return super.introduce() + " I am a Teacher. I teach "+student.getName()+".";
        else
            return super.introduce() + " I am a Teacher. I don't teach "+student.getName()+".";
    }

    public boolean isTeaching(Student student){
        for(int i = 0 ; i < this.classes.size(); i ++){
            if(this.classes.get(i).getNumber() == student.getKlass().getNumber())
                return true;
        }
        return false;
    }
}

