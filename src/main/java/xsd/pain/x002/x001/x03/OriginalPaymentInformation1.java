/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * OriginalPaymentInformation1. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>OrgnlPmtInfId</b> of type {@link java.lang.String}
 * (1)</li>
 * <li><b>OrgnlNbOfTxs</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>OrgnlCtrlSum</b> of type {@link java.math.BigDecimal}
 * (0..1)</li>
 * <li><b>PmtInfSts</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>StsRsnInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8}
 * (0..*)</li>
 * <li><b>NbOfTxsPerSts</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3}
 * (0..*)</li>
 * <li><b>TxInfAndSts</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25}
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
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1Cls
 */
public class OriginalPaymentInformation1 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"NbOfTxsPerSts", "OrgnlCtrlSum", "OrgnlNbOfTxs", "OrgnlPmtInfId", "PmtInfSts", "StsRsnInf", "TxInfAndSts"};

    /**
     * Field orgnlPmtInfId.
     */
    private java.lang.String orgnlPmtInfId;

    /**
     * Field orgnlNbOfTxs.
     */
    private java.lang.String orgnlNbOfTxs;

    /**
     * Field orgnlCtrlSum.
     */
    private java.math.BigDecimal orgnlCtrlSum;

    /**
     * Field pmtInfSts.
     */
    private java.lang.String pmtInfSts;

    /**
     * Field stsRsnInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[] stsRsnInf;

    /**
     * Field nbOfTxsPerSts.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[] nbOfTxsPerSts;

    /**
     * Field txInfAndSts.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25[] txInfAndSts;

    public OriginalPaymentInformation1() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1Cls.getInstance().getNullDefiningElementDecl());
    }

    public OriginalPaymentInformation1(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public OriginalPaymentInformation1(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public OriginalPaymentInformation1(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1 clone) {
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
            case 3:
                setOrgnlPmtInfId((java.lang.String) value);
                return;
            case 2:
                setOrgnlNbOfTxs((java.lang.String) value);
                return;
            case 1:
                setOrgnlCtrlSum(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 4:
                setPmtInfSts((java.lang.String) value);
                return;
            case 5:
                addStsRsnInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8) value);
                return;
            case 0:
                addNbOfTxsPerSts((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3) value);
                return;
            case 6:
                addTxInfAndSts((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a NbOfTxsPerSts (0..*).
     * 
     * @param value
     * @param value The new NbOfTxsPerSts.
     */
    public void addNbOfTxsPerSts(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3 value) {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[] temp = this.nbOfTxsPerSts;
        this.nbOfTxsPerSts = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.nbOfTxsPerSts, 0, temp.length);
        this.nbOfTxsPerSts[this.nbOfTxsPerSts.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "NbOfTxsPerSts");
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
     * Adds a TxInfAndSts (0..*).
     * 
     * @param value
     * @param value The new TxInfAndSts.
     */
    public void addTxInfAndSts(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25 value) {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25[] temp = this.txInfAndSts;
        this.txInfAndSts = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.txInfAndSts, 0, temp.length);
        this.txInfAndSts[this.txInfAndSts.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "TxInfAndSts");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalPaymentInformation1) clone;
        obj.orgnlPmtInfId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.orgnlPmtInfId, obj, "OrgnlPmtInfId");
        obj.orgnlNbOfTxs = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.orgnlNbOfTxs, obj, "OrgnlNbOfTxs");
        obj.orgnlCtrlSum = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.orgnlCtrlSum, obj, "OrgnlCtrlSum");
        obj.pmtInfSts = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.pmtInfSts, obj, "PmtInfSts");
        obj.stsRsnInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[]) biz.c24.io.api.Utils.cloneDeep(this.stsRsnInf, obj, "StsRsnInf");
        obj.nbOfTxsPerSts = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[]) biz.c24.io.api.Utils.cloneDeep(this.nbOfTxsPerSts, obj, "NbOfTxsPerSts");
        obj.txInfAndSts = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25[]) biz.c24.io.api.Utils.cloneDeep(this.txInfAndSts, obj, "TxInfAndSts");
    }

    /**
     * Creates, adds and returns a new NbOfTxsPerSts (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3 createNbOfTxsPerSts() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3) getElementDecl("NbOfTxsPerSts").createObject();
        addNbOfTxsPerSts(obj);
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

    /**
     * Creates, adds and returns a new TxInfAndSts (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25 createTxInfAndSts() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25) getElementDecl("TxInfAndSts").createObject();
        addTxInfAndSts(obj);
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
     * The legal value(s) for <code>name</code> are:
     * <b>orgnlPmtInfId, orgnlNbOfTxs, orgnlCtrlSum, pmtInfSts,
     * stsRsnInf, nbOfTxsPerSts, txInfAndSts</b>.
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
            case 3:
                return getOrgnlPmtInfId();
            case 2:
                return getOrgnlNbOfTxs();
            case 1:
                return getOrgnlCtrlSum();
            case 4:
                return getPmtInfSts();
            case 5:
            if (this.stsRsnInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.stsRsnInf[index];
            case 0:
            if (this.nbOfTxsPerSts == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.nbOfTxsPerSts[index];
            case 6:
            if (this.txInfAndSts == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.txInfAndSts[index];
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
            case 3:
                return this.orgnlPmtInfId == null ? 0 : 1;
            case 2:
                return this.orgnlNbOfTxs == null ? 0 : 1;
            case 1:
                return this.orgnlCtrlSum == null ? 0 : 1;
            case 4:
                return this.pmtInfSts == null ? 0 : 1;
            case 5:
                return this.stsRsnInf == null ? 0 : this.stsRsnInf.length;
            case 0:
                return this.nbOfTxsPerSts == null ? 0 : this.nbOfTxsPerSts.length;
            case 6:
                return this.txInfAndSts == null ? 0 : this.txInfAndSts.length;
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
            case 3:
                return this.orgnlPmtInfId != null && this.orgnlPmtInfId.equals(element) ? 0 : -1;
            case 2:
                return this.orgnlNbOfTxs != null && this.orgnlNbOfTxs.equals(element) ? 0 : -1;
            case 1:
                return this.orgnlCtrlSum != null && this.orgnlCtrlSum.equals(element) ? 0 : -1;
            case 4:
                return this.pmtInfSts != null && this.pmtInfSts.equals(element) ? 0 : -1;
            case 5:
                return getStsRsnInfIndex((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8) element);
            case 0:
                return getNbOfTxsPerStsIndex((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3) element);
            case 6:
                return getTxInfAndStsIndex((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of NbOfTxsPerSts (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[] getNbOfTxsPerSts() {
        if (this.nbOfTxsPerSts == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[]{};
        else
            return this.nbOfTxsPerSts;
    }

    /**
     * Gets the value of NbOfTxsPerSts by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3 getNbOfTxsPerSts(int ordinal) {
        if (this.nbOfTxsPerSts == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.nbOfTxsPerSts.length) {
            return this.nbOfTxsPerSts[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The NbOfTxsPerSts to get the index of.
     * @return The index.
     */
    public int getNbOfTxsPerStsIndex(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3 value) {
        if (this.nbOfTxsPerSts == null)
            return -1;
        for (int i=0; i<this.nbOfTxsPerSts.length; i++)
            if (this.nbOfTxsPerSts[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of OrgnlCtrlSum (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getOrgnlCtrlSum() {
        return this.orgnlCtrlSum;
    }

    /**
     * Gets the value of OrgnlNbOfTxs (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getOrgnlNbOfTxs() {
        return this.orgnlNbOfTxs;
    }

    /**
     * Gets the value of OrgnlPmtInfId (1).
     * 
     * @return The value.
     */
    public java.lang.String getOrgnlPmtInfId() {
        return this.orgnlPmtInfId;
    }

    /**
     * Gets the value of PmtInfSts (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getPmtInfSts() {
        return this.pmtInfSts;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>orgnlPmtInfId, orgnlNbOfTxs, orgnlCtrlSum, pmtInfSts,
     * stsRsnInf, nbOfTxsPerSts, txInfAndSts</b>.
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
            case 3:
                return this.orgnlPmtInfId;
            case 2:
                return this.orgnlNbOfTxs;
            case 1:
                return this.orgnlCtrlSum;
            case 4:
                return this.pmtInfSts;
            case 5:
            if (this.stsRsnInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.stsRsnInf[index];
            case 0:
            if (this.nbOfTxsPerSts == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.nbOfTxsPerSts[index];
            case 6:
            if (this.txInfAndSts == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.txInfAndSts[index];
            default:
                return super.getElement(name, index);
        }
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
        count += this.orgnlPmtInfId == null ? 0 : 1;
        count += this.orgnlNbOfTxs == null ? 0 : 1;
        count += this.orgnlCtrlSum == null ? 0 : 1;
        count += this.pmtInfSts == null ? 0 : 1;
        count += this.stsRsnInf == null ? 0 : this.stsRsnInf.length;
        count += this.nbOfTxsPerSts == null ? 0 : this.nbOfTxsPerSts.length;
        count += this.txInfAndSts == null ? 0 : this.txInfAndSts.length;
        return count;
    }

    /**
     * Gets the value of TxInfAndSts (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25[] getTxInfAndSts() {
        if (this.txInfAndSts == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25[]{};
        else
            return this.txInfAndSts;
    }

    /**
     * Gets the value of TxInfAndSts by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25 getTxInfAndSts(int ordinal) {
        if (this.txInfAndSts == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.txInfAndSts.length) {
            return this.txInfAndSts[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The TxInfAndSts to get the index of.
     * @return The index.
     */
    public int getTxInfAndStsIndex(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25 value) {
        if (this.txInfAndSts == null)
            return -1;
        for (int i=0; i<this.txInfAndSts.length; i++)
            if (this.txInfAndSts[i] == value)
                return i;
        return -1;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(orgnlPmtInfId);
        result = 31 * result + hashCodeOf(orgnlNbOfTxs);
        result = 31 * result + hashCodeOf(orgnlCtrlSum);
        result = 31 * result + hashCodeOf(pmtInfSts);
        result = 31 * result + hashCodeOf(stsRsnInf);
        result = 31 * result + hashCodeOf(nbOfTxsPerSts);
        result = 31 * result + hashCodeOf(txInfAndSts);
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
            case 3:
                setOrgnlPmtInfId(null);
                return;
            case 2:
                setOrgnlNbOfTxs(null);
                return;
            case 1:
                setOrgnlCtrlSum(null);
                return;
            case 4:
                setPmtInfSts(null);
                return;
            case 5:
                removeStsRsnInf(index);
                return;
            case 0:
                removeNbOfTxsPerSts(index);
                return;
            case 6:
                removeTxInfAndSts(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a NbOfTxsPerSts (0..*).
     * 
     * @param index
     * @param index The index of the NbOfTxsPerSts to get.
     */
    public void removeNbOfTxsPerSts(int index) {
        if (this.nbOfTxsPerSts == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[] temp = this.nbOfTxsPerSts;
        this.nbOfTxsPerSts = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.nbOfTxsPerSts, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.nbOfTxsPerSts, index, temp.length-index-1);
        if (this.nbOfTxsPerSts.length == 0)
            this.nbOfTxsPerSts = null;
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
     * Removes a TxInfAndSts (0..*).
     * 
     * @param index
     * @param index The index of the TxInfAndSts to get.
     */
    public void removeTxInfAndSts(int index) {
        if (this.txInfAndSts == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25[] temp = this.txInfAndSts;
        this.txInfAndSts = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.txInfAndSts, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.txInfAndSts, index, temp.length-index-1);
        if (this.txInfAndSts.length == 0)
            this.txInfAndSts = null;
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
            case 3:
                setOrgnlPmtInfId((java.lang.String) value);
                return;
            case 2:
                setOrgnlNbOfTxs((java.lang.String) value);
                return;
            case 1:
                setOrgnlCtrlSum(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 4:
                setPmtInfSts((java.lang.String) value);
                return;
            case 5:
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
            case 0:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[]) {
                    setNbOfTxsPerSts((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[])value);
                } else if (this.nbOfTxsPerSts == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.nbOfTxsPerSts[index] = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.nbOfTxsPerSts[index]).setParent(this, "NbOfTxsPerSts");
                }
                return;
            case 6:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25[]) {
                    setTxInfAndSts((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25[])value);
                } else if (this.txInfAndSts == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.txInfAndSts[index] = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.txInfAndSts[index]).setParent(this, "TxInfAndSts");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of NbOfTxsPerSts (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNbOfTxsPerSts(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[] value) {
        this.nbOfTxsPerSts = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.nbOfTxsPerSts != null && i<this.nbOfTxsPerSts.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.nbOfTxsPerSts[i]).setParent(this, "NbOfTxsPerSts");
    }

    /**
     * [Virtual Element] Sets the value of OrgnlCtrlSum (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlCtrlSum(java.math.BigDecimal value) {
        this.orgnlCtrlSum = value;
    }

    /**
     * [Virtual Element] Sets the value of OrgnlNbOfTxs (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlNbOfTxs(java.lang.String value) {
        this.orgnlNbOfTxs = value;
    }

    /**
     * [Virtual Element] Sets the value of OrgnlPmtInfId (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlPmtInfId(java.lang.String value) {
        this.orgnlPmtInfId = value;
    }

    /**
     * [Virtual Element] Sets the value of PmtInfSts (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPmtInfSts(java.lang.String value) {
        this.pmtInfSts = value;
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
     * [Virtual Element] Sets the value of TxInfAndSts (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTxInfAndSts(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25[] value) {
        this.txInfAndSts = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.txInfAndSts != null && i<this.txInfAndSts.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.txInfAndSts[i]).setParent(this, "TxInfAndSts");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.orgnlPmtInfId);
        out.writeObject(this.orgnlNbOfTxs);
        out.writeObject(this.orgnlCtrlSum);
        out.writeObject(this.pmtInfSts);
        out.writeObject(this.stsRsnInf);
        out.writeObject(this.nbOfTxsPerSts);
        out.writeObject(this.txInfAndSts);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.orgnlPmtInfId = (java.lang.String) in.readObject();
        this.orgnlNbOfTxs = (java.lang.String) in.readObject();
        this.orgnlCtrlSum = (java.math.BigDecimal) in.readObject();
        this.pmtInfSts = (java.lang.String) in.readObject();
        this.stsRsnInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[]) in.readObject();
        this.nbOfTxsPerSts = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[]) in.readObject();
        this.txInfAndSts = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTransactionInformation25[]) in.readObject();
    }

}
