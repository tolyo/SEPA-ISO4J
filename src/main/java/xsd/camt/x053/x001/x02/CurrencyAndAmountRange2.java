/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * CurrencyAndAmountRange2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Amt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ImpliedCurrencyAmountRangeChoice}
 * (1)</li>
 * <li><b>CdtDbtInd</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>Ccy</b> of type {@link java.lang.String} (1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2Cls
 */
public class CurrencyAndAmountRange2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Amt", "Ccy", "CdtDbtInd"};

    /**
     * Field amt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ImpliedCurrencyAmountRangeChoice amt;

    /**
     * Field cdtDbtInd.
     */
    private java.lang.String cdtDbtInd;

    /**
     * Field ccy.
     */
    private java.lang.String ccy;

    public CurrencyAndAmountRange2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2Cls.getInstance().getNullDefiningElementDecl());
    }

    public CurrencyAndAmountRange2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public CurrencyAndAmountRange2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public CurrencyAndAmountRange2(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2 clone) {
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
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ImpliedCurrencyAmountRangeChoice) value);
                return;
            case 2:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 1:
                setCcy((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2) clone;
        obj.amt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ImpliedCurrencyAmountRangeChoice) biz.c24.io.api.Utils.cloneDeep(this.amt, obj, "Amt");
        obj.cdtDbtInd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cdtDbtInd, obj, "CdtDbtInd");
        obj.ccy = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.ccy, obj, "Ccy");
    }

    /**
     * Creates, adds and returns a new Amt (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ImpliedCurrencyAmountRangeChoice createAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ImpliedCurrencyAmountRangeChoice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ImpliedCurrencyAmountRangeChoice) getElementDecl("Amt").createObject();
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
     * Gets the value of Amt (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ImpliedCurrencyAmountRangeChoice getAmt() {
        return this.amt;
    }

    /**
     * Gets the value of Ccy (1).
     * 
     * @return The value.
     */
    public java.lang.String getCcy() {
        return this.ccy;
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
     * cdtDbtInd, ccy</b>.
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
            case 0:
                return getAmt();
            case 2:
                return getCdtDbtInd();
            case 1:
                return getCcy();
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
            case 0:
                return this.amt == null ? 0 : 1;
            case 2:
                return this.cdtDbtInd == null ? 0 : 1;
            case 1:
                return this.ccy == null ? 0 : 1;
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
            case 0:
                return this.amt != null && this.amt.equals(element) ? 0 : -1;
            case 2:
                return this.cdtDbtInd != null && this.cdtDbtInd.equals(element) ? 0 : -1;
            case 1:
                return this.ccy != null && this.ccy.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>amt,
     * cdtDbtInd, ccy</b>.
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
            case 0:
                return this.amt;
            case 2:
                return this.cdtDbtInd;
            case 1:
                return this.ccy;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.amt == null ? 0 : 1;
        count += this.cdtDbtInd == null ? 0 : 1;
        count += this.ccy == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(amt);
        result = 31 * result + hashCodeOf(cdtDbtInd);
        result = 31 * result + hashCodeOf(ccy);
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
            case 0:
                setAmt(null);
                return;
            case 2:
                setCdtDbtInd(null);
                return;
            case 1:
                setCcy(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Amt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ImpliedCurrencyAmountRangeChoice value) {
        this.amt = value;
        if (this.amt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.amt).setParent(this, "Amt");
    }

    /**
     * [Virtual Element] Sets the value of Ccy (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCcy(java.lang.String value) {
        this.ccy = value;
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
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ImpliedCurrencyAmountRangeChoice) value);
                return;
            case 2:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 1:
                setCcy((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.amt);
        out.writeObject(this.cdtDbtInd);
        out.writeObject(this.ccy);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.amt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ImpliedCurrencyAmountRangeChoice) in.readObject();
        this.cdtDbtInd = (java.lang.String) in.readObject();
        this.ccy = (java.lang.String) in.readObject();
    }

}
