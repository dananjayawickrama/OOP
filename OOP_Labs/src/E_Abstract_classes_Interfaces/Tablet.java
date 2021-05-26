package E_Abstract_classes_Interfaces;

public class Tablet extends Item{

	
	private String brand, model, camera;

	public Tablet(int itemNo, String name, double unitPrice, int qty, String brand, String model, String camera) {
		super(itemNo, name, unitPrice, qty);
		this.brand = brand;
		this.model = model;
		this.camera = camera;
	}
	
	

	public void printLine() {
		
		System.out.println("Item No is "+getItemNo()+".Name is "+getName()+".UnitPrice is "+getUnitPrice()+".Quantity is "+getQty()+".Brand is "+brand+".Model is "+model+".Camera is "+camera);
	}
	
	
	public void printDetails() {
		
		System.out.println(getItemNo());
		System.out.println(getName());
		System.out.println(getUnitPrice());
		System.out.println(getQty());
		System.out.println(brand);
		System.out.println(model);
		System.out.println(camera);
	}
}