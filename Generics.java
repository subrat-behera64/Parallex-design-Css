import java.util.*;
class Gen<T1>{
  T1 t;
  public T1 square(){
    return t;
  }
  Gen(T1 t){
    this.t=t;
  }
}
public class Generics{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(12);
        // al.add(10);
        // al.add("Rakesh");
        // System.out.println(al);
        int x=al.square();
        System.out.println(x);
    }
}
