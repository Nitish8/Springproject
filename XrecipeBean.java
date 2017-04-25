package com.nl.sligro.commerce.menucalculator.objects;

/**
 * Bean implementation class for Enterprise Bean: Xrecipe
 */
public class XrecipeBean extends com.ibm.commerce.base.objects.ECEntityBean
	implements
		javax.ejb.EntityBean {

	/**
	 * Implementation field for persistent attribute: xrecipeId
	 */
	public java.lang.Long xrecipeId;

	/**
	 * Implementation field for persistent attribute: orgentityId
	 */
	public java.lang.Long orgentityId;

	/**
	 * Implementation field for persistent attribute: recipeType
	 */
	public java.lang.String recipeType;

	/**
	 * Implementation field for persistent attribute: storeentId
	 */
	public java.lang.Integer storeentId;

	/**
	 * Implementation field for persistent attribute: createBy
	 */
	public java.lang.Long createBy;

	/**
	 * Implementation field for persistent attribute: currency
	 */
	public java.lang.String currency;

	/**
	 * Implementation field for persistent attribute: netProductPrice
	 */
	public java.math.BigDecimal netProductPrice;

	/**
	 * Implementation field for persistent attribute: vat
	 */
	public java.math.BigDecimal vat;

	/**
	 * Implementation field for persistent attribute: wastage
	 */
	public java.math.BigDecimal wastage;

	/**
	 * Implementation field for persistent attribute: marginOfProfit
	 */
	public java.math.BigDecimal marginOfProfit;

	/**
	 * Implementation field for persistent attribute: persons
	 */
	public java.lang.Integer persons;

	/**
	 * Implementation field for persistent attribute: grossProductPrice
	 */
	public java.math.BigDecimal grossProductPrice;

	/**
	 * Implementation field for persistent attribute: markForDelete
	 */
	public java.lang.Integer markForDelete;

	/**
	 * Implementation field for persistent attribute: preperationTime
	 */
	public java.lang.Integer preperationTime;

	/**
	 * Implementation field for persistent attribute: totalTime
	 */
	public java.lang.Integer totalTime;

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
	 * Implementation field for persistent attribute: lastUpdated
	 */
	public java.sql.Timestamp lastUpdated;

	/**
	 * Implementation field for persistent attribute: sequence
	 */
	public java.lang.Double sequence;

	/**
	 * ejbCreate method for a CMP entity bean.
	 */
	public java.lang.Long ejbCreate(java.lang.Long xrecipeId)
		throws javax.ejb.CreateException {
		_initLinks();
		this.xrecipeId = xrecipeId;
		return null;
	}

	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Long xrecipeId)
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
	 * Get accessor for persistent attribute: recipeType
	 */
	public java.lang.String getRecipeType() {
		return recipeType;
	}

	/**
	 * Set accessor for persistent attribute: recipeType
	 */
	public void setRecipeType(java.lang.String newRecipeType) {
		recipeType = newRecipeType;
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
	 * Get accessor for persistent attribute: createBy
	 */
	public java.lang.Long getCreateBy() {
		return createBy;
	}

	/**
	 * Set accessor for persistent attribute: createBy
	 */
	public void setCreateBy(java.lang.Long newCreateBy) {
		createBy = newCreateBy;
	}

	/**
	 * Get accessor for persistent attribute: currency
	 */
	public java.lang.String getCurrency() {
		return currency;
	}

	/**
	 * Set accessor for persistent attribute: currency
	 */
	public void setCurrency(java.lang.String newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Get accessor for persistent attribute: netProductPrice
	 */
	public java.math.BigDecimal getNetProductPrice() {
		return netProductPrice;
	}

	/**
	 * Set accessor for persistent attribute: netProductPrice
	 */
	public void setNetProductPrice(java.math.BigDecimal newNetProductPrice) {
		netProductPrice = newNetProductPrice;
	}

	/**
	 * Get accessor for persistent attribute: vat
	 */
	public java.math.BigDecimal getVat() {
		return vat;
	}

	/**
	 * Set accessor for persistent attribute: vat
	 */
	public void setVat(java.math.BigDecimal newVat) {
		vat = newVat;
	}

	/**
	 * Get accessor for persistent attribute: wastage
	 */
	public java.math.BigDecimal getWastage() {
		return wastage;
	}

	/**
	 * Set accessor for persistent attribute: wastage
	 */
	public void setWastage(java.math.BigDecimal newWastage) {
		wastage = newWastage;
	}

	/**
	 * Get accessor for persistent attribute: marginOfProfit
	 */
	public java.math.BigDecimal getMarginOfProfit() {
		return marginOfProfit;
	}

	/**
	 * Set accessor for persistent attribute: marginOfProfit
	 */
	public void setMarginOfProfit(java.math.BigDecimal newMarginOfProfit) {
		marginOfProfit = newMarginOfProfit;
	}

	/**
	 * Get accessor for persistent attribute: persons
	 */
	public java.lang.Integer getPersons() {
		return persons;
	}

	/**
	 * Set accessor for persistent attribute: persons
	 */
	public void setPersons(java.lang.Integer newPersons) {
		persons = newPersons;
	}

	/**
	 * Get accessor for persistent attribute: grossProductPrice
	 */
	public java.math.BigDecimal getGrossProductPrice() {
		return grossProductPrice;
	}

	/**
	 * Set accessor for persistent attribute: grossProductPrice
	 */
	public void setGrossProductPrice(java.math.BigDecimal newGrossProductPrice) {
		grossProductPrice = newGrossProductPrice;
	}

	/**
	 * Get accessor for persistent attribute: markForDelete
	 */
	public java.lang.Integer getMarkForDelete() {
		return markForDelete;
	}

	/**
	 * Set accessor for persistent attribute: markForDelete
	 */
	public void setMarkForDelete(java.lang.Integer newMarkForDelete) {
		markForDelete = newMarkForDelete;
	}

	/**
	 * Get accessor for persistent attribute: preperationTime
	 */
	public java.lang.Integer getPreperationTime() {
		return preperationTime;
	}

	/**
	 * Set accessor for persistent attribute: preperationTime
	 */
	public void setPreperationTime(java.lang.Integer newPreperationTime) {
		preperationTime = newPreperationTime;
	}

	/**
	 * Get accessor for persistent attribute: totalTime
	 */
	public java.lang.Integer getTotalTime() {
		return totalTime;
	}

	/**
	 * Set accessor for persistent attribute: totalTime
	 */
	public void setTotalTime(java.lang.Integer newTotalTime) {
		totalTime = newTotalTime;
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
	
	public java.lang.Long getXrecipeId() {
	   return xrecipeId;
	}
	
	public com.nl.sligro.commerce.menucalculator.objects.XrecipeKey ejbCreate(
	   java.lang.Long xrecipeId, java.lang.Long orgentityId, 
	   java.lang.String recipeType, java.lang.Integer storeentId,
	   java.lang.Long createBy, java.lang.String currency, 
	   java.math.BigDecimal netProductPrice, java.math.BigDecimal vat,
	   java.math.BigDecimal wastage, java.math.BigDecimal marginOfProfit,
	   java.lang.Integer persons, java.math.BigDecimal grossProductPrice,
	   java.lang.Integer  markForDelete, java.lang.Integer  preperationTime,
	   java.lang.Integer  totalTime, java.sql.Timestamp lastUpdated,
	   java.lang.Double  sequence, java.lang.String field1,
	   java.lang.String field2, java.lang.Double field3)
	   throws javax.ejb.CreateException {
		  this.initializeFields();
	      _initLinks();
	      this.xrecipeId=xrecipeId;
	      this.orgentityId=orgentityId;
	      this.recipeType=recipeType;
	      this.storeentId=storeentId;	      
	      this.createBy=createBy;
	      this.currency=currency;	      
	      this.netProductPrice=netProductPrice;
	      this.vat=vat;	      
	      this.wastage=wastage;
	      this.marginOfProfit=marginOfProfit;	      
	      this.persons=persons;
	      this.grossProductPrice=grossProductPrice;	      
	      this.markForDelete=markForDelete;
	      this.preperationTime=preperationTime;	      
	      this.totalTime=totalTime;
	      this.lastUpdated=lastUpdated;	      
	      this.sequence=sequence;
	      this.field1=field1;
	      this.field2=field2;
	      this.field3=field3;	
	      XrecipeKey myNewKey = new XrecipeKey(xrecipeId); 
	      this.initializeOptCounter(myNewKey);
	      return null;
	}
	
	public void ejbPostCreate(java.lang.Long xrecipeId, java.lang.Long orgentityId, 
			   java.lang.String recipeType, java.lang.Integer storeentId,
			   java.lang.Long createBy, java.lang.String currency, 
			   java.math.BigDecimal netProductPrice, java.math.BigDecimal vat,
			   java.math.BigDecimal wastage, java.math.BigDecimal marginOfProfit,
			   java.lang.Integer persons, java.math.BigDecimal grossProductPrice,
			   java.lang.Integer  markForDelete, java.lang.Integer  preperationTime,
			   java.lang.Integer  totalTime, java.sql.Timestamp lastUpdated,
			   java.lang.Double  sequence, java.lang.String field1,
			   java.lang.String field2, java.lang.Double field3) 
	   throws javax.ejb.CreateException
   {
   }

	/**
	 * _copyFromEJB
	 */
	public java.util.Hashtable _copyFromEJB() {
		com.ibm.ivj.ejb.runtime.AccessBeanHashtable h = new com.ibm.ivj.ejb.runtime.AccessBeanHashtable();
	
		h.put("xrecipeId", getXrecipeId());
		h.put("sequence", getSequence());
		h.put("orgentityId", getOrgentityId());
		h.put("lastUpdated", getLastUpdated());
		h.put("storeentId", getStoreentId());
		h.put("markForDelete", getMarkForDelete());
		h.put("preperationTime", getPreperationTime());
		h.put("recipeType", getRecipeType());
		h.put("vat", getVat());
		h.put("marginOfProfit", getMarginOfProfit());
		h.put("totalTime", getTotalTime());
		h.put("currency", getCurrency());
		h.put("createBy", getCreateBy());
		h.put("wastage", getWastage());
		h.put("field1", getField1());
		h.put("netProductPrice", getNetProductPrice());
		h.put("field2", getField2());
		h.put("field3", getField3());
		h.put("persons", getPersons());
		h.put("grossProductPrice", getGrossProductPrice());
		h.put("__Key", getEntityContext().getPrimaryKey());
	
		return h;
	}

	/**
	 * _copyToEJB
	 */
	public void _copyToEJB(java.util.Hashtable h) {
		java.lang.Double localSequence = (java.lang.Double) h.get("sequence");
		java.lang.Long localOrgentityId = (java.lang.Long) h.get("orgentityId");
		java.sql.Timestamp localLastUpdated = (java.sql.Timestamp) h
			.get("lastUpdated");
		java.lang.Integer localStoreentId = (java.lang.Integer) h
			.get("storeentId");
		java.lang.Integer localMarkForDelete = (java.lang.Integer) h
			.get("markForDelete");
		java.lang.Integer localPreperationTime = (java.lang.Integer) h
			.get("preperationTime");
		java.lang.String localRecipeType = (java.lang.String) h
			.get("recipeType");
		java.math.BigDecimal localVat = (java.math.BigDecimal) h.get("vat");
		java.math.BigDecimal localMarginOfProfit = (java.math.BigDecimal) h
			.get("marginOfProfit");
		java.lang.Integer localTotalTime = (java.lang.Integer) h
			.get("totalTime");
		java.lang.String localCurrency = (java.lang.String) h.get("currency");
		java.lang.Long localCreateBy = (java.lang.Long) h.get("createBy");
		java.math.BigDecimal localWastage = (java.math.BigDecimal) h
			.get("wastage");
		java.lang.String localField1 = (java.lang.String) h.get("field1");
		java.math.BigDecimal localNetProductPrice = (java.math.BigDecimal) h
			.get("netProductPrice");
		java.lang.String localField2 = (java.lang.String) h.get("field2");
		java.lang.Double localField3 = (java.lang.Double) h.get("field3");
		java.lang.Integer localPersons = (java.lang.Integer) h.get("persons");
		java.math.BigDecimal localGrossProductPrice = (java.math.BigDecimal) h
			.get("grossProductPrice");
	
		if (h.containsKey("sequence"))
			setSequence((localSequence));
		if (h.containsKey("orgentityId"))
			setOrgentityId((localOrgentityId));
		if (h.containsKey("lastUpdated"))
			setLastUpdated((localLastUpdated));
		if (h.containsKey("storeentId"))
			setStoreentId((localStoreentId));
		if (h.containsKey("markForDelete"))
			setMarkForDelete((localMarkForDelete));
		if (h.containsKey("preperationTime"))
			setPreperationTime((localPreperationTime));
		if (h.containsKey("recipeType"))
			setRecipeType((localRecipeType));
		if (h.containsKey("vat"))
			setVat((localVat));
		if (h.containsKey("marginOfProfit"))
			setMarginOfProfit((localMarginOfProfit));
		if (h.containsKey("totalTime"))
			setTotalTime((localTotalTime));
		if (h.containsKey("currency"))
			setCurrency((localCurrency));
		if (h.containsKey("createBy"))
			setCreateBy((localCreateBy));
		if (h.containsKey("wastage"))
			setWastage((localWastage));
		if (h.containsKey("field1"))
			setField1((localField1));
		if (h.containsKey("netProductPrice"))
			setNetProductPrice((localNetProductPrice));
		if (h.containsKey("field2"))
			setField2((localField2));
		if (h.containsKey("field3"))
			setField3((localField3));
		if (h.containsKey("persons"))
			setPersons((localPersons));
		if (h.containsKey("grossProductPrice"))
			setGrossProductPrice((localGrossProductPrice));
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
}
