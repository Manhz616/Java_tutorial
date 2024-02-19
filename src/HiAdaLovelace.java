import java.util.Scanner;
public class HiAdaLovelace {
    public static void main(String[] args) {
        int n;
        String name;
        Scanner banPhim = new Scanner(System.in);
        n = banPhim.nextInt();
        name = banPhim.nextLine();
        while(n>0) {
            name = banPhim.nextLine();
            System.out.println("Hi " + name);
            n--;
        }
    }

}
