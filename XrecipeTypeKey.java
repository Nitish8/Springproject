package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Key class for Entity Bean: XrecipeType
 */
public class XrecipeTypeKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: xrecipeTypeId
	 */
	public java.lang.Long xrecipeTypeId;

	/**
	 * Creates an empty key for Entity Bean: XrecipeType
	 */
	public XrecipeTypeKey() {
	}

	/**
	 * Creates a key for Entity Bean: XrecipeType
	 */
	public XrecipeTypeKey(java.lang.Long xrecipeTypeId) {
		this.xrecipeTypeId = xrecipeTypeId;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeKey) {
			com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeKey o = (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeKey) otherKey;
			return ((this.xrecipeTypeId.equals(o.xrecipeTypeId)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (xrecipeTypeId.hashCode());
	}
}
