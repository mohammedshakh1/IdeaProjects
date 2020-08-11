package variable_according_to_scope;

public class Main {

    public static void main(String[] args) {

        Phone myPhone = new Phone();
            myPhone.call("John");
            myPhone.sendText();
            myPhone.takePhoto();
            myPhone.listenToMusic();
    }
}
