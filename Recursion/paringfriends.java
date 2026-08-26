import java.util.*;

public class paringfriends {

public static int pairingWays(int n) {

    if (n == 1) {
        return 1;
    }

    if (n == 2) {
        return 2;
    }

    return pairingWays(n - 1) + (n - 1) * pairingWays(n - 2);
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

System.out.print("Enter number of friends: ");
int n = sc.nextInt();

System.out.println(pairingWays(n));
    }
}
