package com.nl.sligro.commerce.menucalculator.objects;

import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

/**
 * XrecipeGroupRelationAccessBean
 * @generated
 */
public class XrecipeGroupRelationAccessBean extends AbstractEntityAccessBean
	implements
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationAccessBeanData {

	/**
	 * @generated
	 */
	private XrecipeGroupRelation __ejbRef;

	/**
	 * @generated
	 */
	private Long initKey_xrecipeGroupIdParent;

	/**
	 * @generated
	 */
	private Long initKey_xrecipeGroupIdChild;

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
	 * getOrgentityId
	 * @generated
	 */
	public java.lang.Long getOrgentityId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("orgentityId")));
	}

	/**
	 * setOrgentityId
	 * @generated
	 */
	public void setOrgentityId(java.lang.Long newValue) {
		__setCache("orgentityId", newValue);
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
	 * getXrecipeGroupIdChild
	 * @generated
	 */
	public java.lang.Long getXrecipeGroupIdChild()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("xrecipeGroupIdChild")));
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
	 * getXrecipeGroupIdParent
	 * @generated
	 */
	public java.lang.Long getXrecipeGroupIdParent()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("xrecipeGroupIdParent")));
	}

	/**
	 * setInitKey_xrecipeGroupIdParent
	 * @generated
	 */
	public void setInitKey_xrecipeGroupIdParent(Long newValue) {
		this.initKey_xrecipeGroupIdParent = (newValue);
	}

	/**
	 * setInitKey_xrecipeGroupIdChild
	 * @generated
	 */
	public void setInitKey_xrecipeGroupIdChild(Long newValue) {
		this.initKey_xrecipeGroupIdChild = (newValue);
	}

	/**
	 * XrecipeGroupRelationAccessBean
	 * @generated
	 */
	public XrecipeGroupRelationAccessBean() {
		super();
	}

	/**
	 * XrecipeGroupRelationAccessBean
	 * @generated
	 */
	public XrecipeGroupRelationAccessBean(javax.ejb.EJBObject o)
		throws java.rmi.RemoteException {
		super(o);
	}

	/**
	 * defaultJNDIName
	 * @generated
	 */
	public String defaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XrecipeGroupRelationHome";
	}

	/**
	 * ejbHome
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationHome ejbHome()
		throws java.rmi.RemoteException,
		javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationHome) PortableRemoteObject
			.narrow(
				getHome(),
				com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationHome.class);
	}

	/**
	 * ejbRef
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelation ejbRef()
		throws java.rmi.RemoteException {
		if (ejbRef == null)
			return null;
		if (__ejbRef == null)
			__ejbRef = (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelation) PortableRemoteObject
				.narrow(
					ejbRef,
					com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelation.class);
	
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
	
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationKey key = keyFromFields(
			initKey_xrecipeGroupIdParent,
			initKey_xrecipeGroupIdChild);
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
			com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationKey pKey = (com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationKey) this
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
	private com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationKey keyFromFields(
		Long f0,
		Long f1) {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationKey keyClass = new com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationKey();
		keyClass.xrecipeGroupIdParent = f0;
		keyClass.xrecipeGroupIdChild = f1;
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
	 * findByChildRecipeGroupId
	 * @generated
	 */
	public java.util.Enumeration findByChildRecipeGroupId(
		java.lang.Long xrecipeGroupIdChild)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome
			.findByChildRecipeGroupId(xrecipeGroupIdChild);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}

	/**
	 * findByParentRecipeGroupId
	 * @generated
	 */
	public java.util.Enumeration findByParentRecipeGroupId(
		java.lang.Long xrecipeGroupIdParent)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XrecipeGroupRelationHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome
			.findByParentRecipeGroupId(xrecipeGroupIdParent);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}

	/**
	 * XrecipeGroupRelationAccessBean
	 * @generated
	 */
	public XrecipeGroupRelationAccessBean(
		java.lang.Long xrecipeGroupIdParent,
		java.lang.Long xrecipeGroupIdChild)
		throws javax.naming.NamingException, javax.ejb.CreateException,
		java.rmi.RemoteException {
		ejbRef = ejbHome().create(xrecipeGroupIdParent, xrecipeGroupIdChild);
	}

	/**
	 * XrecipeGroupRelationAccessBean
	 * @generated
	 */
	public XrecipeGroupRelationAccessBean(
		java.lang.Long xrecipeGroupIdParent,
		java.lang.Long xrecipeGroupIdChild,
		java.lang.Double sequence,
		java.sql.Timestamp lastUpdated,
		java.lang.Long orgentityId,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(
			xrecipeGroupIdParent,
			xrecipeGroupIdChild,
			sequence,
			lastUpdated,
			orgentityId,
			field1,
			field2,
			field3);
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
