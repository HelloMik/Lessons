package lessons.march.a;

import java.util.logging.Logger;

public class MyMain0328 {
   
	private static Logger log = Logger.getLogger(MyMain0328.class.getName());

	public static void main(String[] args) {
		
		log.info("Start");

		Dog dog1 = new Dog();
		dog1.name = "Шарик";
		dog1.owner = "Вадим";
		dog1.setLegs(3);
		
		dog1.say();
		
		
		Cat cat1 = new Cat();
		cat1.name = "Барсик";
		cat1.owner = "Ян";
		cat1.setLegs(4);
		
		cat1.say();
	}

}
