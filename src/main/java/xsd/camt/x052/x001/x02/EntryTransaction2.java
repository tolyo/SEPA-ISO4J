/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * EntryTransaction2. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>Refs</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2}
 * (0..1)</li>
 * <li><b>AmtDtls</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountAndCurrencyExchange3}
 * (0..1)</li>
 * <li><b>Avlbty</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2}
 * (0..*)</li>
 * <li><b>BkTxCd</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BankTransactionCodeStructure4}
 * (0..1)</li>
 * <li><b>Chrgs</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6}
 * (0..*)</li>
 * <li><b>Intrst</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2}
 * (0..*)</li>
 * <li><b>RltdPties</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionParty2}
 * (0..1)</li>
 * <li><b>RltdAgts</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2}
 * (0..1)</li>
 * <li><b>Purp</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Purpose2Choice}
 * (0..1)</li>
 * <li><b>RltdRmtInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2}
 * (0..10)</li>
 * <li><b>RmtInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceInformation5}
 * (0..1)</li>
 * <li><b>RltdDts</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2}
 * (0..1)</li>
 * <li><b>RltdPric</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionPrice2Choice}
 * (0..1)</li>
 * <li><b>RltdQties</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice}
 * (0..*)</li>
 * <li><b>FinInstrmId</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice}
 * (0..1)</li>
 * <li><b>Tax</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3}
 * (0..1)</li>
 * <li><b>RtrInf</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReasonInformation10}
 * (0..1)</li>
 * <li><b>CorpActn</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CorporateAction1}
 * (0..1)</li>
 * <li><b>SfkpgAcct</b> of type {@link
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashAccount16}
 * (0..1)</li>
 * <li><b>AddtlTxInf</b> of type {@link java.lang.String}
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
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2Cls
 */
