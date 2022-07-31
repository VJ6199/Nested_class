class Company {
    String name;
    String address;
    String salary;

    void employer() {
        System.out.println("Company name = " + "Amazon");
    class employee {
        void employeedetails() {
            System.out.println("employee name = " + "vijay");
            System.out.println("employee address = " + "Manchester");
            System.out.println("employee salary = " + "12k");
        }
    }
    employee z = new employee();
    z.employeedetails();
}
}
public class local_innerclass {
    public static void main(String[] args){
        Company Amazon = new Company();
        Amazon.employer();
    }
}
