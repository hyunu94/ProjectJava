package Practicer;

import java.util.ArrayList;

public class Total {
	private int total;
	private double aver;
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public double getAver() {
		return aver;
	}
	
	public void setAver() {
		this.aver = aver;
	}
	
	public void plus(ArrayList <Integer> arr) {
		for(int i=0;i<arr.size();i++) {
			int num = arr.get(i);
			total += num;
		}
	}
	
	public void Aver(int total) {
		 aver = total/3;
	
	}
		
	
}
