/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * TransactionAgents2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>DbtrAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>CdtrAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>IntrmyAgt1</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>IntrmyAgt2</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>IntrmyAgt3</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>RcvgAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>DlvrgAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>IssgAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>SttlmPlc</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>Prtry</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2Cls
 */
public class TransactionAgents2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"CdtrAgt", "DbtrAgt", "DlvrgAgt", "IntrmyAgt1", "IntrmyAgt2", "IntrmyAgt3", "IssgAgt", "Prtry", "RcvgAgt", "SttlmPlc"};

    /**
     * Field dbtrAgt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 dbtrAgt;

    /**
     * Field cdtrAgt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 cdtrAgt;

    /**
     * Field intrmyAgt1.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 intrmyAgt1;

    /**
     * Field intrmyAgt2.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 intrmyAgt2;

    /**
     * Field intrmyAgt3.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 intrmyAgt3;

    /**
     * Field rcvgAgt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 rcvgAgt;

    /**
     * Field dlvrgAgt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 dlvrgAgt;

    /**
     * Field issgAgt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 issgAgt;

    /**
     * Field sttlmPlc.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 sttlmPlc;

    /**
     * Field prtry.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2[] prtry;

    public TransactionAgents2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2Cls.getInstance().getNullDefiningElementDecl());
    }

    public TransactionAgents2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public TransactionAgents2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public TransactionAgents2(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2 clone) {
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
                setDbtrAgt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 0:
                setCdtrAgt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 3:
                setIntrmyAgt1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 4:
                setIntrmyAgt2((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 5:
                setIntrmyAgt3((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 8:
                setRcvgAgt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 2:
                setDlvrgAgt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 6:
                setIssgAgt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 9:
                setSttlmPlc((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 7:
                addPrtry((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a Prtry (0..*).
     * 
     * @param value
     * @param value The new Prtry.
     */
    public void addPrtry(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2[] temp = this.prtry;
        this.prtry = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.prtry, 0, temp.length);
        this.prtry[this.prtry.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Prtry");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2) clone;
        obj.dbtrAgt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.dbtrAgt, obj, "DbtrAgt");
        obj.cdtrAgt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.cdtrAgt, obj, "CdtrAgt");
        obj.intrmyAgt1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.intrmyAgt1, obj, "IntrmyAgt1");
        obj.intrmyAgt2 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.intrmyAgt2, obj, "IntrmyAgt2");
        obj.intrmyAgt3 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.intrmyAgt3, obj, "IntrmyAgt3");
        obj.rcvgAgt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.rcvgAgt, obj, "RcvgAgt");
        obj.dlvrgAgt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.dlvrgAgt, obj, "DlvrgAgt");
        obj.issgAgt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.issgAgt, obj, "IssgAgt");
        obj.sttlmPlc = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.sttlmPlc, obj, "SttlmPlc");
        obj.prtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2[]) biz.c24.io.api.Utils.cloneDeep(this.prtry, obj, "Prtry");
    }

    /**
     * Creates, adds and returns a new CdtrAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 createCdtrAgt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) getElementDecl("CdtrAgt").createObject();
        setCdtrAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DbtrAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 createDbtrAgt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) getElementDecl("DbtrAgt").createObject();
        setDbtrAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DlvrgAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 createDlvrgAgt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) getElementDecl("DlvrgAgt").createObject();
        setDlvrgAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new IntrmyAgt1 (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 createIntrmyAgt1() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) getElementDecl("IntrmyAgt1").createObject();
        setIntrmyAgt1(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new IntrmyAgt2 (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 createIntrmyAgt2() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) getElementDecl("IntrmyAgt2").createObject();
        setIntrmyAgt2(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new IntrmyAgt3 (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 createIntrmyAgt3() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) getElementDecl("IntrmyAgt3").createObject();
        setIntrmyAgt3(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new IssgAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 createIssgAgt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) getElementDecl("IssgAgt").createObject();
        setIssgAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Prtry (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2 createPrtry() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2) getElementDecl("Prtry").createObject();
        addPrtry(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RcvgAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 createRcvgAgt() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) getElementDecl("RcvgAgt").createObject();
        setRcvgAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new SttlmPlc (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 createSttlmPlc() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) getElementDecl("SttlmPlc").createObject();
        setSttlmPlc(obj);
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
     * Gets the value of CdtrAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 getCdtrAgt() {
        return this.cdtrAgt;
    }

    /**
     * Gets the value of DbtrAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 getDbtrAgt() {
        return this.dbtrAgt;
    }

    /**
     * Gets the value of DlvrgAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 getDlvrgAgt() {
        return this.dlvrgAgt;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>dbtrAgt,
     * cdtrAgt, intrmyAgt1, intrmyAgt2, intrmyAgt3, rcvgAgt,
     * dlvrgAgt, issgAgt, sttlmPlc, prtry</b>.
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
                return getDbtrAgt();
            case 0:
                return getCdtrAgt();
            case 3:
                return getIntrmyAgt1();
            case 4:
                return getIntrmyAgt2();
            case 5:
                return getIntrmyAgt3();
            case 8:
                return getRcvgAgt();
            case 2:
                return getDlvrgAgt();
            case 6:
                return getIssgAgt();
            case 9:
                return getSttlmPlc();
            case 7:
            if (this.prtry == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.prtry[index];
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
                return this.dbtrAgt == null ? 0 : 1;
            case 0:
                return this.cdtrAgt == null ? 0 : 1;
            case 3:
                return this.intrmyAgt1 == null ? 0 : 1;
            case 4:
                return this.intrmyAgt2 == null ? 0 : 1;
            case 5:
                return this.intrmyAgt3 == null ? 0 : 1;
            case 8:
                return this.rcvgAgt == null ? 0 : 1;
            case 2:
                return this.dlvrgAgt == null ? 0 : 1;
            case 6:
                return this.issgAgt == null ? 0 : 1;
            case 9:
                return this.sttlmPlc == null ? 0 : 1;
            case 7:
                return this.prtry == null ? 0 : this.prtry.length;
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
                return this.dbtrAgt != null && this.dbtrAgt.equals(element) ? 0 : -1;
            case 0:
                return this.cdtrAgt != null && this.cdtrAgt.equals(element) ? 0 : -1;
            case 3:
                return this.intrmyAgt1 != null && this.intrmyAgt1.equals(element) ? 0 : -1;
            case 4:
                return this.intrmyAgt2 != null && this.intrmyAgt2.equals(element) ? 0 : -1;
            case 5:
                return this.intrmyAgt3 != null && this.intrmyAgt3.equals(element) ? 0 : -1;
            case 8:
                return this.rcvgAgt != null && this.rcvgAgt.equals(element) ? 0 : -1;
            case 2:
                return this.dlvrgAgt != null && this.dlvrgAgt.equals(element) ? 0 : -1;
            case 6:
                return this.issgAgt != null && this.issgAgt.equals(element) ? 0 : -1;
            case 9:
                return this.sttlmPlc != null && this.sttlmPlc.equals(element) ? 0 : -1;
            case 7:
                return getPrtryIndex((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of IntrmyAgt1 (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 getIntrmyAgt1() {
        return this.intrmyAgt1;
    }

    /**
     * Gets the value of IntrmyAgt2 (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 getIntrmyAgt2() {
        return this.intrmyAgt2;
    }

    /**
     * Gets the value of IntrmyAgt3 (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 getIntrmyAgt3() {
        return this.intrmyAgt3;
    }

    /**
     * Gets the value of IssgAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 getIssgAgt() {
        return this.issgAgt;
    }

    /**
     * Gets the value of Prtry (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2[] getPrtry() {
        if (this.prtry == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2[]{};
        else
            return this.prtry;
    }

    /**
     * Gets the value of Prtry by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2 getPrtry(int ordinal) {
        if (this.prtry == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.prtry.length) {
            return this.prtry[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Prtry to get the index of.
     * @return The index.
     */
    public int getPrtryIndex(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2 value) {
        if (this.prtry == null)
            return -1;
        for (int i=0; i<this.prtry.length; i++)
            if (this.prtry[i] == value)
                return i;
        return -1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>dbtrAgt,
     * cdtrAgt, intrmyAgt1, intrmyAgt2, intrmyAgt3, rcvgAgt,
     * dlvrgAgt, issgAgt, sttlmPlc, prtry</b>.
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
                return this.dbtrAgt;
            case 0:
                return this.cdtrAgt;
            case 3:
                return this.intrmyAgt1;
            case 4:
                return this.intrmyAgt2;
            case 5:
                return this.intrmyAgt3;
            case 8:
                return this.rcvgAgt;
            case 2:
                return this.dlvrgAgt;
            case 6:
                return this.issgAgt;
            case 9:
                return this.sttlmPlc;
            case 7:
            if (this.prtry == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.prtry[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of RcvgAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 getRcvgAgt() {
        return this.rcvgAgt;
    }

    /**
     * Gets the value of SttlmPlc (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 getSttlmPlc() {
        return this.sttlmPlc;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.dbtrAgt == null ? 0 : 1;
        count += this.cdtrAgt == null ? 0 : 1;
        count += this.intrmyAgt1 == null ? 0 : 1;
        count += this.intrmyAgt2 == null ? 0 : 1;
        count += this.intrmyAgt3 == null ? 0 : 1;
        count += this.rcvgAgt == null ? 0 : 1;
        count += this.dlvrgAgt == null ? 0 : 1;
        count += this.issgAgt == null ? 0 : 1;
        count += this.sttlmPlc == null ? 0 : 1;
        count += this.prtry == null ? 0 : this.prtry.length;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(dbtrAgt);
        result = 31 * result + hashCodeOf(cdtrAgt);
        result = 31 * result + hashCodeOf(intrmyAgt1);
        result = 31 * result + hashCodeOf(intrmyAgt2);
        result = 31 * result + hashCodeOf(intrmyAgt3);
        result = 31 * result + hashCodeOf(rcvgAgt);
        result = 31 * result + hashCodeOf(dlvrgAgt);
        result = 31 * result + hashCodeOf(issgAgt);
        result = 31 * result + hashCodeOf(sttlmPlc);
        result = 31 * result + hashCodeOf(prtry);
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
                setDbtrAgt(null);
                return;
            case 0:
                setCdtrAgt(null);
                return;
            case 3:
                setIntrmyAgt1(null);
                return;
            case 4:
                setIntrmyAgt2(null);
                return;
            case 5:
                setIntrmyAgt3(null);
                return;
            case 8:
                setRcvgAgt(null);
                return;
            case 2:
                setDlvrgAgt(null);
                return;
            case 6:
                setIssgAgt(null);
                return;
            case 9:
                setSttlmPlc(null);
                return;
            case 7:
                removePrtry(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a Prtry (0..*).
     * 
     * @param index
     * @param index The index of the Prtry to get.
     */
    public void removePrtry(int index) {
        if (this.prtry == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2[] temp = this.prtry;
        this.prtry = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.prtry, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.prtry, index, temp.length-index-1);
        if (this.prtry.length == 0)
            this.prtry = null;
    }

    /**
     * [Virtual Element] Sets the value of CdtrAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtrAgt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 value) {
        this.cdtrAgt = value;
        if (this.cdtrAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtrAgt).setParent(this, "CdtrAgt");
    }

    /**
     * [Virtual Element] Sets the value of DbtrAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtrAgt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 value) {
        this.dbtrAgt = value;
        if (this.dbtrAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dbtrAgt).setParent(this, "DbtrAgt");
    }

    /**
     * [Virtual Element] Sets the value of DlvrgAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDlvrgAgt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 value) {
        this.dlvrgAgt = value;
        if (this.dlvrgAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dlvrgAgt).setParent(this, "DlvrgAgt");
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
                setDbtrAgt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 0:
                setCdtrAgt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 3:
                setIntrmyAgt1((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 4:
                setIntrmyAgt2((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 5:
                setIntrmyAgt3((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 8:
                setRcvgAgt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 2:
                setDlvrgAgt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 6:
                setIssgAgt((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 9:
                setSttlmPlc((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 7:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2[]) {
                    setPrtry((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2[])value);
                } else if (this.prtry == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.prtry[index] = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.prtry[index]).setParent(this, "Prtry");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of IntrmyAgt1 (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrmyAgt1(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 value) {
        this.intrmyAgt1 = value;
        if (this.intrmyAgt1 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.intrmyAgt1).setParent(this, "IntrmyAgt1");
    }

    /**
     * [Virtual Element] Sets the value of IntrmyAgt2 (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrmyAgt2(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 value) {
        this.intrmyAgt2 = value;
        if (this.intrmyAgt2 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.intrmyAgt2).setParent(this, "IntrmyAgt2");
    }

    /**
     * [Virtual Element] Sets the value of IntrmyAgt3 (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrmyAgt3(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 value) {
        this.intrmyAgt3 = value;
        if (this.intrmyAgt3 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.intrmyAgt3).setParent(this, "IntrmyAgt3");
    }

    /**
     * [Virtual Element] Sets the value of IssgAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIssgAgt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 value) {
        this.issgAgt = value;
        if (this.issgAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.issgAgt).setParent(this, "IssgAgt");
    }

    /**
     * [Virtual Element] Sets the value of Prtry (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrtry(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2[] value) {
        this.prtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.prtry != null && i<this.prtry.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.prtry[i]).setParent(this, "Prtry");
    }

    /**
     * [Virtual Element] Sets the value of RcvgAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRcvgAgt(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 value) {
        this.rcvgAgt = value;
        if (this.rcvgAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rcvgAgt).setParent(this, "RcvgAgt");
    }

    /**
     * [Virtual Element] Sets the value of SttlmPlc (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSttlmPlc(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4 value) {
        this.sttlmPlc = value;
        if (this.sttlmPlc != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.sttlmPlc).setParent(this, "SttlmPlc");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.dbtrAgt);
        out.writeObject(this.cdtrAgt);
        out.writeObject(this.intrmyAgt1);
        out.writeObject(this.intrmyAgt2);
        out.writeObject(this.intrmyAgt3);
        out.writeObject(this.rcvgAgt);
        out.writeObject(this.dlvrgAgt);
        out.writeObject(this.issgAgt);
        out.writeObject(this.sttlmPlc);
        out.writeObject(this.prtry);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.dbtrAgt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.cdtrAgt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.intrmyAgt1 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.intrmyAgt2 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.intrmyAgt3 = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.rcvgAgt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.dlvrgAgt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.issgAgt = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.sttlmPlc = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.prtry = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ProprietaryAgent2[]) in.readObject();
    }

}
