package com.nl.sligro.commerce.menucalculator.objects;

import javax.rmi.*;
import com.ibm.ivj.ejb.runtime.*;

/**
 * XingredientDescAccessBean
 * @generated
 */
public class XingredientDescAccessBean extends AbstractEntityAccessBean
	implements
		com.nl.sligro.commerce.menucalculator.objects.XingredientDescAccessBeanData {

	/**
	 * @generated
	 */
	private XingredientDesc __ejbRef;

	/**
	 * @generated
	 */
	private Long initKey_xingredientId;

	/**
	 * @generated
	 */
	private Integer initKey_langId;

	/**
	 * getXingredientId
	 * @generated
	 */
	public java.lang.Long getXingredientId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Long) __getCache("xingredientId")));
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
	 * getLangId
	 * @generated
	 */
	public java.lang.Integer getLangId()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.Integer) __getCache("langId")));
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
	 * getName
	 * @generated
	 */
	public java.lang.String getName()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("name")));
	}

	/**
	 * setName
	 * @generated
	 */
	public void setName(java.lang.String newValue) {
		__setCache("name", newValue);
	}

	/**
	 * getDescription
	 * @generated
	 */
	public java.lang.String getDescription()
		throws java.rmi.RemoteException,
		javax.ejb.CreateException,
		javax.ejb.FinderException,
		javax.naming.NamingException {
		return (((java.lang.String) __getCache("description")));
	}

	/**
	 * setDescription
	 * @generated
	 */
	public void setDescription(java.lang.String newValue) {
		__setCache("description", newValue);
	}

	/**
	 * setInitKey_xingredientId
	 * @generated
	 */
	public void setInitKey_xingredientId(Long newValue) {
		this.initKey_xingredientId = (newValue);
	}

	/**
	 * setInitKey_langId
	 * @generated
	 */
	public void setInitKey_langId(Integer newValue) {
		this.initKey_langId = (newValue);
	}

	/**
	 * XingredientDescAccessBean
	 * @generated
	 */
	public XingredientDescAccessBean() {
		super();
	}

	/**
	 * XingredientDescAccessBean
	 * @generated
	 */
	public XingredientDescAccessBean(javax.ejb.EJBObject o)
		throws java.rmi.RemoteException {
		super(o);
	}

	/**
	 * defaultJNDIName
	 * @generated
	 */
	public String defaultJNDIName() {
		return "ejb/com/nl/sligro/commerce/menucalculator/objects/XingredientDescHome";
	}

	/**
	 * ejbHome
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XingredientDescHome ejbHome()
		throws java.rmi.RemoteException,
		javax.naming.NamingException {
		return (com.nl.sligro.commerce.menucalculator.objects.XingredientDescHome) PortableRemoteObject
			.narrow(
				getHome(),
				com.nl.sligro.commerce.menucalculator.objects.XingredientDescHome.class);
	}

	/**
	 * ejbRef
	 * @generated
	 */
	private com.nl.sligro.commerce.menucalculator.objects.XingredientDesc ejbRef()
		throws java.rmi.RemoteException {
		if (ejbRef == null)
			return null;
		if (__ejbRef == null)
			__ejbRef = (com.nl.sligro.commerce.menucalculator.objects.XingredientDesc) PortableRemoteObject
				.narrow(
					ejbRef,
					com.nl.sligro.commerce.menucalculator.objects.XingredientDesc.class);
	
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
	
		com.nl.sligro.commerce.menucalculator.objects.XingredientDescKey key = keyFromFields(
			initKey_xingredientId,
			initKey_langId);
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
			com.nl.sligro.commerce.menucalculator.objects.XingredientDescKey pKey = (com.nl.sligro.commerce.menucalculator.objects.XingredientDescKey) this
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
	private com.nl.sligro.commerce.menucalculator.objects.XingredientDescKey keyFromFields(
		Long f0,
		Integer f1) {
		com.nl.sligro.commerce.menucalculator.objects.XingredientDescKey keyClass = new com.nl.sligro.commerce.menucalculator.objects.XingredientDescKey();
		keyClass.xingredientId = f0;
		keyClass.langId = f1;
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
	 * XingredientDescAccessBean
	 * @generated
	 */
	public XingredientDescAccessBean(
		java.lang.Long xingredientId,
		java.lang.Integer langId,
		java.lang.String name,
		java.lang.String description,
		java.lang.String field1,
		java.lang.String field2,
		java.lang.Double field3) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(
			xingredientId,
			langId,
			name,
			description,
			field1,
			field2,
			field3);
	}

	/**
	 * XingredientDescAccessBean
	 * @generated
	 */
	public XingredientDescAccessBean(
		java.lang.Long xingredientId,
		java.lang.Integer langId) throws javax.naming.NamingException,
		javax.ejb.CreateException, java.rmi.RemoteException {
		ejbRef = ejbHome().create(xingredientId, langId);
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
	 * findByNameAndLanguage
	 * @generated
	 */
	public java.util.Enumeration findByNameAndLanguage(
		java.lang.String name,
		java.lang.Integer langId)
		throws javax.naming.NamingException,
		javax.ejb.FinderException,
		java.rmi.RemoteException {
		com.nl.sligro.commerce.menucalculator.objects.XingredientDescHome localHome = ejbHome();
		java.util.Enumeration ejbs = localHome.findByNameAndLanguage(
			name,
			langId);
		return (java.util.Enumeration) createAccessBeans(ejbs);
	}
}
