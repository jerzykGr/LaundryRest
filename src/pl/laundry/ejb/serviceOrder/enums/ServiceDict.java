/**
 * 
 */
package pl.laundry.ejb.serviceOrder.enums;

/**
 * @author Administrator
 *
 */
public enum ServiceDict {

	LAUNDRY("LNDR"),

	DRY_CLEANING("DCLN");

	private final String code;

	private ServiceDict(String code) {
		this.code = code;
	}

	public static ServiceDict getByCode(String code) {
		for (ServiceDict e : values()) {
			if (e.code.equals(code))
				return e;
		}
		return null;
	}

	public String getCode() {
		return this.code;
	}
}
