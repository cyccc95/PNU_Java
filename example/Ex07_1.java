package example;

abstract class Drinks {
	public abstract void drink();
}

class Juice extends Drinks {
	public void drink() {
		System.out.println("주스를 마십니다");
	}
}

class Coffee extends Drinks {
	public void drink() {
		System.out.println("커피를 마십니다");
	}
}

class Beer extends Drinks {
	public void drink() {
		System.out.println("맥주를 마십니다");
	}
}

class Water extends Drinks {
	public void drink() {
		System.out.println("물을 마십니다");
	}
}

class Tea extends Drinks {
	public void drink() {
		System.out.println("차를 마십니다");
	}
}


public class Ex07_1 {

	public static void main(String[] args) {
		Drinks[] drinks = new Drinks[5];
		drinks[0] = new Juice();
		drinks[1] = new Coffee();
		drinks[2] = new Beer();
		drinks[3] = new Water();
		drinks[4] = new Tea();
		
		drinks[0].drink();
		drinks[1].drink();
		drinks[2].drink();
		drinks[3].drink();
		drinks[4].drink();
	}

}

// 음료 주문