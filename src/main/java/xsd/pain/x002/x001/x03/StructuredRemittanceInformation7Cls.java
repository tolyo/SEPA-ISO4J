/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

/**
 * Class StructuredRemittanceInformation7Cls.The
 * StructuredRemittanceInformation7 complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StructuredRemittanceInformation7
 */
public class StructuredRemittanceInformation7Cls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile StructuredRemittanceInformation7Cls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected StructuredRemittanceInformation7Cls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StructuredRemittanceInformation7Cls();
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
        setName("StructuredRemittanceInformation7");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StructuredRemittanceInformation7.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("RfrdDocInf", 0, biz.c24.io.api.data.DataComponent.CARDINALITY_UNBOUNDED, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.ReferredDocumentInformation3Cls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("RfrdDocAmt", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.RemittanceAmount1Cls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("CdtrRefInf", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CreditorReferenceInformation2Cls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("Invcr", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32Cls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("Invcee", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32Cls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("AddtlRmtInf", 0, 3, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Max140TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
