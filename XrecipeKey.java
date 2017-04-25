package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Key class for Entity Bean: Xrecipe
 */
public class XrecipeKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: xrecipeId
	 */
	public java.lang.Long xrecipeId;

	/**
	 * Creates an empty key for Entity Bean: Xrecipe
	 */
	public XrecipeKey() {
	}

	/**
	 * Creates a key for Entity Bean: Xrecipe
	 */
	public XrecipeKey(java.lang.Long xrecipeId) {
		this.xrecipeId = xrecipeId;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nl.sligro.commerce.menucalculator.objects.XrecipeKey) {
			com.nl.sligro.commerce.menucalculator.objects.XrecipeKey o = (com.nl.sligro.commerce.menucalculator.objects.XrecipeKey) otherKey;
			return ((this.xrecipeId.equals(o.xrecipeId)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (xrecipeId.hashCode());
	}
}
