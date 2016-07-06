/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * OriginalGroupInformation20. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>OrgnlMsgId</b> of type {@link java.lang.String} (1)</li>
 * <li><b>OrgnlMsgNmId</b> of type {@link java.lang.String}
 * (1)</li>
 * <li><b>OrgnlCreDtTm</b> of type {@link
 * biz.c24.io.api.data.ISO8601DateTime} (0..1)</li>
 * <li><b>OrgnlNbOfTxs</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>OrgnlCtrlSum</b> of type {@link java.math.BigDecimal}
 * (0..1)</li>
 * <li><b>GrpSts</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>StsRsnInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8}
 * (0..*)</li>
 * <li><b>NbOfTxsPerSts</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3}
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
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20Cls
 */
public class OriginalGroupInformation20 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"GrpSts", "NbOfTxsPerSts", "OrgnlCreDtTm", "OrgnlCtrlSum", "OrgnlMsgId", "OrgnlMsgNmId", "OrgnlNbOfTxs", "StsRsnInf"};

    /**
     * Field orgnlMsgId.
     */
    private java.lang.String orgnlMsgId;

    /**
     * Field orgnlMsgNmId.
     */
    private java.lang.String orgnlMsgNmId;

    /**
     * Field orgnlCreDtTm.
     */
    private biz.c24.io.api.data.ISO8601DateTime orgnlCreDtTm;

    /**
     * Field orgnlNbOfTxs.
     */
    private java.lang.String orgnlNbOfTxs;

    /**
     * Field orgnlCtrlSum.
     */
    private java.math.BigDecimal orgnlCtrlSum;

    /**
     * Field grpSts.
     */
    private java.lang.String grpSts;

    /**
     * Field stsRsnInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[] stsRsnInf;

    /**
     * Field nbOfTxsPerSts.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[] nbOfTxsPerSts;

    public OriginalGroupInformation20() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20Cls.getInstance().getNullDefiningElementDecl());
    }

    public OriginalGroupInformation20(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public OriginalGroupInformation20(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public OriginalGroupInformation20(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20 clone) {
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
            case 4:
                setOrgnlMsgId((java.lang.String) value);
                return;
            case 5:
                setOrgnlMsgNmId((java.lang.String) value);
                return;
            case 2:
                setOrgnlCreDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 6:
                setOrgnlNbOfTxs((java.lang.String) value);
                return;
            case 3:
                setOrgnlCtrlSum(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 0:
                setGrpSts((java.lang.String) value);
                return;
            case 7:
                addStsRsnInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8) value);
                return;
            case 1:
                addNbOfTxsPerSts((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3) value);
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
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalGroupInformation20) clone;
        obj.orgnlMsgId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.orgnlMsgId, obj, "OrgnlMsgId");
        obj.orgnlMsgNmId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.orgnlMsgNmId, obj, "OrgnlMsgNmId");
        obj.orgnlCreDtTm = (biz.c24.io.api.data.ISO8601DateTime) biz.c24.io.api.Utils.cloneDeep(this.orgnlCreDtTm, obj, "OrgnlCreDtTm");
        obj.orgnlNbOfTxs = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.orgnlNbOfTxs, obj, "OrgnlNbOfTxs");
        obj.orgnlCtrlSum = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.orgnlCtrlSum, obj, "OrgnlCtrlSum");
        obj.grpSts = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.grpSts, obj, "GrpSts");
        obj.stsRsnInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[]) biz.c24.io.api.Utils.cloneDeep(this.stsRsnInf, obj, "StsRsnInf");
        obj.nbOfTxsPerSts = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[]) biz.c24.io.api.Utils.cloneDeep(this.nbOfTxsPerSts, obj, "NbOfTxsPerSts");
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
     * The legal value(s) for <code>name</code> are: <b>orgnlMsgId,
     * orgnlMsgNmId, orgnlCreDtTm, orgnlNbOfTxs, orgnlCtrlSum,
     * grpSts, stsRsnInf, nbOfTxsPerSts</b>.
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
            case 4:
                return getOrgnlMsgId();
            case 5:
                return getOrgnlMsgNmId();
            case 2:
                return getOrgnlCreDtTm();
            case 6:
                return getOrgnlNbOfTxs();
            case 3:
                return getOrgnlCtrlSum();
            case 0:
                return getGrpSts();
            case 7:
            if (this.stsRsnInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.stsRsnInf[index];
            case 1:
            if (this.nbOfTxsPerSts == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.nbOfTxsPerSts[index];
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
            case 4:
                return this.orgnlMsgId == null ? 0 : 1;
            case 5:
                return this.orgnlMsgNmId == null ? 0 : 1;
            case 2:
                return this.orgnlCreDtTm == null ? 0 : 1;
            case 6:
                return this.orgnlNbOfTxs == null ? 0 : 1;
            case 3:
                return this.orgnlCtrlSum == null ? 0 : 1;
            case 0:
                return this.grpSts == null ? 0 : 1;
            case 7:
                return this.stsRsnInf == null ? 0 : this.stsRsnInf.length;
            case 1:
                return this.nbOfTxsPerSts == null ? 0 : this.nbOfTxsPerSts.length;
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
            case 4:
                return this.orgnlMsgId != null && this.orgnlMsgId.equals(element) ? 0 : -1;
            case 5:
                return this.orgnlMsgNmId != null && this.orgnlMsgNmId.equals(element) ? 0 : -1;
            case 2:
                return this.orgnlCreDtTm != null && this.orgnlCreDtTm.equals(element) ? 0 : -1;
            case 6:
                return this.orgnlNbOfTxs != null && this.orgnlNbOfTxs.equals(element) ? 0 : -1;
            case 3:
                return this.orgnlCtrlSum != null && this.orgnlCtrlSum.equals(element) ? 0 : -1;
            case 0:
                return this.grpSts != null && this.grpSts.equals(element) ? 0 : -1;
            case 7:
                return getStsRsnInfIndex((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8) element);
            case 1:
                return getNbOfTxsPerStsIndex((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of GrpSts (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getGrpSts() {
        return this.grpSts;
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
     * Gets the value of OrgnlCreDtTm (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601DateTime getOrgnlCreDtTm() {
        return this.orgnlCreDtTm;
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
     * Gets the value of OrgnlMsgId (1).
     * 
     * @return The value.
     */
    public java.lang.String getOrgnlMsgId() {
        return this.orgnlMsgId;
    }

    /**
     * Gets the value of OrgnlMsgNmId (1).
     * 
     * @return The value.
     */
    public java.lang.String getOrgnlMsgNmId() {
        return this.orgnlMsgNmId;
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
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>orgnlMsgId,
     * orgnlMsgNmId, orgnlCreDtTm, orgnlNbOfTxs, orgnlCtrlSum,
     * grpSts, stsRsnInf, nbOfTxsPerSts</b>.
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
            case 4:
                return this.orgnlMsgId;
            case 5:
                return this.orgnlMsgNmId;
            case 2:
                return this.orgnlCreDtTm;
            case 6:
                return this.orgnlNbOfTxs;
            case 3:
                return this.orgnlCtrlSum;
            case 0:
                return this.grpSts;
            case 7:
            if (this.stsRsnInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.stsRsnInf[index];
            case 1:
            if (this.nbOfTxsPerSts == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.nbOfTxsPerSts[index];
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
        count += this.orgnlMsgId == null ? 0 : 1;
        count += this.orgnlMsgNmId == null ? 0 : 1;
        count += this.orgnlCreDtTm == null ? 0 : 1;
        count += this.orgnlNbOfTxs == null ? 0 : 1;
        count += this.orgnlCtrlSum == null ? 0 : 1;
        count += this.grpSts == null ? 0 : 1;
        count += this.stsRsnInf == null ? 0 : this.stsRsnInf.length;
        count += this.nbOfTxsPerSts == null ? 0 : this.nbOfTxsPerSts.length;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(orgnlMsgId);
        result = 31 * result + hashCodeOf(orgnlMsgNmId);
        result = 31 * result + hashCodeOf(orgnlCreDtTm);
        result = 31 * result + hashCodeOf(orgnlNbOfTxs);
        result = 31 * result + hashCodeOf(orgnlCtrlSum);
        result = 31 * result + hashCodeOf(grpSts);
        result = 31 * result + hashCodeOf(stsRsnInf);
        result = 31 * result + hashCodeOf(nbOfTxsPerSts);
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
            case 4:
                setOrgnlMsgId(null);
                return;
            case 5:
                setOrgnlMsgNmId(null);
                return;
            case 2:
                setOrgnlCreDtTm(null);
                return;
            case 6:
                setOrgnlNbOfTxs(null);
                return;
            case 3:
                setOrgnlCtrlSum(null);
                return;
            case 0:
                setGrpSts(null);
                return;
            case 7:
                removeStsRsnInf(index);
                return;
            case 1:
                removeNbOfTxsPerSts(index);
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
            case 4:
                setOrgnlMsgId((java.lang.String) value);
                return;
            case 5:
                setOrgnlMsgNmId((java.lang.String) value);
                return;
            case 2:
                setOrgnlCreDtTm((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 6:
                setOrgnlNbOfTxs((java.lang.String) value);
                return;
            case 3:
                setOrgnlCtrlSum(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 0:
                setGrpSts((java.lang.String) value);
                return;
            case 7:
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
            case 1:
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
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of GrpSts (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setGrpSts(java.lang.String value) {
        this.grpSts = value;
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
     * [Virtual Element] Sets the value of OrgnlCreDtTm (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlCreDtTm(biz.c24.io.api.data.ISO8601DateTime value) {
        this.orgnlCreDtTm = value;
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
     * [Virtual Element] Sets the value of OrgnlMsgId (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlMsgId(java.lang.String value) {
        this.orgnlMsgId = value;
    }

    /**
     * [Virtual Element] Sets the value of OrgnlMsgNmId (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrgnlMsgNmId(java.lang.String value) {
        this.orgnlMsgNmId = value;
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
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.orgnlMsgId);
        out.writeObject(this.orgnlMsgNmId);
        out.writeObject(this.orgnlCreDtTm);
        out.writeObject(this.orgnlNbOfTxs);
        out.writeObject(this.orgnlCtrlSum);
        out.writeObject(this.grpSts);
        out.writeObject(this.stsRsnInf);
        out.writeObject(this.nbOfTxsPerSts);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.orgnlMsgId = (java.lang.String) in.readObject();
        this.orgnlMsgNmId = (java.lang.String) in.readObject();
        this.orgnlCreDtTm = (biz.c24.io.api.data.ISO8601DateTime) in.readObject();
        this.orgnlNbOfTxs = (java.lang.String) in.readObject();
        this.orgnlCtrlSum = (java.math.BigDecimal) in.readObject();
        this.grpSts = (java.lang.String) in.readObject();
        this.stsRsnInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8[]) in.readObject();
        this.nbOfTxsPerSts = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.NumberOfTransactionsPerStatus3[]) in.readObject();
    }

}
