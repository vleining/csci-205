import java.util.*;
import java.io.*;

public class Code {

	public static void main (String[] args)throws FileNotFoundException {
		Scanner scan = new Scanner(new File ("text.txt"));
		Index previousWord = new Index();
		while (scan.hasNext()){
			Index word = parse(scan,previousWord);
			System.out.println(word.toString());
		}
	}		



	public static Index parse(Scanner input, Index previousWord){
		Index word = previousWord;
		String data = input.next();	
		if (data.indexOf("@") >=0){
			word.setBook(input.nextLine());
			data = input.next();
		}
		int position = data.indexOf(":");
		if (position>= 0 && position<data.length()-1 && data.charAt(position+1)>='0' && data.charAt(position+1)<='9' ) {
			String chapter = data.substring(0,data.indexOf(":"));
			String verse = data.substring(data.indexOf(":")+1,data.length());
			word.setChapter(Integer.parseInt(chapter));
			word.setVerse(Integer.parseInt(verse));
			data = input.next();
		}
				data =data.toLowerCase();
		while (data.charAt(0)<'a' || data.charAt(0)>'z'){
			data = data.substring(1,data.length());
		}
		while (data.charAt(data.length()-1)<'a' || data.charAt(data.length()-1)>'z'){
			data = data.substring(0,data.length()-1);
		}
		word.setWord(data);
		return word;
	}
}	

