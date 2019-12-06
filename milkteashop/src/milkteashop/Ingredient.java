package milkteashop;

import java.util.*;
public abstract class Ingredient {
	protected String name;
	protected Calendar productionDate;
	protected static int expiredDate;
	@Override
	public String toString() {
		return "Ingredient [name=" + name + ", productionDate=" + productionDate + "]";
	}
	public Ingredient() {
		Calendar productionDate=Calendar.getInstance();
		productionDate.clear();
		productionDate.set(1900,0,1);
	}
	
}
