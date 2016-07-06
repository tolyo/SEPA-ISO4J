/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * BalanceType12. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>CdOrPrtry</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType5Choice}
 * (1)</li>
 * <li><b>SubTp</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceSubType1Choice}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType12Cls
 */
public class BalanceType12 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"CdOrPrtry", "SubTp"};

    /**
     * Field cdOrPrtry.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType5Choice cdOrPrtry;

    /**
     * Field subTp.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceSubType1Choice subTp;

    public BalanceType12() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType12Cls.getInstance().getNullDefiningElementDecl());
    }

    public BalanceType12(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public BalanceType12(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public BalanceType12(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType12 clone) {
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
                setCdOrPrtry((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType5Choice) value);
                return;
            case 1:
                setSubTp((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceSubType1Choice) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType12(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType12(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType12 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType12) clone;
        obj.cdOrPrtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType5Choice) biz.c24.io.api.Utils.cloneDeep(this.cdOrPrtry, obj, "CdOrPrtry");
        obj.subTp = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceSubType1Choice) biz.c24.io.api.Utils.cloneDeep(this.subTp, obj, "SubTp");
    }

    /**
     * Creates, adds and returns a new CdOrPrtry (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType5Choice createCdOrPrtry() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType5Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType5Choice) getElementDecl("CdOrPrtry").createObject();
        setCdOrPrtry(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new SubTp (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceSubType1Choice createSubTp() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceSubType1Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceSubType1Choice) getElementDecl("SubTp").createObject();
        setSubTp(obj);
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
     * Gets the value of CdOrPrtry (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType5Choice getCdOrPrtry() {
        return this.cdOrPrtry;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>cdOrPrtry,
     * subTp</b>.
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
                return getCdOrPrtry();
            case 1:
                return getSubTp();
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
                return this.cdOrPrtry == null ? 0 : 1;
            case 1:
                return this.subTp == null ? 0 : 1;
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
                return this.cdOrPrtry != null && this.cdOrPrtry.equals(element) ? 0 : -1;
            case 1:
                return this.subTp != null && this.subTp.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>cdOrPrtry,
     * subTp</b>.
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
                return this.cdOrPrtry;
            case 1:
                return this.subTp;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of SubTp (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceSubType1Choice getSubTp() {
        return this.subTp;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.cdOrPrtry == null ? 0 : 1;
        count += this.subTp == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(cdOrPrtry);
        result = 31 * result + hashCodeOf(subTp);
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
                setCdOrPrtry(null);
                return;
            case 1:
                setSubTp(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of CdOrPrtry (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdOrPrtry(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType5Choice value) {
        this.cdOrPrtry = value;
        if (this.cdOrPrtry != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdOrPrtry).setParent(this, "CdOrPrtry");
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
                setCdOrPrtry((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType5Choice) value);
                return;
            case 1:
                setSubTp((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceSubType1Choice) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of SubTp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSubTp(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceSubType1Choice value) {
        this.subTp = value;
        if (this.subTp != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.subTp).setParent(this, "SubTp");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.cdOrPrtry);
        out.writeObject(this.subTp);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.cdOrPrtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceType5Choice) in.readObject();
        this.subTp = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BalanceSubType1Choice) in.readObject();
    }

}
