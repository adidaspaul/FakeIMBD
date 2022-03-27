import java.util.Arrays;

public class IMDBApp {

   static String actorName = "Tom Cruise";
   static int birthYear = 1962;
   static int age = 2022 - birthYear;

    static String[] movies = {
            "The last Samurai", "Minority report", "Top gun", "Rain man", "Cocktail", "The mummy", "American Made"
    };
    static float[] movieRate = {
            7.7f, 7.6f, 6.9f, 8.0f, 5.9f, 5.4f, 7.1f
    };


    static String getRate(float rating){
        if(rating <= 5.0){
            return "bad";
        }else if(rating > 5.0 && rating <= 6.5){
            return "average";
        }else if(rating > 6.5 && rating <= 7.0){
            return "good";
        }else if(rating > 7.0 && rating <= 8.0){
            return "great";
        }else {
            return "Super";
        }
    }
    public static void main(String[] args) {

        System.out.print("Actor's name: " + actorName + "\n" +"Year of birth: " + birthYear + "\n" + "Age: " + age + "\n");
        System.out.println("Movies: " + Arrays.toString(movies));
        System.out.println("Rates: " + Arrays.toString(movieRate));
        for(int i = 0; i < movies.length; i++) {
            System.out.println(movies[i] + " - " + getRate(movieRate[i]));

        }

    }

}
