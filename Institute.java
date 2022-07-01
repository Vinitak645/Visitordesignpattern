package institutescore;


import java.util.Scanner;

import departments.*;
import visitingrule.*;
import visitors.*;

public class Institute {
	static int count = 0;

	private static double Calculatescore(Dept1[] dep) {
		Departmentvisitor DInspec = new Departmentinspectionrule();
		double average = 0;
		float total = 0;
		for (Dept1 deptt : dep) {
			total = total + deptt.accept(DInspec);
		}
		
		try{
			average = total / count;
			}catch(Exception e) {
				System.out.println(e);
			}
		
		if(average<0) {
			average =0;
		}else if(average >10) {
			average = 25;
			average = average/ 2.5;
		}else {
			average = average;
		}
		average = (average + (2*count))/2;
		return average;

	}

	public static void DisplayScore() {
		try {
			Scanner sc = new Scanner(System.in);
			
			int[][] str = new int[5][2];
			System.out.println("001 Department : Arts Department");
			System.out.println("002 Department : Scinece Department");
			System.out.println("003 Department : Medical Department");
			System.out.println("004 Department : Bussiness Department");
			System.out.println("005 Department : Commerce Department");
			
			
			for(int i =0; i<5; i++) {
				System.out.println("Do your College have 00"+ (1+i)+ " Department");
				System.out.println("Press 0: for YES! \nPress 1: for NO!");
				int x = sc.nextInt();
				
				if(x==0) {
					for(int j =0; j<2;j++) {
						if(j ==0) {
							System.out.println(" Enter the number of students");
							int a = sc.nextInt();
							str[i][j]=a;
						}else {
							System.out.println(" Enter the number of workers");
							int a = sc.nextInt();
							str[i][j]=a;
						}
					}
					count = ++count;
				}else {
					for(int j =0; j<2;j++) {
						if(j ==0) {
							str[i][j]=0;
						}else {
							str[i][j]=0;
						}
					}
				}
				
			}
			int c1 = str[0][0];
			int b1  = str[0][1];
			int c2 = str[1][0];
			int b2  = str[1][1];
			int c3 = str[2][0];
			int b3  = str[2][1];
			int c4 = str[3][0];
			int b4  = str[3][1];
			int c5 = str[4][0];
			int b5  = str[4][1];
			Dept1[] dep = new Dept1[] {  new Arts(c1,b1), new Sci(c2, b2), new Medi(c3, b3), new Busi(c4,b4), new Comm(c5, b5)
			};
			double rank = Calculatescore(dep);
			System.out.println("Grade " + rank);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	


}