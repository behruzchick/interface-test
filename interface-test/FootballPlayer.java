public class FootballPlayer extends Player{
    public int countOfRedCart;
    public int countOfYellowCart;
    public int countOfGoals;

    public FootballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfRedCart, int countOfYellowCart, int countOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfRedCart = countOfRedCart;
        this.countOfYellowCart = countOfYellowCart;
        this.countOfGoals = countOfGoals;
    }

    public int getCountOfRedCart(){
        return countOfRedCart;
    }

    public int getCountOfYellowCart(){
        return countOfYellowCart;
    }

    public int getCountOfGoals(){
        return countOfGoals;
    }
}
