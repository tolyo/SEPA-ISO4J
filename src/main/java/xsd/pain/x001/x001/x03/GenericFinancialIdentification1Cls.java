/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

/**
 * Class GenericFinancialIdentification1Cls.The
 * GenericFinancialIdentification1 complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1
 */
public class GenericFinancialIdentification1Cls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile GenericFinancialIdentification1Cls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected GenericFinancialIdentification1Cls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1Cls();
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
        setName("GenericFinancialIdentification1");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericFinancialIdentification1.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("Id", 1, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Max35TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("SchmeNm", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.FinancialIdentificationSchemeName1ChoiceCls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("Issr", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Max35TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
