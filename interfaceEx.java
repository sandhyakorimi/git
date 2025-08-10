interface Animal{
    void sound();
}
 class dog implements Animal  {
   public void sound(){
     System.out.println("dogs barks");
   }
    
}
public class interfaceEx{
  public static void main(String [] args){
      Animal obj1 = new dog();
      obj1.sound();
  }
}