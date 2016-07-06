/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * RegulatoryReporting3. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>DbtCdtRptgInd</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>Authrty</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryAuthority2}
 * (0..1)</li>
 * <li><b>Dtls</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3}
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
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3Cls
 */
public class RegulatoryReporting3 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Authrty", "DbtCdtRptgInd", "Dtls"};

    /**
     * Field dbtCdtRptgInd.
     */
    private java.lang.String dbtCdtRptgInd;

    /**
     * Field authrty.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryAuthority2 authrty;

    /**
     * Field dtls.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3[] dtls;

    public RegulatoryReporting3() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3Cls.getInstance().getNullDefiningElementDecl());
    }

    public RegulatoryReporting3(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public RegulatoryReporting3(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public RegulatoryReporting3(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3 clone) {
        super(clone);
    }

    /**
     * Adds a Dtls (0..*).
     * 
     * @param value
     * @param value The new Dtls.
     */
    public void addDtls(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3 value) {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3[] temp = this.dtls;
        this.dtls = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.dtls, 0, temp.length);
        this.dtls[this.dtls.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Dtls");
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
                setDbtCdtRptgInd((java.lang.String) value);
                return;
            case 0:
                setAuthrty((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryAuthority2) value);
                return;
            case 2:
                addDtls((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3) clone;
        obj.dbtCdtRptgInd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.dbtCdtRptgInd, obj, "DbtCdtRptgInd");
        obj.authrty = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryAuthority2) biz.c24.io.api.Utils.cloneDeep(this.authrty, obj, "Authrty");
        obj.dtls = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3[]) biz.c24.io.api.Utils.cloneDeep(this.dtls, obj, "Dtls");
    }

    /**
     * Creates, adds and returns a new Authrty (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryAuthority2 createAuthrty() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryAuthority2 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryAuthority2) getElementDecl("Authrty").createObject();
        setAuthrty(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Dtls (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3 createDtls() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3) getElementDecl("Dtls").createObject();
        addDtls(obj);
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
     * Gets the value of Authrty (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryAuthority2 getAuthrty() {
        return this.authrty;
    }

    /**
     * Gets the value of DbtCdtRptgInd (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getDbtCdtRptgInd() {
        return this.dbtCdtRptgInd;
    }

    /**
     * Gets the value of Dtls (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3[] getDtls() {
        if (this.dtls == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3[]{};
        else
            return this.dtls;
    }

    /**
     * Gets the value of Dtls by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3 getDtls(int ordinal) {
        if (this.dtls == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.dtls.length) {
            return this.dtls[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Dtls to get the index of.
     * @return The index.
     */
    public int getDtlsIndex(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3 value) {
        if (this.dtls == null)
            return -1;
        for (int i=0; i<this.dtls.length; i++)
            if (this.dtls[i] == value)
                return i;
        return -1;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>dbtCdtRptgInd, authrty, dtls</b>.
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
                return getDbtCdtRptgInd();
            case 0:
                return getAuthrty();
            case 2:
            if (this.dtls == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.dtls[index];
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
                return this.dbtCdtRptgInd == null ? 0 : 1;
            case 0:
                return this.authrty == null ? 0 : 1;
            case 2:
                return this.dtls == null ? 0 : this.dtls.length;
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
                return this.dbtCdtRptgInd != null && this.dbtCdtRptgInd.equals(element) ? 0 : -1;
            case 0:
                return this.authrty != null && this.authrty.equals(element) ? 0 : -1;
            case 2:
                return getDtlsIndex((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>dbtCdtRptgInd, authrty, dtls</b>.
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
                return this.dbtCdtRptgInd;
            case 0:
                return this.authrty;
            case 2:
            if (this.dtls == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.dtls[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.dbtCdtRptgInd == null ? 0 : 1;
        count += this.authrty == null ? 0 : 1;
        count += this.dtls == null ? 0 : this.dtls.length;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(dbtCdtRptgInd);
        result = 31 * result + hashCodeOf(authrty);
        result = 31 * result + hashCodeOf(dtls);
        return result;
    }

    /**
     * Removes a Dtls (0..*).
     * 
     * @param index
     * @param index The index of the Dtls to get.
     */
    public void removeDtls(int index) {
        if (this.dtls == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3[] temp = this.dtls;
        this.dtls = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.dtls, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.dtls, index, temp.length-index-1);
        if (this.dtls.length == 0)
            this.dtls = null;
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
                setDbtCdtRptgInd(null);
                return;
            case 0:
                setAuthrty(null);
                return;
            case 2:
                removeDtls(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Authrty (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAuthrty(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryAuthority2 value) {
        this.authrty = value;
        if (this.authrty != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.authrty).setParent(this, "Authrty");
    }

    /**
     * [Virtual Element] Sets the value of DbtCdtRptgInd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtCdtRptgInd(java.lang.String value) {
        this.dbtCdtRptgInd = value;
    }

    /**
     * [Virtual Element] Sets the value of Dtls (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDtls(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3[] value) {
        this.dtls = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.dtls != null && i<this.dtls.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.dtls[i]).setParent(this, "Dtls");
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
                setDbtCdtRptgInd((java.lang.String) value);
                return;
            case 0:
                setAuthrty((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryAuthority2) value);
                return;
            case 2:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3[]) {
                    setDtls((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3[])value);
                } else if (this.dtls == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.dtls[index] = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.dtls[index]).setParent(this, "Dtls");
                }
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
        out.writeObject(this.dbtCdtRptgInd);
        out.writeObject(this.authrty);
        out.writeObject(this.dtls);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.dbtCdtRptgInd = (java.lang.String) in.readObject();
        this.authrty = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryAuthority2) in.readObject();
        this.dtls = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.StructuredRegulatoryReporting3[]) in.readObject();
    }

}
