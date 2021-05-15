import java.lang.*;
class Print2 extends Thread{
    public void run(){
        System.out.println("Current Thread: "+Thread.currentThread().getName());
        System.out.println("Is Alive ? "+Thread.currentThread().isAlive());
    }
}
public class Thread2 implements Runnable{
    Thread t;
    public void run(){
        for(int i=0;i<4;i++){

        System.out.println(Thread.currentThread().getName()+" "+i);
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        }
    }
    public static void main(String[] args) throws Exception{
        Thread t=new Thread(new Thread2());
        t.start();
        Thread t2=new Thread(new Thread2());
        t2.start();
        Print2 pt=new Print2();
        pt.start();
        try {
            pt.join(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Current Thread "+pt.getName());
        System.out.println("Is alive ? "+pt.isAlive());
    }
}