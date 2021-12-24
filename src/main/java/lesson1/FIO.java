package lesson1;

import java.util.StringTokenizer;

public class FIO {
    String name;
    String lastname;
    String otchestvo;

    public FIO(String lastname, String name, String otchestvo) {
        this.lastname = lastname;
        this.name = name;
        this.otchestvo = otchestvo;
    }

    public String getLastname(){
        return lastname;
    }
    public String getName(){
        return name;
    }
    public String getOtchestvo(){
        return otchestvo;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",lastname, name, otchestvo);
    }

}
