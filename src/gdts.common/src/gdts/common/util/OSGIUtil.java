package gdts.common.util;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;

/**
 * Klasa zawierająca kilka metod narzędziowych, charakterystycznych dla środowiska OSGi.
 * 
 * @author Maciej Milczarek
 */
public final class OSGIUtil {
	
	BundleContext bundleContext;
	
	private OSGIUtil(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}
	
	public static OSGIUtil getInstance(BundleContext bundleContext) {
		return new OSGIUtil(bundleContext);
	}
	
	public static OSGIUtil getInstance(ComponentContext componentContext) {
		return getInstance(componentContext.getBundleContext());
	}
	
	public boolean bundleExists(String symbolicName) {
		for(Bundle bundle : bundleContext.getBundles()) {
			if(bundle.getSymbolicName().equals(symbolicName)) {
				return true;
			}
		}
		
		return false;
	}
}
