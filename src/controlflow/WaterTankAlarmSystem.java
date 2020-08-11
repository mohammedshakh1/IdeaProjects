package controlflow;

public class WaterTankAlarmSystem {

    public void controlWaterFlow() {
        //int waterLevel = 4;
        int waterLevel = 3;
        if (waterLevel == 3) {
            raiseAlarm();
        }

        else if (waterLevel >= 4){
            stopValve();

        }

        else {
            System.out.println("Tank is not yet full, keep the valve open ");

        }


    }

    public void raiseAlarm(){

        System.out.println("Raise the Alarm ");
    }
    public void stopValve(){
        System.out.println("Stop the Valve ");
    }



}
