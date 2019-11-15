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
	private boolean victoire;
	
	
	
	
	/**
	 * @param crash
	 * @param victoire
	 */
	public Timer(boolean crash, boolean victoire) {
		super();
		this.crash = crash;
		this.victoire = victoire;
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
	 * @return the victoire
	 */
	public boolean isVictoire() {
		return victoire;
	}
	/**
	 * @param victoire the victoire to set
	 */
	public void setVictoire(boolean victoire) {
		this.victoire = victoire;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
