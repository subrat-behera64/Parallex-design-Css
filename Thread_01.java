class Threads extends Thread{
 public void run(){
for(int i=1;i<=10;i++){
    System.out.println("mul: "+2*i);
}
for(int i=1;i<=10;i++){
    System.out.println("mul: "+10*i);
}

    }
}
class Thread_01{
    public static void main(String[] args) {
        Threads th=new Threads();
        th.start();
    }
}