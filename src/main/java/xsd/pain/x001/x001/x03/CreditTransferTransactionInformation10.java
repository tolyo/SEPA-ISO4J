/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * CreditTransferTransactionInformation10. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>PmtId</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentIdentification1}
 * (1)</li>
 * <li><b>PmtTpInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19}
 * (0..1)</li>
 * <li><b>Amt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.AmountType3Choice}
 * (1)</li>
 * <li><b>XchgRateInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1}
 * (0..1)</li>
 * <li><b>ChrgBr</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>ChqInstr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6}
 * (0..1)</li>
 * <li><b>UltmtDbtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32}
 * (0..1)</li>
 * <li><b>IntrmyAgt1</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>IntrmyAgt1Acct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>IntrmyAgt2</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>IntrmyAgt2Acct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>IntrmyAgt3</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>IntrmyAgt3Acct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>CdtrAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4}
 * (0..1)</li>
 * <li><b>CdtrAgtAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>Cdtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32}
 * (0..1)</li>
 * <li><b>CdtrAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16}
 * (0..1)</li>
 * <li><b>UltmtCdtr</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32}
 * (0..1)</li>
 * <li><b>InstrForCdtrAgt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1}
 * (0..*)</li>
 * <li><b>InstrForDbtrAgt</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>Purp</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Purpose2Choice}
 * (0..1)</li>
 * <li><b>RgltryRptg</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3}
 * (0..10)</li>
 * <li><b>Tax</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.TaxInformation3}
 * (0..1)</li>
 * <li><b>RltdRmtInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2}
 * (0..10)</li>
 * <li><b>RmtInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceInformation5}
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
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10Cls
 */
