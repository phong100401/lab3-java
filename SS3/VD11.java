package SS3;

public class VD11 {
    int rollNo;
    String Name;
    String Address;
    float marks;

    public VD11(){
        rollNo = 0;
        Name="";
        Address="";
        marks=0;
    }

    public VD11(int rNo,String sname){
        rollNo=rNo;
        Name=sname;
    }

    public VD11(int rNo,float score){
        rollNo=rNo;
        marks=score;
    }

    public VD11(String sname, String addr){
        Name=sname;
        Address=addr;
    }

    public VD11(int rNo, String sname, float score){
        rollNo=rNo;
        Name=sname;
        marks=score;
    }

    public void displayDetail(){
        System.out.println("Rollno"+rollNo);
        System.out.println("Student Name"+Name);
        System.out.println("Address "+Address);
        System.out.println("Score"+marks);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        VD11 objSutID = new VD11("David","302,Washington Street");
        objSutID.displayDetail();

        VD11 objStuID2 = new VD11(103,46);
        objStuID2.displayDetail();

        VD11 objStuID3 = new VD11(104,"Roger",50);
        objStuID3.displayDetail();
    }
}
