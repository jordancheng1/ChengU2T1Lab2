public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot frank = new ChatBot("Frank", 7);
        frank.greeting("Jordan");
        frank.weather();
        frank.favoriteNumber(7);
        System.out.println("There are " + frank.convertFeetToMeters(14) + " in 14 feet");
        System.out.println("The sum is " + frank.addNumbers(3, 6, 9));
        System.out.println(frank.goodbye());
        frank.favSeason("Winter");
        System.out.print(frank.favTeacher("Mr. Folwell"));
    }

}
