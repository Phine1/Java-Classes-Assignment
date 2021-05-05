
public class Q6 {

}
class Room {
int roomNo;
String roomType;
double roomArea;
boolean acMachine;
void setData(int rno, String rt, double area, boolean ac) {
roomNo = rno;
roomType = rt;
roomArea = area;
acMachine = ac;
}
void displayData() {
System.out.println("The room#.Is" + roomNo);
System.out.println("The room Type is" + roomType);
System.out.println("The room area is" + roomArea);
String s = (acMachine) ? "yes" : "no";
System.out.println("The A / c Machine needed" + s);
}
public static void main(String arg[]) {
Room room1 = new Room();
room1.setData(11, "Suite", 390.0 , true);
room1.displayData();
}
}