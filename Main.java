import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the value of the X of the Point :");
        int x= scan.nextInt();

        System.out.println("Please enter the value of the Y of the Point :");
        int y= scan.nextInt();
        MovablePoint m1=new MovablePoint(x,y,5,5);
        System.out.println("Please select the point move type:");
        System.out.println("1-Up\n2-Down\n3-left\n4-Right");
        int num=scan.nextInt();
        switch (num){
            case 1:
                m1.moveUp();
                System.out.println("if point move up with speed 5 the point ("+x+","+y+") become ("+m1.getX()+","+m1.getY()+")");
                break;
            case 2:
                m1.moveDown();
                System.out.println("if point move Down with speed 5 the point ("+x+","+y+") become ("+m1.getX()+","+m1.getY()+")");
                break;
            case 3:
                m1.moveLeft();
                System.out.println("if point move left with speed 5 the point ("+x+","+y+") become ("+m1.getX()+","+m1.getY()+")");
                break;
            case 4:
                m1.moveRight();
                System.out.println("if point move Right with speed 5 the point ("+x+","+y+") become ("+m1.getX()+","+m1.getY()+")");
                break;
        }
    }
}