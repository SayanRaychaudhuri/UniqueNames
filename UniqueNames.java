import java.util.ArrayList;

import java.util.Scanner;
public class UniqueNames {
	public static void main(String arg[]) {
		ArrayList<String> in = new ArrayList<String>();
		Scanner reader = new Scanner(System.in);
		
		for (int p=0;p<100;p++) {
		System.out.print("Enter name: ");
		String input = reader.nextLine();
		in.add(input);
			if (input.equals("")) {
				break;
				}
		}
		
		reader.close();
		
		deleteDuplicates(in);
		System.out.print("Unique name list contains: ");
		
		for (int q=0;q<in.size();q++) {
			System.out.print(in.get(q)+" ");
		}
	}
	
	public static void deleteDuplicates(ArrayList<String> in){
	    for (int l = 0; l < in.size()-1; l++) {
				        for (int m = l+1; m < in.size(); m++) {
				             if (in.get(l).equals(in.get(m))) {
	                             in.set(l,"");
				             }
				        }
				    }
	    in.removeIf(s -> s.equals(""));
	}


}