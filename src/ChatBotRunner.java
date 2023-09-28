public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot frank = new ChatBot("Frank", 7);
        frank.greeting("Jordan");
        frank.weather();
        frank.convertFeetToMeters(14);
        frank.favoriteNumber(7);
        frank.addNumbers(3, 6, 9);
        frank.goodbye();
    }

}
