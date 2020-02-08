package JavaProject;

public class Gift {

	        int wt,p;
	       
			static int totalPrice=0;
			static int totalWeight=0;
			void details() {
				System.out.println("1.abc");
				System.out.println("2.xyz");
				System.out.println("3.def");
				System.out.println("4.pqs");
				System.out.println("5.rst");
			}
			void Price(int price) {
				this.p=price;
				totalPrice += price; 
			}
			void Weight(int weight) {
				this.wt=weight;
				totalWeight += weight;}
			int getPrice() {
				return totalPrice;
			}
			int getWeight() {
				return totalWeight;
			}
		}

	


