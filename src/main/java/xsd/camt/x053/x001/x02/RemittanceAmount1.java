/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * RemittanceAmount1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>DuePyblAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (0..1)</li>
 * <li><b>DscntApldAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (0..1)</li>
 * <li><b>CdtNoteAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (0..1)</li>
 * <li><b>TaxAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (0..1)</li>
 * <li><b>AdjstmntAmtAndRsn</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1}
 * (0..*)</li>
 * <li><b>RmtdAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1Cls
 */
public class RemittanceAmount1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AdjstmntAmtAndRsn", "CdtNoteAmt", "DscntApldAmt", "DuePyblAmt", "RmtdAmt", "TaxAmt"};

    /**
     * Field duePyblAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount duePyblAmt;

    /**
     * Field dscntApldAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount dscntApldAmt;

    /**
     * Field cdtNoteAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount cdtNoteAmt;

    /**
     * Field taxAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount taxAmt;

    /**
     * Field adjstmntAmtAndRsn.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1[] adjstmntAmtAndRsn;

    /**
     * Field rmtdAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount rmtdAmt;

    public RemittanceAmount1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1Cls.getInstance().getNullDefiningElementDecl());
    }

    public RemittanceAmount1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public RemittanceAmount1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public RemittanceAmount1(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1 clone) {
        super(clone);
    }

    /**
     * Adds a AdjstmntAmtAndRsn (0..*).
     * 
     * @param value
     * @param value The new AdjstmntAmtAndRsn.
     */
    public void addAdjstmntAmtAndRsn(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1[] temp = this.adjstmntAmtAndRsn;
        this.adjstmntAmtAndRsn = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.adjstmntAmtAndRsn, 0, temp.length);
        this.adjstmntAmtAndRsn[this.adjstmntAmtAndRsn.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "AdjstmntAmtAndRsn");
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
                setDuePyblAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 2:
                setDscntApldAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 1:
                setCdtNoteAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 5:
                setTaxAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 0:
                addAdjstmntAmtAndRsn((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1) value);
                return;
            case 4:
                setRmtdAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RemittanceAmount1) clone;
        obj.duePyblAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.duePyblAmt, obj, "DuePyblAmt");
        obj.dscntApldAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.dscntApldAmt, obj, "DscntApldAmt");
        obj.cdtNoteAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.cdtNoteAmt, obj, "CdtNoteAmt");
        obj.taxAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.taxAmt, obj, "TaxAmt");
        obj.adjstmntAmtAndRsn = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1[]) biz.c24.io.api.Utils.cloneDeep(this.adjstmntAmtAndRsn, obj, "AdjstmntAmtAndRsn");
        obj.rmtdAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.rmtdAmt, obj, "RmtdAmt");
    }

    /**
     * Creates, adds and returns a new AdjstmntAmtAndRsn (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1 createAdjstmntAmtAndRsn() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1) getElementDecl("AdjstmntAmtAndRsn").createObject();
        addAdjstmntAmtAndRsn(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new CdtNoteAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount createCdtNoteAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("CdtNoteAmt").createObject();
        setCdtNoteAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DscntApldAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount createDscntApldAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("DscntApldAmt").createObject();
        setDscntApldAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DuePyblAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount createDuePyblAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("DuePyblAmt").createObject();
        setDuePyblAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RmtdAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount createRmtdAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("RmtdAmt").createObject();
        setRmtdAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TaxAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount createTaxAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("TaxAmt").createObject();
        setTaxAmt(obj);
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
     * Gets the value of AdjstmntAmtAndRsn (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1[] getAdjstmntAmtAndRsn() {
        if (this.adjstmntAmtAndRsn == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1[]{};
        else
            return this.adjstmntAmtAndRsn;
    }

    /**
     * Gets the value of AdjstmntAmtAndRsn by ordinal position in
     * the collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1 getAdjstmntAmtAndRsn(int ordinal) {
        if (this.adjstmntAmtAndRsn == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.adjstmntAmtAndRsn.length) {
            return this.adjstmntAmtAndRsn[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The AdjstmntAmtAndRsn to get the index of.
     * @return The index.
     */
    public int getAdjstmntAmtAndRsnIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1 value) {
        if (this.adjstmntAmtAndRsn == null)
            return -1;
        for (int i=0; i<this.adjstmntAmtAndRsn.length; i++)
            if (this.adjstmntAmtAndRsn[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of CdtNoteAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount getCdtNoteAmt() {
        return this.cdtNoteAmt;
    }

    /**
     * Gets the value of DscntApldAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount getDscntApldAmt() {
        return this.dscntApldAmt;
    }

    /**
     * Gets the value of DuePyblAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount getDuePyblAmt() {
        return this.duePyblAmt;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>duePyblAmt,
     * dscntApldAmt, cdtNoteAmt, taxAmt, adjstmntAmtAndRsn,
     * rmtdAmt</b>.
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
                return getDuePyblAmt();
            case 2:
                return getDscntApldAmt();
            case 1:
                return getCdtNoteAmt();
            case 5:
                return getTaxAmt();
            case 0:
            if (this.adjstmntAmtAndRsn == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.adjstmntAmtAndRsn[index];
            case 4:
                return getRmtdAmt();
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
                return this.duePyblAmt == null ? 0 : 1;
            case 2:
                return this.dscntApldAmt == null ? 0 : 1;
            case 1:
                return this.cdtNoteAmt == null ? 0 : 1;
            case 5:
                return this.taxAmt == null ? 0 : 1;
            case 0:
                return this.adjstmntAmtAndRsn == null ? 0 : this.adjstmntAmtAndRsn.length;
            case 4:
                return this.rmtdAmt == null ? 0 : 1;
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
                return this.duePyblAmt != null && this.duePyblAmt.equals(element) ? 0 : -1;
            case 2:
                return this.dscntApldAmt != null && this.dscntApldAmt.equals(element) ? 0 : -1;
            case 1:
                return this.cdtNoteAmt != null && this.cdtNoteAmt.equals(element) ? 0 : -1;
            case 5:
                return this.taxAmt != null && this.taxAmt.equals(element) ? 0 : -1;
            case 0:
                return getAdjstmntAmtAndRsnIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1) element);
            case 4:
                return this.rmtdAmt != null && this.rmtdAmt.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>duePyblAmt,
     * dscntApldAmt, cdtNoteAmt, taxAmt, adjstmntAmtAndRsn,
     * rmtdAmt</b>.
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
                return this.duePyblAmt;
            case 2:
                return this.dscntApldAmt;
            case 1:
                return this.cdtNoteAmt;
            case 5:
                return this.taxAmt;
            case 0:
            if (this.adjstmntAmtAndRsn == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.adjstmntAmtAndRsn[index];
            case 4:
                return this.rmtdAmt;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of RmtdAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount getRmtdAmt() {
        return this.rmtdAmt;
    }

    /**
     * Gets the value of TaxAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount getTaxAmt() {
        return this.taxAmt;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.duePyblAmt == null ? 0 : 1;
        count += this.dscntApldAmt == null ? 0 : 1;
        count += this.cdtNoteAmt == null ? 0 : 1;
        count += this.taxAmt == null ? 0 : 1;
        count += this.adjstmntAmtAndRsn == null ? 0 : this.adjstmntAmtAndRsn.length;
        count += this.rmtdAmt == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(duePyblAmt);
        result = 31 * result + hashCodeOf(dscntApldAmt);
        result = 31 * result + hashCodeOf(cdtNoteAmt);
        result = 31 * result + hashCodeOf(taxAmt);
        result = 31 * result + hashCodeOf(adjstmntAmtAndRsn);
        result = 31 * result + hashCodeOf(rmtdAmt);
        return result;
    }

    /**
     * Removes a AdjstmntAmtAndRsn (0..*).
     * 
     * @param index
     * @param index The index of the AdjstmntAmtAndRsn to get.
     */
    public void removeAdjstmntAmtAndRsn(int index) {
        if (this.adjstmntAmtAndRsn == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1[] temp = this.adjstmntAmtAndRsn;
        this.adjstmntAmtAndRsn = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.adjstmntAmtAndRsn, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.adjstmntAmtAndRsn, index, temp.length-index-1);
        if (this.adjstmntAmtAndRsn.length == 0)
            this.adjstmntAmtAndRsn = null;
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
                setDuePyblAmt(null);
                return;
            case 2:
                setDscntApldAmt(null);
                return;
            case 1:
                setCdtNoteAmt(null);
                return;
            case 5:
                setTaxAmt(null);
                return;
            case 0:
                removeAdjstmntAmtAndRsn(index);
                return;
            case 4:
                setRmtdAmt(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of AdjstmntAmtAndRsn
     * (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAdjstmntAmtAndRsn(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1[] value) {
        this.adjstmntAmtAndRsn = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.adjstmntAmtAndRsn != null && i<this.adjstmntAmtAndRsn.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.adjstmntAmtAndRsn[i]).setParent(this, "AdjstmntAmtAndRsn");
    }

    /**
     * [Virtual Element] Sets the value of CdtNoteAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtNoteAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
        this.cdtNoteAmt = value;
        if (this.cdtNoteAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtNoteAmt).setParent(this, "CdtNoteAmt");
    }

    /**
     * [Virtual Element] Sets the value of DscntApldAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDscntApldAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
        this.dscntApldAmt = value;
        if (this.dscntApldAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dscntApldAmt).setParent(this, "DscntApldAmt");
    }

    /**
     * [Virtual Element] Sets the value of DuePyblAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDuePyblAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
        this.duePyblAmt = value;
        if (this.duePyblAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.duePyblAmt).setParent(this, "DuePyblAmt");
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
                setDuePyblAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 2:
                setDscntApldAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 1:
                setCdtNoteAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 5:
                setTaxAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 0:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1[]) {
                    setAdjstmntAmtAndRsn((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1[])value);
                } else if (this.adjstmntAmtAndRsn == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.adjstmntAmtAndRsn[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.adjstmntAmtAndRsn[index]).setParent(this, "AdjstmntAmtAndRsn");
                }
                return;
            case 4:
                setRmtdAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of RmtdAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRmtdAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
        this.rmtdAmt = value;
        if (this.rmtdAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rmtdAmt).setParent(this, "RmtdAmt");
    }

    /**
     * [Virtual Element] Sets the value of TaxAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTaxAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
        this.taxAmt = value;
        if (this.taxAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.taxAmt).setParent(this, "TaxAmt");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.duePyblAmt);
        out.writeObject(this.dscntApldAmt);
        out.writeObject(this.cdtNoteAmt);
        out.writeObject(this.taxAmt);
        out.writeObject(this.adjstmntAmtAndRsn);
        out.writeObject(this.rmtdAmt);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.duePyblAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.dscntApldAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.cdtNoteAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.taxAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.adjstmntAmtAndRsn = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DocumentAdjustment1[]) in.readObject();
        this.rmtdAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
    }

}
