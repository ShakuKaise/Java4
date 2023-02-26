public class User {
    private int money;
    private String username;
    private Account UserAccount;

    public void setMoney(int money) { this.money = money; }

    public int getMoney() { return money; }

    public void setUsername(String username) { this.username = username; }

    public String getUsername() { return username; }

    public void setUserAccount(Account UserAccount) { this.UserAccount = UserAccount; }

    public Account getUserAccount() { return UserAccount; }
}