public class EntryTransaction2 extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"AddtlTxInf", "AmtDtls", "Avlbty", "BkTxCd", "Chrgs", "CorpActn", "FinInstrmId", "Intrst", "Purp", "Refs", "RltdAgts", "RltdDts", "RltdPric", "RltdPties", "RltdQties", "RltdRmtInf", "RmtInf", "RtrInf", "SfkpgAcct", "Tax"};

    /**
     * Field refs.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2 refs;

    /**
     * Field amtDtls.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountAndCurrencyExchange3 amtDtls;

    /**
     * Field avlbty.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2[] avlbty;

    /**
     * Field bkTxCd.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BankTransactionCodeStructure4 bkTxCd;

    /**
     * Field chrgs.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6[] chrgs;

    /**
     * Field intrst.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2[] intrst;

    /**
     * Field rltdPties.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionParty2 rltdPties;

    /**
     * Field rltdAgts.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2 rltdAgts;

    /**
     * Field purp.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Purpose2Choice purp;

    /**
     * Field rltdRmtInf.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2[] rltdRmtInf;

    /**
     * Field rmtInf.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceInformation5 rmtInf;

    /**
     * Field rltdDts.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2 rltdDts;

    /**
     * Field rltdPric.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionPrice2Choice rltdPric;

    /**
     * Field rltdQties.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice[] rltdQties;

    /**
     * Field finInstrmId.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice finInstrmId;

    /**
     * Field tax.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3 tax;

    /**
     * Field rtrInf.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReasonInformation10 rtrInf;

    /**
     * Field corpActn.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CorporateAction1 corpActn;

    /**
     * Field sfkpgAcct.
     */
    private iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashAccount16 sfkpgAcct;

    /**
     * Field addtlTxInf.
     */
    private java.lang.String addtlTxInf;

    public EntryTransaction2() {
        this(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2Cls.getInstance().getNullDefiningElementDecl());
    }

    public EntryTransaction2(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public EntryTransaction2(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public EntryTransaction2(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2 clone) {
        super(clone);
    }

    /**
     * Adds a Avlbty (0..*).
     * 
     * @param value
     * @param value The new Avlbty.
     */
    public void addAvlbty(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2[] temp = this.avlbty;
        this.avlbty = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2[temp == null ? 1 : (temp.length+1)];
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
    public void addChrgs(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6 value) {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6[] temp = this.chrgs;
        this.chrgs = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6[temp == null ? 1 : (temp.length+1)];
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
            case 9:
                setRefs((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2) value);
                return;
            case 1:
                setAmtDtls((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountAndCurrencyExchange3) value);
                return;
            case 2:
                addAvlbty((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2) value);
                return;
            case 3:
                setBkTxCd((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BankTransactionCodeStructure4) value);
                return;
            case 4:
                addChrgs((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6) value);
                return;
            case 7:
                addIntrst((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2) value);
                return;
            case 13:
                setRltdPties((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionParty2) value);
                return;
            case 10:
                setRltdAgts((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2) value);
                return;
            case 8:
                setPurp((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Purpose2Choice) value);
                return;
            case 15:
                addRltdRmtInf((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2) value);
                return;
            case 16:
                setRmtInf((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceInformation5) value);
                return;
            case 11:
                setRltdDts((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2) value);
                return;
            case 12:
                setRltdPric((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionPrice2Choice) value);
                return;
            case 14:
                addRltdQties((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice) value);
                return;
            case 6:
                setFinInstrmId((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice) value);
                return;
            case 19:
                setTax((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3) value);
                return;
            case 17:
                setRtrInf((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReasonInformation10) value);
                return;
            case 5:
                setCorpActn((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CorporateAction1) value);
                return;
            case 18:
                setSfkpgAcct((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashAccount16) value);
                return;
            case 0:
                setAddtlTxInf((java.lang.String) value);
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
    public void addIntrst(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2[] temp = this.intrst;
        this.intrst = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.intrst, 0, temp.length);
        this.intrst[this.intrst.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Intrst");
    }

    /**
     * Adds a RltdQties (0..*).
     * 
     * @param value
     * @param value The new RltdQties.
     */
    public void addRltdQties(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice value) {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice[] temp = this.rltdQties;
        this.rltdQties = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.rltdQties, 0, temp.length);
        this.rltdQties[this.rltdQties.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "RltdQties");
    }

    /**
     * Adds a RltdRmtInf (0..10).
     * 
     * @param value
     * @param value The new RltdRmtInf.
     */
    public void addRltdRmtInf(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2 value) {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2[] temp = this.rltdRmtInf;
        this.rltdRmtInf = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2[temp == null ? 1 : (temp.length+1)];
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
        return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.EntryTransaction2) clone;
        obj.refs = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2) biz.c24.io.api.Utils.cloneDeep(this.refs, obj, "Refs");
        obj.amtDtls = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountAndCurrencyExchange3) biz.c24.io.api.Utils.cloneDeep(this.amtDtls, obj, "AmtDtls");
        obj.avlbty = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2[]) biz.c24.io.api.Utils.cloneDeep(this.avlbty, obj, "Avlbty");
        obj.bkTxCd = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BankTransactionCodeStructure4) biz.c24.io.api.Utils.cloneDeep(this.bkTxCd, obj, "BkTxCd");
        obj.chrgs = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6[]) biz.c24.io.api.Utils.cloneDeep(this.chrgs, obj, "Chrgs");
        obj.intrst = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2[]) biz.c24.io.api.Utils.cloneDeep(this.intrst, obj, "Intrst");
        obj.rltdPties = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionParty2) biz.c24.io.api.Utils.cloneDeep(this.rltdPties, obj, "RltdPties");
        obj.rltdAgts = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2) biz.c24.io.api.Utils.cloneDeep(this.rltdAgts, obj, "RltdAgts");
        obj.purp = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Purpose2Choice) biz.c24.io.api.Utils.cloneDeep(this.purp, obj, "Purp");
        obj.rltdRmtInf = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2[]) biz.c24.io.api.Utils.cloneDeep(this.rltdRmtInf, obj, "RltdRmtInf");
        obj.rmtInf = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceInformation5) biz.c24.io.api.Utils.cloneDeep(this.rmtInf, obj, "RmtInf");
        obj.rltdDts = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2) biz.c24.io.api.Utils.cloneDeep(this.rltdDts, obj, "RltdDts");
        obj.rltdPric = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionPrice2Choice) biz.c24.io.api.Utils.cloneDeep(this.rltdPric, obj, "RltdPric");
        obj.rltdQties = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice[]) biz.c24.io.api.Utils.cloneDeep(this.rltdQties, obj, "RltdQties");
        obj.finInstrmId = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice) biz.c24.io.api.Utils.cloneDeep(this.finInstrmId, obj, "FinInstrmId");
        obj.tax = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3) biz.c24.io.api.Utils.cloneDeep(this.tax, obj, "Tax");
        obj.rtrInf = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReasonInformation10) biz.c24.io.api.Utils.cloneDeep(this.rtrInf, obj, "RtrInf");
        obj.corpActn = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CorporateAction1) biz.c24.io.api.Utils.cloneDeep(this.corpActn, obj, "CorpActn");
        obj.sfkpgAcct = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashAccount16) biz.c24.io.api.Utils.cloneDeep(this.sfkpgAcct, obj, "SfkpgAcct");
        obj.addtlTxInf = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.addtlTxInf, obj, "AddtlTxInf");
    }

    /**
     * Creates, adds and returns a new AmtDtls (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountAndCurrencyExchange3 createAmtDtls() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountAndCurrencyExchange3 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountAndCurrencyExchange3) getElementDecl("AmtDtls").createObject();
        setAmtDtls(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Avlbty (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2 createAvlbty() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2) getElementDecl("Avlbty").createObject();
        addAvlbty(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new BkTxCd (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BankTransactionCodeStructure4 createBkTxCd() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BankTransactionCodeStructure4 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BankTransactionCodeStructure4) getElementDecl("BkTxCd").createObject();
        setBkTxCd(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Chrgs (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6 createChrgs() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6) getElementDecl("Chrgs").createObject();
        addChrgs(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new CorpActn (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CorporateAction1 createCorpActn() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CorporateAction1 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CorporateAction1) getElementDecl("CorpActn").createObject();
        setCorpActn(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new FinInstrmId (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice createFinInstrmId() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice) getElementDecl("FinInstrmId").createObject();
        setFinInstrmId(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Intrst (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2 createIntrst() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2) getElementDecl("Intrst").createObject();
        addIntrst(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Purp (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Purpose2Choice createPurp() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Purpose2Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Purpose2Choice) getElementDecl("Purp").createObject();
        setPurp(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Refs (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2 createRefs() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2) getElementDecl("Refs").createObject();
        setRefs(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RltdAgts (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2 createRltdAgts() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2) getElementDecl("RltdAgts").createObject();
        setRltdAgts(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RltdDts (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2 createRltdDts() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2) getElementDecl("RltdDts").createObject();
        setRltdDts(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RltdPric (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionPrice2Choice createRltdPric() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionPrice2Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionPrice2Choice) getElementDecl("RltdPric").createObject();
        setRltdPric(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RltdPties (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionParty2 createRltdPties() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionParty2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionParty2) getElementDecl("RltdPties").createObject();
        setRltdPties(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RltdQties (0..*).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice createRltdQties() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice) getElementDecl("RltdQties").createObject();
        addRltdQties(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RltdRmtInf (0..10).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2 createRltdRmtInf() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2) getElementDecl("RltdRmtInf").createObject();
        addRltdRmtInf(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RmtInf (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceInformation5 createRmtInf() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceInformation5 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceInformation5) getElementDecl("RmtInf").createObject();
        setRmtInf(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new RtrInf (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReasonInformation10 createRtrInf() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReasonInformation10 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReasonInformation10) getElementDecl("RtrInf").createObject();
        setRtrInf(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new SfkpgAcct (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashAccount16 createSfkpgAcct() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashAccount16 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashAccount16) getElementDecl("SfkpgAcct").createObject();
        setSfkpgAcct(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new Tax (0..1).
     * 
     * @return The new value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3 createTax() {
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3 obj = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3) getElementDecl("Tax").createObject();
        setTax(obj);
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
     * Gets the value of AddtlTxInf (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getAddtlTxInf() {
        return this.addtlTxInf;
    }

    /**
     * Gets the value of AmtDtls (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountAndCurrencyExchange3 getAmtDtls() {
        return this.amtDtls;
    }

    /**
     * Gets the value of Avlbty (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2[] getAvlbty() {
        if (this.avlbty == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2[]{};
        else
            return this.avlbty;
    }

    /**
     * Gets the value of Avlbty by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2 getAvlbty(int ordinal) {
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
    public int getAvlbtyIndex(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2 value) {
        if (this.avlbty == null)
            return -1;
        for (int i=0; i<this.avlbty.length; i++)
            if (this.avlbty[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of BkTxCd (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BankTransactionCodeStructure4 getBkTxCd() {
        return this.bkTxCd;
    }

    /**
     * Gets the value of Chrgs (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6[] getChrgs() {
        if (this.chrgs == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6[]{};
        else
            return this.chrgs;
    }

    /**
     * Gets the value of Chrgs by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6 getChrgs(int ordinal) {
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
    public int getChrgsIndex(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6 value) {
        if (this.chrgs == null)
            return -1;
        for (int i=0; i<this.chrgs.length; i++)
            if (this.chrgs[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of CorpActn (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CorporateAction1 getCorpActn() {
        return this.corpActn;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>refs,
     * amtDtls, avlbty, bkTxCd, chrgs, intrst, rltdPties, rltdAgts,
     * purp, rltdRmtInf, rmtInf, rltdDts, rltdPric, rltdQties,
     * finInstrmId, tax, rtrInf, corpActn, sfkpgAcct,
     * addtlTxInf</b>.
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
            case 9:
                return getRefs();
            case 1:
                return getAmtDtls();
            case 2:
            if (this.avlbty == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.avlbty[index];
            case 3:
                return getBkTxCd();
            case 4:
            if (this.chrgs == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.chrgs[index];
            case 7:
            if (this.intrst == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.intrst[index];
            case 13:
                return getRltdPties();
            case 10:
                return getRltdAgts();
            case 8:
                return getPurp();
            case 15:
            if (this.rltdRmtInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rltdRmtInf[index];
            case 16:
                return getRmtInf();
            case 11:
                return getRltdDts();
            case 12:
                return getRltdPric();
            case 14:
            if (this.rltdQties == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rltdQties[index];
            case 6:
                return getFinInstrmId();
            case 19:
                return getTax();
            case 17:
                return getRtrInf();
            case 5:
                return getCorpActn();
            case 18:
                return getSfkpgAcct();
            case 0:
                return getAddtlTxInf();
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
            case 9:
                return this.refs == null ? 0 : 1;
            case 1:
                return this.amtDtls == null ? 0 : 1;
            case 2:
                return this.avlbty == null ? 0 : this.avlbty.length;
            case 3:
                return this.bkTxCd == null ? 0 : 1;
            case 4:
                return this.chrgs == null ? 0 : this.chrgs.length;
            case 7:
                return this.intrst == null ? 0 : this.intrst.length;
            case 13:
                return this.rltdPties == null ? 0 : 1;
            case 10:
                return this.rltdAgts == null ? 0 : 1;
            case 8:
                return this.purp == null ? 0 : 1;
            case 15:
                return this.rltdRmtInf == null ? 0 : this.rltdRmtInf.length;
            case 16:
                return this.rmtInf == null ? 0 : 1;
            case 11:
                return this.rltdDts == null ? 0 : 1;
            case 12:
                return this.rltdPric == null ? 0 : 1;
            case 14:
                return this.rltdQties == null ? 0 : this.rltdQties.length;
            case 6:
                return this.finInstrmId == null ? 0 : 1;
            case 19:
                return this.tax == null ? 0 : 1;
            case 17:
                return this.rtrInf == null ? 0 : 1;
            case 5:
                return this.corpActn == null ? 0 : 1;
            case 18:
                return this.sfkpgAcct == null ? 0 : 1;
            case 0:
                return this.addtlTxInf == null ? 0 : 1;
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
            case 9:
                return this.refs != null && this.refs.equals(element) ? 0 : -1;
            case 1:
                return this.amtDtls != null && this.amtDtls.equals(element) ? 0 : -1;
            case 2:
                return getAvlbtyIndex((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2) element);
            case 3:
                return this.bkTxCd != null && this.bkTxCd.equals(element) ? 0 : -1;
            case 4:
                return getChrgsIndex((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6) element);
            case 7:
                return getIntrstIndex((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2) element);
            case 13:
                return this.rltdPties != null && this.rltdPties.equals(element) ? 0 : -1;
            case 10:
                return this.rltdAgts != null && this.rltdAgts.equals(element) ? 0 : -1;
            case 8:
                return this.purp != null && this.purp.equals(element) ? 0 : -1;
            case 15:
                return getRltdRmtInfIndex((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2) element);
            case 16:
                return this.rmtInf != null && this.rmtInf.equals(element) ? 0 : -1;
            case 11:
                return this.rltdDts != null && this.rltdDts.equals(element) ? 0 : -1;
            case 12:
                return this.rltdPric != null && this.rltdPric.equals(element) ? 0 : -1;
            case 14:
                return getRltdQtiesIndex((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice) element);
            case 6:
                return this.finInstrmId != null && this.finInstrmId.equals(element) ? 0 : -1;
            case 19:
                return this.tax != null && this.tax.equals(element) ? 0 : -1;
            case 17:
                return this.rtrInf != null && this.rtrInf.equals(element) ? 0 : -1;
            case 5:
                return this.corpActn != null && this.corpActn.equals(element) ? 0 : -1;
            case 18:
                return this.sfkpgAcct != null && this.sfkpgAcct.equals(element) ? 0 : -1;
            case 0:
                return this.addtlTxInf != null && this.addtlTxInf.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of FinInstrmId (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice getFinInstrmId() {
        return this.finInstrmId;
    }

    /**
     * Gets the value of Intrst (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2[] getIntrst() {
        if (this.intrst == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2[]{};
        else
            return this.intrst;
    }

    /**
     * Gets the value of Intrst by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2 getIntrst(int ordinal) {
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
    public int getIntrstIndex(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2 value) {
        if (this.intrst == null)
            return -1;
        for (int i=0; i<this.intrst.length; i++)
            if (this.intrst[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of Purp (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Purpose2Choice getPurp() {
        return this.purp;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>refs,
     * amtDtls, avlbty, bkTxCd, chrgs, intrst, rltdPties, rltdAgts,
     * purp, rltdRmtInf, rmtInf, rltdDts, rltdPric, rltdQties,
     * finInstrmId, tax, rtrInf, corpActn, sfkpgAcct,
     * addtlTxInf</b>.
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
            case 9:
                return this.refs;
            case 1:
                return this.amtDtls;
            case 2:
            if (this.avlbty == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.avlbty[index];
            case 3:
                return this.bkTxCd;
            case 4:
            if (this.chrgs == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.chrgs[index];
            case 7:
            if (this.intrst == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.intrst[index];
            case 13:
                return this.rltdPties;
            case 10:
                return this.rltdAgts;
            case 8:
                return this.purp;
            case 15:
            if (this.rltdRmtInf == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rltdRmtInf[index];
            case 16:
                return this.rmtInf;
            case 11:
                return this.rltdDts;
            case 12:
                return this.rltdPric;
            case 14:
            if (this.rltdQties == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.rltdQties[index];
            case 6:
                return this.finInstrmId;
            case 19:
                return this.tax;
            case 17:
                return this.rtrInf;
            case 5:
                return this.corpActn;
            case 18:
                return this.sfkpgAcct;
            case 0:
                return this.addtlTxInf;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of Refs (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2 getRefs() {
        return this.refs;
    }

    /**
     * Gets the value of RltdAgts (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2 getRltdAgts() {
        return this.rltdAgts;
    }

    /**
     * Gets the value of RltdDts (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2 getRltdDts() {
        return this.rltdDts;
    }

    /**
     * Gets the value of RltdPric (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionPrice2Choice getRltdPric() {
        return this.rltdPric;
    }

    /**
     * Gets the value of RltdPties (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionParty2 getRltdPties() {
        return this.rltdPties;
    }

    /**
     * Gets the value of RltdQties (0..*).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice[] getRltdQties() {
        if (this.rltdQties == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice[]{};
        else
            return this.rltdQties;
    }

    /**
     * Gets the value of RltdQties by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice getRltdQties(int ordinal) {
        if (this.rltdQties == null)
            throw new ArrayIndexOutOfBoundsException();
        if(ordinal >= 0 && ordinal < this.rltdQties.length) {
            return this.rltdQties[ordinal];
        }
            throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The RltdQties to get the index of.
     * @return The index.
     */
    public int getRltdQtiesIndex(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice value) {
        if (this.rltdQties == null)
            return -1;
        for (int i=0; i<this.rltdQties.length; i++)
            if (this.rltdQties[i] == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of RltdRmtInf (0..10).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2[] getRltdRmtInf() {
        if (this.rltdRmtInf == null)
            return new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2[]{};
        else
            return this.rltdRmtInf;
    }

    /**
     * Gets the value of RltdRmtInf by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2 getRltdRmtInf(int ordinal) {
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
    public int getRltdRmtInfIndex(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2 value) {
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
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceInformation5 getRmtInf() {
        return this.rmtInf;
    }

    /**
     * Gets the value of RtrInf (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReasonInformation10 getRtrInf() {
        return this.rtrInf;
    }

    /**
     * Gets the value of SfkpgAcct (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashAccount16 getSfkpgAcct() {
        return this.sfkpgAcct;
    }

    /**
     * Gets the value of Tax (0..1).
     * 
     * @return The value.
     */
    public iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3 getTax() {
        return this.tax;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.refs == null ? 0 : 1;
        count += this.amtDtls == null ? 0 : 1;
        count += this.avlbty == null ? 0 : this.avlbty.length;
        count += this.bkTxCd == null ? 0 : 1;
        count += this.chrgs == null ? 0 : this.chrgs.length;
        count += this.intrst == null ? 0 : this.intrst.length;
        count += this.rltdPties == null ? 0 : 1;
        count += this.rltdAgts == null ? 0 : 1;
        count += this.purp == null ? 0 : 1;
        count += this.rltdRmtInf == null ? 0 : this.rltdRmtInf.length;
        count += this.rmtInf == null ? 0 : 1;
        count += this.rltdDts == null ? 0 : 1;
        count += this.rltdPric == null ? 0 : 1;
        count += this.rltdQties == null ? 0 : this.rltdQties.length;
        count += this.finInstrmId == null ? 0 : 1;
        count += this.tax == null ? 0 : 1;
        count += this.rtrInf == null ? 0 : 1;
        count += this.corpActn == null ? 0 : 1;
        count += this.sfkpgAcct == null ? 0 : 1;
        count += this.addtlTxInf == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(refs);
        result = 31 * result + hashCodeOf(amtDtls);
        result = 31 * result + hashCodeOf(avlbty);
        result = 31 * result + hashCodeOf(bkTxCd);
        result = 31 * result + hashCodeOf(chrgs);
        result = 31 * result + hashCodeOf(intrst);
        result = 31 * result + hashCodeOf(rltdPties);
        result = 31 * result + hashCodeOf(rltdAgts);
        result = 31 * result + hashCodeOf(purp);
        result = 31 * result + hashCodeOf(rltdRmtInf);
        result = 31 * result + hashCodeOf(rmtInf);
        result = 31 * result + hashCodeOf(rltdDts);
        result = 31 * result + hashCodeOf(rltdPric);
        result = 31 * result + hashCodeOf(rltdQties);
        result = 31 * result + hashCodeOf(finInstrmId);
        result = 31 * result + hashCodeOf(tax);
        result = 31 * result + hashCodeOf(rtrInf);
        result = 31 * result + hashCodeOf(corpActn);
        result = 31 * result + hashCodeOf(sfkpgAcct);
        result = 31 * result + hashCodeOf(addtlTxInf);
        return result;
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
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2[] temp = this.avlbty;
        this.avlbty = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2[temp.length-1];
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
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6[] temp = this.chrgs;
        this.chrgs = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6[temp.length-1];
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
            case 9:
                setRefs(null);
                return;
            case 1:
                setAmtDtls(null);
                return;
            case 2:
                removeAvlbty(index);
                return;
            case 3:
                setBkTxCd(null);
                return;
            case 4:
                removeChrgs(index);
                return;
            case 7:
                removeIntrst(index);
                return;
            case 13:
                setRltdPties(null);
                return;
            case 10:
                setRltdAgts(null);
                return;
            case 8:
                setPurp(null);
                return;
            case 15:
                removeRltdRmtInf(index);
                return;
            case 16:
                setRmtInf(null);
                return;
            case 11:
                setRltdDts(null);
                return;
            case 12:
                setRltdPric(null);
                return;
            case 14:
                removeRltdQties(index);
                return;
            case 6:
                setFinInstrmId(null);
                return;
            case 19:
                setTax(null);
                return;
            case 17:
                setRtrInf(null);
                return;
            case 5:
                setCorpActn(null);
                return;
            case 18:
                setSfkpgAcct(null);
                return;
            case 0:
                setAddtlTxInf(null);
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
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2[] temp = this.intrst;
        this.intrst = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.intrst, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.intrst, index, temp.length-index-1);
        if (this.intrst.length == 0)
            this.intrst = null;
    }

    /**
     * Removes a RltdQties (0..*).
     * 
     * @param index
     * @param index The index of the RltdQties to get.
     */
    public void removeRltdQties(int index) {
        if (this.rltdQties == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice[] temp = this.rltdQties;
        this.rltdQties = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.rltdQties, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.rltdQties, index, temp.length-index-1);
        if (this.rltdQties.length == 0)
            this.rltdQties = null;
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
        iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2[] temp = this.rltdRmtInf;
        this.rltdRmtInf = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.rltdRmtInf, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.rltdRmtInf, index, temp.length-index-1);
        if (this.rltdRmtInf.length == 0)
            this.rltdRmtInf = null;
    }

    /**
     * [Virtual Element] Sets the value of AddtlTxInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAddtlTxInf(java.lang.String value) {
        this.addtlTxInf = value;
    }

    /**
     * [Virtual Element] Sets the value of AmtDtls (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAmtDtls(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountAndCurrencyExchange3 value) {
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
    public void setAvlbty(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2[] value) {
        this.avlbty = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.avlbty != null && i<this.avlbty.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.avlbty[i]).setParent(this, "Avlbty");
    }

    /**
     * [Virtual Element] Sets the value of BkTxCd (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setBkTxCd(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BankTransactionCodeStructure4 value) {
        this.bkTxCd = value;
        if (this.bkTxCd != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.bkTxCd).setParent(this, "BkTxCd");
    }

    /**
     * [Virtual Element] Sets the value of Chrgs (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setChrgs(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6[] value) {
        this.chrgs = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.chrgs != null && i<this.chrgs.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.chrgs[i]).setParent(this, "Chrgs");
    }

    /**
     * [Virtual Element] Sets the value of CorpActn (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCorpActn(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CorporateAction1 value) {
        this.corpActn = value;
        if (this.corpActn != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.corpActn).setParent(this, "CorpActn");
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
            case 9:
                setRefs((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2) value);
                return;
            case 1:
                setAmtDtls((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountAndCurrencyExchange3) value);
                return;
            case 2:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2[]) {
                    setAvlbty((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2[])value);
                } else if (this.avlbty == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.avlbty[index] = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.avlbty[index]).setParent(this, "Avlbty");
                }
                return;
            case 3:
                setBkTxCd((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BankTransactionCodeStructure4) value);
                return;
            case 4:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6[]) {
                    setChrgs((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6[])value);
                } else if (this.chrgs == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.chrgs[index] = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.chrgs[index]).setParent(this, "Chrgs");
                }
                return;
            case 7:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2[]) {
                    setIntrst((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2[])value);
                } else if (this.intrst == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.intrst[index] = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.intrst[index]).setParent(this, "Intrst");
                }
                return;
            case 13:
                setRltdPties((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionParty2) value);
                return;
            case 10:
                setRltdAgts((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2) value);
                return;
            case 8:
                setPurp((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Purpose2Choice) value);
                return;
            case 15:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2[]) {
                    setRltdRmtInf((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2[])value);
                } else if (this.rltdRmtInf == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.rltdRmtInf[index] = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.rltdRmtInf[index]).setParent(this, "RltdRmtInf");
                }
                return;
            case 16:
                setRmtInf((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceInformation5) value);
                return;
            case 11:
                setRltdDts((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2) value);
                return;
            case 12:
                setRltdPric((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionPrice2Choice) value);
                return;
            case 14:
                if (value != null && value instanceof iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice[]) {
                    setRltdQties((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice[])value);
                } else if (this.rltdQties == null) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.rltdQties[index] = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.rltdQties[index]).setParent(this, "RltdQties");
                }
                return;
            case 6:
                setFinInstrmId((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice) value);
                return;
            case 19:
                setTax((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3) value);
                return;
            case 17:
                setRtrInf((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReasonInformation10) value);
                return;
            case 5:
                setCorpActn((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CorporateAction1) value);
                return;
            case 18:
                setSfkpgAcct((iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashAccount16) value);
                return;
            case 0:
                setAddtlTxInf((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of FinInstrmId (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setFinInstrmId(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice value) {
        this.finInstrmId = value;
        if (this.finInstrmId != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.finInstrmId).setParent(this, "FinInstrmId");
    }

    /**
     * [Virtual Element] Sets the value of Intrst (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setIntrst(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2[] value) {
        this.intrst = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.intrst != null && i<this.intrst.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.intrst[i]).setParent(this, "Intrst");
    }

    /**
     * [Virtual Element] Sets the value of Purp (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPurp(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Purpose2Choice value) {
        this.purp = value;
        if (this.purp != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.purp).setParent(this, "Purp");
    }

    /**
     * [Virtual Element] Sets the value of Refs (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRefs(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2 value) {
        this.refs = value;
        if (this.refs != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.refs).setParent(this, "Refs");
    }

    /**
     * [Virtual Element] Sets the value of RltdAgts (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRltdAgts(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2 value) {
        this.rltdAgts = value;
        if (this.rltdAgts != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rltdAgts).setParent(this, "RltdAgts");
    }

    /**
     * [Virtual Element] Sets the value of RltdDts (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRltdDts(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2 value) {
        this.rltdDts = value;
        if (this.rltdDts != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rltdDts).setParent(this, "RltdDts");
    }

    /**
     * [Virtual Element] Sets the value of RltdPric (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRltdPric(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionPrice2Choice value) {
        this.rltdPric = value;
        if (this.rltdPric != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rltdPric).setParent(this, "RltdPric");
    }

    /**
     * [Virtual Element] Sets the value of RltdPties (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRltdPties(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionParty2 value) {
        this.rltdPties = value;
        if (this.rltdPties != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rltdPties).setParent(this, "RltdPties");
    }

    /**
     * [Virtual Element] Sets the value of RltdQties (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRltdQties(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice[] value) {
        this.rltdQties = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.rltdQties != null && i<this.rltdQties.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.rltdQties[i]).setParent(this, "RltdQties");
    }

    /**
     * [Virtual Element] Sets the value of RltdRmtInf (0..10).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRltdRmtInf(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2[] value) {
        this.rltdRmtInf = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.rltdRmtInf != null && i<this.rltdRmtInf.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.rltdRmtInf[i]).setParent(this, "RltdRmtInf");
    }

    /**
     * [Virtual Element] Sets the value of RmtInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRmtInf(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceInformation5 value) {
        this.rmtInf = value;
        if (this.rmtInf != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rmtInf).setParent(this, "RmtInf");
    }

    /**
     * [Virtual Element] Sets the value of RtrInf (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setRtrInf(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReasonInformation10 value) {
        this.rtrInf = value;
        if (this.rtrInf != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.rtrInf).setParent(this, "RtrInf");
    }

    /**
     * [Virtual Element] Sets the value of SfkpgAcct (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setSfkpgAcct(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashAccount16 value) {
        this.sfkpgAcct = value;
        if (this.sfkpgAcct != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.sfkpgAcct).setParent(this, "SfkpgAcct");
    }

    /**
     * [Virtual Element] Sets the value of Tax (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setTax(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3 value) {
        this.tax = value;
        if (this.tax != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.tax).setParent(this, "Tax");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.refs);
        out.writeObject(this.amtDtls);
        out.writeObject(this.avlbty);
        out.writeObject(this.bkTxCd);
        out.writeObject(this.chrgs);
        out.writeObject(this.intrst);
        out.writeObject(this.rltdPties);
        out.writeObject(this.rltdAgts);
        out.writeObject(this.purp);
        out.writeObject(this.rltdRmtInf);
        out.writeObject(this.rmtInf);
        out.writeObject(this.rltdDts);
        out.writeObject(this.rltdPric);
        out.writeObject(this.rltdQties);
        out.writeObject(this.finInstrmId);
        out.writeObject(this.tax);
        out.writeObject(this.rtrInf);
        out.writeObject(this.corpActn);
        out.writeObject(this.sfkpgAcct);
        out.writeObject(this.addtlTxInf);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.refs = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionReferences2) in.readObject();
        this.amtDtls = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountAndCurrencyExchange3) in.readObject();
        this.avlbty = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashBalanceAvailability2[]) in.readObject();
        this.bkTxCd = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.BankTransactionCodeStructure4) in.readObject();
        this.chrgs = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ChargesInformation6[]) in.readObject();
        this.intrst = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionInterest2[]) in.readObject();
        this.rltdPties = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionParty2) in.readObject();
        this.rltdAgts = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionAgents2) in.readObject();
        this.purp = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Purpose2Choice) in.readObject();
        this.rltdRmtInf = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceLocation2[]) in.readObject();
        this.rmtInf = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.RemittanceInformation5) in.readObject();
        this.rltdDts = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionDates2) in.readObject();
        this.rltdPric = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionPrice2Choice) in.readObject();
        this.rltdQties = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TransactionQuantities1Choice[]) in.readObject();
        this.finInstrmId = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.SecurityIdentification4Choice) in.readObject();
        this.tax = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.TaxInformation3) in.readObject();
        this.rtrInf = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ReturnReasonInformation10) in.readObject();
        this.corpActn = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CorporateAction1) in.readObject();
        this.sfkpgAcct = (iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.CashAccount16) in.readObject();
        this.addtlTxInf = (java.lang.String) in.readObject();
    }

}
