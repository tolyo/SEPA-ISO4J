/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TotalsPerBankTransactionCode2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>NbOfNtries</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>Sum</b> of type {@link java.math.BigDecimal} (0..1)</li>
 * <li><b>TtlNetNtryAmt</b> of type {@link java.math.BigDecimal}
 * (0..1)</li>
 * <li><b>CdtDbtInd</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>FcstInd</b> of type <code>boolean</code> (0..1)</li>
 * <li><b>BkTxCd</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4}
 * (1)</li>
 * <li><b>Avlbty</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2Cls
 */
public class TotalsPerBankTransactionCode2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Avlbty", "BkTxCd", "CdtDbtInd", "FcstInd", "NbOfNtries", "Sum", "TtlNetNtryAmt"};

    /**
     * Field nbOfNtries.
     */
    private java.lang.String nbOfNtries;

    /**
     * Field sum.
     */
    private java.math.BigDecimal sum;

    /**
     * Field ttlNetNtryAmt.
     */
    private java.math.BigDecimal ttlNetNtryAmt;

    /**
     * Field cdtDbtInd.
     */
    private java.lang.String cdtDbtInd;

    /**
     * Field fcstInd.
     */
    private boolean fcstInd;

    /**
     * Field isfcstIndSet.
     */
    private boolean isfcstIndSet;

    /**
     * Field bkTxCd.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4 bkTxCd;

    /**
     * Field avlbty.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] avlbty;

    public TotalsPerBankTransactionCode2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2Cls.getInstance().getNullDefiningElementDecl());
    }

    public TotalsPerBankTransactionCode2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TotalsPerBankTransactionCode2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TotalsPerBankTransactionCode2(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2 clone) {
        super(clone);
    }

    /**
     * Adds a Avlbty (0..*).
     * 
     * @param value
     * @param value The new Avlbty.
     */
    public void addAvlbty(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] temp = this.avlbty;
        this.avlbty = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.avlbty, 0, temp.length);
        this.avlbty[this.avlbty.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Avlbty");
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
            case 4:
                setNbOfNtries((java.lang.String) value);
                return;
            case 5:
                setSum(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 6:
                setTtlNetNtryAmt(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 2:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 3:
                setFcstInd(biz.c24.io.api.Utils.booleanValue(value));
                return;
            case 1:
                setBkTxCd((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4) value);
                return;
            case 0:
                addAvlbty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TotalsPerBankTransactionCode2) clone;
        obj.nbOfNtries = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nbOfNtries, obj, "NbOfNtries");
        obj.sum = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.sum, obj, "Sum");
        obj.ttlNetNtryAmt = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.ttlNetNtryAmt, obj, "TtlNetNtryAmt");
        obj.cdtDbtInd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cdtDbtInd, obj, "CdtDbtInd");
        obj.isfcstIndSet = this.isfcstIndSet;
        obj.fcstInd = this.fcstInd;
        obj.bkTxCd = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4) biz.c24.io.api.Utils.cloneDeep(this.bkTxCd, obj, "BkTxCd");
        obj.avlbty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]) biz.c24.io.api.Utils.cloneDeep(this.avlbty, obj, "Avlbty");
    }

    /**
     * Creates, adds and returns a new Avlbty (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 createAvlbty() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2) getElementDecl("Avlbty").createObject();
        addAvlbty(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new BkTxCd (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4 createBkTxCd() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4) getElementDecl("BkTxCd").createObject();
        setBkTxCd(obj);
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
     * Gets the value of Avlbty (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] getAvlbty() {
        if (this.avlbty == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]{};
        else
            return this.avlbty;
    }

    /**
     * Gets the value of Avlbty by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 getAvlbty(int ordinal) {
        if (this.avlbty == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.avlbty.length) {
            return this.avlbty[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Avlbty to get the index of.
     * @return The index.
     */
    public int getAvlbtyIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 value) {
        if (this.avlbty == null)
            return -1;
        for (int i=0; i<this.avlbty.length; i++)
            if (this.avlbty[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of BkTxCd (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4 getBkTxCd() {
        return this.bkTxCd;
    }

    /**
     * Gets the value of CdtDbtInd (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCdtDbtInd() {
        return this.cdtDbtInd;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>nbOfNtries,
     * sum, ttlNetNtryAmt, cdtDbtInd, fcstInd, bkTxCd, avlbty</b>.
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
            case 4:
                return getNbOfNtries();
            case 5:
                return getSum();
            case 6:
                return getTtlNetNtryAmt();
            case 2:
                return getCdtDbtInd();
            case 3:
                return getFcstInd();
            case 1:
                return getBkTxCd();
            case 0:
            if (this.avlbty == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.avlbty[index];
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
            case 4:
                return this.nbOfNtries == null ? 0 : 1;
            case 5:
                return this.sum == null ? 0 : 1;
            case 6:
                return this.ttlNetNtryAmt == null ? 0 : 1;
            case 2:
                return this.cdtDbtInd == null ? 0 : 1;
            case 3:
                return this.isfcstIndSet ? 1 : 0;
            case 1:
                return this.bkTxCd == null ? 0 : 1;
            case 0:
                return this.avlbty == null ? 0 : this.avlbty.length;
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
            case 4:
                return this.nbOfNtries != null && this.nbOfNtries.equals(element) ? 0 : -1;
            case 5:
                return this.sum != null && this.sum.equals(element) ? 0 : -1;
            case 6:
                return this.ttlNetNtryAmt != null && this.ttlNetNtryAmt.equals(element) ? 0 : -1;
            case 2:
                return this.cdtDbtInd != null && this.cdtDbtInd.equals(element) ? 0 : -1;
            case 3:
                return this.isfcstIndSet ? (this.fcstInd == biz.c24.io.api.Utils.booleanValue(element) ? 0 : -1) : -1;
            case 1:
                return this.bkTxCd != null && this.bkTxCd.equals(element) ? 0 : -1;
            case 0:
                return getAvlbtyIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FcstInd (0..1).
     * 
     * @return The value.
     */
    public boolean getFcstInd() {
        return this.fcstInd;
    }

    /**
     * Gets the value of NbOfNtries (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getNbOfNtries() {
        return this.nbOfNtries;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>nbOfNtries,
     * sum, ttlNetNtryAmt, cdtDbtInd, fcstInd, bkTxCd, avlbty</b>.
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
            case 4:
                return this.nbOfNtries;
            case 5:
                return this.sum;
            case 6:
                return this.ttlNetNtryAmt;
            case 2:
                return this.cdtDbtInd;
            case 3:
                return this.fcstInd;
            case 1:
                return this.bkTxCd;
            case 0:
            if (this.avlbty == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.avlbty[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of Sum (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getSum() {
        return this.sum;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.nbOfNtries == null ? 0 : 1;
        count += this.sum == null ? 0 : 1;
        count += this.ttlNetNtryAmt == null ? 0 : 1;
        count += this.cdtDbtInd == null ? 0 : 1;
        count += this.isfcstIndSet ? 1 : 0;
        count += this.bkTxCd == null ? 0 : 1;
        count += this.avlbty == null ? 0 : this.avlbty.length;
        return count;
    }

    /**
     * Gets the value of TtlNetNtryAmt (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getTtlNetNtryAmt() {
        return this.ttlNetNtryAmt;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(nbOfNtries);
        result = 31 * result + hashCodeOf(sum);
        result = 31 * result + hashCodeOf(ttlNetNtryAmt);
        result = 31 * result + hashCodeOf(cdtDbtInd);
        result = 31 * result + hashCodeOf(fcstInd);
        result = 31 * result + hashCodeOf(isfcstIndSet);
        result = 31 * result + hashCodeOf(bkTxCd);
        result = 31 * result + hashCodeOf(avlbty);
        return result;
    }

    /**
     * Tests whether FcstInd has been set.
     */
    public boolean isFcstIndSet() {
        return isfcstIndSet;
    }

    /**
     * Removes a Avlbty (0..*).
     * 
     * @param index
     * @param index The index of the Avlbty to get.
     */
    public void removeAvlbty(int index) {
        if (this.avlbty == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] temp = this.avlbty;
        this.avlbty = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.avlbty, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.avlbty, index, temp.length-index-1);
        if (this.avlbty.length == 0)
            this.avlbty = null;
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
            case 4:
                setNbOfNtries(null);
                return;
            case 5:
                setSum(null);
                return;
            case 6:
                setTtlNetNtryAmt(null);
                return;
            case 2:
                setCdtDbtInd(null);
                return;
            case 3:
                setFcstInd(false);
                this.isfcstIndSet = false;
                return;
            case 1:
                setBkTxCd(null);
                return;
            case 0:
                removeAvlbty(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Avlbty (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAvlbty(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] value) {
        this.avlbty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.avlbty != null && i<this.avlbty.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.avlbty[i]).setParent(this, "Avlbty");
    }

    /**
     * [Virtual Element] Sets the value of BkTxCd (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBkTxCd(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4 value) {
        this.bkTxCd = value;
        if (this.bkTxCd != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.bkTxCd).setParent(this, "BkTxCd");
    }

    /**
     * [Virtual Element] Sets the value of CdtDbtInd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtDbtInd(java.lang.String value) {
        this.cdtDbtInd = value;
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
            case 4:
                setNbOfNtries((java.lang.String) value);
                return;
            case 5:
                setSum(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 6:
                setTtlNetNtryAmt(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 2:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 3:
                setFcstInd(biz.c24.io.api.Utils.booleanValue(value));
                return;
            case 1:
                setBkTxCd((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4) value);
                return;
            case 0:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]) {
                    setAvlbty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[])value);
                } else if (this.avlbty == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.avlbty[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.avlbty[index]).setParent(this, "Avlbty");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of FcstInd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFcstInd(boolean value) {
        this.fcstInd = value;
        this.isfcstIndSet = true;
    }

    /**
     * [Virtual Element] Sets the value of NbOfNtries (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNbOfNtries(java.lang.String value) {
        this.nbOfNtries = value;
    }

    /**
     * [Virtual Element] Sets the value of Sum (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSum(java.math.BigDecimal value) {
        this.sum = value;
    }

    /**
     * [Virtual Element] Sets the value of TtlNetNtryAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTtlNetNtryAmt(java.math.BigDecimal value) {
        this.ttlNetNtryAmt = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.nbOfNtries);
        out.writeObject(this.sum);
        out.writeObject(this.ttlNetNtryAmt);
        out.writeObject(this.cdtDbtInd);
        out.writeBoolean(this.isfcstIndSet);
        if (this.isfcstIndSet)
            out.writeBoolean(this.fcstInd);
        out.writeObject(this.bkTxCd);
        out.writeObject(this.avlbty);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.nbOfNtries = (java.lang.String) in.readObject();
        this.sum = (java.math.BigDecimal) in.readObject();
        this.ttlNetNtryAmt = (java.math.BigDecimal) in.readObject();
        this.cdtDbtInd = (java.lang.String) in.readObject();
        this.isfcstIndSet = in.readBoolean();
        if (this.isfcstIndSet)
            this.fcstInd = in.readBoolean();
        this.bkTxCd = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4) in.readObject();
        this.avlbty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]) in.readObject();
    }

}
