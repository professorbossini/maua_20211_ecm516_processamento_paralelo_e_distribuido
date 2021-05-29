public class TesteRunnable {
  public static void main(String[] args) {
    Thread t = new Thread (new MinhaPrimeiraAtividade());
    t.start();
    System.out.println ("Main acabando...");
    System.out.printf("Thread do método main: %s\n", Thread.currentThread().getName());
  }
}
