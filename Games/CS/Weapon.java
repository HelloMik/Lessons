package lessons.march.homeworks;



public abstract class Weapon {
	    
	enum Type { RIFFLE, PISTOL, MELEE };
	
	public String name;
	final private int nCapacity;
	private int nBullets;
	final private float fRecoil;
	final private int nDamage;
	final private Type type;
	public boolean bReload;
	
	public Weapon(String name, int nCapacity, int nBullets, float fRecoil, int nDamage, Type type) {
		
		int n = nCapacity;
		if (nCapacity < 0)  n = 0;
		if (nCapacity > 999) n = 999;
		this.nCapacity = n;
		
		setBullets(nBullets);

		this.name = name;
		this.fRecoil = fRecoil;
		this.nDamage = nDamage;
		this.type = type;
	}
	
	abstract public void shot(int x, int y);
	
	public int getCapacity() { return nCapacity; }
	
	public int getBullets() { return nBullets; }
	
	public void setBullets(int n) {
		nBullets = n;
		if (n < 0) nBullets = 0;
		if (n > nCapacity) nBullets = nCapacity;
	}

	public float getRecoil() { return fRecoil; }

	public int getDamage() { return nDamage; }

	public Type getType() { return type; }
	
}
