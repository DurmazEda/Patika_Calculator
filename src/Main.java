import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,islem,Toplama,Cıkarma,Carpma,Bolme;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz:");
        n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cıkarma\n3-Carpma\n4-Bolme");
        islem = input.nextInt();

        switch (islem){
            case 1:
                System.out.println("Toplama İşlemi:" + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma işlemi:"+ (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma işlemi:"+ (n1*n2));
                break;
            case 4:
                if(n2 != 0)
                    System.out.println("Bölme: " + (n1/n2));
                else System.out.println("Bir sayı sıfıra bölünemez.");
                break;

            default:
                System.out.println("Hatalı işlem");
        }


    }
}
