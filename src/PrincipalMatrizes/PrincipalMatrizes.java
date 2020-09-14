package PrincipalMatrizes;

import MetodosMatrizes.Matriz;

public class PrincipalMatrizes {

	public static void main(String[] args) {

		int[][] matriz = new int[3][5];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				int num = (int) (1 + Math.random() * 10);
				matriz[i][j] = num;
			}
		}

		for (int i = 0; i < 3; i++) {
			int in = i;
			int n = 0;

			for (int j = 0; j < 5; j++) {
				int numVetor = matriz[i][j];
				n += numVetor;
			}
			Thread maThread = new Matriz(in, n);
			maThread.start();
		}
	}

}
