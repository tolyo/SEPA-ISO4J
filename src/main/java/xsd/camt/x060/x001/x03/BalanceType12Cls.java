/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

/**
 * Class BalanceType12Cls.The BalanceType12 complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12
 */
public class BalanceType12Cls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile BalanceType12Cls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected BalanceType12Cls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12Cls();
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
        setName("BalanceType12");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("CdOrPrtry", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType5ChoiceCls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("SubTp", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceSubType1ChoiceCls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
