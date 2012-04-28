package gdts.common.module;

import gdts.common.data.VarRole;
import gdts.common.data.type.Variable;

/**
 * Deskryptor parametru komendy. Określa jego identyfikator, rolę oraz typ.
 * 
 * @author Maciej Milczarek
 */
public class ParamDescr {

	private String id;
	private VarRole role;
	private Class<? extends Variable> type;

	/**
	 * @param id Identyfikator parametru.
	 */
	public ParamDescr(String id) {
		this(id, VarRole.INOUT);
	}
	
	/**
	 * @param id Identyfikator parametru.
	 * @param role Rola parametru.
	 */
	public ParamDescr(String id, VarRole role) {
		this(id, role, Variable.class);
	}
	
	/**
	 * @param id Identyfikator parametru.
	 * @param role Rola parametru.
	 * @param type Typ parametru.
	 */
	public ParamDescr(String id, VarRole role, Class<? extends Variable> type) {
		this.id = id;
		this.role = role;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public VarRole getRole() {
		return role;
	}
	public void setRole(VarRole role) {
		this.role = role;
	}
	public Class<? extends Variable> getType() {
		return type;
	}
	public void setType(Class<? extends Variable> type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ParamDescr other = (ParamDescr) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
