package SS3;

public class VD6 {
    public  void addNumber ( int...num){
        int sum = 0;

        for (int i:num){
            sum = sum +i;
        }

        System.out.println("Sum of number is : " +sum);
    }

    public static void main(String[] args) {
        VD6 obj =new VD6();

        obj.addNumber(10,30,20,40);
    }
}
