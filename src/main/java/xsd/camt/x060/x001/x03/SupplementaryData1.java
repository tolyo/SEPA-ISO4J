/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * SupplementaryData1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>PlcAndNm</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Envlp</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1Cls
 */
public class SupplementaryData1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Envlp", "PlcAndNm"};

    /**
     * Field plcAndNm.
     */
    private java.lang.String plcAndNm;

    /**
     * Field envlp.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1 envlp;

    public SupplementaryData1() {
        this(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1Cls.getInstance().getNullDefiningElementDecl());
    }

    public SupplementaryData1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public SupplementaryData1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public SupplementaryData1(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1 clone) {
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
                setPlcAndNm((java.lang.String) value);
                return;
            case 0:
                setEnvlp((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1) clone;
        obj.plcAndNm = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.plcAndNm, obj, "PlcAndNm");
        obj.envlp = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1) biz.c24.io.api.Utils.cloneDeep(this.envlp, obj, "Envlp");
    }

    /**
     * Creates, adds and returns a new Envlp (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1 createEnvlp() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1) getElementDecl("Envlp").createObject();
        setEnvlp(obj);
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
     * The legal value(s) for <code>name</code> are: <b>plcAndNm,
     * envlp</b>.
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
                return getPlcAndNm();
            case 0:
                return getEnvlp();
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
                return this.plcAndNm == null ? 0 : 1;
            case 0:
                return this.envlp == null ? 0 : 1;
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
                return this.plcAndNm != null && this.plcAndNm.equals(element) ? 0 : -1;
            case 0:
                return this.envlp != null && this.envlp.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Envlp (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1 getEnvlp() {
        return this.envlp;
    }

    /**
     * Gets the value of PlcAndNm (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getPlcAndNm() {
        return this.plcAndNm;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>plcAndNm,
     * envlp</b>.
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
                return this.plcAndNm;
            case 0:
                return this.envlp;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.plcAndNm == null ? 0 : 1;
        count += this.envlp == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(plcAndNm);
        result = 31 * result + hashCodeOf(envlp);
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
                setPlcAndNm(null);
                return;
            case 0:
                setEnvlp(null);
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
                setPlcAndNm((java.lang.String) value);
                return;
            case 0:
                setEnvlp((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Envlp (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setEnvlp(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1 value) {
        this.envlp = value;
        if (this.envlp != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.envlp).setParent(this, "Envlp");
    }

    /**
     * [Virtual Element] Sets the value of PlcAndNm (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPlcAndNm(java.lang.String value) {
        this.plcAndNm = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.plcAndNm);
        out.writeObject(this.envlp);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.plcAndNm = (java.lang.String) in.readObject();
        this.envlp = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1) in.readObject();
    }

}
