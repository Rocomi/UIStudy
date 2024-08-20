package com.kh.practice;

class DataClass03<L, R> {
	private L left;
	private R right;
	
	public L getLeft() {
		return left;
	}
	public void setLeft(L left) {
		this.left = left;
	}
	
	public R getRight() {
		return right;
	}
	public void setRight(R right) {
		this.right = right;
	}
	
}
public class MultiGenericRun {

	public static void main(String[] args) {
		
		DataClass03<String, Integer> d3 = new DataClass03();
		
		d3.setLeft("Hello");
		d3.setRight(30643);
		String left = d3.getLeft();
		int right = d3.getRight();
		
		DataClass03<Double, Boolean> d4 = new DataClass03();
		d4.setLeft(111.222);
		d4.setRight(true);

	}

}
