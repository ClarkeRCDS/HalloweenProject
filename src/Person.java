public class Person {
    //instance variables

    //name of trick or treater
    private final String name;
    //type of costume
    private final String costume;
    //how much candy they collected
    private int numOfCandy;
    //their favorite candy
    private final String favoriteCandy;
    //how many houses they have visited
    private int numHousesVisited;
    //how many tricks they played
    private int numTricksPlayed;
    //the time they finish trick or treating
    private final String timeDone;
    //the type of trick they play
    private final String typeOfTrick;

    //constructor used to create a random trick or treater
    public Person(String iName, String iCostume, String iFavoriteCandy, String iTimeDone, String iTypeOfTrick) {
        name = iName;
        costume = iCostume;
        numOfCandy = 0;
        favoriteCandy = iFavoriteCandy;
        numHousesVisited = 0;
        numTricksPlayed = 0;
        timeDone = iTimeDone;
        typeOfTrick = iTypeOfTrick;
    }
    //gets a random name
    public static String randName()
    {
        String[] firstType = {"John", "Bob", "Joe","Connor", "Jack", "Jim", "Bart", "Bill", "Walter", "Tom", "Steve", "Jane", "James", "Amanda", "Alex", "Kim", "Jessica"};
        String[] lastType = {"de Haan", "Clarke", "Rusch", "White", "Smith", "Davis", "Moore", "Jones", "Song", "Simpson", "de Haan"};
        return firstType[(int)(Math.random() * firstType.length)] + " " + lastType[(int)(Math.random() * lastType.length)];
    }
    //gets a random costume
    public static String randCostume()
    {
        String[] costumeType = {"a superhero", "Rhys de Haan", "a dinosaur", "a ghost", "a comp sci teacher", "a duck", "a cowboy", "Darth Vader", "Indiana Jones", "a ninja"};
        return costumeType[(int)(Math.random() * costumeType.length)];
    }
    //gets a random favorite candy
    public static String randFavoriteCandy()
    {
        String[] candyType = {"M&Ms", "gummy bears", "Reese's cups", "Kit Kats", "Twizzlers", "Snickers", "Milky Ways"};
        return candyType[(int)(Math.random() * candyType.length)];
    }
    //gets a random finish time
    public static String randTimeDone()
    {
        String[] timeType = {"6:00", "6:15", "6:30", "6:45", "7:00", "7:15", "7:30", "7:45", "8:00", "8:15", "8:30", "8:45", "9:00", "9:15", "9:30", "9:45", "10:00"};
        return timeType[(int)(Math.random() * timeType.length)];
    }
    // gets a random trick type
    public static String randTypeOfTrick()
    { // e
        String[] trickType = {"putting toilet paper on the house", "putting all the packages on the porch the wrong side up", "mowing the lawn without any particular order and messing up all the lines", "unraking the leaves", "relocating a birds nest to directly outside the bedroom window", "setting up Christmas decorations too early", "taking in the trash"};
        return trickType[(int)(Math.random() * trickType.length)];
    }
    //this int represent the number in the array that the trick or treater is currently at
    int currentHouse = 0;
    // the house that gave them the most of their favorite candy
    String favoriteHouse = "";
    //the number of candy they got from a house with their favorite candy
    int favoriteHouseNum = 0;
    //simulates a Halloween night for each individual trick or treater
    public String simulateHalloween(House[] houses) {
        //represents the number of houses they visit
        for (int i = 0; i < Math.random() * (houses.length - 25) + 25; i++) {
            //updates house visitation
            currentHouse = (int) (Math.random() * houses.length);
            numHousesVisited++;

            //determines trick or treat and favorite house
            if (houses[currentHouse].getIsDecorated()) {
                numOfCandy += houses[currentHouse].getNumCandyGive();
                if (favoriteCandy.equals(houses[currentHouse].getTypeOfCandy()) && houses[currentHouse].getNumCandyGive() > favoriteHouseNum) {
                    favoriteHouse = houses[currentHouse].getAddress();
                    favoriteHouseNum = houses[currentHouse].getNumCandyGive();
                }
            } else {
                numTricksPlayed++;
            }

        }
        //returns the statement describing their night
        if (favoriteHouse.equals("")) {
            return name + " was dressed as " + costume + ", visited " + numHousesVisited + " houses, collected " + numOfCandy + " pieces of candy, played the trick of " + typeOfTrick + " " + numTricksPlayed + " times, and was home by " + timeDone + " pm. None of the houses that " + name + " visited had " + favoriteCandy + ", their favorite candy.";
        } else{
            return name + " was dressed as " + costume + ", visited " + numHousesVisited + " houses, collected " + numOfCandy + " pieces of candy, played the trick of " + typeOfTrick + " " + numTricksPlayed + " times, and was home by " + timeDone + " pm. " + favoriteHouse + " gave out " + name + "'s favorite candy. They got " + favoriteHouseNum + " " + favoriteCandy + " from there.";
        }
    }

}
