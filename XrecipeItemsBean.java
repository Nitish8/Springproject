package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Bean implementation class for Enterprise Bean: XrecipeItems
 */
public class XrecipeItemsBean
	extends
		com.ibm.commerce.base.objects.ECEntityBean
	implements
		javax.ejb.EntityBean {

	/**
	 * Implementation field for persistent attribute: xrecipeitemId
	 */
	public java.lang.Long xrecipeitemId;

	/**
	 * Implementation field for persistent attribute: xrecipeId
	 */
	public java.lang.Long xrecipeId;

	/**
	 * Implementation field for persistent attribute: storeentId
	 */
	public java.lang.Integer storeentId;

	/**
	 * Implementation field for persistent attribute: orgentityId
	 */
	public java.lang.Long orgentityId;

	/**
	 * Implementation field for persistent attribute: lastUpdated
	 */
	public java.sql.Timestamp lastUpdated;

	/**
	 * Implementation field for persistent attribute: xingredientId
	 */
	public java.lang.Long xingredientId;

	/**
	 * Implementation field for persistent attribute: requiredQuantity
	 */
	public java.math.BigDecimal requiredQuantity;

	/**
	 * Implementation field for persistent attribute: sequence
	 */
	public java.lang.Double sequence;

	/**
	 * Implementation field for persistent attribute: price
	 */
	public java.math.BigDecimal price;

	/**
	 * Implementation field for persistent attribute: field1
	 */
	public java.lang.String field1;

	/**
	 * Implementation field for persistent attribute: field2
	 */
	public java.lang.String field2;

	/**
	 * Implementation field for persistent attribute: optCounter
	 */
	public short optCounter;

	/**
	 * Implementation field for persistent attribute: field3
	 */
	public java.lang.Double field3;

	/**
	 * ejbCreate method for a CMP entity bean.
	 */
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsKey ejbCreate(
		java.lang.Long xrecipeitemId) throws javax.ejb.CreateException {
		_initLinks();
		this.xrecipeitemId = xrecipeitemId;
		return null;
	}

	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Long xrecipeitemId)
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
	 * Get accessor for persistent attribute: xrecipeId
	 */
	public java.lang.Long getXrecipeId() {
		return xrecipeId;
	}

	/**
	 * Set accessor for persistent attribute: xrecipeId
	 */
	public void setXrecipeId(java.lang.Long newXrecipeId) {
		xrecipeId = newXrecipeId;
	}

	/**
	 * Get accessor for persistent attribute: storeentId
	 */
	public java.lang.Integer getStoreentId() {
		return storeentId;
	}

	/**
	 * Set accessor for persistent attribute: storeentId
	 */
	public void setStoreentId(java.lang.Integer newStoreentId) {
		storeentId = newStoreentId;
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
	 * Get accessor for persistent attribute: xingredientId
	 */
	public java.lang.Long getXingredientId() {
		return xingredientId;
	}

	/**
	 * Set accessor for persistent attribute: xingredientId
	 */
	public void setXingredientId(java.lang.Long newXingredientId) {
		xingredientId = newXingredientId;
	}

	/**
	 * Get accessor for persistent attribute: requiredQuantity
	 */
	public java.math.BigDecimal getRequiredQuantity() {
		return requiredQuantity;
	}

	/**
	 * Set accessor for persistent attribute: requiredQuantity
	 */
	public void setRequiredQuantity(java.math.BigDecimal newRequiredQuantity) {
		requiredQuantity = newRequiredQuantity;
	}

	/**
	 * Get accessor for persistent attribute: sequence
	 */
	public java.lang.Double getSequence() {
		return sequence;
	}

	/**
	 * Set accessor for persistent attribute: sequence
	 */
	public void setSequence(java.lang.Double newSequence) {
		sequence = newSequence;
	}

	/**
	 * Get accessor for persistent attribute: price
	 */
	public java.math.BigDecimal getPrice() {
		return price;
	}

	/**
	 * Set accessor for persistent attribute: price
	 */
	public void setPrice(java.math.BigDecimal newPrice) {
		price = newPrice;
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

	public java.lang.Long getXrecipeItemId() {
	   return xrecipeitemId;
	}
	
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeItemsKey ejbCreate(
	   java.lang.Long xrecipeitemId, java.lang.Long xrecipeId,
	   java.lang.Integer storeentId, java.lang.Long orgentityId,
	   java.sql.Timestamp lastUpdated, java.lang.Long xingredientId,
	   java.math.BigDecimal requiredQuantity, java.lang.Double sequence,
	   java.math.BigDecimal price,java.lang.String field1,
	   java.lang.String field2,java.lang.Double field3	)
	   throws javax.ejb.CreateException {
		 this.initializeFields();
	      _initLinks();
	      this.xrecipeitemId=xrecipeitemId;
	      this.xrecipeId=xrecipeId;
	      this.storeentId=storeentId;
	      this.orgentityId=orgentityId;
	      this.lastUpdated=lastUpdated;
	      this.xingredientId=xingredientId;
	      this.requiredQuantity=requiredQuantity;
	      this.sequence=sequence;
	      this.price=price;
	      this.field1=field1;
	      this.field2=field2;
	      this.field3=field3;
	      XrecipeItemsKey myNewKey = new XrecipeItemsKey(xrecipeitemId); 
	      this.initializeOptCounter(myNewKey);
	      return null;
	}

	public void ejbPostCreate(java.lang.Long xrecipeitemId, java.lang.Long xrecipeId,
			   java.lang.Integer storeentId, java.lang.Long orgentityId,
			   java.sql.Timestamp lastUpdated, java.lang.Long xingredientId,
			   java.math.BigDecimal requiredQuantity, java.lang.Double sequence,
			   java.math.BigDecimal price,java.lang.String field1,
			   java.lang.String field2,java.lang.Double field3) 
	   throws javax.ejb.CreateException
   {
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

	/**
	 * _copyFromEJB
	 */
	public java.util.Hashtable _copyFromEJB() {
		com.ibm.ivj.ejb.runtime.AccessBeanHashtable h = new com.ibm.ivj.ejb.runtime.AccessBeanHashtable();
	
		h.put("sequence", getSequence());
		h.put("xrecipeId", getXrecipeId());
		h.put("orgentityId", getOrgentityId());
		h.put("xrecipeItemId", getXrecipeItemId());
		h.put("xingredientId", getXingredientId());
		h.put("lastUpdated", getLastUpdated());
		h.put("storeentId", getStoreentId());
		h.put("field1", getField1());
		h.put("field2", getField2());
		h.put("field3", getField3());
		h.put("price", getPrice());
		h.put("requiredQuantity", getRequiredQuantity());
		h.put("__Key", getEntityContext().getPrimaryKey());
	
		return h;
	}

	/**
	 * _copyToEJB
	 */
	public void _copyToEJB(java.util.Hashtable h) {
		java.lang.Double localSequence = (java.lang.Double) h.get("sequence");
		java.lang.Long localXrecipeId = (java.lang.Long) h.get("xrecipeId");
		java.lang.Long localOrgentityId = (java.lang.Long) h.get("orgentityId");
		java.lang.Long localXingredientId = (java.lang.Long) h
			.get("xingredientId");
		java.sql.Timestamp localLastUpdated = (java.sql.Timestamp) h
			.get("lastUpdated");
		java.lang.Integer localStoreentId = (java.lang.Integer) h
			.get("storeentId");
		java.lang.String localField1 = (java.lang.String) h.get("field1");
		java.lang.String localField2 = (java.lang.String) h.get("field2");
		java.lang.Double localField3 = (java.lang.Double) h.get("field3");
		java.math.BigDecimal localPrice = (java.math.BigDecimal) h.get("price");
		java.math.BigDecimal localRequiredQuantity = (java.math.BigDecimal) h
			.get("requiredQuantity");
	
		if (h.containsKey("sequence"))
			setSequence((localSequence));
		if (h.containsKey("xrecipeId"))
			setXrecipeId((localXrecipeId));
		if (h.containsKey("orgentityId"))
			setOrgentityId((localOrgentityId));
		if (h.containsKey("xingredientId"))
			setXingredientId((localXingredientId));
		if (h.containsKey("lastUpdated"))
			setLastUpdated((localLastUpdated));
		if (h.containsKey("storeentId"))
			setStoreentId((localStoreentId));
		if (h.containsKey("field1"))
			setField1((localField1));
		if (h.containsKey("field2"))
			setField2((localField2));
		if (h.containsKey("field3"))
			setField3((localField3));
		if (h.containsKey("price"))
			setPrice((localPrice));
		if (h.containsKey("requiredQuantity"))
			setRequiredQuantity((localRequiredQuantity));
	}
}
