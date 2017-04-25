package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Key class for Entity Bean: XrecipeTypeRelation
 */
public class XrecipeTypeRelationKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: xrecipeTypeId
	 */
	public java.lang.Integer xrecipeTypeId;

	/**
	 * Implementation field for persistent attribute: xrecipeId
	 */
	public java.lang.Long xrecipeId;

	/**
	 * Creates an empty key for Entity Bean: XrecipeTypeRelation
	 */
	public XrecipeTypeRelationKey() {
	}

	/**
	 * Creates a key for Entity Bean: XrecipeTypeRelation
	 */
	public XrecipeTypeRelationKey(
		java.lang.Integer xrecipeTypeId,
		java.lang.Long xrecipeId) {
		this.xrecipeTypeId = xrecipeTypeId;
		this.xrecipeId = xrecipeId;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationKey) {
			com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationKey o = (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationKey) otherKey;
			return ((this.xrecipeTypeId.equals(o.xrecipeTypeId)) && (this.xrecipeId
				.equals(o.xrecipeId)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (xrecipeTypeId.hashCode() + xrecipeId.hashCode());
	}
}
