package HomeWork3;


public class Main {

	public static void main(String[] args) {
		
Store store = new Store();

Product product = new Product("Пальто", Type.CLOTHES, 300, true, "Одежда");
Product product1 = new Product("Вино", Type.DRINKS, 200, true, "Напитки");
Product product2 = new Product("Кеды", Type.SHOES, 300, true, "Обувь");


store.getProduct().add(product);
store.getProduct().add(product1);
store.getProduct().add(product2);
store.getProduct().add(new Product("Хлеб", Type.FOOD, 300, true, "Продукты"));
store.addProduct(new Product("Квас", Type.DRINKS, 50, true, "Напитки"));
store.addProduct(new Product("Cola", Type.DRINKS, 70, true, "Напитки"));
store.addProduct(new Product("Fanta", Type.DRINKS, 40, true, "Напитки"));


	store.deleteProductByName("Квас");
	store.increasePriceByType(Type.FOOD);
	store.choosePremiumProducts(70);
	store.sumPriceByType(Type.DRINKS);
	store.avgPriceAllProducts();

	
	
	for (Product prod  : store.getProduct()) {
		System.out.println(prod);}
	
	}

	

}
