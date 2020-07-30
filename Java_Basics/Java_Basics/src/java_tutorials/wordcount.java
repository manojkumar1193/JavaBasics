package java_tutorials;

public class wordcount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s ="my name is said to be manoj.";
//		int count=0;
//		String[] words=s.split(" ");
//		for(String data : words) { // return words.length;
//			count++;	
//		}
//		System.out.println("Total no of words is:"+count);
//
//               OOOOORRRRRRRR
//
		int endOfLine=s.length()-1;
		boolean word=false;
		int wordcount=0;
		char[] chararr = s.toCharArray();
		int charrarraylength = chararr.length;
		for(int i=0;i<charrarraylength;i++) {
			if((Character.isLetter(chararr[i]) && i!=endOfLine)) {
				word = true;
			}
			else if((Character.isLetter(chararr[i]) && i==endOfLine))
				wordcount++;
			else if((!Character.isLetter(chararr[i])) && word) {
				wordcount++;
			    word = false;
			}
		}
		System.out.println("Total no of words is:"+wordcount);
//		
//
//		Following code is to print the first letter in uppercase
//		
		String newLine="";
		String newnLine=" ";
		String[] st= s.split(" ");
		for(String data : st) {
			newLine+= data.toUpperCase().substring(0, 1)+data.substring(1)+" ";
			//newnLine+= data.toUpperCase().substring(0);
		}
		System.out.println(newLine);
		System.out.println(newnLine);
//		
//		
//		Capitalize first letter of a word in a sentence 
//		
		char[] chr = s.toCharArray();
		boolean flt = false;
		String newwLine = " ";
		for(int i=0;i<chr.length;i++) 
		{
			if(!Character.isWhitespace(chr[i]) && flt) {
				newwLine+= chr[i];
			}
			if(!Character.isWhitespace(chr[i]) && !flt) {
				newwLine+= Character.toUpperCase(chr[i]);
				flt= true;
			}
			if(Character.isWhitespace(chr[i])){
				newwLine+= chr[i];
				flt= false;
			}
			
		}
		System.out.println(newwLine);
	}

}
