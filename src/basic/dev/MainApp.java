package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			float x;
			int k;
			double sum = 0;
			int i = 0;
			
			
			System.out.println("Nhap x = ");
			x = sc.nextFloat();
			System.out.println("Nhap k = ");
			k = sc.nextInt();
			
			while((Math.pow(x, i)/factorial(i)) >= (1/Math.pow(10, k))){
				sum += (Math.pow(x, i)/factorial(i));
				i++;
			}
			System.out.println("Bai 15.1 ham e^x:");
			System.out.println("e^x= "  + String.format("%.4g%n", Math.exp(x)));
			System.out.println("result = " + String.format("%.4g%n", sum));
			System.out.println("Bang nhau");
		
			
		System.out.println("-------------------------");
		System.out.println("Bai 15.2: Ham 1/(1+x^3)");
		
		
		i=1;
		sum = 0;
		int iplus=2;
		int iminus = 0;
		
		while(((i*iplus)/2)*Math.pow(x, iminus) >= (1/Math.pow(10, k)) ) {
			if(i % 2 == 1) {
				sum +=  ((i*iplus)/2)*Math.pow(x, iminus);
			} else {
				sum -=  ((i*iplus)/2)*Math.pow(x, iminus);
			}
			i++;
			iminus++;
			iplus++;
		}
		
		
		System.out.println(" 1 / (1+x)^3 = " + String.format("%.3g%n",  1/Math.pow((1+x), 3)));
		System.out.println("result = " + String.format("%.3g%n", sum));
		System.out.println(" Bang nhau ");
		
		
		System.out.println("-------------------------");
		System.out.println("Bai 15.3: Ham ln(1-x)");
		
		i=1;
		sum = 0;
		
		while((Math.pow(x, i)/i) >= (1/Math.pow(10, k))) {
			sum-= Math.pow(x, i)/i;
			i++;
		}
		
		System.out.println("ln(1-x) = " + String.format("%.3g%n", Math.log(1-x)));
		System.out.println("result = " + String.format("%.3g%n", sum));
		
	}

	private static double factorial(int i) {
		// TODO Auto-generated method stub
		return 0;
	}}
