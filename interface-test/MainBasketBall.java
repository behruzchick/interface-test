public class MainBasketBall {
    public static void main(String[] args) {
        BasketballPlayer basketballPlayer = new BasketballPlayer(
                "John Doe",
                "Basketball",
                8,
                "Real Madrid",
                500
        );

        System.out.println("Name of Player: " + basketballPlayer.getName());
        System.out.println("Name of sport: " + basketballPlayer.sportType());
        System.out.println("Name of team: " + basketballPlayer.getName());
        System.out.println("Goals: " + basketballPlayer.getCountOfGoalsBass());
    }
}
