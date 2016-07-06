/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * AccountIdentification4Choice. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>IBAN</b> of type {@link java.lang.String} (1)</li>
 * <li><b>Othr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GenericAccountIdentification1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountIdentification4ChoiceCls
 */
public class AccountIdentification4Choice extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"IBAN", "Othr"};

    /**
     * Field iBAN.
     */
    private java.lang.String iBAN;

    /**
     * Field othr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GenericAccountIdentification1 othr;

    public AccountIdentification4Choice() {
        this(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountIdentification4ChoiceCls.getInstance().getNullDefiningElementDecl());
    }

    public AccountIdentification4Choice(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public AccountIdentification4Choice(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public AccountIdentification4Choice(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountIdentification4Choice clone) {
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
                setIBAN((java.lang.String) value);
                return;
            case 1:
                setOthr((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GenericAccountIdentification1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountIdentification4Choice(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountIdentification4Choice(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountIdentification4Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountIdentification4Choice) clone;
        obj.iBAN = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.iBAN, obj, "IBAN");
        obj.othr = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GenericAccountIdentification1) biz.c24.io.api.Utils.cloneDeep(this.othr, obj, "Othr");
    }

    /**
     * Creates, adds and returns a new Othr (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GenericAccountIdentification1 createOthr() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GenericAccountIdentification1 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GenericAccountIdentification1) getElementDecl("Othr").createObject();
        setOthr(obj);
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
     * The legal value(s) for <code>name</code> are: <b>iBAN,
     * othr</b>.
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
                return getIBAN();
            case 1:
                return getOthr();
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
                return this.iBAN == null ? 0 : 1;
            case 1:
                return this.othr == null ? 0 : 1;
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
                return this.iBAN != null && this.iBAN.equals(element) ? 0 : -1;
            case 1:
                return this.othr != null && this.othr.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of IBAN (1).
     * 
     * @return The value.
     */
    public java.lang.String getIBAN() {
        return this.iBAN;
    }

    /**
     * Gets the value of Othr (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GenericAccountIdentification1 getOthr() {
        return this.othr;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>iBAN,
     * othr</b>.
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
                return this.iBAN;
            case 1:
                return this.othr;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.iBAN == null ? 0 : 1;
        count += this.othr == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(iBAN);
        result = 31 * result + hashCodeOf(othr);
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
                setIBAN(null);
                return;
            case 1:
                setOthr(null);
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
                setIBAN((java.lang.String) value);
                return;
            case 1:
                setOthr((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GenericAccountIdentification1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of IBAN (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIBAN(java.lang.String value) {
        this.iBAN = value;
    }

    /**
     * [Virtual Element] Sets the value of Othr (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOthr(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GenericAccountIdentification1 value) {
        this.othr = value;
        if (this.othr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.othr).setParent(this, "Othr");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.iBAN);
        out.writeObject(this.othr);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.iBAN = (java.lang.String) in.readObject();
        this.othr = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GenericAccountIdentification1) in.readObject();
    }

}
