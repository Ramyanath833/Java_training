package java8;

public interface Sim {

	void calling();
	void data();
	public default void payment() {
		System.out.println("do the payment");
	}
}
