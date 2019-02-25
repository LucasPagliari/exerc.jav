package controller;
public class Controller {
    
    //interface & encapsulation (OOP)
    public static void main(String[] args) {
        RemoteControl c = new RemoteControl();
        c.turnOn();
        c.openMenu();
        c.closeMenu();
        c.play();
        c.turnUpVol();
        c.turnDownVol();
        c.muteOn();
        c.openMenu();
        c.pause();
        c.openMenu();
        c.turnOff();
    }
    
}
