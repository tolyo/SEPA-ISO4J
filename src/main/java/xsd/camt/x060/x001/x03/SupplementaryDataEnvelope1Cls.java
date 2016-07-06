/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

/**
 * Class SupplementaryDataEnvelope1Cls.The
 * SupplementaryDataEnvelope1 complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1
 */
public class SupplementaryDataEnvelope1Cls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile SupplementaryDataEnvelope1Cls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected SupplementaryDataEnvelope1Cls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1Cls();
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
        setName("SupplementaryDataEnvelope1");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.SupplementaryDataEnvelope1.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.AnyElement(1, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        ((biz.c24.io.api.data.AnyElement) element).setProcessContents(biz.c24.io.api.data.ProcessContentsEnum.LAX);
        ((biz.c24.io.api.data.AnyElement) element).addNamespace("##any");
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
