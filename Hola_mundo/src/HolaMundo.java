public class HolaMundo {
	public static void main(String[] args) throws Exception{
		System.out.println("Hola MUndos!");
		Pila<Integer> a = new Pila<Integer>(1000);
		a.push(4);
		System.out.println(a.pop());
	}
}
