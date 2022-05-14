import java.util.Scanner;

public class BoxProgram {
    double dblWidth;
    double dblHeight;
    double dblDepth;
    static int boxid;
    public BoxProgram(double dblWidth, double dblHeight, double dblDepth){
    	this.dblWidth = dblWidth;
    	this.dblHeight = dblHeight;
    	this.dblDepth = dblDepth;
    }
    public BoxProgram() {
    	
    }
    public double calcVolume()
    {
    	double dblTemp;
    	dblTemp = dblWidth * dblHeight * dblDepth;
    	return dblTemp;
    }
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the width of box");
	   double w = sc.nextDouble();
	   System.out.println("Enter the height of box");
	   double h = sc.nextDouble();
	   System.out.println("Enter the depth of box");
	   double v = sc.nextDouble();
	   BoxProgram b1 = new BoxProgram(w,h,v);
	   System.out.println("Volume of box is" +b1.calcVolume());
	}
}
