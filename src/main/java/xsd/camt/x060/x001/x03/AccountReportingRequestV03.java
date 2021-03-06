/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * AccountReportingRequestV03. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>GrpHdr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GroupHeader59}
 * (1)</li>
 * <li><b>RptgReq</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3}
 * (1..*)</li>
 * <li><b>SplmtryData</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1}
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
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountReportingRequestV03Cls
 */
public class AccountReportingRequestV03 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"GrpHdr", "RptgReq", "SplmtryData"};

    /**
     * Field grpHdr.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GroupHeader59 grpHdr;

    /**
     * Field rptgReq.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3[] rptgReq;

    /**
     * Field splmtryData.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1[] splmtryData;

    public AccountReportingRequestV03() {
        this(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountReportingRequestV03Cls.getInstance().getNullDefiningElementDecl());
    }

    public AccountReportingRequestV03(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public AccountReportingRequestV03(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public AccountReportingRequestV03(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountReportingRequestV03 clone) {
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
                setGrpHdr((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GroupHeader59) value);
                return;
            case 1:
                addRptgReq((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3) value);
                return;
            case 2:
                addSplmtryData((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a RptgReq (1..*).
     * 
     * @param value
     * @param value The new RptgReq.
     */
    public void addRptgReq(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3 value) {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3[] temp = this.rptgReq;
        this.rptgReq = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.rptgReq, 0, temp.length);
        this.rptgReq[this.rptgReq.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "RptgReq");
    }

    /**
     * Adds a SplmtryData (0..*).
     * 
     * @param value
     * @param value The new SplmtryData.
     */
    public void addSplmtryData(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1 value) {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1[] temp = this.splmtryData;
        this.splmtryData = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.splmtryData, 0, temp.length);
        this.splmtryData[this.splmtryData.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "SplmtryData");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountReportingRequestV03(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountReportingRequestV03(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountReportingRequestV03 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.AccountReportingRequestV03) clone;
        obj.grpHdr = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GroupHeader59) biz.c24.io.api.Utils.cloneDeep(this.grpHdr, obj, "GrpHdr");
        obj.rptgReq = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3[]) biz.c24.io.api.Utils.cloneDeep(this.rptgReq, obj, "RptgReq");
        obj.splmtryData = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1[]) biz.c24.io.api.Utils.cloneDeep(this.splmtryData, obj, "SplmtryData");
    }

    /**
     * Creates, adds and returns a new GrpHdr (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GroupHeader59 createGrpHdr() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GroupHeader59 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GroupHeader59) getElementDecl("GrpHdr").createObject();
        setGrpHdr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RptgReq (1..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3 createRptgReq() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3) getElementDecl("RptgReq").createObject();
        addRptgReq(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new SplmtryData (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1 createSplmtryData() {
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1 obj = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1) getElementDecl("SplmtryData").createObject();
        addSplmtryData(obj);
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
     * The legal value(s) for <code>name</code> are: <b>grpHdr,
     * rptgReq, splmtryData</b>.
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
                return getGrpHdr();
            case 1:
            if (this.rptgReq == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rptgReq[index];
            case 2:
            if (this.splmtryData == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.splmtryData[index];
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
                return this.grpHdr == null ? 0 : 1;
            case 1:
                return this.rptgReq == null ? 0 : this.rptgReq.length;
            case 2:
                return this.splmtryData == null ? 0 : this.splmtryData.length;
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
                return this.grpHdr != null && this.grpHdr.equals(element) ? 0 : -1;
            case 1:
                return getRptgReqIndex((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3) element);
            case 2:
                return getSplmtryDataIndex((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of GrpHdr (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GroupHeader59 getGrpHdr() {
        return this.grpHdr;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>grpHdr,
     * rptgReq, splmtryData</b>.
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
                return this.grpHdr;
            case 1:
            if (this.rptgReq == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rptgReq[index];
            case 2:
            if (this.splmtryData == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.splmtryData[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of RptgReq (1..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3[] getRptgReq() {
        if (this.rptgReq == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3[]{};
        else
            return this.rptgReq;
    }

    /**
     * Gets the value of RptgReq by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3 getRptgReq(int ordinal) {
        if (this.rptgReq == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.rptgReq.length) {
            return this.rptgReq[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (1..*).
     * 
     * @param value
     * @param value The RptgReq to get the index of.
     * @return The index.
     */
    public int getRptgReqIndex(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3 value) {
        if (this.rptgReq == null)
            return -1;
        for (int i=0; i<this.rptgReq.length; i++)
            if (this.rptgReq[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of SplmtryData (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1[] getSplmtryData() {
        if (this.splmtryData == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1[]{};
        else
            return this.splmtryData;
    }

    /**
     * Gets the value of SplmtryData by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1 getSplmtryData(int ordinal) {
        if (this.splmtryData == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.splmtryData.length) {
            return this.splmtryData[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The SplmtryData to get the index of.
     * @return The index.
     */
    public int getSplmtryDataIndex(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1 value) {
        if (this.splmtryData == null)
            return -1;
        for (int i=0; i<this.splmtryData.length; i++)
            if (this.splmtryData[i] == value)
                return i;
        return -1;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.grpHdr == null ? 0 : 1;
        count += this.rptgReq == null ? 0 : this.rptgReq.length;
        count += this.splmtryData == null ? 0 : this.splmtryData.length;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(grpHdr);
        result = 31 * result + hashCodeOf(rptgReq);
        result = 31 * result + hashCodeOf(splmtryData);
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
                setGrpHdr(null);
                return;
            case 1:
                removeRptgReq(index);
                return;
            case 2:
                removeSplmtryData(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a RptgReq (1..*).
     * 
     * @param index
     * @param index The index of the RptgReq to get.
     */
    public void removeRptgReq(int index) {
        if (this.rptgReq == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3[] temp = this.rptgReq;
        this.rptgReq = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.rptgReq, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.rptgReq, index, temp.length-index-1);
        if (this.rptgReq.length == 0)
            this.rptgReq = null;
    }

    /**
     * Removes a SplmtryData (0..*).
     * 
     * @param index
     * @param index The index of the SplmtryData to get.
     */
    public void removeSplmtryData(int index) {
        if (this.splmtryData == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1[] temp = this.splmtryData;
        this.splmtryData = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.splmtryData, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.splmtryData, index, temp.length-index-1);
        if (this.splmtryData.length == 0)
            this.splmtryData = null;
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
                setGrpHdr((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GroupHeader59) value);
                return;
            case 1:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3[]) {
                    setRptgReq((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3[])value);
                } else if (this.rptgReq == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.rptgReq[index] = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.rptgReq[index]).setParent(this, "RptgReq");
                }
                return;
            case 2:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1[]) {
                    setSplmtryData((iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1[])value);
                } else if (this.splmtryData == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.splmtryData[index] = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.splmtryData[index]).setParent(this, "SplmtryData");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of GrpHdr (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setGrpHdr(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GroupHeader59 value) {
        this.grpHdr = value;
        if (this.grpHdr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.grpHdr).setParent(this, "GrpHdr");
    }

    /**
     * [Virtual Element] Sets the value of RptgReq (1..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRptgReq(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3[] value) {
        this.rptgReq = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.rptgReq != null && i<this.rptgReq.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.rptgReq[i]).setParent(this, "RptgReq");
    }

    /**
     * [Virtual Element] Sets the value of SplmtryData (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSplmtryData(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1[] value) {
        this.splmtryData = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.splmtryData != null && i<this.splmtryData.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.splmtryData[i]).setParent(this, "SplmtryData");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.grpHdr);
        out.writeObject(this.rptgReq);
        out.writeObject(this.splmtryData);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.grpHdr = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.GroupHeader59) in.readObject();
        this.rptgReq = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3[]) in.readObject();
        this.splmtryData = (iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryData1[]) in.readObject();
    }

}
