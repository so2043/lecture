package _12_modifier.sec01_accessnodifier.EX01_AccessModifierOfMember;

import _12_modifier.sec01_accessnodifier.EX01_AccessModifierOfMember.pack1.A;
import _12_modifier.sec01_accessnodifier.EX01_AccessModifierOfMember.pack1.B;
import _12_modifier.sec01_accessnodifier.EX01_AccessModifierOfMember.pack2.C;
import _12_modifier.sec01_accessnodifier.EX01_AccessModifierOfMember.pack2.D;

public class AccessModifierOfMember {
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		
		a.print();
		b.print();
		c.print();
		d.print();
	}
}
