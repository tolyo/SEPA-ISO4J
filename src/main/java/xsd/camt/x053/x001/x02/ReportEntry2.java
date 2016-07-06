/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * ReportEntry2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>NtryRef</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>Amt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount}
 * (1)</li>
 * <li><b>CdtDbtInd</b> of type {@link java.lang.String} (1)</li>
 * <li><b>RvslInd</b> of type <code>boolean</code> (0..1)</li>
 * <li><b>Sts</b> of type {@link java.lang.String} (1)</li>
 * <li><b>BookgDt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice}
 * (0..1)</li>
 * <li><b>ValDt</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice}
 * (0..1)</li>
 * <li><b>AcctSvcrRef</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>Avlbty</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2}
 * (0..*)</li>
 * <li><b>BkTxCd</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4}
 * (1)</li>
 * <li><b>ComssnWvrInd</b> of type <code>boolean</code> (0..1)</li>
 * <li><b>AddtlInfInd</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.MessageIdentification2}
 * (0..1)</li>
 * <li><b>AmtDtls</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3}
 * (0..1)</li>
 * <li><b>Chrgs</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6}
 * (0..*)</li>
 * <li><b>TechInptChanl</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TechnicalInputChannel1Choice}
 * (0..1)</li>
 * <li><b>Intrst</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2}
 * (0..*)</li>
 * <li><b>NtryDtls</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1}
 * (0..*)</li>
 * <li><b>AddtlNtryInf</b> of type {@link java.lang.String}
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
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2Cls
 */
