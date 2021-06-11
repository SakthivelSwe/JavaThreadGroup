package ThreadGroup;
import java.util.logging.Level;
import java.util.logging.Logger;
public class sampleThread implements Runnable {
    @Override
    public void run(){
        try{
            Thread.sleep(100);
        }catch (InterruptedException ex){
            Logger.getLogger(sampleThread.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
