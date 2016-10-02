package tw.homework;

public class ArrayHW2 {

	int arr[] = new int[42];
	int index[] = new int[42];

	void ranArr() {
		for (int i = 1; i <= 100000; i++) {
			int j = (int) (Math.random() * 42);
			arr[j]++;
		}
	}

	void Index() {
		for (int i = 0; i < 42; i++) {
			index[i] = i + 1;
		}
	}

	// 起泡排序
	void Sort() {
		for (int x = 0; x < arr.length; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[x] > arr[y]) {
					int tmp = arr[x];
					arr[x] = arr[y];
					arr[y] = tmp;
					// 索引值
					tmp = index[x];
					index[x] = index[y];
					index[y] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayHW2 unsort = new ArrayHW2();
		ArrayHW2 sorted = new ArrayHW2();
		unsort.ranArr();
		unsort.Index();

		for (int i = 0; i < 42; i++) {
			sorted.arr[i] = unsort.arr[i];
			sorted.index[i] = unsort.index[i];
		}

		System.out.println("original data:    sorted data:");
		System.out.println("--------------    --------------");

		sorted.Sort();
		for (int j = 0; j < 42; j++) {
			System.out.printf(" %2d | %2d    %8d | %2d%n", unsort.index[j], unsort.arr[j], sorted.index[j],
					sorted.arr[j]);

			// System.out.println(unsort.index[j]+" "+unsort.arr[j]+"
			// "+sorted.index[j]+" "+sorted.arr[j]);
		}
	}

}
