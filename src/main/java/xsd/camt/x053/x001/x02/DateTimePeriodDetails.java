/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * DateTimePeriodDetails. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>FrDtTm</b> of type {@link
 * biz.c24.io.api.data.ISO8601DateTime} (1)</li>
 * <li><b>ToDtTm</b> of type {@link
 * biz.c24.io.api.data.ISO8601DateTime} (1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetailsCls
 */
public class DateTimePeriodDetails extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"FrDtTm", "ToDtTm"};

    /**
     * Field frDtTm.
     */
    private biz.c24.io.api.data.ISO8601DateTime frDtTm;

    /**
     * Field toDtTm.
     */
    private biz.c24.io.api.data.ISO8601DateTime toDtTm;

    public DateTimePeriodDetails() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetailsCls.getInstance().getNullDefiningElementDecl());
    }

    public DateTimePeriodDetails(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public DateTimePeriodDetails(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public DateTimePeriodDetails(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails clone) {
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
                setFrDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 1:
                setToDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateTimePeriodDetails) clone;
        obj.frDtTm = (biz.c24.io.api.data.ISO8601DateTime) biz.c24.io.api.Utils.cloneDeep(this.frDtTm, obj, "FrDtTm");
        obj.toDtTm = (biz.c24.io.api.data.ISO8601DateTime) biz.c24.io.api.Utils.cloneDeep(this.toDtTm, obj, "ToDtTm");
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
     * The legal value(s) for <code>name</code> are: <b>frDtTm,
     * toDtTm</b>.
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
                return getFrDtTm();
            case 1:
                return getToDtTm();
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
                return this.frDtTm == null ? 0 : 1;
            case 1:
                return this.toDtTm == null ? 0 : 1;
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
                return this.frDtTm != null && this.frDtTm.equals(element) ? 0 : -1;
            case 1:
                return this.toDtTm != null && this.toDtTm.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FrDtTm (1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601DateTime getFrDtTm() {
        return this.frDtTm;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>frDtTm,
     * toDtTm</b>.
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
                return this.frDtTm;
            case 1:
                return this.toDtTm;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of ToDtTm (1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601DateTime getToDtTm() {
        return this.toDtTm;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.frDtTm == null ? 0 : 1;
        count += this.toDtTm == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(frDtTm);
        result = 31 * result + hashCodeOf(toDtTm);
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
                setFrDtTm(null);
                return;
            case 1:
                setToDtTm(null);
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
                setFrDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 1:
                setToDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of FrDtTm (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFrDtTm(biz.c24.io.api.data.ISO8601DateTime value) {
        this.frDtTm = value;
    }

    /**
     * [Virtual Element] Sets the value of ToDtTm (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setToDtTm(biz.c24.io.api.data.ISO8601DateTime value) {
        this.toDtTm = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.frDtTm);
        out.writeObject(this.toDtTm);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.frDtTm = (biz.c24.io.api.data.ISO8601DateTime) in.readObject();
        this.toDtTm = (biz.c24.io.api.data.ISO8601DateTime) in.readObject();
    }

}
