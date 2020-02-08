package JavaProject;
import java.util.*;

public class NewYear {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Gift  g = new Gift();
        Cadbury []chocolates = new Cadbury[5];
        g.details();
		System.out.println("Enter the type  of gift u wish to give: ");
		int[] w = new int[5];
		int c=0;
		for(int i=0; i<5; i++) {
			w[i] = sc.nextInt();
		}
		for(int i=0; i<5; i++) {
			if(i<5) {
				chocolates[i] = new Cadbury();
				chocolates[i].details(w[i],i+1);
				
			
		}
			c= c+ w[i];
		
		System.out.println("\nTotal cost of  " + c + " gifts is " + g.getPrice() + " rupees and weight is " + g.getWeight());
		sc.close();
	}
	}
}

	//	else {
			
	//	}
		//return n;
