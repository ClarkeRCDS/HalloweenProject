public class House {
    private boolean isDecorated;
    private String typeOfCandy;
    private String address;
    private int numTricksPlayed;
    private int peopleVisited;
    private int numCandyGive;

    public House(String iAddress, String iTypeOfCandy, boolean iIsDecorated, int iNumCandyGive) {
        address = iAddress;
        typeOfCandy = iTypeOfCandy;
        isDecorated = iIsDecorated;
        numTricksPlayed = 0;
        peopleVisited = 0;
        numCandyGive = iNumCandyGive;
    }

    public static String randAddress()
    {
        String[] streetNames = {"Main", "Beech", "Connor", "Rusch", "Maple", "Elm", "Sycamore", "High", "Forest", "Oak", "Lake", "Park"};
        String[] streetTypes = {"Street", "Avenue", "Lane", "Drive", "Way", "Road"};
        return ((int)(Math.random() * 98) + 1) + " " + streetNames[(int)(Math.random() * streetNames.length)] + " " + streetTypes[(int)(Math.random() * streetTypes.length)];
    }
    public static String randCandy()
    {
        String[] candyType = {"M&Ms", "gummy bears", "Reese's cups", "Kit Kat", "Twizzlers", "Snickers", "Milky Way"};
        return candyType[(int)(Math.random() * candyType.length)];
    }
    public static boolean randDecorated()
    {
        return Math.random() < 0.2;
    }
    public static int randCandyGive()
    {
        return (int)(Math.random() * 5) + 1;
    }



}
