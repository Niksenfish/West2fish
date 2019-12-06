package milkteashop;

public interface Shop {
	void Add(Ingredient ingredient);
	void Sell(String milkTeaName,String ingredientName) throws SoldOutException;
}
