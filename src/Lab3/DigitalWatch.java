package Lab3;
public class DigitalWatch {
    public boolean isActive = false;
    public boolean Timer = false;
    public float timer = 0;
    public String Hello(){
        if(isActive==false){
            isActive = true;
            return "Welcome!";
        }
        else{
            return  "Already turned on";
        }
    }
    public String setTimer(float x){
        if(isActive==true){
            timer = x;
            Timer = true;
            return "Timer starts now";
        }
        else{
            return "Watch is closed open first";
        }
    }
    public String Bye(){
        if(isActive==true){
            isActive = false;
            return "Turned off";
        }
        else{
            return "Watch is Already off";
        }
    }
}