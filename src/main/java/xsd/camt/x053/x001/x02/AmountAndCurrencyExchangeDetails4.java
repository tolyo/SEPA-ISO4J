/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * AmountAndCurrencyExchangeDetails4. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Tp</b> of type {@link java.lang.String} (1)</li>
 * <li><b>Amt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (1)</li>
 * <li><b>CcyXchg</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4Cls
 */
public class AmountAndCurrencyExchangeDetails4 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Amt", "CcyXchg", "Tp"};

    /**
     * Field tp.
     */
    private java.lang.String tp;

    /**
     * Field amt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount amt;

    /**
     * Field ccyXchg.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5 ccyXchg;

    public AmountAndCurrencyExchangeDetails4() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4Cls.getInstance().getNullDefiningElementDecl());
    }

    public AmountAndCurrencyExchangeDetails4(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public AmountAndCurrencyExchangeDetails4(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public AmountAndCurrencyExchangeDetails4(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4 clone) {
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
            case 2:
                setTp((java.lang.String) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 1:
                setCcyXchg((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5) value);
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
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4) clone;
        obj.tp = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.tp, obj, "Tp");
        obj.amt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.amt, obj, "Amt");
        obj.ccyXchg = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5) biz.c24.io.api.Utils.cloneDeep(this.ccyXchg, obj, "CcyXchg");
    }

    /**
     * Creates, adds and returns a new Amt (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount createAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) getElementDecl("Amt").createObject();
        setAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new CcyXchg (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5 createCcyXchg() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5) getElementDecl("CcyXchg").createObject();
        setCcyXchg(obj);
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
     * Gets the value of Amt (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount getAmt() {
        return this.amt;
    }

    /**
     * Gets the value of CcyXchg (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5 getCcyXchg() {
        return this.ccyXchg;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>tp, amt,
     * ccyXchg</b>.
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
            case 2:
                return getTp();
            case 0:
                return getAmt();
            case 1:
                return getCcyXchg();
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
            case 2:
                return this.tp == null ? 0 : 1;
            case 0:
                return this.amt == null ? 0 : 1;
            case 1:
                return this.ccyXchg == null ? 0 : 1;
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
            case 2:
                return this.tp != null && this.tp.equals(element) ? 0 : -1;
            case 0:
                return this.amt != null && this.amt.equals(element) ? 0 : -1;
            case 1:
                return this.ccyXchg != null && this.ccyXchg.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>tp, amt,
     * ccyXchg</b>.
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
            case 2:
                return this.tp;
            case 0:
                return this.amt;
            case 1:
                return this.ccyXchg;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.tp == null ? 0 : 1;
        count += this.amt == null ? 0 : 1;
        count += this.ccyXchg == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of Tp (1).
     * 
     * @return The value.
     */
    public java.lang.String getTp() {
        return this.tp;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(tp);
        result = 31 * result + hashCodeOf(amt);
        result = 31 * result + hashCodeOf(ccyXchg);
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
            case 2:
                setTp(null);
                return;
            case 0:
                setAmt(null);
                return;
            case 1:
                setCcyXchg(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Amt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        if (this.amt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.amt).setParent(this, "Amt");
    }

    /**
     * [Virtual Element] Sets the value of CcyXchg (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCcyXchg(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5 value) {
        this.ccyXchg = value;
        if (this.ccyXchg != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ccyXchg).setParent(this, "CcyXchg");
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
            case 2:
                setTp((java.lang.String) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 1:
                setCcyXchg((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5) value);
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
    public void setTp(java.lang.String value) {
        this.tp = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.tp);
        out.writeObject(this.amt);
        out.writeObject(this.ccyXchg);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.tp = (java.lang.String) in.readObject();
        this.amt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.ccyXchg = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5) in.readObject();
    }

}
