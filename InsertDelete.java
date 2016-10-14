package insertdelete;

public class InsertDelete {

	static int[] insert(int[] array, int value, int index) {
		if (index > array.length || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] result = new int[array.length + 1];
		int firsthalf = array.length - index - 1;
		for (int i = 0; i < firsthalf; i++) {
			result[i] = array[i];
		}
		result[firsthalf] = value;
		for (int i = firsthalf + 1; i < result.length; i++) {
			result[i] = array[i - 1];
		}
		return result;
	}

	static int[] delete(int[] array, int index) {

		if (index > array.length || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] result = new int[array.length - 1];
		int firsthalf = array.length - index;
		for (int i = 0; i < firsthalf; i++) {
			result[i] = array[i];
		}
		for (int i = firsthalf; i < result.length; i++) {

			result[i] = array[i + 1];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] result = insert(array, 4, 5);
		System.out.println("Insert: ");
		System.out.println();
		for (int i : result) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Delete: ");
		System.out.println();
		int[] resultOfDelete = delete(array, 5);
		for (int i : resultOfDelete) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Original array: ");
		System.out.println();
		for (int i : array) {
			System.out.print(i);
		}
	}

}
