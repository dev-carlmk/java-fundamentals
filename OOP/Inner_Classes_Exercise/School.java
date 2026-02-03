package OOP.Inner_Classes_Exercise;
public class School{
    protected String schoolName;
    
    // Constructor
    public School (String schoolName){
        this.schoolName = schoolName;
    }

    // PRIVATE INNER CLASS
    private class Student{
        public void showStudent(){
            System.out.println("Student belongs to " + schoolName);
        }
    }
    public void showStudentInfo(){
        Student st = new Student();
        st.showStudent();
    }


// ------------------------------------------------------------------------------------------------------------


    // PUBLIC INNER CLASS
    public class Teacher{
        public void showTeacher(){
            System.out.println("Teacher works at " + schoolName);
        }
    }


// ------------------------------------------------------------------------------------------------------------


    // INNER CLASS in a METHOD
    public void showDepartment(){
        class Department{
            public void printMessage(){
                System.out.println("Department is inside the School");
            }
        }
        Department dp = new Department();
        dp.printMessage();
    }

}