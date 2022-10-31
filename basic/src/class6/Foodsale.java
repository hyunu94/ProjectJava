package class6;

public class Foodsale {
	private String menu;
	private int num , price; 
	private double sell;
	
	private static double sellper = 0.15;
	private static int total;
	
	Foodsale(String menu , int num , int price){
		this.menu = menu;
		this.num = num;
		this.price = price;
	}
	
	public double sell() {
		sell = (double)((price*num) - (price*num*sellper));
		return sell;
	}
	
	public double total() {
		total += sell();
		return total;
	}
}
