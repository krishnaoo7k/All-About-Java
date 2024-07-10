package By_DurgaSir.Synchronization.Sync_Block;

class Display {
      public void wish(String name) {
          ;;;;;;;;;;;;;;;;;// 1 lack line of code

          synchronized (Display.class) {
              for (int i = 0; i < 5; i++) {
                  System.out.print("good morning:");


                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                  }
                  System.out.println(name);
              }
              ;;;;;;;;;;;;;;;;;// 1 lack of lines code
          }
      }
}