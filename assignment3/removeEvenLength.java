import java.util.ArrayList;

public class Assignment3 {

	public static void main(String[] args) {

		// create an arraylist of strings to test the method
		ArrayList<String> list = new ArrayList<>();

		// populate the arraylist
		list.add("sprint");
		list.add("shout");
		list.add("speak");
		list.add("run");
		list.add("eye");
		
		removeEvenLength(list);
		System.out.println(list);
		

	}

	public static void removeEvenLength(ArrayList<String> list) {

		for (int i = 0; i < list.size(); i++) {
			String word = list.get(i);
			if (word.length() % 2 == 0) {
				list.remove(i);
				i--;
			}
		}

	}

}
