public class Piloto implements Runnable {
  private static final double distanciaTotalDaCorrida = 200;
  private double distanciaTotalPercorrida = 0;
  private Thread main;
  public Piloto (Thread main){
    this.main = main;
  }
  @Override
  public void run() {
    try {
      main.join();
    } catch (InterruptedException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    while (distanciaTotalPercorrida <= distanciaTotalDaCorrida){
      distanciaTotalPercorrida += Math.random() * 50;
      System.out.printf ("%s: %.2fm\n", Thread.currentThread().getName(), distanciaTotalPercorrida);
      if (distanciaTotalPercorrida > distanciaTotalDaCorrida){
        System.out.printf("%s acabou.", Thread.currentThread().getName());
      }
      else{
        //cláusula catch or declare
        //exceção verificada pelo compilador
        try {
          Thread.sleep(5000);
          //Thread.sleep(2000 + (int)(Math.random() * 10000));
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    }
    
  }  
}
