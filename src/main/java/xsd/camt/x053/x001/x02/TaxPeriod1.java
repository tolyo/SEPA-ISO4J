/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TaxPeriod1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Yr</b> of type {@link biz.c24.io.api.data.ISO8601Date}
 * (0..1)</li>
 * <li><b>Tp</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>FrToDt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails}
 * (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxPeriod1Cls
 */
public class TaxPeriod1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"FrToDt", "Tp", "Yr"};

    /**
     * Field yr.
     */
    private biz.c24.io.api.data.ISO8601Date yr;

    /**
     * Field tp.
     */
    private java.lang.String tp;

    /**
     * Field frToDt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails frToDt;

    public TaxPeriod1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxPeriod1Cls.getInstance().getNullDefiningElementDecl());
    }

    public TaxPeriod1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TaxPeriod1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TaxPeriod1(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxPeriod1 clone) {
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
            case 2:
                setYr((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 1:
                setTp((java.lang.String) value);
                return;
            case 0:
                setFrToDt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxPeriod1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxPeriod1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxPeriod1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TaxPeriod1) clone;
        obj.yr = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.yr, obj, "Yr");
        obj.tp = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.tp, obj, "Tp");
        obj.frToDt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails) biz.c24.io.api.Utils.cloneDeep(this.frToDt, obj, "FrToDt");
    }

    /**
     * Creates, adds and returns a new FrToDt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails createFrToDt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails) getElementDecl("FrToDt").createObject();
        setFrToDt(obj);
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
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>yr, tp,
     * frToDt</b>.
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
            case 2:
                return getYr();
            case 1:
                return getTp();
            case 0:
                return getFrToDt();
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
            case 2:
                return this.yr == null ? 0 : 1;
            case 1:
                return this.tp == null ? 0 : 1;
            case 0:
                return this.frToDt == null ? 0 : 1;
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
            case 2:
                return this.yr != null && this.yr.equals(element) ? 0 : -1;
            case 1:
                return this.tp != null && this.tp.equals(element) ? 0 : -1;
            case 0:
                return this.frToDt != null && this.frToDt.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FrToDt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails getFrToDt() {
        return this.frToDt;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>yr, tp,
     * frToDt</b>.
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
            case 2:
                return this.yr;
            case 1:
                return this.tp;
            case 0:
                return this.frToDt;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.yr == null ? 0 : 1;
        count += this.tp == null ? 0 : 1;
        count += this.frToDt == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of Tp (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getTp() {
        return this.tp;
    }

    /**
     * Gets the value of Yr (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getYr() {
        return this.yr;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(yr);
        result = 31 * result + hashCodeOf(tp);
        result = 31 * result + hashCodeOf(frToDt);
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
            case 2:
                setYr(null);
                return;
            case 1:
                setTp(null);
                return;
            case 0:
                setFrToDt(null);
                return;
            default:
            super.removeElement(name, index);
        }
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
            case 2:
                setYr((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 1:
                setTp((java.lang.String) value);
                return;
            case 0:
                setFrToDt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails) value);
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
    public void setFrToDt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails value) {
        this.frToDt = value;
        if (this.frToDt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.frToDt).setParent(this, "FrToDt");
    }

    /**
     * [Virtual Element] Sets the value of Tp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTp(java.lang.String value) {
        this.tp = value;
    }

    /**
     * [Virtual Element] Sets the value of Yr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setYr(biz.c24.io.api.data.ISO8601Date value) {
        this.yr = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.yr);
        out.writeObject(this.tp);
        out.writeObject(this.frToDt);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.yr = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.tp = (java.lang.String) in.readObject();
        this.frToDt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails) in.readObject();
    }

}
