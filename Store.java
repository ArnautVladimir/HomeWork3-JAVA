package HomeWork3;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Store {
	
	
	private List<Product> product;
	
	public Store() {
		product = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		String regex = ".*[0-9]+.*";
		if (product.getPrice() < 0 || product.getName().matches(regex)) {
			System.out.println("ERROR Price or Name");
			return;
		}
		this.getProduct().add(product);		
	}
	
	
	public void deleteProductByName(String name) {
		
		Iterator<Product> iterator = this.getProduct().iterator();
		while (iterator.hasNext()) {
			//Product prod = iterator.next();
			if (iterator.next().getName().equals(name)) {
				iterator.remove();
			}
		}
		iterator = this.getProduct().iterator();
	}
	
	
	public void increasePriceByType(Type type) {
		for (Product prod  : this.getProduct()) {
			if (type.equals(prod.getType())) {
				prod.setPrice(prod.getPrice()*2);;
			}
		}
	}
	
	public void choosePremiumProducts(int price) {
		List<Product> premium = new ArrayList<>();
		for (Product prod  : this.getProduct()) {
			if (price < prod.getPrice()) {
				premium.add(prod);
			}
		}
		System.out.println("В нашем магазине продают такие премиум товары:");
		for (Product prod  : premium) {
			System.out.println(prod);
		}
	}
	
	
	public void sumPriceByType(Type type) {
		int sum = 0;
		for (Product prod  : this.getProduct()) {
			if (type.equals(prod.getType())) {
				sum = sum + prod.getPrice();
			}
		}
		System.out.println("Общая стоимость товаров типа " + type + " = " + sum);
	}
	
	public void avgPriceAllProducts() {
		int sum = 0;
		for (Product prod  : this.getProduct()) {
			sum = sum + prod.getPrice();
		}
		System.out.println("Средняя стоимость товаров составляет " + sum/this.getProduct().size());
	}
	
	
	
	

	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}


	@Override
	public String toString() {
		return "Store [product=" + product + "]";
	}


	
	



	
}
