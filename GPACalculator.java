package practice;
import java.util.Scanner;
public class GPACalculator
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		//variable declaration
		//TGP => Theory Grading Points
		//TCH => Theory Credit Hours
		//TQP => Theory Quality Points
		//PGP => Practical Grading Points
		//PCH => Practical Credit Hours
		//PQP => Practical Quality Points
		//QP => Quality Points
		//CH => Credit Hours
		float TGP1, TGP2, TGP3, TGP4, TGP5, TGP6, TGP7;
		float TCH1, TCH2, TCH3, TCH4, TCH5, TCH6, TCH7;
		float TQP1, TQP2, TQP3, TQP4, TQP5, TQP6, TQP7;
		float PGP1, PGP2, PGP3, PGP4, PGP5;
		float PCH1, PCH2, PCH3, PCH4, PCH5;
		float PQP1, PQP2, PQP3, PQP4, PQP5;
		float Sum_QP, Sum_CH;
		float GPA;
		
		//input your THEORY's grades
		System.out.print("Enter your 1st subject Grade Points ");
		TGP1 = sc.nextFloat();
		System.out.print("Enter your 2nd subject Grade Points ");
		TGP2 = sc.nextFloat();
		System.out.print("Enter your 3rd subject Grade Points ");
		TGP3 = sc.nextFloat();
		System.out.print("Enter your 4th subject Grade Points ");
		TGP4 = sc.nextFloat();
		System.out.print("Enter your 5th subject Grade Points ");
		TGP5 = sc.nextFloat();
		System.out.print("Enter your 6th subject Grade Points ");
		TGP6 = sc.nextFloat();
		System.out.print("Enter your 7th subject Grade Points ");
		TGP7 = sc.nextFloat();
		
		//input THEORY's Credit Hours
		System.out.print("Enter your 1st subject Credit Hours ");
		TCH1 = sc.nextFloat();
		System.out.print("Enter your 2nd subject Credit Hours ");
		TCH2 = sc.nextFloat();
		System.out.print("Enter your 3rd subject Credit Hours ");
		TCH3 = sc.nextFloat();
		System.out.print("Enter your 4th subject Credit Hours ");
		TCH4 = sc.nextFloat();
		System.out.print("Enter your 5th subject Credit Hours ");
		TCH5 = sc.nextFloat();
		System.out.print("Enter your 6th subject Credit Hours ");
		TCH6 = sc.nextFloat();
		System.out.print("Enter your 7th subject Credit Hours ");
		TCH7 = sc.nextFloat();
		
		//input your PRACTICAL's grades
		System.out.print("Enter your 1st Practical Grade Points ");
		PGP1 = sc.nextFloat();
		System.out.print("Enter your 2nd Practical Grade Points ");
		PGP2 = sc.nextFloat();
		System.out.print("Enter your 3rd Practical Grade Points ");
		PGP3 = sc.nextFloat();
		System.out.print("Enter your 4th Practical Grade Points ");
		PGP4 = sc.nextFloat();
		System.out.print("Enter your 5th Practical Grade Points ");
		PGP5 = sc.nextFloat();
		
		//input PRACTICAL's Credit Hours
		System.out.print("Enter your 1st Practical Credit Hours ");
		PCH1 = sc.nextFloat();
		System.out.print("Enter your 2nd Practical Credit Hours ");
		PCH2 = sc.nextFloat();
		System.out.print("Enter your 3rd Practical Credit Hours ");
		PCH3 = sc.nextFloat();
		System.out.print("Enter your 4th Practical Credit Hours ");
		PCH4 = sc.nextFloat();
		System.out.print("Enter your 5th Practical Credit Hours ");
		PCH5 = sc.nextFloat();
		
		//finding THEORY's Quality Points
		TQP1 = TGP1 * TCH1;
		TQP2 = TGP2 * TCH2;
		TQP3 = TGP3 * TCH3;
		TQP4 = TGP4 * TCH4;
		TQP5 = TGP5 * TCH5;
		TQP6 = TGP6 * TCH6;
		TQP7 = TGP7 * TCH7;
		
		//finding PRACTICAL's Quality Points
		PQP1 = PGP1 * PCH1;
		PQP2 = PGP2 * PCH2;
		PQP3 = PGP3 * PCH3;
		PQP4 = PGP4 * PCH4;
		PQP5 = PGP5 * PCH5;
		
		//finding GPA
		Sum_QP = TQP1 + TQP2 + TQP3 + TQP4 + TQP5 + TQP6 + TQP7 + PQP1 + PQP2 + PQP3 + PQP4 + PQP5;
		Sum_CH = TCH1 + TCH2 + TCH3 + TCH4 + TCH5 + TCH6 + TCH7 + PCH1 + PCH2 + PCH3 + PCH4 + PCH5;
		GPA = Sum_QP / Sum_CH;
		
		//displaying result here
		System.out.print("Your GPA is "+GPA);
	}
}