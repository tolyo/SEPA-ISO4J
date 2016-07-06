/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * BankTransactionCodeStructure4. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Domn</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure5}
 * (0..1)</li>
 * <li><b>Prtry</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryBankTransactionCodeStructure1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4Cls
 */
public class BankTransactionCodeStructure4 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Domn", "Prtry"};

    /**
     * Field domn.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure5 domn;

    /**
     * Field prtry.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryBankTransactionCodeStructure1 prtry;

    public BankTransactionCodeStructure4() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4Cls.getInstance().getNullDefiningElementDecl());
    }

    public BankTransactionCodeStructure4(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public BankTransactionCodeStructure4(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public BankTransactionCodeStructure4(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4 clone) {
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
                setDomn((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure5) value);
                return;
            case 1:
                setPrtry((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryBankTransactionCodeStructure1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4) clone;
        obj.domn = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure5) biz.c24.io.api.Utils.cloneDeep(this.domn, obj, "Domn");
        obj.prtry = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryBankTransactionCodeStructure1) biz.c24.io.api.Utils.cloneDeep(this.prtry, obj, "Prtry");
    }

    /**
     * Creates, adds and returns a new Domn (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure5 createDomn() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure5 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure5) getElementDecl("Domn").createObject();
        setDomn(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Prtry (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryBankTransactionCodeStructure1 createPrtry() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryBankTransactionCodeStructure1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryBankTransactionCodeStructure1) getElementDecl("Prtry").createObject();
        setPrtry(obj);
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
     * Gets the value of Domn (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure5 getDomn() {
        return this.domn;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>domn,
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
                return getDomn();
            case 1:
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
                return this.domn == null ? 0 : 1;
            case 1:
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
                return this.domn != null && this.domn.equals(element) ? 0 : -1;
            case 1:
                return this.prtry != null && this.prtry.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Prtry (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryBankTransactionCodeStructure1 getPrtry() {
        return this.prtry;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>domn,
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
                return this.domn;
            case 1:
                return this.prtry;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.domn == null ? 0 : 1;
        count += this.prtry == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(domn);
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
                setDomn(null);
                return;
            case 1:
                setPrtry(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Domn (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDomn(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure5 value) {
        this.domn = value;
        if (this.domn != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.domn).setParent(this, "Domn");
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
                setDomn((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure5) value);
                return;
            case 1:
                setPrtry((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryBankTransactionCodeStructure1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Prtry (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrtry(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryBankTransactionCodeStructure1 value) {
        this.prtry = value;
        if (this.prtry != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.prtry).setParent(this, "Prtry");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.domn);
        out.writeObject(this.prtry);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.domn = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure5) in.readObject();
        this.prtry = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ProprietaryBankTransactionCodeStructure1) in.readObject();
    }

}
