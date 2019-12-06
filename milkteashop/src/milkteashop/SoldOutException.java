package milkteashop;

public class SoldOutException extends Exception{
	public SoldOutException(){
	       super();
	   }
	public SoldOutException(String messerge){
	       super(messerge);
	   }
}
