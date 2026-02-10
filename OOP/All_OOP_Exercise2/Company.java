package OOP.All_OOP_Exercise2;
public class Company{
    private String companyName; // Instance Variable

    // Constructor
    public Company(String companyName){
        this.companyName = companyName;
    }

    // Private Inner Class
    private class Department{
        public void showDepartment(){
            System.out.println("Company Name: " + companyName);
        }
    }
    public void displayDepartment(){
        Department dept = new Department();
        dept.showDepartment();
    }
}