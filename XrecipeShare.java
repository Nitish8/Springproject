package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Remote interface for Enterprise Bean: XrecipeShare
 */
public interface XrecipeShare extends com.ibm.ivj.ejb.runtime.CopyHelper, javax.ejb.EJBObject, com.ibm.commerce.security.Protectable {


	/**
	 * @return
	 * @throws java.rmi.RemoteException
	 */
	public java.lang.Long getOrgentityIdOwner() throws java.rmi.RemoteException;

	/**
	 * @return
	 * @throws java.rmi.RemoteException
	 */
	public java.lang.Long getOrgentityIdSharedWith()
			throws java.rmi.RemoteException;
}
