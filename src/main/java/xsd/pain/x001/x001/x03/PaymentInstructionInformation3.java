/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * PaymentInstructionInformation3. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>PmtInfId</b> of type {@link java.lang.String} (1)</li>
 * <li><b>PmtMtd</b> of type {@link java.lang.String} (1)</li>
 * <li><b>BtchBookg</b> of type <code>boolean</code> (0..1)</li>
 * <li><b>NbOfTxs</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>CtrlSum</b> of type {@link java.math.BigDecimal}
 * (0..1)</li>
 * <li><b>PmtTpInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19}
 * (0..1)</li>
 * <li><b>ReqdExctnDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (1)</li>
 * <li><b>PoolgAdjstmntDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * <li><b>Dbtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32}
 * (1)</li>
 * <li><b>DbtrAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16}
 * (1)</li>
 * <li><b>DbtrAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (1)</li>
 * <li><b>DbtrAgtAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>UltmtDbtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32}
 * (0..1)</li>
 * <li><b>ChrgBr</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>ChrgsAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>ChrgsAcctAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>CdtTrfTxInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10}
 * (1..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3Cls
 */
public class PaymentInstructionInformation3 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"BtchBookg", "CdtTrfTxInf", "ChrgBr", "ChrgsAcct", "ChrgsAcctAgt", "CtrlSum", "Dbtr", "DbtrAcct", "DbtrAgt", "DbtrAgtAcct", "NbOfTxs", "PmtInfId", "PmtMtd", "PmtTpInf", "PoolgAdjstmntDt", "ReqdExctnDt", "UltmtDbtr"};

    /**
     * Field pmtInfId.
     */
    private java.lang.String pmtInfId;

    /**
     * Field pmtMtd.
     */
    private java.lang.String pmtMtd;

    /**
     * Field btchBookg.
     */
    private boolean btchBookg;

    /**
     * Field isbtchBookgSet.
     */
    private boolean isbtchBookgSet;

    /**
     * Field nbOfTxs.
     */
    private java.lang.String nbOfTxs;

    /**
     * Field ctrlSum.
     */
    private java.math.BigDecimal ctrlSum;

    /**
     * Field pmtTpInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19 pmtTpInf;

    /**
     * Field reqdExctnDt.
     */
    private biz.c24.io.api.data.ISO8601Date reqdExctnDt;

    /**
     * Field poolgAdjstmntDt.
     */
    private biz.c24.io.api.data.ISO8601Date poolgAdjstmntDt;

    /**
     * Field dbtr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 dbtr;

    /**
     * Field dbtrAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 dbtrAcct;

    /**
     * Field dbtrAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 dbtrAgt;

    /**
     * Field dbtrAgtAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 dbtrAgtAcct;

    /**
     * Field ultmtDbtr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 ultmtDbtr;

    /**
     * Field chrgBr.
     */
    private java.lang.String chrgBr;

    /**
     * Field chrgsAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 chrgsAcct;

    /**
     * Field chrgsAcctAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 chrgsAcctAgt;

    /**
     * Field cdtTrfTxInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10[] cdtTrfTxInf;

    public PaymentInstructionInformation3() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3Cls.getInstance().getNullDefiningElementDecl());
    }

    public PaymentInstructionInformation3(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public PaymentInstructionInformation3(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public PaymentInstructionInformation3(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3 clone) {
        super(clone);
    }

    /**
     * Adds a CdtTrfTxInf (1..*).
     * 
     * @param value
     * @param value The new CdtTrfTxInf.
     */
    public void addCdtTrfTxInf(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10 value) {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10[] temp = this.cdtTrfTxInf;
        this.cdtTrfTxInf = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.cdtTrfTxInf, 0, temp.length);
        this.cdtTrfTxInf[this.cdtTrfTxInf.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "CdtTrfTxInf");
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
            case 11:
                setPmtInfId((java.lang.String) value);
                return;
            case 12:
                setPmtMtd((java.lang.String) value);
                return;
            case 0:
                setBtchBookg(biz.c24.io.api.Utils.booleanValue(value));
                return;
            case 10:
                setNbOfTxs((java.lang.String) value);
                return;
            case 5:
                setCtrlSum(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 13:
                setPmtTpInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19) value);
                return;
            case 15:
                setReqdExctnDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 14:
                setPoolgAdjstmntDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 6:
                setDbtr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) value);
                return;
            case 7:
                setDbtrAcct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 8:
                setDbtrAgt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 9:
                setDbtrAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 16:
                setUltmtDbtr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) value);
                return;
            case 2:
                setChrgBr((java.lang.String) value);
                return;
            case 3:
                setChrgsAcct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 4:
                setChrgsAcctAgt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 1:
                addCdtTrfTxInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentInstructionInformation3) clone;
        obj.pmtInfId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.pmtInfId, obj, "PmtInfId");
        obj.pmtMtd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.pmtMtd, obj, "PmtMtd");
        obj.isbtchBookgSet = this.isbtchBookgSet;
        obj.btchBookg = this.btchBookg;
        obj.nbOfTxs = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.nbOfTxs, obj, "NbOfTxs");
        obj.ctrlSum = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.ctrlSum, obj, "CtrlSum");
        obj.pmtTpInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19) biz.c24.io.api.Utils.cloneDeep(this.pmtTpInf, obj, "PmtTpInf");
        obj.reqdExctnDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.reqdExctnDt, obj, "ReqdExctnDt");
        obj.poolgAdjstmntDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.poolgAdjstmntDt, obj, "PoolgAdjstmntDt");
        obj.dbtr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.dbtr, obj, "Dbtr");
        obj.dbtrAcct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.dbtrAcct, obj, "DbtrAcct");
        obj.dbtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.dbtrAgt, obj, "DbtrAgt");
        obj.dbtrAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.dbtrAgtAcct, obj, "DbtrAgtAcct");
        obj.ultmtDbtr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.ultmtDbtr, obj, "UltmtDbtr");
        obj.chrgBr = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.chrgBr, obj, "ChrgBr");
        obj.chrgsAcct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.chrgsAcct, obj, "ChrgsAcct");
        obj.chrgsAcctAgt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.chrgsAcctAgt, obj, "ChrgsAcctAgt");
        obj.cdtTrfTxInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10[]) biz.c24.io.api.Utils.cloneDeep(this.cdtTrfTxInf, obj, "CdtTrfTxInf");
    }

    /**
     * Creates, adds and returns a new CdtTrfTxInf (1..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10 createCdtTrfTxInf() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10) getElementDecl("CdtTrfTxInf").createObject();
        addCdtTrfTxInf(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new ChrgsAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 createChrgsAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) getElementDecl("ChrgsAcct").createObject();
        setChrgsAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new ChrgsAcctAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 createChrgsAcctAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("ChrgsAcctAgt").createObject();
        setChrgsAcctAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Dbtr (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 createDbtr() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) getElementDecl("Dbtr").createObject();
        setDbtr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DbtrAcct (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 createDbtrAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) getElementDecl("DbtrAcct").createObject();
        setDbtrAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DbtrAgt (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 createDbtrAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("DbtrAgt").createObject();
        setDbtrAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DbtrAgtAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 createDbtrAgtAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) getElementDecl("DbtrAgtAcct").createObject();
        setDbtrAgtAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new PmtTpInf (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19 createPmtTpInf() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19) getElementDecl("PmtTpInf").createObject();
        setPmtTpInf(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new UltmtDbtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 createUltmtDbtr() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) getElementDecl("UltmtDbtr").createObject();
        setUltmtDbtr(obj);
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
     * Gets the value of BtchBookg (0..1).
     * 
     * @return The value.
     */
    public boolean getBtchBookg() {
        return this.btchBookg;
    }

    /**
     * Gets the value of CdtTrfTxInf (1..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10[] getCdtTrfTxInf() {
        if (this.cdtTrfTxInf == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10[]{};
        else
            return this.cdtTrfTxInf;
    }

    /**
     * Gets the value of CdtTrfTxInf by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10 getCdtTrfTxInf(int ordinal) {
        if (this.cdtTrfTxInf == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.cdtTrfTxInf.length) {
            return this.cdtTrfTxInf[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (1..*).
     * 
     * @param value
     * @param value The CdtTrfTxInf to get the index of.
     * @return The index.
     */
    public int getCdtTrfTxInfIndex(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10 value) {
        if (this.cdtTrfTxInf == null)
            return -1;
        for (int i=0; i<this.cdtTrfTxInf.length; i++)
            if (this.cdtTrfTxInf[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of ChrgBr (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getChrgBr() {
        return this.chrgBr;
    }

    /**
     * Gets the value of ChrgsAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 getChrgsAcct() {
        return this.chrgsAcct;
    }

    /**
     * Gets the value of ChrgsAcctAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 getChrgsAcctAgt() {
        return this.chrgsAcctAgt;
    }

    /**
     * Gets the value of CtrlSum (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getCtrlSum() {
        return this.ctrlSum;
    }

    /**
     * Gets the value of Dbtr (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 getDbtr() {
        return this.dbtr;
    }

    /**
     * Gets the value of DbtrAcct (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 getDbtrAcct() {
        return this.dbtrAcct;
    }

    /**
     * Gets the value of DbtrAgt (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 getDbtrAgt() {
        return this.dbtrAgt;
    }

    /**
     * Gets the value of DbtrAgtAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 getDbtrAgtAcct() {
        return this.dbtrAgtAcct;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>pmtInfId,
     * pmtMtd, btchBookg, nbOfTxs, ctrlSum, pmtTpInf, reqdExctnDt,
     * poolgAdjstmntDt, dbtr, dbtrAcct, dbtrAgt, dbtrAgtAcct,
     * ultmtDbtr, chrgBr, chrgsAcct, chrgsAcctAgt, cdtTrfTxInf</b>.
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
            case 11:
                return getPmtInfId();
            case 12:
                return getPmtMtd();
            case 0:
                return getBtchBookg();
            case 10:
                return getNbOfTxs();
            case 5:
                return getCtrlSum();
            case 13:
                return getPmtTpInf();
            case 15:
                return getReqdExctnDt();
            case 14:
                return getPoolgAdjstmntDt();
            case 6:
                return getDbtr();
            case 7:
                return getDbtrAcct();
            case 8:
                return getDbtrAgt();
            case 9:
                return getDbtrAgtAcct();
            case 16:
                return getUltmtDbtr();
            case 2:
                return getChrgBr();
            case 3:
                return getChrgsAcct();
            case 4:
                return getChrgsAcctAgt();
            case 1:
            if (this.cdtTrfTxInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.cdtTrfTxInf[index];
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
            case 11:
                return this.pmtInfId == null ? 0 : 1;
            case 12:
                return this.pmtMtd == null ? 0 : 1;
            case 0:
                return this.isbtchBookgSet ? 1 : 0;
            case 10:
                return this.nbOfTxs == null ? 0 : 1;
            case 5:
                return this.ctrlSum == null ? 0 : 1;
            case 13:
                return this.pmtTpInf == null ? 0 : 1;
            case 15:
                return this.reqdExctnDt == null ? 0 : 1;
            case 14:
                return this.poolgAdjstmntDt == null ? 0 : 1;
            case 6:
                return this.dbtr == null ? 0 : 1;
            case 7:
                return this.dbtrAcct == null ? 0 : 1;
            case 8:
                return this.dbtrAgt == null ? 0 : 1;
            case 9:
                return this.dbtrAgtAcct == null ? 0 : 1;
            case 16:
                return this.ultmtDbtr == null ? 0 : 1;
            case 2:
                return this.chrgBr == null ? 0 : 1;
            case 3:
                return this.chrgsAcct == null ? 0 : 1;
            case 4:
                return this.chrgsAcctAgt == null ? 0 : 1;
            case 1:
                return this.cdtTrfTxInf == null ? 0 : this.cdtTrfTxInf.length;
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
            case 11:
                return this.pmtInfId != null && this.pmtInfId.equals(element) ? 0 : -1;
            case 12:
                return this.pmtMtd != null && this.pmtMtd.equals(element) ? 0 : -1;
            case 0:
                return this.isbtchBookgSet ? (this.btchBookg == biz.c24.io.api.Utils.booleanValue(element) ? 0 : -1) : -1;
            case 10:
                return this.nbOfTxs != null && this.nbOfTxs.equals(element) ? 0 : -1;
            case 5:
                return this.ctrlSum != null && this.ctrlSum.equals(element) ? 0 : -1;
            case 13:
                return this.pmtTpInf != null && this.pmtTpInf.equals(element) ? 0 : -1;
            case 15:
                return this.reqdExctnDt != null && this.reqdExctnDt.equals(element) ? 0 : -1;
            case 14:
                return this.poolgAdjstmntDt != null && this.poolgAdjstmntDt.equals(element) ? 0 : -1;
            case 6:
                return this.dbtr != null && this.dbtr.equals(element) ? 0 : -1;
            case 7:
                return this.dbtrAcct != null && this.dbtrAcct.equals(element) ? 0 : -1;
            case 8:
                return this.dbtrAgt != null && this.dbtrAgt.equals(element) ? 0 : -1;
            case 9:
                return this.dbtrAgtAcct != null && this.dbtrAgtAcct.equals(element) ? 0 : -1;
            case 16:
                return this.ultmtDbtr != null && this.ultmtDbtr.equals(element) ? 0 : -1;
            case 2:
                return this.chrgBr != null && this.chrgBr.equals(element) ? 0 : -1;
            case 3:
                return this.chrgsAcct != null && this.chrgsAcct.equals(element) ? 0 : -1;
            case 4:
                return this.chrgsAcctAgt != null && this.chrgsAcctAgt.equals(element) ? 0 : -1;
            case 1:
                return getCdtTrfTxInfIndex((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of NbOfTxs (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getNbOfTxs() {
        return this.nbOfTxs;
    }

    /**
     * Gets the value of PmtInfId (1).
     * 
     * @return The value.
     */
    public java.lang.String getPmtInfId() {
        return this.pmtInfId;
    }

    /**
     * Gets the value of PmtMtd (1).
     * 
     * @return The value.
     */
    public java.lang.String getPmtMtd() {
        return this.pmtMtd;
    }

    /**
     * Gets the value of PmtTpInf (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19 getPmtTpInf() {
        return this.pmtTpInf;
    }

    /**
     * Gets the value of PoolgAdjstmntDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getPoolgAdjstmntDt() {
        return this.poolgAdjstmntDt;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>pmtInfId,
     * pmtMtd, btchBookg, nbOfTxs, ctrlSum, pmtTpInf, reqdExctnDt,
     * poolgAdjstmntDt, dbtr, dbtrAcct, dbtrAgt, dbtrAgtAcct,
     * ultmtDbtr, chrgBr, chrgsAcct, chrgsAcctAgt, cdtTrfTxInf</b>.
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
            case 11:
                return this.pmtInfId;
            case 12:
                return this.pmtMtd;
            case 0:
                return this.btchBookg;
            case 10:
                return this.nbOfTxs;
            case 5:
                return this.ctrlSum;
            case 13:
                return this.pmtTpInf;
            case 15:
                return this.reqdExctnDt;
            case 14:
                return this.poolgAdjstmntDt;
            case 6:
                return this.dbtr;
            case 7:
                return this.dbtrAcct;
            case 8:
                return this.dbtrAgt;
            case 9:
                return this.dbtrAgtAcct;
            case 16:
                return this.ultmtDbtr;
            case 2:
                return this.chrgBr;
            case 3:
                return this.chrgsAcct;
            case 4:
                return this.chrgsAcctAgt;
            case 1:
            if (this.cdtTrfTxInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.cdtTrfTxInf[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of ReqdExctnDt (1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getReqdExctnDt() {
        return this.reqdExctnDt;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.pmtInfId == null ? 0 : 1;
        count += this.pmtMtd == null ? 0 : 1;
        count += this.isbtchBookgSet ? 1 : 0;
        count += this.nbOfTxs == null ? 0 : 1;
        count += this.ctrlSum == null ? 0 : 1;
        count += this.pmtTpInf == null ? 0 : 1;
        count += this.reqdExctnDt == null ? 0 : 1;
        count += this.poolgAdjstmntDt == null ? 0 : 1;
        count += this.dbtr == null ? 0 : 1;
        count += this.dbtrAcct == null ? 0 : 1;
        count += this.dbtrAgt == null ? 0 : 1;
        count += this.dbtrAgtAcct == null ? 0 : 1;
        count += this.ultmtDbtr == null ? 0 : 1;
        count += this.chrgBr == null ? 0 : 1;
        count += this.chrgsAcct == null ? 0 : 1;
        count += this.chrgsAcctAgt == null ? 0 : 1;
        count += this.cdtTrfTxInf == null ? 0 : this.cdtTrfTxInf.length;
        return count;
    }

    /**
     * Gets the value of UltmtDbtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 getUltmtDbtr() {
        return this.ultmtDbtr;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(pmtInfId);
        result = 31 * result + hashCodeOf(pmtMtd);
        result = 31 * result + hashCodeOf(btchBookg);
        result = 31 * result + hashCodeOf(isbtchBookgSet);
        result = 31 * result + hashCodeOf(nbOfTxs);
        result = 31 * result + hashCodeOf(ctrlSum);
        result = 31 * result + hashCodeOf(pmtTpInf);
        result = 31 * result + hashCodeOf(reqdExctnDt);
        result = 31 * result + hashCodeOf(poolgAdjstmntDt);
        result = 31 * result + hashCodeOf(dbtr);
        result = 31 * result + hashCodeOf(dbtrAcct);
        result = 31 * result + hashCodeOf(dbtrAgt);
        result = 31 * result + hashCodeOf(dbtrAgtAcct);
        result = 31 * result + hashCodeOf(ultmtDbtr);
        result = 31 * result + hashCodeOf(chrgBr);
        result = 31 * result + hashCodeOf(chrgsAcct);
        result = 31 * result + hashCodeOf(chrgsAcctAgt);
        result = 31 * result + hashCodeOf(cdtTrfTxInf);
        return result;
    }

    /**
     * Tests whether BtchBookg has been set.
     */
    public boolean isBtchBookgSet() {
        return isbtchBookgSet;
    }

    /**
     * Removes a CdtTrfTxInf (1..*).
     * 
     * @param index
     * @param index The index of the CdtTrfTxInf to get.
     */
    public void removeCdtTrfTxInf(int index) {
        if (this.cdtTrfTxInf == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10[] temp = this.cdtTrfTxInf;
        this.cdtTrfTxInf = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.cdtTrfTxInf, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.cdtTrfTxInf, index, temp.length-index-1);
        if (this.cdtTrfTxInf.length == 0)
            this.cdtTrfTxInf = null;
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
            case 11:
                setPmtInfId(null);
                return;
            case 12:
                setPmtMtd(null);
                return;
            case 0:
                setBtchBookg(false);
                this.isbtchBookgSet = false;
                return;
            case 10:
                setNbOfTxs(null);
                return;
            case 5:
                setCtrlSum(null);
                return;
            case 13:
                setPmtTpInf(null);
                return;
            case 15:
                setReqdExctnDt(null);
                return;
            case 14:
                setPoolgAdjstmntDt(null);
                return;
            case 6:
                setDbtr(null);
                return;
            case 7:
                setDbtrAcct(null);
                return;
            case 8:
                setDbtrAgt(null);
                return;
            case 9:
                setDbtrAgtAcct(null);
                return;
            case 16:
                setUltmtDbtr(null);
                return;
            case 2:
                setChrgBr(null);
                return;
            case 3:
                setChrgsAcct(null);
                return;
            case 4:
                setChrgsAcctAgt(null);
                return;
            case 1:
                removeCdtTrfTxInf(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of BtchBookg (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBtchBookg(boolean value) {
        this.btchBookg = value;
        this.isbtchBookgSet = true;
    }

    /**
     * [Virtual Element] Sets the value of CdtTrfTxInf (1..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtTrfTxInf(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10[] value) {
        this.cdtTrfTxInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.cdtTrfTxInf != null && i<this.cdtTrfTxInf.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtTrfTxInf[i]).setParent(this, "CdtTrfTxInf");
    }

    /**
     * [Virtual Element] Sets the value of ChrgBr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setChrgBr(java.lang.String value) {
        this.chrgBr = value;
    }

    /**
     * [Virtual Element] Sets the value of ChrgsAcct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setChrgsAcct(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 value) {
        this.chrgsAcct = value;
        if (this.chrgsAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.chrgsAcct).setParent(this, "ChrgsAcct");
    }

    /**
     * [Virtual Element] Sets the value of ChrgsAcctAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setChrgsAcctAgt(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.chrgsAcctAgt = value;
        if (this.chrgsAcctAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.chrgsAcctAgt).setParent(this, "ChrgsAcctAgt");
    }

    /**
     * [Virtual Element] Sets the value of CtrlSum (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCtrlSum(java.math.BigDecimal value) {
        this.ctrlSum = value;
    }

    /**
     * [Virtual Element] Sets the value of Dbtr (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 value) {
        this.dbtr = value;
        if (this.dbtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dbtr).setParent(this, "Dbtr");
    }

    /**
     * [Virtual Element] Sets the value of DbtrAcct (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtrAcct(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 value) {
        this.dbtrAcct = value;
        if (this.dbtrAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dbtrAcct).setParent(this, "DbtrAcct");
    }

    /**
     * [Virtual Element] Sets the value of DbtrAgt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtrAgt(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.dbtrAgt = value;
        if (this.dbtrAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dbtrAgt).setParent(this, "DbtrAgt");
    }

    /**
     * [Virtual Element] Sets the value of DbtrAgtAcct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtrAgtAcct(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 value) {
        this.dbtrAgtAcct = value;
        if (this.dbtrAgtAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dbtrAgtAcct).setParent(this, "DbtrAgtAcct");
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
            case 11:
                setPmtInfId((java.lang.String) value);
                return;
            case 12:
                setPmtMtd((java.lang.String) value);
                return;
            case 0:
                setBtchBookg(biz.c24.io.api.Utils.booleanValue(value));
                return;
            case 10:
                setNbOfTxs((java.lang.String) value);
                return;
            case 5:
                setCtrlSum(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 13:
                setPmtTpInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19) value);
                return;
            case 15:
                setReqdExctnDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 14:
                setPoolgAdjstmntDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 6:
                setDbtr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) value);
                return;
            case 7:
                setDbtrAcct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 8:
                setDbtrAgt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 9:
                setDbtrAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 16:
                setUltmtDbtr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) value);
                return;
            case 2:
                setChrgBr((java.lang.String) value);
                return;
            case 3:
                setChrgsAcct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 4:
                setChrgsAcctAgt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 1:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10[]) {
                    setCdtTrfTxInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10[])value);
                } else if (this.cdtTrfTxInf == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.cdtTrfTxInf[index] = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.cdtTrfTxInf[index]).setParent(this, "CdtTrfTxInf");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of NbOfTxs (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNbOfTxs(java.lang.String value) {
        this.nbOfTxs = value;
    }

    /**
     * [Virtual Element] Sets the value of PmtInfId (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPmtInfId(java.lang.String value) {
        this.pmtInfId = value;
    }

    /**
     * [Virtual Element] Sets the value of PmtMtd (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPmtMtd(java.lang.String value) {
        this.pmtMtd = value;
    }

    /**
     * [Virtual Element] Sets the value of PmtTpInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPmtTpInf(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19 value) {
        this.pmtTpInf = value;
        if (this.pmtTpInf != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.pmtTpInf).setParent(this, "PmtTpInf");
    }

    /**
     * [Virtual Element] Sets the value of PoolgAdjstmntDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPoolgAdjstmntDt(biz.c24.io.api.data.ISO8601Date value) {
        this.poolgAdjstmntDt = value;
    }

    /**
     * [Virtual Element] Sets the value of ReqdExctnDt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setReqdExctnDt(biz.c24.io.api.data.ISO8601Date value) {
        this.reqdExctnDt = value;
    }

    /**
     * [Virtual Element] Sets the value of UltmtDbtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setUltmtDbtr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 value) {
        this.ultmtDbtr = value;
        if (this.ultmtDbtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ultmtDbtr).setParent(this, "UltmtDbtr");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.pmtInfId);
        out.writeObject(this.pmtMtd);
        out.writeBoolean(this.isbtchBookgSet);
        if (this.isbtchBookgSet)
            out.writeBoolean(this.btchBookg);
        out.writeObject(this.nbOfTxs);
        out.writeObject(this.ctrlSum);
        out.writeObject(this.pmtTpInf);
        out.writeObject(this.reqdExctnDt);
        out.writeObject(this.poolgAdjstmntDt);
        out.writeObject(this.dbtr);
        out.writeObject(this.dbtrAcct);
        out.writeObject(this.dbtrAgt);
        out.writeObject(this.dbtrAgtAcct);
        out.writeObject(this.ultmtDbtr);
        out.writeObject(this.chrgBr);
        out.writeObject(this.chrgsAcct);
        out.writeObject(this.chrgsAcctAgt);
        out.writeObject(this.cdtTrfTxInf);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.pmtInfId = (java.lang.String) in.readObject();
        this.pmtMtd = (java.lang.String) in.readObject();
        this.isbtchBookgSet = in.readBoolean();
        if (this.isbtchBookgSet)
            this.btchBookg = in.readBoolean();
        this.nbOfTxs = (java.lang.String) in.readObject();
        this.ctrlSum = (java.math.BigDecimal) in.readObject();
        this.pmtTpInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19) in.readObject();
        this.reqdExctnDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.poolgAdjstmntDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.dbtr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) in.readObject();
        this.dbtrAcct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) in.readObject();
        this.dbtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.dbtrAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) in.readObject();
        this.ultmtDbtr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) in.readObject();
        this.chrgBr = (java.lang.String) in.readObject();
        this.chrgsAcct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) in.readObject();
        this.chrgsAcctAgt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.cdtTrfTxInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10[]) in.readObject();
    }

}
