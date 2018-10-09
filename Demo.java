import java.util.*;
class Demo {
  int a;
  display(int x){
    System.out.println(x);
  }
  public static void main(String args[]){
    Demo d=new Demo();
    d.a=20;
    d.display(d.a);
  }
}
