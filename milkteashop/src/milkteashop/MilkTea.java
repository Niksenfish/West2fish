package milkteashop;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Date;
public class MilkTea implements Shop{
	String[] name= {"TofuMilkTea","CaramelMilkTea"};
	private List<Bubble> bubble = new ArrayList<>();
	private List<Coconut> coconut = new ArrayList<>();
	
	public MilkTea() {
		Calendar date1=Calendar.getInstance();
		date1.clear();
		date1.set(1900,0,1);
		Bubble b = new Bubble(date1);
		Coconut c = new Coconut(date1);
		bubble.add(b);
		coconut.add(c);
	}
	@Override
	public void Add(Ingredient ingredient) {
		if(ingredient instanceof Bubble)
		{
			Bubble b = (Bubble) ingredient;
			b.productionDate=Calendar.getInstance();
			bubble.add(b);
			System.out.println("New Bubble"+b.toString());
		}
		else if(ingredient instanceof Coconut)
		{
			Coconut c = (Coconut) ingredient;
			c.productionDate=Calendar.getInstance();
			coconut.add(c);
			System.out.println("New Coconut:"+c.toString());
		}
	}
	public void check1 (List<Bubble> bubble) throws SoldOutException
	{
		while(!bubble.isEmpty())
		{
			Calendar deadDate=bubble.get(0).productionDate;
			deadDate.add(Calendar.DATE , Bubble.expiredDate);
			Calendar nowDate=Calendar.getInstance();
			if(nowDate.after(deadDate))
			{
				bubble.remove(0);
			}
			else
				break;
		}
		if(bubble.isEmpty())
			throw new SoldOutException("Bobble MilkTea Sold Out!");
	}
	public void check2 (List<Coconut> coconut) throws SoldOutException
	{
		while(!coconut.isEmpty())
		{
			Calendar deadDate=coconut.get(0).productionDate;
			deadDate.add(Calendar.DATE , Coconut.expiredDate);
			Calendar nowDate=Calendar.getInstance();
			if(nowDate.after(deadDate))
			{
				coconut.remove(0);
			}
			else
				break;
		}
		if(coconut.isEmpty())
			throw new SoldOutException("Coconut MilkTea Sold Out!");
	}
	@Override
	public void Sell(String milkTeaName,String ingredientName) throws SoldOutException {
		switch (ingredientName) {
		case "Bubble":
						try {
							check1(bubble);
							System.out.println("You buyed a "+ingredientName+" "+milkTeaName+"!");
							bubble.remove(0);
						}
						catch(SoldOutException e)
						{
							System.out.println(e.getMessage());
						}
						break;
		case "Coconut":
						try {
							check2(coconut);
							System.out.println("You buyed a "+ingredientName+" "+milkTeaName+"!");
							coconut.remove(0);
						}
						catch(SoldOutException e) {
							System.out.println(e.getMessage());
						}
						break;
		default:
			break;
		}
	}
	@Override
	public String toString() {
		return "MilkTea: "+Arrays.toString(name)+"\nIngredient:\n"+bubble+"\n"+coconut;
	}
	

}
