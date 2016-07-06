/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * AmountAndCurrencyExchange3. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>InstdAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3}
 * (0..1)</li>
 * <li><b>TxAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3}
 * (0..1)</li>
 * <li><b>CntrValAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3}
 * (0..1)</li>
 * <li><b>AnncdPstngAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3}
 * (0..1)</li>
 * <li><b>PrtryAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3Cls
 */
public class AmountAndCurrencyExchange3 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AnncdPstngAmt", "CntrValAmt", "InstdAmt", "PrtryAmt", "TxAmt"};

    /**
     * Field instdAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 instdAmt;

    /**
     * Field txAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 txAmt;

    /**
     * Field cntrValAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 cntrValAmt;

    /**
     * Field anncdPstngAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 anncdPstngAmt;

    /**
     * Field prtryAmt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4[] prtryAmt;

    public AmountAndCurrencyExchange3() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3Cls.getInstance().getNullDefiningElementDecl());
    }

    public AmountAndCurrencyExchange3(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public AmountAndCurrencyExchange3(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public AmountAndCurrencyExchange3(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3 clone) {
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
                setInstdAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) value);
                return;
            case 4:
                setTxAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) value);
                return;
            case 1:
                setCntrValAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) value);
                return;
            case 0:
                setAnncdPstngAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) value);
                return;
            case 3:
                addPrtryAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a PrtryAmt (0..*).
     * 
     * @param value
     * @param value The new PrtryAmt.
     */
    public void addPrtryAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4[] temp = this.prtryAmt;
        this.prtryAmt = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.prtryAmt, 0, temp.length);
        this.prtryAmt[this.prtryAmt.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "PrtryAmt");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3) clone;
        obj.instdAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) biz.c24.io.api.Utils.cloneDeep(this.instdAmt, obj, "InstdAmt");
        obj.txAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) biz.c24.io.api.Utils.cloneDeep(this.txAmt, obj, "TxAmt");
        obj.cntrValAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) biz.c24.io.api.Utils.cloneDeep(this.cntrValAmt, obj, "CntrValAmt");
        obj.anncdPstngAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) biz.c24.io.api.Utils.cloneDeep(this.anncdPstngAmt, obj, "AnncdPstngAmt");
        obj.prtryAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4[]) biz.c24.io.api.Utils.cloneDeep(this.prtryAmt, obj, "PrtryAmt");
    }

    /**
     * Creates, adds and returns a new AnncdPstngAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 createAnncdPstngAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) getElementDecl("AnncdPstngAmt").createObject();
        setAnncdPstngAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new CntrValAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 createCntrValAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) getElementDecl("CntrValAmt").createObject();
        setCntrValAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new InstdAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 createInstdAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) getElementDecl("InstdAmt").createObject();
        setInstdAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new PrtryAmt (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4 createPrtryAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4) getElementDecl("PrtryAmt").createObject();
        addPrtryAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TxAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 createTxAmt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) getElementDecl("TxAmt").createObject();
        setTxAmt(obj);
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
     * Gets the value of AnncdPstngAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 getAnncdPstngAmt() {
        return this.anncdPstngAmt;
    }

    /**
     * Gets the value of CntrValAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 getCntrValAmt() {
        return this.cntrValAmt;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>instdAmt,
     * txAmt, cntrValAmt, anncdPstngAmt, prtryAmt</b>.
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
                return getInstdAmt();
            case 4:
                return getTxAmt();
            case 1:
                return getCntrValAmt();
            case 0:
                return getAnncdPstngAmt();
            case 3:
            if (this.prtryAmt == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.prtryAmt[index];
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
                return this.instdAmt == null ? 0 : 1;
            case 4:
                return this.txAmt == null ? 0 : 1;
            case 1:
                return this.cntrValAmt == null ? 0 : 1;
            case 0:
                return this.anncdPstngAmt == null ? 0 : 1;
            case 3:
                return this.prtryAmt == null ? 0 : this.prtryAmt.length;
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
                return this.instdAmt != null && this.instdAmt.equals(element) ? 0 : -1;
            case 4:
                return this.txAmt != null && this.txAmt.equals(element) ? 0 : -1;
            case 1:
                return this.cntrValAmt != null && this.cntrValAmt.equals(element) ? 0 : -1;
            case 0:
                return this.anncdPstngAmt != null && this.anncdPstngAmt.equals(element) ? 0 : -1;
            case 3:
                return getPrtryAmtIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of InstdAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 getInstdAmt() {
        return this.instdAmt;
    }

    /**
     * Gets the value of PrtryAmt (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4[] getPrtryAmt() {
        if (this.prtryAmt == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4[]{};
        else
            return this.prtryAmt;
    }

    /**
     * Gets the value of PrtryAmt by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4 getPrtryAmt(int ordinal) {
        if (this.prtryAmt == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.prtryAmt.length) {
            return this.prtryAmt[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The PrtryAmt to get the index of.
     * @return The index.
     */
    public int getPrtryAmtIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4 value) {
        if (this.prtryAmt == null)
            return -1;
        for (int i=0; i<this.prtryAmt.length; i++)
            if (this.prtryAmt[i] == value)
                return i;
        return -1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>instdAmt,
     * txAmt, cntrValAmt, anncdPstngAmt, prtryAmt</b>.
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
                return this.instdAmt;
            case 4:
                return this.txAmt;
            case 1:
                return this.cntrValAmt;
            case 0:
                return this.anncdPstngAmt;
            case 3:
            if (this.prtryAmt == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.prtryAmt[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.instdAmt == null ? 0 : 1;
        count += this.txAmt == null ? 0 : 1;
        count += this.cntrValAmt == null ? 0 : 1;
        count += this.anncdPstngAmt == null ? 0 : 1;
        count += this.prtryAmt == null ? 0 : this.prtryAmt.length;
        return count;
    }

    /**
     * Gets the value of TxAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 getTxAmt() {
        return this.txAmt;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(instdAmt);
        result = 31 * result + hashCodeOf(txAmt);
        result = 31 * result + hashCodeOf(cntrValAmt);
        result = 31 * result + hashCodeOf(anncdPstngAmt);
        result = 31 * result + hashCodeOf(prtryAmt);
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
                setInstdAmt(null);
                return;
            case 4:
                setTxAmt(null);
                return;
            case 1:
                setCntrValAmt(null);
                return;
            case 0:
                setAnncdPstngAmt(null);
                return;
            case 3:
                removePrtryAmt(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a PrtryAmt (0..*).
     * 
     * @param index
     * @param index The index of the PrtryAmt to get.
     */
    public void removePrtryAmt(int index) {
        if (this.prtryAmt == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4[] temp = this.prtryAmt;
        this.prtryAmt = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.prtryAmt, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.prtryAmt, index, temp.length-index-1);
        if (this.prtryAmt.length == 0)
            this.prtryAmt = null;
    }

    /**
     * [Virtual Element] Sets the value of AnncdPstngAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAnncdPstngAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 value) {
        this.anncdPstngAmt = value;
        if (this.anncdPstngAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.anncdPstngAmt).setParent(this, "AnncdPstngAmt");
    }

    /**
     * [Virtual Element] Sets the value of CntrValAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCntrValAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 value) {
        this.cntrValAmt = value;
        if (this.cntrValAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cntrValAmt).setParent(this, "CntrValAmt");
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
                setInstdAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) value);
                return;
            case 4:
                setTxAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) value);
                return;
            case 1:
                setCntrValAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) value);
                return;
            case 0:
                setAnncdPstngAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) value);
                return;
            case 3:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4[]) {
                    setPrtryAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4[])value);
                } else if (this.prtryAmt == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.prtryAmt[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.prtryAmt[index]).setParent(this, "PrtryAmt");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of InstdAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInstdAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 value) {
        this.instdAmt = value;
        if (this.instdAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.instdAmt).setParent(this, "InstdAmt");
    }

    /**
     * [Virtual Element] Sets the value of PrtryAmt (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrtryAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4[] value) {
        this.prtryAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.prtryAmt != null && i<this.prtryAmt.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.prtryAmt[i]).setParent(this, "PrtryAmt");
    }

    /**
     * [Virtual Element] Sets the value of TxAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTxAmt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3 value) {
        this.txAmt = value;
        if (this.txAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.txAmt).setParent(this, "TxAmt");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.instdAmt);
        out.writeObject(this.txAmt);
        out.writeObject(this.cntrValAmt);
        out.writeObject(this.anncdPstngAmt);
        out.writeObject(this.prtryAmt);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.instdAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) in.readObject();
        this.txAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) in.readObject();
        this.cntrValAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) in.readObject();
        this.anncdPstngAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails3) in.readObject();
        this.prtryAmt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchangeDetails4[]) in.readObject();
    }

}
