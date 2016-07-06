/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * Party12Choice. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Pty</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43}
 * (1)</li>
 * <li><b>Agt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5}
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
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12ChoiceCls
 */
public class Party12Choice extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Agt", "Pty"};

    /**
     * Field pty.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43 pty;

    /**
     * Field agt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5 agt;

    public Party12Choice() {
        this(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12ChoiceCls.getInstance().getNullDefiningElementDecl());
    }

    public Party12Choice(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public Party12Choice(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public Party12Choice(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice clone) {
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
                setPty((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43) value);
                return;
            case 0:
                setAgt((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12Choice) clone;
        obj.pty = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43) biz.c24.io.api.Utils.cloneDeep(this.pty, obj, "Pty");
        obj.agt = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5) biz.c24.io.api.Utils.cloneDeep(this.agt, obj, "Agt");
    }

    /**
     * Creates, adds and returns a new Agt (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5 createAgt() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5) getElementDecl("Agt").createObject();
        setAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Pty (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43 createPty() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43) getElementDecl("Pty").createObject();
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
     * Gets the value of Agt (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5 getAgt() {
        return this.agt;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>pty,
     * agt</b>.
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
                return getPty();
            case 0:
                return getAgt();
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
                return this.pty == null ? 0 : 1;
            case 0:
                return this.agt == null ? 0 : 1;
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
                return this.pty != null && this.pty.equals(element) ? 0 : -1;
            case 0:
                return this.agt != null && this.agt.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Pty (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43 getPty() {
        return this.pty;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>pty,
     * agt</b>.
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
                return this.pty;
            case 0:
                return this.agt;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.pty == null ? 0 : 1;
        count += this.agt == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(pty);
        result = 31 * result + hashCodeOf(agt);
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
                setPty(null);
                return;
            case 0:
                setAgt(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Agt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAgt(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5 value) {
        this.agt = value;
        if (this.agt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.agt).setParent(this, "Agt");
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
                setPty((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43) value);
                return;
            case 0:
                setAgt((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5) value);
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
    public void setPty(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43 value) {
        this.pty = value;
        if (this.pty != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.pty).setParent(this, "Pty");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.pty);
        out.writeObject(this.agt);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.pty = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43) in.readObject();
        this.agt = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5) in.readObject();
    }

}
