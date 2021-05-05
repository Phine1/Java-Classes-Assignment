
//Question 4

import java.util.*;

class Area{
  int lenght; // Length of rectangle,
  int breadth; //Breadth of rectangle,
   
  public Area(int l, int b) {
	   lenght = l;
	   breadth = b;
	   
}
  public int returnArea(){
    return lenght*breadth;
  }
}

class Q4 {
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);{
    int l,b;

    System.out.println("Enter length of rectangle");
    l = n.nextInt();
    System.out.println("Enter breadth of rectangle");
    b = n.nextInt();

    Area a = new Area(l,b);
    System.out.println("The area of the rectangle is : "+a.returnArea());
  }
								
}

}