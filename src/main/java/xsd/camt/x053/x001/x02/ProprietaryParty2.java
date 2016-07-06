/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * ProprietaryParty2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Tp</b> of type {@link java.lang.String} (1)</li>
 * <li><b>Pty</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2Cls
 */
public class ProprietaryParty2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Pty", "Tp"};

    /**
     * Field tp.
     */
    private java.lang.String tp;

    /**
     * Field pty.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 pty;

    public ProprietaryParty2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2Cls.getInstance().getNullDefiningElementDecl());
    }

    public ProprietaryParty2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public ProprietaryParty2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public ProprietaryParty2(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2 clone) {
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
                setTp((java.lang.String) value);
                return;
            case 0:
                setPty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryParty2) clone;
        obj.tp = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.tp, obj, "Tp");
        obj.pty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.pty, obj, "Pty");
    }

    /**
     * Creates, adds and returns a new Pty (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 createPty() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) getElementDecl("Pty").createObject();
        setPty(obj);
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
     * The legal value(s) for <code>name</code> are: <b>tp,
     * pty</b>.
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
                return getTp();
            case 0:
                return getPty();
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
                return this.tp == null ? 0 : 1;
            case 0:
                return this.pty == null ? 0 : 1;
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
                return this.tp != null && this.tp.equals(element) ? 0 : -1;
            case 0:
                return this.pty != null && this.pty.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Pty (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 getPty() {
        return this.pty;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>tp,
     * pty</b>.
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
                return this.tp;
            case 0:
                return this.pty;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.tp == null ? 0 : 1;
        count += this.pty == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of Tp (1).
     * 
     * @return The value.
     */
    public java.lang.String getTp() {
        return this.tp;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(tp);
        result = 31 * result + hashCodeOf(pty);
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
                setTp(null);
                return;
            case 0:
                setPty(null);
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
            case 1:
                setTp((java.lang.String) value);
                return;
            case 0:
                setPty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Pty (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPty(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32 value) {
        this.pty = value;
        if (this.pty != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.pty).setParent(this, "Pty");
    }

    /**
     * [Virtual Element] Sets the value of Tp (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTp(java.lang.String value) {
        this.tp = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.tp);
        out.writeObject(this.pty);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.tp = (java.lang.String) in.readObject();
        this.pty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.PartyIdentification32) in.readObject();
    }

}
