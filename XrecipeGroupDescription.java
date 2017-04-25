package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Remote interface for Enterprise Bean: XrecipeGroupDescription
 */
public interface XrecipeGroupDescription extends com.ibm.ivj.ejb.runtime.CopyHelper, javax.ejb.EJBObject, com.ibm.commerce.security.Protectable {


	/**
	 * @return
	 * @throws java.rmi.RemoteException
	 */
	public java.lang.Long getXrecipeGroupId() throws java.rmi.RemoteException;

	/**
	 * @return
	 * @throws java.rmi.RemoteException
	 */
	public java.lang.Integer getLangId() throws java.rmi.RemoteException;
}
