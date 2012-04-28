package gdts.common;

import java.io.Serializable;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

import gdts.common.exception.InvalidIPAddressException;

/**
 * Identyfikator sieciowy dla systemu GDTS. 
 * 
 * @author Maciej Milczarek
 */
public class GDTSNetId implements Serializable {

	private static final long serialVersionUID = -5343978237921605899L;

	private int[] ip = new int[4];
	private int port;

	private GDTSNetId() {
	};

	public int[] getIp() {
		return ip;
	}

	public void setIp(int[] ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public static GDTSNetId valueOf(String id) throws InvalidIPAddressException {
		String[] res = id.split(":");
		return GDTSNetId.valueOf(res[0], Integer.parseInt(res[1]));
	}

	public static GDTSNetId valueOf(String ip, int port)
			throws InvalidIPAddressException {
		try {
			String[] res = ip.split("\\.");

			if (res.length != 4) {
				throw new InvalidIPAddressException();
			}

			GDTSNetId netId = new GDTSNetId();
			int[] intIp = new int[4];

			for (int i = 0; i < 4; i++) {

				intIp[i] = Integer.parseInt(res[i]);
			}

			netId.setIp(intIp);
			netId.setPort(port);

			return netId;
		} catch (NumberFormatException exc) {
			throw new InvalidIPAddressException();
		}
	}
	
	public static GDTSNetId localNetId(int port) {
		try {
			return GDTSNetId.valueOf(InetAddress.getLocalHost().getHostAddress(), port);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (InvalidIPAddressException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public InetAddress getIPAsInetAddress() throws UnknownHostException {
		return Inet4Address.getByName(this.getIpAsString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(getIpAsString());
		builder.append(":");
		builder.append(port);

		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(ip);
		result = prime * result + port;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GDTSNetId other = (GDTSNetId) obj;
		if (!Arrays.equals(ip, other.ip))
			return false;
		if (port != other.port)
			return false;
		return true;
	}

	public String getIpAsString() {
		StringBuilder builder = new StringBuilder();

		builder.append(ip[0]);
		builder.append(".");
		builder.append(ip[1]);
		builder.append(".");
		builder.append(ip[2]);
		builder.append(".");
		builder.append(ip[3]);

		return builder.toString();
	}
}
