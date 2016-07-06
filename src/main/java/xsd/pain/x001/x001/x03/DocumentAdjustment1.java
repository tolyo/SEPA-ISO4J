/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * DocumentAdjustment1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Amt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount}
 * (1)</li>
 * <li><b>CdtDbtInd</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>Rsn</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>AddtlInf</b> of type {@link java.lang.String} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.DocumentAdjustment1Cls
 */
public class DocumentAdjustment1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AddtlInf", "Amt", "CdtDbtInd", "Rsn"};

    /**
     * Field amt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount amt;

    /**
     * Field cdtDbtInd.
     */
    private java.lang.String cdtDbtInd;

    /**
     * Field rsn.
     */
    private java.lang.String rsn;

    /**
     * Field addtlInf.
     */
    private java.lang.String addtlInf;

    public DocumentAdjustment1() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.DocumentAdjustment1Cls.getInstance().getNullDefiningElementDecl());
    }

    public DocumentAdjustment1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public DocumentAdjustment1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public DocumentAdjustment1(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.DocumentAdjustment1 clone) {
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
            case 1:
                setAmt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 2:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 3:
                setRsn((java.lang.String) value);
                return;
            case 0:
                setAddtlInf((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.DocumentAdjustment1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.DocumentAdjustment1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.DocumentAdjustment1 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.DocumentAdjustment1) clone;
        obj.amt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.amt, obj, "Amt");
        obj.cdtDbtInd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cdtDbtInd, obj, "CdtDbtInd");
        obj.rsn = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.rsn, obj, "Rsn");
        obj.addtlInf = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.addtlInf, obj, "AddtlInf");
    }

    /**
     * Creates, adds and returns a new Amt (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount createAmt() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount) getElementDecl("Amt").createObject();
        setAmt(obj);
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
     * Gets the value of AddtlInf (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getAddtlInf() {
        return this.addtlInf;
    }

    /**
     * Gets the value of Amt (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount getAmt() {
        return this.amt;
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
     * The legal value(s) for <code>name</code> are: <b>amt,
     * cdtDbtInd, rsn, addtlInf</b>.
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
            case 1:
                return getAmt();
            case 2:
                return getCdtDbtInd();
            case 3:
                return getRsn();
            case 0:
                return getAddtlInf();
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
            case 1:
                return this.amt == null ? 0 : 1;
            case 2:
                return this.cdtDbtInd == null ? 0 : 1;
            case 3:
                return this.rsn == null ? 0 : 1;
            case 0:
                return this.addtlInf == null ? 0 : 1;
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
            case 1:
                return this.amt != null && this.amt.equals(element) ? 0 : -1;
            case 2:
                return this.cdtDbtInd != null && this.cdtDbtInd.equals(element) ? 0 : -1;
            case 3:
                return this.rsn != null && this.rsn.equals(element) ? 0 : -1;
            case 0:
                return this.addtlInf != null && this.addtlInf.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>amt,
     * cdtDbtInd, rsn, addtlInf</b>.
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
            case 1:
                return this.amt;
            case 2:
                return this.cdtDbtInd;
            case 3:
                return this.rsn;
            case 0:
                return this.addtlInf;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of Rsn (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getRsn() {
        return this.rsn;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.amt == null ? 0 : 1;
        count += this.cdtDbtInd == null ? 0 : 1;
        count += this.rsn == null ? 0 : 1;
        count += this.addtlInf == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(amt);
        result = 31 * result + hashCodeOf(cdtDbtInd);
        result = 31 * result + hashCodeOf(rsn);
        result = 31 * result + hashCodeOf(addtlInf);
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
            case 1:
                setAmt(null);
                return;
            case 2:
                setCdtDbtInd(null);
                return;
            case 3:
                setRsn(null);
                return;
            case 0:
                setAddtlInf(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of AddtlInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAddtlInf(java.lang.String value) {
        this.addtlInf = value;
    }

    /**
     * [Virtual Element] Sets the value of Amt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAmt(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        if (this.amt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.amt).setParent(this, "Amt");
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
            case 1:
                setAmt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 2:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 3:
                setRsn((java.lang.String) value);
                return;
            case 0:
                setAddtlInf((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Rsn (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRsn(java.lang.String value) {
        this.rsn = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.amt);
        out.writeObject(this.cdtDbtInd);
        out.writeObject(this.rsn);
        out.writeObject(this.addtlInf);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.amt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.cdtDbtInd = (java.lang.String) in.readObject();
        this.rsn = (java.lang.String) in.readObject();
        this.addtlInf = (java.lang.String) in.readObject();
    }

}
