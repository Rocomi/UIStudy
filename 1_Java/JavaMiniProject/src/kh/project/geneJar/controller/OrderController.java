package kh.project.geneJar.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import kh.project.geneJar.model.dao.Data;
import kh.project.geneJar.model.dao.OrderDAO;
import kh.project.geneJar.model.vo.Medicine;
import kh.project.geneJar.model.vo.Order;

public class OrderController {

	private HashMap<String, Order> oLog = new HashMap<>();
	private Data<Order> od = new OrderDAO();

	{
		try {
			for (Order o : od.fileRead()) {
				oLog.put(o.getOrderNo(), o); // 프로그램 시작시 Medicine HashMap 초기화
			}
		} catch (NullPointerException e) {
			/* 첫번째 약품 */}
	}
	
	public boolean addOrder(Order o) {
		
		if (!oLog.containsKey(o.getOrderNo())) {
			oLog.put(o.getOrderNo(), o);
			od.addData(o);
			return true;
		}
		return false;

	}

	public void searchOrder(String orderName) {
		
		Order o = new Order();

		Iterator it = oLog.keySet().iterator();

		for (int i = 0; it.hasNext(); i++) {

			o = oLog.get(it.next());

			if (o.getOrderName().equals(orderName)) {
				System.out.println(o);
			}
		}
		
	}

	public void orderList() {

		Order o = new Order();

		Iterator it = oLog.keySet().iterator();

		for (int i = 0; it.hasNext(); i++) {

			o = oLog.get(it.next());

			System.out.println(o);
		}

	}

	public Order remove(String orderNo) {

		oLog.remove(orderNo);

		Order[] oArr = new Order[oLog.size()];

		Iterator it = oLog.keySet().iterator();

		for (int i = 0; it.hasNext(); i++) {

			oArr[i] = oLog.get(it.next());

		}
		od.changeData(oArr);

		return oLog.get(orderNo);
	}
	
	public Order getOrder(String orderNo) {
		return oLog.get(orderNo);
	}

}
