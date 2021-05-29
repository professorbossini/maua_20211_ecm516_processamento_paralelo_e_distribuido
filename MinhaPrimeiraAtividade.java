public class MinhaPrimeiraAtividade implements Runnable {
  
  @Override
  public void run() {
    System.out.println ("Queremos que seja executada em uma thread diferente da principal");
    System.out.printf("Thread do método run: %s\n", Thread.currentThread().getName());
    
  }

}
