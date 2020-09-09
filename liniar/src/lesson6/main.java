package lesson6;

public class main {
    public static void main(String[] args) {
        int x = 5;
        int y = 9;
        System.out.println("x = " + x);

        String name = "0x41";
        String surname = "cronis";

        String bio = name + (char)0x20 + surname;
        System.out.println(bio);

        System.out.println(x+y);
        System.out.println(x+" "+y);
        System.out.println(x+y+" "+x+y);
        System.out.println((x+y)+" "+(x+y));


        int x1 = 4;
        int y1 = 5;
        x1 += 4;
        System.out.println(x1);

        System.out.println(y1/x1);
        System.out.println(y1%x1);


        int number = 725;
        int h = number/100;
        int temp = 100 % 100;
        int d = (number - h*100)/10;
        int e = number %10;
        System.out.println(h + " " + d + " " + e);


    }
}
