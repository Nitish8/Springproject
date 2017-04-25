package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Home interface for Enterprise Bean: XrecipeItems
 */
public interface XrecipeItemsHome extends javax.ejb.EJBHome {

	/**
	 * Creates an instance from a key for Entity Bean: XrecipeItems
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeItems create(
		java.lang.Long xrecipeitemId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;

	/**
	 * Finds an instance using a key for Entity Bean: XrecipeItems
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeItems findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	/**
	 * @param xrecipeitemId
	 * @param xrecipeId
	 * @param storeentId
	 * @param orgentityId
	 * @param lastUpdated
	 * @param xingredientId
	 * @param requiredQuantity
	 * @param sequence
	 * @param price
	 * @param field1
	 * @param field2
	 * @param field3
	 * @return
	 * @throws javax.ejb.CreateException
	 * @throws java.rmi.RemoteException
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeItems create(
			java.lang.Long xrecipeitemId, java.lang.Long xrecipeId,
			java.lang.Integer storeentId, java.lang.Long orgentityId,
			java.sql.Timestamp lastUpdated, java.lang.Long xingredientId,
			java.math.BigDecimal requiredQuantity, java.lang.Double sequence,
			java.math.BigDecimal price, java.lang.String field1,
			java.lang.String field2, java.lang.Double field3)
			throws javax.ejb.CreateException, java.rmi.RemoteException;

	public java.util.Enumeration findByRecipeId(java.lang.Long xrecipeId) throws javax.ejb.FinderException, java.rmi.RemoteException;

	public java.util.Enumeration findByIngredientId(java.lang.Long xingredientId) throws javax.ejb.FinderException, java.rmi.RemoteException;

	public java.util.Enumeration findByOrgentityId(java.lang.Long orgentityId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;
}
