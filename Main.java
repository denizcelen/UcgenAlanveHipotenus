import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);

        System.out.println("Üçgen Alan, Çevre ve Hipotenüs progrmaına hoşgeldiniz!");
        System.out.print("Alan ve Çevre için 1'i, Hipotenüs için 2yi seçiniz: ");
        int sec= scanner.nextInt();

        if(sec==1){
            System.out.print("Üçgenin 1inci kenarını giriniz: ");
            int k1= scanner.nextInt();
            System.out.print("Üçgenin 2inci kenarını giriniz: ");
            int k2= scanner.nextInt();
            System.out.print("Üçgenin 3üncü kenarını giriniz: ");
            int k3= scanner.nextInt();
            double u= (k1+k2+k3)/2;
            double alan= u*(u-k1)*(u-k2)*(u-k3);
            System.out.println("Üçgenin alanı: "+ alan);
            System.out.println("Üçgenin çevresi: "+ (u*2));
        }
        if(sec==2){
            System.out.print("Üçgenin 1inci dik kenarını giriniz: ");
            int k4= scanner.nextInt();
            System.out.print("Üçgenin 2inci dik kenarını giriniz: ");
            int k5= scanner.nextInt();
            double hipot= Math.sqrt((k4*k4)+(k5*k5));
            System.out.println("Üçgenin Hipotenüs uzunluğu: " + hipot);
        }
        else{
            System.out.println("Lütfen geçerli bir değer giriniz");
        }
    }
}
