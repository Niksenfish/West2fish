package milkteashop;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Coconut extends Ingredient {
	static int expiredDate=5;
	static String name="Coconut";
	@Override
	public String toString() {
		String strDateFormat = "yyyy-MM-dd";
	    SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	    Date date1=productionDate.getTime();
	    String productiondate=sdf.format(date1);
		return "Coconut productionDate: "+productiondate+" expiredDate: "+expiredDate;
	}

	public Coconut() {
		super();
		name="Coconut";
		expiredDate =5;
		// TODO Auto-generated constructor stub
	}
	public Coconut(Calendar productionDate) {
		super();
		name="Coconut";
		expiredDate = 5;
		this.productionDate=productionDate;
	}
	
}
