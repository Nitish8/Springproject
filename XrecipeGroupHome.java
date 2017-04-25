package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Home interface for Enterprise Bean: XrecipeGroup
 */
public interface XrecipeGroupHome extends javax.ejb.EJBHome {

	/**
	 * Creates an instance from a key for Entity Bean: XrecipeGroup
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroup create(
		java.lang.Long xrecipeGroupId)
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;

	/**
	 * Finds an instance using a key for Entity Bean: XrecipeGroup
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroup findByPrimaryKey(
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupKey primaryKey)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	public java.util.Enumeration findByOrgentityId(java.lang.Long orgentityId)
		throws javax.ejb.FinderException,
		java.rmi.RemoteException;

	/**
	 * @param xrecipeGroupId
	 * @param identifier
	 * @param createdBy
	 * @param markForDelete
	 * @param orgentityId
	 * @param isParentGroup
	 * @param field1
	 * @param field2
	 * @param field3
	 * @return
	 * @throws javax.ejb.CreateException
	 * @throws java.rmi.RemoteException
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeGroup create(
			java.lang.Long xrecipeGroupId, java.lang.String identifier,
			java.lang.Long createdBy, java.lang.Integer markForDelete,
			java.lang.Long orgentityId, java.lang.Integer isParentGroup,
			java.lang.String field1, java.lang.String field2,
			java.lang.Double field3) throws javax.ejb.CreateException,
			java.rmi.RemoteException;

	public java.util.Enumeration findParentRecipeGroupsByOrgId(java.lang.Long orgentityId) throws javax.ejb.FinderException, java.rmi.RemoteException;
}
