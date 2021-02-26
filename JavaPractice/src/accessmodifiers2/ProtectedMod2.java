package accessmodifiers2;

import accessmodifiers1.ProtectedMod1;

// Protected Access Modifier only used through Inheritance only from outside of package

public class ProtectedMod2 extends ProtectedMod1 {

	public static void main(String[] args) {

		/*
		 * ProtectedMod1 obj = new ProtectedMod1(); obj.a=200; obj.void();
		 */

		// Protected
		ProtectedMod2 obj = new ProtectedMod2();
		obj.x = 600;
		obj.m3();

		/*
		 * Public public class ProtectedMod2 { public static void main(String[] args) {
		 * ProtectedMod1 obj = new ProtectedMod1(); obj.y=800; obj.m4(); }
		 */

	}
}
