public class BasketballPlayer extends Player{
    public int countOfGoals;

    public BasketballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfGoals = countOfGoals;
    }

    public int getCountOfGoalsBass(){
        return countOfGoals;
    }
}
