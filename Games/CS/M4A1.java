package lessons.march.homeworks;


public class M4A1 extends Weapon {

	public M4A1(String name, int nCapacity, int nBullets, int nRecoil, int nDamage, Type type) {
		super(name, nCapacity, nBullets, nRecoil, nDamage, type);
	}
	
	@Override
	public void shot(int x, int y) {
		
		setBullets( getBullets()-1 );
		
		System.out.format("Got shot from %s | bullets: %d / %d\n", name, getBullets(), getCapacity());
	}

}
