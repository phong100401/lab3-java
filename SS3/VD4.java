package SS3;

class  Circle{
    public double getPI(){
        return 3.14;
    }
}

public class VD4 {
    public void calArea(Circle objPi, double rad){

        double area = objPi.getPI() * rad *rad ;

        System.out.println("Area of is: " +area);
    }

    public static void main(String[] args) {
        VD4 p1 = new VD4();
        p1.calArea(new Circle(),2);
    }
}
