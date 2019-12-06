package milkteashop;

import java.util.Calendar;

public class Test {
	public static void main(String[] args) throws SoldOutException{
		MilkTea ashop=new MilkTea();
		System.out.println(ashop.toString());
		Calendar date1=Calendar.getInstance();
		Bubble b = new Bubble(date1);
		Coconut c = new Coconut(date1);
		ashop.Add(b);
		ashop.Add(c);
		System.out.println(ashop.toString());
		ashop.Sell("TofuMilkTea", "Bubble");
		ashop.Sell("TofuMilkTea", "Coconut");
		ashop.Sell("TofuMilkTea", "Bubble");
		ashop.Sell("TofuMilkTea", "Coconut");
		ashop.Add(b);
		ashop.Add(c);
		ashop.Sell("TofuMilkTea", "Bubble");
		ashop.Sell("TofuMilkTea", "Coconut");
    }
}
