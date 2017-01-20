/**
 * 
 */
package pl.laundry.ejb.serviceOrder.enums;

/**
 * @author Administrator
 *
 */
public enum ServiceKind {

	LAUNDRY("LAUNDRY"),

	DRY_CLEANING("DRY");

	private final String code;

	private ServiceKind(String code) {
		this.code = code;
	}

	public static ServiceKind getByCode(String code) {
		for (ServiceKind e : values()) {
			if (e.code.equals(code))
				return e;
		}
		return null;
	}

	public String getCode() {
		return this.code;
	}
}
