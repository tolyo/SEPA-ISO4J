/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03;

/**
 * Class PostalAddress6Cls.The PostalAddress6 complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PostalAddress
 */
public class PostalAddress6Cls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile PostalAddress6Cls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected PostalAddress6Cls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PostalAddress6Cls();
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
        setName("PostalAddress6");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.PostalAddress6.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("AdrTp", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.AddressType2CodeCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("Dept", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Max70TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("SubDept", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Max70TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("StrtNm", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Max70TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("BldgNb", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Max16TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("PstCd", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Max16TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("TwnNm", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Max35TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("CtrySubDvsn", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Max35TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("Ctry", 0, 1, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.CountryCodeCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("AdrLine", 0, 7, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Max70TextCls.class, iso.std.iso.x20022.tech.xsd.pain.x002.x001.x03.Pain00200103DataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
