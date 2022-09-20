package Main;

public class Main {
	static int[] a;

	static void dfs(int[] a, int m, int k) {
		if (m == k) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
		} else {
			for (int i = m; i <= k; i++) {
				swap(a, m, i);
				dfs(a, m + 1, k);
				swap(a, m, i);
			}
		}
	}

	static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		a = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		dfs(a, 0, 2);
	}
}
