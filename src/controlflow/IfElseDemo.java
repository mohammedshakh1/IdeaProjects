package controlflow;

public class IfElseDemo {

    public static void main(String[] args) {
        //int waterLevel = 4;
        int waterLevel = 3;
        if (waterLevel == 3) {
            System.out.println("Raise the alarm ");
        }

        else if (waterLevel >= 4){
            System.out.println("Stop the valve ");

        }

        else {
            System.out.println("Tank is not yet full, keep the valve open ");

        }
    }




}
