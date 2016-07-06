/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

/**
 * Class Max35TextCls.The Max35Text atomic simple data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class Max35TextCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile Max35TextCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected Max35TextCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Max35TextCls();
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
        setName("Max35Text");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance());
        setMinLength(1);
        setMaxLength(35);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
