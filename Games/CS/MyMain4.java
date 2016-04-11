package lessons.march.homeworks;

import lessons.march.homeworks.Weapon.Type;

public class MyMain4 {

	public static void main(String[] args) {

		M4A1 mka = new M4A1("M4A1-S", 20, 20, 10, 90, Type.RIFFLE);
		
		for (int i = 0; i < 30; i++) {
			mka.shot(0, 0);
		}
	
		
	}

}
