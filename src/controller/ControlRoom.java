package controller;
import obs.Observer;

public class ControlRoom {
    
    private final Observer[] observerArray=new Observer[50];
    private int nextIndex=0;
    
    public void addObserver(Observer obs){
        observerArray[nextIndex]=obs;
        nextIndex++;
    }
    
    public void setArea(boolean areaClear){
        for (int i = 0; i <nextIndex; i++) {
            Observer ob=observerArray[i];
            ob.areaClear(areaClear);
        }
    }
    
    public void sendMessage(String podii){
        for (int i = 0; i <nextIndex; i++) {
            Observer Ob=observerArray[i];
            Ob.getMsg(podii);
        }
    }
    
    public void setValue(int value){
        for (int i = 0; i < nextIndex; i++) {
            Observer Ob=observerArray[i];
            Ob.setPosition(value);
        }
    }
    
    public void sendMessagePrivate(String defence, String msg){
        for (int i = 0; i < nextIndex; i++) {
            Observer Ob=observerArray[i];
            Ob.getPrivateMsg(defence, msg);
        }
    }
    
}
