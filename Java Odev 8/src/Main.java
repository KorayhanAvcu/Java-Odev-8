
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int s1,s2,select;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz : ");
        s1 = inp.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        s2 = inp.nextInt();

        System.out.println("1-)Toplama\n2-)Cikarma\n3-)Carpma\n4-)Bolme ");
        System.out.print("Seciniz : ");
        select = inp.nextInt();
        switch (select){
            case 1:
                System.out.print("Sonuc  : " + (s1+s2));
                break;
            case 2:
                System.out.print("Sonuc  : " + (s1-s2));
                break;
            case 3:
                System.out.print("Sonuc  : " + (s1*s2));
                break;
            case 4:
                System.out.print("Sonuc  : " + (s1/s2));
                break;
        }

    }
}