/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * DateAndPlaceOfBirth. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>BirthDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (1)</li>
 * <li><b>PrvcOfBirth</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>CityOfBirth</b> of type {@link java.lang.String} (1)</li>
 * <li><b>CtryOfBirth</b> of type {@link java.lang.String} (1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.DateAndPlaceOfBirthCls
 */
public class DateAndPlaceOfBirth extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"BirthDt", "CityOfBirth", "CtryOfBirth", "PrvcOfBirth"};

    /**
     * Field birthDt.
     */
    private biz.c24.io.api.data.ISO8601Date birthDt;

    /**
     * Field prvcOfBirth.
     */
    private java.lang.String prvcOfBirth;

    /**
     * Field cityOfBirth.
     */
    private java.lang.String cityOfBirth;

    /**
     * Field ctryOfBirth.
     */
    private java.lang.String ctryOfBirth;

    public DateAndPlaceOfBirth() {
        this(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.DateAndPlaceOfBirthCls.getInstance().getNullDefiningElementDecl());
    }

    public DateAndPlaceOfBirth(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public DateAndPlaceOfBirth(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public DateAndPlaceOfBirth(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.DateAndPlaceOfBirth clone) {
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
                setBirthDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 3:
                setPrvcOfBirth((java.lang.String) value);
                return;
            case 1:
                setCityOfBirth((java.lang.String) value);
                return;
            case 2:
                setCtryOfBirth((java.lang.String) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.DateAndPlaceOfBirth(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.DateAndPlaceOfBirth(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.DateAndPlaceOfBirth obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.DateAndPlaceOfBirth) clone;
        obj.birthDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.birthDt, obj, "BirthDt");
        obj.prvcOfBirth = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.prvcOfBirth, obj, "PrvcOfBirth");
        obj.cityOfBirth = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cityOfBirth, obj, "CityOfBirth");
        obj.ctryOfBirth = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.ctryOfBirth, obj, "CtryOfBirth");
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
     * Gets the value of BirthDt (1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getBirthDt() {
        return this.birthDt;
    }

    /**
     * Gets the value of CityOfBirth (1).
     * 
     * @return The value.
     */
    public java.lang.String getCityOfBirth() {
        return this.cityOfBirth;
    }

    /**
     * Gets the value of CtryOfBirth (1).
     * 
     * @return The value.
     */
    public java.lang.String getCtryOfBirth() {
        return this.ctryOfBirth;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>birthDt,
     * prvcOfBirth, cityOfBirth, ctryOfBirth</b>.
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
                return getBirthDt();
            case 3:
                return getPrvcOfBirth();
            case 1:
                return getCityOfBirth();
            case 2:
                return getCtryOfBirth();
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
                return this.birthDt == null ? 0 : 1;
            case 3:
                return this.prvcOfBirth == null ? 0 : 1;
            case 1:
                return this.cityOfBirth == null ? 0 : 1;
            case 2:
                return this.ctryOfBirth == null ? 0 : 1;
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
                return this.birthDt != null && this.birthDt.equals(element) ? 0 : -1;
            case 3:
                return this.prvcOfBirth != null && this.prvcOfBirth.equals(element) ? 0 : -1;
            case 1:
                return this.cityOfBirth != null && this.cityOfBirth.equals(element) ? 0 : -1;
            case 2:
                return this.ctryOfBirth != null && this.ctryOfBirth.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of PrvcOfBirth (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getPrvcOfBirth() {
        return this.prvcOfBirth;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>birthDt,
     * prvcOfBirth, cityOfBirth, ctryOfBirth</b>.
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
                return this.birthDt;
            case 3:
                return this.prvcOfBirth;
            case 1:
                return this.cityOfBirth;
            case 2:
                return this.ctryOfBirth;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.birthDt == null ? 0 : 1;
        count += this.prvcOfBirth == null ? 0 : 1;
        count += this.cityOfBirth == null ? 0 : 1;
        count += this.ctryOfBirth == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(birthDt);
        result = 31 * result + hashCodeOf(prvcOfBirth);
        result = 31 * result + hashCodeOf(cityOfBirth);
        result = 31 * result + hashCodeOf(ctryOfBirth);
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
                setBirthDt(null);
                return;
            case 3:
                setPrvcOfBirth(null);
                return;
            case 1:
                setCityOfBirth(null);
                return;
            case 2:
                setCtryOfBirth(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of BirthDt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBirthDt(biz.c24.io.api.data.ISO8601Date value) {
        this.birthDt = value;
    }

    /**
     * [Virtual Element] Sets the value of CityOfBirth (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCityOfBirth(java.lang.String value) {
        this.cityOfBirth = value;
    }

    /**
     * [Virtual Element] Sets the value of CtryOfBirth (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCtryOfBirth(java.lang.String value) {
        this.ctryOfBirth = value;
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
                setBirthDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 3:
                setPrvcOfBirth((java.lang.String) value);
                return;
            case 1:
                setCityOfBirth((java.lang.String) value);
                return;
            case 2:
                setCtryOfBirth((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of PrvcOfBirth (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrvcOfBirth(java.lang.String value) {
        this.prvcOfBirth = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.birthDt);
        out.writeObject(this.prvcOfBirth);
        out.writeObject(this.cityOfBirth);
        out.writeObject(this.ctryOfBirth);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.birthDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.prvcOfBirth = (java.lang.String) in.readObject();
        this.cityOfBirth = (java.lang.String) in.readObject();
        this.ctryOfBirth = (java.lang.String) in.readObject();
    }

}
