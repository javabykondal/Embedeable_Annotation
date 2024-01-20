package org.example;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {
    private String vlg;
    private  String State;
    private int pin;
public Adress()
{

}
    public Adress(String vlg, String state, int pin) {
        this.vlg = vlg;
        State = state;
        this.pin = pin;
    }

    public String getVlg() {
        return vlg;
    }

    public void setVlg(String vlg) {
        this.vlg = vlg;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
