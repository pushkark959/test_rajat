package java_Project;

public class Practic {

	public static void main(String[] args) {
		
		String s = "Deepak Bharty";
		String word[]=s.split(" ");
		String reverse_string="";
		for(String w:word) {
			String reverse_word="";
			{
				for(int i=w.length()-1;i>=0;i--) {
					reverse_word=reverse_word+w.charAt(i);
				}
			}
			reverse_string=reverse_string+reverse_word+" ";
		}
		System.out.println("Reverse of String : "+reverse_string);

	}

}
