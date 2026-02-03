package OOP.Inner_Classes_Exercise;
public class Main4{
    public static void main(String[] args){
        School sc = new School("Kigali Independent University");
        sc.showStudentInfo();
        sc.showDepartment();

        School.Teacher scT = sc.new Teacher();
        scT.showTeacher();
    }
}