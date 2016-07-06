/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * CorporateAction1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Cd</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Nb</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Prtry</b> of type {@link java.lang.String} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CorporateAction1Cl
 */
public class CorporateAction1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Cd", "Nb", "Prtry"};

    /**
     * Field cd.
     */
    private java.lang.String cd;

    /**
     * Field nb.
     */
    private java.lang.String nb;

    /**
     * Field prtry.
     */
    private java.lang.String prtry;

    public CorporateAction1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CorporateAction1Cls.getInstance().getNullDefiningElementDecl());
    }

    public CorporateAction1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public CorporateAction1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public CorporateAction1(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CorporateAction1 clone) {
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
                setCd((java.lang.String) value);
                return;
            case 1:
                setNb((java.lang.String) value);
                return;
            case 2:
                setPrtry((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CorporateAction1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CorporateAction1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CorporateAction1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CorporateAction1) clone;
        obj.cd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cd, obj, "Cd");
        obj.nb = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nb, obj, "Nb");
        obj.prtry = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.prtry, obj, "Prtry");
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
     * Gets the value of Cd (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCd() {
        return this.cd;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>cd, nb,
     * prtry</b>.
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
                return getCd();
            case 1:
                return getNb();
            case 2:
                return getPrtry();
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
                return this.cd == null ? 0 : 1;
            case 1:
                return this.nb == null ? 0 : 1;
            case 2:
                return this.prtry == null ? 0 : 1;
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
                return this.cd != null && this.cd.equals(element) ? 0 : -1;
            case 1:
                return this.nb != null && this.nb.equals(element) ? 0 : -1;
            case 2:
                return this.prtry != null && this.prtry.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Nb (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getNb() {
        return this.nb;
    }

    /**
     * Gets the value of Prtry (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getPrtry() {
        return this.prtry;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>cd, nb,
     * prtry</b>.
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
                return this.cd;
            case 1:
                return this.nb;
            case 2:
                return this.prtry;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.cd == null ? 0 : 1;
        count += this.nb == null ? 0 : 1;
        count += this.prtry == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(cd);
        result = 31 * result + hashCodeOf(nb);
        result = 31 * result + hashCodeOf(prtry);
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
                setCd(null);
                return;
            case 1:
                setNb(null);
                return;
            case 2:
                setPrtry(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Cd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCd(java.lang.String value) {
        this.cd = value;
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
                setCd((java.lang.String) value);
                return;
            case 1:
                setNb((java.lang.String) value);
                return;
            case 2:
                setPrtry((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Nb (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNb(java.lang.String value) {
        this.nb = value;
    }

    /**
     * [Virtual Element] Sets the value of Prtry (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrtry(java.lang.String value) {
        this.prtry = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.cd);
        out.writeObject(this.nb);
        out.writeObject(this.prtry);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.cd = (java.lang.String) in.readObject();
        this.nb = (java.lang.String) in.readObject();
        this.prtry = (java.lang.String) in.readObject();
    }

}
