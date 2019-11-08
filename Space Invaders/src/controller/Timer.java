/**
 * 
 */
package controller;

/**
 * @author gauthierbohyn
 *
 */
public class Timer {

	private boolean crash;
	private boolean victory;
	
	
	
	
	/**
	 * @param crash
	 * @param victory
	 */
	public Timer(boolean crash, boolean victory) {
		super();
		this.crash = crash;
		this.victory = victory;
	}
	/**
	 * @return the crash
	 */
	public boolean isCrash() {
		return crash;
	}
	/**
	 * @param crash the crash to set
	 */
	public void setCrash(boolean crash) {
		this.crash = crash;
	}
	/**
	 * @return the victory
	 */
	public boolean isVictory() {
		return victory;
	}
	/**
	 * @param victory the victory to set
	 */
	public void setVictory(boolean victory) {
		this.victory = victory;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
