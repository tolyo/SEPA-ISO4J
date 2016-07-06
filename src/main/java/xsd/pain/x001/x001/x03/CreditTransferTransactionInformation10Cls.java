/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

/**
 * Class CreditTransferTransactionInformation10Cls.The
 * CreditTransferTransactionInformation10 complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10
 */
public class CreditTransferTransactionInformation10Cls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile CreditTransferTransactionInformation10Cls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected CreditTransferTransactionInformation10Cls() {
    }

    /**
     * Gets the singleton instance of this type.
     * 
     * @return The type, or its supertype if present.
     */
    public static biz.c24.io.api.data.DataType getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10Cls();
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    /**
     * Called internally to initialize this type.
     */
    protected void init() {
        setName("CreditTransferTransactionInformation10");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CreditTransferTransactionInformation10.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("PmtId", 1, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentIdentification1Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("PmtTpInf", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PaymentTypeInformation19Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("Amt", 1, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.AmountType3ChoiceCls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("XchgRateInf", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ExchangeRateInformation1Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("ChrgBr", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ChargeBearerType1CodeCls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("ChqInstr", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Cheque6Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("UltmtDbtr", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("IntrmyAgt1", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("IntrmyAgt1Acct", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("IntrmyAgt2", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("IntrmyAgt2Acct", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("IntrmyAgt3", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("IntrmyAgt3Acct", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("CdtrAgt", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BranchAndFinancialInstitutionIdentification4Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("CdtrAgtAcct", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("Cdtr", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("CdtrAcct", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.CashAccount16Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("UltmtCdtr", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.PartyIdentification32Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("InstrForCdtrAgt", 0, biz.c24.io.api.data.DataComponent.CARDINALITY_UNBOUNDED, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.InstructionForCreditorAgent1Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("InstrForDbtrAgt", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Max140TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("Purp", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Purpose2ChoiceCls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("RgltryRptg", 0, 10, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RegulatoryReporting3Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("Tax", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.TaxInformation3Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("RltdRmtInf", 0, 10, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceLocation2Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("RmtInf", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.RemittanceInformation5Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
