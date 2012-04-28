package gdts.common.data.type;

import gdts.common.GDTSNetId;

/**
 * Klasa zmiennych reprezentujących Wykonawcę.
 * 
 * @author Maciej Milczarek
 */
public class VSlave extends Variable {

	private static final long serialVersionUID = 419035038855131253L;

	private GDTSNetId netId;
	
	public VSlave() {}
	public VSlave(GDTSNetId netId) {
		this.netId = netId;
	}
	
	public GDTSNetId getNetId() {
		return netId;
	}

	public void setNetId(GDTSNetId netId) {
		this.netId = netId;
	}

	@Override
	public void setValue(Variable value) {
		this.netId = ((VSlave)value).getNetId();
	}


	@Override
	public Variable duplicate() {
		return new VSlave();
	}

	@Override 
	public String toString() {
		return "Slave";
	}
	/* (non-Javadoc)
	 * @see gdts.common.data.type.Variable#isNull()
	 */
	@Override
	public boolean isNull() {
		return netId == null;
	}	
}
