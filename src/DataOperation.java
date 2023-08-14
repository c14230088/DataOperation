
import java.util.Scanner;

public class DataOperation {
    public static void main(String[] args) {

        int m = 2;
        byte a = 127;
        short z = 32767;
        long x = 367233;
        double b = 12.7;

        long F =m*a;
        long f=F+z;
        double Jawaban=f/b+x;

        Scanner scan = new Scanner(System.in);
        System.out.println("f/b+y= ");
        int jawaban = scan.nextInt();
        if(jawaban == Jawaban) {
            System.out.println("jawabanmu bener");
        } else {
            System.out.println("jawabanmu salah");
        }

    System.out.println("Diketahui :");
        System.out.println("m=" +m +"Kg");
        System.out.println("a=" +a + "m/s");
        System.out.println("z=" +z);
        System.out.println("x=" +x);
        System.out.println("Ditanya:");
        System.out.println("F=? dan F+z=?");
        System.out.println("Jika F+z adalah f maka f/b+y adalah?");
        System.out.println();
        System.out.println("Jawab:");
        System.out.println("F=m*a");
        System.out.println("F=" + F + "m/s");
        System.out.println("");
        System.out.println("f=F+z");
        System.out.println("f=" +f +" Joule");
        System.out.println("");
        System.out.println("f/b+x= " +f +" / " +b +" + " +x);
        System.out.println("f/b+x=" +Jawaban);



    }
}

