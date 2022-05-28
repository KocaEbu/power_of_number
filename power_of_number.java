import java.util.Scanner;

public class power_of_number {
    public static void main(String[] args) {
        int n,k;

        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen 4'un katlarini gormek istediginiz sayiyi girin: ");
        n= input.nextInt();

        System.out.println("Lutfen 5'in katlarini gormek istediginiz sayiyi girin: ");
        k= input.nextInt();

        for(int i=1; i<= n ; i*=4 ){
            System.out.println("Girdiginiz sayiya kadar olan 4'un katlari : "+i);
        }

        for(int j=1 ; j<= k ; j*=5 ){
            System.out.println("Girdiginiz sayiya kadar olan 5'in katlari : "+j);

        }

        System.out.println("Program Bitti...");

    }
}
