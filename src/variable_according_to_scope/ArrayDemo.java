package variable_according_to_scope;

public class ArrayDemo {

    public static void main(String[] args) {

        // how to declare and initialize an array?
        int[] studentID = new int[5];
        // how to insert value in an array in a specific index?
        // use try/catch in the problematic area to see the problem
        try {
            studentID[0] = 101;
            studentID[1] = 102;
            studentID[2] = 103;
            studentID[3] = 104;
            studentID[4] = 105;
            //problematic data add
            studentID[5] = 106;
        }

        catch(Exception problem){
            //show me the problem
            problem.printStackTrace();
            //provide a nice meaningful message to user
            System.out.println("You are trying to insert more than 5 element");
        }

        finally {
            System.out.println("you have to execute me at all time ");
        }


        // how to get value from a single index?

        /*System.out.println("Get the element in the index 0: " + studentID[0]);
        System.out.println("Get the element in the index 1: " + studentID[1]);
        System.out.println("Get the element in the index 2: " + studentID[2]);
        System.out.println("Get the element in the index 3: " + studentID[3]);
        System.out.println("Get the element in the index 4: " + studentID[4]);*/

        //x++ mean increase the value of x by 1 during next operation or next use


        for(int x = 0; x <= 4; x++ ){

            int id = studentID[x];
            System.out.println(id);

            //System.out.println(studentID[0]);
            System.out.println(studentID[x]);

        }
        




    }



}
