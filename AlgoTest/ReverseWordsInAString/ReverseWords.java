/**
 * 
 */
package ReverseWordsInAString;

/**
 * @author lams
 *
 */
public class ReverseWords {

	/**
	 * 
	 */
	public ReverseWords() {
		// TODO Auto-generated constructor stub
	}
	
	public String Solution (String s) {
		String result = "";
		
		
        String[] splitWords = s.split(" ");
        
        if (splitWords.length >0 ){
	        for (int i =splitWords.length-1;i >=0; i--  ){
	        	String trimWord = splitWords[i].trim();
	        	if (trimWord.length()>0 ){
	        		
	        		result += splitWords[i].trim()+" ";
	        	}
	        }
        }else{
        	return s.trim();
        }
        System.out.println("ReverseWords Solution :" + result);
        return result;
    }
}