public class CreditTransferTransactionInformation10 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Amt", "Cdtr", "CdtrAcct", "CdtrAgt", "CdtrAgtAcct", "ChqInstr", "ChrgBr", "InstrForCdtrAgt", "InstrForDbtrAgt", "IntrmyAgt1", "IntrmyAgt1Acct", "IntrmyAgt2", "IntrmyAgt2Acct", "IntrmyAgt3", "IntrmyAgt3Acct", "PmtId", "PmtTpInf", "Purp", "RgltryRptg", "RltdRmtInf", "RmtInf", "Tax", "UltmtCdtr", "UltmtDbtr", "XchgRateInf"};

    /**
     * Field pmtId.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentIdentification1 pmtId;

    /**
     * Field pmtTpInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19 pmtTpInf;

    /**
     * Field amt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.AmountType3Choice amt;

    /**
     * Field xchgRateInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1 xchgRateInf;

    /**
     * Field chrgBr.
     */
    private java.lang.String chrgBr;

    /**
     * Field chqInstr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6 chqInstr;

    /**
     * Field ultmtDbtr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 ultmtDbtr;

    /**
     * Field intrmyAgt1.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 intrmyAgt1;

    /**
     * Field intrmyAgt1Acct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 intrmyAgt1Acct;

    /**
     * Field intrmyAgt2.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 intrmyAgt2;

    /**
     * Field intrmyAgt2Acct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 intrmyAgt2Acct;

    /**
     * Field intrmyAgt3.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 intrmyAgt3;

    /**
     * Field intrmyAgt3Acct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 intrmyAgt3Acct;

    /**
     * Field cdtrAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 cdtrAgt;

    /**
     * Field cdtrAgtAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 cdtrAgtAcct;

    /**
     * Field cdtr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 cdtr;

    /**
     * Field cdtrAcct.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 cdtrAcct;

    /**
     * Field ultmtCdtr.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 ultmtCdtr;

    /**
     * Field instrForCdtrAgt.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1[] instrForCdtrAgt;

    /**
     * Field instrForDbtrAgt.
     */
    private java.lang.String instrForDbtrAgt;

    /**
     * Field purp.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Purpose2Choice purp;

    /**
     * Field rgltryRptg.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3[] rgltryRptg;

    /**
     * Field tax.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.TaxInformation3 tax;

    /**
     * Field rltdRmtInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2[] rltdRmtInf;

    /**
     * Field rmtInf.
     */
    private iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceInformation5 rmtInf;

    public CreditTransferTransactionInformation10() {
        this(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10Cls.getInstance().getNullDefiningElementDecl());
    }

    public CreditTransferTransactionInformation10(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public CreditTransferTransactionInformation10(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public CreditTransferTransactionInformation10(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10 clone) {
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
            case 15:
                setPmtId((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentIdentification1) value);
                return;
            case 16:
                setPmtTpInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.AmountType3Choice) value);
                return;
            case 24:
                setXchgRateInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1) value);
                return;
            case 6:
                setChrgBr((java.lang.String) value);
                return;
            case 5:
                setChqInstr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6) value);
                return;
            case 23:
                setUltmtDbtr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) value);
                return;
            case 9:
                setIntrmyAgt1((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 10:
                setIntrmyAgt1Acct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 11:
                setIntrmyAgt2((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 12:
                setIntrmyAgt2Acct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 13:
                setIntrmyAgt3((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 14:
                setIntrmyAgt3Acct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 3:
                setCdtrAgt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 4:
                setCdtrAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 1:
                setCdtr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) value);
                return;
            case 2:
                setCdtrAcct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 22:
                setUltmtCdtr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) value);
                return;
            case 7:
                addInstrForCdtrAgt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1) value);
                return;
            case 8:
                setInstrForDbtrAgt((java.lang.String) value);
                return;
            case 17:
                setPurp((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Purpose2Choice) value);
                return;
            case 18:
                addRgltryRptg((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3) value);
                return;
            case 21:
                setTax((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.TaxInformation3) value);
                return;
            case 19:
                addRltdRmtInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2) value);
                return;
            case 20:
                setRmtInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceInformation5) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a InstrForCdtrAgt (0..*).
     * 
     * @param value
     * @param value The new InstrForCdtrAgt.
     */
    public void addInstrForCdtrAgt(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1 value) {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1[] temp = this.instrForCdtrAgt;
        this.instrForCdtrAgt = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.instrForCdtrAgt, 0, temp.length);
        this.instrForCdtrAgt[this.instrForCdtrAgt.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "InstrForCdtrAgt");
    }

    /**
     * Adds a RgltryRptg (0..10).
     * 
     * @param value
     * @param value The new RgltryRptg.
     */
    public void addRgltryRptg(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3 value) {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3[] temp = this.rgltryRptg;
        this.rgltryRptg = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.rgltryRptg, 0, temp.length);
        this.rgltryRptg[this.rgltryRptg.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "RgltryRptg");
    }

    /**
     * Adds a RltdRmtInf (0..10).
     * 
     * @param value
     * @param value The new RltdRmtInf.
     */
    public void addRltdRmtInf(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2 value) {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2[] temp = this.rltdRmtInf;
        this.rltdRmtInf = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.rltdRmtInf, 0, temp.length);
        this.rltdRmtInf[this.rltdRmtInf.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "RltdRmtInf");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10) clone;
        obj.pmtId = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentIdentification1) biz.c24.io.api.Utils.cloneDeep(this.pmtId, obj, "PmtId");
        obj.pmtTpInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19) biz.c24.io.api.Utils.cloneDeep(this.pmtTpInf, obj, "PmtTpInf");
        obj.amt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.AmountType3Choice) biz.c24.io.api.Utils.cloneDeep(this.amt, obj, "Amt");
        obj.xchgRateInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1) biz.c24.io.api.Utils.cloneDeep(this.xchgRateInf, obj, "XchgRateInf");
        obj.chrgBr = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.chrgBr, obj, "ChrgBr");
        obj.chqInstr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6) biz.c24.io.api.Utils.cloneDeep(this.chqInstr, obj, "ChqInstr");
        obj.ultmtDbtr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.ultmtDbtr, obj, "UltmtDbtr");
        obj.intrmyAgt1 = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.intrmyAgt1, obj, "IntrmyAgt1");
        obj.intrmyAgt1Acct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.intrmyAgt1Acct, obj, "IntrmyAgt1Acct");
        obj.intrmyAgt2 = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.intrmyAgt2, obj, "IntrmyAgt2");
        obj.intrmyAgt2Acct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.intrmyAgt2Acct, obj, "IntrmyAgt2Acct");
        obj.intrmyAgt3 = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.intrmyAgt3, obj, "IntrmyAgt3");
        obj.intrmyAgt3Acct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.intrmyAgt3Acct, obj, "IntrmyAgt3Acct");
        obj.cdtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) biz.c24.io.api.Utils.cloneDeep(this.cdtrAgt, obj, "CdtrAgt");
        obj.cdtrAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.cdtrAgtAcct, obj, "CdtrAgtAcct");
        obj.cdtr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.cdtr, obj, "Cdtr");
        obj.cdtrAcct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.cdtrAcct, obj, "CdtrAcct");
        obj.ultmtCdtr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) biz.c24.io.api.Utils.cloneDeep(this.ultmtCdtr, obj, "UltmtCdtr");
        obj.instrForCdtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1[]) biz.c24.io.api.Utils.cloneDeep(this.instrForCdtrAgt, obj, "InstrForCdtrAgt");
        obj.instrForDbtrAgt = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.instrForDbtrAgt, obj, "InstrForDbtrAgt");
        obj.purp = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Purpose2Choice) biz.c24.io.api.Utils.cloneDeep(this.purp, obj, "Purp");
        obj.rgltryRptg = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3[]) biz.c24.io.api.Utils.cloneDeep(this.rgltryRptg, obj, "RgltryRptg");
        obj.tax = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.TaxInformation3) biz.c24.io.api.Utils.cloneDeep(this.tax, obj, "Tax");
        obj.rltdRmtInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2[]) biz.c24.io.api.Utils.cloneDeep(this.rltdRmtInf, obj, "RltdRmtInf");
        obj.rmtInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceInformation5) biz.c24.io.api.Utils.cloneDeep(this.rmtInf, obj, "RmtInf");
    }

    /**
     * Creates, adds and returns a new Amt (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.AmountType3Choice createAmt() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.AmountType3Choice obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.AmountType3Choice) getElementDecl("Amt").createObject();
        setAmt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Cdtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 createCdtr() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) getElementDecl("Cdtr").createObject();
        setCdtr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new CdtrAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 createCdtrAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) getElementDecl("CdtrAcct").createObject();
        setCdtrAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new CdtrAgt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 createCdtrAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("CdtrAgt").createObject();
        setCdtrAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new CdtrAgtAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 createCdtrAgtAcct() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) getElementDecl("CdtrAgtAcct").createObject();
        setCdtrAgtAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new ChqInstr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6 createChqInstr() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6) getElementDecl("ChqInstr").createObject();
        setChqInstr(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new InstrForCdtrAgt (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1 createInstrForCdtrAgt() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1) getElementDecl("InstrForCdtrAgt").createObject();
        addInstrForCdtrAgt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new IntrmyAgt1 (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 createIntrmyAgt1() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("IntrmyAgt1").createObject();
        setIntrmyAgt1(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new IntrmyAgt1Acct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 createIntrmyAgt1Acct() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) getElementDecl("IntrmyAgt1Acct").createObject();
        setIntrmyAgt1Acct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new IntrmyAgt2 (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 createIntrmyAgt2() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("IntrmyAgt2").createObject();
        setIntrmyAgt2(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new IntrmyAgt2Acct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 createIntrmyAgt2Acct() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) getElementDecl("IntrmyAgt2Acct").createObject();
        setIntrmyAgt2Acct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new IntrmyAgt3 (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 createIntrmyAgt3() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) getElementDecl("IntrmyAgt3").createObject();
        setIntrmyAgt3(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new IntrmyAgt3Acct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 createIntrmyAgt3Acct() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) getElementDecl("IntrmyAgt3Acct").createObject();
        setIntrmyAgt3Acct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new PmtId (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentIdentification1 createPmtId() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentIdentification1 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentIdentification1) getElementDecl("PmtId").createObject();
        setPmtId(obj);
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
     * Creates, adds and returns a new Purp (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Purpose2Choice createPurp() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Purpose2Choice obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Purpose2Choice) getElementDecl("Purp").createObject();
        setPurp(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RgltryRptg (0..10).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3 createRgltryRptg() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3) getElementDecl("RgltryRptg").createObject();
        addRgltryRptg(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RltdRmtInf (0..10).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2 createRltdRmtInf() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2) getElementDecl("RltdRmtInf").createObject();
        addRltdRmtInf(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RmtInf (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceInformation5 createRmtInf() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceInformation5 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceInformation5) getElementDecl("RmtInf").createObject();
        setRmtInf(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Tax (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.TaxInformation3 createTax() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.TaxInformation3 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.TaxInformation3) getElementDecl("Tax").createObject();
        setTax(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new UltmtCdtr (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 createUltmtCdtr() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) getElementDecl("UltmtCdtr").createObject();
        setUltmtCdtr(obj);
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

    /**
     * Creates, adds and returns a new XchgRateInf (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1 createXchgRateInf() {
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1 obj = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1) getElementDecl("XchgRateInf").createObject();
        setXchgRateInf(obj);
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
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.AmountType3Choice getAmt() {
        return this.amt;
    }

    /**
     * Gets the value of Cdtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 getCdtr() {
        return this.cdtr;
    }

    /**
     * Gets the value of CdtrAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 getCdtrAcct() {
        return this.cdtrAcct;
    }

    /**
     * Gets the value of CdtrAgt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 getCdtrAgt() {
        return this.cdtrAgt;
    }

    /**
     * Gets the value of CdtrAgtAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 getCdtrAgtAcct() {
        return this.cdtrAgtAcct;
    }

    /**
     * Gets the value of ChqInstr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6 getChqInstr() {
        return this.chqInstr;
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
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>pmtId,
     * pmtTpInf, amt, xchgRateInf, chrgBr, chqInstr, ultmtDbtr,
     * intrmyAgt1, intrmyAgt1Acct, intrmyAgt2, intrmyAgt2Acct,
     * intrmyAgt3, intrmyAgt3Acct, cdtrAgt, cdtrAgtAcct, cdtr,
     * cdtrAcct, ultmtCdtr, instrForCdtrAgt, instrForDbtrAgt, purp,
     * rgltryRptg, tax, rltdRmtInf, rmtInf</b>.
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
            case 15:
                return getPmtId();
            case 16:
                return getPmtTpInf();
            case 0:
                return getAmt();
            case 24:
                return getXchgRateInf();
            case 6:
                return getChrgBr();
            case 5:
                return getChqInstr();
            case 23:
                return getUltmtDbtr();
            case 9:
                return getIntrmyAgt1();
            case 10:
                return getIntrmyAgt1Acct();
            case 11:
                return getIntrmyAgt2();
            case 12:
                return getIntrmyAgt2Acct();
            case 13:
                return getIntrmyAgt3();
            case 14:
                return getIntrmyAgt3Acct();
            case 3:
                return getCdtrAgt();
            case 4:
                return getCdtrAgtAcct();
            case 1:
                return getCdtr();
            case 2:
                return getCdtrAcct();
            case 22:
                return getUltmtCdtr();
            case 7:
            if (this.instrForCdtrAgt == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.instrForCdtrAgt[index];
            case 8:
                return getInstrForDbtrAgt();
            case 17:
                return getPurp();
            case 18:
            if (this.rgltryRptg == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rgltryRptg[index];
            case 21:
                return getTax();
            case 19:
            if (this.rltdRmtInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rltdRmtInf[index];
            case 20:
                return getRmtInf();
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
            case 15:
                return this.pmtId == null ? 0 : 1;
            case 16:
                return this.pmtTpInf == null ? 0 : 1;
            case 0:
                return this.amt == null ? 0 : 1;
            case 24:
                return this.xchgRateInf == null ? 0 : 1;
            case 6:
                return this.chrgBr == null ? 0 : 1;
            case 5:
                return this.chqInstr == null ? 0 : 1;
            case 23:
                return this.ultmtDbtr == null ? 0 : 1;
            case 9:
                return this.intrmyAgt1 == null ? 0 : 1;
            case 10:
                return this.intrmyAgt1Acct == null ? 0 : 1;
            case 11:
                return this.intrmyAgt2 == null ? 0 : 1;
            case 12:
                return this.intrmyAgt2Acct == null ? 0 : 1;
            case 13:
                return this.intrmyAgt3 == null ? 0 : 1;
            case 14:
                return this.intrmyAgt3Acct == null ? 0 : 1;
            case 3:
                return this.cdtrAgt == null ? 0 : 1;
            case 4:
                return this.cdtrAgtAcct == null ? 0 : 1;
            case 1:
                return this.cdtr == null ? 0 : 1;
            case 2:
                return this.cdtrAcct == null ? 0 : 1;
            case 22:
                return this.ultmtCdtr == null ? 0 : 1;
            case 7:
                return this.instrForCdtrAgt == null ? 0 : this.instrForCdtrAgt.length;
            case 8:
                return this.instrForDbtrAgt == null ? 0 : 1;
            case 17:
                return this.purp == null ? 0 : 1;
            case 18:
                return this.rgltryRptg == null ? 0 : this.rgltryRptg.length;
            case 21:
                return this.tax == null ? 0 : 1;
            case 19:
                return this.rltdRmtInf == null ? 0 : this.rltdRmtInf.length;
            case 20:
                return this.rmtInf == null ? 0 : 1;
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
            case 15:
                return this.pmtId != null && this.pmtId.equals(element) ? 0 : -1;
            case 16:
                return this.pmtTpInf != null && this.pmtTpInf.equals(element) ? 0 : -1;
            case 0:
                return this.amt != null && this.amt.equals(element) ? 0 : -1;
            case 24:
                return this.xchgRateInf != null && this.xchgRateInf.equals(element) ? 0 : -1;
            case 6:
                return this.chrgBr != null && this.chrgBr.equals(element) ? 0 : -1;
            case 5:
                return this.chqInstr != null && this.chqInstr.equals(element) ? 0 : -1;
            case 23:
                return this.ultmtDbtr != null && this.ultmtDbtr.equals(element) ? 0 : -1;
            case 9:
                return this.intrmyAgt1 != null && this.intrmyAgt1.equals(element) ? 0 : -1;
            case 10:
                return this.intrmyAgt1Acct != null && this.intrmyAgt1Acct.equals(element) ? 0 : -1;
            case 11:
                return this.intrmyAgt2 != null && this.intrmyAgt2.equals(element) ? 0 : -1;
            case 12:
                return this.intrmyAgt2Acct != null && this.intrmyAgt2Acct.equals(element) ? 0 : -1;
            case 13:
                return this.intrmyAgt3 != null && this.intrmyAgt3.equals(element) ? 0 : -1;
            case 14:
                return this.intrmyAgt3Acct != null && this.intrmyAgt3Acct.equals(element) ? 0 : -1;
            case 3:
                return this.cdtrAgt != null && this.cdtrAgt.equals(element) ? 0 : -1;
            case 4:
                return this.cdtrAgtAcct != null && this.cdtrAgtAcct.equals(element) ? 0 : -1;
            case 1:
                return this.cdtr != null && this.cdtr.equals(element) ? 0 : -1;
            case 2:
                return this.cdtrAcct != null && this.cdtrAcct.equals(element) ? 0 : -1;
            case 22:
                return this.ultmtCdtr != null && this.ultmtCdtr.equals(element) ? 0 : -1;
            case 7:
                return getInstrForCdtrAgtIndex((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1) element);
            case 8:
                return this.instrForDbtrAgt != null && this.instrForDbtrAgt.equals(element) ? 0 : -1;
            case 17:
                return this.purp != null && this.purp.equals(element) ? 0 : -1;
            case 18:
                return getRgltryRptgIndex((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3) element);
            case 21:
                return this.tax != null && this.tax.equals(element) ? 0 : -1;
            case 19:
                return getRltdRmtInfIndex((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2) element);
            case 20:
                return this.rmtInf != null && this.rmtInf.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of InstrForCdtrAgt (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1[] getInstrForCdtrAgt() {
        if (this.instrForCdtrAgt == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1[]{};
        else
            return this.instrForCdtrAgt;
    }

    /**
     * Gets the value of InstrForCdtrAgt by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1 getInstrForCdtrAgt(int ordinal) {
        if (this.instrForCdtrAgt == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.instrForCdtrAgt.length) {
            return this.instrForCdtrAgt[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The InstrForCdtrAgt to get the index of.
     * @return The index.
     */
    public int getInstrForCdtrAgtIndex(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1 value) {
        if (this.instrForCdtrAgt == null)
            return -1;
        for (int i=0; i<this.instrForCdtrAgt.length; i++)
            if (this.instrForCdtrAgt[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of InstrForDbtrAgt (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getInstrForDbtrAgt() {
        return this.instrForDbtrAgt;
    }

    /**
     * Gets the value of IntrmyAgt1 (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 getIntrmyAgt1() {
        return this.intrmyAgt1;
    }

    /**
     * Gets the value of IntrmyAgt1Acct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 getIntrmyAgt1Acct() {
        return this.intrmyAgt1Acct;
    }

    /**
     * Gets the value of IntrmyAgt2 (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 getIntrmyAgt2() {
        return this.intrmyAgt2;
    }

    /**
     * Gets the value of IntrmyAgt2Acct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 getIntrmyAgt2Acct() {
        return this.intrmyAgt2Acct;
    }

    /**
     * Gets the value of IntrmyAgt3 (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 getIntrmyAgt3() {
        return this.intrmyAgt3;
    }

    /**
     * Gets the value of IntrmyAgt3Acct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 getIntrmyAgt3Acct() {
        return this.intrmyAgt3Acct;
    }

    /**
     * Gets the value of PmtId (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentIdentification1 getPmtId() {
        return this.pmtId;
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
     * Gets the value of Purp (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Purpose2Choice getPurp() {
        return this.purp;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>pmtId,
     * pmtTpInf, amt, xchgRateInf, chrgBr, chqInstr, ultmtDbtr,
     * intrmyAgt1, intrmyAgt1Acct, intrmyAgt2, intrmyAgt2Acct,
     * intrmyAgt3, intrmyAgt3Acct, cdtrAgt, cdtrAgtAcct, cdtr,
     * cdtrAcct, ultmtCdtr, instrForCdtrAgt, instrForDbtrAgt, purp,
     * rgltryRptg, tax, rltdRmtInf, rmtInf</b>.
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
            case 15:
                return this.pmtId;
            case 16:
                return this.pmtTpInf;
            case 0:
                return this.amt;
            case 24:
                return this.xchgRateInf;
            case 6:
                return this.chrgBr;
            case 5:
                return this.chqInstr;
            case 23:
                return this.ultmtDbtr;
            case 9:
                return this.intrmyAgt1;
            case 10:
                return this.intrmyAgt1Acct;
            case 11:
                return this.intrmyAgt2;
            case 12:
                return this.intrmyAgt2Acct;
            case 13:
                return this.intrmyAgt3;
            case 14:
                return this.intrmyAgt3Acct;
            case 3:
                return this.cdtrAgt;
            case 4:
                return this.cdtrAgtAcct;
            case 1:
                return this.cdtr;
            case 2:
                return this.cdtrAcct;
            case 22:
                return this.ultmtCdtr;
            case 7:
            if (this.instrForCdtrAgt == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.instrForCdtrAgt[index];
            case 8:
                return this.instrForDbtrAgt;
            case 17:
                return this.purp;
            case 18:
            if (this.rgltryRptg == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rgltryRptg[index];
            case 21:
                return this.tax;
            case 19:
            if (this.rltdRmtInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rltdRmtInf[index];
            case 20:
                return this.rmtInf;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of RgltryRptg (0..10).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3[] getRgltryRptg() {
        if (this.rgltryRptg == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3[]{};
        else
            return this.rgltryRptg;
    }

    /**
     * Gets the value of RgltryRptg by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3 getRgltryRptg(int ordinal) {
        if (this.rgltryRptg == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.rgltryRptg.length) {
            return this.rgltryRptg[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..10).
     * 
     * @param value
     * @param value The RgltryRptg to get the index of.
     * @return The index.
     */
    public int getRgltryRptgIndex(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3 value) {
        if (this.rgltryRptg == null)
            return -1;
        for (int i=0; i<this.rgltryRptg.length; i++)
            if (this.rgltryRptg[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of RltdRmtInf (0..10).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2[] getRltdRmtInf() {
        if (this.rltdRmtInf == null)
            return new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2[]{};
        else
            return this.rltdRmtInf;
    }

    /**
     * Gets the value of RltdRmtInf by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2 getRltdRmtInf(int ordinal) {
        if (this.rltdRmtInf == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.rltdRmtInf.length) {
            return this.rltdRmtInf[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..10).
     * 
     * @param value
     * @param value The RltdRmtInf to get the index of.
     * @return The index.
     */
    public int getRltdRmtInfIndex(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2 value) {
        if (this.rltdRmtInf == null)
            return -1;
        for (int i=0; i<this.rltdRmtInf.length; i++)
            if (this.rltdRmtInf[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of RmtInf (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceInformation5 getRmtInf() {
        return this.rmtInf;
    }

    /**
     * Gets the value of Tax (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.TaxInformation3 getTax() {
        return this.tax;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.pmtId == null ? 0 : 1;
        count += this.pmtTpInf == null ? 0 : 1;
        count += this.amt == null ? 0 : 1;
        count += this.xchgRateInf == null ? 0 : 1;
        count += this.chrgBr == null ? 0 : 1;
        count += this.chqInstr == null ? 0 : 1;
        count += this.ultmtDbtr == null ? 0 : 1;
        count += this.intrmyAgt1 == null ? 0 : 1;
        count += this.intrmyAgt1Acct == null ? 0 : 1;
        count += this.intrmyAgt2 == null ? 0 : 1;
        count += this.intrmyAgt2Acct == null ? 0 : 1;
        count += this.intrmyAgt3 == null ? 0 : 1;
        count += this.intrmyAgt3Acct == null ? 0 : 1;
        count += this.cdtrAgt == null ? 0 : 1;
        count += this.cdtrAgtAcct == null ? 0 : 1;
        count += this.cdtr == null ? 0 : 1;
        count += this.cdtrAcct == null ? 0 : 1;
        count += this.ultmtCdtr == null ? 0 : 1;
        count += this.instrForCdtrAgt == null ? 0 : this.instrForCdtrAgt.length;
        count += this.instrForDbtrAgt == null ? 0 : 1;
        count += this.purp == null ? 0 : 1;
        count += this.rgltryRptg == null ? 0 : this.rgltryRptg.length;
        count += this.tax == null ? 0 : 1;
        count += this.rltdRmtInf == null ? 0 : this.rltdRmtInf.length;
        count += this.rmtInf == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of UltmtCdtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 getUltmtCdtr() {
        return this.ultmtCdtr;
    }

    /**
     * Gets the value of UltmtDbtr (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 getUltmtDbtr() {
        return this.ultmtDbtr;
    }

    /**
     * Gets the value of XchgRateInf (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1 getXchgRateInf() {
        return this.xchgRateInf;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(pmtId);
        result = 31 * result + hashCodeOf(pmtTpInf);
        result = 31 * result + hashCodeOf(amt);
        result = 31 * result + hashCodeOf(xchgRateInf);
        result = 31 * result + hashCodeOf(chrgBr);
        result = 31 * result + hashCodeOf(chqInstr);
        result = 31 * result + hashCodeOf(ultmtDbtr);
        result = 31 * result + hashCodeOf(intrmyAgt1);
        result = 31 * result + hashCodeOf(intrmyAgt1Acct);
        result = 31 * result + hashCodeOf(intrmyAgt2);
        result = 31 * result + hashCodeOf(intrmyAgt2Acct);
        result = 31 * result + hashCodeOf(intrmyAgt3);
        result = 31 * result + hashCodeOf(intrmyAgt3Acct);
        result = 31 * result + hashCodeOf(cdtrAgt);
        result = 31 * result + hashCodeOf(cdtrAgtAcct);
        result = 31 * result + hashCodeOf(cdtr);
        result = 31 * result + hashCodeOf(cdtrAcct);
        result = 31 * result + hashCodeOf(ultmtCdtr);
        result = 31 * result + hashCodeOf(instrForCdtrAgt);
        result = 31 * result + hashCodeOf(instrForDbtrAgt);
        result = 31 * result + hashCodeOf(purp);
        result = 31 * result + hashCodeOf(rgltryRptg);
        result = 31 * result + hashCodeOf(tax);
        result = 31 * result + hashCodeOf(rltdRmtInf);
        result = 31 * result + hashCodeOf(rmtInf);
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
            case 15:
                setPmtId(null);
                return;
            case 16:
                setPmtTpInf(null);
                return;
            case 0:
                setAmt(null);
                return;
            case 24:
                setXchgRateInf(null);
                return;
            case 6:
                setChrgBr(null);
                return;
            case 5:
                setChqInstr(null);
                return;
            case 23:
                setUltmtDbtr(null);
                return;
            case 9:
                setIntrmyAgt1(null);
                return;
            case 10:
                setIntrmyAgt1Acct(null);
                return;
            case 11:
                setIntrmyAgt2(null);
                return;
            case 12:
                setIntrmyAgt2Acct(null);
                return;
            case 13:
                setIntrmyAgt3(null);
                return;
            case 14:
                setIntrmyAgt3Acct(null);
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
            case 22:
                setUltmtCdtr(null);
                return;
            case 7:
                removeInstrForCdtrAgt(index);
                return;
            case 8:
                setInstrForDbtrAgt(null);
                return;
            case 17:
                setPurp(null);
                return;
            case 18:
                removeRgltryRptg(index);
                return;
            case 21:
                setTax(null);
                return;
            case 19:
                removeRltdRmtInf(index);
                return;
            case 20:
                setRmtInf(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a InstrForCdtrAgt (0..*).
     * 
     * @param index
     * @param index The index of the InstrForCdtrAgt to get.
     */
    public void removeInstrForCdtrAgt(int index) {
        if (this.instrForCdtrAgt == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1[] temp = this.instrForCdtrAgt;
        this.instrForCdtrAgt = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.instrForCdtrAgt, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.instrForCdtrAgt, index, temp.length-index-1);
        if (this.instrForCdtrAgt.length == 0)
            this.instrForCdtrAgt = null;
    }

    /**
     * Removes a RgltryRptg (0..10).
     * 
     * @param index
     * @param index The index of the RgltryRptg to get.
     */
    public void removeRgltryRptg(int index) {
        if (this.rgltryRptg == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3[] temp = this.rgltryRptg;
        this.rgltryRptg = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.rgltryRptg, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.rgltryRptg, index, temp.length-index-1);
        if (this.rgltryRptg.length == 0)
            this.rgltryRptg = null;
    }

    /**
     * Removes a RltdRmtInf (0..10).
     * 
     * @param index
     * @param index The index of the RltdRmtInf to get.
     */
    public void removeRltdRmtInf(int index) {
        if (this.rltdRmtInf == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2[] temp = this.rltdRmtInf;
        this.rltdRmtInf = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.rltdRmtInf, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.rltdRmtInf, index, temp.length-index-1);
        if (this.rltdRmtInf.length == 0)
            this.rltdRmtInf = null;
    }

    /**
     * [Virtual Element] Sets the value of Amt (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAmt(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.AmountType3Choice value) {
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
    public void setCdtr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 value) {
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
    public void setCdtrAcct(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 value) {
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
    public void setCdtrAgt(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
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
    public void setCdtrAgtAcct(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 value) {
        this.cdtrAgtAcct = value;
        if (this.cdtrAgtAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.cdtrAgtAcct).setParent(this, "CdtrAgtAcct");
    }

    /**
     * [Virtual Element] Sets the value of ChqInstr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setChqInstr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6 value) {
        this.chqInstr = value;
        if (this.chqInstr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.chqInstr).setParent(this, "ChqInstr");
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
            case 15:
                setPmtId((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentIdentification1) value);
                return;
            case 16:
                setPmtTpInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19) value);
                return;
            case 0:
                setAmt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.AmountType3Choice) value);
                return;
            case 24:
                setXchgRateInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1) value);
                return;
            case 6:
                setChrgBr((java.lang.String) value);
                return;
            case 5:
                setChqInstr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6) value);
                return;
            case 23:
                setUltmtDbtr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) value);
                return;
            case 9:
                setIntrmyAgt1((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 10:
                setIntrmyAgt1Acct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 11:
                setIntrmyAgt2((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 12:
                setIntrmyAgt2Acct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 13:
                setIntrmyAgt3((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 14:
                setIntrmyAgt3Acct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 3:
                setCdtrAgt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) value);
                return;
            case 4:
                setCdtrAgtAcct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 1:
                setCdtr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) value);
                return;
            case 2:
                setCdtrAcct((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) value);
                return;
            case 22:
                setUltmtCdtr((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) value);
                return;
            case 7:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1[]) {
                    setInstrForCdtrAgt((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1[])value);
                } else if (this.instrForCdtrAgt == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.instrForCdtrAgt[index] = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.instrForCdtrAgt[index]).setParent(this, "InstrForCdtrAgt");
                }
                return;
            case 8:
                setInstrForDbtrAgt((java.lang.String) value);
                return;
            case 17:
                setPurp((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Purpose2Choice) value);
                return;
            case 18:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3[]) {
                    setRgltryRptg((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3[])value);
                } else if (this.rgltryRptg == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.rgltryRptg[index] = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.rgltryRptg[index]).setParent(this, "RgltryRptg");
                }
                return;
            case 21:
                setTax((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.TaxInformation3) value);
                return;
            case 19:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2[]) {
                    setRltdRmtInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2[])value);
                } else if (this.rltdRmtInf == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.rltdRmtInf[index] = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.rltdRmtInf[index]).setParent(this, "RltdRmtInf");
                }
                return;
            case 20:
                setRmtInf((iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceInformation5) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of InstrForCdtrAgt (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInstrForCdtrAgt(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1[] value) {
        this.instrForCdtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.instrForCdtrAgt != null && i<this.instrForCdtrAgt.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.instrForCdtrAgt[i]).setParent(this, "InstrForCdtrAgt");
    }

    /**
     * [Virtual Element] Sets the value of InstrForDbtrAgt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setInstrForDbtrAgt(java.lang.String value) {
        this.instrForDbtrAgt = value;
    }

    /**
     * [Virtual Element] Sets the value of IntrmyAgt1 (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrmyAgt1(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.intrmyAgt1 = value;
        if (this.intrmyAgt1 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.intrmyAgt1).setParent(this, "IntrmyAgt1");
    }

    /**
     * [Virtual Element] Sets the value of IntrmyAgt1Acct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrmyAgt1Acct(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 value) {
        this.intrmyAgt1Acct = value;
        if (this.intrmyAgt1Acct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.intrmyAgt1Acct).setParent(this, "IntrmyAgt1Acct");
    }

    /**
     * [Virtual Element] Sets the value of IntrmyAgt2 (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrmyAgt2(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.intrmyAgt2 = value;
        if (this.intrmyAgt2 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.intrmyAgt2).setParent(this, "IntrmyAgt2");
    }

    /**
     * [Virtual Element] Sets the value of IntrmyAgt2Acct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrmyAgt2Acct(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 value) {
        this.intrmyAgt2Acct = value;
        if (this.intrmyAgt2Acct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.intrmyAgt2Acct).setParent(this, "IntrmyAgt2Acct");
    }

    /**
     * [Virtual Element] Sets the value of IntrmyAgt3 (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrmyAgt3(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4 value) {
        this.intrmyAgt3 = value;
        if (this.intrmyAgt3 != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.intrmyAgt3).setParent(this, "IntrmyAgt3");
    }

    /**
     * [Virtual Element] Sets the value of IntrmyAgt3Acct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrmyAgt3Acct(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16 value) {
        this.intrmyAgt3Acct = value;
        if (this.intrmyAgt3Acct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.intrmyAgt3Acct).setParent(this, "IntrmyAgt3Acct");
    }

    /**
     * [Virtual Element] Sets the value of PmtId (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPmtId(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentIdentification1 value) {
        this.pmtId = value;
        if (this.pmtId != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.pmtId).setParent(this, "PmtId");
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
     * [Virtual Element] Sets the value of Purp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPurp(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Purpose2Choice value) {
        this.purp = value;
        if (this.purp != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.purp).setParent(this, "Purp");
    }

    /**
     * [Virtual Element] Sets the value of RgltryRptg (0..10).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRgltryRptg(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3[] value) {
        this.rgltryRptg = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.rgltryRptg != null && i<this.rgltryRptg.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.rgltryRptg[i]).setParent(this, "RgltryRptg");
    }

    /**
     * [Virtual Element] Sets the value of RltdRmtInf (0..10).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRltdRmtInf(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2[] value) {
        this.rltdRmtInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.rltdRmtInf != null && i<this.rltdRmtInf.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.rltdRmtInf[i]).setParent(this, "RltdRmtInf");
    }

    /**
     * [Virtual Element] Sets the value of RmtInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRmtInf(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceInformation5 value) {
        this.rmtInf = value;
        if (this.rmtInf != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rmtInf).setParent(this, "RmtInf");
    }

    /**
     * [Virtual Element] Sets the value of Tax (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTax(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.TaxInformation3 value) {
        this.tax = value;
        if (this.tax != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.tax).setParent(this, "Tax");
    }

    /**
     * [Virtual Element] Sets the value of UltmtCdtr (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setUltmtCdtr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 value) {
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
    public void setUltmtDbtr(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32 value) {
        this.ultmtDbtr = value;
        if (this.ultmtDbtr != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.ultmtDbtr).setParent(this, "UltmtDbtr");
    }

    /**
     * [Virtual Element] Sets the value of XchgRateInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setXchgRateInf(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1 value) {
        this.xchgRateInf = value;
        if (this.xchgRateInf != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.xchgRateInf).setParent(this, "XchgRateInf");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.pmtId);
        out.writeObject(this.pmtTpInf);
        out.writeObject(this.amt);
        out.writeObject(this.xchgRateInf);
        out.writeObject(this.chrgBr);
        out.writeObject(this.chqInstr);
        out.writeObject(this.ultmtDbtr);
        out.writeObject(this.intrmyAgt1);
        out.writeObject(this.intrmyAgt1Acct);
        out.writeObject(this.intrmyAgt2);
        out.writeObject(this.intrmyAgt2Acct);
        out.writeObject(this.intrmyAgt3);
        out.writeObject(this.intrmyAgt3Acct);
        out.writeObject(this.cdtrAgt);
        out.writeObject(this.cdtrAgtAcct);
        out.writeObject(this.cdtr);
        out.writeObject(this.cdtrAcct);
        out.writeObject(this.ultmtCdtr);
        out.writeObject(this.instrForCdtrAgt);
        out.writeObject(this.instrForDbtrAgt);
        out.writeObject(this.purp);
        out.writeObject(this.rgltryRptg);
        out.writeObject(this.tax);
        out.writeObject(this.rltdRmtInf);
        out.writeObject(this.rmtInf);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.pmtId = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentIdentification1) in.readObject();
        this.pmtTpInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19) in.readObject();
        this.amt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.AmountType3Choice) in.readObject();
        this.xchgRateInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1) in.readObject();
        this.chrgBr = (java.lang.String) in.readObject();
        this.chqInstr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6) in.readObject();
        this.ultmtDbtr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) in.readObject();
        this.intrmyAgt1 = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.intrmyAgt1Acct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) in.readObject();
        this.intrmyAgt2 = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.intrmyAgt2Acct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) in.readObject();
        this.intrmyAgt3 = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.intrmyAgt3Acct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) in.readObject();
        this.cdtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4) in.readObject();
        this.cdtrAgtAcct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) in.readObject();
        this.cdtr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) in.readObject();
        this.cdtrAcct = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16) in.readObject();
        this.ultmtCdtr = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32) in.readObject();
        this.instrForCdtrAgt = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1[]) in.readObject();
        this.instrForDbtrAgt = (java.lang.String) in.readObject();
        this.purp = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Purpose2Choice) in.readObject();
        this.rgltryRptg = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3[]) in.readObject();
        this.tax = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.TaxInformation3) in.readObject();
        this.rltdRmtInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2[]) in.readObject();
        this.rmtInf = (iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceInformation5) in.readObject();
    }

}
