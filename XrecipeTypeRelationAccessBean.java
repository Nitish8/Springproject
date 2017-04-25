package com.nl.sligro.commerce.menucalculator.objects;

import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

/**
 * XrecipeTypeRelationAccessBean
 * @generated
 */
public class XrecipeTypeRelationAccessBean extends AbstractEntityAccessBean
	implements
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationAccessBeanData {

	/**
	 * @generated
	 */
	private XrecipeTypeRelation __ejbRef;

	/**
	 * @generated
	 */
	private Integer initKey_xrecipeTypeId;

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
	 * getXrecipeTypeId
	 * @generated
	 */
	public java.lang.Integer getXrecipeTypeId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Integer) __getCache("xrecipeTypeId")));
	}

	/**
	 * setInitKey_xrecipeTypeId
	 * @generated
	 */
	public void setInitKey_xrecipeTypeId(Integer newValue) {
		this.initKey_xrecipeTypeId = (newValue);
	}

	/**
	 * setInitKey_xrecipeId
	 * @generated
	 */
	public void setInitKey_xrecipeId(Long newValue) {
		this.initKey_xrecipeId = (newValue);
	}

	/**
	 * XrecipeTypeRelationAccessBean
	 * @generated
	 */
	public XrecipeTypeRelationAccessBean() {
		super();
	}

	/**
	 * XrecipeTypeRelationAccessBean
	 * @generated
	 */
	public XrecipeTypeRelationAccessBean(javax.ejb.EJBObject o)
		throws java.rmi.RemoteException {
		super(o);
	}

	/**
	 * defaultJNDIName
	 * @generated
	 */
	public String defaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeTypeRelationHome";
	}

	/**
	 * ejbHome
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationHome ejbHome()
		throws java.rmi.RemoteException,
		javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationHome) PortableRemoteObject
			.narrow(
				getHome(),
				com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationHome.class);
	}

	/**
	 * ejbRef
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelation ejbRef()
		throws java.rmi.RemoteException {
		if (ejbRef == null)
			return null;
		if (__ejbRef == null)
			__ejbRef = (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelation) PortableRemoteObject
				.narrow(
					ejbRef,
					com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelation.class);
	
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
	
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationKey key = keyFromFields(
			initKey_xrecipeTypeId,
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
			com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationKey pKey = (com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationKey) this
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
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationKey keyFromFields(
		Integer f0,
		Long f1) {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationKey keyClass = new com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationKey();
		keyClass.xrecipeTypeId = f0;
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
	 * findByRecipeId
	 * @generated
	 */
	public java.util.Enumeration findByRecipeId(java.lang.Long xrecipeId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome.findByRecipeId(xrecipeId);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}

	/**
	 * XrecipeTypeRelationAccessBean
	 * @generated
	 */
	public XrecipeTypeRelationAccessBean(
		java.lang.Integer xrecipeTypeId,
		java.lang.Long xrecipeId,
		java.lang.Double sequence,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(
			xrecipeTypeId,
			xrecipeId,
			sequence,
			field1,
			field2,
			field3);
	}

	/**
	 * XrecipeTypeRelationAccessBean
	 * @generated
	 */
	public XrecipeTypeRelationAccessBean(
		java.lang.Integer xrecipeTypeId,
		java.lang.Long xrecipeId) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(xrecipeTypeId, xrecipeId);
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

	/**
	 * findByRecipeIdandTypeId
	 * @generated
	 */
	public java.util.Enumeration findByRecipeIdandTypeId(
		java.lang.Long recipeId,
		java.lang.Integer recipeType_id)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeTypeRelationHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome.findByRecipeIdandTypeId(
			recipeId,
			recipeType_id);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}
}
