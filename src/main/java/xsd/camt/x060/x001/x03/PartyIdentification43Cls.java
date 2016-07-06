/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

/**
 * Class PartyIdentification43Cls.The PartyIdentification43 complex
 * data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43
 */
public class PartyIdentification43Cls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile PartyIdentification43Cls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected PartyIdentification43Cls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43Cls();
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
        setName("PartyIdentification43");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PartyIdentification43.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("Nm", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Max140TextCls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("PstlAdr", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.PostalAddress6Cls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("Id", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Party11ChoiceCls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("CtryOfRes", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.CountryCodeCls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("CtctDtls", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.ContactDetails2Cls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
