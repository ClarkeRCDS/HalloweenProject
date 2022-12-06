public class Person {
private String name;
    private String costume;
    private int numOfCandy;
    private String favoriteCandy;
    private int numHousesVisited;
    private int numTricksplayed;
    private String timeDone;

    public Person(String iName, String iCostume, String iFavoriteCandy, String iTimeDone) {
        name = iName;
        costume = iCostume;
        numOfCandy = 0;
        favoriteCandy = iFavoriteCandy;
        numHousesVisited = 0;
        numTricksplayed = 0;
        timeDone = iTimeDone;
    }
public static String randName()
    {
       String[] firstType = {"John", "Bob", "Joe","Connor", "Jack", "Jim", "Bart" "Bill", "Walter", "Tom", "Steve", "Jane", "James", "Amanda", "de Haan" "Alex", "Kim", "Jessica"};
       String[] lastType = {"de Haan", "Clarke", "Rusch", "White", "Smith", "Davis", "Moore", "Jones", "Song", "Simpson"};
       return firstType[(int)(Math.random() * firstType.length)] + " " + lastType[(int)(Math.random() * lastType.length)];
    }
    public static String randCostume()
    {
        String[] costumeType = {"Superhero", "Rhys de Haan", "Dinosaur", "Ghost", "Comp Sci teacher", "Duck", "Cowboy", "Darth Vader", "Indiana Jones", "Ninja"};
        return costumeType[(int)(Math.random() * costumeType.length)];
    }
    public static String randFavoriteCandy()
    {
        String[] candyType = {"M&Ms", "gummy bears", "Reese's cups", "Kit Kat", "Twizzlers", "Snickers", "Milky Way"};
        return candyType[(int)(Math.random() * candyType.length)];
    }
    public static String randTimeDone()
    {
        String[] timeType = {"6:00", "6:15", "6:30", "6:45", "7:00", "7:15", "7:30", "7:45", "8:00", "8:15", "8:30", "9:00", "9:30", "10:00"};
        return timeType[(int)(Math.random() * timeType.length)];
    }
}
