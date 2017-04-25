package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Key class for Entity Bean: XrecipeShare
 */
public class XrecipeShareKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: xrecipeId
	 */
	public java.lang.Long xrecipeId;

	/**
	 * Implementation field for persistent attribute: orgentityIdOwner
	 */
	public java.lang.Long orgentityIdOwner;

	/**
	 * Implementation field for persistent attribute: orgentityIdSharedWith
	 */
	public java.lang.Long orgentityIdSharedWith;

	/**
	 * Creates an empty key for Entity Bean: XrecipeShare
	 */
	public XrecipeShareKey() {
	}

	/**
	 * Creates a key for Entity Bean: XrecipeShare
	 */
	public XrecipeShareKey(
		java.lang.Long xrecipeId,
		java.lang.Long orgentityIdOwner,
		java.lang.Long orgentityIdSharedWith) {
		this.xrecipeId = xrecipeId;
		this.orgentityIdOwner = orgentityIdOwner;
		this.orgentityIdSharedWith = orgentityIdSharedWith;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof com.nl.sligro.commerce.menucalculator.objects.XrecipeShareKey) {
			com.nl.sligro.commerce.menucalculator.objects.XrecipeShareKey o = (com.nl.sligro.commerce.menucalculator.objects.XrecipeShareKey) otherKey;
			return ((this.xrecipeId.equals(o.xrecipeId))
				&& (this.orgentityIdOwner.equals(o.orgentityIdOwner)) && (this.orgentityIdSharedWith
				.equals(o.orgentityIdSharedWith)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (xrecipeId.hashCode() + orgentityIdOwner.hashCode() + orgentityIdSharedWith
			.hashCode());
	}
}
