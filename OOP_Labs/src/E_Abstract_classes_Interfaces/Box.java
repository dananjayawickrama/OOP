package E_Abstract_classes_Interfaces;

public class Box implements ICompute{


	
	private int length, width, height;
	private int volume;
	

	public Box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		
	}
	public void calculate() {
		
		System.out.println("Volume is = "+(length*width*height));
	}
	public void display() {
		
		System.out.println("Length is = "+length+"\nHeight is = "+height+"\nWidth is = "+width);
	}
}
