import java.util.Scanner; //import user input

public class SortAscDesc {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = createArray();

		System.out.println("Original order: ");
		printValues(array);

		System.out.println("Ascending: ");
		sortAscending(array);
		printValues(array);

		System.out.println("Descending");
		sortDescending(array);
		printValues(array);
	}

    //Descending order of array method
	private static void sortDescending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}

    //Ascending order of array method
	private static void sortAscending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}

	private static void printValues(int[] array) {
		for (int element : array) {
			System.out.print(element + ", ");
		}
		System.out.println();
	}

	private static int[] createArray() {
		System.out.print("Enter number of elements you want in the array: ");
		int howManyValues = getIntFromUser();
		int[] array = new int[howManyValues]; //to avoid infinite loops after Enter
		for (int index = 0; index < howManyValues; index++) {
			System.out.println("Enter " + " element: " + (index + 1));
			array[index] = getIntFromUser();
		}
		return array;
	}

	private static int getIntFromUser() {
		return Integer.parseInt(scanner.nextLine()); //parses a String argument and returns an base number
	}
}