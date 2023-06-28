public class thirty9 {
    int id;
    String name;
    double salary;
    static String company="Infosys";
    thirty9(int a,String s,double d)
    {
        id=a;
        name=s;
        salary=d;
    }
    void display(){
        System.out.println(id+"\t\t|\t"+name+" \t\t|\t"+salary+" \t|\t"+company);
    }
    public static void main(String[] args) {

        thirty9 emp=new thirty9(101,"Dipak",45000);
        thirty9 emp1=new thirty9(102,"Amit",50000);
        System.out.println("Details of employees\n");
        System.out.println("\nEmpid \t|\tempname \t|\tEmpsalary \t|\tCompany");
        emp.display();
        emp1.display();

    }
}
