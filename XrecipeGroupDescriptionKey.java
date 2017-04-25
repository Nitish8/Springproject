package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Key class for Entity Bean: XrecipeGroupDescription
 */
public class XrecipeGroupDescriptionKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: xrecipeGroupId
	 */
	public java.lang.Long xrecipeGroupId;

	/**
	 * Implementation field for persistent attribute: langId
	 */
	public java.lang.Integer langId;

	/**
	 * Creates an empty key for Entity Bean: XrecipeGroupDescription
	 */
	public XrecipeGroupDescriptionKey() {
	}

	/**
	 * Creates a key for Entity Bean: XrecipeGroupDescription
	 */
	public XrecipeGroupDescriptionKey(
		java.lang.Long xrecipeGroupId,
		java.lang.Integer langId) {
		this.xrecipeGroupId = xrecipeGroupId;
		this.langId = langId;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionKey) {
			com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionKey o = (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupDescriptionKey) otherKey;
			return ((this.xrecipeGroupId.equals(o.xrecipeGroupId)) && (this.langId
				.equals(o.langId)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (xrecipeGroupId.hashCode() + langId.hashCode());
	}
}
