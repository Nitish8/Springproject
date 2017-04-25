package com.nl.sligro.commerce.menucalculator.objects;

import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

/**
 * XrecipeGroupRecipeRelationAccessBean
 * @generated
 */
public class XrecipeGroupRecipeRelationAccessBean
	extends
		AbstractEntityAccessBean
	implements
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationAccessBeanData {

	/**
	 * @generated
	 */
	private XrecipeGroupRecipeRelation __ejbRef;

	/**
	 * @generated
	 */
	private Long initKey_xrecipeGroupId;

	/**
	 * @generated
	 */
	private Long initKey_xrecipeId;

	/**
	 * getXrecipeId
	 * @generated
	 */
	public java.lang.Long getXrecipeId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("xrecipeId")));
	}

	/**
	 * getSequence
	 * @generated
	 */
	public java.lang.Double getSequence()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Double) __getCache("sequence")));
	}

	/**
	 * setSequence
	 * @generated
	 */
	public void setSequence(java.lang.Double newValue) {
		__setCache("sequence", newValue);
	}

	/**
	 * getXrecipeGroupId
	 * @generated
	 */
	public java.lang.Long getXrecipeGroupId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("xrecipeGroupId")));
	}

	/**
	 * getLastUpdated
	 * @generated
	 */
	public java.sql.Timestamp getLastUpdated()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.sql.Timestamp) __getCache("lastUpdated")));
	}

	/**
	 * setLastUpdated
	 * @generated
	 */
	public void setLastUpdated(java.sql.Timestamp newValue) {
		__setCache("lastUpdated", newValue);
	}

	/**
	 * getField1
	 * @generated
	 */
	public java.lang.String getField1()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("field1")));
	}

	/**
	 * setField1
	 * @generated
	 */
	public void setField1(java.lang.String newValue) {
		__setCache("field1", newValue);
	}

	/**
	 * getField2
	 * @generated
	 */
	public java.lang.String getField2()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("field2")));
	}

	/**
	 * setField2
	 * @generated
	 */
	public void setField2(java.lang.String newValue) {
		__setCache("field2", newValue);
	}

	/**
	 * getField3
	 * @generated
	 */
	public java.lang.Double getField3()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Double) __getCache("field3")));
	}

	/**
	 * setField3
	 * @generated
	 */
	public void setField3(java.lang.Double newValue) {
		__setCache("field3", newValue);
	}

	/**
	 * getNumberOfPersons
	 * @generated
	 */
	public java.lang.Integer getNumberOfPersons()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Integer) __getCache("numberOfPersons")));
	}

	/**
	 * setNumberOfPersons
	 * @generated
	 */
	public void setNumberOfPersons(java.lang.Integer newValue) {
		__setCache("numberOfPersons", newValue);
	}

	/**
	 * setInitKey_xrecipeGroupId
	 * @generated
	 */
	public void setInitKey_xrecipeGroupId(Long newValue) {
		this.initKey_xrecipeGroupId = (newValue);
	}

	/**
	 * setInitKey_xrecipeId
	 * @generated
	 */
	public void setInitKey_xrecipeId(Long newValue) {
		this.initKey_xrecipeId = (newValue);
	}

	/**
	 * XrecipeGroupRecipeRelationAccessBean
	 * @generated
	 */
	public XrecipeGroupRecipeRelationAccessBean() {
		super();
	}

	/**
	 * XrecipeGroupRecipeRelationAccessBean
	 * @generated
	 */
	public XrecipeGroupRecipeRelationAccessBean(javax.ejb.EJBObject o)
		throws java.rmi.RemoteException {
		super(o);
	}

	/**
	 * defaultJNDIName
	 * @generated
	 */
	public String defaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeGroupRecipeRelationHome";
	}

	/**
	 * ejbHome
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationHome ejbHome()
		throws java.rmi.RemoteException,
		javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationHome) PortableRemoteObject
			.narrow(
				getHome(),
				com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationHome.class);
	}

	/**
	 * ejbRef
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelation ejbRef()
		throws java.rmi.RemoteException {
		if (ejbRef == null)
			return null;
		if (__ejbRef == null)
			__ejbRef = (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelation) PortableRemoteObject
				.narrow(
					ejbRef,
					com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelation.class);
	
		return __ejbRef;
	}

	/**
	 * instantiateEJB
	 * @generated
	 */
	protected void instantiateEJB()
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		if (ejbRef() != null)
			return;
	
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationKey key = keyFromFields(
			initKey_xrecipeGroupId,
			initKey_xrecipeId);
		ejbRef = ejbHome().findByPrimaryKey(key);
	}

	/**
	 * instantiateEJBByPrimaryKey
	 * @generated
	 */
	protected boolean instantiateEJBByPrimaryKey()
		throws javax.ejb.CreateException,
		java.rmi.RemoteException,
		javax.naming.NamingException {
		boolean result = false;
	
		if (ejbRef() != null)
			return true;
	
		try {
			com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationKey pKey = (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationKey) this
				.__getKey();
			if (pKey != null) {
				ejbRef = ejbHome().findByPrimaryKey(pKey);
				result = true;
			}
		} catch (javax.ejb.FinderException e) {
		}
		return result;
	}

	/**
	 * keyFromFields
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationKey keyFromFields(
		Long f0,
		Long f1) {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationKey keyClass = new com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationKey();
		keyClass.xrecipeGroupId = f0;
		keyClass.xrecipeId = f1;
		return keyClass;
	}

	/**
	 * refreshCopyHelper
	 * @generated
	 */
	public void refreshCopyHelper()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		refreshCopyHelper(ejbRef());
	}

	/**
	 * commitCopyHelper
	 * @generated
	 */
	public void commitCopyHelper()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		commitCopyHelper(ejbRef());
	}

	/**
	 * XrecipeGroupRecipeRelationAccessBean
	 * @generated
	 */
	public XrecipeGroupRecipeRelationAccessBean(
		java.lang.Long xrecipeGroupId,
		java.lang.Long xrecipeId) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(xrecipeGroupId, xrecipeId);
	}

	/**
	 * findByRecipeId
	 * @generated
	 */
	public java.util.Enumeration findByRecipeId(java.lang.Long xrecipeId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome.findByRecipeId(xrecipeId);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}

	/**
	 * XrecipeGroupRecipeRelationAccessBean
	 * @generated
	 */
	public XrecipeGroupRecipeRelationAccessBean(
		java.lang.Long xrecipeGroupId,
		java.lang.Long xrecipeId,
		java.lang.Double sequence,
		java.sql.Timestamp lastUpdated,
		java.lang.Integer numberOfPersons,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(
			xrecipeGroupId,
			xrecipeId,
			sequence,
			lastUpdated,
			numberOfPersons,
			field1,
			field2,
			field3);
	}

	/**
	 * findByRecipeGroupId
	 * @generated
	 */
	public java.util.Enumeration findByRecipeGroupId(
		java.lang.Long xrecipeGroupId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRecipeRelationHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome
			.findByRecipeGroupId(xrecipeGroupId);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}

	/**
	 * fulfills
	 * @generated
	 */
	public boolean fulfills(java.lang.Long arg0, java.lang.String arg1)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.lang.Exception,
		java.rmi.RemoteException {
		instantiateEJB();
		return ejbRef().fulfills(arg0, arg1);
	}

	/**
	 * getOwner
	 * @generated
	 */
	public java.lang.Long getOwner()
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.lang.Exception,
		java.rmi.RemoteException {
		instantiateEJB();
		return ejbRef().getOwner();
	}
}
