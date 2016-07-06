/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * AccountStatement2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Id</b> of type {@link java.lang.String} (1)</li>
 * <li><b>ElctrncSeqNb</b> of type {@link java.math.BigDecimal}
 * (0..1)</li>
 * <li><b>LglSeqNb</b> of type {@link java.math.BigDecimal}
 * (0..1)</li>
 * <li><b>CreDtTm</b> of type {@link
 * biz.c24.io.api.data.ISO8601DateTime} (1)</li>
 * <li><b>FrToDt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails}
 * (0..1)</li>
 * <li><b>CpyDplctInd</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>RptgSrc</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportingSource1Choice}
 * (0..1)</li>
 * <li><b>Acct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20}
 * (1)</li>
 * <li><b>RltdAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16}
 * (0..1)</li>
 * <li><b>Intrst</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2}
 * (0..*)</li>
 * <li><b>Bal</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3}
 * (1..*)</li>
 * <li><b>TxsSummry</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2}
 * (0..1)</li>
 * <li><b>Ntry</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2}
 * (0..*)</li>
 * <li><b>AddtlStmtInf</b> of type {@link java.lang.String}
 * (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2Cls
 */
public class AccountStatement2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Acct", "AddtlStmtInf", "Bal", "CpyDplctInd", "CreDtTm", "ElctrncSeqNb", "FrToDt", "Id", "Intrst", "LglSeqNb", "Ntry", "RltdAcct", "RptgSrc", "TxsSummry"};

    /**
     * Field id.
     */
    private java.lang.String id;

    /**
     * Field elctrncSeqNb.
     */
    private java.math.BigDecimal elctrncSeqNb;

    /**
     * Field lglSeqNb.
     */
    private java.math.BigDecimal lglSeqNb;

    /**
     * Field creDtTm.
     */
    private biz.c24.io.api.data.ISO8601DateTime creDtTm;

    /**
     * Field frToDt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails frToDt;

    /**
     * Field cpyDplctInd.
     */
    private java.lang.String cpyDplctInd;

    /**
     * Field rptgSrc.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportingSource1Choice rptgSrc;

    /**
     * Field acct.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20 acct;

    /**
     * Field rltdAcct.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 rltdAcct;

    /**
     * Field intrst.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2[] intrst;

    /**
     * Field bal.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3[] bal;

    /**
     * Field txsSummry.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2 txsSummry;

    /**
     * Field ntry.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2[] ntry;

    /**
     * Field addtlStmtInf.
     */
    private java.lang.String addtlStmtInf;

    public AccountStatement2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2Cls.getInstance().getNullDefiningElementDecl());
    }

    public AccountStatement2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public AccountStatement2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public AccountStatement2(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2 clone) {
        super(clone);
    }

    /**
     * Adds a Bal (1..*).
     * 
     * @param value
     * @param value The new Bal.
     */
    public void addBal(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3[] temp = this.bal;
        this.bal = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.bal, 0, temp.length);
        this.bal[this.bal.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Bal");
    }

    /**
     * Adds <code>value</code> as an element called
     * <code>name</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     * @param value
     */
    public void addElement(java.lang.String name,java.lang.Object value) {
        name = makeSubstitution(name, -1);
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        switch (i)
        {
            case 7:
                setId((java.lang.String) value);
                return;
            case 5:
                setElctrncSeqNb(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 9:
                setLglSeqNb(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 4:
                setCreDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 6:
                setFrToDt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails) value);
                return;
            case 3:
                setCpyDplctInd((java.lang.String) value);
                return;
            case 12:
                setRptgSrc((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportingSource1Choice) value);
                return;
            case 0:
                setAcct((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20) value);
                return;
            case 11:
                setRltdAcct((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) value);
                return;
            case 8:
                addIntrst((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2) value);
                return;
            case 2:
                addBal((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3) value);
                return;
            case 13:
                setTxsSummry((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2) value);
                return;
            case 10:
                addNtry((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2) value);
                return;
            case 1:
                setAddtlStmtInf((java.lang.String) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a Intrst (0..*).
     * 
     * @param value
     * @param value The new Intrst.
     */
    public void addIntrst(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2[] temp = this.intrst;
        this.intrst = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.intrst, 0, temp.length);
        this.intrst[this.intrst.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Intrst");
    }

    /**
     * Adds a Ntry (0..*).
     * 
     * @param value
     * @param value The new Ntry.
     */
    public void addNtry(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2[] temp = this.ntry;
        this.ntry = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.ntry, 0, temp.length);
        this.ntry[this.ntry.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Ntry");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountStatement2) clone;
        obj.id = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.id, obj, "Id");
        obj.elctrncSeqNb = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.elctrncSeqNb, obj, "ElctrncSeqNb");
        obj.lglSeqNb = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.lglSeqNb, obj, "LglSeqNb");
        obj.creDtTm = (biz.c24.io.api.data.ISO8601DateTime) biz.c24.io.api.Utils.cloneDeep(this.creDtTm, obj, "CreDtTm");
        obj.frToDt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails) biz.c24.io.api.Utils.cloneDeep(this.frToDt, obj, "FrToDt");
        obj.cpyDplctInd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cpyDplctInd, obj, "CpyDplctInd");
        obj.rptgSrc = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportingSource1Choice) biz.c24.io.api.Utils.cloneDeep(this.rptgSrc, obj, "RptgSrc");
        obj.acct = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20) biz.c24.io.api.Utils.cloneDeep(this.acct, obj, "Acct");
        obj.rltdAcct = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.rltdAcct, obj, "RltdAcct");
        obj.intrst = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2[]) biz.c24.io.api.Utils.cloneDeep(this.intrst, obj, "Intrst");
        obj.bal = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3[]) biz.c24.io.api.Utils.cloneDeep(this.bal, obj, "Bal");
        obj.txsSummry = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2) biz.c24.io.api.Utils.cloneDeep(this.txsSummry, obj, "TxsSummry");
        obj.ntry = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2[]) biz.c24.io.api.Utils.cloneDeep(this.ntry, obj, "Ntry");
        obj.addtlStmtInf = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.addtlStmtInf, obj, "AddtlStmtInf");
    }

    /**
     * Creates, adds and returns a new Acct (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20 createAcct() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20) getElementDecl("Acct").createObject();
        setAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Bal (1..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3 createBal() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3) getElementDecl("Bal").createObject();
        addBal(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new FrToDt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails createFrToDt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails) getElementDecl("FrToDt").createObject();
        setFrToDt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Intrst (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2 createIntrst() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2) getElementDecl("Intrst").createObject();
        addIntrst(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Ntry (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2 createNtry() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2) getElementDecl("Ntry").createObject();
        addNtry(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RltdAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 createRltdAcct() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) getElementDecl("RltdAcct").createObject();
        setRltdAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RptgSrc (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportingSource1Choice createRptgSrc() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportingSource1Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportingSource1Choice) getElementDecl("RptgSrc").createObject();
        setRptgSrc(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TxsSummry (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2 createTxsSummry() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2) getElementDecl("TxsSummry").createObject();
        setTxsSummry(obj);
        return obj;
    }

    public boolean equals(java.lang.Object obj) {

        if(obj == null)
            return false;
        else if(obj instanceof biz.c24.io.api.data.ComplexDataObject)
            return equalContents((biz.c24.io.api.data.ComplexDataObject) obj, true, true, true, true);
        else
            return obj.equals(this);
    }

    /**
     * Gets the value of Acct (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20 getAcct() {
        return this.acct;
    }

    /**
     * Gets the value of AddtlStmtInf (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getAddtlStmtInf() {
        return this.addtlStmtInf;
    }

    /**
     * Gets the value of Bal (1..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3[] getBal() {
        if (this.bal == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3[]{};
        else
            return this.bal;
    }

    /**
     * Gets the value of Bal by ordinal position in the collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3 getBal(int ordinal) {
        if (this.bal == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.bal.length) {
            return this.bal[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (1..*).
     * 
     * @param value
     * @param value The Bal to get the index of.
     * @return The index.
     */
    public int getBalIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3 value) {
        if (this.bal == null)
            return -1;
        for (int i=0; i<this.bal.length; i++)
            if (this.bal[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of CpyDplctInd (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCpyDplctInd() {
        return this.cpyDplctInd;
    }

    /**
     * Gets the value of CreDtTm (1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601DateTime getCreDtTm() {
        return this.creDtTm;
    }

    /**
     * Gets the value of ElctrncSeqNb (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getElctrncSeqNb() {
        return this.elctrncSeqNb;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>id,
     * elctrncSeqNb, lglSeqNb, creDtTm, frToDt, cpyDplctInd,
     * rptgSrc, acct, rltdAcct, intrst, bal, txsSummry, ntry,
     * addtlStmtInf</b>.
     * 
     * @param name
     * @param index
     */
    public java.lang.Object getElement(java.lang.String name,int index) {
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 7:
                return getId();
            case 5:
                return getElctrncSeqNb();
            case 9:
                return getLglSeqNb();
            case 4:
                return getCreDtTm();
            case 6:
                return getFrToDt();
            case 3:
                return getCpyDplctInd();
            case 12:
                return getRptgSrc();
            case 0:
                return getAcct();
            case 11:
                return getRltdAcct();
            case 8:
            if (this.intrst == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.intrst[index];
            case 2:
            if (this.bal == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.bal[index];
            case 13:
                return getTxsSummry();
            case 10:
            if (this.ntry == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.ntry[index];
            case 1:
                return getAddtlStmtInf();
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Returns the count of elements called <code>name</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     */
    public int getElementCount(java.lang.String name) {
        if (null == name) throw new NullPointerException(toString() + " was asked to calculate elements without name");
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 7:
                return this.id == null ? 0 : 1;
            case 5:
                return this.elctrncSeqNb == null ? 0 : 1;
            case 9:
                return this.lglSeqNb == null ? 0 : 1;
            case 4:
                return this.creDtTm == null ? 0 : 1;
            case 6:
                return this.frToDt == null ? 0 : 1;
            case 3:
                return this.cpyDplctInd == null ? 0 : 1;
            case 12:
                return this.rptgSrc == null ? 0 : 1;
            case 0:
                return this.acct == null ? 0 : 1;
            case 11:
                return this.rltdAcct == null ? 0 : 1;
            case 8:
                return this.intrst == null ? 0 : this.intrst.length;
            case 2:
                return this.bal == null ? 0 : this.bal.length;
            case 13:
                return this.txsSummry == null ? 0 : 1;
            case 10:
                return this.ntry == null ? 0 : this.ntry.length;
            case 1:
                return this.addtlStmtInf == null ? 0 : 1;
            default:
                return super.getElementCount(name);
        }
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     * @param element
     */
    public int getElementIndex(java.lang.String name,java.lang.Object element) {
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 7:
                return this.id != null && this.id.equals(element) ? 0 : -1;
            case 5:
                return this.elctrncSeqNb != null && this.elctrncSeqNb.equals(element) ? 0 : -1;
            case 9:
                return this.lglSeqNb != null && this.lglSeqNb.equals(element) ? 0 : -1;
            case 4:
                return this.creDtTm != null && this.creDtTm.equals(element) ? 0 : -1;
            case 6:
                return this.frToDt != null && this.frToDt.equals(element) ? 0 : -1;
            case 3:
                return this.cpyDplctInd != null && this.cpyDplctInd.equals(element) ? 0 : -1;
            case 12:
                return this.rptgSrc != null && this.rptgSrc.equals(element) ? 0 : -1;
            case 0:
                return this.acct != null && this.acct.equals(element) ? 0 : -1;
            case 11:
                return this.rltdAcct != null && this.rltdAcct.equals(element) ? 0 : -1;
            case 8:
                return getIntrstIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2) element);
            case 2:
                return getBalIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3) element);
            case 13:
                return this.txsSummry != null && this.txsSummry.equals(element) ? 0 : -1;
            case 10:
                return getNtryIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2) element);
            case 1:
                return this.addtlStmtInf != null && this.addtlStmtInf.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FrToDt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails getFrToDt() {
        return this.frToDt;
    }

    /**
     * Gets the value of Id (1).
     * 
     * @return The value.
     */
    public java.lang.String getId() {
        return this.id;
    }

    /**
     * Gets the value of Intrst (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2[] getIntrst() {
        if (this.intrst == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2[]{};
        else
            return this.intrst;
    }

    /**
     * Gets the value of Intrst by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2 getIntrst(int ordinal) {
        if (this.intrst == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.intrst.length) {
            return this.intrst[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Intrst to get the index of.
     * @return The index.
     */
    public int getIntrstIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2 value) {
        if (this.intrst == null)
            return -1;
        for (int i=0; i<this.intrst.length; i++)
            if (this.intrst[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of LglSeqNb (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getLglSeqNb() {
        return this.lglSeqNb;
    }

    /**
     * Gets the value of Ntry (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2[] getNtry() {
        if (this.ntry == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2[]{};
        else
            return this.ntry;
    }

    /**
     * Gets the value of Ntry by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2 getNtry(int ordinal) {
        if (this.ntry == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.ntry.length) {
            return this.ntry[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Ntry to get the index of.
     * @return The index.
     */
    public int getNtryIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2 value) {
        if (this.ntry == null)
            return -1;
        for (int i=0; i<this.ntry.length; i++)
            if (this.ntry[i] == value)
                return i;
        return -1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>id,
     * elctrncSeqNb, lglSeqNb, creDtTm, frToDt, cpyDplctInd,
     * rptgSrc, acct, rltdAcct, intrst, bal, txsSummry, ntry,
     * addtlStmtInf</b>.
     * 
     * @param name
     * @param index
     */
    public java.lang.Object getRawElement(java.lang.String name,int index) {
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 7:
                return this.id;
            case 5:
                return this.elctrncSeqNb;
            case 9:
                return this.lglSeqNb;
            case 4:
                return this.creDtTm;
            case 6:
                return this.frToDt;
            case 3:
                return this.cpyDplctInd;
            case 12:
                return this.rptgSrc;
            case 0:
                return this.acct;
            case 11:
                return this.rltdAcct;
            case 8:
            if (this.intrst == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.intrst[index];
            case 2:
            if (this.bal == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.bal[index];
            case 13:
                return this.txsSummry;
            case 10:
            if (this.ntry == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.ntry[index];
            case 1:
                return this.addtlStmtInf;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of RltdAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 getRltdAcct() {
        return this.rltdAcct;
    }

    /**
     * Gets the value of RptgSrc (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportingSource1Choice getRptgSrc() {
        return this.rptgSrc;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.id == null ? 0 : 1;
        count += this.elctrncSeqNb == null ? 0 : 1;
        count += this.lglSeqNb == null ? 0 : 1;
        count += this.creDtTm == null ? 0 : 1;
        count += this.frToDt == null ? 0 : 1;
        count += this.cpyDplctInd == null ? 0 : 1;
        count += this.rptgSrc == null ? 0 : 1;
        count += this.acct == null ? 0 : 1;
        count += this.rltdAcct == null ? 0 : 1;
        count += this.intrst == null ? 0 : this.intrst.length;
        count += this.bal == null ? 0 : this.bal.length;
        count += this.txsSummry == null ? 0 : 1;
        count += this.ntry == null ? 0 : this.ntry.length;
        count += this.addtlStmtInf == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of TxsSummry (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2 getTxsSummry() {
        return this.txsSummry;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(id);
        result = 31 * result + hashCodeOf(elctrncSeqNb);
        result = 31 * result + hashCodeOf(lglSeqNb);
        result = 31 * result + hashCodeOf(creDtTm);
        result = 31 * result + hashCodeOf(frToDt);
        result = 31 * result + hashCodeOf(cpyDplctInd);
        result = 31 * result + hashCodeOf(rptgSrc);
        result = 31 * result + hashCodeOf(acct);
        result = 31 * result + hashCodeOf(rltdAcct);
        result = 31 * result + hashCodeOf(intrst);
        result = 31 * result + hashCodeOf(bal);
        result = 31 * result + hashCodeOf(txsSummry);
        result = 31 * result + hashCodeOf(ntry);
        result = 31 * result + hashCodeOf(addtlStmtInf);
        return result;
    }

    /**
     * Removes a Bal (1..*).
     * 
     * @param index
     * @param index The index of the Bal to get.
     */
    public void removeBal(int index) {
        if (this.bal == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3[] temp = this.bal;
        this.bal = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.bal, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.bal, index, temp.length-index-1);
        if (this.bal.length == 0)
            this.bal = null;
    }

    /**
     * Removes the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     * @param index
     */
    public void removeElement(java.lang.String name,int index) {
        name = unmakeSubstitution(name, index);
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        switch (i)
        {
            case 7:
                setId(null);
                return;
            case 5:
                setElctrncSeqNb(null);
                return;
            case 9:
                setLglSeqNb(null);
                return;
            case 4:
                setCreDtTm(null);
                return;
            case 6:
                setFrToDt(null);
                return;
            case 3:
                setCpyDplctInd(null);
                return;
            case 12:
                setRptgSrc(null);
                return;
            case 0:
                setAcct(null);
                return;
            case 11:
                setRltdAcct(null);
                return;
            case 8:
                removeIntrst(index);
                return;
            case 2:
                removeBal(index);
                return;
            case 13:
                setTxsSummry(null);
                return;
            case 10:
                removeNtry(index);
                return;
            case 1:
                setAddtlStmtInf(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a Intrst (0..*).
     * 
     * @param index
     * @param index The index of the Intrst to get.
     */
    public void removeIntrst(int index) {
        if (this.intrst == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2[] temp = this.intrst;
        this.intrst = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.intrst, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.intrst, index, temp.length-index-1);
        if (this.intrst.length == 0)
            this.intrst = null;
    }

    /**
     * Removes a Ntry (0..*).
     * 
     * @param index
     * @param index The index of the Ntry to get.
     */
    public void removeNtry(int index) {
        if (this.ntry == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2[] temp = this.ntry;
        this.ntry = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.ntry, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.ntry, index, temp.length-index-1);
        if (this.ntry.length == 0)
            this.ntry = null;
    }

    /**
     * [Virtual Element] Sets the value of Acct (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAcct(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20 value) {
        this.acct = value;
        if (this.acct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.acct).setParent(this, "Acct");
    }

    /**
     * [Virtual Element] Sets the value of AddtlStmtInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAddtlStmtInf(java.lang.String value) {
        this.addtlStmtInf = value;
    }

    /**
     * [Virtual Element] Sets the value of Bal (1..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBal(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3[] value) {
        this.bal = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.bal != null && i<this.bal.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.bal[i]).setParent(this, "Bal");
    }

    /**
     * [Virtual Element] Sets the value of CpyDplctInd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCpyDplctInd(java.lang.String value) {
        this.cpyDplctInd = value;
    }

    /**
     * [Virtual Element] Sets the value of CreDtTm (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCreDtTm(biz.c24.io.api.data.ISO8601DateTime value) {
        this.creDtTm = value;
    }

    /**
     * [Virtual Element] Sets the value of ElctrncSeqNb (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setElctrncSeqNb(java.math.BigDecimal value) {
        this.elctrncSeqNb = value;
    }

    /**
     * Sets <code>value</code> as an element called
     * <code>name</code> at <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     * @param value
     * @param index
     */
    public void setElement(java.lang.String name,int index,java.lang.Object value) {
        name = makeSubstitution(name, index);
        int i = (Arrays.binarySearch(NATIVE_ELEMENTS, name));
        switch (i)
        {
            case 7:
                setId((java.lang.String) value);
                return;
            case 5:
                setElctrncSeqNb(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 9:
                setLglSeqNb(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 4:
                setCreDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 6:
                setFrToDt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails) value);
                return;
            case 3:
                setCpyDplctInd((java.lang.String) value);
                return;
            case 12:
                setRptgSrc((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportingSource1Choice) value);
                return;
            case 0:
                setAcct((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20) value);
                return;
            case 11:
                setRltdAcct((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) value);
                return;
            case 8:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2[]) {
                    setIntrst((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2[])value);
                } else if (this.intrst == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.intrst[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.intrst[index]).setParent(this, "Intrst");
                }
                return;
            case 2:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3[]) {
                    setBal((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3[])value);
                } else if (this.bal == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.bal[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.bal[index]).setParent(this, "Bal");
                }
                return;
            case 13:
                setTxsSummry((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2) value);
                return;
            case 10:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2[]) {
                    setNtry((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2[])value);
                } else if (this.ntry == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.ntry[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.ntry[index]).setParent(this, "Ntry");
                }
                return;
            case 1:
                setAddtlStmtInf((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of FrToDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFrToDt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails value) {
        this.frToDt = value;
        if (this.frToDt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.frToDt).setParent(this, "FrToDt");
    }

    /**
     * [Virtual Element] Sets the value of Id (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

    /**
     * [Virtual Element] Sets the value of Intrst (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrst(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2[] value) {
        this.intrst = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.intrst != null && i<this.intrst.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.intrst[i]).setParent(this, "Intrst");
    }

    /**
     * [Virtual Element] Sets the value of LglSeqNb (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setLglSeqNb(java.math.BigDecimal value) {
        this.lglSeqNb = value;
    }

    /**
     * [Virtual Element] Sets the value of Ntry (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNtry(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2[] value) {
        this.ntry = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.ntry != null && i<this.ntry.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.ntry[i]).setParent(this, "Ntry");
    }

    /**
     * [Virtual Element] Sets the value of RltdAcct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRltdAcct(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16 value) {
        this.rltdAcct = value;
        if (this.rltdAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rltdAcct).setParent(this, "RltdAcct");
    }

    /**
     * [Virtual Element] Sets the value of RptgSrc (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRptgSrc(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportingSource1Choice value) {
        this.rptgSrc = value;
        if (this.rptgSrc != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rptgSrc).setParent(this, "RptgSrc");
    }

    /**
     * [Virtual Element] Sets the value of TxsSummry (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTxsSummry(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2 value) {
        this.txsSummry = value;
        if (this.txsSummry != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.txsSummry).setParent(this, "TxsSummry");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.id);
        out.writeObject(this.elctrncSeqNb);
        out.writeObject(this.lglSeqNb);
        out.writeObject(this.creDtTm);
        out.writeObject(this.frToDt);
        out.writeObject(this.cpyDplctInd);
        out.writeObject(this.rptgSrc);
        out.writeObject(this.acct);
        out.writeObject(this.rltdAcct);
        out.writeObject(this.intrst);
        out.writeObject(this.bal);
        out.writeObject(this.txsSummry);
        out.writeObject(this.ntry);
        out.writeObject(this.addtlStmtInf);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.id = (java.lang.String) in.readObject();
        this.elctrncSeqNb = (java.math.BigDecimal) in.readObject();
        this.lglSeqNb = (java.math.BigDecimal) in.readObject();
        this.creDtTm = (biz.c24.io.api.data.ISO8601DateTime) in.readObject();
        this.frToDt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails) in.readObject();
        this.cpyDplctInd = (java.lang.String) in.readObject();
        this.rptgSrc = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportingSource1Choice) in.readObject();
        this.acct = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount20) in.readObject();
        this.rltdAcct = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashAccount16) in.readObject();
        this.intrst = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AccountInterest2[]) in.readObject();
        this.bal = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalance3[]) in.readObject();
        this.txsSummry = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalTransactions2) in.readObject();
        this.ntry = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2[]) in.readObject();
        this.addtlStmtInf = (java.lang.String) in.readObject();
    }

}
