package assignment_9sept;
import java.util.Scanner;
public class CalculateSiAndCi implements SimpleAndCompound {
	
	double SimpleInterest=0;
	double CompoundInterest=0;
	
	public double calSI(double p,double r,double t) {
		
		SimpleInterest=(p*r*t)/100;
		return SimpleInterest;
	}
	
     public double calCI(double p,double r,double t) {
		
	    CompoundInterest=p* Math.pow(1.0+r/100.0,t);
		return CompoundInterest;
	}

 public static void main(String []args) {
	 CalculateSiAndCi O1 = new CalculateSiAndCi();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principle");
		double  P = sc.nextDouble();
		System.out.println("Enter Rate");
		double  R= sc.nextDouble();
		System.out.println("Enter Time ");
		double  T = sc.nextDouble();
		
             System.out.println("SI :"+O1.calSI(P,R,T));
		System.out.println("CI :"+O1.calCI(P,R,T));
		sc.close();
	 
 }
     
}
