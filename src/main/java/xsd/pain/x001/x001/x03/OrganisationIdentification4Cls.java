/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

/**
 * Class OrganisationIdentification4Cls.The
 * OrganisationIdentification4 complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.OrganisationIdentification4
 */
public class OrganisationIdentification4Cls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile OrganisationIdentification4Cls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected OrganisationIdentification4Cls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.OrganisationIdentification4Cls();
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
        setName("OrganisationIdentification4");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.OrganisationIdentification4.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("BICOrBEI", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.AnyBICIdentifierCls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("Othr", 0, biz.c24.io.api.data.DataComponent.CARDINALITY_UNBOUNDED, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.GenericOrganisationIdentification1Cls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
