/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * CustomerPaymentStatusReportV03. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>GrpHdr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36}
 * (1)</li>
 * <li><b>OrgnlGrpInfAndSts</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20}
 * (1)</li>
 * <li><b>OrgnlPmtInfAndSts</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1}
 * (0..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CustomerPaymentStatusReportV03Cls
 */
public class CustomerPaymentStatusReportV03 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"GrpHdr", "OrgnlGrpInfAndSts", "OrgnlPmtInfAndSts"};

    /**
     * Field grpHdr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36 grpHdr;

    /**
     * Field orgnlGrpInfAndSts.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20 orgnlGrpInfAndSts;

    /**
     * Field orgnlPmtInfAndSts.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1[] orgnlPmtInfAndSts;

    public CustomerPaymentStatusReportV03() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CustomerPaymentStatusReportV03Cls.getInstance().getNullDefiningElementDecl());
    }

    public CustomerPaymentStatusReportV03(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public CustomerPaymentStatusReportV03(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public CustomerPaymentStatusReportV03(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CustomerPaymentStatusReportV03 clone) {
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
                setGrpHdr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36) value);
                return;
            case 1:
                setOrgnlGrpInfAndSts((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20) value);
                return;
            case 2:
                addOrgnlPmtInfAndSts((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a OrgnlPmtInfAndSts (0..*).
     * 
     * @param value
     * @param value The new OrgnlPmtInfAndSts.
     */
    public void addOrgnlPmtInfAndSts(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1 value) {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1[] temp = this.orgnlPmtInfAndSts;
        this.orgnlPmtInfAndSts = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.orgnlPmtInfAndSts, 0, temp.length);
        this.orgnlPmtInfAndSts[this.orgnlPmtInfAndSts.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "OrgnlPmtInfAndSts");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CustomerPaymentStatusReportV03(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CustomerPaymentStatusReportV03(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CustomerPaymentStatusReportV03 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CustomerPaymentStatusReportV03) clone;
        obj.grpHdr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36) biz.c24.io.api.Utils.cloneDeep(this.grpHdr, obj, "GrpHdr");
        obj.orgnlGrpInfAndSts = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20) biz.c24.io.api.Utils.cloneDeep(this.orgnlGrpInfAndSts, obj, "OrgnlGrpInfAndSts");
        obj.orgnlPmtInfAndSts = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1[]) biz.c24.io.api.Utils.cloneDeep(this.orgnlPmtInfAndSts, obj, "OrgnlPmtInfAndSts");
    }

    /**
     * Creates, adds and returns a new GrpHdr (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36 createGrpHdr() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36) getElementDecl("GrpHdr").createObject();
        setGrpHdr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new OrgnlGrpInfAndSts (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20 createOrgnlGrpInfAndSts() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20) getElementDecl("OrgnlGrpInfAndSts").createObject();
        setOrgnlGrpInfAndSts(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new OrgnlPmtInfAndSts (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1 createOrgnlPmtInfAndSts() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1) getElementDecl("OrgnlPmtInfAndSts").createObject();
        addOrgnlPmtInfAndSts(obj);
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
     * orgnlGrpInfAndSts, orgnlPmtInfAndSts</b>.
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
                return getOrgnlGrpInfAndSts();
            case 2:
            if (this.orgnlPmtInfAndSts == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.orgnlPmtInfAndSts[index];
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
                return this.orgnlGrpInfAndSts == null ? 0 : 1;
            case 2:
                return this.orgnlPmtInfAndSts == null ? 0 : this.orgnlPmtInfAndSts.length;
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
                return this.orgnlGrpInfAndSts != null && this.orgnlGrpInfAndSts.equals(element) ? 0 : -1;
            case 2:
                return getOrgnlPmtInfAndStsIndex((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of GrpHdr (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36 getGrpHdr() {
        return this.grpHdr;
    }

    /**
     * Gets the value of OrgnlGrpInfAndSts (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20 getOrgnlGrpInfAndSts() {
        return this.orgnlGrpInfAndSts;
    }

    /**
     * Gets the value of OrgnlPmtInfAndSts (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1[] getOrgnlPmtInfAndSts() {
        if (this.orgnlPmtInfAndSts == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1[]{};
        else
            return this.orgnlPmtInfAndSts;
    }

    /**
     * Gets the value of OrgnlPmtInfAndSts by ordinal position in
     * the collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1 getOrgnlPmtInfAndSts(int ordinal) {
        if (this.orgnlPmtInfAndSts == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.orgnlPmtInfAndSts.length) {
            return this.orgnlPmtInfAndSts[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The OrgnlPmtInfAndSts to get the index of.
     * @return The index.
     */
    public int getOrgnlPmtInfAndStsIndex(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1 value) {
        if (this.orgnlPmtInfAndSts == null)
            return -1;
        for (int i=0; i<this.orgnlPmtInfAndSts.length; i++)
            if (this.orgnlPmtInfAndSts[i] == value)
                return i;
        return -1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>grpHdr,
     * orgnlGrpInfAndSts, orgnlPmtInfAndSts</b>.
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
                return this.orgnlGrpInfAndSts;
            case 2:
            if (this.orgnlPmtInfAndSts == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.orgnlPmtInfAndSts[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.grpHdr == null ? 0 : 1;
        count += this.orgnlGrpInfAndSts == null ? 0 : 1;
        count += this.orgnlPmtInfAndSts == null ? 0 : this.orgnlPmtInfAndSts.length;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(grpHdr);
        result = 31 * result + hashCodeOf(orgnlGrpInfAndSts);
        result = 31 * result + hashCodeOf(orgnlPmtInfAndSts);
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
                setOrgnlGrpInfAndSts(null);
                return;
            case 2:
                removeOrgnlPmtInfAndSts(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a OrgnlPmtInfAndSts (0..*).
     * 
     * @param index
     * @param index The index of the OrgnlPmtInfAndSts to get.
     */
    public void removeOrgnlPmtInfAndSts(int index) {
        if (this.orgnlPmtInfAndSts == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1[] temp = this.orgnlPmtInfAndSts;
        this.orgnlPmtInfAndSts = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.orgnlPmtInfAndSts, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.orgnlPmtInfAndSts, index, temp.length-index-1);
        if (this.orgnlPmtInfAndSts.length == 0)
            this.orgnlPmtInfAndSts = null;
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
                setGrpHdr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36) value);
                return;
            case 1:
                setOrgnlGrpInfAndSts((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20) value);
                return;
            case 2:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1[]) {
                    setOrgnlPmtInfAndSts((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1[])value);
                } else if (this.orgnlPmtInfAndSts == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.orgnlPmtInfAndSts[index] = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.orgnlPmtInfAndSts[index]).setParent(this, "OrgnlPmtInfAndSts");
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
    public void setGrpHdr(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36 value) {
        this.grpHdr = value;
        if (this.grpHdr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.grpHdr).setParent(this, "GrpHdr");
    }

    /**
     * [Virtual Element] Sets the value of OrgnlGrpInfAndSts (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlGrpInfAndSts(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20 value) {
        this.orgnlGrpInfAndSts = value;
        if (this.orgnlGrpInfAndSts != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.orgnlGrpInfAndSts).setParent(this, "OrgnlGrpInfAndSts");
    }

    /**
     * [Virtual Element] Sets the value of OrgnlPmtInfAndSts
     * (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlPmtInfAndSts(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1[] value) {
        this.orgnlPmtInfAndSts = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.orgnlPmtInfAndSts != null && i<this.orgnlPmtInfAndSts.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.orgnlPmtInfAndSts[i]).setParent(this, "OrgnlPmtInfAndSts");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.grpHdr);
        out.writeObject(this.orgnlGrpInfAndSts);
        out.writeObject(this.orgnlPmtInfAndSts);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.grpHdr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.GroupHeader36) in.readObject();
        this.orgnlGrpInfAndSts = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20) in.readObject();
        this.orgnlPmtInfAndSts = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1[]) in.readObject();
    }

}
