/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * OriginalTransactionReference13. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>IntrBkSttlmAmt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount}
 * (0..1)</li>
 * <li><b>Amt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice}
 * (0..1)</li>
 * <li><b>IntrBkSttlmDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * <li><b>ReqdColltnDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * <li><b>ReqdExctnDt</b> of type {@link
 * biz.c24.io.api.data.ISO8601Date} (0..1)</li>
 * <li><b>CdtrSchmeId</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32}
 * (0..1)</li>
 * <li><b>SttlmInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13}
 * (0..1)</li>
 * <li><b>PmtTpInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTypeInformation22}
 * (0..1)</li>
 * <li><b>PmtMtd</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>MndtRltdInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6}
 * (0..1)</li>
 * <li><b>RmtInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.RemittanceInformation5}
 * (0..1)</li>
 * <li><b>UltmtDbtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32}
 * (0..1)</li>
 * <li><b>Dbtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32}
 * (0..1)</li>
 * <li><b>DbtrAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>DbtrAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>DbtrAgtAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>CdtrAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>CdtrAgtAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>Cdtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32}
 * (0..1)</li>
 * <li><b>CdtrAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>UltmtCdtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32}
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
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13Cls
 */
public class OriginalTransactionReference13 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Amt", "Cdtr", "CdtrAcct", "CdtrAgt", "CdtrAgtAcct", "CdtrSchmeId", "Dbtr", "DbtrAcct", "DbtrAgt", "DbtrAgtAcct", "IntrBkSttlmAmt", "IntrBkSttlmDt", "MndtRltdInf", "PmtMtd", "PmtTpInf", "ReqdColltnDt", "ReqdExctnDt", "RmtInf", "SttlmInf", "UltmtCdtr", "UltmtDbtr"};

    /**
     * Field intrBkSttlmAmt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount intrBkSttlmAmt;

    /**
     * Field amt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice amt;

    /**
     * Field intrBkSttlmDt.
     */
    private biz.c24.io.api.data.ISO8601Date intrBkSttlmDt;

    /**
     * Field reqdColltnDt.
     */
    private biz.c24.io.api.data.ISO8601Date reqdColltnDt;

    /**
     * Field reqdExctnDt.
     */
    private biz.c24.io.api.data.ISO8601Date reqdExctnDt;

    /**
     * Field cdtrSchmeId.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 cdtrSchmeId;

    /**
     * Field sttlmInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13 sttlmInf;

    /**
     * Field pmtTpInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTypeInformation22 pmtTpInf;

    /**
     * Field pmtMtd.
     */
    private java.lang.String pmtMtd;

    /**
     * Field mndtRltdInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6 mndtRltdInf;

    /**
     * Field rmtInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.RemittanceInformation5 rmtInf;

    /**
     * Field ultmtDbtr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 ultmtDbtr;

    /**
     * Field dbtr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 dbtr;

    /**
     * Field dbtrAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 dbtrAcct;

    /**
     * Field dbtrAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 dbtrAgt;

    /**
     * Field dbtrAgtAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 dbtrAgtAcct;

    /**
     * Field cdtrAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 cdtrAgt;

    /**
     * Field cdtrAgtAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 cdtrAgtAcct;

    /**
     * Field cdtr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 cdtr;

    /**
     * Field cdtrAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 cdtrAcct;

    /**
     * Field ultmtCdtr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 ultmtCdtr;

    public OriginalTransactionReference13() {
        this(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13Cls.getInstance().getNullDefiningElementDecl());
    }

    public OriginalTransactionReference13(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public OriginalTransactionReference13(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public OriginalTransactionReference13(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13 clone) {
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
            case 10:
                setIntrBkSttlmAmt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice) value);
                return;
            case 11:
                setIntrBkSttlmDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 15:
                setReqdColltnDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 16:
                setReqdExctnDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 5:
                setCdtrSchmeId((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 18:
                setSttlmInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13) value);
                return;
            case 14:
                setPmtTpInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTypeInformation22) value);
                return;
            case 13:
                setPmtMtd((java.lang.String) value);
                return;
            case 12:
                setMndtRltdInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6) value);
                return;
            case 17:
                setRmtInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.RemittanceInformation5) value);
                return;
            case 20:
                setUltmtDbtr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 6:
                setDbtr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 7:
                setDbtrAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 8:
                setDbtrAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 9:
                setDbtrAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 3:
                setCdtrAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 4:
                setCdtrAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 1:
                setCdtr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 2:
                setCdtrAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 19:
                setUltmtCdtr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
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
        return new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.OriginalTransactionReference13) clone;
        obj.intrBkSttlmAmt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.intrBkSttlmAmt, obj, "IntrBkSttlmAmt");
        obj.amt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice) biz.c24.io.api.Utils.cloneDeep(this.amt, obj, "Amt");
        obj.intrBkSttlmDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.intrBkSttlmDt, obj, "IntrBkSttlmDt");
        obj.reqdColltnDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.reqdColltnDt, obj, "ReqdColltnDt");
        obj.reqdExctnDt = (biz.c24.io.api.data.ISO8601Date) biz.c24.io.api.Utils.cloneDeep(this.reqdExctnDt, obj, "ReqdExctnDt");
        obj.cdtrSchmeId = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.cdtrSchmeId, obj, "CdtrSchmeId");
        obj.sttlmInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13) biz.c24.io.api.Utils.cloneDeep(this.sttlmInf, obj, "SttlmInf");
        obj.pmtTpInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTypeInformation22) biz.c24.io.api.Utils.cloneDeep(this.pmtTpInf, obj, "PmtTpInf");
        obj.pmtMtd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.pmtMtd, obj, "PmtMtd");
        obj.mndtRltdInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6) biz.c24.io.api.Utils.cloneDeep(this.mndtRltdInf, obj, "MndtRltdInf");
        obj.rmtInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.RemittanceInformation5) biz.c24.io.api.Utils.cloneDeep(this.rmtInf, obj, "RmtInf");
        obj.ultmtDbtr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.ultmtDbtr, obj, "UltmtDbtr");
        obj.dbtr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.dbtr, obj, "Dbtr");
        obj.dbtrAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.dbtrAcct, obj, "DbtrAcct");
        obj.dbtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.dbtrAgt, obj, "DbtrAgt");
        obj.dbtrAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.dbtrAgtAcct, obj, "DbtrAgtAcct");
        obj.cdtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.cdtrAgt, obj, "CdtrAgt");
        obj.cdtrAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.cdtrAgtAcct, obj, "CdtrAgtAcct");
        obj.cdtr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.cdtr, obj, "Cdtr");
        obj.cdtrAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.cdtrAcct, obj, "CdtrAcct");
        obj.ultmtCdtr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.ultmtCdtr, obj, "UltmtCdtr");
    }

    /**
     * Creates, adds and returns a new Amt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice createAmt() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice) getElementDecl("Amt").createObject();
        setAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Cdtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 createCdtr() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) getElementDecl("Cdtr").createObject();
        setCdtr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new CdtrAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 createCdtrAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) getElementDecl("CdtrAcct").createObject();
        setCdtrAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new CdtrAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 createCdtrAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("CdtrAgt").createObject();
        setCdtrAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new CdtrAgtAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 createCdtrAgtAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) getElementDecl("CdtrAgtAcct").createObject();
        setCdtrAgtAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new CdtrSchmeId (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 createCdtrSchmeId() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) getElementDecl("CdtrSchmeId").createObject();
        setCdtrSchmeId(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Dbtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 createDbtr() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) getElementDecl("Dbtr").createObject();
        setDbtr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DbtrAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 createDbtrAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) getElementDecl("DbtrAcct").createObject();
        setDbtrAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DbtrAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 createDbtrAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("DbtrAgt").createObject();
        setDbtrAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new DbtrAgtAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 createDbtrAgtAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) getElementDecl("DbtrAgtAcct").createObject();
        setDbtrAgtAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new IntrBkSttlmAmt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount createIntrBkSttlmAmt() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount) getElementDecl("IntrBkSttlmAmt").createObject();
        setIntrBkSttlmAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new MndtRltdInf (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6 createMndtRltdInf() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6) getElementDecl("MndtRltdInf").createObject();
        setMndtRltdInf(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new PmtTpInf (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTypeInformation22 createPmtTpInf() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTypeInformation22 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTypeInformation22) getElementDecl("PmtTpInf").createObject();
        setPmtTpInf(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RmtInf (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.RemittanceInformation5 createRmtInf() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.RemittanceInformation5 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.RemittanceInformation5) getElementDecl("RmtInf").createObject();
        setRmtInf(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new SttlmInf (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13 createSttlmInf() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13) getElementDecl("SttlmInf").createObject();
        setSttlmInf(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new UltmtCdtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 createUltmtCdtr() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) getElementDecl("UltmtCdtr").createObject();
        setUltmtCdtr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new UltmtDbtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 createUltmtDbtr() {
        iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) getElementDecl("UltmtDbtr").createObject();
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
     * Gets the value of Amt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice getAmt() {
        return this.amt;
    }

    /**
     * Gets the value of Cdtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 getCdtr() {
        return this.cdtr;
    }

    /**
     * Gets the value of CdtrAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 getCdtrAcct() {
        return this.cdtrAcct;
    }

    /**
     * Gets the value of CdtrAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 getCdtrAgt() {
        return this.cdtrAgt;
    }

    /**
     * Gets the value of CdtrAgtAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 getCdtrAgtAcct() {
        return this.cdtrAgtAcct;
    }

    /**
     * Gets the value of CdtrSchmeId (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 getCdtrSchmeId() {
        return this.cdtrSchmeId;
    }

    /**
     * Gets the value of Dbtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 getDbtr() {
        return this.dbtr;
    }

    /**
     * Gets the value of DbtrAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 getDbtrAcct() {
        return this.dbtrAcct;
    }

    /**
     * Gets the value of DbtrAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 getDbtrAgt() {
        return this.dbtrAgt;
    }

    /**
     * Gets the value of DbtrAgtAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 getDbtrAgtAcct() {
        return this.dbtrAgtAcct;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>intrBkSttlmAmt, amt, intrBkSttlmDt, reqdColltnDt,
     * reqdExctnDt, cdtrSchmeId, sttlmInf, pmtTpInf, pmtMtd,
     * mndtRltdInf, rmtInf, ultmtDbtr, dbtr, dbtrAcct, dbtrAgt,
     * dbtrAgtAcct, cdtrAgt, cdtrAgtAcct, cdtr, cdtrAcct,
     * ultmtCdtr</b>.
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
            case 10:
                return getIntrBkSttlmAmt();
            case 0:
                return getAmt();
            case 11:
                return getIntrBkSttlmDt();
            case 15:
                return getReqdColltnDt();
            case 16:
                return getReqdExctnDt();
            case 5:
                return getCdtrSchmeId();
            case 18:
                return getSttlmInf();
            case 14:
                return getPmtTpInf();
            case 13:
                return getPmtMtd();
            case 12:
                return getMndtRltdInf();
            case 17:
                return getRmtInf();
            case 20:
                return getUltmtDbtr();
            case 6:
                return getDbtr();
            case 7:
                return getDbtrAcct();
            case 8:
                return getDbtrAgt();
            case 9:
                return getDbtrAgtAcct();
            case 3:
                return getCdtrAgt();
            case 4:
                return getCdtrAgtAcct();
            case 1:
                return getCdtr();
            case 2:
                return getCdtrAcct();
            case 19:
                return getUltmtCdtr();
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
            case 10:
                return this.intrBkSttlmAmt == null ? 0 : 1;
            case 0:
                return this.amt == null ? 0 : 1;
            case 11:
                return this.intrBkSttlmDt == null ? 0 : 1;
            case 15:
                return this.reqdColltnDt == null ? 0 : 1;
            case 16:
                return this.reqdExctnDt == null ? 0 : 1;
            case 5:
                return this.cdtrSchmeId == null ? 0 : 1;
            case 18:
                return this.sttlmInf == null ? 0 : 1;
            case 14:
                return this.pmtTpInf == null ? 0 : 1;
            case 13:
                return this.pmtMtd == null ? 0 : 1;
            case 12:
                return this.mndtRltdInf == null ? 0 : 1;
            case 17:
                return this.rmtInf == null ? 0 : 1;
            case 20:
                return this.ultmtDbtr == null ? 0 : 1;
            case 6:
                return this.dbtr == null ? 0 : 1;
            case 7:
                return this.dbtrAcct == null ? 0 : 1;
            case 8:
                return this.dbtrAgt == null ? 0 : 1;
            case 9:
                return this.dbtrAgtAcct == null ? 0 : 1;
            case 3:
                return this.cdtrAgt == null ? 0 : 1;
            case 4:
                return this.cdtrAgtAcct == null ? 0 : 1;
            case 1:
                return this.cdtr == null ? 0 : 1;
            case 2:
                return this.cdtrAcct == null ? 0 : 1;
            case 19:
                return this.ultmtCdtr == null ? 0 : 1;
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
            case 10:
                return this.intrBkSttlmAmt != null && this.intrBkSttlmAmt.equals(element) ? 0 : -1;
            case 0:
                return this.amt != null && this.amt.equals(element) ? 0 : -1;
            case 11:
                return this.intrBkSttlmDt != null && this.intrBkSttlmDt.equals(element) ? 0 : -1;
            case 15:
                return this.reqdColltnDt != null && this.reqdColltnDt.equals(element) ? 0 : -1;
            case 16:
                return this.reqdExctnDt != null && this.reqdExctnDt.equals(element) ? 0 : -1;
            case 5:
                return this.cdtrSchmeId != null && this.cdtrSchmeId.equals(element) ? 0 : -1;
            case 18:
                return this.sttlmInf != null && this.sttlmInf.equals(element) ? 0 : -1;
            case 14:
                return this.pmtTpInf != null && this.pmtTpInf.equals(element) ? 0 : -1;
            case 13:
                return this.pmtMtd != null && this.pmtMtd.equals(element) ? 0 : -1;
            case 12:
                return this.mndtRltdInf != null && this.mndtRltdInf.equals(element) ? 0 : -1;
            case 17:
                return this.rmtInf != null && this.rmtInf.equals(element) ? 0 : -1;
            case 20:
                return this.ultmtDbtr != null && this.ultmtDbtr.equals(element) ? 0 : -1;
            case 6:
                return this.dbtr != null && this.dbtr.equals(element) ? 0 : -1;
            case 7:
                return this.dbtrAcct != null && this.dbtrAcct.equals(element) ? 0 : -1;
            case 8:
                return this.dbtrAgt != null && this.dbtrAgt.equals(element) ? 0 : -1;
            case 9:
                return this.dbtrAgtAcct != null && this.dbtrAgtAcct.equals(element) ? 0 : -1;
            case 3:
                return this.cdtrAgt != null && this.cdtrAgt.equals(element) ? 0 : -1;
            case 4:
                return this.cdtrAgtAcct != null && this.cdtrAgtAcct.equals(element) ? 0 : -1;
            case 1:
                return this.cdtr != null && this.cdtr.equals(element) ? 0 : -1;
            case 2:
                return this.cdtrAcct != null && this.cdtrAcct.equals(element) ? 0 : -1;
            case 19:
                return this.ultmtCdtr != null && this.ultmtCdtr.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of IntrBkSttlmAmt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount getIntrBkSttlmAmt() {
        return this.intrBkSttlmAmt;
    }

    /**
     * Gets the value of IntrBkSttlmDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getIntrBkSttlmDt() {
        return this.intrBkSttlmDt;
    }

    /**
     * Gets the value of MndtRltdInf (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6 getMndtRltdInf() {
        return this.mndtRltdInf;
    }

    /**
     * Gets the value of PmtMtd (0..1).
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
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTypeInformation22 getPmtTpInf() {
        return this.pmtTpInf;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>intrBkSttlmAmt, amt, intrBkSttlmDt, reqdColltnDt,
     * reqdExctnDt, cdtrSchmeId, sttlmInf, pmtTpInf, pmtMtd,
     * mndtRltdInf, rmtInf, ultmtDbtr, dbtr, dbtrAcct, dbtrAgt,
     * dbtrAgtAcct, cdtrAgt, cdtrAgtAcct, cdtr, cdtrAcct,
     * ultmtCdtr</b>.
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
            case 10:
                return this.intrBkSttlmAmt;
            case 0:
                return this.amt;
            case 11:
                return this.intrBkSttlmDt;
            case 15:
                return this.reqdColltnDt;
            case 16:
                return this.reqdExctnDt;
            case 5:
                return this.cdtrSchmeId;
            case 18:
                return this.sttlmInf;
            case 14:
                return this.pmtTpInf;
            case 13:
                return this.pmtMtd;
            case 12:
                return this.mndtRltdInf;
            case 17:
                return this.rmtInf;
            case 20:
                return this.ultmtDbtr;
            case 6:
                return this.dbtr;
            case 7:
                return this.dbtrAcct;
            case 8:
                return this.dbtrAgt;
            case 9:
                return this.dbtrAgtAcct;
            case 3:
                return this.cdtrAgt;
            case 4:
                return this.cdtrAgtAcct;
            case 1:
                return this.cdtr;
            case 2:
                return this.cdtrAcct;
            case 19:
                return this.ultmtCdtr;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of ReqdColltnDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getReqdColltnDt() {
        return this.reqdColltnDt;
    }

    /**
     * Gets the value of ReqdExctnDt (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.api.data.ISO8601Date getReqdExctnDt() {
        return this.reqdExctnDt;
    }

    /**
     * Gets the value of RmtInf (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.RemittanceInformation5 getRmtInf() {
        return this.rmtInf;
    }

    /**
     * Gets the value of SttlmInf (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13 getSttlmInf() {
        return this.sttlmInf;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.intrBkSttlmAmt == null ? 0 : 1;
        count += this.amt == null ? 0 : 1;
        count += this.intrBkSttlmDt == null ? 0 : 1;
        count += this.reqdColltnDt == null ? 0 : 1;
        count += this.reqdExctnDt == null ? 0 : 1;
        count += this.cdtrSchmeId == null ? 0 : 1;
        count += this.sttlmInf == null ? 0 : 1;
        count += this.pmtTpInf == null ? 0 : 1;
        count += this.pmtMtd == null ? 0 : 1;
        count += this.mndtRltdInf == null ? 0 : 1;
        count += this.rmtInf == null ? 0 : 1;
        count += this.ultmtDbtr == null ? 0 : 1;
        count += this.dbtr == null ? 0 : 1;
        count += this.dbtrAcct == null ? 0 : 1;
        count += this.dbtrAgt == null ? 0 : 1;
        count += this.dbtrAgtAcct == null ? 0 : 1;
        count += this.cdtrAgt == null ? 0 : 1;
        count += this.cdtrAgtAcct == null ? 0 : 1;
        count += this.cdtr == null ? 0 : 1;
        count += this.cdtrAcct == null ? 0 : 1;
        count += this.ultmtCdtr == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of UltmtCdtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 getUltmtCdtr() {
        return this.ultmtCdtr;
    }

    /**
     * Gets the value of UltmtDbtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 getUltmtDbtr() {
        return this.ultmtDbtr;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(intrBkSttlmAmt);
        result = 31 * result + hashCodeOf(amt);
        result = 31 * result + hashCodeOf(intrBkSttlmDt);
        result = 31 * result + hashCodeOf(reqdColltnDt);
        result = 31 * result + hashCodeOf(reqdExctnDt);
        result = 31 * result + hashCodeOf(cdtrSchmeId);
        result = 31 * result + hashCodeOf(sttlmInf);
        result = 31 * result + hashCodeOf(pmtTpInf);
        result = 31 * result + hashCodeOf(pmtMtd);
        result = 31 * result + hashCodeOf(mndtRltdInf);
        result = 31 * result + hashCodeOf(rmtInf);
        result = 31 * result + hashCodeOf(ultmtDbtr);
        result = 31 * result + hashCodeOf(dbtr);
        result = 31 * result + hashCodeOf(dbtrAcct);
        result = 31 * result + hashCodeOf(dbtrAgt);
        result = 31 * result + hashCodeOf(dbtrAgtAcct);
        result = 31 * result + hashCodeOf(cdtrAgt);
        result = 31 * result + hashCodeOf(cdtrAgtAcct);
        result = 31 * result + hashCodeOf(cdtr);
        result = 31 * result + hashCodeOf(cdtrAcct);
        result = 31 * result + hashCodeOf(ultmtCdtr);
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
            case 10:
                setIntrBkSttlmAmt(null);
                return;
            case 0:
                setAmt(null);
                return;
            case 11:
                setIntrBkSttlmDt(null);
                return;
            case 15:
                setReqdColltnDt(null);
                return;
            case 16:
                setReqdExctnDt(null);
                return;
            case 5:
                setCdtrSchmeId(null);
                return;
            case 18:
                setSttlmInf(null);
                return;
            case 14:
                setPmtTpInf(null);
                return;
            case 13:
                setPmtMtd(null);
                return;
            case 12:
                setMndtRltdInf(null);
                return;
            case 17:
                setRmtInf(null);
                return;
            case 20:
                setUltmtDbtr(null);
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
            case 3:
                setCdtrAgt(null);
                return;
            case 4:
                setCdtrAgtAcct(null);
                return;
            case 1:
                setCdtr(null);
                return;
            case 2:
                setCdtrAcct(null);
                return;
            case 19:
                setUltmtCdtr(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of Amt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAmt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice value) {
        this.amt = value;
        if (this.amt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.amt).setParent(this, "Amt");
    }

    /**
     * [Virtual Element] Sets the value of Cdtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtr(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 value) {
        this.cdtr = value;
        if (this.cdtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtr).setParent(this, "Cdtr");
    }

    /**
     * [Virtual Element] Sets the value of CdtrAcct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtrAcct(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 value) {
        this.cdtrAcct = value;
        if (this.cdtrAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtrAcct).setParent(this, "CdtrAcct");
    }

    /**
     * [Virtual Element] Sets the value of CdtrAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtrAgt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.cdtrAgt = value;
        if (this.cdtrAgt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtrAgt).setParent(this, "CdtrAgt");
    }

    /**
     * [Virtual Element] Sets the value of CdtrAgtAcct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtrAgtAcct(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 value) {
        this.cdtrAgtAcct = value;
        if (this.cdtrAgtAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtrAgtAcct).setParent(this, "CdtrAgtAcct");
    }

    /**
     * [Virtual Element] Sets the value of CdtrSchmeId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtrSchmeId(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 value) {
        this.cdtrSchmeId = value;
        if (this.cdtrSchmeId != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtrSchmeId).setParent(this, "CdtrSchmeId");
    }

    /**
     * [Virtual Element] Sets the value of Dbtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtr(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 value) {
        this.dbtr = value;
        if (this.dbtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dbtr).setParent(this, "Dbtr");
    }

    /**
     * [Virtual Element] Sets the value of DbtrAcct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtrAcct(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 value) {
        this.dbtrAcct = value;
        if (this.dbtrAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.dbtrAcct).setParent(this, "DbtrAcct");
    }

    /**
     * [Virtual Element] Sets the value of DbtrAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDbtrAgt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
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
    public void setDbtrAgtAcct(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16 value) {
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
            case 10:
                setIntrBkSttlmAmt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice) value);
                return;
            case 11:
                setIntrBkSttlmDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 15:
                setReqdColltnDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 16:
                setReqdExctnDt((biz.c24.io.api.data.ISO8601Date) value);
                return;
            case 5:
                setCdtrSchmeId((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 18:
                setSttlmInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13) value);
                return;
            case 14:
                setPmtTpInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTypeInformation22) value);
                return;
            case 13:
                setPmtMtd((java.lang.String) value);
                return;
            case 12:
                setMndtRltdInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6) value);
                return;
            case 17:
                setRmtInf((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.RemittanceInformation5) value);
                return;
            case 20:
                setUltmtDbtr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 6:
                setDbtr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 7:
                setDbtrAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 8:
                setDbtrAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 9:
                setDbtrAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 3:
                setCdtrAgt((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 4:
                setCdtrAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 1:
                setCdtr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            case 2:
                setCdtrAcct((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) value);
                return;
            case 19:
                setUltmtCdtr((iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of IntrBkSttlmAmt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrBkSttlmAmt(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount value) {
        this.intrBkSttlmAmt = value;
        if (this.intrBkSttlmAmt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.intrBkSttlmAmt).setParent(this, "IntrBkSttlmAmt");
    }

    /**
     * [Virtual Element] Sets the value of IntrBkSttlmDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrBkSttlmDt(biz.c24.io.api.data.ISO8601Date value) {
        this.intrBkSttlmDt = value;
    }

    /**
     * [Virtual Element] Sets the value of MndtRltdInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setMndtRltdInf(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6 value) {
        this.mndtRltdInf = value;
        if (this.mndtRltdInf != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.mndtRltdInf).setParent(this, "MndtRltdInf");
    }

    /**
     * [Virtual Element] Sets the value of PmtMtd (0..1).
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
    public void setPmtTpInf(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTypeInformation22 value) {
        this.pmtTpInf = value;
        if (this.pmtTpInf != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.pmtTpInf).setParent(this, "PmtTpInf");
    }

    /**
     * [Virtual Element] Sets the value of ReqdColltnDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setReqdColltnDt(biz.c24.io.api.data.ISO8601Date value) {
        this.reqdColltnDt = value;
    }

    /**
     * [Virtual Element] Sets the value of ReqdExctnDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setReqdExctnDt(biz.c24.io.api.data.ISO8601Date value) {
        this.reqdExctnDt = value;
    }

    /**
     * [Virtual Element] Sets the value of RmtInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRmtInf(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.RemittanceInformation5 value) {
        this.rmtInf = value;
        if (this.rmtInf != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rmtInf).setParent(this, "RmtInf");
    }

    /**
     * [Virtual Element] Sets the value of SttlmInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSttlmInf(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13 value) {
        this.sttlmInf = value;
        if (this.sttlmInf != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.sttlmInf).setParent(this, "SttlmInf");
    }

    /**
     * [Virtual Element] Sets the value of UltmtCdtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setUltmtCdtr(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 value) {
        this.ultmtCdtr = value;
        if (this.ultmtCdtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ultmtCdtr).setParent(this, "UltmtCdtr");
    }

    /**
     * [Virtual Element] Sets the value of UltmtDbtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setUltmtDbtr(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32 value) {
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
        out.writeObject(this.intrBkSttlmAmt);
        out.writeObject(this.amt);
        out.writeObject(this.intrBkSttlmDt);
        out.writeObject(this.reqdColltnDt);
        out.writeObject(this.reqdExctnDt);
        out.writeObject(this.cdtrSchmeId);
        out.writeObject(this.sttlmInf);
        out.writeObject(this.pmtTpInf);
        out.writeObject(this.pmtMtd);
        out.writeObject(this.mndtRltdInf);
        out.writeObject(this.rmtInf);
        out.writeObject(this.ultmtDbtr);
        out.writeObject(this.dbtr);
        out.writeObject(this.dbtrAcct);
        out.writeObject(this.dbtrAgt);
        out.writeObject(this.dbtrAgtAcct);
        out.writeObject(this.cdtrAgt);
        out.writeObject(this.cdtrAgtAcct);
        out.writeObject(this.cdtr);
        out.writeObject(this.cdtrAcct);
        out.writeObject(this.ultmtCdtr);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.intrBkSttlmAmt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.amt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AmountType3Choice) in.readObject();
        this.intrBkSttlmDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.reqdColltnDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.reqdExctnDt = (biz.c24.io.api.data.ISO8601Date) in.readObject();
        this.cdtrSchmeId = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) in.readObject();
        this.sttlmInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.SettlementInformation13) in.readObject();
        this.pmtTpInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PaymentTypeInformation22) in.readObject();
        this.pmtMtd = (java.lang.String) in.readObject();
        this.mndtRltdInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.MandateRelatedInformation6) in.readObject();
        this.rmtInf = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.RemittanceInformation5) in.readObject();
        this.ultmtDbtr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) in.readObject();
        this.dbtr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) in.readObject();
        this.dbtrAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) in.readObject();
        this.dbtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.dbtrAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) in.readObject();
        this.cdtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.cdtrAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) in.readObject();
        this.cdtr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) in.readObject();
        this.cdtrAcct = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CashAccount16) in.readObject();
        this.ultmtCdtr = (iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32) in.readObject();
    }

}
