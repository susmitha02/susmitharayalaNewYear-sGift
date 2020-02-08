package JavaProject;

public class Cadbury extends Gift {
	
		void details(int quantity,int no) {
			if(no== 1) {
				this.Price(quantity*10);
				this.Weight(quantity*20);
			}else if(no== 2) {
				this.Price(quantity*20);
				this.Weight(quantity*30);
			}else if(no==3) {
				this.Price(quantity*15);
				this.Weight(quantity*44);
			}
			else if(no== 4) {
				this.Price(quantity*20);
				this.Weight(quantity*34);
			}
			else if(no == 5) {
				this.Price(quantity*25);
				this.Weight(quantity*35);
			
			
		}
	}
}
