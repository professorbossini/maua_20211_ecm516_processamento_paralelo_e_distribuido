public class TesteExpressaoLambda {
  public static void main(String[] args) {
    new Thread (() -> {
      System.out.printf ("lambda: %s\n", Thread.currentThread().getName());
    }).start();
    
    /*new Thread(new Runnable(){
      @Override
      public void run() {
        System.out.printf("run: %s\n", Thread.currentThread().getName());
        
      }
    })    
    .start();*/
  }
}
