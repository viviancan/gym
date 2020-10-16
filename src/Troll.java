public class Troll {
    public static void main(String[] args) {

        System.out.println(vowelCheck("This website is for losers LOL!"));

    }

    public static String vowelCheck(String string){
        return string.replaceAll("[AEIOUaeiou]", "");
    }
}
