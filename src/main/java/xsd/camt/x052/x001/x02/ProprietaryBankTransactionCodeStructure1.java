/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * ProprietaryBankTransactionCodeStructure1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Cd</b> of type {@link java.lang.String} (1)</li>
 * <li><b>Issr</b> of type {@link java.lang.String} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryBankTransactionCodeStructure1Cls
 */
public class ProprietaryBankTransactionCodeStructure1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Cd", "Issr"};

    /**
     * Field cd.
     */
    private java.lang.String cd;

    /**
     * Field issr.
     */
    private java.lang.String issr;

    public ProprietaryBankTransactionCodeStructure1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryBankTransactionCodeStructure1Cls.getInstance().getNullDefiningElementDecl());
    }

    public ProprietaryBankTransactionCodeStructure1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public ProprietaryBankTransactionCodeStructure1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public ProprietaryBankTransactionCodeStructure1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryBankTransactionCodeStructure1 clone) {
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
                setIssr((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryBankTransactionCodeStructure1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryBankTransactionCodeStructure1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryBankTransactionCodeStructure1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryBankTransactionCodeStructure1) clone;
        obj.cd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cd, obj, "Cd");
        obj.issr = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.issr, obj, "Issr");
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
     * Gets the value of Cd (1).
     * 
     * @return The value.
     */
    public java.lang.String getCd() {
        return this.cd;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>cd,
     * issr</b>.
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
                return getIssr();
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
                return this.issr == null ? 0 : 1;
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
                return this.issr != null && this.issr.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Issr (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getIssr() {
        return this.issr;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>cd,
     * issr</b>.
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
                return this.issr;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.cd == null ? 0 : 1;
        count += this.issr == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(cd);
        result = 31 * result + hashCodeOf(issr);
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
                setIssr(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Cd (1).
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
                setIssr((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Issr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIssr(java.lang.String value) {
        this.issr = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.cd);
        out.writeObject(this.issr);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.cd = (java.lang.String) in.readObject();
        this.issr = (java.lang.String) in.readObject();
    }

}
