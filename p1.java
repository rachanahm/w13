import java.util.Scanner;
class p1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your name:");
    String name=sc.nextLine();
    String reversed=" ";
    for(int i=name.length()-1;i>=0;i--){
      reversed+=name.charAt(i);
    }
    System.out.println("reversed String:"+reversed);
  }
}