/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * AmountRangeBoundary1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>BdryAmt</b> of type {@link java.math.BigDecimal} (1)</li>
 * <li><b>Incl</b> of type <code>boolean</code> (1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountRangeBoundary1Cls
 */
public class AmountRangeBoundary1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"BdryAmt", "Incl"};

    /**
     * Field bdryAmt.
     */
    private java.math.BigDecimal bdryAmt;

    /**
     * Field incl.
     */
    private boolean incl;

    /**
     * Field isinclSet.
     */
    private boolean isinclSet;

    public AmountRangeBoundary1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountRangeBoundary1Cls.getInstance().getNullDefiningElementDecl());
    }

    public AmountRangeBoundary1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public AmountRangeBoundary1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public AmountRangeBoundary1(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountRangeBoundary1 clone) {
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
                setBdryAmt(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 1:
                setIncl(biz.c24.io.api.Utils.booleanValue(value));
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountRangeBoundary1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountRangeBoundary1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountRangeBoundary1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountRangeBoundary1) clone;
        obj.bdryAmt = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.bdryAmt, obj, "BdryAmt");
        obj.isinclSet = this.isinclSet;
        obj.incl = this.incl;
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
     * Gets the value of BdryAmt (1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getBdryAmt() {
        return this.bdryAmt;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>bdryAmt,
     * incl</b>.
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
                return getBdryAmt();
            case 1:
                return getIncl();
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
                return this.bdryAmt == null ? 0 : 1;
            case 1:
                return this.isinclSet ? 1 : 0;
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
                return this.bdryAmt != null && this.bdryAmt.equals(element) ? 0 : -1;
            case 1:
                return this.isinclSet ? (this.incl == biz.c24.io.api.Utils.booleanValue(element) ? 0 : -1) : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Incl (1).
     * 
     * @return The value.
     */
    public boolean getIncl() {
        return this.incl;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>bdryAmt,
     * incl</b>.
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
                return this.bdryAmt;
            case 1:
                return this.incl;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.bdryAmt == null ? 0 : 1;
        count += this.isinclSet ? 1 : 0;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(bdryAmt);
        result = 31 * result + hashCodeOf(incl);
        result = 31 * result + hashCodeOf(isinclSet);
        return result;
    }

    /**
     * Tests whether Incl has been set.
     */
    public boolean isInclSet() {
        return isinclSet;
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
                setBdryAmt(null);
                return;
            case 1:
                setIncl(false);
                this.isinclSet = false;
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of BdryAmt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBdryAmt(java.math.BigDecimal value) {
        this.bdryAmt = value;
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
                setBdryAmt(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 1:
                setIncl(biz.c24.io.api.Utils.booleanValue(value));
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Incl (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIncl(boolean value) {
        this.incl = value;
        this.isinclSet = true;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.bdryAmt);
        out.writeBoolean(this.isinclSet);
        if (this.isinclSet)
            out.writeBoolean(this.incl);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.bdryAmt = (java.math.BigDecimal) in.readObject();
        this.isinclSet = in.readBoolean();
        if (this.isinclSet)
            this.incl = in.readBoolean();
    }

}
