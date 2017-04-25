package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Key class for Entity Bean: XrecipeItems
 */
public class XrecipeItemsKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: xrecipeitemId
	 */
	public java.lang.Long xrecipeitemId;

	/**
	 * Creates an empty key for Entity Bean: XrecipeItems
	 */
	public XrecipeItemsKey() {
	}

	/**
	 * Creates a key for Entity Bean: XrecipeItems
	 */
	public XrecipeItemsKey(java.lang.Long xrecipeitemId) {
		this.xrecipeitemId = xrecipeitemId;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsKey) {
			com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsKey o = (com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsKey) otherKey;
			return ((this.xrecipeitemId.equals(o.xrecipeitemId)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (xrecipeitemId.hashCode());
	}
}
