import java.util.Scanner;

public class Chuoi {
    public static void main(String[] args) {
        int n;
        String s;
        Scanner banPhim = new Scanner(System.in);
        n = banPhim.nextInt();
        s = banPhim.nextLine();
        while(n>0) {
            s = banPhim.nextLine();
            System.out.println(s);
            n--;
        }
    }
}
