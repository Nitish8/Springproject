package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Key class for Entity Bean: XrecipeGroupRecipeRelation
 */
public class XrecipeGroupRecipeRelationKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: xrecipeGroupId
	 */
	public java.lang.Long xrecipeGroupId;

	/**
	 * Implementation field for persistent attribute: xrecipeId
	 */
	public java.lang.Long xrecipeId;

	/**
	 * Creates an empty key for Entity Bean: XrecipeGroupRecipeRelation
	 */
	public XrecipeGroupRecipeRelationKey() {
	}

	/**
	 * Creates a key for Entity Bean: XrecipeGroupRecipeRelation
	 */
	public XrecipeGroupRecipeRelationKey(
		java.lang.Long xrecipeGroupId,
		java.lang.Long xrecipeId) {
		this.xrecipeGroupId = xrecipeGroupId;
		this.xrecipeId = xrecipeId;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationKey) {
			com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationKey o = (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationKey) otherKey;
			return ((this.xrecipeGroupId.equals(o.xrecipeGroupId)) && (this.xrecipeId
				.equals(o.xrecipeId)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (xrecipeGroupId.hashCode() + xrecipeId.hashCode());
	}
}
