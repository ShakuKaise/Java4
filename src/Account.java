public class Account {
    private int price;
    private boolean TBD;
    private int MatchMakingRating;
    private int ID;

    public void setPrice(int price) { this.price = price; }

    public int getPrice() { return price; }

    public void setTBD(boolean TBD) { this.TBD = TBD; }

    public boolean getTBD() { return TBD; }

    public void setMatchMakingRating(int MatchMakingRating) {
        if (TBD) {
            this.MatchMakingRating = 0;
        } else {
            this.MatchMakingRating = MatchMakingRating;
        }
    }

    public int getMatchMakingRating() { return MatchMakingRating; }

    public void setID(int ID) { this.ID = ID; }

    public int getID() { return ID; }
}
