/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * Document. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>CstmrCdtTrfInitn</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03}
 * (1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.DocumentCls
 */
public class Document extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"CstmrCdtTrfInitn"};

    /**
     * Field cstmrCdtTrfInitn.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03 cstmrCdtTrfInitn;

    public Document() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.DocumentCls.getInstance().getNullDefiningElementDecl());
    }

    public Document(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public Document(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public Document(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Document clone) {
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
                setCstmrCdtTrfInitn((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Document(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Document(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Document obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Document) clone;
        obj.cstmrCdtTrfInitn = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03) biz.c24.io.api.Utils.cloneDeep(this.cstmrCdtTrfInitn, obj, "CstmrCdtTrfInitn");
    }

    /**
     * Creates, adds and returns a new CstmrCdtTrfInitn (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03 createCstmrCdtTrfInitn() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03) getElementDecl("CstmrCdtTrfInitn").createObject();
        setCstmrCdtTrfInitn(obj);
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
     * Gets the value of CstmrCdtTrfInitn (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03 getCstmrCdtTrfInitn() {
        return this.cstmrCdtTrfInitn;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>cstmrCdtTrfInitn</b>.
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
                return getCstmrCdtTrfInitn();
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
                return this.cstmrCdtTrfInitn == null ? 0 : 1;
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
                return this.cstmrCdtTrfInitn != null && this.cstmrCdtTrfInitn.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>cstmrCdtTrfInitn</b>.
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
                return this.cstmrCdtTrfInitn;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.cstmrCdtTrfInitn == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(cstmrCdtTrfInitn);
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
                setCstmrCdtTrfInitn(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of CstmrCdtTrfInitn (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCstmrCdtTrfInitn(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03 value) {
        this.cstmrCdtTrfInitn = value;
        if (this.cstmrCdtTrfInitn != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cstmrCdtTrfInitn).setParent(this, "CstmrCdtTrfInitn");
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
                setCstmrCdtTrfInitn((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.cstmrCdtTrfInitn);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.cstmrCdtTrfInitn = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03) in.readObject();
    }

}
