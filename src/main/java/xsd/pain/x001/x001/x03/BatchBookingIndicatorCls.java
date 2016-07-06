/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

/**
 * Class BatchBookingIndicatorCls.The BatchBookingIndicator atomic
 * simple data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class BatchBookingIndicatorCls extends biz.c24.io.api.data.BooleanDataType {

    /**
     * Field instance.
     */
    protected static volatile BatchBookingIndicatorCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected BatchBookingIndicatorCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.BatchBookingIndicatorCls();
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
        setName("BatchBookingIndicator");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance());
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
