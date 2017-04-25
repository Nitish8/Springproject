package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Key class for Entity Bean: XrecipeTypeDescription
 */
public class XrecipeTypeDescriptionKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: xrecipeTypeId
	 */
	public java.lang.Integer xrecipeTypeId;

	/**
	 * Implementation field for persistent attribute: langId
	 */
	public java.lang.Integer langId;

	/**
	 * Creates an empty key for Entity Bean: XrecipeTypeDescription
	 */
	public XrecipeTypeDescriptionKey() {
	}

	/**
	 * Creates a key for Entity Bean: XrecipeTypeDescription
	 */
	public XrecipeTypeDescriptionKey(
		java.lang.Integer xrecipeTypeId,
		java.lang.Integer langId) {
		this.xrecipeTypeId = xrecipeTypeId;
		this.langId = langId;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescriptionKey) {
			com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescriptionKey o = (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeDescriptionKey) otherKey;
			return ((this.xrecipeTypeId.equals(o.xrecipeTypeId)) && (this.langId
				.equals(o.langId)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (xrecipeTypeId.hashCode() + langId.hashCode());
	}
}
