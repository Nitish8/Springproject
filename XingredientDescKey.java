package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Key class for Entity Bean: XingredientDesc
 */
public class XingredientDescKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: xingredientId
	 */
	public java.lang.Long xingredientId;

	/**
	 * Implementation field for persistent attribute: langId
	 */
	public java.lang.Integer langId;

	/**
	 * Creates an empty key for Entity Bean: XingredientDesc
	 */
	public XingredientDescKey() {
	}

	/**
	 * Creates a key for Entity Bean: XingredientDesc
	 */
	public XingredientDescKey(
		java.lang.Long xingredientId,
		java.lang.Integer langId) {
		this.xingredientId = xingredientId;
		this.langId = langId;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nl.sligro.commerce.menucalculator.objects.XingredientDescKey) {
			com.nl.sligro.commerce.menucalculator.objects.XingredientDescKey o = (com.nl.sligro.commerce.menucalculator.objects.XingredientDescKey) otherKey;
			return ((this.xingredientId.equals(o.xingredientId)) && (this.langId
				.equals(o.langId)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (xingredientId.hashCode() + langId.hashCode());
	}
}
