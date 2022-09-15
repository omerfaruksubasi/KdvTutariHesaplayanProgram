import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    double tutar, kdvliTutar,kdv;
        Scanner input = new Scanner(System.in);
        System.out.print("kdv sini hesapliyicaginiz tutari giriniz: ");
        tutar = input.nextDouble();
        kdv = tutar>1000 ? tutar*0.8: tutar*0.18;
        kdvliTutar=kdv+tutar;
        System.out.println("kdvsiz tutar: "+tutar);
        System.out.println("kdv tutari: "+kdv);
        System.out.println("kdvli tutar: "+kdvliTutar);

    }
}
