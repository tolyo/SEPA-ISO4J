/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TimePeriodDetails1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>FrTm</b> of type {@link biz.c24.io.api.data.ISO8601Time}
 * (1)</li>
 * <li><b>ToTm</b> of type {@link biz.c24.io.api.data.ISO8601Time}
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
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TimePeriodDetails1Cls
 */
public class TimePeriodDetails1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"FrTm", "ToTm"};

    /**
     * Field frTm.
     */
    private biz.c24.io.api.data.ISO8601Time frTm;

    /**
     * Field toTm.
     */
    private biz.c24.io.api.data.ISO8601Time toTm;

    public TimePeriodDetails1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TimePeriodDetails1Cls.getInstance().getNullDefiningElementDecl());
    }

    public TimePeriodDetails1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TimePeriodDetails1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TimePeriodDetails1(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TimePeriodDetails1 clone) {
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
                setFrTm((biz.c24.io.api.data.ISO8601Time) value);
                return;
            case 1:
                setToTm((biz.c24.io.api.data.ISO8601Time) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TimePeriodDetails1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TimePeriodDetails1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TimePeriodDetails1 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TimePeriodDetails1) clone;
        obj.frTm = (biz.c24.io.api.data.ISO8601Time) biz.c24.io.api.Utils.cloneDeep(this.frTm, obj, "FrTm");
        obj.toTm = (biz.c24.io.api.data.ISO8601Time) biz.c24.io.api.Utils.cloneDeep(this.toTm, obj, "ToTm");
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
     * The legal value(s) for <code>name</code> are: <b>frTm,
     * toTm</b>.
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
                return getFrTm();
            case 1:
                return getToTm();
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
                return this.frTm == null ? 0 : 1;
            case 1:
                return this.toTm == null ? 0 : 1;
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
                return this.frTm != null && this.frTm.equals(element) ? 0 : -1;
            case 1:
                return this.toTm != null && this.toTm.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FrTm (1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Time getFrTm() {
        return this.frTm;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>frTm,
     * toTm</b>.
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
                return this.frTm;
            case 1:
                return this.toTm;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of ToTm (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Time getToTm() {
        return this.toTm;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.frTm == null ? 0 : 1;
        count += this.toTm == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(frTm);
        result = 31 * result + hashCodeOf(toTm);
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
                setFrTm(null);
                return;
            case 1:
                setToTm(null);
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
                setFrTm((biz.c24.io.api.data.ISO8601Time) value);
                return;
            case 1:
                setToTm((biz.c24.io.api.data.ISO8601Time) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of FrTm (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFrTm(biz.c24.io.api.data.ISO8601Time value) {
        this.frTm = value;
    }

    /**
     * [Virtual Element] Sets the value of ToTm (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setToTm(biz.c24.io.api.data.ISO8601Time value) {
        this.toTm = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.frTm);
        out.writeObject(this.toTm);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.frTm = (biz.c24.io.api.data.ISO8601Time) in.readObject();
        this.toTm = (biz.c24.io.api.data.ISO8601Time) in.readObject();
    }

}
