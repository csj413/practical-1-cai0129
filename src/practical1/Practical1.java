package practical1;


import java.util.ArrayList;
import java.util.Scanner;

public class Practical1 {

    public static void main(String[] args) {
        /*ArrayList<Line> lines = new ArrayList<>();
        int current = 1;
        Scanner in = new Scanner(System.in);
        //String msg1, msg2, msg3;
        Line line1,line2,line3;
        System.out.println("1: Enter a line");
        //msg1 = in.nextLine();
        line1 = new Line(current, in.nextLine());
        current++;
        System.out.println("2: Enter another line");
        //msg2 = in.nextLine();
        line2 = new Line(current, in.nextLine());
        current++;
        System.out.println("3: Enter the last line");
        //msg3 = in.nextLine();
        line3 = new Line(current, in.nextLine());
        current++;
        System.out.println(line3 + ", " + line2 + ", " + line1);*/

        ArrayList<Line> lines=new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int current = 1;
        while(true){
            System.out.println(current + ": Enter a line");
            String inputTest = in.nextLine();
            if("STOP".equalsIgnoreCase(inputTest)){
                break;
            }
            lines.add(new Line(current,inputTest));
            current++;
        }
        for (int i = lines.size() - 1; i >= 0; i--){
            System.out.println(lines.get(i));
        }
    }
}
