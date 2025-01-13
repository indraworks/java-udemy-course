package _05_b_OOP_PolimorphismeChallenge;

public class _01_MainSmartKitchen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//kita buat instansiate dari SmartKithcne
		_01_SmartKitchen mykitchen = new _01_SmartKitchen();
		//kita set 3 3 class object yg berkomposisi dalam smartKitchen kita set true smua 
		mykitchen.setSmartKitchenState(true, true, true);
	    
		mykitchen.getRefrigator().orderFood();
		mykitchen.getCoffeemaker().brewCoffee();
		mykitchen.getDiswasher().doDishes();
		
		
		//mykitchen.doSmartKitchen();
		
	}

}
