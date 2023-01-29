package day6Assignment;

public class Generics<T> {
	T container;

	public Generics() {
	}

	public Generics(T container) {
		this.container = container;
	}

	public Object getValue() {
		return this.container;
	}
	
	
	public static <S> void print(Generics<S[]> a) {
		for (S obj : a.container) {
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {
		Generics<Integer[]> a = new Generics<Integer[]>();
		Generics<String[]> b = new Generics<String[]>();
		Generics<Double[]> c = new Generics<Double[]>();

		Integer Ia[] = new Integer[] { 10, 20, 30 };
		String Sa[] = new String[] { "a1", "b1", "c1" };
		Double Da[] = new Double[] { 1.5, 2.5, 3.5 };

		a.container = Ia;
		b.container = Sa;
		c.container = Da;

		print(a);
		print(b);
		print(c);
	}
}
