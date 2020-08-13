package inheritance;

public /*final*/ class NokiaPhone extends PreNokia{

    public void buildDisplay(){
        System.out.println("Display......");

    }
    public void takePhoto(){
        System.out.println("Taking Photo..");

    }
    public void phoneBook(){
        System.out.println("Phone Book....");
    }
    public void mp3Player(){
        System.out.println("Play ringtone");

    }
    public void games(){
        System.out.println("Playing Games....");

    }

    public static void main(String[] args) {

        NokiaPhone nokiaPhone = new NokiaPhone();
        nokiaPhone.call();
        nokiaPhone.sendText();
        nokiaPhone.takePhoto();
        nokiaPhone.mp3Player();
        nokiaPhone.games();

        int x = nokiaPhone.x;
        System.out.println(x);

    }


}
