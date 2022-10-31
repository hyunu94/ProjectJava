package class6;

class BookSales {
	private String name;
	private int num;
	private	int price;
	private int sell;
	private static int total;
	
	BookSales(String name , int num , int price){
		this.name = name;
		this.num = num;
		this.price= price;
	}
	
	public int sell() {
		int sell = num*price;
		return sell;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal() {
		BookSales.total = total;
	}
	
	public void total() {
		total += sell();
	}

}

