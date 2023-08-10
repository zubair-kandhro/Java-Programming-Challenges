public class Employee {
    private String name;
    private int idNumber;
    private String department;
     String position;

    Employee(String name, int idNumber, String department, String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department  = department;
        this.position = position;
    }

    Employee(String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
        this.department  = "";
        this.position = "";
    }

    Employee(){
        this.name = "";
        this.department ="";
        this.position = "";
        this.idNumber = 0;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDepartment(String department){
        this.department =department;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }

    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public String getPosition(){
        return position;
    }
    public int getIdNumber(){
        return idNumber;
    }

    public static void main(String[] args){
        Employee e1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee e2 = new Employee("Mark jones", 39119);
        Employee e3 = new Employee();

        e2.setDepartment("Marketing");
        e2.setPosition("Marketing Coordinator");

        e3.setName("Zubair");
        e3.setIdNumber(12345);
        e3.setDepartment("CS");
        e3.setPosition("Student");

        System.out.print(e1.getName() + "  ");
        System.out.print(e1.getIdNumber() + "  ");
        System.out.print(e1.getDepartment() + "  ");
        System.out.print(e1.getPosition() + "  \n");

        System.out.print(e2.getName() + "  ");
        System.out.print(e2.getIdNumber() + "  ");
        System.out.print(e2.getDepartment() + "  ");
        System.out.print(e2.getPosition() + "  \n");

        System.out.print(e3.getName() + "  ");
        System.out.print(e3.getIdNumber() + "  ");
        System.out.print(e3.getDepartment() + "  ");
        System.out.print(e3.getPosition() + "  \n");
    }






}
