package HomeWork3;


public class Main {

	public static void main(String[] args) {
		
Store store = new Store();

Product product = new Product("������", Type.CLOTHES, 300, true, "������");
Product product1 = new Product("����", Type.DRINKS, 200, true, "�������");
Product product2 = new Product("����", Type.SHOES, 300, true, "�����");


store.getProduct().add(product);
store.getProduct().add(product1);
store.getProduct().add(product2);
store.getProduct().add(new Product("����", Type.FOOD, 300, true, "��������"));
store.addProduct(new Product("����", Type.DRINKS, 50, true, "�������"));
store.addProduct(new Product("Cola", Type.DRINKS, 70, true, "�������"));
store.addProduct(new Product("Fanta", Type.DRINKS, 40, true, "�������"));


	store.deleteProductByName("����");
	store.increasePriceByType(Type.FOOD);
	store.choosePremiumProducts(70);
	store.sumPriceByType(Type.DRINKS);
	store.avgPriceAllProducts();

	
	
	for (Product prod  : store.getProduct()) {
		System.out.println(prod);}
	
	}

	

}
