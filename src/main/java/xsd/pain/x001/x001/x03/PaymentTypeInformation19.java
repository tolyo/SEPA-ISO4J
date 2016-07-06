/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * PaymentTypeInformation19. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>InstrPrty</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>SvcLvl</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ServiceLevel8Choice}
 * (0..1)</li>
 * <li><b>LclInstrm</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.LocalInstrument2Choice}
 * (0..1)</li>
 * <li><b>CtgyPurp</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CategoryPurpose1Choice}
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
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19Cls
 */
public class PaymentTypeInformation19 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"CtgyPurp", "InstrPrty", "LclInstrm", "SvcLvl"};

    /**
     * Field instrPrty.
     */
    private java.lang.String instrPrty;

    /**
     * Field svcLvl.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ServiceLevel8Choice svcLvl;

    /**
     * Field lclInstrm.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.LocalInstrument2Choice lclInstrm;

    /**
     * Field ctgyPurp.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CategoryPurpose1Choice ctgyPurp;

    public PaymentTypeInformation19() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19Cls.getInstance().getNullDefiningElementDecl());
    }

    public PaymentTypeInformation19(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public PaymentTypeInformation19(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public PaymentTypeInformation19(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19 clone) {
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
                setInstrPrty((java.lang.String) value);
                return;
            case 3:
                setSvcLvl((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ServiceLevel8Choice) value);
                return;
            case 2:
                setLclInstrm((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.LocalInstrument2Choice) value);
                return;
            case 0:
                setCtgyPurp((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CategoryPurpose1Choice) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19) clone;
        obj.instrPrty = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.instrPrty, obj, "InstrPrty");
        obj.svcLvl = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ServiceLevel8Choice) biz.c24.io.api.Utils.cloneDeep(this.svcLvl, obj, "SvcLvl");
        obj.lclInstrm = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.LocalInstrument2Choice) biz.c24.io.api.Utils.cloneDeep(this.lclInstrm, obj, "LclInstrm");
        obj.ctgyPurp = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CategoryPurpose1Choice) biz.c24.io.api.Utils.cloneDeep(this.ctgyPurp, obj, "CtgyPurp");
    }

    /**
     * Creates, adds and returns a new CtgyPurp (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CategoryPurpose1Choice createCtgyPurp() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CategoryPurpose1Choice obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CategoryPurpose1Choice) getElementDecl("CtgyPurp").createObject();
        setCtgyPurp(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new LclInstrm (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.LocalInstrument2Choice createLclInstrm() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.LocalInstrument2Choice obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.LocalInstrument2Choice) getElementDecl("LclInstrm").createObject();
        setLclInstrm(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new SvcLvl (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ServiceLevel8Choice createSvcLvl() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ServiceLevel8Choice obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ServiceLevel8Choice) getElementDecl("SvcLvl").createObject();
        setSvcLvl(obj);
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
     * Gets the value of CtgyPurp (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CategoryPurpose1Choice getCtgyPurp() {
        return this.ctgyPurp;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>instrPrty,
     * svcLvl, lclInstrm, ctgyPurp</b>.
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
                return getInstrPrty();
            case 3:
                return getSvcLvl();
            case 2:
                return getLclInstrm();
            case 0:
                return getCtgyPurp();
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
                return this.instrPrty == null ? 0 : 1;
            case 3:
                return this.svcLvl == null ? 0 : 1;
            case 2:
                return this.lclInstrm == null ? 0 : 1;
            case 0:
                return this.ctgyPurp == null ? 0 : 1;
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
                return this.instrPrty != null && this.instrPrty.equals(element) ? 0 : -1;
            case 3:
                return this.svcLvl != null && this.svcLvl.equals(element) ? 0 : -1;
            case 2:
                return this.lclInstrm != null && this.lclInstrm.equals(element) ? 0 : -1;
            case 0:
                return this.ctgyPurp != null && this.ctgyPurp.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of InstrPrty (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getInstrPrty() {
        return this.instrPrty;
    }

    /**
     * Gets the value of LclInstrm (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.LocalInstrument2Choice getLclInstrm() {
        return this.lclInstrm;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>instrPrty,
     * svcLvl, lclInstrm, ctgyPurp</b>.
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
                return this.instrPrty;
            case 3:
                return this.svcLvl;
            case 2:
                return this.lclInstrm;
            case 0:
                return this.ctgyPurp;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of SvcLvl (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ServiceLevel8Choice getSvcLvl() {
        return this.svcLvl;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.instrPrty == null ? 0 : 1;
        count += this.svcLvl == null ? 0 : 1;
        count += this.lclInstrm == null ? 0 : 1;
        count += this.ctgyPurp == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(instrPrty);
        result = 31 * result + hashCodeOf(svcLvl);
        result = 31 * result + hashCodeOf(lclInstrm);
        result = 31 * result + hashCodeOf(ctgyPurp);
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
                setInstrPrty(null);
                return;
            case 3:
                setSvcLvl(null);
                return;
            case 2:
                setLclInstrm(null);
                return;
            case 0:
                setCtgyPurp(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of CtgyPurp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCtgyPurp(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CategoryPurpose1Choice value) {
        this.ctgyPurp = value;
        if (this.ctgyPurp != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ctgyPurp).setParent(this, "CtgyPurp");
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
                setInstrPrty((java.lang.String) value);
                return;
            case 3:
                setSvcLvl((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ServiceLevel8Choice) value);
                return;
            case 2:
                setLclInstrm((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.LocalInstrument2Choice) value);
                return;
            case 0:
                setCtgyPurp((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CategoryPurpose1Choice) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of InstrPrty (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInstrPrty(java.lang.String value) {
        this.instrPrty = value;
    }

    /**
     * [Virtual Element] Sets the value of LclInstrm (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setLclInstrm(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.LocalInstrument2Choice value) {
        this.lclInstrm = value;
        if (this.lclInstrm != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.lclInstrm).setParent(this, "LclInstrm");
    }

    /**
     * [Virtual Element] Sets the value of SvcLvl (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSvcLvl(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ServiceLevel8Choice value) {
        this.svcLvl = value;
        if (this.svcLvl != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.svcLvl).setParent(this, "SvcLvl");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.instrPrty);
        out.writeObject(this.svcLvl);
        out.writeObject(this.lclInstrm);
        out.writeObject(this.ctgyPurp);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.instrPrty = (java.lang.String) in.readObject();
        this.svcLvl = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ServiceLevel8Choice) in.readObject();
        this.lclInstrm = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.LocalInstrument2Choice) in.readObject();
        this.ctgyPurp = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CategoryPurpose1Choice) in.readObject();
    }

}
