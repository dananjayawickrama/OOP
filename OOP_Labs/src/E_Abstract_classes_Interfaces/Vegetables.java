package E_Abstract_classes_Interfaces;

public class Vegetables extends Item{

	private boolean organic;
	private int calories;
	
	
	
	public Vegetables(int itemNo, String name, double unitPrice, int qty, boolean organic, int calories) {
		super(itemNo, name, unitPrice, qty);
		this.organic = organic;
		this.calories = calories;
	}
	
	

	public void printLine() {
		
		System.out.println("Item No is "+getItemNo()+".Name is "+getName()+".UnitPrice is "+getUnitPrice()+".Quantity is "+getQty()+".organic is "+organic+".calories is "+calories);
	}
	
	
	public void printDetails() {
		
		System.out.println(getItemNo());
		System.out.println(getName());
		System.out.println(getUnitPrice());
		System.out.println(getQty());
		System.out.println(organic);
		System.out.println(calories);
	
	}
	
}
