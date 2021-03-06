package HomeWork3;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Store {
	
	
	private static List<Product> productList;
	
	public Store() {
		productList = new ArrayList<>();
	}
	
	public static void setDefaultProductList() {
        productList.add(new Product("Bread", Type.FOOD, 17, true, "��������"));
        productList.add(new Product("Milk", Type.FOOD, 30, true, "��������"));
        productList.add(new Product("������", Type.SHOES, 1700, false, "������"));
        productList.add(new Product("����", Type.DRINKS, 230, false, "�������"));
    }

	
	public void addProduct(Product product) {
		String regex = ".*[0-9]+.*";
		if (product.getPrice() < 0 || product.getName().matches(regex)) {
			System.out.println("ERROR Price or Name");
			return;
		}
		productList.add(product);		
	}
	
	
	public void deleteProductByName(String name) {
		
		Iterator<Product> iterator = productList.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getName().equals(name)) {
				iterator.remove();
			}
		}
		iterator = productList.iterator();
	}
	
	
	public void increasePriceByType(Type type) {
		for (Product prod  : productList) {
			if (type.equals(prod.getType())) {
				prod.setPrice(prod.getPrice()*2);;
			}
		}
	}
	
	public void choosePremiumProducts(int price) {
		List<Product> premium = new ArrayList<>();
		for (Product prod  : productList) {
			if (price < prod.getPrice()) {
				premium.add(prod);
			}
		}
		System.out.println("� ����� �������� ������� ����� ������� ������:");
		for (Product prod  : premium) {
			System.out.println(prod);
		}
	}
	
	
	public void sumPriceByType(Type type) {
		int sum = 0;
		for (Product prod  : productList) {
			if (type.equals(prod.getType())) {
				sum = sum + prod.getPrice();
			}
		}
		System.out.println("����� ��������� ������� ���� " + type + " = " + sum);
	}
	
	public void avgPriceAllProducts() {
		int sum = 0;
		for (Product prod  : productList) {
			sum = sum + prod.getPrice();
		}
		System.out.println("������� ��������� ������� ���������� " + sum/productList.size());
	}
	
	
	public List<Product> getProduct() {
		return productList;
	}


	public void setProduct(List<Product> productList) {
		Store.productList = productList;
	}


	@Override
	public String toString() {
		return "Store [productList=" + productList + "]";
	}



}
