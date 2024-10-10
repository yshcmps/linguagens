import java.util.Scanner;

public class programa4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pot1 = 0, pot2 = 0, res = 0;
        boolean led = false;

        System.out.print("Digite o valor do sensor potenciômetro 1: ");
        pot1 = sc.nextInt();
        System.out.print("Digite o valor do sensor potenciômetro 1: ");
        pot2 = sc.nextInt();

        if (pot1 > pot2){
            res += pot1 + pot2;
            System.out.printf("A resposta é: %d ",res);
            led=true;
        }else {
            led=false;
        }

        sc.close();
    }
}
