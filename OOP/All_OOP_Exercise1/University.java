public class University{
    private String universityName; // Instance Variable

    // Constructor (parameters)
    public University(String universityName){
        this.universityName = universityName;
    }
    // Private Inner Class
    private class Department{
        public void display(){
            System.out.println("All these Departments are in the " + universityName + " university.");
        }
    }
    public void showDepartment(){
        Department dp = new Department();
        dp.display();
    }
}