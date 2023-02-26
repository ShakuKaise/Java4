import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("User");
        user.setMoney(0);

        Account account = new Account();
        account.setID(12341234);
        account.setTBD(false);
        account.setMatchMakingRating(5000);
        account.setPrice(1000);

        Booster booster = new Booster();
        booster.setName("DeadInside");
        booster.setMatchMakingRating(8000);
        booster.setBoostedAccount(account);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите кол-во рейтинга для буста - ");
        int MatchMakingRating = sc.nextInt();
        MatchMakingRating = booster.Boost(MatchMakingRating);
        sc.close();
        System.out.printf("Итоговый рейтинг: %d", MatchMakingRating);
    }
}