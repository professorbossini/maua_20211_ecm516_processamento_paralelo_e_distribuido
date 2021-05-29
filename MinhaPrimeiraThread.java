//É-UM
public class MinhaPrimeiraThread extends Thread{
  public void run(){
   System.out.printf ("Executando na thread: %s\n", Thread.currentThread().getName());
  }
}