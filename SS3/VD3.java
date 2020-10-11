package SS3;

public class VD3 {
    public void setVal(int num1){
        num1 = num1 +10;
    }

    public static void main(String[] args) {
        int num1 = 10;

        VD3 obj=new VD3();

        obj.setVal(num1);

        System.out.println("Vaalue of num1 after invoking setVal is: "+num1);
    }
}
