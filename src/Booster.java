public class Booster {
    private String name;
    private int MatchMakingRating;
    private Account BoostedAccount;
    public void setMatchMakingRating(int MatchMakingRating) { this.MatchMakingRating = MatchMakingRating; }

    public int getMatchMakingRating() { return MatchMakingRating; }

    public void setName(String username) { this.name = name; }

    public String getName() { return name; }

    public void setBoostedAccount(Account BoostedAccount) { this.BoostedAccount = BoostedAccount; }

    public Account getBoostedAccount() { return BoostedAccount; }

    public int Boost(int MatchMakingRating) {
        int StartMatchMakingRating = BoostedAccount.getMatchMakingRating();
        int ResultMatchMakingRating = StartMatchMakingRating + MatchMakingRating;
        BoostedAccount.setMatchMakingRating(ResultMatchMakingRating);
        return ResultMatchMakingRating;
    }
}
