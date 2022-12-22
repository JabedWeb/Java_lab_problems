package labreportSeven;



interface isEmergency {

    public void soundSiren();
}

class FireEmergency implements isEmergency {
 
    public void soundSiren() {
        System.out.println("Siren Sounded");
    }
}

class SmokeAlarm {
   
}

class interfaces {

    public static void main(String[] args) {


        Object[] myArray = new Object[4];
       

        myArray[0] = new SmokeAlarm();
        myArray[1] = new SmokeAlarm();
        myArray[2] = new FireEmergency();
        myArray[3] = new FireEmergency();

        for (int i = 0; i < 4; i++) {

            if (myArray[i] instanceof isEmergency) {
//            
                System.out.printf("The element at index  implmergency\n", i);

                ((isEmergency) myArray[i]).soundSiren();
            } else {

                System.out.printf("TsEmergency\n", i);
            }
        }
    }
}
