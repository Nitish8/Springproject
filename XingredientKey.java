package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Key class for Entity Bean: Xingredient
 */
public class XingredientKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: xingredientId
	 */
	public java.lang.Long xingredientId;

	/**
	 * Creates an empty key for Entity Bean: Xingredient
	 */
	public XingredientKey() {
	}

	/**
	 * Creates a key for Entity Bean: Xingredient
	 */
	public XingredientKey(java.lang.Long xingredientId) {
		this.xingredientId = xingredientId;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nl.sligro.commerce.menucalculator.objects.XingredientKey) {
			com.nl.sligro.commerce.menucalculator.objects.XingredientKey o = (com.nl.sligro.commerce.menucalculator.objects.XingredientKey) otherKey;
			return ((this.xingredientId.equals(o.xingredientId)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (xingredientId.hashCode());
	}
}
