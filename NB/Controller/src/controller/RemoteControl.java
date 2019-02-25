package controller;
public class RemoteControl implements Controlador {
    
    private int volume, a;
    private boolean on, playing;

    public RemoteControl(){
        this.volume = 50;
        this.on = false;
        this.playing = false;
    }
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
    
    @Override
    public void turnOn() {
        this.setOn(true);
    }

    @Override
    public void turnOff() {
        this.setOn(false);
        this.setPlaying(false);
        this.setVolume(50);
    }

    @Override
    public void openMenu() {
        System.out.println("Is it on?: "+ this.isOn());
        System.out.println("Is it Playing?: "+ this.isPlaying());
        System.out.print("Volume: "+ this.getVolume()+" ");
        
        for(int i = 0; i<=this.getVolume(); i+=10){
            System.out.print("[0]");
        }
        System.out.println(" ");
    }

    @Override
    public void closeMenu() {
        System.out.println("Closing menu...");
    }

    @Override
    public void turnUpVol() {
        if(this.isOn()){
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void turnDownVol() {
        if(this.isOn()){
                this.setVolume(this.getVolume()-5);
            }
    }

    @Override
    public void muteOn() {
        if(this.isOn() && this.getVolume()>0){ 
            a = this.getVolume();
            this.setVolume(0);
        }
    }

    @Override
    public void muteOff() {
        if(this.isOn() && this.getVolume()==0){
            this.setVolume(a);
        }
    }

    @Override
    public void play() {
        if(this.isOn() && !(this.isPlaying())){
            this.setPlaying(true);
        }
    }

    @Override
    public void pause() {
        if(this.isOn() && this.isPlaying()){
            this.setPlaying(false);
        }
    }
}
