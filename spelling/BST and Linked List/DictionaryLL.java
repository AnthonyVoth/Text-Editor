package spelling;

import java.util.LinkedList;

/**
 * A class that implements the Dictionary interface using a LinkedList
 *
 */
public class DictionaryLL implements Dictionary {

	
	private LinkedList<String> dict;
	
	
    // TODO: Add a constructor
	public DictionaryLL() {
		dict = new LinkedList<String>();
	}

    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	String lowerWord = word.toLowerCase();
    	
    	if (!dict.contains(lowerWord)) {
    		dict.add(lowerWord);
    		return true;
    	}
    	
        return false;
    }


    /** Return the number of words in the dictionary */
    public int size()    {
        return dict.size();
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
    	if (s.isEmpty()) {
    		return false;
    	}
    	
    	String lowerWord = s.toLowerCase();
    	
    	if (dict.contains(lowerWord)) {
    		return true;
    	}
        return false;
    }

    
}
