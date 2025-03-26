public class Q1Main {
    public static void main(String[] args) {
        String[] phoneNumbers = new String[5];

        Telephone number1 = new Telephone("03", "79676300");
        phoneNumbers[0] = number1.makeFullNumber();
        Telephone number2 = new Telephone("03", "79676301");
        phoneNumbers[1] = number2.makeFullNumber();
        Telephone number3 = new Telephone("03", "79676302");
        phoneNumbers[2] = number3.makeFullNumber();
        Telephone number4 = new Telephone("03", "79676303");
        phoneNumbers[3] = number4.makeFullNumber();
        Telephone number5 = new Telephone("03", "79676304");
        phoneNumbers[4] = number5.makeFullNumber();

        for (String numbers : phoneNumbers){
            System.out.println(numbers);
        }
    }
}
