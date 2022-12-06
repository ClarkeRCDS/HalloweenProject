public class Main {
    public static void main(String[] args) {
    House[] houses = new House[100];
    for (int i = 0; i < houses.length; i++)
    {
        houses[i] = new House (House.randAddress(), House.randCandy(), House.randDecorated(), House.randCandyGive());
    }


    }
}