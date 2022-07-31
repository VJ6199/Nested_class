class college{
    void classes(){
        System.out.println("total number of specializations in college is 4");
    }
    static class branch{
        static void Mechanics(){
            System.out.println("total number of sections is 2");
        }
         void students(){
            System.out.println("total number of students in each section is 60");
        }
    }

}

public class Static_inner {
    public static void main(String[] args){
        college BVRIT = new college();
        BVRIT.classes();
        college.branch mechanical = new college.branch();
        college.branch.Mechanics();
        mechanical.students();

    }
}
