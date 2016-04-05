package lessons.march.a;


abstract class Animal {

	public String name;
	public String owner;
	private int nLegs;
	
	abstract void say();

	public int getLegs() {
		return nLegs;
	}

	public void setLegs(int nLegs) {
		if (nLegs <= 2) {
			System.err.println("Количетсво ног долно быть больше 2");
		}
		if (nLegs % 2 == 1) {
			System.err.println("Количетсво ног долно быть четным");
			return;
		}
		if (nLegs > 40) {
			System.err.println("Слишком много ног!");
			return;
		}
		this.nLegs = nLegs;
	}
	
	
	
}
