public class Main {
    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer("Lionel Messi", "Football" , 10,"Barcelona" , 40 , 60 , 870 );
        System.out.println("Name: " + footballPlayer.getName());
        System.out.println("Team name: " + footballPlayer.getTeamName());
        System.out.println("Goals: " + footballPlayer.getCountOfGoals());
        System.out.println("Red carts: " +footballPlayer.getCountOfRedCart());
        System.out.println("Yellow carts: " + footballPlayer.getCountOfYellowCart());
    }
}