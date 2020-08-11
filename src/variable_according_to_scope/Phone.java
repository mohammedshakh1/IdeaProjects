package variable_according_to_scope;

public class Phone {

    /**
     * Things can do using phone
     * 1.cal
     * 2. text
     * 3. listenToMusic
     * 4. takePhoto
     * 5. useInternet
     *
     */

    static String name = "Asif";

    // default constructor, Has no parameters or signatures
    // public variable_according_to_scope.Phone(Signatures){}
    public Phone(){
        System.out.println("I am default constructor ");
    }

    //Second constructor, you need to have one or more parameters

    public Phone(String nameOfPhoneColor){
        System.out.println("Build a phone of " + nameOfPhoneColor + "color");
    }

    // Signature have to be different from other constructors
    public Phone(String typeOfPhoneMemory, int memorySize){
        System.out.println("Build a phone with " + typeOfPhoneMemory + "and Size " + memorySize + " GB");

    }

    public Phone(int memorySize, String typeOfPhoneMemory){
        System.out.println("Build a phone with " + typeOfPhoneMemory + "and Size " + memorySize + " GB");

    }

    public static void main(String[] args){

        //Declaration of a variable
        String firstName;
        // initialization
        firstName = "Don";

        Phone myPhone = new Phone();
        myPhone.call("John");
        //myPhone.sendText() == Hello!!! How are you?
        myPhone.sendText();

        String message = myPhone.sendText();
        System.out.println(message);

        myPhone.takePhoto();
        myPhone.listenToMusic();

        Phone myBlueColorPhone = new Phone("Blue");
        //call your friend using myBlueColorPhone
        myBlueColorPhone.call("Arnob");

        Phone phoneWithLargeMemory = new Phone("Sand Disk", 265);
        phoneWithLargeMemory.call("Mimi");
        // phoneWithLargeMemory.call("Values")



    }
    
    // public void call(Parameter){}
    public void call(String name){
        System.out.println("Calling......." + name);

    }

    //public void sendText(){
    //System.out.println("Sending Text");
    //
    // }
    //Instead of Using System.out.println


    public String sendText(){
        //Instead of Using System.out.println
        String textMessage = "Hello!!! How are you";
        return textMessage;
    }

    public void takePhoto(){
        System.out.println("Taking photo using built in 24MP camera");
    }

    public void listenToMusic(){
        System.out.println("I am listening to Music");
    }




}
