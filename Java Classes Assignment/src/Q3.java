
// Question 3

class Rectangle{
	  int length;
	  int breadth;
	  public Rectangle(int l, int b){
	    length = l;
	    breadth = b;
	  }
	  public int Area(){
	    return length*breadth;
	  }
	  
	  }
	 public class Q3 {
	 
		 public static void main(String[] args){
	    Rectangle a = new Rectangle(4,5);
	    Rectangle b = new Rectangle(5,8);
	    System.out.println("Area of rectangle 1 is: "+a.Area());
	    System.out.println("Area of rectangle 2 is: "+b.Area());
	  }
	}


	
	