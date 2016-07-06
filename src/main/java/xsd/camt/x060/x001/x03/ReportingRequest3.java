/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * ReportingRequest3. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Id</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>ReqdMsgNmId</b> of type {@link java.lang.String} (1)</li>
 * <li><b>Acct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.CashAccount24}
 * (0..1)</li>
 * <li><b>AcctOwnr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice}
 * (1)</li>
 * <li><b>AcctSvcr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5}
 * (0..1)</li>
 * <li><b>RptgPrd</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingPeriod1}
 * (0..1)</li>
 * <li><b>ReqdTxTp</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1}
 * (0..1)</li>
 * <li><b>ReqdBalTp</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12}
 * (0..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3Cls
 */
public class ReportingRequest3 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Acct", "AcctOwnr", "AcctSvcr", "Id", "ReqdBalTp", "ReqdMsgNmId", "ReqdTxTp", "RptgPrd"};

    /**
     * Field id.
     */
    private java.lang.String id;

    /**
     * Field reqdMsgNmId.
     */
    private java.lang.String reqdMsgNmId;

    /**
     * Field acct.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.CashAccount24 acct;

    /**
     * Field acctOwnr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice acctOwnr;

    /**
     * Field acctSvcr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5 acctSvcr;

    /**
     * Field rptgPrd.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingPeriod1 rptgPrd;

    /**
     * Field reqdTxTp.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1 reqdTxTp;

    /**
     * Field reqdBalTp.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12[] reqdBalTp;

    public ReportingRequest3() {
        this(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3Cls.getInstance().getNullDefiningElementDecl());
    }

    public ReportingRequest3(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public ReportingRequest3(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public ReportingRequest3(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3 clone) {
        super(clone);
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
            case 3:
                setId((java.lang.String) value);
                return;
            case 5:
                setReqdMsgNmId((java.lang.String) value);
                return;
            case 0:
                setAcct((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.CashAccount24) value);
                return;
            case 1:
                setAcctOwnr((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice) value);
                return;
            case 2:
                setAcctSvcr((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5) value);
                return;
            case 7:
                setRptgPrd((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingPeriod1) value);
                return;
            case 6:
                setReqdTxTp((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1) value);
                return;
            case 4:
                addReqdBalTp((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a ReqdBalTp (0..*).
     * 
     * @param value
     * @param value The new ReqdBalTp.
     */
    public void addReqdBalTp(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12 value) {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12[] temp = this.reqdBalTp;
        this.reqdBalTp = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.reqdBalTp, 0, temp.length);
        this.reqdBalTp[this.reqdBalTp.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "ReqdBalTp");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3) clone;
        obj.id = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.id, obj, "Id");
        obj.reqdMsgNmId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.reqdMsgNmId, obj, "ReqdMsgNmId");
        obj.acct = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.CashAccount24) biz.c24.io.api.Utils.cloneDeep(this.acct, obj, "Acct");
        obj.acctOwnr = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice) biz.c24.io.api.Utils.cloneDeep(this.acctOwnr, obj, "AcctOwnr");
        obj.acctSvcr = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5) biz.c24.io.api.Utils.cloneDeep(this.acctSvcr, obj, "AcctSvcr");
        obj.rptgPrd = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingPeriod1) biz.c24.io.api.Utils.cloneDeep(this.rptgPrd, obj, "RptgPrd");
        obj.reqdTxTp = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1) biz.c24.io.api.Utils.cloneDeep(this.reqdTxTp, obj, "ReqdTxTp");
        obj.reqdBalTp = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12[]) biz.c24.io.api.Utils.cloneDeep(this.reqdBalTp, obj, "ReqdBalTp");
    }

    /**
     * Creates, adds and returns a new Acct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.CashAccount24 createAcct() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.CashAccount24 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.CashAccount24) getElementDecl("Acct").createObject();
        setAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new AcctOwnr (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice createAcctOwnr() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice) getElementDecl("AcctOwnr").createObject();
        setAcctOwnr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new AcctSvcr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5 createAcctSvcr() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5) getElementDecl("AcctSvcr").createObject();
        setAcctSvcr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new ReqdBalTp (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12 createReqdBalTp() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12) getElementDecl("ReqdBalTp").createObject();
        addReqdBalTp(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new ReqdTxTp (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1 createReqdTxTp() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1) getElementDecl("ReqdTxTp").createObject();
        setReqdTxTp(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RptgPrd (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingPeriod1 createRptgPrd() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingPeriod1 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingPeriod1) getElementDecl("RptgPrd").createObject();
        setRptgPrd(obj);
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
     * Gets the value of Acct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.CashAccount24 getAcct() {
        return this.acct;
    }

    /**
     * Gets the value of AcctOwnr (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice getAcctOwnr() {
        return this.acctOwnr;
    }

    /**
     * Gets the value of AcctSvcr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5 getAcctSvcr() {
        return this.acctSvcr;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>id,
     * reqdMsgNmId, acct, acctOwnr, acctSvcr, rptgPrd, reqdTxTp,
     * reqdBalTp</b>.
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
            case 3:
                return getId();
            case 5:
                return getReqdMsgNmId();
            case 0:
                return getAcct();
            case 1:
                return getAcctOwnr();
            case 2:
                return getAcctSvcr();
            case 7:
                return getRptgPrd();
            case 6:
                return getReqdTxTp();
            case 4:
            if (this.reqdBalTp == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.reqdBalTp[index];
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
            case 3:
                return this.id == null ? 0 : 1;
            case 5:
                return this.reqdMsgNmId == null ? 0 : 1;
            case 0:
                return this.acct == null ? 0 : 1;
            case 1:
                return this.acctOwnr == null ? 0 : 1;
            case 2:
                return this.acctSvcr == null ? 0 : 1;
            case 7:
                return this.rptgPrd == null ? 0 : 1;
            case 6:
                return this.reqdTxTp == null ? 0 : 1;
            case 4:
                return this.reqdBalTp == null ? 0 : this.reqdBalTp.length;
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
            case 3:
                return this.id != null && this.id.equals(element) ? 0 : -1;
            case 5:
                return this.reqdMsgNmId != null && this.reqdMsgNmId.equals(element) ? 0 : -1;
            case 0:
                return this.acct != null && this.acct.equals(element) ? 0 : -1;
            case 1:
                return this.acctOwnr != null && this.acctOwnr.equals(element) ? 0 : -1;
            case 2:
                return this.acctSvcr != null && this.acctSvcr.equals(element) ? 0 : -1;
            case 7:
                return this.rptgPrd != null && this.rptgPrd.equals(element) ? 0 : -1;
            case 6:
                return this.reqdTxTp != null && this.reqdTxTp.equals(element) ? 0 : -1;
            case 4:
                return getReqdBalTpIndex((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Id (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getId() {
        return this.id;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>id,
     * reqdMsgNmId, acct, acctOwnr, acctSvcr, rptgPrd, reqdTxTp,
     * reqdBalTp</b>.
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
            case 3:
                return this.id;
            case 5:
                return this.reqdMsgNmId;
            case 0:
                return this.acct;
            case 1:
                return this.acctOwnr;
            case 2:
                return this.acctSvcr;
            case 7:
                return this.rptgPrd;
            case 6:
                return this.reqdTxTp;
            case 4:
            if (this.reqdBalTp == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.reqdBalTp[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of ReqdBalTp (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12[] getReqdBalTp() {
        if (this.reqdBalTp == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12[]{};
        else
            return this.reqdBalTp;
    }

    /**
     * Gets the value of ReqdBalTp by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12 getReqdBalTp(int ordinal) {
        if (this.reqdBalTp == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.reqdBalTp.length) {
            return this.reqdBalTp[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The ReqdBalTp to get the index of.
     * @return The index.
     */
    public int getReqdBalTpIndex(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12 value) {
        if (this.reqdBalTp == null)
            return -1;
        for (int i=0; i<this.reqdBalTp.length; i++)
            if (this.reqdBalTp[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of ReqdMsgNmId (1).
     * 
     * @return The value.
     */
    public java.lang.String getReqdMsgNmId() {
        return this.reqdMsgNmId;
    }

    /**
     * Gets the value of ReqdTxTp (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1 getReqdTxTp() {
        return this.reqdTxTp;
    }

    /**
     * Gets the value of RptgPrd (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingPeriod1 getRptgPrd() {
        return this.rptgPrd;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.id == null ? 0 : 1;
        count += this.reqdMsgNmId == null ? 0 : 1;
        count += this.acct == null ? 0 : 1;
        count += this.acctOwnr == null ? 0 : 1;
        count += this.acctSvcr == null ? 0 : 1;
        count += this.rptgPrd == null ? 0 : 1;
        count += this.reqdTxTp == null ? 0 : 1;
        count += this.reqdBalTp == null ? 0 : this.reqdBalTp.length;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(id);
        result = 31 * result + hashCodeOf(reqdMsgNmId);
        result = 31 * result + hashCodeOf(acct);
        result = 31 * result + hashCodeOf(acctOwnr);
        result = 31 * result + hashCodeOf(acctSvcr);
        result = 31 * result + hashCodeOf(rptgPrd);
        result = 31 * result + hashCodeOf(reqdTxTp);
        result = 31 * result + hashCodeOf(reqdBalTp);
        return result;
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
            case 3:
                setId(null);
                return;
            case 5:
                setReqdMsgNmId(null);
                return;
            case 0:
                setAcct(null);
                return;
            case 1:
                setAcctOwnr(null);
                return;
            case 2:
                setAcctSvcr(null);
                return;
            case 7:
                setRptgPrd(null);
                return;
            case 6:
                setReqdTxTp(null);
                return;
            case 4:
                removeReqdBalTp(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a ReqdBalTp (0..*).
     * 
     * @param index
     * @param index The index of the ReqdBalTp to get.
     */
    public void removeReqdBalTp(int index) {
        if (this.reqdBalTp == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12[] temp = this.reqdBalTp;
        this.reqdBalTp = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.reqdBalTp, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.reqdBalTp, index, temp.length-index-1);
        if (this.reqdBalTp.length == 0)
            this.reqdBalTp = null;
    }

    /**
     * [Virtual Element] Sets the value of Acct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAcct(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.CashAccount24 value) {
        this.acct = value;
        if (this.acct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.acct).setParent(this, "Acct");
    }

    /**
     * [Virtual Element] Sets the value of AcctOwnr (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAcctOwnr(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice value) {
        this.acctOwnr = value;
        if (this.acctOwnr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.acctOwnr).setParent(this, "AcctOwnr");
    }

    /**
     * [Virtual Element] Sets the value of AcctSvcr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAcctSvcr(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5 value) {
        this.acctSvcr = value;
        if (this.acctSvcr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.acctSvcr).setParent(this, "AcctSvcr");
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
            case 3:
                setId((java.lang.String) value);
                return;
            case 5:
                setReqdMsgNmId((java.lang.String) value);
                return;
            case 0:
                setAcct((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.CashAccount24) value);
                return;
            case 1:
                setAcctOwnr((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice) value);
                return;
            case 2:
                setAcctSvcr((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5) value);
                return;
            case 7:
                setRptgPrd((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingPeriod1) value);
                return;
            case 6:
                setReqdTxTp((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1) value);
                return;
            case 4:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12[]) {
                    setReqdBalTp((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12[])value);
                } else if (this.reqdBalTp == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.reqdBalTp[index] = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.reqdBalTp[index]).setParent(this, "ReqdBalTp");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Id (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

    /**
     * [Virtual Element] Sets the value of ReqdBalTp (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setReqdBalTp(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12[] value) {
        this.reqdBalTp = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.reqdBalTp != null && i<this.reqdBalTp.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.reqdBalTp[i]).setParent(this, "ReqdBalTp");
    }

    /**
     * [Virtual Element] Sets the value of ReqdMsgNmId (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setReqdMsgNmId(java.lang.String value) {
        this.reqdMsgNmId = value;
    }

    /**
     * [Virtual Element] Sets the value of ReqdTxTp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setReqdTxTp(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1 value) {
        this.reqdTxTp = value;
        if (this.reqdTxTp != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.reqdTxTp).setParent(this, "ReqdTxTp");
    }

    /**
     * [Virtual Element] Sets the value of RptgPrd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRptgPrd(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingPeriod1 value) {
        this.rptgPrd = value;
        if (this.rptgPrd != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rptgPrd).setParent(this, "RptgPrd");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.id);
        out.writeObject(this.reqdMsgNmId);
        out.writeObject(this.acct);
        out.writeObject(this.acctOwnr);
        out.writeObject(this.acctSvcr);
        out.writeObject(this.rptgPrd);
        out.writeObject(this.reqdTxTp);
        out.writeObject(this.reqdBalTp);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.id = (java.lang.String) in.readObject();
        this.reqdMsgNmId = (java.lang.String) in.readObject();
        this.acct = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.CashAccount24) in.readObject();
        this.acctOwnr = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice) in.readObject();
        this.acctSvcr = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5) in.readObject();
        this.rptgPrd = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingPeriod1) in.readObject();
        this.reqdTxTp = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1) in.readObject();
        this.reqdBalTp = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12[]) in.readObject();
    }

}
