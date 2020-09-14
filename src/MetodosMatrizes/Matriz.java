package MetodosMatrizes;

public class Matriz extends Thread {

	private int n;
	private int in;

	public Matriz(int in, int n) {
		this.in = in;
		this.n = n;
	}

	@Override
	public void run() {
		System.out.println("A soma dos vetores na posição " 
				+ in + " TID # " + getId() + " ==> " + n);
	}
}
