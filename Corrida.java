public class Corrida {
  public static void main(String[] args) {
    Thread piloto1 = new Thread (new Piloto(Thread.currentThread()), "Senna");
    Thread piloto2 = new Thread (new Piloto(Thread.currentThread()), "Barrichello");
    Thread piloto3 = new Thread (new Piloto(Thread.currentThread()), "Mansell");
    Thread piloto4 = new Thread (new Piloto(Thread.currentThread()), "Piquet");
    Thread piloto5 = new Thread (new Piloto(Thread.currentThread()), "Hill");
    piloto1.start();
    piloto2.start();
    piloto3.start();
    piloto4.start();
    piloto5.start();
    System.out.println ("Valendo...");
  }
}
