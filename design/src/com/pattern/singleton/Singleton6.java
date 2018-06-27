package com.pattern.singleton;

public class Singleton6 {  
    private Singleton6() {}  
  
    //Volatile修饰的成员变量在每次被线程访问时，都强迫从共享内存中重读该成员变量的值。
    //而且，当成员变量发生变化时，强迫线程将变化值回写到共享内存。
    //这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。 
    private static volatile Singleton6 instance = null;  
  
    public static Singleton6 getInstance() {  
       if (instance == null) {    
         synchronized (Singleton6.class) {    
            if (instance == null) {    
               instance = new Singleton6();   
            }    
         }    
       }   
       return instance;  
    }  
  
  
}