public class ReportEntry2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AcctSvcrRef", "AddtlInfInd", "AddtlNtryInf", "Amt", "AmtDtls", "Avlbty", "BkTxCd", "BookgDt", "CdtDbtInd", "Chrgs", "ComssnWvrInd", "Intrst", "NtryDtls", "NtryRef", "RvslInd", "Sts", "TechInptChanl", "ValDt"};

    /**
     * Field ntryRef.
     */
    private java.lang.String ntryRef;

    /**
     * Field amt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount amt;

    /**
     * Field cdtDbtInd.
     */
    private java.lang.String cdtDbtInd;

    /**
     * Field rvslInd.
     */
    private boolean rvslInd;

    /**
     * Field isrvslIndSet.
     */
    private boolean isrvslIndSet;

    /**
     * Field sts.
     */
    private java.lang.String sts;

    /**
     * Field bookgDt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice bookgDt;

    /**
     * Field valDt.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice valDt;

    /**
     * Field acctSvcrRef.
     */
    private java.lang.String acctSvcrRef;

    /**
     * Field avlbty.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] avlbty;

    /**
     * Field bkTxCd.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4 bkTxCd;

    /**
     * Field comssnWvrInd.
     */
    private boolean comssnWvrInd;

    /**
     * Field iscomssnWvrIndSet.
     */
    private boolean iscomssnWvrIndSet;

    /**
     * Field addtlInfInd.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.MessageIdentification2 addtlInfInd;

    /**
     * Field amtDtls.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3 amtDtls;

    /**
     * Field chrgs.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6[] chrgs;

    /**
     * Field techInptChanl.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TechnicalInputChannel1Choice techInptChanl;

    /**
     * Field intrst.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2[] intrst;

    /**
     * Field ntryDtls.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1[] ntryDtls;

    /**
     * Field addtlNtryInf.
     */
    private java.lang.String addtlNtryInf;

    public ReportEntry2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2Cls.getInstance().getNullDefiningElementDecl());
    }

    public ReportEntry2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public ReportEntry2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public ReportEntry2(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2 clone) {
        super(clone);
    }

    /**
     * Adds a Avlbty (0..*).
     * 
     * @param value
     * @param value The new Avlbty.
     */
    public void addAvlbty(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] temp = this.avlbty;
        this.avlbty = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.avlbty, 0, temp.length);
        this.avlbty[this.avlbty.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Avlbty");
    }

    /**
     * Adds a Chrgs (0..*).
     * 
     * @param value
     * @param value The new Chrgs.
     */
    public void addChrgs(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6[] temp = this.chrgs;
        this.chrgs = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.chrgs, 0, temp.length);
        this.chrgs[this.chrgs.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Chrgs");
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
            case 13:
                setNtryRef((java.lang.String) value);
                return;
            case 3:
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 8:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 14:
                setRvslInd(biz.c24.io.api.Utils.booleanValue(value));
                return;
            case 15:
                setSts((java.lang.String) value);
                return;
            case 7:
                setBookgDt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) value);
                return;
            case 17:
                setValDt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) value);
                return;
            case 0:
                setAcctSvcrRef((java.lang.String) value);
                return;
            case 5:
                addAvlbty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2) value);
                return;
            case 6:
                setBkTxCd((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4) value);
                return;
            case 10:
                setComssnWvrInd(biz.c24.io.api.Utils.booleanValue(value));
                return;
            case 1:
                setAddtlInfInd((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.MessageIdentification2) value);
                return;
            case 4:
                setAmtDtls((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3) value);
                return;
            case 9:
                addChrgs((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6) value);
                return;
            case 16:
                setTechInptChanl((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TechnicalInputChannel1Choice) value);
                return;
            case 11:
                addIntrst((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2) value);
                return;
            case 12:
                addNtryDtls((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1) value);
                return;
            case 2:
                setAddtlNtryInf((java.lang.String) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a Intrst (0..*).
     * 
     * @param value
     * @param value The new Intrst.
     */
    public void addIntrst(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2[] temp = this.intrst;
        this.intrst = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.intrst, 0, temp.length);
        this.intrst[this.intrst.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Intrst");
    }

    /**
     * Adds a NtryDtls (0..*).
     * 
     * @param value
     * @param value The new NtryDtls.
     */
    public void addNtryDtls(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1 value) {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1[] temp = this.ntryDtls;
        this.ntryDtls = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.ntryDtls, 0, temp.length);
        this.ntryDtls[this.ntryDtls.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "NtryDtls");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ReportEntry2) clone;
        obj.ntryRef = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.ntryRef, obj, "NtryRef");
        obj.amt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) biz.c24.io.api.Utils.cloneDeep(this.amt, obj, "Amt");
        obj.cdtDbtInd = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.cdtDbtInd, obj, "CdtDbtInd");
        obj.isrvslIndSet = this.isrvslIndSet;
        obj.rvslInd = this.rvslInd;
        obj.sts = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.sts, obj, "Sts");
        obj.bookgDt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) biz.c24.io.api.Utils.cloneDeep(this.bookgDt, obj, "BookgDt");
        obj.valDt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) biz.c24.io.api.Utils.cloneDeep(this.valDt, obj, "ValDt");
        obj.acctSvcrRef = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.acctSvcrRef, obj, "AcctSvcrRef");
        obj.avlbty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]) biz.c24.io.api.Utils.cloneDeep(this.avlbty, obj, "Avlbty");
        obj.bkTxCd = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4) biz.c24.io.api.Utils.cloneDeep(this.bkTxCd, obj, "BkTxCd");
        obj.iscomssnWvrIndSet = this.iscomssnWvrIndSet;
        obj.comssnWvrInd = this.comssnWvrInd;
        obj.addtlInfInd = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.MessageIdentification2) biz.c24.io.api.Utils.cloneDeep(this.addtlInfInd, obj, "AddtlInfInd");
        obj.amtDtls = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3) biz.c24.io.api.Utils.cloneDeep(this.amtDtls, obj, "AmtDtls");
        obj.chrgs = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6[]) biz.c24.io.api.Utils.cloneDeep(this.chrgs, obj, "Chrgs");
        obj.techInptChanl = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TechnicalInputChannel1Choice) biz.c24.io.api.Utils.cloneDeep(this.techInptChanl, obj, "TechInptChanl");
        obj.intrst = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2[]) biz.c24.io.api.Utils.cloneDeep(this.intrst, obj, "Intrst");
        obj.ntryDtls = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1[]) biz.c24.io.api.Utils.cloneDeep(this.ntryDtls, obj, "NtryDtls");
        obj.addtlNtryInf = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.addtlNtryInf, obj, "AddtlNtryInf");
    }

    /**
     * Creates, adds and returns a new AddtlInfInd (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.MessageIdentification2 createAddtlInfInd() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.MessageIdentification2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.MessageIdentification2) getElementDecl("AddtlInfInd").createObject();
        setAddtlInfInd(obj);
        return obj;
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
     * Creates, adds and returns a new AmtDtls (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3 createAmtDtls() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3) getElementDecl("AmtDtls").createObject();
        setAmtDtls(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Avlbty (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 createAvlbty() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2) getElementDecl("Avlbty").createObject();
        addAvlbty(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new BkTxCd (1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4 createBkTxCd() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4) getElementDecl("BkTxCd").createObject();
        setBkTxCd(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new BookgDt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice createBookgDt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) getElementDecl("BookgDt").createObject();
        setBookgDt(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Chrgs (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6 createChrgs() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6) getElementDecl("Chrgs").createObject();
        addChrgs(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Intrst (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2 createIntrst() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2) getElementDecl("Intrst").createObject();
        addIntrst(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new NtryDtls (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1 createNtryDtls() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1 obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1) getElementDecl("NtryDtls").createObject();
        addNtryDtls(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new TechInptChanl (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TechnicalInputChannel1Choice createTechInptChanl() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TechnicalInputChannel1Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TechnicalInputChannel1Choice) getElementDecl("TechInptChanl").createObject();
        setTechInptChanl(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new ValDt (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice createValDt() {
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice obj = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) getElementDecl("ValDt").createObject();
        setValDt(obj);
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
     * Gets the value of AcctSvcrRef (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getAcctSvcrRef() {
        return this.acctSvcrRef;
    }

    /**
     * Gets the value of AddtlInfInd (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.MessageIdentification2 getAddtlInfInd() {
        return this.addtlInfInd;
    }

    /**
     * Gets the value of AddtlNtryInf (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getAddtlNtryInf() {
        return this.addtlNtryInf;
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
     * Gets the value of AmtDtls (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3 getAmtDtls() {
        return this.amtDtls;
    }

    /**
     * Gets the value of Avlbty (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] getAvlbty() {
        if (this.avlbty == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]{};
        else
            return this.avlbty;
    }

    /**
     * Gets the value of Avlbty by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 getAvlbty(int ordinal) {
        if (this.avlbty == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.avlbty.length) {
            return this.avlbty[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Avlbty to get the index of.
     * @return The index.
     */
    public int getAvlbtyIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2 value) {
        if (this.avlbty == null)
            return -1;
        for (int i=0; i<this.avlbty.length; i++)
            if (this.avlbty[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of BkTxCd (1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4 getBkTxCd() {
        return this.bkTxCd;
    }

    /**
     * Gets the value of BookgDt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice getBookgDt() {
        return this.bookgDt;
    }

    /**
     * Gets the value of CdtDbtInd (1).
     * 
     * @return The value.
     */
    public java.lang.String getCdtDbtInd() {
        return this.cdtDbtInd;
    }

    /**
     * Gets the value of Chrgs (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6[] getChrgs() {
        if (this.chrgs == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6[]{};
        else
            return this.chrgs;
    }

    /**
     * Gets the value of Chrgs by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6 getChrgs(int ordinal) {
        if (this.chrgs == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.chrgs.length) {
            return this.chrgs[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Chrgs to get the index of.
     * @return The index.
     */
    public int getChrgsIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6 value) {
        if (this.chrgs == null)
            return -1;
        for (int i=0; i<this.chrgs.length; i++)
            if (this.chrgs[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of ComssnWvrInd (0..1).
     * 
     * @return The value.
     */
    public boolean getComssnWvrInd() {
        return this.comssnWvrInd;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>ntryRef,
     * amt, cdtDbtInd, rvslInd, sts, bookgDt, valDt, acctSvcrRef,
     * avlbty, bkTxCd, comssnWvrInd, addtlInfInd, amtDtls, chrgs,
     * techInptChanl, intrst, ntryDtls, addtlNtryInf</b>.
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
            case 13:
                return getNtryRef();
            case 3:
                return getAmt();
            case 8:
                return getCdtDbtInd();
            case 14:
                return getRvslInd();
            case 15:
                return getSts();
            case 7:
                return getBookgDt();
            case 17:
                return getValDt();
            case 0:
                return getAcctSvcrRef();
            case 5:
            if (this.avlbty == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.avlbty[index];
            case 6:
                return getBkTxCd();
            case 10:
                return getComssnWvrInd();
            case 1:
                return getAddtlInfInd();
            case 4:
                return getAmtDtls();
            case 9:
            if (this.chrgs == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.chrgs[index];
            case 16:
                return getTechInptChanl();
            case 11:
            if (this.intrst == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.intrst[index];
            case 12:
            if (this.ntryDtls == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.ntryDtls[index];
            case 2:
                return getAddtlNtryInf();
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
            case 13:
                return this.ntryRef == null ? 0 : 1;
            case 3:
                return this.amt == null ? 0 : 1;
            case 8:
                return this.cdtDbtInd == null ? 0 : 1;
            case 14:
                return this.isrvslIndSet ? 1 : 0;
            case 15:
                return this.sts == null ? 0 : 1;
            case 7:
                return this.bookgDt == null ? 0 : 1;
            case 17:
                return this.valDt == null ? 0 : 1;
            case 0:
                return this.acctSvcrRef == null ? 0 : 1;
            case 5:
                return this.avlbty == null ? 0 : this.avlbty.length;
            case 6:
                return this.bkTxCd == null ? 0 : 1;
            case 10:
                return this.iscomssnWvrIndSet ? 1 : 0;
            case 1:
                return this.addtlInfInd == null ? 0 : 1;
            case 4:
                return this.amtDtls == null ? 0 : 1;
            case 9:
                return this.chrgs == null ? 0 : this.chrgs.length;
            case 16:
                return this.techInptChanl == null ? 0 : 1;
            case 11:
                return this.intrst == null ? 0 : this.intrst.length;
            case 12:
                return this.ntryDtls == null ? 0 : this.ntryDtls.length;
            case 2:
                return this.addtlNtryInf == null ? 0 : 1;
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
            case 13:
                return this.ntryRef != null && this.ntryRef.equals(element) ? 0 : -1;
            case 3:
                return this.amt != null && this.amt.equals(element) ? 0 : -1;
            case 8:
                return this.cdtDbtInd != null && this.cdtDbtInd.equals(element) ? 0 : -1;
            case 14:
                return this.isrvslIndSet ? (this.rvslInd == biz.c24.io.api.Utils.booleanValue(element) ? 0 : -1) : -1;
            case 15:
                return this.sts != null && this.sts.equals(element) ? 0 : -1;
            case 7:
                return this.bookgDt != null && this.bookgDt.equals(element) ? 0 : -1;
            case 17:
                return this.valDt != null && this.valDt.equals(element) ? 0 : -1;
            case 0:
                return this.acctSvcrRef != null && this.acctSvcrRef.equals(element) ? 0 : -1;
            case 5:
                return getAvlbtyIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2) element);
            case 6:
                return this.bkTxCd != null && this.bkTxCd.equals(element) ? 0 : -1;
            case 10:
                return this.iscomssnWvrIndSet ? (this.comssnWvrInd == biz.c24.io.api.Utils.booleanValue(element) ? 0 : -1) : -1;
            case 1:
                return this.addtlInfInd != null && this.addtlInfInd.equals(element) ? 0 : -1;
            case 4:
                return this.amtDtls != null && this.amtDtls.equals(element) ? 0 : -1;
            case 9:
                return getChrgsIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6) element);
            case 16:
                return this.techInptChanl != null && this.techInptChanl.equals(element) ? 0 : -1;
            case 11:
                return getIntrstIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2) element);
            case 12:
                return getNtryDtlsIndex((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1) element);
            case 2:
                return this.addtlNtryInf != null && this.addtlNtryInf.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Intrst (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2[] getIntrst() {
        if (this.intrst == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2[]{};
        else
            return this.intrst;
    }

    /**
     * Gets the value of Intrst by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2 getIntrst(int ordinal) {
        if (this.intrst == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.intrst.length) {
            return this.intrst[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Intrst to get the index of.
     * @return The index.
     */
    public int getIntrstIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2 value) {
        if (this.intrst == null)
            return -1;
        for (int i=0; i<this.intrst.length; i++)
            if (this.intrst[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of NtryDtls (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1[] getNtryDtls() {
        if (this.ntryDtls == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1[]{};
        else
            return this.ntryDtls;
    }

    /**
     * Gets the value of NtryDtls by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1 getNtryDtls(int ordinal) {
        if (this.ntryDtls == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.ntryDtls.length) {
            return this.ntryDtls[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The NtryDtls to get the index of.
     * @return The index.
     */
    public int getNtryDtlsIndex(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1 value) {
        if (this.ntryDtls == null)
            return -1;
        for (int i=0; i<this.ntryDtls.length; i++)
            if (this.ntryDtls[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of NtryRef (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getNtryRef() {
        return this.ntryRef;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>ntryRef,
     * amt, cdtDbtInd, rvslInd, sts, bookgDt, valDt, acctSvcrRef,
     * avlbty, bkTxCd, comssnWvrInd, addtlInfInd, amtDtls, chrgs,
     * techInptChanl, intrst, ntryDtls, addtlNtryInf</b>.
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
            case 13:
                return this.ntryRef;
            case 3:
                return this.amt;
            case 8:
                return this.cdtDbtInd;
            case 14:
                return this.rvslInd;
            case 15:
                return this.sts;
            case 7:
                return this.bookgDt;
            case 17:
                return this.valDt;
            case 0:
                return this.acctSvcrRef;
            case 5:
            if (this.avlbty == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.avlbty[index];
            case 6:
                return this.bkTxCd;
            case 10:
                return this.comssnWvrInd;
            case 1:
                return this.addtlInfInd;
            case 4:
                return this.amtDtls;
            case 9:
            if (this.chrgs == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.chrgs[index];
            case 16:
                return this.techInptChanl;
            case 11:
            if (this.intrst == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.intrst[index];
            case 12:
            if (this.ntryDtls == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.ntryDtls[index];
            case 2:
                return this.addtlNtryInf;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of RvslInd (0..1).
     * 
     * @return The value.
     */
    public boolean getRvslInd() {
        return this.rvslInd;
    }

    /**
     * Gets the value of Sts (1).
     * 
     * @return The value.
     */
    public java.lang.String getSts() {
        return this.sts;
    }

    /**
     * Gets the value of TechInptChanl (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TechnicalInputChannel1Choice getTechInptChanl() {
        return this.techInptChanl;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.ntryRef == null ? 0 : 1;
        count += this.amt == null ? 0 : 1;
        count += this.cdtDbtInd == null ? 0 : 1;
        count += this.isrvslIndSet ? 1 : 0;
        count += this.sts == null ? 0 : 1;
        count += this.bookgDt == null ? 0 : 1;
        count += this.valDt == null ? 0 : 1;
        count += this.acctSvcrRef == null ? 0 : 1;
        count += this.avlbty == null ? 0 : this.avlbty.length;
        count += this.bkTxCd == null ? 0 : 1;
        count += this.iscomssnWvrIndSet ? 1 : 0;
        count += this.addtlInfInd == null ? 0 : 1;
        count += this.amtDtls == null ? 0 : 1;
        count += this.chrgs == null ? 0 : this.chrgs.length;
        count += this.techInptChanl == null ? 0 : 1;
        count += this.intrst == null ? 0 : this.intrst.length;
        count += this.ntryDtls == null ? 0 : this.ntryDtls.length;
        count += this.addtlNtryInf == null ? 0 : 1;
        return count;
    }

    /**
     * Gets the value of ValDt (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice getValDt() {
        return this.valDt;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(ntryRef);
        result = 31 * result + hashCodeOf(amt);
        result = 31 * result + hashCodeOf(cdtDbtInd);
        result = 31 * result + hashCodeOf(rvslInd);
        result = 31 * result + hashCodeOf(isrvslIndSet);
        result = 31 * result + hashCodeOf(sts);
        result = 31 * result + hashCodeOf(bookgDt);
        result = 31 * result + hashCodeOf(valDt);
        result = 31 * result + hashCodeOf(acctSvcrRef);
        result = 31 * result + hashCodeOf(avlbty);
        result = 31 * result + hashCodeOf(bkTxCd);
        result = 31 * result + hashCodeOf(comssnWvrInd);
        result = 31 * result + hashCodeOf(iscomssnWvrIndSet);
        result = 31 * result + hashCodeOf(addtlInfInd);
        result = 31 * result + hashCodeOf(amtDtls);
        result = 31 * result + hashCodeOf(chrgs);
        result = 31 * result + hashCodeOf(techInptChanl);
        result = 31 * result + hashCodeOf(intrst);
        result = 31 * result + hashCodeOf(ntryDtls);
        result = 31 * result + hashCodeOf(addtlNtryInf);
        return result;
    }

    /**
     * Tests whether ComssnWvrInd has been set.
     */
    public boolean isComssnWvrIndSet() {
        return iscomssnWvrIndSet;
    }

    /**
     * Tests whether RvslInd has been set.
     */
    public boolean isRvslIndSet() {
        return isrvslIndSet;
    }

    /**
     * Removes a Avlbty (0..*).
     * 
     * @param index
     * @param index The index of the Avlbty to get.
     */
    public void removeAvlbty(int index) {
        if (this.avlbty == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] temp = this.avlbty;
        this.avlbty = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.avlbty, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.avlbty, index, temp.length-index-1);
        if (this.avlbty.length == 0)
            this.avlbty = null;
    }

    /**
     * Removes a Chrgs (0..*).
     * 
     * @param index
     * @param index The index of the Chrgs to get.
     */
    public void removeChrgs(int index) {
        if (this.chrgs == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6[] temp = this.chrgs;
        this.chrgs = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.chrgs, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.chrgs, index, temp.length-index-1);
        if (this.chrgs.length == 0)
            this.chrgs = null;
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
            case 13:
                setNtryRef(null);
                return;
            case 3:
                setAmt(null);
                return;
            case 8:
                setCdtDbtInd(null);
                return;
            case 14:
                setRvslInd(false);
                this.isrvslIndSet = false;
                return;
            case 15:
                setSts(null);
                return;
            case 7:
                setBookgDt(null);
                return;
            case 17:
                setValDt(null);
                return;
            case 0:
                setAcctSvcrRef(null);
                return;
            case 5:
                removeAvlbty(index);
                return;
            case 6:
                setBkTxCd(null);
                return;
            case 10:
                setComssnWvrInd(false);
                this.iscomssnWvrIndSet = false;
                return;
            case 1:
                setAddtlInfInd(null);
                return;
            case 4:
                setAmtDtls(null);
                return;
            case 9:
                removeChrgs(index);
                return;
            case 16:
                setTechInptChanl(null);
                return;
            case 11:
                removeIntrst(index);
                return;
            case 12:
                removeNtryDtls(index);
                return;
            case 2:
                setAddtlNtryInf(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a Intrst (0..*).
     * 
     * @param index
     * @param index The index of the Intrst to get.
     */
    public void removeIntrst(int index) {
        if (this.intrst == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2[] temp = this.intrst;
        this.intrst = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.intrst, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.intrst, index, temp.length-index-1);
        if (this.intrst.length == 0)
            this.intrst = null;
    }

    /**
     * Removes a NtryDtls (0..*).
     * 
     * @param index
     * @param index The index of the NtryDtls to get.
     */
    public void removeNtryDtls(int index) {
        if (this.ntryDtls == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1[] temp = this.ntryDtls;
        this.ntryDtls = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.ntryDtls, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.ntryDtls, index, temp.length-index-1);
        if (this.ntryDtls.length == 0)
            this.ntryDtls = null;
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
     * [Virtual Element] Sets the value of AddtlInfInd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAddtlInfInd(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.MessageIdentification2 value) {
        this.addtlInfInd = value;
        if (this.addtlInfInd != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.addtlInfInd).setParent(this, "AddtlInfInd");
    }

    /**
     * [Virtual Element] Sets the value of AddtlNtryInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAddtlNtryInf(java.lang.String value) {
        this.addtlNtryInf = value;
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
     * [Virtual Element] Sets the value of AmtDtls (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAmtDtls(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3 value) {
        this.amtDtls = value;
        if (this.amtDtls != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.amtDtls).setParent(this, "AmtDtls");
    }

    /**
     * [Virtual Element] Sets the value of Avlbty (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAvlbty(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[] value) {
        this.avlbty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.avlbty != null && i<this.avlbty.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.avlbty[i]).setParent(this, "Avlbty");
    }

    /**
     * [Virtual Element] Sets the value of BkTxCd (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBkTxCd(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4 value) {
        this.bkTxCd = value;
        if (this.bkTxCd != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.bkTxCd).setParent(this, "BkTxCd");
    }

    /**
     * [Virtual Element] Sets the value of BookgDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBookgDt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice value) {
        this.bookgDt = value;
        if (this.bookgDt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.bookgDt).setParent(this, "BookgDt");
    }

    /**
     * [Virtual Element] Sets the value of CdtDbtInd (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCdtDbtInd(java.lang.String value) {
        this.cdtDbtInd = value;
    }

    /**
     * [Virtual Element] Sets the value of Chrgs (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setChrgs(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6[] value) {
        this.chrgs = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.chrgs != null && i<this.chrgs.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.chrgs[i]).setParent(this, "Chrgs");
    }

    /**
     * [Virtual Element] Sets the value of ComssnWvrInd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setComssnWvrInd(boolean value) {
        this.comssnWvrInd = value;
        this.iscomssnWvrIndSet = true;
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
            case 13:
                setNtryRef((java.lang.String) value);
                return;
            case 3:
                setAmt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) value);
                return;
            case 8:
                setCdtDbtInd((java.lang.String) value);
                return;
            case 14:
                setRvslInd(biz.c24.io.api.Utils.booleanValue(value));
                return;
            case 15:
                setSts((java.lang.String) value);
                return;
            case 7:
                setBookgDt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) value);
                return;
            case 17:
                setValDt((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) value);
                return;
            case 0:
                setAcctSvcrRef((java.lang.String) value);
                return;
            case 5:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]) {
                    setAvlbty((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[])value);
                } else if (this.avlbty == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.avlbty[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.avlbty[index]).setParent(this, "Avlbty");
                }
                return;
            case 6:
                setBkTxCd((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4) value);
                return;
            case 10:
                setComssnWvrInd(biz.c24.io.api.Utils.booleanValue(value));
                return;
            case 1:
                setAddtlInfInd((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.MessageIdentification2) value);
                return;
            case 4:
                setAmtDtls((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3) value);
                return;
            case 9:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6[]) {
                    setChrgs((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6[])value);
                } else if (this.chrgs == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.chrgs[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.chrgs[index]).setParent(this, "Chrgs");
                }
                return;
            case 16:
                setTechInptChanl((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TechnicalInputChannel1Choice) value);
                return;
            case 11:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2[]) {
                    setIntrst((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2[])value);
                } else if (this.intrst == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.intrst[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.intrst[index]).setParent(this, "Intrst");
                }
                return;
            case 12:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1[]) {
                    setNtryDtls((iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1[])value);
                } else if (this.ntryDtls == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.ntryDtls[index] = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.ntryDtls[index]).setParent(this, "NtryDtls");
                }
                return;
            case 2:
                setAddtlNtryInf((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Intrst (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrst(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2[] value) {
        this.intrst = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.intrst != null && i<this.intrst.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.intrst[i]).setParent(this, "Intrst");
    }

    /**
     * [Virtual Element] Sets the value of NtryDtls (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNtryDtls(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1[] value) {
        this.ntryDtls = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.ntryDtls != null && i<this.ntryDtls.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.ntryDtls[i]).setParent(this, "NtryDtls");
    }

    /**
     * [Virtual Element] Sets the value of NtryRef (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNtryRef(java.lang.String value) {
        this.ntryRef = value;
    }

    /**
     * [Virtual Element] Sets the value of RvslInd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRvslInd(boolean value) {
        this.rvslInd = value;
        this.isrvslIndSet = true;
    }

    /**
     * [Virtual Element] Sets the value of Sts (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSts(java.lang.String value) {
        this.sts = value;
    }

    /**
     * [Virtual Element] Sets the value of TechInptChanl (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTechInptChanl(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TechnicalInputChannel1Choice value) {
        this.techInptChanl = value;
        if (this.techInptChanl != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.techInptChanl).setParent(this, "TechInptChanl");
    }

    /**
     * [Virtual Element] Sets the value of ValDt (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setValDt(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice value) {
        this.valDt = value;
        if (this.valDt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.valDt).setParent(this, "ValDt");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.ntryRef);
        out.writeObject(this.amt);
        out.writeObject(this.cdtDbtInd);
        out.writeBoolean(this.isrvslIndSet);
        if (this.isrvslIndSet)
            out.writeBoolean(this.rvslInd);
        out.writeObject(this.sts);
        out.writeObject(this.bookgDt);
        out.writeObject(this.valDt);
        out.writeObject(this.acctSvcrRef);
        out.writeObject(this.avlbty);
        out.writeObject(this.bkTxCd);
        out.writeBoolean(this.iscomssnWvrIndSet);
        if (this.iscomssnWvrIndSet)
            out.writeBoolean(this.comssnWvrInd);
        out.writeObject(this.addtlInfInd);
        out.writeObject(this.amtDtls);
        out.writeObject(this.chrgs);
        out.writeObject(this.techInptChanl);
        out.writeObject(this.intrst);
        out.writeObject(this.ntryDtls);
        out.writeObject(this.addtlNtryInf);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.ntryRef = (java.lang.String) in.readObject();
        this.amt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyAndAmount) in.readObject();
        this.cdtDbtInd = (java.lang.String) in.readObject();
        this.isrvslIndSet = in.readBoolean();
        if (this.isrvslIndSet)
            this.rvslInd = in.readBoolean();
        this.sts = (java.lang.String) in.readObject();
        this.bookgDt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) in.readObject();
        this.valDt = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.DateAndDateTimeChoice) in.readObject();
        this.acctSvcrRef = (java.lang.String) in.readObject();
        this.avlbty = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailability2[]) in.readObject();
        this.bkTxCd = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BankTransactionCodeStructure4) in.readObject();
        this.iscomssnWvrIndSet = in.readBoolean();
        if (this.iscomssnWvrIndSet)
            this.comssnWvrInd = in.readBoolean();
        this.addtlInfInd = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.MessageIdentification2) in.readObject();
        this.amtDtls = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.AmountAndCurrencyExchange3) in.readObject();
        this.chrgs = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ChargesInformation6[]) in.readObject();
        this.techInptChanl = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TechnicalInputChannel1Choice) in.readObject();
        this.intrst = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.TransactionInterest2[]) in.readObject();
        this.ntryDtls = (iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.EntryDetails1[]) in.readObject();
        this.addtlNtryInf = (java.lang.String) in.readObject();
    }

}
