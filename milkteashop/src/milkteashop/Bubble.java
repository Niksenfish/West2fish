package milkteashop;

import java.text.*;
import java.util.*;
public class Bubble extends Ingredient{
	static int expiredDate=7;
	static String name="Bubble";
	@Override
	public String toString() {
		String strDateFormat = "yyyy-MM-dd";
	    SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	    Date date1=productionDate.getTime();
	    String productiondate=sdf.format(date1);
		return "Bubble productionDate: "+productiondate+" expiredDate: "+expiredDate;
	}

	public Bubble() {
		name="Bubble";
		expiredDate = 7;
	}
	public Bubble(Calendar productionDate) {
		name="Bubble";
		expiredDate = 7;
		this.productionDate=productionDate;
	}
	
}
