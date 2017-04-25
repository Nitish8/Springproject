package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Bean implementation class for Enterprise Bean: Xingredient
 */
public class XingredientBean extends com.ibm.commerce.base.objects.ECEntityBean
	implements
		javax.ejb.EntityBean {

	/**
	 * Implementation field for persistent attribute: xingredientId
	 */
	public java.lang.Long xingredientId;

	/**
	 * Implementation field for persistent attribute: orgentityId
	 */
	public java.lang.Long orgentityId;

	/**
	 * Implementation field for persistent attribute: catentryId
	 */
	public java.lang.Long catentryId;

	/**
	 * Implementation field for persistent attribute: unitOfMeasure
	 */
	public java.lang.String unitOfMeasure;

	/**
	 * Implementation field for persistent attribute: field1
	 */
	public java.lang.String field1;

	/**
	 * Implementation field for persistent attribute: field2
	 */
	public java.lang.String field2;

	/**
	 * Implementation field for persistent attribute: field3
	 */
	public java.lang.Double field3;

	/**
	 * Implementation field for persistent attribute: optCounter
	 */
	public short optCounter;

	/**
	 * Implementation field for persistent attribute: listPrice
	 */
	public java.math.BigDecimal listPrice;

	/**
	 * Implementation field for persistent attribute: lastUpdated
	 */
	public java.sql.Timestamp lastUpdated;

	/**
	 * Implementation field for persistent attribute: identifer
	 */
	public java.lang.String identifer;

	/**
	 * ejbCreate method for a CMP entity bean.
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XingredientKey ejbCreate(
		java.lang.Long xingredientId) throws javax.ejb.CreateException {
		_initLinks();
		this.xingredientId = xingredientId;
		return null;
	}

	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Long xingredientId)
		throws javax.ejb.CreateException {
	}

	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		_initLinks();
	}

	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		super.ejbLoad();
		_initLinks();
	}

	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}

	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
		try {
			_removeLinks();
		} catch (java.rmi.RemoteException e) {
			throw new javax.ejb.RemoveException(e.getMessage());
		}
	}

	/**
	 * ejbStore
	 */
	public void ejbStore() {
		super.ejbStore();
	}

	/**
	 * This method was generated for supporting the associations.
	 */
	protected void _initLinks() {
	}

	/**
	 * This method was generated for supporting the associations.
	 */
	protected java.util.Vector _getLinks() {
		java.util.Vector links = new java.util.Vector();
		return links;
	}

	/**
	 * This method was generated for supporting the associations.
	 */
	protected void _removeLinks()
		throws java.rmi.RemoteException,
		javax.ejb.RemoveException {
		java.util.List links = _getLinks();
		for (int i = 0; i < links.size(); i++) {
			try {
				((com.ibm.ivj.ejb.associations.interfaces.Link) links.get(i))
					.remove();
			} catch (javax.ejb.FinderException e) {
			} //Consume Finder error since I am going away
		}
	}

	/**
	 * Get accessor for persistent attribute: orgentityId
	 */
	public java.lang.Long getOrgentityId() {
		return orgentityId;
	}

	/**
	 * Set accessor for persistent attribute: orgentityId
	 */
	public void setOrgentityId(java.lang.Long newOrgentityId) {
		orgentityId = newOrgentityId;
	}

	/**
	 * Get accessor for persistent attribute: catentryId
	 */
	public java.lang.Long getCatentryId() {
		return catentryId;
	}

	/**
	 * Set accessor for persistent attribute: catentryId
	 */
	public void setCatentryId(java.lang.Long newCatentryId) {
		catentryId = newCatentryId;
	}

	/**
	 * Get accessor for persistent attribute: unitOfMeasure
	 */
	public java.lang.String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	/**
	 * Set accessor for persistent attribute: unitOfMeasure
	 */
	public void setUnitOfMeasure(java.lang.String newUnitOfMeasure) {
		unitOfMeasure = newUnitOfMeasure;
	}

	/**
	 * Get accessor for persistent attribute: field1
	 */
	public java.lang.String getField1() {
		return field1;
	}

	/**
	 * Set accessor for persistent attribute: field1
	 */
	public void setField1(java.lang.String newField1) {
		field1 = newField1;
	}

	/**
	 * Get accessor for persistent attribute: field2
	 */
	public java.lang.String getField2() {
		return field2;
	}

	/**
	 * Set accessor for persistent attribute: field2
	 */
	public void setField2(java.lang.String newField2) {
		field2 = newField2;
	}

	/**
	 * Get accessor for persistent attribute: field3
	 */
	public java.lang.Double getField3() {
		return field3;
	}

	/**
	 * Set accessor for persistent attribute: field3
	 */
	public void setField3(java.lang.Double newField3) {
		field3 = newField3;
	}
	
	public java.lang.Long getXingredientId() {
		   return xingredientId;
	}
	
	public com.nl.sligro.commerce.menucalculator.objects.XingredientKey ejbCreate(
	   java.lang.Long xingredientId,java.lang.Long orgentityId,
	   java.lang.Long catentryId, java.lang.String identifer,
	   java.lang.String unitOfMeasure,  java.math.BigDecimal listPrice, 
	   java.sql.Timestamp lastUpdate, java.lang.String field1, 
	   java.lang.String field2, java.lang.Double field3)
	   throws javax.ejb.CreateException {
		  this.initializeFields();
	      _initLinks();
	      this.xingredientId=xingredientId;
	      this.orgentityId=orgentityId;
	      this.catentryId=catentryId;
	      this.identifer=identifer;
	      this.unitOfMeasure=unitOfMeasure;
	      this.listPrice=listPrice;
	      this.field1=field1;
	      this.field2=field2;
	      this.field3=field3;
	      XingredientKey myNewKey = new XingredientKey(xingredientId); 
		  this.initializeOptCounter(myNewKey);
	      return null;
	}
	
	public void ejbPostCreate(java.lang.Long xingredientId,java.lang.Long orgentityId,
		   java.lang.Long catentryId, java.lang.String identifier,
		   java.lang.String unitOfMeasure, java.math.BigDecimal listPrice, 
		   java.sql.Timestamp lastUpdate, java.lang.String field1, 
		   java.lang.String field2, java.lang.Double field3) 
		   throws javax.ejb.CreateException
	{
	}

	/**
	 * _copyFromEJB
	 */
	public java.util.Hashtable _copyFromEJB() {
		com.ibm.ivj.ejb.runtime.AccessBeanHashtable h = new com.ibm.ivj.ejb.runtime.AccessBeanHashtable();
	
		h.put("orgentityId", getOrgentityId());
		h.put("unitOfMeasure", getUnitOfMeasure());
		h.put("xingredientId", getXingredientId());
		h.put("field1", getField1());
		h.put("catentryId", getCatentryId());
		h.put("field2", getField2());
		h.put("field3", getField3());
		h.put("listPrice", getListPrice());
		h.put("lastUpdated", getLastUpdated());
		h.put("identifer", getIdentifer());
		h.put("__Key", getEntityContext().getPrimaryKey());
	
		return h;
	}

	/**
	 * _copyToEJB
	 */
	public void _copyToEJB(java.util.Hashtable h) {
		java.lang.Long localOrgentityId = (java.lang.Long) h.get("orgentityId");
		java.lang.String localUnitOfMeasure = (java.lang.String) h
			.get("unitOfMeasure");
		java.lang.String localField1 = (java.lang.String) h.get("field1");
		java.lang.Long localCatentryId = (java.lang.Long) h.get("catentryId");
		java.lang.String localField2 = (java.lang.String) h.get("field2");
		java.lang.Double localField3 = (java.lang.Double) h.get("field3");
		java.math.BigDecimal localListPrice = (java.math.BigDecimal) h
			.get("listPrice");
		java.sql.Timestamp localLastUpdated = (java.sql.Timestamp) h
			.get("lastUpdated");
		java.lang.String localIdentifer = (java.lang.String) h.get("identifer");
	
		if (h.containsKey("orgentityId"))
			setOrgentityId((localOrgentityId));
		if (h.containsKey("unitOfMeasure"))
			setUnitOfMeasure((localUnitOfMeasure));
		if (h.containsKey("field1"))
			setField1((localField1));
		if (h.containsKey("catentryId"))
			setCatentryId((localCatentryId));
		if (h.containsKey("field2"))
			setField2((localField2));
		if (h.containsKey("field3"))
			setField3((localField3));
		if (h.containsKey("listPrice"))
			setListPrice((localListPrice));
		if (h.containsKey("lastUpdated"))
			setLastUpdated((localLastUpdated));
		if (h.containsKey("identifer"))
			setIdentifer((localIdentifer));
	}

	/**
	 * Get accessor for persistent attribute: listPrice
	 */
	public java.math.BigDecimal getListPrice() {
		return listPrice;
	}

	/**
	 * Set accessor for persistent attribute: listPrice
	 */
	public void setListPrice(java.math.BigDecimal newListPrice) {
		listPrice = newListPrice;
	}

	/**
	 * Get accessor for persistent attribute: lastUpdated
	 */
	public java.sql.Timestamp getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * Set accessor for persistent attribute: lastUpdated
	 */
	public void setLastUpdated(java.sql.Timestamp newLastUpdated) {
		lastUpdated = newLastUpdated;
	}

	/**
	 * Get accessor for persistent attribute: identifer
	 */
	public java.lang.String getIdentifer() {
		return identifer;
	}

	/**
	 * Set accessor for persistent attribute: identifer
	 */
	public void setIdentifer(java.lang.String newIdentifer) {
		identifer = newIdentifer;
	}

}
