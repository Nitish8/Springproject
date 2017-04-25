package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Key class for Entity Bean: XrecipeGroup
 */
public class XrecipeGroupKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: xrecipeGroupId
	 */
	public java.lang.Long xrecipeGroupId;

	/**
	 * Creates an empty key for Entity Bean: XrecipeGroup
	 */
	public XrecipeGroupKey() {
	}

	/**
	 * Creates a key for Entity Bean: XrecipeGroup
	 */
	public XrecipeGroupKey(java.lang.Long xrecipeGroupId) {
		this.xrecipeGroupId = xrecipeGroupId;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupKey) {
			com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupKey o = (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupKey) otherKey;
			return ((this.xrecipeGroupId.equals(o.xrecipeGroupId)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (xrecipeGroupId.hashCode());
	}
}
