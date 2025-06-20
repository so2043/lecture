package _07_oop1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Point3D extends Point2D {

	private int z;
		
	
	public void print() {
		super.print(); 		// Point2D에 있는 print() 사용
		System.out.println("z = " + this.getZ());
	}
}
