package E_Abstract_classes_Interfaces;

public class Item implements IPrint{

	private int itemNo;
	private String name;
	private double unitPrice;
	private int qty;
	
	
	
	
	
	public Item(int itemNo, String name, double unitPrice, int qty) {
		super();
		this.itemNo = itemNo;
		this.name = name;
		this.unitPrice = unitPrice;
		this.qty = qty;
	}


	
	
	
	
	
	
	public int getItemNo() {
		return itemNo;
	}








	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}








	public String getName() {
		return name;
	}








	public void setName(String name) {
		this.name = name;
	}








	public double getUnitPrice() {
		return unitPrice;
	}








	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}








	public int getQty() {
		return qty;
	}








	public void setQty(int qty) {
		this.qty = qty;
	}








	public void printLine() {
		
		System.out.println("Item No is "+itemNo+".Name is "+name+".UnitPrice is "+unitPrice+".Quantity is "+qty);
	}
	
	
	public void printDetails() {
		
		System.out.println(itemNo);
		System.out.println(name);
		System.out.println(unitPrice);
		System.out.println(qty);
	}
}
