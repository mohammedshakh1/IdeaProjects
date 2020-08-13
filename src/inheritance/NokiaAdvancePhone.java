package inheritance;

//Java does not support multiple class inheritance like SomeOtherPhone
public class NokiaAdvancePhone extends NokiaPhone {

    public void camera(){
        System.out.println("Can take pictures.....");

    }
    //to overloaded it have to be same method name in the same class with different signature
    //example is below
    public void camera(String cameraName){
        System.out.println("Can take pictures.....");

    }
    //overriding mean same method you bring from parent class to child class
    //example is below
    public void phoneBook(){
        System.out.println("Phone Book....");
    }


}
