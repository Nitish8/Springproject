package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Key class for Entity Bean: XrecipeGroupRelation
 */
public class XrecipeGroupRelationKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: xrecipeGroupIdParent
	 */
	public java.lang.Long xrecipeGroupIdParent;

	/**
	 * Implementation field for persistent attribute: xrecipeGroupIdChild
	 */
	public java.lang.Long xrecipeGroupIdChild;

	/**
	 * Creates an empty key for Entity Bean: XrecipeGroupRelation
	 */
	public XrecipeGroupRelationKey() {
	}

	/**
	 * Creates a key for Entity Bean: XrecipeGroupRelation
	 */
	public XrecipeGroupRelationKey(
		java.lang.Long xrecipeGroupIdParent,
		java.lang.Long xrecipeGroupIdChild) {
		this.xrecipeGroupIdParent = xrecipeGroupIdParent;
		this.xrecipeGroupIdChild = xrecipeGroupIdChild;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationKey) {
			com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationKey o = (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationKey) otherKey;
			return ((this.xrecipeGroupIdParent.equals(o.xrecipeGroupIdParent)) && (this.xrecipeGroupIdChild
				.equals(o.xrecipeGroupIdChild)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (xrecipeGroupIdParent.hashCode() + xrecipeGroupIdChild
			.hashCode());
	}
}
