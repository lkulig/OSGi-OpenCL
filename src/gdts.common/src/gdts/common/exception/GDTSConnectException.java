package gdts.common.exception;

import gdts.common.GDTSNetId;

/**
 * Wyjątek określający problemy z połączeniem sieciowym.
 * 
 * @author Maciej Milczarek
 */
public class GDTSConnectException extends GDTSException {

	private static final long serialVersionUID = 3902558148184069274L;

	private GDTSNetId netId;	
	
	public GDTSConnectException(String msg) {
		super(msg);
	}

	public GDTSConnectException(GDTSNetId netId, String msg) {
		super(msg);
		this.netId = netId;
	}
	
	public GDTSConnectException(GDTSNetId netId) {
		super("Unable to connect to " + netId);
		this.netId = netId;
	}

	public GDTSNetId getNetId() {
		return netId;
	}
}
