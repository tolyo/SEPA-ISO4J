/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

/**
 * Class ReportingRequest3Cls.The ReportingRequest3 complex data
 * type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3
 */
public class ReportingRequest3Cls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile ReportingRequest3Cls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected ReportingRequest3Cls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3Cls();
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
        setName("ReportingRequest3");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingRequest3.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("Id", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Max35TextCls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("ReqdMsgNmId", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Max35TextCls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("Acct", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.CashAccount24Cls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("AcctOwnr", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party12ChoiceCls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("AcctSvcr", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BranchAndFinancialInstitutionIdentification5Cls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("RptgPrd", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ReportingPeriod1Cls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("ReqdTxTp", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.TransactionType1Cls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("ReqdBalTp", 0, biz.c24.io.api.data.DataComponent.CARDINALITY_UNBOUNDED, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12Cls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
