public class Main {
    public static void main(String[] args) {

        Laundry laundry = new Laundry();

        laundry.black = 1;
        laundry.white = 3;
        laundry.color = 4;

        int counter = abc(laundry.black, laundry.color, laundry.white);

        if (counter > 10) {
            System.out.println(result());
        } else {
        System.out.println("not enough things to do laundry"); }


    }
    public static int abc (int a, int b, int c) {
       return a + b + c;
    }
    public static String result (){
        return "szuruburu pyr pyr pyr";
    }
}
