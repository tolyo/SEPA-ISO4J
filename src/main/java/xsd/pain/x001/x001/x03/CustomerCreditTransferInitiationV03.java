/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * CustomerCreditTransferInitiationV03. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>GrpHdr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32}
 * (1)</li>
 * <li><b>PmtInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3}
 * (1..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03Cls
 */
public class CustomerCreditTransferInitiationV03 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"GrpHdr", "PmtInf"};

    /**
     * Field grpHdr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32 grpHdr;

    /**
     * Field pmtInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3[] pmtInf;

    public CustomerCreditTransferInitiationV03() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03Cls.getInstance().getNullDefiningElementDecl());
    }

    public CustomerCreditTransferInitiationV03(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public CustomerCreditTransferInitiationV03(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public CustomerCreditTransferInitiationV03(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03 clone) {
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
                setGrpHdr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32) value);
                return;
            case 1:
                addPmtInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a PmtInf (1..*).
     * 
     * @param value
     * @param value The new PmtInf.
     */
    public void addPmtInf(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3 value) {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3[] temp = this.pmtInf;
        this.pmtInf = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.pmtInf, 0, temp.length);
        this.pmtInf[this.pmtInf.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "PmtInf");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CustomerCreditTransferInitiationV03) clone;
        obj.grpHdr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32) biz.c24.io.api.Utils.cloneDeep(this.grpHdr, obj, "GrpHdr");
        obj.pmtInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3[]) biz.c24.io.api.Utils.cloneDeep(this.pmtInf, obj, "PmtInf");
    }

    /**
     * Creates, adds and returns a new GrpHdr (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32 createGrpHdr() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32) getElementDecl("GrpHdr").createObject();
        setGrpHdr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new PmtInf (1..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3 createPmtInf() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3) getElementDecl("PmtInf").createObject();
        addPmtInf(obj);
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
     * The legal value(s) for <code>name</code> are: <b>grpHdr,
     * pmtInf</b>.
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
                return getGrpHdr();
            case 1:
            if (this.pmtInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.pmtInf[index];
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
                return this.grpHdr == null ? 0 : 1;
            case 1:
                return this.pmtInf == null ? 0 : this.pmtInf.length;
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
                return this.grpHdr != null && this.grpHdr.equals(element) ? 0 : -1;
            case 1:
                return getPmtInfIndex((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of GrpHdr (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32 getGrpHdr() {
        return this.grpHdr;
    }

    /**
     * Gets the value of PmtInf (1..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3[] getPmtInf() {
        if (this.pmtInf == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3[]{};
        else
            return this.pmtInf;
    }

    /**
     * Gets the value of PmtInf by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3 getPmtInf(int ordinal) {
        if (this.pmtInf == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.pmtInf.length) {
            return this.pmtInf[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (1..*).
     * 
     * @param value
     * @param value The PmtInf to get the index of.
     * @return The index.
     */
    public int getPmtInfIndex(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3 value) {
        if (this.pmtInf == null)
            return -1;
        for (int i=0; i<this.pmtInf.length; i++)
            if (this.pmtInf[i] == value)
                return i;
        return -1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>grpHdr,
     * pmtInf</b>.
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
                return this.grpHdr;
            case 1:
            if (this.pmtInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.pmtInf[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.grpHdr == null ? 0 : 1;
        count += this.pmtInf == null ? 0 : this.pmtInf.length;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(grpHdr);
        result = 31 * result + hashCodeOf(pmtInf);
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
                setGrpHdr(null);
                return;
            case 1:
                removePmtInf(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a PmtInf (1..*).
     * 
     * @param index
     * @param index The index of the PmtInf to get.
     */
    public void removePmtInf(int index) {
        if (this.pmtInf == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3[] temp = this.pmtInf;
        this.pmtInf = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.pmtInf, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.pmtInf, index, temp.length-index-1);
        if (this.pmtInf.length == 0)
            this.pmtInf = null;
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
                setGrpHdr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32) value);
                return;
            case 1:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3[]) {
                    setPmtInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3[])value);
                } else if (this.pmtInf == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.pmtInf[index] = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.pmtInf[index]).setParent(this, "PmtInf");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of GrpHdr (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setGrpHdr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32 value) {
        this.grpHdr = value;
        if (this.grpHdr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.grpHdr).setParent(this, "GrpHdr");
    }

    /**
     * [Virtual Element] Sets the value of PmtInf (1..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPmtInf(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3[] value) {
        this.pmtInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.pmtInf != null && i<this.pmtInf.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.pmtInf[i]).setParent(this, "PmtInf");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.grpHdr);
        out.writeObject(this.pmtInf);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.grpHdr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GroupHeader32) in.readObject();
        this.pmtInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3[]) in.readObject();
    }

}
