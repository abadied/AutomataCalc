/**
 * 
 */
package AutoCalc.Interfaces;

import AutoCalc.calsses.State;

/**
 * @author eden
 * this interface should represent a basic model
 *  for automata functions
 *
 */
public interface BaseAutomata<T> {
	
	/**
	 * checks if a specific word is in the automata language
	 * @param word
	 * @return bool
	 */
	public boolean inLanguage(T word);
	
	/**
	 * add new state to the automata
	 * @param state
	 * @return bool
	 */
	public boolean addState(State state);
	
	/**
	 * delete a state from the automata
	 * @param state
	 * @return
	 */
	public boolean deleteState(State state);
	
	/**
	 * add an accept state to the automata
	 * @param state
	 * @return
	 */
	public boolean addAcceptState(State state);
	
	/**
	 * delete an accept state from the automata
	 * @param state
	 * @return
	 */
	public boolean deleteAcceptState(State state);
	
	
}
