package gdts.common.module;

import gdts.common.Version;

@Deprecated
public class ModuleDependency {
	
	private String id;
	private Version min;
	private Version max;
	private boolean includeMin;
	private boolean includeMax;
	
	public ModuleDependency(String id) {
		this(id, null, null);
	}

	public ModuleDependency(String id, Version min, Version max) {
		
		this(id, min, max, true, true);
	}
	
	public ModuleDependency(String id, Version min, Version max,
			boolean includeMin, boolean includeMax) {
		super();
		this.id = id;
		this.min = min;
		this.max = max;
		this.includeMin = includeMin;
		this.includeMax = includeMax;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Version getMin() {
		return min;
	}

	public void setMin(Version min) {
		this.min = min;
	}

	public Version getMax() {
		return max;
	}

	public void setMax(Version max) {
		this.max = max;
	}

	public boolean isIncludeMin() {
		return includeMin;
	}

	public void setIncludeMin(boolean includeMin) {
		this.includeMin = includeMin;
	}

	public boolean isIncludeMax() {
		return includeMax;
	}

	public void setIncludeMax(boolean includeMax) {
		this.includeMax = includeMax;
	}
	
	public boolean satisfied(ModuleDescr module) {
		if(module.getClass().getSimpleName().equals(id)) {
			
			boolean lowerSatisfied = true;
			boolean higherSatisfied = true;
			
			if(this.getMin() != null) {
				lowerSatisfied = inLowerBounds(module);
			}
			
			if(this.getMax() != null) {
				higherSatisfied = inHigherBounds(module);
			}
			
			return lowerSatisfied && higherSatisfied;
		}

		return false;
	}
	
	private boolean inLowerBounds(ModuleDescr module) {
		return module.getVersion().isGreaterThen(this.getMin())
			|| this.isIncludeMin() && module.getVersion().equals(this.getMin()); 
	}
	
	private boolean inHigherBounds(ModuleDescr module) {
		return module.getVersion().isLessThen(this.getMax())
			|| this.isIncludeMax() && module.getVersion().equals(this.getMax()); 		
	}
}
