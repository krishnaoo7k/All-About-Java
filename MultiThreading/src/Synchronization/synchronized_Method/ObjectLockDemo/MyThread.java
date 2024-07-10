package By_DurgaSir.Synchronization.synchronized_Method.ObjectLockDemo;

public class MyThread extends Thread {
      Display d;    // if a want to access Display class method from MyThread class to do this i have created Display d variable inside MyThread class
      String name;

      public MyThread(Display d, String name){
          this.d = d;
          this.name = name;
      }

      public void run(){
          d.wish(name);
      }
}

//Display d variable understanding is down below

//      My question to AI

//By creating Display d variable inside MyThread class with the help of it you can run the wish method
// without creating the object of Display class using new Keyword in MyThread class but to use this
// functionality(call wish method) you have to create its object in another class  because MyThread
// class just associate with Display class functionality but to run it we need to create an Display object
//either inside MyThread class or in another class where the main function is.

//      AI Ans

//Yes, you've summarized it well. By creating a Display d variable inside the MyThread class and associating
// it with a Display object passed from another class (like the main class), you can access the wish method
// in MyThread without directly creating a new Display object using the new keyword within MyThread.
// However, to actually use the wish method, you still need to create an instance of the Display class
// either within the MyThread class or in another class where the main functionality is implemented.
// This approach allows the MyThread class to associate with the Display class functionality and utilize
// its methods through the shared Display object created elsewhere.
