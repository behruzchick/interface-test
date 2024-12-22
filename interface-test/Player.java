public abstract class Player implements Information {
    protected String nameOfPlayer;
    protected String sportType;
    protected int numberPosition;
    protected String teamName;

    @Override
    public String getName() {
        return nameOfPlayer;
    }

    @Override
    public String getTeamName() {
        return teamName;
    }

    public Player(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        this.nameOfPlayer = nameOfPlayer;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
        this.teamName = teamName;
    }

    public String sportType() {
        return sportType;
    }
}
