package controlflow;

public class SwitchDemo {

    public void moodDetector(){

        /**
         * type of the case
         * byte, short, char, int, String, ENUM Type
         * Byte, Short, Character, Integer
         */

        String activity = "Eating";

        switch (activity){

            case "Eating":
                thingsToDoWhenMoodIsGood();
                //System.out.println("Mood is good " + activity);
                break;

            case "PoorSleep":
                System.out.println("Mood is bad " + activity);
                break;

            case "LoseSomething":
                System.out.println("Mood is sad " + activity);
                break;

            case "PoorSleep&LooseSomething":
                System.out.println("I am sad and bad " + activity);
                break;

                default:
                    System.out.println("I am okay, nothing happening in my mind ");

        }


    }

    public void thingsToDoWhenMoodIsGood(){
        System.out.println("I make call to my friends ");
        System.out.println("I go outside ");
        System.out.println("I talk a lot even with strangers");
    }


}
