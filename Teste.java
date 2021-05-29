public class Teste {
  public static void main(String[] args) {
    MinhaPrimeiraThread thread = new MinhaPrimeiraThread();
    thread.start();
    System.out.printf("Executando na thread: %s\n", Thread.currentThread().getName());
  }
}
