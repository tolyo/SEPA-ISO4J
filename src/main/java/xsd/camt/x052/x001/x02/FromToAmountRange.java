/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * FromToAmountRange. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>FrAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1}
 * (1)</li>
 * <li><b>ToAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRangeCls
 */
public class FromToAmountRange extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"FrAmt", "ToAmt"};

    /**
     * Field frAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 frAmt;

    /**
     * Field toAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 toAmt;

    public FromToAmountRange() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRangeCls.getInstance().getNullDefiningElementDecl());
    }

    public FromToAmountRange(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public FromToAmountRange(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public FromToAmountRange(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange clone) {
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
                setFrAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) value);
                return;
            case 1:
                setToAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRange) clone;
        obj.frAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) biz.c24.io.api.Utils.cloneDeep(this.frAmt, obj, "FrAmt");
        obj.toAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) biz.c24.io.api.Utils.cloneDeep(this.toAmt, obj, "ToAmt");
    }

    /**
     * Creates, adds and returns a new FrAmt (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 createFrAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) getElementDecl("FrAmt").createObject();
        setFrAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new ToAmt (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 createToAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) getElementDecl("ToAmt").createObject();
        setToAmt(obj);
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
     * The legal value(s) for <code>name</code> are: <b>frAmt,
     * toAmt</b>.
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
                return getFrAmt();
            case 1:
                return getToAmt();
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
                return this.frAmt == null ? 0 : 1;
            case 1:
                return this.toAmt == null ? 0 : 1;
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
                return this.frAmt != null && this.frAmt.equals(element) ? 0 : -1;
            case 1:
                return this.toAmt != null && this.toAmt.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FrAmt (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 getFrAmt() {
        return this.frAmt;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>frAmt,
     * toAmt</b>.
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
                return this.frAmt;
            case 1:
                return this.toAmt;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of ToAmt (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 getToAmt() {
        return this.toAmt;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.frAmt == null ? 0 : 1;
        count += this.toAmt == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(frAmt);
        result = 31 * result + hashCodeOf(toAmt);
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
                setFrAmt(null);
                return;
            case 1:
                setToAmt(null);
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
            case 0:
                setFrAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) value);
                return;
            case 1:
                setToAmt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of FrAmt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFrAmt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 value) {
        this.frAmt = value;
        if (this.frAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.frAmt).setParent(this, "FrAmt");
    }

    /**
     * [Virtual Element] Sets the value of ToAmt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setToAmt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1 value) {
        this.toAmt = value;
        if (this.toAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.toAmt).setParent(this, "ToAmt");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.frAmt);
        out.writeObject(this.toAmt);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.frAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) in.readObject();
        this.toAmt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1) in.readObject();
    }

}
