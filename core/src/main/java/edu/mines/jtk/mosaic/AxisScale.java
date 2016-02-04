package edu.mines.jtk.mosaic;
/**
 * Simple enum containing axis scaling options. 
 */
public enum AxisScale {
	LINEAR,
	LOG10;
	
	public boolean isLinear() {return (this==LINEAR)?true:false;}
	public boolean isLog() {return (this==LOG10)?true:false;}  // this could be extended to include LOG2
}
