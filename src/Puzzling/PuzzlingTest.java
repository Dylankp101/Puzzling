package Puzzling;
import java.util.Random;
import java.util.ArrayList;

public class PuzzlingTest {
	public static void main(String[] args) {
		
		Puzzling iD = new Puzzling();
		Random r = new Random();
		ArrayList<String> alphArr = new ArrayList<String>();
		alphArr.add("a");
		alphArr.add("b");
		alphArr.add("c");
		alphArr.add("d");
		alphArr.add("e");
		alphArr.add("f");
		alphArr.add("g");
		alphArr.add("h");
		alphArr.add("i");
		alphArr.add("j");
		alphArr.add("k");
		alphArr.add("l");
		alphArr.add("m");
		alphArr.add("n");
		alphArr.add("o");
		alphArr.add("p");
		alphArr.add("q");
		alphArr.add("r");
		alphArr.add("s");
		alphArr.add("t");
		alphArr.add("u");
		alphArr.add("v");
		alphArr.add("w");
		alphArr.add("x");
		alphArr.add("y");
		alphArr.add("z");
		
		ArrayList<Integer> randomArray = new ArrayList<Integer>();
		randomArray.add(r.nextInt(100-50)+50);
		randomArray.add(r.nextInt(100-50)+50);
		randomArray.add(r.nextInt(100-50)+50);
		randomArray.add(r.nextInt(100-50)+50);
		randomArray.add(r.nextInt(100-50)+50);
		randomArray.add(r.nextInt(100-50)+50);
		randomArray.add(r.nextInt(100-50)+50);
		randomArray.add(r.nextInt(100-50)+50);
		randomArray.add(r.nextInt(100-50)+50);
		randomArray.add(r.nextInt(100-50)+50);

		ArrayList<Integer> randomSort = new ArrayList<Integer>();
		randomSort.add(r.nextInt(100-50)+50);
		randomSort.add(r.nextInt(100-50)+50);
		randomSort.add(r.nextInt(100-50)+50);
		randomSort.add(r.nextInt(100-50)+50);
		randomSort.add(r.nextInt(100-50)+50);
		randomSort.add(r.nextInt(100-50)+50);
		randomSort.add(r.nextInt(100-50)+50);
		randomSort.add(r.nextInt(100-50)+50);
		randomSort.add(r.nextInt(100-50)+50);
		randomSort.add(r.nextInt(100-50)+50);



		
		iD.createArray();
		iD.nameArray("Dylan","Jinichi" ,"Fujibayashi" ,"Momochi" ,"Ishikawa");
		iD.alphabet(alphArr);
		iD.randomArr(randomArray);
		iD.randomNumberSort(randomSort);
		
		
		iD.createRandomString();
		iD.createRandomStringAndArray();


	}
}
