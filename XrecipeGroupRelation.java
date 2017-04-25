package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Remote interface for Enterprise Bean: XrecipeGroupRelation
 */
public interface XrecipeGroupRelation extends com.ibm.ivj.ejb.runtime.CopyHelper, javax.ejb.EJBObject, com.ibm.commerce.security.Protectable {


	/**
	 * @return
	 * @throws java.rmi.RemoteException
	 */
	public java.lang.Long getXrecipeGroupIdParent()
			throws java.rmi.RemoteException;

	/**
	 * @return
	 * @throws java.rmi.RemoteException
	 */
	public java.lang.Long getXrecipeGroupIdChild()
			throws java.rmi.RemoteException;
}
