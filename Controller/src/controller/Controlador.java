package controller;
public interface Controlador {
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void openMenu();
    public abstract void closeMenu();
    public abstract void turnUpVol();
    public abstract void turnDownVol();    
    public abstract void muteOn();
    public abstract void muteOff();
    public abstract void play();
    public abstract void pause();
}
