package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Key class for Entity Bean: XrecipeDescription
 */
public class XrecipeDescriptionKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: xrecipeId
	 */
	public java.lang.Long xrecipeId;

	/**
	 * Implementation field for persistent attribute: langId
	 */
	public java.lang.Integer langId;

	/**
	 * Creates an empty key for Entity Bean: XrecipeDescription
	 */
	public XrecipeDescriptionKey() {
	}

	/**
	 * Creates a key for Entity Bean: XrecipeDescription
	 */
	public XrecipeDescriptionKey(
		java.lang.Long xrecipeId,
		java.lang.Integer langId) {
		this.xrecipeId = xrecipeId;
		this.langId = langId;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionKey) {
			com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionKey o = (com.nl.sligro.commerce.menucalculator.objects.XrecipeDescriptionKey) otherKey;
			return ((this.xrecipeId.equals(o.xrecipeId)) && (this.langId
				.equals(o.langId)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (xrecipeId.hashCode() + langId.hashCode());
	}
}
