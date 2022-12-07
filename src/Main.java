public class Main {
    public static void main(String[] args) {
        // new stuff
        //initializes houses and people
        House[] houses = new House[100];
        Person[] people = new Person[30];

        //random house
        for (int i = 0; i < houses.length; i++) {
            houses[i] = new House(House.randAddress(), House.randCandy(), House.randDecorated(), House.randCandyGive());
        }
        //random person
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(Person.randName(), Person.randCostume(), Person.randFavoriteCandy(), Person.randTimeDone(), Person.randTypeOfTrick());
        }
        //runs and prints halloween simulation
        for (Person person : people) {
            System.out.println(person.simulateHalloween(houses));
            System.out.println();
        }
    }
}