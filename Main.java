import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    for(int i=0;i<300;i++){
      if(i%20==0){
      System.out.println("Temperatura w C:" + i);
      System.out.println("Temperatura w F:"+  ((i*9/5)+32));
    }
    }
    
  }
}