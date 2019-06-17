package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		while (!isSorted(arr))
		{
			for (int i = 1; i < arr.length; i++)
			{
				if (arr[i-1] > arr[i])
				{
					int temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
					display.updateDisplay();
				}
			}
		}
	}

	public static boolean isSorted(int[] arr)
	{
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i-1] > arr[i]) return false;
		}
		return true;
	}
	
}
