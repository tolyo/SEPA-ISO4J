/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

/**
 * Class YesNoIndicatorCls.The YesNoIndicator atomic simple data
 * type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class YesNoIndicatorCls extends biz.c24.io.api.data.BooleanDataType {

    /**
     * Field instance.
     */
    protected static volatile YesNoIndicatorCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected YesNoIndicatorCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.YesNoIndicatorCls();
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
        setName("YesNoIndicator");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance());
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
