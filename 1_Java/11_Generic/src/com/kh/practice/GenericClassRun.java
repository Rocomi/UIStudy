package com.kh.practice;

// 정수형 데이터를 다루는 클래스 
/*class DataClass {
	
	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}*/
//Object형으로 저장 후 형변환
/*class DataClass {
	
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}*/

//제네릭
class DataClass<T> {
	
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}



public class GenericClassRun {

	public static void main(String[] args) {
		DataClass<Double> d1 = new DataClass<Double>();
		d1.setData(new Double(1000));
		double data = d1.getData();
		System.out.println(data);
		
		DataClass<Integer> d2 = new DataClass<>();
		d2.setData(1000);
		System.out.println(d2.getData());
		
		DataClass<String> d3= new DataClass<>();
		d3.setData("Apple");
		System.out.println(d3.getData());

	}

}
