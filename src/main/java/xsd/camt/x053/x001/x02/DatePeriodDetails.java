/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * DatePeriodDetails. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>FrDt</b> of type {@link biz.c24.io.api.data.ISO8601Date}
 * (1)</li>
 * <li><b>ToDt</b> of type {@link biz.c24.io.api.data.ISO8601Date}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetailsCls
 */
public class DatePeriodDetails extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"FrDt", "ToDt"};

    /**
     * Field frDt.
     */
    private biz.c24.io.api.data.ISO8601Date frDt;

    /**
     * Field toDt.
     */
    private biz.c24.io.api.data.ISO8601Date toDt;

    public DatePeriodDetails() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetailsCls.getInstance().getNullDefiningElementDecl());
    }

    public DatePeriodDetails(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public DatePeriodDetails(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public DatePeriodDetails(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails clone) {
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
                setFrDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 1:
                setToDt((biz.c24.io.api.data.ISO8601Date) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DatePeriodDetails) clone;
        obj.frDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.frDt, obj, "FrDt");
        obj.toDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.toDt, obj, "ToDt");
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
     * The legal value(s) for <code>name</code> are: <b>frDt,
     * toDt</b>.
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
                return getFrDt();
            case 1:
                return getToDt();
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
                return this.frDt == null ? 0 : 1;
            case 1:
                return this.toDt == null ? 0 : 1;
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
                return this.frDt != null && this.frDt.equals(element) ? 0 : -1;
            case 1:
                return this.toDt != null && this.toDt.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FrDt (1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getFrDt() {
        return this.frDt;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>frDt,
     * toDt</b>.
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
                return this.frDt;
            case 1:
                return this.toDt;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of ToDt (1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getToDt() {
        return this.toDt;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.frDt == null ? 0 : 1;
        count += this.toDt == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(frDt);
        result = 31 * result + hashCodeOf(toDt);
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
                setFrDt(null);
                return;
            case 1:
                setToDt(null);
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
                setFrDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 1:
                setToDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of FrDt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFrDt(biz.c24.io.api.data.ISO8601Date value) {
        this.frDt = value;
    }

    /**
     * [Virtual Element] Sets the value of ToDt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setToDt(biz.c24.io.api.data.ISO8601Date value) {
        this.toDt = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.frDt);
        out.writeObject(this.toDt);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.frDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.toDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
    }

}
