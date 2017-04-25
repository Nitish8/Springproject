package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Remote interface for Enterprise Bean: XrecipeTypeRelation
 */
public interface XrecipeTypeRelation extends com.ibm.ivj.ejb.runtime.CopyHelper, javax.ejb.EJBObject, com.ibm.commerce.security.Protectable {


	/**
	 * @return
	 * @throws java.rmi.RemoteException
	 */
	public java.lang.Integer getXrecipeTypeId() throws java.rmi.RemoteException;

	/**
	 * @return
	 * @throws java.rmi.RemoteException
	 */
	public java.lang.Long getXrecipeId() throws java.rmi.RemoteException;
}
