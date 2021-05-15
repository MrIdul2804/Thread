class Printer extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Printing..... "+i);
        }
    }
}
class Printer2 implements Runnable{
    public void run(){
        int i=10;
        while(i!=0){
            System.out.println("Implementing runnable Interface");
            i--;
        }
    }
}
public class Thread1 {
    public static void main(String[] args){
        System.out.println("Process Started.....");
        Printer pt=new Printer();
        Runnable r=new Printer2();
        Thread t1=new Thread(r);
        t1.start();
        pt.start();
        for(int i=0;i<5;i++){
            System.out.println("Mridul "+ i);
        }

        System.out.println("Process ended.....");
    }
}