package Puzzling;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Puzzling {
	Random r = new Random();
	public void createArray(){
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		Integer[] arr = {3,5,1,2,7,9,8,13,25,32};
		Integer temp = 0;
		for (Integer i=0; i<arr.length; i++) {
			temp = temp + arr[i];
			if(arr[i] > 10) {
				newArr.add(arr[i]);
			}
		}
		System.out.println(temp);
		System.out.println(newArr);
	}
	public void nameArray(String name, String name2, String name3, String name4, String name5) {
		ArrayList<String> newArr = new ArrayList<String>();
		ArrayList<String> arr = new ArrayList<String>();
		newArr.add(name);
		newArr.add(name2);
		newArr.add(name3);
		newArr.add(name4);
		newArr.add(name5);
		Collections.shuffle(newArr);
		System.out.println(newArr);
		for (Integer i=0; i<newArr.size();i++) {
			if(newArr.get(i).length() > 6) {
			arr.add(newArr.get(i));
			}
		}
		System.out.println(arr);
	}

	public void alphabet(ArrayList<String> alphArr) {
		Collections.shuffle(alphArr);
		System.out.println(alphArr);
		System.out.println(alphArr.get(0));
		System.out.println(alphArr.get(alphArr.size()-1));
		
	}
	public void randomArr(ArrayList<Integer> randomArray) {
		System.out.println("Random Array");
		System.out.println(randomArray);
	}
	public void randomNumberSort(ArrayList<Integer> randomSort){
		Integer min = randomSort.get(0);
		Integer max = randomSort.get(0);
		for(Integer i=0; i<randomSort.size();i++) {
			if(randomSort.get(i) < min) {
				min = randomSort.get(i);
			}
			if(randomSort.get(i) > max) {
				max = randomSort.get(i);
			}
		}
		System.out.println(randomSort);
		System.out.println(min);
		System.out.println(max);
	}
	public void createRandomString() {
		Random r = new Random();
		String temp = "";
		String aBC = "abcdefghijklmnopqrstuvwxyz";
		for(Integer i=0; i<5; i++) {
			temp += aBC.charAt(r.nextInt(26));
		}
		System.out.println(temp);
	}
	public void createRandomStringAndArray() {
		ArrayList<String> newArr = new ArrayList<String>();
		Random r = new Random();
		String aBC = "abcdefghijklmnopqrstuvwxyz";
		for (int j=0; j<10; j++) {
			String temp = "";
			for (Integer i=0; i<5; i++) {
				temp += aBC.charAt(r.nextInt(26));
			}	
			newArr.add(temp);
		}
		System.out.println(newArr);
	}

}
