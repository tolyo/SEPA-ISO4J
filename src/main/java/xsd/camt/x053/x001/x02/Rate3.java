/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * Rate3. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Tp</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice}
 * (1)</li>
 * <li><b>VldtyRg</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2}
 * (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3Cls
 */
public class Rate3 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Tp", "VldtyRg"};

    /**
     * Field tp.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice tp;

    /**
     * Field vldtyRg.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2 vldtyRg;

    public Rate3() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3Cls.getInstance().getNullDefiningElementDecl());
    }

    public Rate3(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public Rate3(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public Rate3(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3 clone) {
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
                setTp((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice) value);
                return;
            case 1:
                setVldtyRg((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Rate3) clone;
        obj.tp = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice) biz.c24.io.api.Utils.cloneDeep(this.tp, obj, "Tp");
        obj.vldtyRg = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2) biz.c24.io.api.Utils.cloneDeep(this.vldtyRg, obj, "VldtyRg");
    }

    /**
     * Creates, adds and returns a new Tp (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice createTp() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice) getElementDecl("Tp").createObject();
        setTp(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new VldtyRg (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2 createVldtyRg() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2) getElementDecl("VldtyRg").createObject();
        setVldtyRg(obj);
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
     * The legal value(s) for <code>name</code> are: <b>tp,
     * vldtyRg</b>.
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
                return getTp();
            case 1:
                return getVldtyRg();
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
                return this.tp == null ? 0 : 1;
            case 1:
                return this.vldtyRg == null ? 0 : 1;
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
                return this.tp != null && this.tp.equals(element) ? 0 : -1;
            case 1:
                return this.vldtyRg != null && this.vldtyRg.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>tp,
     * vldtyRg</b>.
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
                return this.tp;
            case 1:
                return this.vldtyRg;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.tp == null ? 0 : 1;
        count += this.vldtyRg == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of Tp (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice getTp() {
        return this.tp;
    }

    /**
     * Gets the value of VldtyRg (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2 getVldtyRg() {
        return this.vldtyRg;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(tp);
        result = 31 * result + hashCodeOf(vldtyRg);
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
                setTp(null);
                return;
            case 1:
                setVldtyRg(null);
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
                setTp((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice) value);
                return;
            case 1:
                setVldtyRg((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Tp (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTp(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice value) {
        this.tp = value;
        if (this.tp != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.tp).setParent(this, "Tp");
    }

    /**
     * [Virtual Element] Sets the value of VldtyRg (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setVldtyRg(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2 value) {
        this.vldtyRg = value;
        if (this.vldtyRg != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.vldtyRg).setParent(this, "VldtyRg");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.tp);
        out.writeObject(this.vldtyRg);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.tp = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.RateType4Choice) in.readObject();
        this.vldtyRg = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyAndAmountRange2) in.readObject();
    }

}
