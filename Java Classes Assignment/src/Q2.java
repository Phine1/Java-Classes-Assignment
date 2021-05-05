

class Triangle{
  int side_a,side_b,side_c;
  
  public double triangleArea(){
    
	  double s = (side_a+side_b+side_c)/2.0;
    return Math.pow((s*(s-side_a)*(s-side_b)*(s-side_c)),.5);
  }
  public int trianglePerimeter(){
    return (side_a+side_b+side_c);
  }
}

public class Q2{
  public static void main(String[] args){
    
	  Triangle t = new Triangle();
    t.side_a = 2;
    t.side_b = 5;
    t.side_c = 6;
    System.out.println("The area of the triangle is"+" "+  t.triangleArea());
    System.out.println("The perimeter of the triangle is"+" "+t.trianglePerimeter());
  }
}

