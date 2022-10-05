package introduction;

public class HelloWorld {
		
		public static void main(String[] args) {
			System.out.println("Hello World");
			Salesman sales[] = new Salesman[10];
			sales[0] = new Salesman("james", 20000);
			sales[1] = new Salesman("michael", 35000);
			sales[2] = new Salesman("mike", 42000);
			sales[3] = new Salesman("phil", 63000);
			sales[4] = new Salesman("justin", 12500);
			sales[5] = new Salesman("garrett", 4000);
			sales[6] = new Salesman("wyatt", 67500);
			sales[7] = new Salesman("colleen", 6500);
			sales[8] = new Salesman("grant", 1200);
			sales[9] = new Salesman("miller", 10000);
			Salesman result[] = Salesman.GetTopFive(sales);
			for(int i = 0; i < result.length; i++) {
				System.out.println(sales[i]);
			}
			System.out.println("The top salesman are: ");
			for(int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
		
		public static int FindMax(int[] arrayinput) {
			int tempMaximum = -1;
			for(int i = 0; i < arrayinput.length; i++) {
				if( tempMaximum < arrayinput[i]) {
					tempMaximum = arrayinput[i];
				}
			}
		return tempMaximum;	
		}

}
