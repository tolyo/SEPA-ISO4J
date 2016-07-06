/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * PaymentTransactionInformation25. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>StsId</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>OrgnlInstrId</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>OrgnlEndToEndId</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>TxSts</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>StsRsnInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8}
 * (0..*)</li>
 * <li><b>ChrgsInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5}
 * (0..*)</li>
 * <li><b>AccptncDtTm</b> of type {@link
 * biz.c24.io.api.data.ISO8601DateTime} (0..1)</li>
 * <li><b>AcctSvcrRef</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>ClrSysRef</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>OrgnlTxRef</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13}
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
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25Cls
 */
public class PaymentTransactionInformation25 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AccptncDtTm", "AcctSvcrRef", "ChrgsInf", "ClrSysRef", "OrgnlEndToEndId", "OrgnlInstrId", "OrgnlTxRef", "StsId", "StsRsnInf", "TxSts"};

    /**
     * Field stsId.
     */
    private java.lang.String stsId;

    /**
     * Field orgnlInstrId.
     */
    private java.lang.String orgnlInstrId;

    /**
     * Field orgnlEndToEndId.
     */
    private java.lang.String orgnlEndToEndId;

    /**
     * Field txSts.
     */
    private java.lang.String txSts;

    /**
     * Field stsRsnInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[] stsRsnInf;

    /**
     * Field chrgsInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5[] chrgsInf;

    /**
     * Field accptncDtTm.
     */
    private biz.c24.io.api.data.ISO8601DateTime accptncDtTm;

    /**
     * Field acctSvcrRef.
     */
    private java.lang.String acctSvcrRef;

    /**
     * Field clrSysRef.
     */
    private java.lang.String clrSysRef;

    /**
     * Field orgnlTxRef.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13 orgnlTxRef;

    public PaymentTransactionInformation25() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25Cls.getInstance().getNullDefiningElementDecl());
    }

    public PaymentTransactionInformation25(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public PaymentTransactionInformation25(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public PaymentTransactionInformation25(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25 clone) {
        super(clone);
    }

    /**
     * Adds a ChrgsInf (0..*).
     * 
     * @param value
     * @param value The new ChrgsInf.
     */
    public void addChrgsInf(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5 value) {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5[] temp = this.chrgsInf;
        this.chrgsInf = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.chrgsInf, 0, temp.length);
        this.chrgsInf[this.chrgsInf.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "ChrgsInf");
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
            case 7:
                setStsId((java.lang.String) value);
                return;
            case 5:
                setOrgnlInstrId((java.lang.String) value);
                return;
            case 4:
                setOrgnlEndToEndId((java.lang.String) value);
                return;
            case 9:
                setTxSts((java.lang.String) value);
                return;
            case 8:
                addStsRsnInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8) value);
                return;
            case 2:
                addChrgsInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5) value);
                return;
            case 0:
                setAccptncDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 1:
                setAcctSvcrRef((java.lang.String) value);
                return;
            case 3:
                setClrSysRef((java.lang.String) value);
                return;
            case 6:
                setOrgnlTxRef((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a StsRsnInf (0..*).
     * 
     * @param value
     * @param value The new StsRsnInf.
     */
    public void addStsRsnInf(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8 value) {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[] temp = this.stsRsnInf;
        this.stsRsnInf = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.stsRsnInf, 0, temp.length);
        this.stsRsnInf[this.stsRsnInf.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "StsRsnInf");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25) clone;
        obj.stsId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.stsId, obj, "StsId");
        obj.orgnlInstrId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.orgnlInstrId, obj, "OrgnlInstrId");
        obj.orgnlEndToEndId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.orgnlEndToEndId, obj, "OrgnlEndToEndId");
        obj.txSts = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.txSts, obj, "TxSts");
        obj.stsRsnInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[]) biz.c24.io.api.Utils.cloneDeep(this.stsRsnInf, obj, "StsRsnInf");
        obj.chrgsInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5[]) biz.c24.io.api.Utils.cloneDeep(this.chrgsInf, obj, "ChrgsInf");
        obj.accptncDtTm = (biz.c24.io.api.data.ISO8601DateTime) biz.c24.io.api.Utils.cloneDeep(this.accptncDtTm, obj, "AccptncDtTm");
        obj.acctSvcrRef = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.acctSvcrRef, obj, "AcctSvcrRef");
        obj.clrSysRef = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.clrSysRef, obj, "ClrSysRef");
        obj.orgnlTxRef = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13) biz.c24.io.api.Utils.cloneDeep(this.orgnlTxRef, obj, "OrgnlTxRef");
    }

    /**
     * Creates, adds and returns a new ChrgsInf (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5 createChrgsInf() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5) getElementDecl("ChrgsInf").createObject();
        addChrgsInf(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new OrgnlTxRef (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13 createOrgnlTxRef() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13) getElementDecl("OrgnlTxRef").createObject();
        setOrgnlTxRef(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new StsRsnInf (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8 createStsRsnInf() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8) getElementDecl("StsRsnInf").createObject();
        addStsRsnInf(obj);
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
     * Gets the value of AccptncDtTm (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601DateTime getAccptncDtTm() {
        return this.accptncDtTm;
    }

    /**
     * Gets the value of AcctSvcrRef (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getAcctSvcrRef() {
        return this.acctSvcrRef;
    }

    /**
     * Gets the value of ChrgsInf (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5[] getChrgsInf() {
        if (this.chrgsInf == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5[]{};
        else
            return this.chrgsInf;
    }

    /**
     * Gets the value of ChrgsInf by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5 getChrgsInf(int ordinal) {
        if (this.chrgsInf == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.chrgsInf.length) {
            return this.chrgsInf[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The ChrgsInf to get the index of.
     * @return The index.
     */
    public int getChrgsInfIndex(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5 value) {
        if (this.chrgsInf == null)
            return -1;
        for (int i=0; i<this.chrgsInf.length; i++)
            if (this.chrgsInf[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of ClrSysRef (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getClrSysRef() {
        return this.clrSysRef;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>stsId,
     * orgnlInstrId, orgnlEndToEndId, txSts, stsRsnInf, chrgsInf,
     * accptncDtTm, acctSvcrRef, clrSysRef, orgnlTxRef</b>.
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
            case 7:
                return getStsId();
            case 5:
                return getOrgnlInstrId();
            case 4:
                return getOrgnlEndToEndId();
            case 9:
                return getTxSts();
            case 8:
            if (this.stsRsnInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.stsRsnInf[index];
            case 2:
            if (this.chrgsInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.chrgsInf[index];
            case 0:
                return getAccptncDtTm();
            case 1:
                return getAcctSvcrRef();
            case 3:
                return getClrSysRef();
            case 6:
                return getOrgnlTxRef();
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
            case 7:
                return this.stsId == null ? 0 : 1;
            case 5:
                return this.orgnlInstrId == null ? 0 : 1;
            case 4:
                return this.orgnlEndToEndId == null ? 0 : 1;
            case 9:
                return this.txSts == null ? 0 : 1;
            case 8:
                return this.stsRsnInf == null ? 0 : this.stsRsnInf.length;
            case 2:
                return this.chrgsInf == null ? 0 : this.chrgsInf.length;
            case 0:
                return this.accptncDtTm == null ? 0 : 1;
            case 1:
                return this.acctSvcrRef == null ? 0 : 1;
            case 3:
                return this.clrSysRef == null ? 0 : 1;
            case 6:
                return this.orgnlTxRef == null ? 0 : 1;
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
            case 7:
                return this.stsId != null && this.stsId.equals(element) ? 0 : -1;
            case 5:
                return this.orgnlInstrId != null && this.orgnlInstrId.equals(element) ? 0 : -1;
            case 4:
                return this.orgnlEndToEndId != null && this.orgnlEndToEndId.equals(element) ? 0 : -1;
            case 9:
                return this.txSts != null && this.txSts.equals(element) ? 0 : -1;
            case 8:
                return getStsRsnInfIndex((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8) element);
            case 2:
                return getChrgsInfIndex((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5) element);
            case 0:
                return this.accptncDtTm != null && this.accptncDtTm.equals(element) ? 0 : -1;
            case 1:
                return this.acctSvcrRef != null && this.acctSvcrRef.equals(element) ? 0 : -1;
            case 3:
                return this.clrSysRef != null && this.clrSysRef.equals(element) ? 0 : -1;
            case 6:
                return this.orgnlTxRef != null && this.orgnlTxRef.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of OrgnlEndToEndId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getOrgnlEndToEndId() {
        return this.orgnlEndToEndId;
    }

    /**
     * Gets the value of OrgnlInstrId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getOrgnlInstrId() {
        return this.orgnlInstrId;
    }

    /**
     * Gets the value of OrgnlTxRef (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13 getOrgnlTxRef() {
        return this.orgnlTxRef;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>stsId,
     * orgnlInstrId, orgnlEndToEndId, txSts, stsRsnInf, chrgsInf,
     * accptncDtTm, acctSvcrRef, clrSysRef, orgnlTxRef</b>.
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
            case 7:
                return this.stsId;
            case 5:
                return this.orgnlInstrId;
            case 4:
                return this.orgnlEndToEndId;
            case 9:
                return this.txSts;
            case 8:
            if (this.stsRsnInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.stsRsnInf[index];
            case 2:
            if (this.chrgsInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.chrgsInf[index];
            case 0:
                return this.accptncDtTm;
            case 1:
                return this.acctSvcrRef;
            case 3:
                return this.clrSysRef;
            case 6:
                return this.orgnlTxRef;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of StsId (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getStsId() {
        return this.stsId;
    }

    /**
     * Gets the value of StsRsnInf (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[] getStsRsnInf() {
        if (this.stsRsnInf == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[]{};
        else
            return this.stsRsnInf;
    }

    /**
     * Gets the value of StsRsnInf by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8 getStsRsnInf(int ordinal) {
        if (this.stsRsnInf == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.stsRsnInf.length) {
            return this.stsRsnInf[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The StsRsnInf to get the index of.
     * @return The index.
     */
    public int getStsRsnInfIndex(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8 value) {
        if (this.stsRsnInf == null)
            return -1;
        for (int i=0; i<this.stsRsnInf.length; i++)
            if (this.stsRsnInf[i] == value)
                return i;
        return -1;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.stsId == null ? 0 : 1;
        count += this.orgnlInstrId == null ? 0 : 1;
        count += this.orgnlEndToEndId == null ? 0 : 1;
        count += this.txSts == null ? 0 : 1;
        count += this.stsRsnInf == null ? 0 : this.stsRsnInf.length;
        count += this.chrgsInf == null ? 0 : this.chrgsInf.length;
        count += this.accptncDtTm == null ? 0 : 1;
        count += this.acctSvcrRef == null ? 0 : 1;
        count += this.clrSysRef == null ? 0 : 1;
        count += this.orgnlTxRef == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of TxSts (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getTxSts() {
        return this.txSts;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(stsId);
        result = 31 * result + hashCodeOf(orgnlInstrId);
        result = 31 * result + hashCodeOf(orgnlEndToEndId);
        result = 31 * result + hashCodeOf(txSts);
        result = 31 * result + hashCodeOf(stsRsnInf);
        result = 31 * result + hashCodeOf(chrgsInf);
        result = 31 * result + hashCodeOf(accptncDtTm);
        result = 31 * result + hashCodeOf(acctSvcrRef);
        result = 31 * result + hashCodeOf(clrSysRef);
        result = 31 * result + hashCodeOf(orgnlTxRef);
        return result;
    }

    /**
     * Removes a ChrgsInf (0..*).
     * 
     * @param index
     * @param index The index of the ChrgsInf to get.
     */
    public void removeChrgsInf(int index) {
        if (this.chrgsInf == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5[] temp = this.chrgsInf;
        this.chrgsInf = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.chrgsInf, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.chrgsInf, index, temp.length-index-1);
        if (this.chrgsInf.length == 0)
            this.chrgsInf = null;
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
            case 7:
                setStsId(null);
                return;
            case 5:
                setOrgnlInstrId(null);
                return;
            case 4:
                setOrgnlEndToEndId(null);
                return;
            case 9:
                setTxSts(null);
                return;
            case 8:
                removeStsRsnInf(index);
                return;
            case 2:
                removeChrgsInf(index);
                return;
            case 0:
                setAccptncDtTm(null);
                return;
            case 1:
                setAcctSvcrRef(null);
                return;
            case 3:
                setClrSysRef(null);
                return;
            case 6:
                setOrgnlTxRef(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a StsRsnInf (0..*).
     * 
     * @param index
     * @param index The index of the StsRsnInf to get.
     */
    public void removeStsRsnInf(int index) {
        if (this.stsRsnInf == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[] temp = this.stsRsnInf;
        this.stsRsnInf = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.stsRsnInf, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.stsRsnInf, index, temp.length-index-1);
        if (this.stsRsnInf.length == 0)
            this.stsRsnInf = null;
    }

    /**
     * [Virtual Element] Sets the value of AccptncDtTm (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAccptncDtTm(biz.c24.io.api.data.ISO8601DateTime value) {
        this.accptncDtTm = value;
    }

    /**
     * [Virtual Element] Sets the value of AcctSvcrRef (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAcctSvcrRef(java.lang.String value) {
        this.acctSvcrRef = value;
    }

    /**
     * [Virtual Element] Sets the value of ChrgsInf (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setChrgsInf(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5[] value) {
        this.chrgsInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.chrgsInf != null && i<this.chrgsInf.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.chrgsInf[i]).setParent(this, "ChrgsInf");
    }

    /**
     * [Virtual Element] Sets the value of ClrSysRef (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setClrSysRef(java.lang.String value) {
        this.clrSysRef = value;
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
            case 7:
                setStsId((java.lang.String) value);
                return;
            case 5:
                setOrgnlInstrId((java.lang.String) value);
                return;
            case 4:
                setOrgnlEndToEndId((java.lang.String) value);
                return;
            case 9:
                setTxSts((java.lang.String) value);
                return;
            case 8:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[]) {
                    setStsRsnInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[])value);
                } else if (this.stsRsnInf == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.stsRsnInf[index] = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.stsRsnInf[index]).setParent(this, "StsRsnInf");
                }
                return;
            case 2:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5[]) {
                    setChrgsInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5[])value);
                } else if (this.chrgsInf == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.chrgsInf[index] = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.chrgsInf[index]).setParent(this, "ChrgsInf");
                }
                return;
            case 0:
                setAccptncDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 1:
                setAcctSvcrRef((java.lang.String) value);
                return;
            case 3:
                setClrSysRef((java.lang.String) value);
                return;
            case 6:
                setOrgnlTxRef((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of OrgnlEndToEndId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlEndToEndId(java.lang.String value) {
        this.orgnlEndToEndId = value;
    }

    /**
     * [Virtual Element] Sets the value of OrgnlInstrId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlInstrId(java.lang.String value) {
        this.orgnlInstrId = value;
    }

    /**
     * [Virtual Element] Sets the value of OrgnlTxRef (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlTxRef(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13 value) {
        this.orgnlTxRef = value;
        if (this.orgnlTxRef != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.orgnlTxRef).setParent(this, "OrgnlTxRef");
    }

    /**
     * [Virtual Element] Sets the value of StsId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setStsId(java.lang.String value) {
        this.stsId = value;
    }

    /**
     * [Virtual Element] Sets the value of StsRsnInf (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setStsRsnInf(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[] value) {
        this.stsRsnInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.stsRsnInf != null && i<this.stsRsnInf.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.stsRsnInf[i]).setParent(this, "StsRsnInf");
    }

    /**
     * [Virtual Element] Sets the value of TxSts (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTxSts(java.lang.String value) {
        this.txSts = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.stsId);
        out.writeObject(this.orgnlInstrId);
        out.writeObject(this.orgnlEndToEndId);
        out.writeObject(this.txSts);
        out.writeObject(this.stsRsnInf);
        out.writeObject(this.chrgsInf);
        out.writeObject(this.accptncDtTm);
        out.writeObject(this.acctSvcrRef);
        out.writeObject(this.clrSysRef);
        out.writeObject(this.orgnlTxRef);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.stsId = (java.lang.String) in.readObject();
        this.orgnlInstrId = (java.lang.String) in.readObject();
        this.orgnlEndToEndId = (java.lang.String) in.readObject();
        this.txSts = (java.lang.String) in.readObject();
        this.stsRsnInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[]) in.readObject();
        this.chrgsInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ChargesInformation5[]) in.readObject();
        this.accptncDtTm = (biz.c24.io.api.data.ISO8601DateTime) in.readObject();
        this.acctSvcrRef = (java.lang.String) in.readObject();
        this.clrSysRef = (java.lang.String) in.readObject();
        this.orgnlTxRef = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13) in.readObject();
    }

}
