/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * BranchAndFinancialInstitutionIdentification4. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>FinInstnId</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.FinancialInstitutionIdentification7}
 * (1)</li>
 * <li><b>BrnchId</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchData2}
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
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4Cls
 */
public class BranchAndFinancialInstitutionIdentification4 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"BrnchId", "FinInstnId"};

    /**
     * Field finInstnId.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.FinancialInstitutionIdentification7 finInstnId;

    /**
     * Field brnchId.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchData2 brnchId;

    public BranchAndFinancialInstitutionIdentification4() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4Cls.getInstance().getNullDefiningElementDecl());
    }

    public BranchAndFinancialInstitutionIdentification4(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public BranchAndFinancialInstitutionIdentification4(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public BranchAndFinancialInstitutionIdentification4(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 clone) {
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
                setFinInstnId((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.FinancialInstitutionIdentification7) value);
                return;
            case 0:
                setBrnchId((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchData2) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) clone;
        obj.finInstnId = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.FinancialInstitutionIdentification7) biz.c24.io.api.Utils.cloneDeep(this.finInstnId, obj, "FinInstnId");
        obj.brnchId = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchData2) biz.c24.io.api.Utils.cloneDeep(this.brnchId, obj, "BrnchId");
    }

    /**
     * Creates, adds and returns a new BrnchId (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchData2 createBrnchId() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchData2 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchData2) getElementDecl("BrnchId").createObject();
        setBrnchId(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new FinInstnId (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.FinancialInstitutionIdentification7 createFinInstnId() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.FinancialInstitutionIdentification7 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.FinancialInstitutionIdentification7) getElementDecl("FinInstnId").createObject();
        setFinInstnId(obj);
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
     * Gets the value of BrnchId (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchData2 getBrnchId() {
        return this.brnchId;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>finInstnId,
     * brnchId</b>.
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
                return getFinInstnId();
            case 0:
                return getBrnchId();
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
                return this.finInstnId == null ? 0 : 1;
            case 0:
                return this.brnchId == null ? 0 : 1;
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
                return this.finInstnId != null && this.finInstnId.equals(element) ? 0 : -1;
            case 0:
                return this.brnchId != null && this.brnchId.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FinInstnId (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.FinancialInstitutionIdentification7 getFinInstnId() {
        return this.finInstnId;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>finInstnId,
     * brnchId</b>.
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
                return this.finInstnId;
            case 0:
                return this.brnchId;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.finInstnId == null ? 0 : 1;
        count += this.brnchId == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(finInstnId);
        result = 31 * result + hashCodeOf(brnchId);
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
                setFinInstnId(null);
                return;
            case 0:
                setBrnchId(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of BrnchId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBrnchId(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchData2 value) {
        this.brnchId = value;
        if (this.brnchId != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.brnchId).setParent(this, "BrnchId");
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
                setFinInstnId((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.FinancialInstitutionIdentification7) value);
                return;
            case 0:
                setBrnchId((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchData2) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of FinInstnId (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFinInstnId(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.FinancialInstitutionIdentification7 value) {
        this.finInstnId = value;
        if (this.finInstnId != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.finInstnId).setParent(this, "FinInstnId");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.finInstnId);
        out.writeObject(this.brnchId);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.finInstnId = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.FinancialInstitutionIdentification7) in.readObject();
        this.brnchId = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchData2) in.readObject();
    }

}
