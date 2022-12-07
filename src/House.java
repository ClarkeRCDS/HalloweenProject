public class House {
    //decoration status of the house
    private final boolean isDecorated;
    //type of candy being given
    private final String typeOfCandy; // e
    //address of the house
    private final String address;
    //how much candy they give out per trick or treater
    private final int numCandyGive;

    //constructor used to create a random house
    public House(String iAddress, String iTypeOfCandy, boolean iIsDecorated, int iNumCandyGive) {
        address = iAddress;
        typeOfCandy = iTypeOfCandy;
        isDecorated = iIsDecorated;
        numCandyGive = iNumCandyGive;
    }
    //gets a random address
    public static String randAddress()
    {
        String[] streetNames = {"Main", "Beech", "Connor", "Rusch", "Maple", "Elm", "Sycamore", "High", "Forest", "Oak", "Lake", "Park"};
        String[] streetTypes = {"Street", "Avenue", "Lane", "Drive", "Way", "Road"};
        return ((int)(Math.random() * 98) + 1) + " " + streetNames[(int)(Math.random() * streetNames.length)] + " " + streetTypes[(int)(Math.random() * streetTypes.length)];
    }
    //gets a random type of candy
    public static String randCandy()
    {
        String[] candyType = {"M&Ms", "gummy bears", "Reese's cups", "Kit Kats", "Twizzlers", "Snickers", "Milky Ways"};
        return candyType[(int)(Math.random() * candyType.length)];
    }
    //gets a random true or false decoration status with a 10% chance of being false
    public static boolean randDecorated()
    {
        return Math.random() < 0.9;
    }
    //gets a random amount of candy being given out
    public static int randCandyGive()
    {
        return (int)((Math.random() * 5) + 1);
    }
    //returns decoration status
    public boolean getIsDecorated()
    {
        return isDecorated;
    }
    //returns type of candy
    public String getTypeOfCandy()
    {
        return typeOfCandy;
    }
    //returns candy amount given
    public int getNumCandyGive()
    {
        return numCandyGive;
    }
    //returns address
    public String getAddress()
    {
        return address;
    }

}

