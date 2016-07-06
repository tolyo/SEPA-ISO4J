/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TaxRecordDetails1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Prd</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1}
 * (0..1)</li>
 * <li><b>Amt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1Cls
 */
public class TaxRecordDetails1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Amt", "Prd"};

    /**
     * Field prd.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1 prd;

    /**
     * Field amt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount amt;

    public TaxRecordDetails1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1Cls.getInstance().getNullDefiningElementDecl());
    }

    public TaxRecordDetails1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TaxRecordDetails1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TaxRecordDetails1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1 clone) {
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
                setPrd((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxRecordDetails1) clone;
        obj.prd = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1) biz.c24.io.api.Utils.cloneDeep(this.prd, obj, "Prd");
        obj.amt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.amt, obj, "Amt");
    }

    /**
     * Creates, adds and returns a new Amt (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount createAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("Amt").createObject();
        setAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Prd (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1 createPrd() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1) getElementDecl("Prd").createObject();
        setPrd(obj);
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
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount getAmt() {
        return this.amt;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>prd,
     * amt</b>.
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
                return getPrd();
            case 0:
                return getAmt();
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
                return this.prd == null ? 0 : 1;
            case 0:
                return this.amt == null ? 0 : 1;
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
                return this.prd != null && this.prd.equals(element) ? 0 : -1;
            case 0:
                return this.amt != null && this.amt.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Prd (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1 getPrd() {
        return this.prd;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>prd,
     * amt</b>.
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
                return this.prd;
            case 0:
                return this.amt;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.prd == null ? 0 : 1;
        count += this.amt == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(prd);
        result = 31 * result + hashCodeOf(amt);
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
                setPrd(null);
                return;
            case 0:
                setAmt(null);
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
    public void setAmt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        if (this.amt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.amt).setParent(this, "Amt");
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
                setPrd((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Prd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrd(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1 value) {
        this.prd = value;
        if (this.prd != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.prd).setParent(this, "Prd");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.prd);
        out.writeObject(this.amt);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.prd = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxPeriod1) in.readObject();
        this.amt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
    }

}
