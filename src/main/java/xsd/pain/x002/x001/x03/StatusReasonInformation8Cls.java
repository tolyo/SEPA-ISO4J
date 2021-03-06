/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

/**
 * Class StatusReasonInformation8Cls.The StatusReasonInformation8
 * complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8
 */
public class StatusReasonInformation8Cls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile StatusReasonInformation8Cls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected StatusReasonInformation8Cls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8Cls();
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
        setName("StatusReasonInformation8");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReasonInformation8.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("Orgtr", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PartyIdentification32Cls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("Rsn", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.StatusReason6ChoiceCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("AddtlInf", 0, biz.c24.io.api.data.DataComponent.CARDINALITY_UNBOUNDED, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Max105TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
