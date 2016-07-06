/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * NameAndAddress10. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Nm</b> of type {@link java.lang.String} (1)</li>
 * <li><b>Adr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6}
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
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10Cl
 */
public class NameAndAddress10 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Adr", "Nm"};

    /**
     * Field nm.
     */
    private java.lang.String nm;

    /**
     * Field adr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6 adr;

    public NameAndAddress10() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10Cls.getInstance().getNullDefiningElementDecl());
    }

    public NameAndAddress10(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public NameAndAddress10(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public NameAndAddress10(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 clone) {
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
                setNm((java.lang.String) value);
                return;
            case 0:
                setAdr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.NameAndAddress10) clone;
        obj.nm = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nm, obj, "Nm");
        obj.adr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6) biz.c24.io.api.Utils.cloneDeep(this.adr, obj, "Adr");
    }

    /**
     * Creates, adds and returns a new Adr (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6 createAdr() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6) getElementDecl("Adr").createObject();
        setAdr(obj);
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
     * Gets the value of Adr (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6 getAdr() {
        return this.adr;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>nm,
     * adr</b>.
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
                return getNm();
            case 0:
                return getAdr();
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
                return this.nm == null ? 0 : 1;
            case 0:
                return this.adr == null ? 0 : 1;
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
                return this.nm != null && this.nm.equals(element) ? 0 : -1;
            case 0:
                return this.adr != null && this.adr.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Nm (1).
     * 
     * @return The value.
     */
    public java.lang.String getNm() {
        return this.nm;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>nm,
     * adr</b>.
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
                return this.nm;
            case 0:
                return this.adr;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.nm == null ? 0 : 1;
        count += this.adr == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(nm);
        result = 31 * result + hashCodeOf(adr);
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
                setNm(null);
                return;
            case 0:
                setAdr(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Adr (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAdr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6 value) {
        this.adr = value;
        if (this.adr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.adr).setParent(this, "Adr");
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
                setNm((java.lang.String) value);
                return;
            case 0:
                setAdr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Nm (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNm(java.lang.String value) {
        this.nm = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.nm);
        out.writeObject(this.adr);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.nm = (java.lang.String) in.readObject();
        this.adr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PostalAddress6) in.readObject();
    }

}
