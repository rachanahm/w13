import java.util.*;
 
class p2 {
  public static void main(String l[]) {
    int statckelements;
    Scanner s = new Scanner(System.in);
    System.out.println("specife size of stack");
    statckelements = s.nextInt();
    int top = -1;
    int IntStack[] = new int[statckelements];
    char c;
    do {
      System.out.println("Choose stak operation");
      System.out.println("1. push()");
      System.out.println("2. pop()");
      System.out.println("3. display()");
      int choice = s.nextInt();
      switch (choice) {
        case 1:
          System.out.println("enter element to insert into stack");
          int ele = s.nextInt();
          if (top == statckelements - 1)
            System.out.println("its not possible to insert element");
          else {
            top = top + 1;
            IntStack[top] = ele;
          }
        case 2:
          if (top == -1)
            System.out.println("Its not possible to perform pop()");
          else {
            System.out.println("poped element is" + IntStack[top]);
            top = top - 1;
          }
        case 3:
          int i = top;
          while (i >= 0) {
            System.out.println(IntStack[i]);
            i--;
          }
        default:
          System.out.println("invalid option");
          break;
      }
      System.out.println("do you want to perform one more opertion");
      c = s.next().charAt(0);
    } while (c != 'n');
  }
}