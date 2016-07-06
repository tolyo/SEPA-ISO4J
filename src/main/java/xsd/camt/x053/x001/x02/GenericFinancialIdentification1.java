/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * GenericFinancialIdentification1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Id</b> of type {@link java.lang.String} (1)</li>
 * <li><b>SchmeNm</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.FinancialIdentificationSchemeName1Choice}
 * (0..1)</li>
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GenericFinancialIdentification1Cls
 */
public class GenericFinancialIdentification1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Id", "Issr", "SchmeNm"};

    /**
     * Field id.
     */
    private java.lang.String id;

    /**
     * Field schmeNm.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.FinancialIdentificationSchemeName1Choice schmeNm;

    /**
     * Field issr.
     */
    private java.lang.String issr;

    public GenericFinancialIdentification1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GenericFinancialIdentification1Cls.getInstance().getNullDefiningElementDecl());
    }

    public GenericFinancialIdentification1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public GenericFinancialIdentification1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public GenericFinancialIdentification1(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GenericFinancialIdentification1 clone) {
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
                setId((java.lang.String) value);
                return;
            case 2:
                setSchmeNm((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.FinancialIdentificationSchemeName1Choice) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GenericFinancialIdentification1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GenericFinancialIdentification1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GenericFinancialIdentification1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.GenericFinancialIdentification1) clone;
        obj.id = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.id, obj, "Id");
        obj.schmeNm = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.FinancialIdentificationSchemeName1Choice) biz.c24.io.api.Utils.cloneDeep(this.schmeNm, obj, "SchmeNm");
        obj.issr = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.issr, obj, "Issr");
    }

    /**
     * Creates, adds and returns a new SchmeNm (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.FinancialIdentificationSchemeName1Choice createSchmeNm() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.FinancialIdentificationSchemeName1Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.FinancialIdentificationSchemeName1Choice) getElementDecl("SchmeNm").createObject();
        setSchmeNm(obj);
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
     * The legal value(s) for <code>name</code> are: <b>id,
     * schmeNm, issr</b>.
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
                return getId();
            case 2:
                return getSchmeNm();
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
                return this.id == null ? 0 : 1;
            case 2:
                return this.schmeNm == null ? 0 : 1;
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
                return this.id != null && this.id.equals(element) ? 0 : -1;
            case 2:
                return this.schmeNm != null && this.schmeNm.equals(element) ? 0 : -1;
            case 1:
                return this.issr != null && this.issr.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Id (1).
     * 
     * @return The value.
     */
    public java.lang.String getId() {
        return this.id;
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
     * The legal value(s) for <code>name</code> are: <b>id,
     * schmeNm, issr</b>.
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
                return this.id;
            case 2:
                return this.schmeNm;
            case 1:
                return this.issr;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of SchmeNm (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.FinancialIdentificationSchemeName1Choice getSchmeNm() {
        return this.schmeNm;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.id == null ? 0 : 1;
        count += this.schmeNm == null ? 0 : 1;
        count += this.issr == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(id);
        result = 31 * result + hashCodeOf(schmeNm);
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
                setId(null);
                return;
            case 2:
                setSchmeNm(null);
                return;
            case 1:
                setIssr(null);
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
                setId((java.lang.String) value);
                return;
            case 2:
                setSchmeNm((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.FinancialIdentificationSchemeName1Choice) value);
                return;
            case 1:
                setIssr((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Id (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setId(java.lang.String value) {
        this.id = value;
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
     * [Virtual Element] Sets the value of SchmeNm (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSchmeNm(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.FinancialIdentificationSchemeName1Choice value) {
        this.schmeNm = value;
        if (this.schmeNm != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.schmeNm).setParent(this, "SchmeNm");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.id);
        out.writeObject(this.schmeNm);
        out.writeObject(this.issr);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.id = (java.lang.String) in.readObject();
        this.schmeNm = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.FinancialIdentificationSchemeName1Choice) in.readObject();
        this.issr = (java.lang.String) in.readObject();
    }

}
