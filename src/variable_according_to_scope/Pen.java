package variable_according_to_scope;

public class Pen {

    public static void main(String[] args){


        Pen myPen = new Pen();
        myPen.write();
        myPen.paint();

    }

    public void write(){
        System.out.println("Writing using the pen");
    }

    public void paint(){
        System.out.println("This method is responsible to paint");
    }



}
