public class Students {
    String name;
    int grade;
    String classname;

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getClassname() {
        return classname;
    }
    public String toString(){
        return "  name :" + name +"  grade :"+grade+"  classname :"+classname+"\n";
    }

    Students(String name, int grade, String classname){
        this.name = name;
        this.grade=grade;
        this.classname=classname;

    }

}
